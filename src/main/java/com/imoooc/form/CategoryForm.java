package com.imoooc.form;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by LCB
 * 2019/7/10 21:25
 */

@Data
public class CategoryForm {

    private  Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;
}
