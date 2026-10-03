package io.netty.channel;

/* JADX INFO: loaded from: classes10.dex */
public interface MessageSizeEstimator {

    public interface Handle {
        int size(Object obj);
    }

    Handle newHandle();
}
