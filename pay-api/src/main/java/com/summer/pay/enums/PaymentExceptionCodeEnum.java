package com.summer.pay.enums;

import lombok.Getter;

/**
 * 常见状态码定义 后续用到再加
 *
 * @author summer
 */
@Getter
public enum PaymentExceptionCodeEnum {

    /**
     * 参数错误!
     */
    PARAM_ERROR(400, "参数错误!"),
    /**
     * 标签查询失败
     */
    TAG_ERROR(500, "标签查询失败!");

    private final Integer code;
    private final String msg;

    PaymentExceptionCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
