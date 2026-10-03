package org.spongycastle.crypto;

import com.oplus.aiunit.vision.z0e;
import com.oplus.aiunit.vision.z73;

/* JADX INFO: loaded from: classes11.dex */
public enum PasswordConverter implements z73 {
    ASCII { // from class: org.spongycastle.crypto.PasswordConverter.1
        @Override // org.spongycastle.crypto.PasswordConverter, com.oplus.aiunit.vision.z73
        public byte[] convert(char[] cArr) {
            return z0e.b(cArr);
        }

        @Override // org.spongycastle.crypto.PasswordConverter, com.oplus.aiunit.vision.z73
        public String getType() {
            return "ASCII";
        }
    },
    UTF8 { // from class: org.spongycastle.crypto.PasswordConverter.2
        @Override // org.spongycastle.crypto.PasswordConverter, com.oplus.aiunit.vision.z73
        public byte[] convert(char[] cArr) {
            return z0e.c(cArr);
        }

        @Override // org.spongycastle.crypto.PasswordConverter, com.oplus.aiunit.vision.z73
        public String getType() {
            return "UTF8";
        }
    },
    PKCS12 { // from class: org.spongycastle.crypto.PasswordConverter.3
        @Override // org.spongycastle.crypto.PasswordConverter, com.oplus.aiunit.vision.z73
        public byte[] convert(char[] cArr) {
            return z0e.a(cArr);
        }

        @Override // org.spongycastle.crypto.PasswordConverter, com.oplus.aiunit.vision.z73
        public String getType() {
            return "PKCS12";
        }
    };

    @Override // com.oplus.aiunit.vision.z73
    public abstract /* synthetic */ byte[] convert(char[] cArr);

    @Override // com.oplus.aiunit.vision.z73
    public abstract /* synthetic */ String getType();
}
