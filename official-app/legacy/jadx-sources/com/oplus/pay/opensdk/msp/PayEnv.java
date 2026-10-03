package com.oplus.pay.opensdk.msp;

import com.heytap.store.base.core.http.HttpConst;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/oplus/pay/opensdk/msp/PayEnv;", "", HttpConst.SERVER_ENV, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEnv", "()Ljava/lang/String;", "RELEASE", "TEST1", "TEST3", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PayEnv {
    RELEASE("0"),
    TEST1("1"),
    TEST3("3");


    @NotNull
    private final String env;

    PayEnv(String str) {
        this.env = str;
    }

    @NotNull
    public final String getEnv() {
        return this.env;
    }
}
