package com.summer.pay.dto.res;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 退款res DTO
 *
 * @author summer
 */
@Data

@EqualsAndHashCode(callSuper = true)
public class RefundResDTO extends BaseRes {

    private String gatewaySerialNo;
    private String merchantSerialNo;

    private String gatewayRefundSerialNo;
    private String merchantRefundSerialNo;

    private Long refundFee;
    private Long totalFee;

}
