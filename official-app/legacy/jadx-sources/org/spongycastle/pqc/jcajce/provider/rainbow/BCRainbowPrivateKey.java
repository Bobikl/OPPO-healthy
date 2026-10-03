package org.spongycastle.pqc.jcajce.provider.rainbow;

import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.l9f;
import com.oplus.aiunit.vision.m9f;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.n9f;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.r9f;
import com.oplus.aiunit.vision.rj4;
import com.oplus.aiunit.vision.rua;
import com.oplus.aiunit.vision.tz;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class BCRainbowPrivateKey implements PrivateKey {
    private static final long serialVersionUID = 1;
    private short[][] A1inv;
    private short[][] A2inv;
    private short[] b1;
    private short[] b2;
    private rua[] layers;
    private int[] vi;

    public BCRainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, rua[] ruaVarArr) {
        this.A1inv = sArr;
        this.b1 = sArr2;
        this.A2inv = sArr3;
        this.b2 = sArr4;
        this.vi = iArr;
        this.layers = ruaVarArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPrivateKey)) {
            return false;
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) obj;
        boolean zEquals = ((((r9f.j(this.A1inv, bCRainbowPrivateKey.getInvA1())) && r9f.j(this.A2inv, bCRainbowPrivateKey.getInvA2())) && r9f.i(this.b1, bCRainbowPrivateKey.getB1())) && r9f.i(this.b2, bCRainbowPrivateKey.getB2())) && Arrays.equals(this.vi, bCRainbowPrivateKey.getVi());
        if (this.layers.length != bCRainbowPrivateKey.getLayers().length) {
            return false;
        }
        for (int length = this.layers.length - 1; length >= 0; length--) {
            zEquals &= this.layers[length].equals(bCRainbowPrivateKey.getLayers()[length]);
        }
        return zEquals;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    public short[] getB1() {
        return this.b1;
    }

    public short[] getB2() {
        return this.b2;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new pwe(new tz(n1e.rainbow, rj4.INSTANCE), new l9f(this.A1inv, this.b1, this.A2inv, this.b2, this.vi, this.layers)).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public rua[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.vi;
    }

    public int hashCode() {
        int length = (((((((((this.layers.length * 37) + eh0.v(this.A1inv)) * 37) + eh0.u(this.b1)) * 37) + eh0.v(this.A2inv)) * 37) + eh0.u(this.b2)) * 37) + eh0.r(this.vi);
        for (int length2 = this.layers.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.layers[length2].hashCode();
        }
        return length;
    }

    public BCRainbowPrivateKey(n9f n9fVar) {
        this(n9fVar.c(), n9fVar.a(), n9fVar.d(), n9fVar.b(), n9fVar.f(), n9fVar.e());
    }

    public BCRainbowPrivateKey(m9f m9fVar) {
        throw null;
    }
}
