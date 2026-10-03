package com.heytap.accessory.pair.ukey2;

import com.google.security.cryptauth.lib.securegcm.D2DConnectionContext;
import com.google.security.cryptauth.lib.securegcm.HandshakeException;
import com.google.security.cryptauth.lib.securegcm.Ukey2Handshake;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class Ukey2Server {
    private static volatile Ukey2Server sUkey2Server;
    private byte[] mHandshakeMessage;
    private Ukey2Handshake mServer;
    private Ukey2ServerCallback mUkey2ServerCallback;

    public interface Ukey2ServerCallback {
        void afterServerInit(byte[] bArr);

        void onAuthStrAndKeyGet(byte[] bArr, byte[] bArr2, byte[] bArr3);
    }

    private Ukey2Server() {
    }

    public static Ukey2Server getInstance() {
        if (sUkey2Server == null) {
            synchronized (Ukey2Server.class) {
                if (sUkey2Server == null) {
                    sUkey2Server = new Ukey2Server();
                }
            }
        }
        return sUkey2Server;
    }

    public void onClientFinish(byte[] bArr) {
        try {
            this.mServer.parseHandshakeMessage(bArr);
            if (this.mUkey2ServerCallback != null) {
                byte[] verificationString = this.mServer.getVerificationString(2);
                this.mServer.verifyHandshake();
                D2DConnectionContext connectionContext = this.mServer.toConnectionContext();
                byte[] ivSpec = this.mServer.getIvSpec();
                byte[] encoded = connectionContext.getDecodeKey().getEncoded();
                this.mUkey2ServerCallback.onAuthStrAndKeyGet(Arrays.copyOfRange(encoded, 0, encoded.length / 2), ivSpec, verificationString);
            }
        } catch (HandshakeException | Ukey2Handshake.AlertException unused) {
        }
    }

    public void onClientInit(byte[] bArr) {
        try {
            Ukey2Handshake ukey2HandshakeForResponder = Ukey2Handshake.forResponder(Ukey2Handshake.HandshakeCipher.P256_SHA512);
            this.mServer = ukey2HandshakeForResponder;
            ukey2HandshakeForResponder.parseHandshakeMessage(bArr);
            byte[] nextHandshakeMessage = this.mServer.getNextHandshakeMessage();
            this.mHandshakeMessage = nextHandshakeMessage;
            Ukey2ServerCallback ukey2ServerCallback = this.mUkey2ServerCallback;
            if (ukey2ServerCallback != null) {
                ukey2ServerCallback.afterServerInit(nextHandshakeMessage);
            }
        } catch (HandshakeException | Ukey2Handshake.AlertException unused) {
        }
    }

    public void setUkey2ServerCallback(Ukey2ServerCallback ukey2ServerCallback) {
        this.mUkey2ServerCallback = ukey2ServerCallback;
    }
}
