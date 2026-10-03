package com.oplus.seedling.sdk.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/oplus/seedling/sdk/entity/UpkVersion;", "", "serviceId", "", "newUpkVersion", "oldUpkVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNewUpkVersion", "()Ljava/lang/String;", "getOldUpkVersion", "getServiceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UpkVersion {

    @NotNull
    private final String newUpkVersion;

    @NotNull
    private final String oldUpkVersion;

    @NotNull
    private final String serviceId;

    public UpkVersion(@NotNull String serviceId, @NotNull String newUpkVersion, @NotNull String oldUpkVersion) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(newUpkVersion, "newUpkVersion");
        Intrinsics.checkNotNullParameter(oldUpkVersion, "oldUpkVersion");
        this.serviceId = serviceId;
        this.newUpkVersion = newUpkVersion;
        this.oldUpkVersion = oldUpkVersion;
    }

    public static /* synthetic */ UpkVersion copy$default(UpkVersion upkVersion, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upkVersion.serviceId;
        }
        if ((i & 2) != 0) {
            str2 = upkVersion.newUpkVersion;
        }
        if ((i & 4) != 0) {
            str3 = upkVersion.oldUpkVersion;
        }
        return upkVersion.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewUpkVersion() {
        return this.newUpkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOldUpkVersion() {
        return this.oldUpkVersion;
    }

    @NotNull
    public final UpkVersion copy(@NotNull String serviceId, @NotNull String newUpkVersion, @NotNull String oldUpkVersion) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(newUpkVersion, "newUpkVersion");
        Intrinsics.checkNotNullParameter(oldUpkVersion, "oldUpkVersion");
        return new UpkVersion(serviceId, newUpkVersion, oldUpkVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpkVersion)) {
            return false;
        }
        UpkVersion upkVersion = (UpkVersion) other;
        return Intrinsics.areEqual(this.serviceId, upkVersion.serviceId) && Intrinsics.areEqual(this.newUpkVersion, upkVersion.newUpkVersion) && Intrinsics.areEqual(this.oldUpkVersion, upkVersion.oldUpkVersion);
    }

    @NotNull
    public final String getNewUpkVersion() {
        return this.newUpkVersion;
    }

    @NotNull
    public final String getOldUpkVersion() {
        return this.oldUpkVersion;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return (((this.serviceId.hashCode() * 31) + this.newUpkVersion.hashCode()) * 31) + this.oldUpkVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpkVersion(serviceId=" + this.serviceId + ", newUpkVersion=" + this.newUpkVersion + ", oldUpkVersion=" + this.oldUpkVersion + ")";
    }
}
