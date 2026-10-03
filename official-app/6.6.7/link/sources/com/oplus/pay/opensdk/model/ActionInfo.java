package com.oplus.pay.opensdk.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/oplus/pay/opensdk/model/ActionInfo;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SINGLE_PAY_STARTUP_ACTION", "PREORDER_PAY_STARTUP_ACTION", "MSP_LOW_VERSION_SINGLE_PAY_STARTUP_ACTION", "paysdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ActionInfo {
    SINGLE_PAY_STARTUP_ACTION(".plugin.host.startup.action.single_pay"),
    PREORDER_PAY_STARTUP_ACTION(".plugin.host.startup.action.pre_pay"),
    MSP_LOW_VERSION_SINGLE_PAY_STARTUP_ACTION("htms.plugin.host.startup.action.single_pay");


    @Nullable
    private final String value;

    ActionInfo(String str) {
        this.value = str;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }
}
