package com.summer.pay.dto.res;

import com.summer.pay.enums.PayChannelEnum;
import com.summer.pay.enums.PaymentOrderStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 订单查询返回DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderQueryResDTO extends BaseRes {

    private PayChannelEnum payChannelEnum;

    private PaymentOrderStatusEnum paymentOrderStatusEnum;

    private String merchantSerialNo;
    private String gatewaySerialNo;
    private Long paidAmount;
    private Date paidTime;

}
