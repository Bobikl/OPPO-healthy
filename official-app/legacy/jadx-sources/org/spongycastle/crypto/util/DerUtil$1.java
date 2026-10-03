package org.spongycastle.crypto.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
final class DerUtil$1 extends IllegalStateException {
    final /* synthetic */ IOException val$e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerUtil$1(String str, IOException iOException) {
        super(str);
        this.val$e = iOException;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.val$e;
    }
}
