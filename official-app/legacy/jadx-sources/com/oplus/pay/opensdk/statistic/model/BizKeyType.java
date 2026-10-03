package com.oplus.pay.opensdk.statistic.model;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/model/BizKeyType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "KEY_TRACE_ID", "KEY_BIZ_NODE", "KEY_BIZ_RESULT", "KEY_BIZ_CODE", "KEY_BIZ_ERROR_MSG", "KEY_TRACE_SOURCE", "KEY_TRACE_CONTEXT", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum BizKeyType {
    KEY_TRACE_ID("traceId"),
    KEY_BIZ_NODE("bizNode"),
    KEY_BIZ_RESULT("bizResult"),
    KEY_BIZ_CODE("bizCode"),
    KEY_BIZ_ERROR_MSG("bizErrorMsg"),
    KEY_TRACE_SOURCE("traceSource"),
    KEY_TRACE_CONTEXT("traceContext");


    @NotNull
    private final String value;

    BizKeyType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
