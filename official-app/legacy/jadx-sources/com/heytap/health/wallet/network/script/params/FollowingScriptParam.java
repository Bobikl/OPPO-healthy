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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bBU\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rBi\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0013¨\u0006("}, d2 = {"Lcom/heytap/health/wallet/network/script/params/FollowingScriptParam;", "", j7l.KEY_CPLC, "", "currentStep", "session", "commandResultsVO", "Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;)V", "extraInfo", "appCode", "orderNo", f04.JSON_KEY_RKE_ACTION_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "balance", "", "cardNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "getAppCode", "setAppCode", "getBalance", "()Ljava/lang/Integer;", "setBalance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCardNo", "setCardNo", "getCommandResultsVO", "()Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "getCplc", "getCurrentStep", "getExtraInfo", "setExtraInfo", "getOrderNo", "setOrderNo", "getSession", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FollowingScriptParam {

    @Nullable
    private String actionType;

    @Nullable
    private String appCode;

    @Nullable
    private Integer balance;

    @Nullable
    private String cardNo;

    @Nullable
    private final ScriptRltVo commandResultsVO;

    @NotNull
    private final String cplc;

    @Nullable
    private final String currentStep;

    @Nullable
    private String extraInfo;

    @Nullable
    private String orderNo;

    @Nullable
    private final String session;

    public FollowingScriptParam(@NotNull String cplc, @Nullable String str, @Nullable String str2, @Nullable ScriptRltVo scriptRltVo) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.balance = 0;
        this.cplc = cplc;
        this.currentStep = str;
        this.session = str2;
        this.commandResultsVO = scriptRltVo;
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

    @Nullable
    public final ScriptRltVo getCommandResultsVO() {
        return this.commandResultsVO;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @Nullable
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getSession() {
        return this.session;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setBalance(@Nullable Integer num) {
        this.balance = num;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setExtraInfo(@Nullable String str) {
        this.extraInfo = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public FollowingScriptParam(@NotNull String cplc, @Nullable String str, @Nullable String str2, @Nullable ScriptRltVo scriptRltVo, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.balance = 0;
        this.cplc = cplc;
        this.currentStep = str;
        this.session = str2;
        this.commandResultsVO = scriptRltVo;
        this.extraInfo = str3;
        this.appCode = str4;
        this.orderNo = str5;
        this.actionType = str6;
    }

    public FollowingScriptParam(@NotNull String cplc, @Nullable String str, @Nullable String str2, @Nullable ScriptRltVo scriptRltVo, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        this.cplc = cplc;
        this.currentStep = str;
        this.session = str2;
        this.commandResultsVO = scriptRltVo;
        this.extraInfo = str3;
        this.appCode = str4;
        this.orderNo = str5;
        this.actionType = str6;
        this.balance = num;
        this.cardNo = str7;
    }
}
