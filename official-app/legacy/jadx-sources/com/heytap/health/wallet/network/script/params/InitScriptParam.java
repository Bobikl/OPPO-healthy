package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tBK\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/InitScriptParam;", "", j7l.KEY_CPLC, "", "appCode", "orderNo", f04.JSON_KEY_RKE_ACTION_TYPE, "extraInfo", "cardNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "balance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getActionType", "()Ljava/lang/String;", "getAppCode", "getBalance", "()Ljava/lang/Integer;", "setBalance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCardNo", "getCplc", "getExtraInfo", "getOrderNo", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitScriptParam {

    @Nullable
    private final String actionType;

    @Nullable
    private final String appCode;

    @Nullable
    private Integer balance;

    @Nullable
    private final String cardNo;

    @NotNull
    private final String cplc;

    @Nullable
    private final String extraInfo;

    @Nullable
    private final String orderNo;

    public InitScriptParam(@NotNull String cplc, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.balance = 0;
        this.cplc = cplc;
        this.appCode = str;
        this.orderNo = str2;
        this.actionType = str3;
        this.extraInfo = str4;
        this.cardNo = str5;
    }

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final Integer getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    public final void setBalance(@Nullable Integer num) {
        this.balance = num;
    }

    public InitScriptParam(@NotNull String cplc, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.cplc = cplc;
        this.appCode = str;
        this.orderNo = str2;
        this.actionType = str3;
        this.extraInfo = str4;
        this.cardNo = str5;
        this.balance = num;
    }
}
