package com.summer.pay.dto;

import com.summer.pay.enums.PayChannelEnum;
import lombok.Data;

/**
 * 退款回调 DTO
 *
 * @author summer
 */
@Data
public class RefundCallbackDTO {

    private PayChannelEnum payChannelEnum;

    private String callbackBody;

    private String apiSecret;
}
