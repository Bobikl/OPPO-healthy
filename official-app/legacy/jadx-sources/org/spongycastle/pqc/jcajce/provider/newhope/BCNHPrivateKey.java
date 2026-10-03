package org.spongycastle.pqc.jcajce.provider.newhope;

import com.oplus.aiunit.vision.cec;
import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.h2e;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.o1;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.tj4;
import com.oplus.aiunit.vision.tz;
import java.io.IOException;
import org.spongycastle.pqc.jcajce.interfaces.NHPrivateKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCNHPrivateKey implements NHPrivateKey {
    private static final long serialVersionUID = 1;
    private final cec params;

    public BCNHPrivateKey(cec cecVar) {
        this.params = cecVar;
    }

    private static short[] convert(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = h2e.g(bArr, i * 2);
        }
        return sArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPrivateKey)) {
            return false;
        }
        return eh0.d(this.params.b(), ((BCNHPrivateKey) obj).params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            tz tzVar = new tz(n1e.newHope);
            short[] sArrB = this.params.b();
            byte[] bArr = new byte[sArrB.length * 2];
            for (int i = 0; i != sArrB.length; i++) {
                h2e.m(sArrB[i], bArr, i * 2);
            }
            return new pwe(tzVar, new tj4(bArr)).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public eb3 getKeyParams() {
        return this.params;
    }

    @Override // org.spongycastle.pqc.jcajce.interfaces.NHPrivateKey
    public short[] getSecretData() {
        return this.params.b();
    }

    public int hashCode() {
        return eh0.u(this.params.b());
    }

    public BCNHPrivateKey(pwe pweVar) throws IOException {
        this.params = new cec(convert(o1.n(pweVar.i()).o()));
    }
}
