package com.summer.pay.dto.param;

import com.summer.pay.enums.PayChannelEnum;
import lombok.Data;

/**
 * 退款DTO facade 层使用
 *
 * @author summer
 */
@Data
public class PaymentRefundParamsDTO {

    private PayChannelEnum payChannelEnum;
    private Long tradeId;
    private String outRequestNo;
    private Long refundTradeId;
    private String refundOutRequestNo;
    private Long refundAmount;
    private String refundDesc;

}
