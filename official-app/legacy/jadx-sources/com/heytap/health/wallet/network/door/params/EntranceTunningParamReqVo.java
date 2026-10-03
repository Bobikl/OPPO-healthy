package com.heytap.health.wallet.network.door.params;

import com.oplus.aiunit.vision.j7l;
import io.protostuff.Tag;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/EntranceTunningParamReqVo;", "Ljava/io/Serializable;", "()V", "appCode", "", "getAppCode", "()Ljava/lang/String;", "setAppCode", "(Ljava/lang/String;)V", j7l.KEY_CPLC, "getCplc", "setCplc", "index", "getIndex", "setIndex", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntranceTunningParamReqVo implements Serializable {

    @Tag(3)
    @Nullable
    private String appCode;

    @Tag(1)
    @Nullable
    private String cplc;

    @Tag(2)
    @Nullable
    private String index;

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getIndex() {
        return this.index;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setIndex(@Nullable String str) {
        this.index = str;
    }
}
