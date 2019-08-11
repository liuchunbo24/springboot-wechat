package com.imoooc.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imoooc.dataobject.OrderDetail;
import com.imoooc.dto.OrderDTO;
import com.imoooc.enums.ResultEnum;
import com.imoooc.exception.SellException;
import com.imoooc.form.OrderForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019-06-20 20:05
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){
        /**gson转换List
         *        <dependency>
         *             <groupId>com.goole.code.gson</groupId>
         *             <artifactId>gson</artifactId>
         *         </dependency>
         */
        Gson gson=new Gson();

        OrderDTO orderDTO=new OrderDTO();
        //OrderDTO 与OrderForm 字段名字不一样  不能用此方法
        //BeanUtils.copyProperties(orderForm,orderDTO);
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList=new ArrayList<>();
        try {
            orderDetailList=gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch (Exception e){
            log.error("【对象转换】错误，string={}",orderForm.getItems());
            throw  new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
