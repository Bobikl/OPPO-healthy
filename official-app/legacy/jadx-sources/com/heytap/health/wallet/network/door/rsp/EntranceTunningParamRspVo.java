package com.heytap.health.wallet.network.door.rsp;

import io.protostuff.Tag;
import java.io.Serializable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/EntranceTunningParamRspVo;", "Ljava/io/Serializable;", "()V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntranceTunningParamRspVo implements Serializable {

    @Tag(1)
    private boolean success;

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }
}
