package com.oplus.pantaconnect.sdk.discovery.fusion;

import com.oplus.pantaconnect.agents.StrategyType;
import com.oplus.pantaconnect.fusionservice.FusionWakeupParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bo\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jq\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000fHÆ\u0001J\u0013\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000fHÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/FusionDiscoveryOptions;", "", "discoveryStrategy", "Lcom/oplus/pantaconnect/agents/StrategyType;", "acceptStickyResult", "", "stickyTTL", "", "screenOffDiscoverable", "callbackType", "Lcom/oplus/pantaconnect/sdk/discovery/fusion/ScanCallbackType;", "wakeup", "Lcom/oplus/pantaconnect/fusionservice/FusionWakeupParams;", "duration", "interval", "", "discoveryFilter", "Lcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilter;", "minRssi", "(Lcom/oplus/pantaconnect/agents/StrategyType;ZJZLcom/oplus/pantaconnect/sdk/discovery/fusion/ScanCallbackType;Lcom/oplus/pantaconnect/fusionservice/FusionWakeupParams;JILcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilter;I)V", "getAcceptStickyResult", "()Z", "getCallbackType", "()Lcom/oplus/pantaconnect/sdk/discovery/fusion/ScanCallbackType;", "getDiscoveryFilter", "()Lcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilter;", "getDiscoveryStrategy", "()Lcom/oplus/pantaconnect/agents/StrategyType;", "getDuration", "()J", "getInterval", "()I", "getMinRssi", "getScreenOffDiscoverable", "getStickyTTL", "getWakeup", "()Lcom/oplus/pantaconnect/fusionservice/FusionWakeupParams;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FusionDiscoveryOptions {
    private final boolean acceptStickyResult;

    @NotNull
    private final ScanCallbackType callbackType;

    @Nullable
    private final DiscoveryFilter discoveryFilter;

    @NotNull
    private final StrategyType discoveryStrategy;
    private final long duration;
    private final int interval;
    private final int minRssi;
    private final boolean screenOffDiscoverable;
    private final long stickyTTL;

    @Nullable
    private final FusionWakeupParams wakeup;

    @JvmOverloads
    public FusionDiscoveryOptions() {
        this(null, false, 0L, false, null, null, 0L, 0, null, 0, 1023, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StrategyType getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMinRssi() {
        return this.minRssi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAcceptStickyResult() {
        return this.acceptStickyResult;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStickyTTL() {
        return this.stickyTTL;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getScreenOffDiscoverable() {
        return this.screenOffDiscoverable;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScanCallbackType getCallbackType() {
        return this.callbackType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FusionWakeupParams getWakeup() {
        return this.wakeup;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DiscoveryFilter getDiscoveryFilter() {
        return this.discoveryFilter;
    }

    @NotNull
    public final FusionDiscoveryOptions copy(@NotNull StrategyType discoveryStrategy, boolean acceptStickyResult, long stickyTTL, boolean screenOffDiscoverable, @NotNull ScanCallbackType callbackType, @Nullable FusionWakeupParams wakeup, long duration, int interval, @Nullable DiscoveryFilter discoveryFilter, int minRssi) {
        return new FusionDiscoveryOptions(discoveryStrategy, acceptStickyResult, stickyTTL, screenOffDiscoverable, callbackType, wakeup, duration, interval, discoveryFilter, minRssi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FusionDiscoveryOptions)) {
            return false;
        }
        FusionDiscoveryOptions fusionDiscoveryOptions = (FusionDiscoveryOptions) other;
        return this.discoveryStrategy == fusionDiscoveryOptions.discoveryStrategy && this.acceptStickyResult == fusionDiscoveryOptions.acceptStickyResult && this.stickyTTL == fusionDiscoveryOptions.stickyTTL && this.screenOffDiscoverable == fusionDiscoveryOptions.screenOffDiscoverable && this.callbackType == fusionDiscoveryOptions.callbackType && Intrinsics.areEqual(this.wakeup, fusionDiscoveryOptions.wakeup) && this.duration == fusionDiscoveryOptions.duration && this.interval == fusionDiscoveryOptions.interval && Intrinsics.areEqual(this.discoveryFilter, fusionDiscoveryOptions.discoveryFilter) && this.minRssi == fusionDiscoveryOptions.minRssi;
    }

    public final boolean getAcceptStickyResult() {
        return this.acceptStickyResult;
    }

    @NotNull
    public final ScanCallbackType getCallbackType() {
        return this.callbackType;
    }

    @Nullable
    public final DiscoveryFilter getDiscoveryFilter() {
        return this.discoveryFilter;
    }

    @NotNull
    public final StrategyType getDiscoveryStrategy() {
        return this.discoveryStrategy;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final int getMinRssi() {
        return this.minRssi;
    }

    public final boolean getScreenOffDiscoverable() {
        return this.screenOffDiscoverable;
    }

    public final long getStickyTTL() {
        return this.stickyTTL;
    }

    @Nullable
    public final FusionWakeupParams getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        int iHashCode = (this.callbackType.hashCode() + ((Boolean.hashCode(this.screenOffDiscoverable) + ((Long.hashCode(this.stickyTTL) + ((Boolean.hashCode(this.acceptStickyResult) + (this.discoveryStrategy.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        FusionWakeupParams fusionWakeupParams = this.wakeup;
        int iHashCode2 = (Integer.hashCode(this.interval) + ((Long.hashCode(this.duration) + ((iHashCode + (fusionWakeupParams == null ? 0 : fusionWakeupParams.hashCode())) * 31)) * 31)) * 31;
        DiscoveryFilter discoveryFilter = this.discoveryFilter;
        return Integer.hashCode(this.minRssi) + ((iHashCode2 + (discoveryFilter != null ? discoveryFilter.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "FusionDiscoveryOptions(discoveryStrategy=" + this.discoveryStrategy + ", acceptStickyResult=" + this.acceptStickyResult + ", stickyTTL=" + this.stickyTTL + ", screenOffDiscoverable=" + this.screenOffDiscoverable + ", callbackType=" + this.callbackType + ", wakeup=" + this.wakeup + ", duration=" + this.duration + ", interval=" + this.interval + ", discoveryFilter=" + this.discoveryFilter + ", minRssi=" + this.minRssi + ')';
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType) {
        this(strategyType, false, 0L, false, null, null, 0L, 0, null, 0, 1022, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z) {
        this(strategyType, z, 0L, false, null, null, 0L, 0, null, 0, 1020, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2) {
        this(strategyType, z, j2, false, null, null, 0L, 0, null, 0, 1016, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2) {
        this(strategyType, z, j2, z2, null, null, 0L, 0, null, 0, 1008, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2, @NotNull ScanCallbackType scanCallbackType) {
        this(strategyType, z, j2, z2, scanCallbackType, null, 0L, 0, null, 0, 992, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2, @NotNull ScanCallbackType scanCallbackType, @Nullable FusionWakeupParams fusionWakeupParams) {
        this(strategyType, z, j2, z2, scanCallbackType, fusionWakeupParams, 0L, 0, null, 0, 960, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2, @NotNull ScanCallbackType scanCallbackType, @Nullable FusionWakeupParams fusionWakeupParams, long j3) {
        this(strategyType, z, j2, z2, scanCallbackType, fusionWakeupParams, j3, 0, null, 0, 896, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2, @NotNull ScanCallbackType scanCallbackType, @Nullable FusionWakeupParams fusionWakeupParams, long j3, int i) {
        this(strategyType, z, j2, z2, scanCallbackType, fusionWakeupParams, j3, i, null, 0, 768, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2, @NotNull ScanCallbackType scanCallbackType, @Nullable FusionWakeupParams fusionWakeupParams, long j3, int i, @Nullable DiscoveryFilter discoveryFilter) {
        this(strategyType, z, j2, z2, scanCallbackType, fusionWakeupParams, j3, i, discoveryFilter, 0, 512, null);
    }

    @JvmOverloads
    public FusionDiscoveryOptions(@NotNull StrategyType strategyType, boolean z, long j2, boolean z2, @NotNull ScanCallbackType scanCallbackType, @Nullable FusionWakeupParams fusionWakeupParams, long j3, int i, @Nullable DiscoveryFilter discoveryFilter, int i2) {
        this.discoveryStrategy = strategyType;
        this.acceptStickyResult = z;
        this.stickyTTL = j2;
        this.screenOffDiscoverable = z2;
        this.callbackType = scanCallbackType;
        this.wakeup = fusionWakeupParams;
        this.duration = j3;
        this.interval = i;
        this.discoveryFilter = discoveryFilter;
        this.minRssi = i2;
    }

    public /* synthetic */ FusionDiscoveryOptions(StrategyType strategyType, boolean z, long j2, boolean z2, ScanCallbackType scanCallbackType, FusionWakeupParams fusionWakeupParams, long j3, int i, DiscoveryFilter discoveryFilter, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? StrategyType.BLE : strategyType, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? ScanCallbackType.ALL_MATCHES : scanCallbackType, (i3 & 32) != 0 ? null : fusionWakeupParams, (i3 & 64) == 0 ? j3 : 0L, (i3 & 128) == 0 ? i : 0, (i3 & 256) == 0 ? discoveryFilter : null, (i3 & 512) != 0 ? -80 : i2);
    }
}
