package com.imoooc.config;

import com.lly835.bestpay.config.WxPayH5Config;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WechatPayConfig {

    @Autowired
    private WechatAccountConfig accountConfig;

    @Bean
    public BestPayServiceImpl bestPayService(){


        BestPayServiceImpl bestPayService=new BestPayServiceImpl();
        bestPayService.setWxPayH5Config(wxPayH5Config());
        return  bestPayService;
    }

    @Bean
    public WxPayH5Config wxPayH5Config(){
        WxPayH5Config wxPayH5Config=new WxPayH5Config();
        wxPayH5Config.setAppId(accountConfig.getMpAppIdPro());
        wxPayH5Config.setAppSecret(accountConfig.getMpAppSecret());
        wxPayH5Config.setMchId(accountConfig.getMchId());
        wxPayH5Config.setMchKey(accountConfig.getMchKey());
        wxPayH5Config.setKeyPath(accountConfig.getKeyPath());
        wxPayH5Config.setNotifyUrl(accountConfig.getNotifyUrl());
        log.info("支付appId"+accountConfig.getMpAppIdPro());
        return wxPayH5Config;
    }
}
