package org.oconscrypt;

import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HandshakeListener {
    public abstract void onHandshakeFinished() throws SSLException;
}
