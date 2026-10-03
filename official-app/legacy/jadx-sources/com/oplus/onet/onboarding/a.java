package com.oplus.onet.onboarding;

import android.util.Log;
import com.google.security.cryptauth.lib.securegcm.HandshakeException;
import com.google.security.cryptauth.lib.securegcm.Ukey2Handshake;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public byte[] a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ukey2Handshake f20046c;

    /* JADX INFO: renamed from: com.oplus.onet.onboarding.a$a, reason: collision with other inner class name */
    public static final class C0978a {

        /* JADX INFO: renamed from: do, reason: not valid java name */
        public static final a f150do = new a();
    }

    public interface b {
    }

    public final void a(b bVar) {
        this.b = bVar;
    }

    public final void b(byte[] bArr) {
        try {
            this.f20046c.parseHandshakeMessage(bArr);
            this.a = this.f20046c.getNextHandshakeMessage();
            if (this.b != null) {
                this.f20046c.getVerificationString(2);
                this.f20046c.verifyHandshake();
                byte[] encoded = this.f20046c.toConnectionContext().getEncodeKey().getEncoded();
                byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, encoded.length / 2);
                ((WifiClient.b) this.b).a(this.a, bArrCopyOfRange, this.f20046c.getIvSpec());
            }
        } catch (HandshakeException | Ukey2Handshake.AlertException e2) {
            Log.e("UkeyClient", e2.getLocalizedMessage());
        }
    }
}
