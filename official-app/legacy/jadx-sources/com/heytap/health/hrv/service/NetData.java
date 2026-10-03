package com.heytap.health.hrv.service;

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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/hrv/service/NetData;", "", fkj.PARAM_SWITCH_STATUS, "", "config", "", "(ILjava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getSwitchStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "hrv_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NetData {
    public static final int $stable = 0;

    @SerializedName("config")
    @NotNull
    private final String config;

    @SerializedName(fkj.PARAM_SWITCH_STATUS)
    private final int switchStatus;

    public NetData(int i, @NotNull String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.switchStatus = i;
        this.config = config;
    }

    public static /* synthetic */ NetData copy$default(NetData netData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = netData.switchStatus;
        }
        if ((i2 & 2) != 0) {
            str = netData.config;
        }
        return netData.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    @NotNull
    public final NetData copy(int switchStatus, @NotNull String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new NetData(switchStatus, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetData)) {
            return false;
        }
        NetData netData = (NetData) other;
        return this.switchStatus == netData.switchStatus && Intrinsics.areEqual(this.config, netData.config);
    }

    @NotNull
    public final String getConfig() {
        return this.config;
    }

    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public int hashCode() {
        return (Integer.hashCode(this.switchStatus) * 31) + this.config.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetData(switchStatus=" + this.switchStatus + ", config=" + this.config + ")";
    }
}
