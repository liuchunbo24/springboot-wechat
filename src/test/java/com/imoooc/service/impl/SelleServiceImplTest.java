package com.imoooc.service.impl;

import com.imoooc.dataobject.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SelleServiceImplTest {

    private static final String openid="abc";

    @Autowired
    private SelleServiceImpl selleService;

    @Test
    public void findSellerInfoByOpenid() throws Exception{
        SellerInfo result = selleService.findSellerInfoByOpenid(openid);
        Assert.assertEquals(openid,result.getOpenid());
    }
}