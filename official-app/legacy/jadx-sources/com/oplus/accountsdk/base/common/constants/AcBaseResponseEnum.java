package com.oplus.accountsdk.base.common.constants;

import com.heytap.speech.engine.constant.ErrorCode;

/* JADX INFO: loaded from: classes6.dex */
public enum AcBaseResponseEnum {
    ERROR_CONFIG_REQUESTING(-50001, "config requesting"),
    ERROR_TRACK_DOMAIN_ERROR(-50002, "Track domain is not available"),
    ERROR_NOT_OAUTH_MANAGER(ErrorCode.ERROR_ASR_NODE_NOT_CONNECT, "oauth manager is null"),
    ERROR_NOT_VERIFY_AGENT(-40002, "verify agent is null"),
    ERROR_NOT_TEENAGE_VERIFY_AGENT(-40003, "teenageVerify agent is null");

    private int code;
    private String remark;

    AcBaseResponseEnum(int i, String str) {
        this.code = i;
        this.remark = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getRemark() {
        return this.remark;
    }
}
