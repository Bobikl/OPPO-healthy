package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/esim/nec/bean/PrimaryDevice;", "", "MSISND", "", "IMSI", "DeviceID", "Lcom/heytap/health/esim/nec/bean/DeviceID;", "ServStatus", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/nec/bean/DeviceID;Ljava/lang/String;)V", "getDeviceID", "()Lcom/heytap/health/esim/nec/bean/DeviceID;", "getIMSI", "()Ljava/lang/String;", "getMSISND", "getServStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PrimaryDevice {
    public static final int $stable = 0;

    @NotNull
    private final DeviceID DeviceID;

    @NotNull
    private final String IMSI;

    @NotNull
    private final String MSISND;

    @NotNull
    private final String ServStatus;

    public PrimaryDevice(@NotNull String MSISND, @NotNull String IMSI, @NotNull DeviceID DeviceID, @NotNull String ServStatus) {
        Intrinsics.checkNotNullParameter(MSISND, "MSISND");
        Intrinsics.checkNotNullParameter(IMSI, "IMSI");
        Intrinsics.checkNotNullParameter(DeviceID, "DeviceID");
        Intrinsics.checkNotNullParameter(ServStatus, "ServStatus");
        this.MSISND = MSISND;
        this.IMSI = IMSI;
        this.DeviceID = DeviceID;
        this.ServStatus = ServStatus;
    }

    public static /* synthetic */ PrimaryDevice copy$default(PrimaryDevice primaryDevice, String str, String str2, DeviceID deviceID, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryDevice.MSISND;
        }
        if ((i & 2) != 0) {
            str2 = primaryDevice.IMSI;
        }
        if ((i & 4) != 0) {
            deviceID = primaryDevice.DeviceID;
        }
        if ((i & 8) != 0) {
            str3 = primaryDevice.ServStatus;
        }
        return primaryDevice.copy(str, str2, deviceID, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMSISND() {
        return this.MSISND;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIMSI() {
        return this.IMSI;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceID getDeviceID() {
        return this.DeviceID;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServStatus() {
        return this.ServStatus;
    }

    @NotNull
    public final PrimaryDevice copy(@NotNull String MSISND, @NotNull String IMSI, @NotNull DeviceID DeviceID, @NotNull String ServStatus) {
        Intrinsics.checkNotNullParameter(MSISND, "MSISND");
        Intrinsics.checkNotNullParameter(IMSI, "IMSI");
        Intrinsics.checkNotNullParameter(DeviceID, "DeviceID");
        Intrinsics.checkNotNullParameter(ServStatus, "ServStatus");
        return new PrimaryDevice(MSISND, IMSI, DeviceID, ServStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryDevice)) {
            return false;
        }
        PrimaryDevice primaryDevice = (PrimaryDevice) other;
        return Intrinsics.areEqual(this.MSISND, primaryDevice.MSISND) && Intrinsics.areEqual(this.IMSI, primaryDevice.IMSI) && Intrinsics.areEqual(this.DeviceID, primaryDevice.DeviceID) && Intrinsics.areEqual(this.ServStatus, primaryDevice.ServStatus);
    }

    @NotNull
    public final DeviceID getDeviceID() {
        return this.DeviceID;
    }

    @NotNull
    public final String getIMSI() {
        return this.IMSI;
    }

    @NotNull
    public final String getMSISND() {
        return this.MSISND;
    }

    @NotNull
    public final String getServStatus() {
        return this.ServStatus;
    }

    public int hashCode() {
        return (((((this.MSISND.hashCode() * 31) + this.IMSI.hashCode()) * 31) + this.DeviceID.hashCode()) * 31) + this.ServStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrimaryDevice(MSISND=" + this.MSISND + ", IMSI=" + this.IMSI + ", DeviceID=" + this.DeviceID + ", ServStatus=" + this.ServStatus + ")";
    }
}
