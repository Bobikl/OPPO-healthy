package org.spongycastle.pqc.jcajce.provider.rainbow;

import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.k9f;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.o9f;
import com.oplus.aiunit.vision.p9f;
import com.oplus.aiunit.vision.q9f;
import com.oplus.aiunit.vision.qoa;
import com.oplus.aiunit.vision.r9f;
import com.oplus.aiunit.vision.rj4;
import com.oplus.aiunit.vision.tz;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCRainbowPublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private short[][] coeffquadratic;
    private short[] coeffscalar;
    private short[][] coeffsingular;
    private int docLength;
    private k9f rainbowParams;

    public BCRainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.docLength = i;
        this.coeffquadratic = sArr;
        this.coeffsingular = sArr2;
        this.coeffscalar = sArr3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) obj;
        return this.docLength == bCRainbowPublicKey.getDocLength() && r9f.j(this.coeffquadratic, bCRainbowPublicKey.getCoeffQuadratic()) && r9f.j(this.coeffsingular, bCRainbowPublicKey.getCoeffSingular()) && r9f.i(this.coeffscalar, bCRainbowPublicKey.getCoeffScalar());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[][] getCoeffQuadratic() {
        return this.coeffquadratic;
    }

    public short[] getCoeffScalar() {
        return eh0.i(this.coeffscalar);
    }

    public short[][] getCoeffSingular() {
        short[][] sArr = new short[this.coeffsingular.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.coeffsingular;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = eh0.i(sArr2[i]);
            i++;
        }
    }

    public int getDocLength() {
        return this.docLength;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return qoa.a(new tz(n1e.rainbow, rj4.INSTANCE), new o9f(this.docLength, this.coeffquadratic, this.coeffsingular, this.coeffscalar));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.docLength * 37) + eh0.v(this.coeffquadratic)) * 37) + eh0.v(this.coeffsingular)) * 37) + eh0.u(this.coeffscalar);
    }

    public BCRainbowPublicKey(q9f q9fVar) {
        this(q9fVar.d(), q9fVar.a(), q9fVar.c(), q9fVar.b());
    }

    public BCRainbowPublicKey(p9f p9fVar) {
        throw null;
    }
}
