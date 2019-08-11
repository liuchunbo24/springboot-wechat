package com.imoooc.service.impl;

import com.imoooc.dto.OrderDTO;
import com.imoooc.service.OrderService;
import com.imoooc.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;
    @Test
    public void create() {
        OrderDTO orderDTO=orderService.findOne("1562253841064414378");
        payService.create(orderDTO);
    }

    @Test
    public void refund(){
        OrderDTO orderDTO=orderService.findOne("1563368569449595276");
        payService.refund(orderDTO);
    }
}