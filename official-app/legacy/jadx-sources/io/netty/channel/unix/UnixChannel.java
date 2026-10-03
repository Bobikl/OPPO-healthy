package io.netty.channel.unix;

import io.netty.channel.Channel;

/* JADX INFO: loaded from: classes10.dex */
public interface UnixChannel extends Channel {
    FileDescriptor fd();
}
