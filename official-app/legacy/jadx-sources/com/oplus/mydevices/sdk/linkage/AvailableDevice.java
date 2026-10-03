package com.oplus.mydevices.sdk.linkage;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/oplus/mydevices/sdk/linkage/AvailableDevice;", "", "hostDeviceId", "", "mac", "multiConnect", "", "peerDevice", "Lcom/oplus/mydevices/sdk/linkage/PeerDevice;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/oplus/mydevices/sdk/linkage/PeerDevice;)V", "getHostDeviceId", "()Ljava/lang/String;", "getMac", "getMultiConnect", "()Z", "getPeerDevice", "()Lcom/oplus/mydevices/sdk/linkage/PeerDevice;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AvailableDevice {

    @NotNull
    private final String hostDeviceId;

    @NotNull
    private final String mac;
    private final boolean multiConnect;

    @NotNull
    private final PeerDevice peerDevice;

    public AvailableDevice(@NotNull String hostDeviceId, @NotNull String mac, boolean z, @NotNull PeerDevice peerDevice) {
        Intrinsics.checkNotNullParameter(hostDeviceId, "hostDeviceId");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(peerDevice, "peerDevice");
        this.hostDeviceId = hostDeviceId;
        this.mac = mac;
        this.multiConnect = z;
        this.peerDevice = peerDevice;
    }

    public static /* synthetic */ AvailableDevice copy$default(AvailableDevice availableDevice, String str, String str2, boolean z, PeerDevice peerDevice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableDevice.hostDeviceId;
        }
        if ((i & 2) != 0) {
            str2 = availableDevice.mac;
        }
        if ((i & 4) != 0) {
            z = availableDevice.multiConnect;
        }
        if ((i & 8) != 0) {
            peerDevice = availableDevice.peerDevice;
        }
        return availableDevice.copy(str, str2, z, peerDevice);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHostDeviceId() {
        return this.hostDeviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMultiConnect() {
        return this.multiConnect;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PeerDevice getPeerDevice() {
        return this.peerDevice;
    }

    @NotNull
    public final AvailableDevice copy(@NotNull String hostDeviceId, @NotNull String mac, boolean multiConnect, @NotNull PeerDevice peerDevice) {
        Intrinsics.checkNotNullParameter(hostDeviceId, "hostDeviceId");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(peerDevice, "peerDevice");
        return new AvailableDevice(hostDeviceId, mac, multiConnect, peerDevice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableDevice)) {
            return false;
        }
        AvailableDevice availableDevice = (AvailableDevice) other;
        return Intrinsics.areEqual(this.hostDeviceId, availableDevice.hostDeviceId) && Intrinsics.areEqual(this.mac, availableDevice.mac) && this.multiConnect == availableDevice.multiConnect && Intrinsics.areEqual(this.peerDevice, availableDevice.peerDevice);
    }

    @NotNull
    public final String getHostDeviceId() {
        return this.hostDeviceId;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    public final boolean getMultiConnect() {
        return this.multiConnect;
    }

    @NotNull
    public final PeerDevice getPeerDevice() {
        return this.peerDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public int hashCode() {
        String str = this.hostDeviceId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mac;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.multiConnect;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        PeerDevice peerDevice = this.peerDevice;
        return i + (peerDevice != null ? peerDevice.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AvailableDevice(hostDeviceId=" + this.hostDeviceId + ", mac=" + this.mac + ", multiConnect=" + this.multiConnect + ", peerDevice=" + this.peerDevice + ")";
    }
}
