package com.imoooc.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * http返回的最外层对象
 * 2019-06-15
 */
@Data
//单独设置 为null时不显示
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable {


    private static final long serialVersionUID = 7741177404540946488L;
    /* 错误码*/

    private Integer code;

    /*提示信息*/
    private String msg;

    /*具体内容*/
    private T data;
}
