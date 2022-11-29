package com.summer.pay.dto.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 退款查询DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundQueryParamsDTO extends PaymentBaseParams {

    private String gatewaySerialNo;

    private String refundOutOrderNo;

}
