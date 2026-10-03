package io.netty.incubator.codec.quic;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicContext {
    private Context context;
    private boolean earlyDataEnable;
    private boolean keylogEnable;
    private long pskCacheTimeout;
    private QuicClientSessionCache sessionCache;

    public QuicContext(Context context, boolean z, boolean z2, long j2) {
        this.context = context;
        this.earlyDataEnable = z;
        this.keylogEnable = z2;
        QuicClientSessionCache quicClientSessionCache = QuicClientSessionCache.getInstance(context);
        this.sessionCache = quicClientSessionCache;
        quicClientSessionCache.setSessionTimeout(j2);
        this.pskCacheTimeout = j2;
    }

    public Context getContext() {
        return this.context;
    }

    public QuicClientSessionCache getSessionCache() {
        return this.sessionCache;
    }

    public boolean isEarlyDataEnable() {
        return this.earlyDataEnable;
    }

    public boolean isKeylogEnable() {
        return this.keylogEnable;
    }

    public void setKeylogEnable(boolean z) {
        this.keylogEnable = z;
    }

    public void setPskCacheTimeout(long j2) {
        this.pskCacheTimeout = j2;
    }
}
