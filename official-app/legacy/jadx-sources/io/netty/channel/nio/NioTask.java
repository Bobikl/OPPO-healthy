package io.netty.channel.nio;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

/* JADX INFO: loaded from: classes10.dex */
public interface NioTask<C extends SelectableChannel> {
    void channelReady(C c2, SelectionKey selectionKey) throws Exception;

    void channelUnregistered(C c2, Throwable th) throws Exception;
}
