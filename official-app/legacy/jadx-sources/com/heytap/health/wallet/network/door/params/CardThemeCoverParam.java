package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/CardThemeCoverParam;", "", "()V", "aid", "", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "appCode", "getAppCode", "setAppCode", "cardType", "getCardType", "setCardType", j7l.KEY_CPLC, "getCplc", "setCplc", "source", "", "getSource", "()I", "setSource", "(I)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardThemeCoverParam {

    @Nullable
    private String aid;

    @Nullable
    private String appCode;

    @Nullable
    private String cardType;

    @Nullable
    private String cplc;
    private int source;

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

    public final int getSource() {
        return this.source;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setSource(int i) {
        this.source = i;
    }
}
