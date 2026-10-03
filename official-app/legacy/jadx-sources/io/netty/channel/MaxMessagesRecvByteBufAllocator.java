package io.netty.channel;

/* JADX INFO: loaded from: classes10.dex */
public interface MaxMessagesRecvByteBufAllocator extends RecvByteBufAllocator {
    int maxMessagesPerRead();

    MaxMessagesRecvByteBufAllocator maxMessagesPerRead(int i);
}
