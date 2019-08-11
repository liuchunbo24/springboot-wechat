package com.imoooc.service;

import com.imoooc.dataobject.SellerInfo;

/**
 * Created by LCB
 * 2019/7/15 20:31
 */

public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
