package com.imoooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品（包含类目）
 * 2019-06-15
 */
@Data
public class ProductVO implements Serializable {


    private static final long serialVersionUID = -724570590258993959L;

    /**/
    @JsonProperty("name")//返回前端为name
    private String categoryName;

    /**/
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOlist;

}
