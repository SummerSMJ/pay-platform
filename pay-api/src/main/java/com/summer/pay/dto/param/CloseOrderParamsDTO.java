package com.summer.pay.dto.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关闭订单DTO
 *
 * @author summer
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CloseOrderParamsDTO extends PaymentBaseParams {

    private String merchantSerialNo;
    private String subMchId;

    private Long tradeId;

}
