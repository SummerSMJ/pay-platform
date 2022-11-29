package com.summer.pay.dto.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 获取支付参数DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetPaymentParamsDTO extends PaymentBaseParams {

    private String clientIp;

    private Long paymentOrderId;

    /**
     * 分账使用 子商户ID
     */
    private String subMchId;

    private Boolean profitSharing;

    /**
     * 小程序支付使用
     */
    private String openid;


}
