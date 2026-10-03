package org.spongycastle.pqc.jcajce.provider.mceliece;

import com.oplus.aiunit.vision.cpb;
import com.oplus.aiunit.vision.dpb;
import com.oplus.aiunit.vision.h18;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.pi0;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCMcEliecePublicKey implements PublicKey {
    private static final long serialVersionUID = 1;
    private dpb params;

    public BCMcEliecePublicKey(dpb dpbVar) {
        this.params = dpbVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
        return this.params.d() == bCMcEliecePublicKey.getN() && this.params.e() == bCMcEliecePublicKey.getT() && this.params.b().equals(bCMcEliecePublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t2j(new tz(n1e.mcEliece), new cpb(this.params.d(), this.params.e(), this.params.b())).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public h18 getG() {
        return this.params.b();
    }

    public int getK() {
        return this.params.c();
    }

    public pi0 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.d();
    }

    public int getT() {
        return this.params.e();
    }

    public int hashCode() {
        return ((this.params.d() + (this.params.e() * 37)) * 37) + this.params.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.params.d() + Weather.SEPARATOR) + " error correction capability: " + this.params.e() + Weather.SEPARATOR) + " generator matrix           : " + this.params.b();
    }
}
