package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/LicenseRequest;", "", t04.DEVICE_UNIQUE_ID, "", "model", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceUniqueId", "()Ljava/lang/String;", "getModel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LicenseRequest {

    @NotNull
    private final String deviceUniqueId;

    @NotNull
    private final String model;

    public LicenseRequest(@NotNull String deviceUniqueId, @NotNull String model) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.deviceUniqueId = deviceUniqueId;
        this.model = model;
    }

    public static /* synthetic */ LicenseRequest copy$default(LicenseRequest licenseRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = licenseRequest.deviceUniqueId;
        }
        if ((i & 2) != 0) {
            str2 = licenseRequest.model;
        }
        return licenseRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final LicenseRequest copy(@NotNull String deviceUniqueId, @NotNull String model) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(model, "model");
        return new LicenseRequest(deviceUniqueId, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LicenseRequest)) {
            return false;
        }
        LicenseRequest licenseRequest = (LicenseRequest) other;
        return Intrinsics.areEqual(this.deviceUniqueId, licenseRequest.deviceUniqueId) && Intrinsics.areEqual(this.model, licenseRequest.model);
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (this.deviceUniqueId.hashCode() * 31) + this.model.hashCode();
    }

    @NotNull
    public String toString() {
        return "LicenseRequest(deviceUniqueId=" + this.deviceUniqueId + ", model=" + this.model + ")";
    }
}
