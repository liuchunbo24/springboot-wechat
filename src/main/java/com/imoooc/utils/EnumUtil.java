package com.imoooc.utils;

import com.imoooc.enums.CodeEnum;

/**
 * Created by LCB
 * 2019/7/7 15:07
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code,Class<T> enumClass){
       for(T each:enumClass.getEnumConstants()){
           if(code.equals(each.getCode())){
             return  each;
           }
       }
        return null;
    }
}
