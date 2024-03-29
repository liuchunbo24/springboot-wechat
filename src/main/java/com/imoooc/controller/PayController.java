package com.imoooc.controller;

import com.imoooc.dto.OrderDTO;
import com.imoooc.enums.ResultEnum;
import com.imoooc.exception.SellException;
import com.imoooc.service.OrderService;
import com.imoooc.service.PayService;
import com.lly835.bestpay.model.PayResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.net.URLDecoder;
import java.util.Map;

@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView  create(@RequestParam("orderId") String orderId,
                                @RequestParam("returnUrl") String returnUrl,
                                Map<String,Object> map){
        //1.查询订单
        OrderDTO orderDTO=orderService.findOne(orderId);
        if(orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        //发起支付
        PayResponse payResponse=payService.create(orderDTO);

        map.put("payResponse",payResponse);
        map.put("returnUrl",URLDecoder.decode(returnUrl));
        log.info("跳转订单详情地址："+returnUrl);

        return new ModelAndView("pay/create",map);

    }

    /**
     * 微信异步通知
     * @param notifyData
     */
    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData){

        payService.notify(notifyData);

        //返回给微信处理结果
        return new ModelAndView("pay/success");
    }
}
