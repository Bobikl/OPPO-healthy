package io.netty.incubator.codec.quic;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicException extends IOException {
    private final QuicError error;

    public QuicException(QuicError quicError) {
        super(quicError.message());
        this.error = quicError;
    }

    public QuicError error() {
        return this.error;
    }
}
