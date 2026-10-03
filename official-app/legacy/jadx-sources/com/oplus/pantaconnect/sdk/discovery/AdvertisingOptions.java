package com.oplus.pantaconnect.sdk.discovery;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.pantaconnect.sdk.Wakeup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/AdvertisingOptions;", "", Fields.SP_STRATEGY_FIELD, "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "discoverableDeviceLevel", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoverableDeviceLevel;", "wakeup", "Lcom/oplus/pantaconnect/sdk/Wakeup;", "(Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;Lcom/oplus/pantaconnect/sdk/discovery/DiscoverableDeviceLevel;Lcom/oplus/pantaconnect/sdk/Wakeup;)V", "getDiscoverableDeviceLevel", "()Lcom/oplus/pantaconnect/sdk/discovery/DiscoverableDeviceLevel;", "extensionType", "", "getExtensionType", "()Ljava/lang/String;", "setExtensionType", "(Ljava/lang/String;)V", "getStrategy", "()Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "getWakeup", "()Lcom/oplus/pantaconnect/sdk/Wakeup;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdvertisingOptions {

    @NotNull
    private final DiscoverableDeviceLevel discoverableDeviceLevel;

    @NotNull
    private String extensionType;

    @NotNull
    private final DiscoveryStrategy strategy;

    @Nullable
    private final Wakeup wakeup;

    @JvmOverloads
    public AdvertisingOptions() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdvertisingOptions copy$default(AdvertisingOptions advertisingOptions, DiscoveryStrategy discoveryStrategy, DiscoverableDeviceLevel discoverableDeviceLevel, Wakeup wakeup, int i, Object obj) {
        if ((i & 1) != 0) {
            discoveryStrategy = advertisingOptions.strategy;
        }
        if ((i & 2) != 0) {
            discoverableDeviceLevel = advertisingOptions.discoverableDeviceLevel;
        }
        if ((i & 4) != 0) {
            wakeup = advertisingOptions.wakeup;
        }
        return advertisingOptions.copy(discoveryStrategy, discoverableDeviceLevel, wakeup);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiscoveryStrategy getStrategy() {
        return this.strategy;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DiscoverableDeviceLevel getDiscoverableDeviceLevel() {
        return this.discoverableDeviceLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    @NotNull
    public final AdvertisingOptions copy(@NotNull DiscoveryStrategy strategy, @NotNull DiscoverableDeviceLevel discoverableDeviceLevel, @Nullable Wakeup wakeup) {
        return new AdvertisingOptions(strategy, discoverableDeviceLevel, wakeup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertisingOptions)) {
            return false;
        }
        AdvertisingOptions advertisingOptions = (AdvertisingOptions) other;
        return this.strategy == advertisingOptions.strategy && this.discoverableDeviceLevel == advertisingOptions.discoverableDeviceLevel && Intrinsics.areEqual(this.wakeup, advertisingOptions.wakeup);
    }

    @NotNull
    public final DiscoverableDeviceLevel getDiscoverableDeviceLevel() {
        return this.discoverableDeviceLevel;
    }

    @NotNull
    public final String getExtensionType() {
        return this.extensionType;
    }

    @NotNull
    public final DiscoveryStrategy getStrategy() {
        return this.strategy;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        int iHashCode = (this.discoverableDeviceLevel.hashCode() + (this.strategy.hashCode() * 31)) * 31;
        Wakeup wakeup = this.wakeup;
        return iHashCode + (wakeup == null ? 0 : wakeup.hashCode());
    }

    public final void setExtensionType(@NotNull String str) {
        this.extensionType = str;
    }

    @NotNull
    public String toString() {
        return "AdvertisingOptions(strategy=" + this.strategy + ", discoverableDeviceLevel=" + this.discoverableDeviceLevel + ", wakeup=" + this.wakeup + ')';
    }

    @JvmOverloads
    public AdvertisingOptions(@NotNull DiscoveryStrategy discoveryStrategy) {
        this(discoveryStrategy, null, null, 6, null);
    }

    @JvmOverloads
    public AdvertisingOptions(@NotNull DiscoveryStrategy discoveryStrategy, @NotNull DiscoverableDeviceLevel discoverableDeviceLevel) {
        this(discoveryStrategy, discoverableDeviceLevel, null, 4, null);
    }

    @JvmOverloads
    public AdvertisingOptions(@NotNull DiscoveryStrategy discoveryStrategy, @NotNull DiscoverableDeviceLevel discoverableDeviceLevel, @Nullable Wakeup wakeup) {
        this.strategy = discoveryStrategy;
        this.discoverableDeviceLevel = discoverableDeviceLevel;
        this.wakeup = wakeup;
        this.extensionType = "";
    }

    public /* synthetic */ AdvertisingOptions(DiscoveryStrategy discoveryStrategy, DiscoverableDeviceLevel discoverableDeviceLevel, Wakeup wakeup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DiscoveryStrategy.BASED_CONNECT : discoveryStrategy, (i & 2) != 0 ? DiscoverableDeviceLevel.ALL : discoverableDeviceLevel, (i & 4) != 0 ? null : wakeup);
    }
}
