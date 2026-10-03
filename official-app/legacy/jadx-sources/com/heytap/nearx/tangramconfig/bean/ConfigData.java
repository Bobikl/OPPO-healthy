package com.heytap.nearx.tangramconfig.bean;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/heytap/nearx/tangramconfig/bean/ConfigData;", "", "configId", "", "configType", "", "configVersion", Fields.CONFIG_MAX_VERSION, "content", "(Ljava/lang/String;IIILjava/lang/String;)V", "getConfigId", "()Ljava/lang/String;", "getConfigMaxVersion", "()I", "setConfigMaxVersion", "(I)V", "getConfigType", "getConfigVersion", "setConfigVersion", "getContent", "setContent", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ConfigData {

    @NotNull
    private final String configId;
    private int configMaxVersion;
    private final int configType;
    private int configVersion;

    @Nullable
    private String content;

    public ConfigData(@NotNull String configId, int i, int i2, int i3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        this.configId = configId;
        this.configType = i;
        this.configVersion = i2;
        this.configMaxVersion = i3;
        this.content = str;
    }

    public static /* synthetic */ ConfigData copy$default(ConfigData configData, String str, int i, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = configData.configId;
        }
        if ((i4 & 2) != 0) {
            i = configData.configType;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = configData.configVersion;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = configData.configMaxVersion;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            str2 = configData.content;
        }
        return configData.copy(str, i5, i6, i7, str2);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getConfigMaxVersion() {
        return this.configMaxVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final ConfigData copy(@NotNull String configId, int configType, int configVersion, int configMaxVersion, @Nullable String content) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        return new ConfigData(configId, configType, configVersion, configMaxVersion, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigData)) {
            return false;
        }
        ConfigData configData = (ConfigData) other;
        return Intrinsics.areEqual(this.configId, configData.configId) && this.configType == configData.configType && this.configVersion == configData.configVersion && this.configMaxVersion == configData.configMaxVersion && Intrinsics.areEqual(this.content, configData.content);
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    public final int getConfigMaxVersion() {
        return this.configMaxVersion;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        int iHashCode = ((((((this.configId.hashCode() * 31) + Integer.hashCode(this.configType)) * 31) + Integer.hashCode(this.configVersion)) * 31) + Integer.hashCode(this.configMaxVersion)) * 31;
        String str = this.content;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setConfigMaxVersion(int i) {
        this.configMaxVersion = i;
    }

    public final void setConfigVersion(int i) {
        this.configVersion = i;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    @NotNull
    public String toString() {
        return "ConfigData(configId=" + this.configId + ", configType=" + this.configType + ", configVersion=" + this.configVersion + ", configMaxVersion=" + this.configMaxVersion + ", content=" + this.content + ')';
    }

    public /* synthetic */ ConfigData(String str, int i, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, str2);
    }
}
