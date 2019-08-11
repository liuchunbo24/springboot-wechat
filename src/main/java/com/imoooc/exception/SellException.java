package com.imoooc.exception;

import com.imoooc.enums.ResultEnum;
import lombok.Getter;

/**
 * 2019-06-18
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
