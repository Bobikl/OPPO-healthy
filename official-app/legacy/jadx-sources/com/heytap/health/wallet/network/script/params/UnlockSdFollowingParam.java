package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/UnlockSdFollowingParam;", "", j7l.KEY_CPLC, "", "currentStep", "session", "commandResults", "Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;)V", "getCommandResults", "()Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "getCplc", "()Ljava/lang/String;", "getCurrentStep", "getSession", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UnlockSdFollowingParam {

    @Nullable
    private final ScriptRltVo commandResults;

    @Nullable
    private final String cplc;

    @Nullable
    private final String currentStep;

    @Nullable
    private final String session;

    public UnlockSdFollowingParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ScriptRltVo scriptRltVo) {
        this.cplc = str;
        this.currentStep = str2;
        this.session = str3;
        this.commandResults = scriptRltVo;
    }

    public static /* synthetic */ UnlockSdFollowingParam copy$default(UnlockSdFollowingParam unlockSdFollowingParam, String str, String str2, String str3, ScriptRltVo scriptRltVo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockSdFollowingParam.cplc;
        }
        if ((i & 2) != 0) {
            str2 = unlockSdFollowingParam.currentStep;
        }
        if ((i & 4) != 0) {
            str3 = unlockSdFollowingParam.session;
        }
        if ((i & 8) != 0) {
            scriptRltVo = unlockSdFollowingParam.commandResults;
        }
        return unlockSdFollowingParam.copy(str, str2, str3, scriptRltVo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ScriptRltVo getCommandResults() {
        return this.commandResults;
    }

    @NotNull
    public final UnlockSdFollowingParam copy(@Nullable String cplc, @Nullable String currentStep, @Nullable String session, @Nullable ScriptRltVo commandResults) {
        return new UnlockSdFollowingParam(cplc, currentStep, session, commandResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnlockSdFollowingParam)) {
            return false;
        }
        UnlockSdFollowingParam unlockSdFollowingParam = (UnlockSdFollowingParam) other;
        return Intrinsics.areEqual(this.cplc, unlockSdFollowingParam.cplc) && Intrinsics.areEqual(this.currentStep, unlockSdFollowingParam.currentStep) && Intrinsics.areEqual(this.session, unlockSdFollowingParam.session) && Intrinsics.areEqual(this.commandResults, unlockSdFollowingParam.commandResults);
    }

    @Nullable
    public final ScriptRltVo getCommandResults() {
        return this.commandResults;
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
    public final String getSession() {
        return this.session;
    }

    public int hashCode() {
        String str = this.cplc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currentStep;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.session;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ScriptRltVo scriptRltVo = this.commandResults;
        return iHashCode3 + (scriptRltVo != null ? scriptRltVo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnlockSdFollowingParam(cplc=" + this.cplc + ", currentStep=" + this.currentStep + ", session=" + this.session + ", commandResults=" + this.commandResults + ")";
    }
}
