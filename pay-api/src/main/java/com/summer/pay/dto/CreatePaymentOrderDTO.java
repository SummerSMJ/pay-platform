package com.summer.pay.dto;

import com.summer.pay.enums.*;
import lombok.Data;

import java.util.Set;

/**
 * 创建支付单DTO
 *
 * @author summer
 */
@Data
public class CreatePaymentOrderDTO {

    /**
     * 支付单类型 付款单/预付单
     */
    private PaymentOrderTypeEnum paymentOrderType;
    /**
     * 外部请求单号
     */
    private String outRequestNo;
    /**
     * 上游交易单号
     */
    private Long tradeId;
    /**
     * 是否0元单
     */
    private Boolean free;
    /**
     * 支付单金额 分
     */
    private Long paymentOrderAmount;
    /**
     * 币种
     */
    private CurrencyEnum currency;
    /**
     * 买家ID
     */
    private Long buyerId;
    /**
     * 卖家ID 列表
     */
    private Set<Long> sellerIds;
    /**
     * 交易类型 0-支付,1-退款
     */
    private PaymentOrderTradeTypeEnum tradeType;
    /**
     * 交易概述
     */
    private String tradeSummary;
    /**
     * 支付开始时间
     */
    private java.util.Date payStartTime;
    /**
     * 支付结束时间
     */
    private java.util.Date payEndTime;
    /**
     * 手续费 单位分
     */
    private Long feeAmount = 0L;
    /**
     * 业务回调地址
     */
    private String callbackUrl;
    /**
     * 商品信息
     */
    private String goodsInfo;
    /**
     * 抵扣信息
     */
    private String deductInfo;

}
