package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/QueryCloudCardParam;", "", j7l.KEY_CPLC, "", "(Ljava/lang/String;)V", "getCplc", "()Ljava/lang/String;", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryCloudCardParam {

    @NotNull
    private final String cplc;

    public QueryCloudCardParam(@NotNull String cplc) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.cplc = cplc;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }
}
