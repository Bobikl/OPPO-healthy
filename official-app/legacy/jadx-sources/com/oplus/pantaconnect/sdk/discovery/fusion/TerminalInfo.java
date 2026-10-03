package com.oplus.pantaconnect.sdk.discovery.fusion;

import com.oplus.pantaconnect.sdk.DeviceType;
import com.oplus.pantaconnect.sdk.ext.ByteArrayExtKt;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/TerminalInfo;", "", "deviceId", "", ServiceNodeBundleKeys.DEVICE_NAME, "deviceType", "Lcom/oplus/pantaconnect/sdk/DeviceType;", ServiceNodeBundleKeys.CONNECT_STATE, "", ServiceNodeBundleKeys.IDENTITY, "Lcom/oplus/pantaconnect/sdk/discovery/fusion/Identity;", ServiceNodeBundleKeys.DEVICE_ADDRESS, ServiceNodeBundleKeys.RSSI, "(Ljava/lang/String;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/DeviceType;[BLcom/oplus/pantaconnect/sdk/discovery/fusion/Identity;Ljava/lang/String;Ljava/lang/String;)V", "getConnectState", "()[B", "getDeviceAddress", "()Ljava/lang/String;", "getDeviceId", "getDeviceName", "getDeviceType", "()Lcom/oplus/pantaconnect/sdk/DeviceType;", "getIdentity", "()Lcom/oplus/pantaconnect/sdk/discovery/fusion/Identity;", "getRssi", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TerminalInfo {

    @NotNull
    private final byte[] connectState;

    @NotNull
    private final String deviceAddress;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceName;

    @NotNull
    private final DeviceType deviceType;

    @Nullable
    private final Identity identity;

    @NotNull
    private final String rssi;

    public TerminalInfo(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull byte[] bArr, @Nullable Identity identity, @NotNull String str3, @NotNull String str4) {
        this.deviceId = str;
        this.deviceName = str2;
        this.deviceType = deviceType;
        this.connectState = bArr;
        this.identity = identity;
        this.deviceAddress = str3;
        this.rssi = str4;
    }

    public static /* synthetic */ TerminalInfo copy$default(TerminalInfo terminalInfo, String str, String str2, DeviceType deviceType, byte[] bArr, Identity identity, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = terminalInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = terminalInfo.deviceName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            deviceType = terminalInfo.deviceType;
        }
        DeviceType deviceType2 = deviceType;
        if ((i & 8) != 0) {
            bArr = terminalInfo.connectState;
        }
        byte[] bArr2 = bArr;
        if ((i & 16) != 0) {
            identity = terminalInfo.identity;
        }
        Identity identity2 = identity;
        if ((i & 32) != 0) {
            str3 = terminalInfo.deviceAddress;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = terminalInfo.rssi;
        }
        return terminalInfo.copy(str, str5, deviceType2, bArr2, identity2, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getConnectState() {
        return this.connectState;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Identity getIdentity() {
        return this.identity;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRssi() {
        return this.rssi;
    }

    @NotNull
    public final TerminalInfo copy(@NotNull String deviceId, @NotNull String deviceName, @NotNull DeviceType deviceType, @NotNull byte[] connectState, @Nullable Identity identity, @NotNull String deviceAddress, @NotNull String rssi) {
        return new TerminalInfo(deviceId, deviceName, deviceType, connectState, identity, deviceAddress, rssi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TerminalInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.pantaconnect.sdk.discovery.fusion.TerminalInfo");
        TerminalInfo terminalInfo = (TerminalInfo) other;
        return Intrinsics.areEqual(this.deviceId, terminalInfo.deviceId) && Intrinsics.areEqual(this.deviceName, terminalInfo.deviceName) && this.deviceType == terminalInfo.deviceType && Arrays.equals(this.connectState, terminalInfo.connectState) && Intrinsics.areEqual(this.identity, terminalInfo.identity) && Intrinsics.areEqual(this.deviceAddress, terminalInfo.deviceAddress) && Intrinsics.areEqual(this.rssi, terminalInfo.rssi);
    }

    @NotNull
    public final byte[] getConnectState() {
        return this.connectState;
    }

    @NotNull
    public final String getDeviceAddress() {
        return this.deviceAddress;
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

    @Nullable
    public final Identity getIdentity() {
        return this.identity;
    }

    @NotNull
    public final String getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.connectState) + ((this.deviceType.hashCode() + ((this.deviceName.hashCode() + (this.deviceId.hashCode() * 31)) * 31)) * 31)) * 31;
        Identity identity = this.identity;
        return this.rssi.hashCode() + ((this.deviceAddress.hashCode() + ((iHashCode + (identity != null ? identity.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TerminalInfo(deviceId='" + ByteArrayExtKt.sensitive(this.deviceId) + "', deviceName='" + ByteArrayExtKt.sensitive(this.deviceName) + "', deviceType=" + this.deviceType + ",  deviceAddress='" + ByteArrayExtKt.sensitive(this.deviceAddress) + "', rssi='" + this.rssi + "')";
    }
}
