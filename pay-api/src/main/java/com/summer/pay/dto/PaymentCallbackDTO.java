package com.summer.pay.dto;

import com.summer.pay.enums.PayChannelEnum;
import lombok.Data;

/**
 * 支付回调 DTO
 *
 * @author summer
 */
@Data
public class PaymentCallbackDTO {

    private PayChannelEnum payChannelEnum;

    private String callbackBody;

    private String apiSecret;
}
