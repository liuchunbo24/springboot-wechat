package com.imoooc;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        String name ="imooc";
        String password="1213";
        log.debug("debug...");
        log.info("info..."+name);
        log.info("name:{},password:{}",name,password);
        log.error("error...");
        log.warn("warn...");
    }
}
