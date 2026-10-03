package com.heytap.nearx.cloudconfig.datasource.task;

import com.heytap.nearx.cloudconfig.bean.ConfigData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/cloudconfig/datasource/task/SourceDownRet;", "", "isDataValid", "", "tempConfigFile", "", "updateConfig", "Lcom/heytap/nearx/cloudconfig/bean/ConfigData;", "(ZLjava/lang/String;Lcom/heytap/nearx/cloudconfig/bean/ConfigData;)V", "()Z", "getTempConfigFile", "()Ljava/lang/String;", "getUpdateConfig", "()Lcom/heytap/nearx/cloudconfig/bean/ConfigData;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class SourceDownRet {
    private final boolean isDataValid;

    @Nullable
    private final String tempConfigFile;

    @Nullable
    private final ConfigData updateConfig;

    public SourceDownRet() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ SourceDownRet copy$default(SourceDownRet sourceDownRet, boolean z, String str, ConfigData configData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sourceDownRet.isDataValid;
        }
        if ((i & 2) != 0) {
            str = sourceDownRet.tempConfigFile;
        }
        if ((i & 4) != 0) {
            configData = sourceDownRet.updateConfig;
        }
        return sourceDownRet.copy(z, str, configData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDataValid() {
        return this.isDataValid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTempConfigFile() {
        return this.tempConfigFile;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConfigData getUpdateConfig() {
        return this.updateConfig;
    }

    @NotNull
    public final SourceDownRet copy(boolean isDataValid, @Nullable String tempConfigFile, @Nullable ConfigData updateConfig) {
        return new SourceDownRet(isDataValid, tempConfigFile, updateConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceDownRet)) {
            return false;
        }
        SourceDownRet sourceDownRet = (SourceDownRet) other;
        return this.isDataValid == sourceDownRet.isDataValid && Intrinsics.areEqual(this.tempConfigFile, sourceDownRet.tempConfigFile) && Intrinsics.areEqual(this.updateConfig, sourceDownRet.updateConfig);
    }

    @Nullable
    public final String getTempConfigFile() {
        return this.tempConfigFile;
    }

    @Nullable
    public final ConfigData getUpdateConfig() {
        return this.updateConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isDataValid;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.tempConfigFile;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        ConfigData configData = this.updateConfig;
        return iHashCode + (configData != null ? configData.hashCode() : 0);
    }

    public final boolean isDataValid() {
        return this.isDataValid;
    }

    @NotNull
    public String toString() {
        return "SourceDownRet(isDataValid=" + this.isDataValid + ", tempConfigFile=" + this.tempConfigFile + ", updateConfig=" + this.updateConfig + ")";
    }

    public SourceDownRet(boolean z, @Nullable String str, @Nullable ConfigData configData) {
        this.isDataValid = z;
        this.tempConfigFile = str;
        this.updateConfig = configData;
    }

    public /* synthetic */ SourceDownRet(boolean z, String str, ConfigData configData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : configData);
    }
}
