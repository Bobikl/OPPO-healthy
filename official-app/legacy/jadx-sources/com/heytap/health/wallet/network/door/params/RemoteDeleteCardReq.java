package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/RemoteDeleteCardReq;", "", j7l.KEY_CPLC, "", "appCode", "cardId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "getCardId", "getCplc", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteDeleteCardReq {

    @NotNull
    private final String appCode;

    @NotNull
    private final String cardId;

    @NotNull
    private final String cplc;

    public RemoteDeleteCardReq(@NotNull String cplc, @NotNull String appCode, @NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.cplc = cplc;
        this.appCode = appCode;
        this.cardId = cardId;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }
}
