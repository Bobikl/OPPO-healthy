package io.netty.incubator.codec.quic;

import io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultRecvByteBufAllocator extends DefaultMaxMessagesRecvByteBufAllocator {
    private final int bufferSize;

    public final class HandleImpl extends DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle {
        private final int bufferSize;

        public HandleImpl(int i) {
            super();
            this.bufferSize = i;
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int guess() {
            return this.bufferSize;
        }
    }

    public DefaultRecvByteBufAllocator(int i, int i2) {
        ObjectUtil.checkPositive(i, "bufferSize");
        ObjectUtil.checkPositive(i, "maxPerRead");
        this.bufferSize = i;
        maxMessagesPerRead(i2);
    }

    @Override // io.netty.channel.RecvByteBufAllocator
    public RecvByteBufAllocator.Handle newHandle() {
        return new HandleImpl(this.bufferSize);
    }

    @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator
    public DefaultRecvByteBufAllocator respectMaybeMoreData(boolean z) {
        super.respectMaybeMoreData(z);
        return this;
    }
}
