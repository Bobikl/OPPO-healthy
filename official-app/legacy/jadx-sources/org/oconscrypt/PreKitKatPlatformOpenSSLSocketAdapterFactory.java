package org.oconscrypt;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes11.dex */
public class PreKitKatPlatformOpenSSLSocketAdapterFactory extends BaseOpenSSLSocketAdapterFactory {
    public PreKitKatPlatformOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        super(openSSLSocketFactoryImpl);
    }

    @Override // org.oconscrypt.BaseOpenSSLSocketAdapterFactory
    public Socket wrap(OpenSSLSocketImpl openSSLSocketImpl) throws IOException {
        return new PreKitKatPlatformOpenSSLSocketImplAdapter(openSSLSocketImpl);
    }
}
