package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import com.oplus.pantaconnect.sdk.connection.VLinkType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectionInfo;", "", "connectionType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "channelType", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ChannelType;", "address", "", "ip", "ssid", "vLinkType", "Lcom/oplus/pantaconnect/sdk/connection/VLinkType;", "(Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ChannelType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/connection/VLinkType;)V", "getAddress", "()Ljava/lang/String;", "getChannelType", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ChannelType;", "getConnectionType", "()Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "getIp", "getSsid", "getVLinkType", "()Lcom/oplus/pantaconnect/sdk/connection/VLinkType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GlobalDeviceConnectionInfo {

    @Nullable
    private final String address;

    @NotNull
    private final ChannelType channelType;

    @NotNull
    private final ConnectionType connectionType;

    @Nullable
    private final String ip;

    @Nullable
    private final String ssid;

    @NotNull
    private final VLinkType vLinkType;

    @JvmOverloads
    public GlobalDeviceConnectionInfo(@NotNull ConnectionType connectionType, @NotNull ChannelType channelType, @NotNull VLinkType vLinkType) {
        this(connectionType, channelType, null, null, null, vLinkType, 28, null);
    }

    public static /* synthetic */ GlobalDeviceConnectionInfo copy$default(GlobalDeviceConnectionInfo globalDeviceConnectionInfo, ConnectionType connectionType, ChannelType channelType, String str, String str2, String str3, VLinkType vLinkType, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionType = globalDeviceConnectionInfo.connectionType;
        }
        if ((i & 2) != 0) {
            channelType = globalDeviceConnectionInfo.channelType;
        }
        ChannelType channelType2 = channelType;
        if ((i & 4) != 0) {
            str = globalDeviceConnectionInfo.address;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = globalDeviceConnectionInfo.ip;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = globalDeviceConnectionInfo.ssid;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            vLinkType = globalDeviceConnectionInfo.vLinkType;
        }
        return globalDeviceConnectionInfo.copy(connectionType, channelType2, str4, str5, str6, vLinkType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChannelType getChannelType() {
        return this.channelType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VLinkType getVLinkType() {
        return this.vLinkType;
    }

    @NotNull
    public final GlobalDeviceConnectionInfo copy(@NotNull ConnectionType connectionType, @NotNull ChannelType channelType, @Nullable String address, @Nullable String ip, @Nullable String ssid, @NotNull VLinkType vLinkType) {
        return new GlobalDeviceConnectionInfo(connectionType, channelType, address, ip, ssid, vLinkType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalDeviceConnectionInfo)) {
            return false;
        }
        GlobalDeviceConnectionInfo globalDeviceConnectionInfo = (GlobalDeviceConnectionInfo) other;
        return this.connectionType == globalDeviceConnectionInfo.connectionType && this.channelType == globalDeviceConnectionInfo.channelType && Intrinsics.areEqual(this.address, globalDeviceConnectionInfo.address) && Intrinsics.areEqual(this.ip, globalDeviceConnectionInfo.ip) && Intrinsics.areEqual(this.ssid, globalDeviceConnectionInfo.ssid) && this.vLinkType == globalDeviceConnectionInfo.vLinkType;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final ChannelType getChannelType() {
        return this.channelType;
    }

    @NotNull
    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    public final VLinkType getVLinkType() {
        return this.vLinkType;
    }

    public int hashCode() {
        int iHashCode = (this.channelType.hashCode() + (this.connectionType.hashCode() * 31)) * 31;
        String str = this.address;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ip;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ssid;
        return this.vLinkType.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "GlobalDeviceConnectionInfo(connectionType=" + this.connectionType + ", channelType=" + this.channelType + ", address=" + this.address + ", ip=" + this.ip + ", ssid=" + this.ssid + ", vLinkType=" + this.vLinkType + ')';
    }

    @JvmOverloads
    public GlobalDeviceConnectionInfo(@NotNull ConnectionType connectionType, @NotNull ChannelType channelType, @Nullable String str, @NotNull VLinkType vLinkType) {
        this(connectionType, channelType, str, null, null, vLinkType, 24, null);
    }

    @JvmOverloads
    public GlobalDeviceConnectionInfo(@NotNull ConnectionType connectionType, @NotNull ChannelType channelType, @Nullable String str, @Nullable String str2, @NotNull VLinkType vLinkType) {
        this(connectionType, channelType, str, str2, null, vLinkType, 16, null);
    }

    @JvmOverloads
    public GlobalDeviceConnectionInfo(@NotNull ConnectionType connectionType, @NotNull ChannelType channelType, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull VLinkType vLinkType) {
        this.connectionType = connectionType;
        this.channelType = channelType;
        this.address = str;
        this.ip = str2;
        this.ssid = str3;
        this.vLinkType = vLinkType;
    }

    public /* synthetic */ GlobalDeviceConnectionInfo(ConnectionType connectionType, ChannelType channelType, String str, String str2, String str3, VLinkType vLinkType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectionType, channelType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, vLinkType);
    }
}
