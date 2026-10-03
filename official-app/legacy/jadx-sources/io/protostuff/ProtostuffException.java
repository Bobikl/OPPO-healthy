package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ProtostuffException extends IOException {
    private static final long serialVersionUID = 3969366848110070516L;

    public ProtostuffException() {
    }

    public ProtostuffException(String str) {
        super(str);
    }

    public ProtostuffException(String str, Throwable th) {
        super(str, th);
    }

    public ProtostuffException(Throwable th) {
        super(th);
    }
}
