package com.summer.pay.dto.res;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 退款回调回复 DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundCallbackResDTO extends BaseRes {

    private Long tradeId;
    private Long refundTradeId;
    private String merchantSerialNo;
    private String gatewaySerialNo;
    private String merchantRefundSerialNo;
    private String gatewayRefundSerialNo;
    private Long refundAmount;
    private Date refundTime;
    private String resBody;

}
