package com.heytap.health.network.api.p001switch;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.fkj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/network/api/switch/SwitchGlobalResult;", "", fkj.PARAM_SWITCH_STATUS, "", "config", "", "(ILjava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getSwitchStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SwitchGlobalResult {

    @Nullable
    private final String config;
    private final int switchStatus;

    public SwitchGlobalResult(int i, @Nullable String str) {
        this.switchStatus = i;
        this.config = str;
    }

    public static /* synthetic */ SwitchGlobalResult copy$default(SwitchGlobalResult switchGlobalResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = switchGlobalResult.switchStatus;
        }
        if ((i2 & 2) != 0) {
            str = switchGlobalResult.config;
        }
        return switchGlobalResult.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    @NotNull
    public final SwitchGlobalResult copy(int switchStatus, @Nullable String config) {
        return new SwitchGlobalResult(switchStatus, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchGlobalResult)) {
            return false;
        }
        SwitchGlobalResult switchGlobalResult = (SwitchGlobalResult) other;
        return this.switchStatus == switchGlobalResult.switchStatus && Intrinsics.areEqual(this.config, switchGlobalResult.config);
    }

    @Nullable
    public final String getConfig() {
        return this.config;
    }

    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.switchStatus) * 31;
        String str = this.config;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SwitchGlobalResult(switchStatus=" + this.switchStatus + ", config=" + this.config + ")";
    }
}
