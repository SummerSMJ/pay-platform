package com.summer.pay.dto.res;

import com.summer.pay.enums.PayChannelEnum;
import lombok.Data;

/**
 * 获取支付参数Res DTO
 *
 * @author summer
 */
@Data
public class GetPaymentInfoResDTO {

    private PayChannelEnum payChannelEnum;

    private String res;
}
