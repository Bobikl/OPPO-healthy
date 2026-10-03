package io.netty.handler.timeout;

import io.netty.util.internal.PlatformDependent;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadTimeoutException extends TimeoutException {
    public static final ReadTimeoutException INSTANCE;
    private static final long serialVersionUID = 169287984113283421L;

    static {
        INSTANCE = PlatformDependent.javaVersion() >= 7 ? new ReadTimeoutException(true) : new ReadTimeoutException();
    }

    public ReadTimeoutException() {
    }

    public ReadTimeoutException(String str) {
        super(str, false);
    }

    private ReadTimeoutException(boolean z) {
        super(null, z);
    }
}
