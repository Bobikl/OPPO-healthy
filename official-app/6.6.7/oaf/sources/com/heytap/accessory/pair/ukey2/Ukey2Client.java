package com.heytap.accessory.pair.ukey2;

import com.google.security.cryptauth.lib.securegcm.HandshakeException;
import com.google.security.cryptauth.lib.securegcm.Ukey2Handshake;
import com.heytap.accessory.pair.logging.PairLog;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class Ukey2Client {
    private static final String TAG = "Ukey2Client";
    private static volatile Ukey2Client sUkey2Client;
    private Ukey2Handshake mClient;
    private byte[] mHandshakeMessage;
    private Ukey2ClientCallback mUkey2ClientCallback;

    public interface Ukey2ClientCallback {
        void onClientFinished(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);
    }

    private Ukey2Client() {
    }

    public static Ukey2Client getInstance() {
        if (sUkey2Client == null) {
            synchronized (Ukey2Client.class) {
                if (sUkey2Client == null) {
                    sUkey2Client = new Ukey2Client();
                }
            }
        }
        return sUkey2Client;
    }

    public void afterServerInit(byte[] bArr) {
        try {
            this.mClient.parseHandshakeMessage(bArr);
            this.mHandshakeMessage = this.mClient.getNextHandshakeMessage();
            if (this.mUkey2ClientCallback != null) {
                byte[] verificationString = this.mClient.getVerificationString(2);
                this.mClient.verifyHandshake();
                byte[] encoded = this.mClient.toConnectionContext().getEncodeKey().getEncoded();
                this.mUkey2ClientCallback.onClientFinished(this.mHandshakeMessage, Arrays.copyOfRange(encoded, 0, encoded.length / 2), this.mClient.getIvSpec(), verificationString);
            }
        } catch (HandshakeException | Ukey2Handshake.AlertException unused) {
        }
    }

    public byte[] prepareClientInit() {
        try {
            Ukey2Handshake ukey2HandshakeForInitiator = Ukey2Handshake.forInitiator(Ukey2Handshake.HandshakeCipher.P256_SHA512);
            this.mClient = ukey2HandshakeForInitiator;
            byte[] nextHandshakeMessage = ukey2HandshakeForInitiator.getNextHandshakeMessage();
            this.mHandshakeMessage = nextHandshakeMessage;
            return nextHandshakeMessage;
        } catch (Exception e) {
            PairLog.e("Ukey2KeyBased error: " + e.getMessage());
            return null;
        }
    }

    public void setUkey2ClientCallback(Ukey2ClientCallback ukey2ClientCallback) {
        this.mUkey2ClientCallback = ukey2ClientCallback;
    }
}
