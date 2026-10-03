package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/CplcVoParam;", "", j7l.KEY_CPLC, "", "(Ljava/lang/String;)V", "getCplc", "()Ljava/lang/String;", "setCplc", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CplcVoParam {

    @NotNull
    private String cplc;

    public CplcVoParam(@NotNull String cplc) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.cplc = cplc;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public final void setCplc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cplc = str;
    }
}
