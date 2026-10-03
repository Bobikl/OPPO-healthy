package com.oplus.pay.opensdk.model;

import com.platform.usercenter.account.newcommon.router.LinkInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/oplus/pay/opensdk/model/CashierType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APP", LinkInfo.CALL_TYPE_H5, "paysdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum CashierType {
    APP("APP_CASHIER"),
    H5("H5_CASHIER");


    @Nullable
    private final String value;

    CashierType(String str) {
        this.value = str;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }
}
