package io.netty.handler.ssl;

/* JADX INFO: loaded from: classes10.dex */
public final class SslCloseCompletionEvent extends SslCompletionEvent {
    public static final SslCloseCompletionEvent SUCCESS = new SslCloseCompletionEvent();

    private SslCloseCompletionEvent() {
    }

    public SslCloseCompletionEvent(Throwable th) {
        super(th);
    }
}
