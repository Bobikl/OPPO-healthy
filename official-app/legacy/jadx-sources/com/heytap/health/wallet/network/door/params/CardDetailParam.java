package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/CardDetailParam;", "", j7l.KEY_CPLC, "", "appCode", "(Ljava/lang/String;Ljava/lang/String;)V", "aid", "getAid", "()Ljava/lang/String;", "getAppCode", "setAppCode", "(Ljava/lang/String;)V", "cardType", "getCardType", "getCplc", "setCplc", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardDetailParam {

    @Nullable
    private final String aid;

    @Nullable
    private String appCode;

    @Nullable
    private final String cardType;

    @Nullable
    private String cplc;

    public CardDetailParam(@Nullable String str, @Nullable String str2) {
        this.cplc = str;
        this.appCode = str2;
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }
}
