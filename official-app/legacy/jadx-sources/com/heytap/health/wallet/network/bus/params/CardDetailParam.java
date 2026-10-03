package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/CardDetailParam;", "", j7l.KEY_CPLC, "", "appCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "cardNo", "getCardNo", "setCardNo", "(Ljava/lang/String;)V", "getCplc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardDetailParam {

    @NotNull
    private final String appCode;

    @Nullable
    private String cardNo;

    @NotNull
    private final String cplc;

    public CardDetailParam(@NotNull String cplc, @NotNull String appCode) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        this.cplc = cplc;
        this.appCode = appCode;
    }

    public static /* synthetic */ CardDetailParam copy$default(CardDetailParam cardDetailParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDetailParam.cplc;
        }
        if ((i & 2) != 0) {
            str2 = cardDetailParam.appCode;
        }
        return cardDetailParam.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final CardDetailParam copy(@NotNull String cplc, @NotNull String appCode) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        return new CardDetailParam(cplc, appCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetailParam)) {
            return false;
        }
        CardDetailParam cardDetailParam = (CardDetailParam) other;
        return Intrinsics.areEqual(this.cplc, cardDetailParam.cplc) && Intrinsics.areEqual(this.appCode, cardDetailParam.appCode);
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public int hashCode() {
        return (this.cplc.hashCode() * 31) + this.appCode.hashCode();
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    @NotNull
    public String toString() {
        return "CardDetailParam(cplc=" + this.cplc + ", appCode=" + this.appCode + ")";
    }
}
