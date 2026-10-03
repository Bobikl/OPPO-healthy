package com.oplus.accountsdk.open.core.trace;

import androidx.annotation.Keep;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenCoreSourceInfo {
    private final String appId;
    private final String appTraceId;
    private final String bizTraceId;

    public AcOpenCoreSourceInfo(String str, String str2) {
        this.appId = str;
        this.bizTraceId = str2;
        this.appTraceId = AcBaseTraceHelper.createTraceId(str);
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppTraceId() {
        return String.valueOf(this.appTraceId);
    }

    public String getBizTraceId() {
        return String.valueOf(this.bizTraceId);
    }

    public AcOpenCoreSourceInfo(String str, String str2, String str3) {
        this.appId = str;
        this.bizTraceId = str2;
        this.appTraceId = str3;
    }
}
