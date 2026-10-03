package io.netty.channel;

import java.nio.channels.ClosedChannelException;

/* JADX INFO: loaded from: classes10.dex */
final class ExtendedClosedChannelException extends ClosedChannelException {
    public ExtendedClosedChannelException(Throwable th) {
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
