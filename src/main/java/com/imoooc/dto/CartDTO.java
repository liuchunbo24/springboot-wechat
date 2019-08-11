package com.imoooc.dto;

import lombok.Data;

/**
 * 购物车
 * 2019-06-18 20:12
 */
@Data
public class CartDTO {

    /** 商品Id */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
