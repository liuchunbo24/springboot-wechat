package com.imoooc.dataobject;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

/**
 * 类目
 * 2019--6-12 21:20
 */
@Entity
@DynamicUpdate//动态更新（时间）
@Data
public class ProductCategory {

    /** 类目id. */
    @Id  //主键
    @GeneratedValue //自增
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
