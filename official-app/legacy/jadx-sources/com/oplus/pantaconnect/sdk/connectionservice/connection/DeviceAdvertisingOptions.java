package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.oplus.aiunit.vision.hig;
import com.oplus.pantaconnect.sdk.DeviceType;
import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import com.oplus.pantaconnect.sdk.discovery.DiscoveryStrategy;
import java.util.Set;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f¢\u0006\u0002\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\t\u0010/\u001a\u00020\u0016HÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0012HÆ\u0003J\u0087\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010&R\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006@"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceAdvertisingOptions;", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceBaseOption;", "durationMillis", "", "modelId", "", "deviceType", "Lcom/oplus/pantaconnect/sdk/DeviceType;", "connectType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "advertiseType", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseType;", "advertiseMode", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseMode;", CardAction.LIFE_CIRCLE_VALUE_HIDE, "", "isGattSlow", "reconnectType", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ReconnectType;", "reconnectDeviceIdList", "", "discoveryStrategy", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "isOnlyPairConnect", "(JLjava/lang/String;Lcom/oplus/pantaconnect/sdk/DeviceType;Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseType;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseMode;ZZLcom/oplus/pantaconnect/sdk/connectionservice/connection/ReconnectType;Ljava/util/Set;Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;Z)V", "getAdvertiseMode", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseMode;", "getAdvertiseType", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseType;", "getConnectType", "()Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "getDeviceType", "()Lcom/oplus/pantaconnect/sdk/DeviceType;", "getDiscoveryStrategy", "()Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "getDurationMillis", "()J", "getHide", "()Z", "getModelId", "()Ljava/lang/String;", "getReconnectDeviceIdList", "()Ljava/util/Set;", "getReconnectType", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ReconnectType;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeviceAdvertisingOptions implements DeviceBaseOption {

    @NotNull
    private final AdvertiseMode advertiseMode;

    @NotNull
    private final AdvertiseType advertiseType;

    @NotNull
    private final ConnectionType connectType;

    @NotNull
    private final DeviceType deviceType;

    @NotNull
    private final DiscoveryStrategy discoveryStrategy;
    private final long durationMillis;
    private final boolean hide;
    private final boolean isGattSlow;
    private final boolean isOnlyPairConnect;

    @NotNull
    private final String modelId;

    @NotNull
    private final Set<String> reconnectDeviceIdList;

    @NotNull
    private final ReconnectType reconnectType;

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, false, false, null, null, null, false, 4032, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDurationMillis() {
        return this.durationMillis;
    }

    @NotNull
    public final Set<String> component10() {
        return this.reconnectDeviceIdList;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DiscoveryStrategy getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsOnlyPairConnect() {
        return this.isOnlyPairConnect;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ConnectionType getConnectType() {
        return this.connectType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AdvertiseType getAdvertiseType() {
        return this.advertiseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AdvertiseMode getAdvertiseMode() {
        return this.advertiseMode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHide() {
        return this.hide;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsGattSlow() {
        return this.isGattSlow;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ReconnectType getReconnectType() {
        return this.reconnectType;
    }

    @NotNull
    public final DeviceAdvertisingOptions copy(long durationMillis, @NotNull String modelId, @NotNull DeviceType deviceType, @NotNull ConnectionType connectType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean hide, boolean isGattSlow, @NotNull ReconnectType reconnectType, @NotNull Set<String> reconnectDeviceIdList, @NotNull DiscoveryStrategy discoveryStrategy, boolean isOnlyPairConnect) {
        return new DeviceAdvertisingOptions(durationMillis, modelId, deviceType, connectType, advertiseType, advertiseMode, hide, isGattSlow, reconnectType, reconnectDeviceIdList, discoveryStrategy, isOnlyPairConnect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceAdvertisingOptions)) {
            return false;
        }
        DeviceAdvertisingOptions deviceAdvertisingOptions = (DeviceAdvertisingOptions) other;
        return this.durationMillis == deviceAdvertisingOptions.durationMillis && Intrinsics.areEqual(this.modelId, deviceAdvertisingOptions.modelId) && this.deviceType == deviceAdvertisingOptions.deviceType && this.connectType == deviceAdvertisingOptions.connectType && this.advertiseType == deviceAdvertisingOptions.advertiseType && this.advertiseMode == deviceAdvertisingOptions.advertiseMode && this.hide == deviceAdvertisingOptions.hide && this.isGattSlow == deviceAdvertisingOptions.isGattSlow && this.reconnectType == deviceAdvertisingOptions.reconnectType && Intrinsics.areEqual(this.reconnectDeviceIdList, deviceAdvertisingOptions.reconnectDeviceIdList) && this.discoveryStrategy == deviceAdvertisingOptions.discoveryStrategy && this.isOnlyPairConnect == deviceAdvertisingOptions.isOnlyPairConnect;
    }

    @NotNull
    public final AdvertiseMode getAdvertiseMode() {
        return this.advertiseMode;
    }

    @NotNull
    public final AdvertiseType getAdvertiseType() {
        return this.advertiseType;
    }

    @NotNull
    public final ConnectionType getConnectType() {
        return this.connectType;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.connection.DeviceBaseOption
    @NotNull
    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final DiscoveryStrategy getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getHide() {
        return this.hide;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.connection.DeviceBaseOption
    @NotNull
    public String getModelId() {
        return this.modelId;
    }

    @NotNull
    public final Set<String> getReconnectDeviceIdList() {
        return this.reconnectDeviceIdList;
    }

    @NotNull
    public final ReconnectType getReconnectType() {
        return this.reconnectType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOnlyPairConnect) + ((this.discoveryStrategy.hashCode() + ((this.reconnectDeviceIdList.hashCode() + ((this.reconnectType.hashCode() + ((Boolean.hashCode(this.isGattSlow) + ((Boolean.hashCode(this.hide) + ((this.advertiseMode.hashCode() + ((this.advertiseType.hashCode() + ((this.connectType.hashCode() + ((this.deviceType.hashCode() + ((this.modelId.hashCode() + (Long.hashCode(this.durationMillis) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isGattSlow() {
        return this.isGattSlow;
    }

    public final boolean isOnlyPairConnect() {
        return this.isOnlyPairConnect;
    }

    @NotNull
    public String toString() {
        return "DeviceAdvertisingOptions(durationMillis=" + this.durationMillis + ", modelId=" + this.modelId + ", deviceType=" + this.deviceType + ", connectType=" + this.connectType + ", advertiseType=" + this.advertiseType + ", advertiseMode=" + this.advertiseMode + ", hide=" + this.hide + ", isGattSlow=" + this.isGattSlow + ", reconnectType=" + this.reconnectType + ", reconnectDeviceIdList=" + this.reconnectDeviceIdList + ", discoveryStrategy=" + this.discoveryStrategy + ", isOnlyPairConnect=" + this.isOnlyPairConnect + ')';
    }

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean z) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, z, false, null, null, null, false, Utf8.MASK_2BYTES, null);
    }

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean z, boolean z2) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, z, z2, null, null, null, false, 3840, null);
    }

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean z, boolean z2, @NotNull ReconnectType reconnectType) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, z, z2, reconnectType, null, null, false, hig.DEFAULT_PM_START_TIME, null);
    }

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean z, boolean z2, @NotNull ReconnectType reconnectType, @NotNull Set<String> set) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, z, z2, reconnectType, set, null, false, 3072, null);
    }

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean z, boolean z2, @NotNull ReconnectType reconnectType, @NotNull Set<String> set, @NotNull DiscoveryStrategy discoveryStrategy) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, z, z2, reconnectType, set, discoveryStrategy, false, 2048, null);
    }

    @JvmOverloads
    public DeviceAdvertisingOptions(long j2, @NotNull String str, @NotNull DeviceType deviceType, @NotNull ConnectionType connectionType, @NotNull AdvertiseType advertiseType, @NotNull AdvertiseMode advertiseMode, boolean z, boolean z2, @NotNull ReconnectType reconnectType, @NotNull Set<String> set, @NotNull DiscoveryStrategy discoveryStrategy, boolean z3) {
        this.durationMillis = j2;
        this.modelId = str;
        this.deviceType = deviceType;
        this.connectType = connectionType;
        this.advertiseType = advertiseType;
        this.advertiseMode = advertiseMode;
        this.hide = z;
        this.isGattSlow = z2;
        this.reconnectType = reconnectType;
        this.reconnectDeviceIdList = set;
        this.discoveryStrategy = discoveryStrategy;
        this.isOnlyPairConnect = z3;
    }

    public /* synthetic */ DeviceAdvertisingOptions(long j2, String str, DeviceType deviceType, ConnectionType connectionType, AdvertiseType advertiseType, AdvertiseMode advertiseMode, boolean z, boolean z2, ReconnectType reconnectType, Set set, DiscoveryStrategy discoveryStrategy, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, deviceType, connectionType, advertiseType, advertiseMode, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? ReconnectType.SILENT_CUSTOM : reconnectType, (i & 512) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 1024) != 0 ? DiscoveryStrategy.BLE : discoveryStrategy, (i & 2048) != 0 ? false : z3);
    }
}
