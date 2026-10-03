package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.nfd, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/nfd;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOldestSupportedFullVersion", "()Ljava/lang/String;", "oldestSupportedFullVersion", "b", "version", "c", "I", "()I", "versionNumber", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OldestSupprotVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("oldestSupportedFullVersion")
    @NotNull
    private final String oldestSupportedFullVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("version")
    @NotNull
    private final String version;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("versionNumber")
    private final int versionNumber;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVersionNumber() {
        return this.versionNumber;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldestSupprotVersion)) {
            return false;
        }
        OldestSupprotVersion oldestSupprotVersion = (OldestSupprotVersion) other;
        return Intrinsics.areEqual(this.oldestSupportedFullVersion, oldestSupprotVersion.oldestSupportedFullVersion) && Intrinsics.areEqual(this.version, oldestSupprotVersion.version) && this.versionNumber == oldestSupprotVersion.versionNumber;
    }

    public int hashCode() {
        return (((this.oldestSupportedFullVersion.hashCode() * 31) + this.version.hashCode()) * 31) + Integer.hashCode(this.versionNumber);
    }

    @NotNull
    public String toString() {
        return "OldestSupprotVersion(oldestSupportedFullVersion=" + this.oldestSupportedFullVersion + ", version=" + this.version + ", versionNumber=" + this.versionNumber + ")";
    }
}
