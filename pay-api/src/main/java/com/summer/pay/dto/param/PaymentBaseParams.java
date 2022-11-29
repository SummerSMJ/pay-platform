package com.summer.pay.dto.param;

import com.summer.pay.enums.PayChannelEnum;
import lombok.Data;

/**
 * 支付基础参数
 * @author summer
 */
@Data
public class PaymentBaseParams {

    private PayChannelEnum payChannelEnum;

    private String mchId;
    private String appId;
    private String apiSecret;
}
