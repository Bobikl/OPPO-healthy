package io.netty.channel;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface MaxBytesRecvByteBufAllocator extends RecvByteBufAllocator {
    int maxBytesPerIndividualRead();

    MaxBytesRecvByteBufAllocator maxBytesPerIndividualRead(int i);

    int maxBytesPerRead();

    MaxBytesRecvByteBufAllocator maxBytesPerRead(int i);

    MaxBytesRecvByteBufAllocator maxBytesPerReadPair(int i, int i2);

    Map.Entry<Integer, Integer> maxBytesPerReadPair();
}
