package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f93, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/f93;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMac", "()Ljava/lang/String;", "mac", "b", "getDeviceModel", "deviceModel", "c", "Z", "()Z", "isSupportCardiovascular", "d", "isSupport60s", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CheckHistoryDeviceBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String mac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String deviceModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isSupportCardiovascular;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isSupport60s;

    public CheckHistoryDeviceBean(@NotNull String mac, @NotNull String deviceModel, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.mac = mac;
        this.deviceModel = deviceModel;
        this.isSupportCardiovascular = z;
        this.isSupport60s = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsSupport60s() {
        return this.isSupport60s;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSupportCardiovascular() {
        return this.isSupportCardiovascular;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckHistoryDeviceBean)) {
            return false;
        }
        CheckHistoryDeviceBean checkHistoryDeviceBean = (CheckHistoryDeviceBean) other;
        return Intrinsics.areEqual(this.mac, checkHistoryDeviceBean.mac) && Intrinsics.areEqual(this.deviceModel, checkHistoryDeviceBean.deviceModel) && this.isSupportCardiovascular == checkHistoryDeviceBean.isSupportCardiovascular && this.isSupport60s == checkHistoryDeviceBean.isSupport60s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.mac.hashCode() * 31) + this.deviceModel.hashCode()) * 31;
        boolean z = this.isSupportCardiovascular;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isSupport60s;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "CheckHistoryDeviceBean(mac=" + this.mac + ", deviceModel=" + this.deviceModel + ", isSupportCardiovascular=" + this.isSupportCardiovascular + ", isSupport60s=" + this.isSupport60s + ")";
    }
}
