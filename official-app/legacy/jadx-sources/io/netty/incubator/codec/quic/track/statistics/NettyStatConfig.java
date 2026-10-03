package io.netty.incubator.codec.quic.track.statistics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/netty/incubator/codec/quic/track/statistics/NettyStatConfig;", "", "enable", "", "statisticCaller", "Lio/netty/incubator/codec/quic/track/statistics/StatisticCallback;", "sampleRatio", "", "(ZLio/netty/incubator/codec/quic/track/statistics/StatisticCallback;I)V", "getEnable", "()Z", "getSampleRatio", "()I", "getStatisticCaller", "()Lio/netty/incubator/codec/quic/track/statistics/StatisticCallback;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class NettyStatConfig {
    private final boolean enable;
    private final int sampleRatio;

    @Nullable
    private final StatisticCallback statisticCaller;

    @JvmOverloads
    public NettyStatConfig() {
        this(false, null, 0, 7, null);
    }

    public static /* synthetic */ NettyStatConfig copy$default(NettyStatConfig nettyStatConfig, boolean z, StatisticCallback statisticCallback, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = nettyStatConfig.enable;
        }
        if ((i2 & 2) != 0) {
            statisticCallback = nettyStatConfig.statisticCaller;
        }
        if ((i2 & 4) != 0) {
            i = nettyStatConfig.sampleRatio;
        }
        return nettyStatConfig.copy(z, statisticCallback, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StatisticCallback getStatisticCaller() {
        return this.statisticCaller;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSampleRatio() {
        return this.sampleRatio;
    }

    @NotNull
    public final NettyStatConfig copy(boolean enable, @Nullable StatisticCallback statisticCaller, int sampleRatio) {
        return new NettyStatConfig(enable, statisticCaller, sampleRatio);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NettyStatConfig)) {
            return false;
        }
        NettyStatConfig nettyStatConfig = (NettyStatConfig) other;
        return this.enable == nettyStatConfig.enable && Intrinsics.areEqual(this.statisticCaller, nettyStatConfig.statisticCaller) && this.sampleRatio == nettyStatConfig.sampleRatio;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getSampleRatio() {
        return this.sampleRatio;
    }

    @Nullable
    public final StatisticCallback getStatisticCaller() {
        return this.statisticCaller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        StatisticCallback statisticCallback = this.statisticCaller;
        return ((i + (statisticCallback == null ? 0 : statisticCallback.hashCode())) * 31) + Integer.hashCode(this.sampleRatio);
    }

    @NotNull
    public String toString() {
        return "NettyStatConfig(enable=" + this.enable + ", statisticCaller=" + this.statisticCaller + ", sampleRatio=" + this.sampleRatio + ')';
    }

    @JvmOverloads
    public NettyStatConfig(boolean z) {
        this(z, null, 0, 6, null);
    }

    @JvmOverloads
    public NettyStatConfig(boolean z, @Nullable StatisticCallback statisticCallback) {
        this(z, statisticCallback, 0, 4, null);
    }

    @JvmOverloads
    public NettyStatConfig(boolean z, @Nullable StatisticCallback statisticCallback, int i) {
        this.enable = z;
        this.statisticCaller = statisticCallback;
        this.sampleRatio = i;
    }

    public /* synthetic */ NettyStatConfig(boolean z, StatisticCallback statisticCallback, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? null : statisticCallback, (i2 & 4) != 0 ? 1 : i);
    }
}
