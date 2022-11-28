package com.summer.pay.enums;

import lombok.Getter;

/**
 * @author summer
 */

@Getter
public enum CurrencyEnum {
    /**
     * 人民币
     */
    CNY(0, "CNY", "人民币"),
    /**
     * 美元
     */
    USD(1, "USD", "美元");
    private final int type;
    private final String str;
    private final String desc;

    private CurrencyEnum(int type, String str, String desc) {
        this.type = type;
        this.str = str;
        this.desc = desc;
    }

    public static String getDescByType(int type) {
        for (CurrencyEnum rateTypeEnum : CurrencyEnum.values()) {
            if (rateTypeEnum.getType() == type) {
                return rateTypeEnum.getDesc();
            }
        }
        return null;
    }

    public static String getStrByType(int type) {
        for (CurrencyEnum rateTypeEnum : CurrencyEnum.values()) {
            if (rateTypeEnum.getType() == type) {
                return rateTypeEnum.getStr();
            }
        }
        return null;
    }

}
