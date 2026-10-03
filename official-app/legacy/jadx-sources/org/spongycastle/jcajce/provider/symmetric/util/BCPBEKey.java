package org.spongycastle.jcajce.provider.symmetric.util;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eoa;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.t7e;
import com.oplus.aiunit.vision.z0e;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class BCPBEKey implements PBEKey {
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    n1 oid;
    eb3 param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong = false;
    int type;

    public BCPBEKey(String str, n1 n1Var, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, eb3 eb3Var) {
        this.algorithm = str;
        this.oid = n1Var;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.pbeKeySpec = pBEKeySpec;
        this.param = eb3Var;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    public int getDigest() {
        return this.digest;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        eb3 eb3Var = this.param;
        if (eb3Var != null) {
            return (eb3Var instanceof t7e ? (eoa) ((t7e) eb3Var).a() : (eoa) eb3Var).a();
        }
        int i = this.type;
        if (i == 2) {
            return z0e.a(this.pbeKeySpec.getPassword());
        }
        return i == 5 ? z0e.c(this.pbeKeySpec.getPassword()) : z0e.b(this.pbeKeySpec.getPassword());
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    public int getIvSize() {
        return this.ivSize;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public n1 getOID() {
        return this.oid;
    }

    public eb3 getParam() {
        return this.param;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }

    public int getType() {
        return this.type;
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}
