package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.oplus.pantaconnect.sdk.DeviceType;
import com.oplus.pantaconnect.sdk.discovery.DiscoveryStrategy;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DeviceDiscoveryOptions;", "", "durationMillis", "", "scanMode", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ScanMode;", "deviceTypes", "", "Lcom/oplus/pantaconnect/sdk/DeviceType;", "discoveryStrategy", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "(JLcom/oplus/pantaconnect/sdk/connectionservice/connection/ScanMode;Ljava/util/Set;Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;)V", "getDeviceTypes", "()Ljava/util/Set;", "getDiscoveryStrategy", "()Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "getDurationMillis", "()J", "getScanMode", "()Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ScanMode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeviceDiscoveryOptions {

    @NotNull
    private final Set<DeviceType> deviceTypes;

    @NotNull
    private final DiscoveryStrategy discoveryStrategy;
    private final long durationMillis;

    @NotNull
    private final ScanMode scanMode;

    @JvmOverloads
    public DeviceDiscoveryOptions(long j2, @NotNull ScanMode scanMode, @NotNull Set<? extends DeviceType> set) {
        this(j2, scanMode, set, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceDiscoveryOptions copy$default(DeviceDiscoveryOptions deviceDiscoveryOptions, long j2, ScanMode scanMode, Set set, DiscoveryStrategy discoveryStrategy, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = deviceDiscoveryOptions.durationMillis;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            scanMode = deviceDiscoveryOptions.scanMode;
        }
        ScanMode scanMode2 = scanMode;
        if ((i & 4) != 0) {
            set = deviceDiscoveryOptions.deviceTypes;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            discoveryStrategy = deviceDiscoveryOptions.discoveryStrategy;
        }
        return deviceDiscoveryOptions.copy(j3, scanMode2, set2, discoveryStrategy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDurationMillis() {
        return this.durationMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScanMode getScanMode() {
        return this.scanMode;
    }

    @NotNull
    public final Set<DeviceType> component3() {
        return this.deviceTypes;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DiscoveryStrategy getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    @NotNull
    public final DeviceDiscoveryOptions copy(long durationMillis, @NotNull ScanMode scanMode, @NotNull Set<? extends DeviceType> deviceTypes, @NotNull DiscoveryStrategy discoveryStrategy) {
        return new DeviceDiscoveryOptions(durationMillis, scanMode, deviceTypes, discoveryStrategy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDiscoveryOptions)) {
            return false;
        }
        DeviceDiscoveryOptions deviceDiscoveryOptions = (DeviceDiscoveryOptions) other;
        return this.durationMillis == deviceDiscoveryOptions.durationMillis && this.scanMode == deviceDiscoveryOptions.scanMode && Intrinsics.areEqual(this.deviceTypes, deviceDiscoveryOptions.deviceTypes) && this.discoveryStrategy == deviceDiscoveryOptions.discoveryStrategy;
    }

    @NotNull
    public final Set<DeviceType> getDeviceTypes() {
        return this.deviceTypes;
    }

    @NotNull
    public final DiscoveryStrategy getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    @NotNull
    public final ScanMode getScanMode() {
        return this.scanMode;
    }

    public int hashCode() {
        return this.discoveryStrategy.hashCode() + ((this.deviceTypes.hashCode() + ((this.scanMode.hashCode() + (Long.hashCode(this.durationMillis) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DeviceDiscoveryOptions(durationMillis=" + this.durationMillis + ", scanMode=" + this.scanMode + ", deviceTypes=" + this.deviceTypes + ", discoveryStrategy=" + this.discoveryStrategy + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DeviceDiscoveryOptions(long j2, @NotNull ScanMode scanMode, @NotNull Set<? extends DeviceType> set, @NotNull DiscoveryStrategy discoveryStrategy) {
        this.durationMillis = j2;
        this.scanMode = scanMode;
        this.deviceTypes = set;
        this.discoveryStrategy = discoveryStrategy;
    }

    public /* synthetic */ DeviceDiscoveryOptions(long j2, ScanMode scanMode, Set set, DiscoveryStrategy discoveryStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, scanMode, set, (i & 8) != 0 ? DiscoveryStrategy.BLE : discoveryStrategy);
    }
}
