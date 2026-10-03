package org.spongycastle.pqc.jcajce.provider.gmss;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.v79;
import com.oplus.aiunit.vision.x18;
import com.oplus.aiunit.vision.y18;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCGMSSPublicKey implements eb3, PublicKey {
    private static final long serialVersionUID = 1;
    private x18 gmssParameterSet;
    private x18 gmssParams;
    private byte[] publicKeyBytes;

    public BCGMSSPublicKey(byte[] bArr, x18 x18Var) {
        this.publicKeyBytes = bArr;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        n1 n1Var = n1e.rainbow;
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public x18 getParameterSet() {
        return null;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GMSS public key : ");
        sb.append(new String(v79.b(this.publicKeyBytes)));
        sb.append("\nHeight of Trees: \n");
        throw null;
    }

    public BCGMSSPublicKey(y18 y18Var) {
        throw null;
    }
}
