package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/VersionInfo;", "", "versionStr", "", "version", "", "(Ljava/lang/String;I)V", "getVersion", "()I", "setVersion", "(I)V", "getVersionStr", "()Ljava/lang/String;", "setVersionStr", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VersionInfo {
    private int version;

    @Nullable
    private String versionStr;

    /* JADX WARN: Multi-variable type inference failed */
    public VersionInfo() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VersionInfo copy$default(VersionInfo versionInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = versionInfo.versionStr;
        }
        if ((i2 & 2) != 0) {
            i = versionInfo.version;
        }
        return versionInfo.copy(str, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersionStr() {
        return this.versionStr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final VersionInfo copy(@Nullable String versionStr, int version) {
        return new VersionInfo(versionStr, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionInfo)) {
            return false;
        }
        VersionInfo versionInfo = (VersionInfo) other;
        return Intrinsics.areEqual(this.versionStr, versionInfo.versionStr) && this.version == versionInfo.version;
    }

    public final int getVersion() {
        return this.version;
    }

    @Nullable
    public final String getVersionStr() {
        return this.versionStr;
    }

    public int hashCode() {
        String str = this.versionStr;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVersionStr(@Nullable String str) {
        this.versionStr = str;
    }

    @NotNull
    public String toString() {
        return "VersionInfo(versionStr=" + this.versionStr + ", version=" + this.version + ")";
    }

    public VersionInfo(@Nullable String str, int i) {
        this.versionStr = str;
        this.version = i;
    }

    public /* synthetic */ VersionInfo(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
