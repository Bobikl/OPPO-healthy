package io.netty.channel;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelId extends Serializable, Comparable<ChannelId> {
    String asLongText();

    String asShortText();
}
