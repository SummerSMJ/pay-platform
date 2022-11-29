package com.summer.pay.dto;

import com.summer.pay.enums.*;
import lombok.Data;

/**
 * 支付单DTO
 *
 * @author summer
 */
@Data
public class PaymentOrderDTO {

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
     * 业务code
     */
    private String businessCode;
    /**
     * 支付单金额 分
     */
    private Long paymentOrderAmount;
    /**
     * 已支付金额 分
     */
    private Long paidAmount;
    /**
     * 已退款金额 分
     */
    private Long refundAmount;
    /**
     * 找零金额 分
     */
    private Long changeAmount;
    /**
     * 币种
     */
    private CurrencyEnum currency;
    /**
     * 买家ID
     */
    private Long buyerId;
    /**
     * 卖家ID 列表 逗号分隔
     */
    private String sellerIdList;
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
     * 支付单状态 0-未支付,1-支付成功,2-转入退款,3-已关闭,4-已撤销（仅付款码支付会返回）,5-用户支付中（仅付款码支付会返回）,6-支付失败（仅付款码支付会返回）
     */
    private PaymentOrderStatusEnum paymentOrderStatus;
    /**
     * 退款状态 0-未退款,1-部分退款,2-全部退款
     */
    private PaymentOrderRefundStatusEnum refundStatus;
    /**
     * 手续费 单位分
     */
    private Long feeAmount;
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
    private java.util.Date createdAt;
    private java.util.Date updatedAt;

}
