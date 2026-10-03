package io.netty.incubator.codec.quic.track.statistics;

import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;", "", "statConfig", "Lio/netty/incubator/codec/quic/track/statistics/NettyStatConfig;", "(Lio/netty/incubator/codec/quic/track/statistics/NettyStatConfig;)V", "sampleRandom", "Ljava/util/Random;", "getSampleRandom", "()Ljava/util/Random;", "sampleRandom$delegate", "Lkotlin/Lazy;", "statisticSdkCaller", "Lio/netty/incubator/codec/quic/track/statistics/StatisticCallback;", "getStatisticSdkCaller", "()Lio/netty/incubator/codec/quic/track/statistics/StatisticCallback;", "canUpload", "", "Companion", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StatRateHelper {

    @JvmField
    @NotNull
    public static final InternalLogger logger;

    /* JADX INFO: renamed from: sampleRandom$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sampleRandom;

    @NotNull
    private final NettyStatConfig statConfig;

    @Nullable
    private final StatisticCallback statisticSdkCaller;

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance("TrackHelper");
        Intrinsics.checkNotNullExpressionValue(internalLoggerFactory, "getInstance(\"TrackHelper\")");
        logger = internalLoggerFactory;
    }

    public StatRateHelper(@NotNull NettyStatConfig statConfig) {
        Intrinsics.checkNotNullParameter(statConfig, "statConfig");
        this.statConfig = statConfig;
        this.sampleRandom = LazyKt__LazyJVMKt.lazy(new Function0<Random>() { // from class: io.netty.incubator.codec.quic.track.statistics.StatRateHelper$sampleRandom$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Random invoke() {
                return new Random();
            }
        });
        this.statisticSdkCaller = statConfig.getStatisticCaller();
    }

    private final Random getSampleRandom() {
        return (Random) this.sampleRandom.getValue();
    }

    public final boolean canUpload() {
        if (!this.statConfig.getEnable()) {
            return false;
        }
        if (getSampleRandom().nextInt(100) + 1 <= (this.statConfig.getSampleRatio() > 100 ? 100 : this.statConfig.getSampleRatio())) {
            return true;
        }
        logger.info(Intrinsics.stringPlus("ignore record by sample ratio is ", Integer.valueOf(this.statConfig.getSampleRatio())));
        return false;
    }

    @Nullable
    public final StatisticCallback getStatisticSdkCaller() {
        return this.statisticSdkCaller;
    }
}
