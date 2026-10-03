package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.j7l;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/CarKeyFollowScriptParam;", "", "()V", f04.JSON_KEY_RKE_ACTION_TYPE, "", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "aid", "getAid", "setAid", "commandResultsVO", "Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "getCommandResultsVO", "()Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "setCommandResultsVO", "(Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;)V", j7l.KEY_CPLC, "getCplc", "setCplc", "currentStep", "getCurrentStep", "setCurrentStep", "orderId", "getOrderId", "setOrderId", "session", "getSession", "setSession", "token", AcCommonApiMethod.GET_TOKEN, "setToken", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarKeyFollowScriptParam {

    @Nullable
    private String actionType;

    @Nullable
    private String aid;

    @Nullable
    private ScriptRltVo commandResultsVO;

    @Nullable
    private String cplc;

    @Nullable
    private String currentStep;

    @Nullable
    private String orderId;

    @Nullable
    private String session;

    @Nullable
    private String token;

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final ScriptRltVo getCommandResultsVO() {
        return this.commandResultsVO;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getSession() {
        return this.session;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setCommandResultsVO(@Nullable ScriptRltVo scriptRltVo) {
        this.commandResultsVO = scriptRltVo;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setCurrentStep(@Nullable String str) {
        this.currentStep = str;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setSession(@Nullable String str) {
        this.session = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }
}
