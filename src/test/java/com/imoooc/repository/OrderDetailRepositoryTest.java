package com.imoooc.repository;

import com.imoooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setDetailId("12345567810");
        orderDetail.setOrderId("11111112");
        orderDetail.setProductIcon("http://xxxxx.jpg");
        orderDetail.setProductId("11111112");
        orderDetail.setProductName("皮蛋瘦肉粥");
        orderDetail.setProductPrice(new BigDecimal(15));
        orderDetail.setProductQuantity(3);

        OrderDetail orderDetail1=repository.save(orderDetail);
        Assert.assertNotNull(orderDetail);
    }
    @Test
    public void findByOrderId() {

        List<OrderDetail> orderDetailList=repository.findByOrderId("11111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}