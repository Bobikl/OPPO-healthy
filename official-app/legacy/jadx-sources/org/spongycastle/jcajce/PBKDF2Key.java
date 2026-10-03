package org.spongycastle.jcajce;

import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.z73;

/* JADX INFO: loaded from: classes11.dex */
public class PBKDF2Key implements PBKDFKey {
    private final z73 converter;
    private final char[] password;

    public PBKDF2Key(char[] cArr, z73 z73Var) {
        this.password = eh0.f(cArr);
        this.converter = z73Var;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
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
