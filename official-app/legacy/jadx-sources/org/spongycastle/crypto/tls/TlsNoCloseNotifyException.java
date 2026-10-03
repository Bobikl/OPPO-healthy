package org.spongycastle.crypto.tls;

import java.io.EOFException;

/* JADX INFO: loaded from: classes11.dex */
public class TlsNoCloseNotifyException extends EOFException {
    public TlsNoCloseNotifyException() {
        super("No close_notify alert received before connection closed");
    }
}
