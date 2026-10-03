package com.oplus.pantaconnect.sdk.discovery.fusion;

import com.oplus.pantaconnect.agents.StrategyType;
import com.oplus.pantaconnect.sdk.Wakeup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/FusionPublishOptions;", "", "discoveryStrategy", "Lcom/oplus/pantaconnect/agents/StrategyType;", "durationMillis", "", "interval", "", "distance", "wakeup", "Lcom/oplus/pantaconnect/sdk/Wakeup;", "screenOffDiscoverable", "", "includeDeviceName", "(Lcom/oplus/pantaconnect/agents/StrategyType;JIJLcom/oplus/pantaconnect/sdk/Wakeup;ZZ)V", "getDiscoveryStrategy", "()Lcom/oplus/pantaconnect/agents/StrategyType;", "getDistance", "()J", "getDurationMillis", "getIncludeDeviceName", "()Z", "getInterval", "()I", "getScreenOffDiscoverable", "getWakeup", "()Lcom/oplus/pantaconnect/sdk/Wakeup;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FusionPublishOptions {

    @NotNull
    private final StrategyType discoveryStrategy;
    private final long distance;
    private final long durationMillis;
    private final boolean includeDeviceName;
    private final int interval;
    private final boolean screenOffDiscoverable;

    @Nullable
    private final Wakeup wakeup;

    @JvmOverloads
    public FusionPublishOptions() {
        this(null, 0L, 0, 0L, null, false, false, 127, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StrategyType getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDistance() {
        return this.distance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getScreenOffDiscoverable() {
        return this.screenOffDiscoverable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIncludeDeviceName() {
        return this.includeDeviceName;
    }

    @NotNull
    public final FusionPublishOptions copy(@NotNull StrategyType discoveryStrategy, long durationMillis, int interval, long distance, @Nullable Wakeup wakeup, boolean screenOffDiscoverable, boolean includeDeviceName) {
        return new FusionPublishOptions(discoveryStrategy, durationMillis, interval, distance, wakeup, screenOffDiscoverable, includeDeviceName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FusionPublishOptions)) {
            return false;
        }
        FusionPublishOptions fusionPublishOptions = (FusionPublishOptions) other;
        return this.discoveryStrategy == fusionPublishOptions.discoveryStrategy && this.durationMillis == fusionPublishOptions.durationMillis && this.interval == fusionPublishOptions.interval && this.distance == fusionPublishOptions.distance && Intrinsics.areEqual(this.wakeup, fusionPublishOptions.wakeup) && this.screenOffDiscoverable == fusionPublishOptions.screenOffDiscoverable && this.includeDeviceName == fusionPublishOptions.includeDeviceName;
    }

    @NotNull
    public final StrategyType getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    public final long getDistance() {
        return this.distance;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getIncludeDeviceName() {
        return this.includeDeviceName;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final boolean getScreenOffDiscoverable() {
        return this.screenOffDiscoverable;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        int iHashCode = (Long.hashCode(this.distance) + ((Integer.hashCode(this.interval) + ((Long.hashCode(this.durationMillis) + (this.discoveryStrategy.hashCode() * 31)) * 31)) * 31)) * 31;
        Wakeup wakeup = this.wakeup;
        return Boolean.hashCode(this.includeDeviceName) + ((Boolean.hashCode(this.screenOffDiscoverable) + ((iHashCode + (wakeup == null ? 0 : wakeup.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FusionPublishOptions(discoveryStrategy=" + this.discoveryStrategy + ", durationMillis=" + this.durationMillis + ", interval=" + this.interval + ", distance=" + this.distance + ", wakeup=" + this.wakeup + ", screenOffDiscoverable=" + this.screenOffDiscoverable + ", includeDeviceName=" + this.includeDeviceName + ')';
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType) {
        this(strategyType, 0L, 0, 0L, null, false, false, 126, null);
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType, long j2) {
        this(strategyType, j2, 0, 0L, null, false, false, 124, null);
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType, long j2, int i) {
        this(strategyType, j2, i, 0L, null, false, false, 120, null);
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType, long j2, int i, long j3) {
        this(strategyType, j2, i, j3, null, false, false, 112, null);
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType, long j2, int i, long j3, @Nullable Wakeup wakeup) {
        this(strategyType, j2, i, j3, wakeup, false, false, 96, null);
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType, long j2, int i, long j3, @Nullable Wakeup wakeup, boolean z) {
        this(strategyType, j2, i, j3, wakeup, z, false, 64, null);
    }

    @JvmOverloads
    public FusionPublishOptions(@NotNull StrategyType strategyType, long j2, int i, long j3, @Nullable Wakeup wakeup, boolean z, boolean z2) {
        this.discoveryStrategy = strategyType;
        this.durationMillis = j2;
        this.interval = i;
        this.distance = j3;
        this.wakeup = wakeup;
        this.screenOffDiscoverable = z;
        this.includeDeviceName = z2;
    }

    public /* synthetic */ FusionPublishOptions(StrategyType strategyType, long j2, int i, long j3, Wakeup wakeup, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? StrategyType.BLE : strategyType, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? j3 : 0L, (i2 & 16) != 0 ? null : wakeup, (i2 & 32) != 0 ? false : z, (i2 & 64) == 0 ? z2 : false);
    }
}
