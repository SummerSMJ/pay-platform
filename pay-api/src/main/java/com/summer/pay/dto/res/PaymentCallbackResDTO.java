package com.summer.pay.dto.res;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 支付回调回复 DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentCallbackResDTO extends BaseRes {

    private Long tradeId;
    private String merchantSerialNo;
    private String gatewaySerialNo;
    private Long paidAmount;
    private Date paidTime;
    private String resBody;

}
