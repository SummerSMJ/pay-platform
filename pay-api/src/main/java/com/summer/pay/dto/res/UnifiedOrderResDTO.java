package com.summer.pay.dto.res;

import com.summer.pay.enums.PayChannelEnum;
import lombok.Data;

/**
 * 统一下单返回值DTO
 *
 * @author summer
 */
@Data
public class UnifiedOrderResDTO {
    private PayChannelEnum payChannelEnum;

    private String appId;
    private String partnerId;
    private String prepayId;
    private String packageStr;
    private String nonceStr;
    private String timestamp;
    private String sign;

}
