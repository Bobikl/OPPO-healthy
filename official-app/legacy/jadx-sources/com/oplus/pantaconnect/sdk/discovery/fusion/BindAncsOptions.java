package com.oplus.pantaconnect.sdk.discovery.fusion;

import com.oplus.pantaconnect.sdk.DeviceType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/BindAncsOptions;", "", "bluetoothMac", "", "deviceId", "deviceType", "Lcom/oplus/pantaconnect/sdk/DeviceType;", ServiceNodeBundleKeys.DEVICE_NAME, "(Ljava/lang/String;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/DeviceType;Ljava/lang/String;)V", "getBluetoothMac", "()Ljava/lang/String;", "getDeviceId", "getDeviceName", "getDeviceType", "()Lcom/oplus/pantaconnect/sdk/DeviceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BindAncsOptions {

    @NotNull
    private final String bluetoothMac;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceName;

    @NotNull
    private final DeviceType deviceType;

    public BindAncsOptions(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3) {
        this.bluetoothMac = str;
        this.deviceId = str2;
        this.deviceType = deviceType;
        this.deviceName = str3;
    }

    public static /* synthetic */ BindAncsOptions copy$default(BindAncsOptions bindAncsOptions, String str, String str2, DeviceType deviceType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindAncsOptions.bluetoothMac;
        }
        if ((i & 2) != 0) {
            str2 = bindAncsOptions.deviceId;
        }
        if ((i & 4) != 0) {
            deviceType = bindAncsOptions.deviceType;
        }
        if ((i & 8) != 0) {
            str3 = bindAncsOptions.deviceName;
        }
        return bindAncsOptions.copy(str, str2, deviceType, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBluetoothMac() {
        return this.bluetoothMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final BindAncsOptions copy(@NotNull String bluetoothMac, @NotNull String deviceId, @NotNull DeviceType deviceType, @NotNull String deviceName) {
        return new BindAncsOptions(bluetoothMac, deviceId, deviceType, deviceName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindAncsOptions)) {
            return false;
        }
        BindAncsOptions bindAncsOptions = (BindAncsOptions) other;
        return Intrinsics.areEqual(this.bluetoothMac, bindAncsOptions.bluetoothMac) && Intrinsics.areEqual(this.deviceId, bindAncsOptions.deviceId) && this.deviceType == bindAncsOptions.deviceType && Intrinsics.areEqual(this.deviceName, bindAncsOptions.deviceName);
    }

    @NotNull
    public final String getBluetoothMac() {
        return this.bluetoothMac;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.deviceName.hashCode() + ((this.deviceType.hashCode() + ((this.deviceId.hashCode() + (this.bluetoothMac.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BindAncsOptions(bluetoothMac=" + this.bluetoothMac + ", deviceId=" + this.deviceId + ", deviceType=" + this.deviceType + ", deviceName=" + this.deviceName + ')';
    }
}
