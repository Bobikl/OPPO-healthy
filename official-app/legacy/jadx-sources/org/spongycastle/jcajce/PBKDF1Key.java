package org.spongycastle.jcajce;

import com.oplus.aiunit.vision.z73;

/* JADX INFO: loaded from: classes11.dex */
public class PBKDF1Key implements PBKDFKey {
    private final z73 converter;
    private final char[] password;

    public PBKDF1Key(char[] cArr, z73 z73Var) {
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        this.converter = z73Var;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.converter.convert(this.password);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.converter.getType();
    }

    public char[] getPassword() {
        return this.password;
    }
}
