package com.heytap.nearx.cloudconfig.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/cloudconfig/bean/ConfigData;", "", "configId", "", "configType", "", "configVersion", "(Ljava/lang/String;II)V", "getConfigId", "()Ljava/lang/String;", "getConfigType", "()I", "getConfigVersion", "setConfigVersion", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class ConfigData {

    @NotNull
    private final String configId;
    private final int configType;
    private int configVersion;

    public ConfigData(@NotNull String configId, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        this.configId = configId;
        this.configType = i;
        this.configVersion = i2;
    }

    public static /* synthetic */ ConfigData copy$default(ConfigData configData, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = configData.configId;
        }
        if ((i3 & 2) != 0) {
            i = configData.configType;
        }
        if ((i3 & 4) != 0) {
            i2 = configData.configVersion;
        }
        return configData.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getConfigVersion() {
        return this.configVersion;
    }

    @NotNull
    public final ConfigData copy(@NotNull String configId, int configType, int configVersion) {
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        return new ConfigData(configId, configType, configVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigData)) {
            return false;
        }
        ConfigData configData = (ConfigData) other;
        return Intrinsics.areEqual(this.configId, configData.configId) && this.configType == configData.configType && this.configVersion == configData.configVersion;
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    public int hashCode() {
        String str = this.configId;
        return ((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.configType)) * 31) + Integer.hashCode(this.configVersion);
    }

    public final void setConfigVersion(int i) {
        this.configVersion = i;
    }

    @NotNull
    public String toString() {
        return "ConfigData(configId=" + this.configId + ", configType=" + this.configType + ", configVersion=" + this.configVersion + ")";
    }

    public /* synthetic */ ConfigData(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
