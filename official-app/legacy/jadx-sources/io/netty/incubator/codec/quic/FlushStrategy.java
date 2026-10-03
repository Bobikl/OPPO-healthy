package io.netty.incubator.codec.quic;

import io.netty.incubator.codec.quic.FlushStrategy;
import io.netty.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes10.dex */
public interface FlushStrategy {
    public static final FlushStrategy DEFAULT = afterNumBytes(27000);

    static FlushStrategy afterNumBytes(final int i) {
        ObjectUtil.checkPositive(i, "bytes");
        return new FlushStrategy() { // from class: com.oplus.aiunit.vision.qv7
            @Override // io.netty.incubator.codec.quic.FlushStrategy
            public final boolean shouldFlushNow(int i2, int i3) {
                return FlushStrategy.lambda$afterNumBytes$0(i, i2, i3);
            }
        };
    }

    static FlushStrategy afterNumPackets(final int i) {
        ObjectUtil.checkPositive(i, "packets");
        return new FlushStrategy() { // from class: com.oplus.aiunit.vision.pv7
            @Override // io.netty.incubator.codec.quic.FlushStrategy
            public final boolean shouldFlushNow(int i2, int i3) {
                return FlushStrategy.lambda$afterNumPackets$1(i, i2, i3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$afterNumBytes$0(int i, int i2, int i3) {
        return i3 > i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$afterNumPackets$1(int i, int i2, int i3) {
        return i2 > i;
    }

    boolean shouldFlushNow(int i, int i2);
}
