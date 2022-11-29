package com.summer.pay.dto.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 退款DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundParamsDTO extends PaymentBaseParams {
    /**
     * 正向三方订单号
     */
    private String gatewaySerialNo;
    private String merchantRefundSerialNo;
    private Long totalFee;
    private Long refundFee;
    private String refundDesc;
    private String notifyUrl;
    private String certPassword;
    private String certPath;


}
