package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/ConditionCheckVo;", "", "()V", "whiteCardAid", "", "getWhiteCardAid", "()Ljava/lang/String;", "setWhiteCardAid", "(Ljava/lang/String;)V", "whiteCardAppCode", "getWhiteCardAppCode", "setWhiteCardAppCode", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConditionCheckVo {

    @Nullable
    private String whiteCardAid;

    @Nullable
    private String whiteCardAppCode;

    @Nullable
    public final String getWhiteCardAid() {
        return this.whiteCardAid;
    }

    @Nullable
    public final String getWhiteCardAppCode() {
        return this.whiteCardAppCode;
    }

    public final void setWhiteCardAid(@Nullable String str) {
        this.whiteCardAid = str;
    }

    public final void setWhiteCardAppCode(@Nullable String str) {
        this.whiteCardAppCode = str;
    }
}
