package org.spongycastle.jcajce;

import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.z73;
import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes11.dex */
public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PBKDF1KeyWithParameters(char[] cArr, z73 z73Var, byte[] bArr, int i) {
        super(cArr, z73Var);
        this.salt = eh0.e(bArr);
        this.iterationCount = i;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }
}
