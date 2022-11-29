package com.summer.pay.dto.res;

import com.summer.pay.enums.PayChannelEnum;
import com.summer.pay.enums.PaymentRefundOrderDetailStatusEnum;
import lombok.Data;

/**
 * 退款查询res DTO
 *
 * @author summer
 */
@Data
public class RefundQueryResDTO {

    private PayChannelEnum payChannelEnum;

    private String gatewaySerialNo;

    private PaymentRefundOrderDetailStatusEnum paymentRefundOrderDetailStatusEnum;

}
