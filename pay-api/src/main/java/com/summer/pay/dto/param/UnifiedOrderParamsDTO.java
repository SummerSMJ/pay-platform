package com.summer.pay.dto.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 统一下单DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UnifiedOrderParamsDTO extends PaymentBaseParams {


    private String subMchId;
    private Boolean profitSharing;

    private String body;
    private String merchantSerialNo;
    private Long totalFee;
    private String notifyUrl;
    private String clientIp;

    /**
     * 小程序支付使用
     */
    private String openid;


}
