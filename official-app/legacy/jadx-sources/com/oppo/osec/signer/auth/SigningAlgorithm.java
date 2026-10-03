package com.oppo.osec.signer.auth;

import com.oplus.aiunit.vision.ujg;
import com.oppo.osec.signer.SdkClientException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes9.dex */
public enum SigningAlgorithm {
    HmacSHA1,
    HmacSHA256;

    private final ThreadLocal<Mac> macReference = ujg.a(new a(toString()));

    public class a extends ThreadLocal<Mac> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                return Mac.getInstance(this.a);
            } catch (NoSuchAlgorithmException e2) {
                throw new SdkClientException("Unable to fetch Mac instance for Algorithm " + this.a + e2.getMessage(), e2);
            }
        }
    }

    SigningAlgorithm() {
    }

    public Mac getMac() {
        return this.macReference.get();
    }
}
