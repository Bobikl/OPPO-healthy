package com.heytap.health.healthbase.config.service;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.fkj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/healthbase/config/service/NetConfig;", "", fkj.PARAM_SWITCH_STATUS, "", "data", "", "(ILjava/lang/String;)V", "getData", "()Ljava/lang/String;", "getSwitchStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "health_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NetConfig {
    public static final int $stable = 0;

    @SerializedName("config")
    @Nullable
    private final String data;

    @SerializedName(fkj.PARAM_SWITCH_STATUS)
    private final int switchStatus;

    public NetConfig(int i, @Nullable String str) {
        this.switchStatus = i;
        this.data = str;
    }

    public static /* synthetic */ NetConfig copy$default(NetConfig netConfig, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = netConfig.switchStatus;
        }
        if ((i2 & 2) != 0) {
            str = netConfig.data;
        }
        return netConfig.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final NetConfig copy(int switchStatus, @Nullable String data) {
        return new NetConfig(switchStatus, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetConfig)) {
            return false;
        }
        NetConfig netConfig = (NetConfig) other;
        return this.switchStatus == netConfig.switchStatus && Intrinsics.areEqual(this.data, netConfig.data);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.switchStatus) * 31;
        String str = this.data;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NetConfig(switchStatus=" + this.switchStatus + ", data=" + this.data + ")";
    }
}
