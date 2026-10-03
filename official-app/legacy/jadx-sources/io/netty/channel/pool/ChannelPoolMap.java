package io.netty.channel.pool;

import io.netty.channel.pool.ChannelPool;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelPoolMap<K, P extends ChannelPool> {
    boolean contains(K k);

    P get(K k);
}
