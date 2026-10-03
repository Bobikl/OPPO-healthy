package com.heytap.health.watchface.provider.nfc;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/watchface/provider/nfc/CheckNfcReq;", "", "deviceId", "", "packageName", "uris", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getPackageName", "getUris", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CheckNfcReq {

    @NotNull
    private final String deviceId;

    @NotNull
    private final String packageName;

    @NotNull
    private final List<String> uris;

    public CheckNfcReq(@NotNull String deviceId, @NotNull String packageName, @NotNull List<String> uris) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uris, "uris");
        this.deviceId = deviceId;
        this.packageName = packageName;
        this.uris = uris;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckNfcReq copy$default(CheckNfcReq checkNfcReq, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkNfcReq.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = checkNfcReq.packageName;
        }
        if ((i & 4) != 0) {
            list = checkNfcReq.uris;
        }
        return checkNfcReq.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final List<String> component3() {
        return this.uris;
    }

    @NotNull
    public final CheckNfcReq copy(@NotNull String deviceId, @NotNull String packageName, @NotNull List<String> uris) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uris, "uris");
        return new CheckNfcReq(deviceId, packageName, uris);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckNfcReq)) {
            return false;
        }
        CheckNfcReq checkNfcReq = (CheckNfcReq) other;
        return Intrinsics.areEqual(this.deviceId, checkNfcReq.deviceId) && Intrinsics.areEqual(this.packageName, checkNfcReq.packageName) && Intrinsics.areEqual(this.uris, checkNfcReq.uris);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final List<String> getUris() {
        return this.uris;
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.uris.hashCode();
    }

    @NotNull
    public String toString() {
        return "CheckNfcReq(deviceId=" + this.deviceId + ", packageName=" + this.packageName + ", uris=" + this.uris + ")";
    }
}
