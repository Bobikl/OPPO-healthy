package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.j7l;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/MultiActivateParam;", "", "()V", f04.JSON_KEY_RKE_ACTION_TYPE, "", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "commandResultsVo", "Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "getCommandResultsVo", "()Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "setCommandResultsVo", "(Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;)V", j7l.KEY_CPLC, "getCplc", "setCplc", "currentStep", "getCurrentStep", "setCurrentStep", "instanceIdList", "", "getInstanceIdList", "()Ljava/util/List;", "setInstanceIdList", "(Ljava/util/List;)V", "multiActiveType", "getMultiActiveType", "setMultiActiveType", "session", "getSession", "setSession", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiActivateParam {

    @Nullable
    private String actionType;

    @Nullable
    private ScriptRltVo commandResultsVo;

    @Nullable
    private String cplc;

    @Nullable
    private String currentStep;

    @Nullable
    private List<String> instanceIdList;

    @Nullable
    private String multiActiveType;

    @Nullable
    private String session;

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final ScriptRltVo getCommandResultsVo() {
        return this.commandResultsVo;
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
    public final List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    @Nullable
    public final String getMultiActiveType() {
        return this.multiActiveType;
    }

    @Nullable
    public final String getSession() {
        return this.session;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final void setCommandResultsVo(@Nullable ScriptRltVo scriptRltVo) {
        this.commandResultsVo = scriptRltVo;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setCurrentStep(@Nullable String str) {
        this.currentStep = str;
    }

    public final void setInstanceIdList(@Nullable List<String> list) {
        this.instanceIdList = list;
    }

    public final void setMultiActiveType(@Nullable String str) {
        this.multiActiveType = str;
    }

    public final void setSession(@Nullable String str) {
        this.session = str;
    }
}
