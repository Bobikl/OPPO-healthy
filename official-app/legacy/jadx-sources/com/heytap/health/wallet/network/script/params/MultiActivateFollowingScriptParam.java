package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.j7l;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/MultiActivateFollowingScriptParam;", "", j7l.KEY_CPLC, "", "currentStep", "session", "commandResultsVO", "Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "commandType", "instanceIdList", "", "multiActiveType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", f04.JSON_KEY_RKE_ACTION_TYPE, "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "commandResultsVo", "getCommandResultsVo", "()Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "setCommandResultsVo", "(Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;)V", "getCplc", "setCplc", "getCurrentStep", "setCurrentStep", "getInstanceIdList", "()Ljava/util/List;", "setInstanceIdList", "(Ljava/util/List;)V", "getMultiActiveType", "setMultiActiveType", "getSession", "setSession", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiActivateFollowingScriptParam {

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

    public MultiActivateFollowingScriptParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ScriptRltVo scriptRltVo, @Nullable String str4, @Nullable List<String> list, @Nullable String str5) {
        this.cplc = str;
        this.multiActiveType = str5;
        this.instanceIdList = list;
        this.currentStep = str2;
        this.actionType = str4;
        this.session = str3;
        this.commandResultsVo = scriptRltVo;
    }

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
