package com.summer.pay.dto;

import lombok.Data;

@Data
public class PaymentCashierConfigDTO {
    private static final long serialVersionUID = 1L;

    private String env;
    private String payProductCode;
    private String businessDesc;
    private Integer enable;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
}
