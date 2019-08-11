package com.imoooc.service;

import com.imoooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * 2019--6-13 20:50
 */
public interface CategoryService {
     ProductCategory findOne(Integer categoryId);

     List<ProductCategory> findAll();

     List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

     ProductCategory save(ProductCategory productCategory);
}
