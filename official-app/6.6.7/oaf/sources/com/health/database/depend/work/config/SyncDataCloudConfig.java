package com.health.database.depend.work.config;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.vd8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/health/database/depend/work/config/SyncDataCloudConfig;", "", "switchStatus", "", "config", "", "(ILjava/lang/String;)V", "getSwitchStatus", "()I", "setSwitchStatus", "(I)V", "component1", "component2", "copy", "equals", "", "other", "getConfig", "", "Lcom/health/database/depend/work/config/CloudConfigListBean;", "hashCode", "toString", "depend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncDataCloudConfig {

    @NotNull
    private final String config;
    private int switchStatus;

    public SyncDataCloudConfig(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "config");
        this.switchStatus = i;
        this.config = str;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getConfig() {
        return this.config;
    }

    public static /* synthetic */ SyncDataCloudConfig copy$default(SyncDataCloudConfig syncDataCloudConfig, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = syncDataCloudConfig.switchStatus;
        }
        if ((i2 & 2) != 0) {
            str = syncDataCloudConfig.config;
        }
        return syncDataCloudConfig.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    @NotNull
    public final SyncDataCloudConfig copy(int switchStatus, @NotNull String config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new SyncDataCloudConfig(switchStatus, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncDataCloudConfig)) {
            return false;
        }
        SyncDataCloudConfig syncDataCloudConfig = (SyncDataCloudConfig) other;
        return this.switchStatus == syncDataCloudConfig.switchStatus && Intrinsics.areEqual(this.config, syncDataCloudConfig.config);
    }

    @Nullable
    public final List<CloudConfigListBean> getConfig() {
        return vd8.d(this.config, CloudConfigListBean.class);
    }

    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public int hashCode() {
        return (Integer.hashCode(this.switchStatus) * 31) + this.config.hashCode();
    }

    public final void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    @NotNull
    public String toString() {
        return "SyncDataCloudConfig(switchStatus=" + this.switchStatus + ", config=" + this.config + ")";
    }

    public /* synthetic */ SyncDataCloudConfig(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }
}
