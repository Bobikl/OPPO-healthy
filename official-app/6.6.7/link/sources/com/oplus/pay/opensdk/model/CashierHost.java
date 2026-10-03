package com.oplus.pay.opensdk.model;

import com.oplus.pantanal.seedling.constants.TraceConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/pay/opensdk/model/CashierHost;", "", "host", "", "sensorAction", "desc", TraceConstants.KEY_PKG_NAME, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getHost", "getPkgName", "getSensorAction", "MSP", "MERCHANT_APP", "SECURE_APP", "paysdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum CashierHost {
    MSP("MSP", "msppay", "移动服务", "com.heytap.htms"),
    MERCHANT_APP("MERCHANT_APP", "", "商户应用", ""),
    SECURE_APP("SECURE_APP", "nearme", "安全支付", "");


    @NotNull
    private final String desc;

    @NotNull
    private final String host;

    @NotNull
    private final String pkgName;

    @NotNull
    private final String sensorAction;

    CashierHost(String str, String str2, String str3, String str4) {
        this.host = str;
        this.sensorAction = str2;
        this.desc = str3;
        this.pkgName = str4;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }

    @NotNull
    public final String getSensorAction() {
        return this.sensorAction;
    }
}
