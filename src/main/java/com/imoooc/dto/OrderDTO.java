package com.imoooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imoooc.dataobject.OrderDetail;
import com.imoooc.enums.OrderStatusEnum;
import com.imoooc.enums.PayStatusEnum;
import com.imoooc.utils.EnumUtil;
import com.imoooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//单独设置api不返回为null的属性
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /*订单id*/
    private String orderId;

    /*买家名字*/
    private String buyerName;

    /*买家手机号*/
    private String buyerPhone;

    /*买家地址*/
    private String buyerAddress;

    /*买家微信openid*/
    private  String buyerOpenid;

    /*订单金额*/
    private BigDecimal orderAmount;

    /*订单状态,默认为0新下单*/
    private Integer orderStatus;

    /*支付状态，默认为0未支付*/
    private Integer payStatus;

    /*创建时间*/
    @JsonSerialize(using=Date2LongSerializer.class)
    private Date createTime;

    /*更新时间*/
    @JsonSerialize(using=Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }
}
