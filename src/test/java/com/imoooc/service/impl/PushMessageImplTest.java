package com.imoooc.service.impl;


import com.imoooc.dto.OrderDTO;
import com.imoooc.service.OrderService;
import com.imoooc.service.PushMessageService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PushMessageImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() throws  Exception{

        OrderDTO orderDTO = orderService.findOne("1562397614758390274");
        pushMessageService.orderStatus(orderDTO);
    }
}