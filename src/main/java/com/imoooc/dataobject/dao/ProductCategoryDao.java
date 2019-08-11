package com.imoooc.dataobject.dao;

import com.imoooc.dataobject.mapper.ProductCategoryMapper;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LCB
 * 2019/7/22 21:04
 */
public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    public int insertByMap(Map<String,Object> map) {
       return mapper.insertByMap(map);
    }
}
