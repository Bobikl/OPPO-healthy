package com.oplus.pantaconnect.sdk.connectionservice.connection;

import coconut.jackFruit;
import com.google.protobuf.ByteString;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.pantaconnect.sdk.DeviceType;
import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import com.oplus.pantaconnect.sdk.connection.ConnectionTypeKt;
import com.oplus.pantaconnect.sdk.connection.VLinkType;
import com.oplus.pantaconnect.sdk.connectionservice.SensitiveLogUtils;
import com.oplus.pantaconnect.sdk.discovery.DiscoveryStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\b\u0007\u0012\u0006\u0010@\u001a\u00020\u001e\u0012\b\b\u0002\u0010A\u001a\u00020\u001e\u0012\u0006\u0010B\u001a\u00020#\u0012\b\b\u0002\u0010C\u001a\u00020\u001e\u0012\b\b\u0002\u0010D\u001a\u00020'\u0012\b\b\u0002\u0010E\u001a\u00020*\u0012\b\b\u0002\u0010F\u001a\u00020\u0013\u0012\b\b\u0002\u0010G\u001a\u00020/\u0012\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020302\u0012\b\b\u0002\u0010I\u001a\u00020/\u0012\b\b\u0002\u0010J\u001a\u00020\u001e\u0012\b\b\u0002\u0010K\u001a\u000208\u0012\b\b\u0002\u0010L\u001a\u00020\u001e\u0012\b\b\u0002\u0010M\u001a\u00020<\u0012\b\b\u0002\u0010N\u001a\u00020\u001e¢\u0006\u0004\bl\u0010mJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010$\u001a\u00020#HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010(\u001a\u00020'HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÆ\u0003¢\u0006\u0004\b0\u00101J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020302HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020/HÆ\u0003¢\u0006\u0004\b6\u00101J\u0010\u00107\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b7\u0010 J\u0010\u00109\u001a\u000208HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b;\u0010 J\u0010\u0010=\u001a\u00020<HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b?\u0010 J¬\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010@\u001a\u00020\u001e2\b\b\u0002\u0010A\u001a\u00020\u001e2\b\b\u0002\u0010B\u001a\u00020#2\b\b\u0002\u0010C\u001a\u00020\u001e2\b\b\u0002\u0010D\u001a\u00020'2\b\b\u0002\u0010E\u001a\u00020*2\b\b\u0002\u0010F\u001a\u00020\u00132\b\b\u0002\u0010G\u001a\u00020/2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u000203022\b\b\u0002\u0010I\u001a\u00020/2\b\b\u0002\u0010J\u001a\u00020\u001e2\b\b\u0002\u0010K\u001a\u0002082\b\b\u0002\u0010L\u001a\u00020\u001e2\b\b\u0002\u0010M\u001a\u00020<2\b\b\u0002\u0010N\u001a\u00020\u001eHÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020/HÖ\u0001¢\u0006\u0004\bQ\u00101J\u001a\u0010S\u001a\u00020\u00132\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bS\u0010TR\u0017\u0010@\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b@\u0010U\u001a\u0004\bV\u0010 R\u0017\u0010A\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bA\u0010U\u001a\u0004\bW\u0010 R\u0017\u0010B\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bB\u0010X\u001a\u0004\bY\u0010%R\u0017\u0010C\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bC\u0010U\u001a\u0004\bZ\u0010 R\u0017\u0010D\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bD\u0010[\u001a\u0004\b\\\u0010)R\u0017\u0010E\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bE\u0010]\u001a\u0004\b^\u0010,R\u0017\u0010F\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010_\u001a\u0004\bF\u0010.R\u0017\u0010G\u001a\u00020/8\u0006¢\u0006\f\n\u0004\bG\u0010`\u001a\u0004\ba\u00101R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u000203028\u0006¢\u0006\f\n\u0004\bH\u0010b\u001a\u0004\bc\u00105R\u0017\u0010I\u001a\u00020/8\u0006¢\u0006\f\n\u0004\bI\u0010`\u001a\u0004\bd\u00101R\u0017\u0010J\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bJ\u0010U\u001a\u0004\be\u0010 R\u0017\u0010K\u001a\u0002088\u0006¢\u0006\f\n\u0004\bK\u0010f\u001a\u0004\bg\u0010:R\u0017\u0010L\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bL\u0010U\u001a\u0004\bh\u0010 R\u0017\u0010M\u001a\u00020<8\u0006¢\u0006\f\n\u0004\bM\u0010i\u001a\u0004\bj\u0010>R\u0017\u0010N\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bN\u0010U\u001a\u0004\bk\u0010 ¨\u0006n"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", "", "Lcoconut/jackFruit;", "toParams", "()Lcoconut/jackFruit;", "", "toByteArray", "()[B", "Lcom/google/protobuf/ByteString;", "toByteString", "()Lcom/google/protobuf/ByteString;", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectOptions;", "options", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectionCallback;", "callback", "", "requestConnection", "(Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectOptions;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectionCallback;)V", "Ljava/util/concurrent/CompletableFuture;", "", "closeConnection", "(Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectOptions;)Ljava/util/concurrent/CompletableFuture;", "cancelConnection", "()Ljava/util/concurrent/CompletableFuture;", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/PairAction;", "pairAction", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ConfirmType;", "confirmType", "confirmConnection", "(Lcom/oplus/pantaconnect/sdk/connectionservice/connection/PairAction;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ConfirmType;)V", "", "toString", "()Ljava/lang/String;", "component1", "component2", "Lcom/oplus/pantaconnect/sdk/DeviceType;", "component3", "()Lcom/oplus/pantaconnect/sdk/DeviceType;", "component4", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;", "component5", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;", "component6", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;", "component7", "()Z", "", "component8", "()I", "", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "component9", "()Ljava/util/List;", "component10", "component11", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "component12", "()Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "component13", "Lcom/oplus/pantaconnect/sdk/connection/VLinkType;", "component14", "()Lcom/oplus/pantaconnect/sdk/connection/VLinkType;", "component15", "protocolDeviceId", "tempId", "deviceType", "displayName", "deviceState", "accountState", "isSenselessSwitchOn", LogSenderConst.PROTOCOLVERSION, "connectedTypes", "ability", "modelId", "discoveryStrategy", "deviceIp", "vLinkType", "usedLocalIp", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/DeviceType;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;ZILjava/util/List;ILjava/lang/String;Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/connection/VLinkType;Ljava/lang/String;)Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProtocolDeviceId", "getTempId", "Lcom/oplus/pantaconnect/sdk/DeviceType;", "getDeviceType", "getDisplayName", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;", "getDeviceState", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;", "getAccountState", "Z", "I", "getProtocolVersion", "Ljava/util/List;", "getConnectedTypes", "getAbility", "getModelId", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "getDiscoveryStrategy", "getDeviceIp", "Lcom/oplus/pantaconnect/sdk/connection/VLinkType;", "getVLinkType", "getUsedLocalIp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/DeviceType;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceState;Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;ZILjava/util/List;ILjava/lang/String;Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/connection/VLinkType;Ljava/lang/String;)V", "connectionservice_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDisplayDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayDevice.kt\ncom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1549#2:131\n1620#2,3:132\n*S KotlinDebug\n*F\n+ 1 DisplayDevice.kt\ncom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice\n*L\n109#1:131\n109#1:132,3\n*E\n"})
public final /* data */ class DisplayDevice {
    private final int ability;

    @NotNull
    private final AccountState accountState;

    @NotNull
    private final List<ConnectionType> connectedTypes;

    @NotNull
    private final String deviceIp;

    @NotNull
    private final DeviceState deviceState;

    @NotNull
    private final DeviceType deviceType;

    @NotNull
    private final DiscoveryStrategy discoveryStrategy;

    @NotNull
    private final String displayName;
    private final boolean isSenselessSwitchOn;

    @NotNull
    private final String modelId;

    @NotNull
    private final String protocolDeviceId;
    private final int protocolVersion;

    @NotNull
    private final String tempId;

    @NotNull
    private final String usedLocalIp;

    @NotNull
    private final VLinkType vLinkType;

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull DeviceType deviceType) {
        this(str, null, deviceType, null, null, null, false, 0, null, 0, null, null, null, null, null, 32762, null);
    }

    public static /* synthetic */ void confirmConnection$default(DisplayDevice displayDevice, PairAction pairAction, ConfirmType confirmType, int i, Object obj) {
        if ((i & 2) != 0) {
            confirmType = ConfirmType.CONFIRM_FOR_ADVERTISE;
        }
        displayDevice.confirmConnection(pairAction, confirmType);
    }

    private final jackFruit toParams() {
        List<ConnectionType> list = this.connectedTypes;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(ConnectionTypeKt.toConnectType((ConnectionType) it.next()).getNumber()));
        }
        return jackFruit.h.toBuilder().jackFruit(ConnectionServiceClientsImplKt.major(this.deviceType)).prunes(this.modelId).blueberry(this.protocolDeviceId).jackFruit(this.displayName).cranberry(this.tempId).coconut(DeviceStateKt.toBufferType(this.deviceState)).coconut(AccountStateKt.toBufferType(this.accountState)).coconut(this.isSenselessSwitchOn).prunes(this.protocolVersion).coconut(arrayList).coconut(this.ability).coconut(ConnectionServiceClientsImplKt.toInternalGlobalDiscoveryStrategy(this.discoveryStrategy)).coconut(this.deviceIp).blueberry(this.vLinkType.getType()).raspberry(this.usedLocalIp).build();
    }

    @NotNull
    public final CompletableFuture<Boolean> cancelConnection() {
        return ConnectionService.INSTANCE.create().cancelConnection(this);
    }

    @NotNull
    public final CompletableFuture<Boolean> closeConnection(@NotNull GlobalDeviceConnectOptions options) {
        return ConnectionService.INSTANCE.create().closeConnection(this, options);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProtocolDeviceId() {
        return this.protocolDeviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAbility() {
        return this.ability;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DiscoveryStrategy getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDeviceIp() {
        return this.deviceIp;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final VLinkType getVLinkType() {
        return this.vLinkType;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUsedLocalIp() {
        return this.usedLocalIp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTempId() {
        return this.tempId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DeviceState getDeviceState() {
        return this.deviceState;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AccountState getAccountState() {
        return this.accountState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSenselessSwitchOn() {
        return this.isSenselessSwitchOn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final List<ConnectionType> component9() {
        return this.connectedTypes;
    }

    public final void confirmConnection(@NotNull PairAction pairAction, @NotNull ConfirmType confirmType) {
        ConnectionService.INSTANCE.create().confirmConnection(this, pairAction, confirmType);
    }

    @NotNull
    public final DisplayDevice copy(@NotNull String protocolDeviceId, @NotNull String tempId, @NotNull DeviceType deviceType, @NotNull String displayName, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean isSenselessSwitchOn, int protocolVersion, @NotNull List<? extends ConnectionType> connectedTypes, int ability, @NotNull String modelId, @NotNull DiscoveryStrategy discoveryStrategy, @NotNull String deviceIp, @NotNull VLinkType vLinkType, @NotNull String usedLocalIp) {
        return new DisplayDevice(protocolDeviceId, tempId, deviceType, displayName, deviceState, accountState, isSenselessSwitchOn, protocolVersion, connectedTypes, ability, modelId, discoveryStrategy, deviceIp, vLinkType, usedLocalIp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayDevice)) {
            return false;
        }
        DisplayDevice displayDevice = (DisplayDevice) other;
        return Intrinsics.areEqual(this.protocolDeviceId, displayDevice.protocolDeviceId) && Intrinsics.areEqual(this.tempId, displayDevice.tempId) && this.deviceType == displayDevice.deviceType && Intrinsics.areEqual(this.displayName, displayDevice.displayName) && this.deviceState == displayDevice.deviceState && this.accountState == displayDevice.accountState && this.isSenselessSwitchOn == displayDevice.isSenselessSwitchOn && this.protocolVersion == displayDevice.protocolVersion && Intrinsics.areEqual(this.connectedTypes, displayDevice.connectedTypes) && this.ability == displayDevice.ability && Intrinsics.areEqual(this.modelId, displayDevice.modelId) && this.discoveryStrategy == displayDevice.discoveryStrategy && Intrinsics.areEqual(this.deviceIp, displayDevice.deviceIp) && this.vLinkType == displayDevice.vLinkType && Intrinsics.areEqual(this.usedLocalIp, displayDevice.usedLocalIp);
    }

    public final int getAbility() {
        return this.ability;
    }

    @NotNull
    public final AccountState getAccountState() {
        return this.accountState;
    }

    @NotNull
    public final List<ConnectionType> getConnectedTypes() {
        return this.connectedTypes;
    }

    @NotNull
    public final String getDeviceIp() {
        return this.deviceIp;
    }

    @NotNull
    public final DeviceState getDeviceState() {
        return this.deviceState;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final DiscoveryStrategy getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getModelId() {
        return this.modelId;
    }

    @NotNull
    public final String getProtocolDeviceId() {
        return this.protocolDeviceId;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final String getTempId() {
        return this.tempId;
    }

    @NotNull
    public final String getUsedLocalIp() {
        return this.usedLocalIp;
    }

    @NotNull
    public final VLinkType getVLinkType() {
        return this.vLinkType;
    }

    public int hashCode() {
        return this.usedLocalIp.hashCode() + ((this.vLinkType.hashCode() + ((this.deviceIp.hashCode() + ((this.discoveryStrategy.hashCode() + ((this.modelId.hashCode() + ((Integer.hashCode(this.ability) + ((this.connectedTypes.hashCode() + ((Integer.hashCode(this.protocolVersion) + ((Boolean.hashCode(this.isSenselessSwitchOn) + ((this.accountState.hashCode() + ((this.deviceState.hashCode() + ((this.displayName.hashCode() + ((this.deviceType.hashCode() + ((this.tempId.hashCode() + (this.protocolDeviceId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isSenselessSwitchOn() {
        return this.isSenselessSwitchOn;
    }

    public final void requestConnection(@NotNull GlobalDeviceConnectOptions options, @NotNull GlobalDeviceConnectionCallback callback) {
        ConnectionService.INSTANCE.create().requestConnection(this, options, callback);
    }

    @NotNull
    public final byte[] toByteArray() {
        return toParams().toByteArray();
    }

    @NotNull
    public final ByteString toByteString() {
        return toParams().toByteString();
    }

    @NotNull
    public String toString() {
        return "DisplayDevice(tempId=" + SensitiveLogUtils.toHidden$connectionservice_release(this.tempId) + ", dvd=" + SensitiveLogUtils.toHidden$connectionservice_release(this.protocolDeviceId) + ", deviceType=" + this.deviceType + ", modelId=" + SensitiveLogUtils.toHidden$connectionservice_release(this.modelId) + ", displayName=" + SensitiveLogUtils.toHidden$connectionservice_release(this.displayName) + ", deviceState=" + this.deviceState + ", accountState=" + this.accountState + ", isSenselessSwitchOn=" + this.isSenselessSwitchOn + ", connectState=" + this.connectedTypes + ", protocolVersion=" + this.protocolVersion + ", ability=" + this.ability + ", discoveryStrategy=" + this.discoveryStrategy + "deviceIp=" + SensitiveLogUtils.toHidden$connectionservice_release(this.deviceIp) + ",vLinkType=" + this.vLinkType + ", usedLocalIp=" + SensitiveLogUtils.toHidden$connectionservice_release(this.usedLocalIp) + ')';
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType) {
        this(str, str2, deviceType, null, null, null, false, 0, null, 0, null, null, null, null, null, 32760, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3) {
        this(str, str2, deviceType, str3, null, null, false, 0, null, 0, null, null, null, null, null, 32752, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState) {
        this(str, str2, deviceType, str3, deviceState, null, false, 0, null, 0, null, null, null, null, null, 32736, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState) {
        this(str, str2, deviceType, str3, deviceState, accountState, false, 0, null, 0, null, null, null, null, null, 32704, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, 0, null, 0, null, null, null, null, null, 32640, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, null, 0, null, null, null, null, null, 32512, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, list, 0, null, null, null, null, null, 32256, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list, int i2) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, list, i2, null, null, null, null, null, 31744, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list, int i2, @NotNull String str4) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, list, i2, str4, null, null, null, null, 30720, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list, int i2, @NotNull String str4, @NotNull DiscoveryStrategy discoveryStrategy) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, list, i2, str4, discoveryStrategy, null, null, null, 28672, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list, int i2, @NotNull String str4, @NotNull DiscoveryStrategy discoveryStrategy, @NotNull String str5) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, list, i2, str4, discoveryStrategy, str5, null, null, 24576, null);
    }

    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list, int i2, @NotNull String str4, @NotNull DiscoveryStrategy discoveryStrategy, @NotNull String str5, @NotNull VLinkType vLinkType) {
        this(str, str2, deviceType, str3, deviceState, accountState, z, i, list, i2, str4, discoveryStrategy, str5, vLinkType, null, 16384, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DisplayDevice(@NotNull String str, @NotNull String str2, @NotNull DeviceType deviceType, @NotNull String str3, @NotNull DeviceState deviceState, @NotNull AccountState accountState, boolean z, int i, @NotNull List<? extends ConnectionType> list, int i2, @NotNull String str4, @NotNull DiscoveryStrategy discoveryStrategy, @NotNull String str5, @NotNull VLinkType vLinkType, @NotNull String str6) {
        this.protocolDeviceId = str;
        this.tempId = str2;
        this.deviceType = deviceType;
        this.displayName = str3;
        this.deviceState = deviceState;
        this.accountState = accountState;
        this.isSenselessSwitchOn = z;
        this.protocolVersion = i;
        this.connectedTypes = list;
        this.ability = i2;
        this.modelId = str4;
        this.discoveryStrategy = discoveryStrategy;
        this.deviceIp = str5;
        this.vLinkType = vLinkType;
        this.usedLocalIp = str6;
    }

    public /* synthetic */ DisplayDevice(String str, String str2, DeviceType deviceType, String str3, DeviceState deviceState, AccountState accountState, boolean z, int i, List list, int i2, String str4, DiscoveryStrategy discoveryStrategy, String str5, VLinkType vLinkType, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "" : str2, deviceType, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? DeviceState.DISCOVERED : deviceState, (i3 & 32) != 0 ? AccountState.SAME_ACCOUNT : accountState, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? DiscoveryStrategy.BLE : discoveryStrategy, (i3 & 4096) != 0 ? "" : str5, (i3 & 8192) != 0 ? VLinkType.UNKNOWN : vLinkType, (i3 & 16384) != 0 ? "" : str6);
    }
}
