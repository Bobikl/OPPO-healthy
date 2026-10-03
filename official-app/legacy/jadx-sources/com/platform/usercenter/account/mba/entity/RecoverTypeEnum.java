package com.platform.usercenter.account.mba.entity;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public enum RecoverTypeEnum {
    BLOCK_INSTALL("block_install"),
    SNACK_BAR_GUIDE("snack_bar_guide"),
    SILENCE("silence");

    public String value;

    RecoverTypeEnum(String str) {
        this.value = str;
    }

    public static RecoverTypeEnum getEnumByTypeString(String str) {
        RecoverTypeEnum recoverTypeEnum = SNACK_BAR_GUIDE;
        if (recoverTypeEnum.value.equals(str)) {
            return recoverTypeEnum;
        }
        RecoverTypeEnum recoverTypeEnum2 = SILENCE;
        return recoverTypeEnum2.value.equals(str) ? recoverTypeEnum2 : BLOCK_INSTALL;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
