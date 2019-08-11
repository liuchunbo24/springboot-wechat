package com.imoooc.service.impl;

import com.imoooc.dataobject.SellerInfo;
import com.imoooc.repository.SellerInfoRepository;
import com.imoooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LCB
 * 2019/7/15 20:32
 */
@Service
public class SelleServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid){
        return repository.findByOpenid(openid);
    }
}
