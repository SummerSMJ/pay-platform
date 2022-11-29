package com.summer.pay.dto.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单查询DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderQueryParamsDTO extends PaymentBaseParams {
    private String gatewaySerialNo;
    private Long paymentOrderId;

}
