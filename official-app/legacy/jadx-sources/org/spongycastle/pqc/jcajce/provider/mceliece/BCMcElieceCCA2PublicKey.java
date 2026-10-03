package org.spongycastle.pqc.jcajce.provider.mceliece;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.h18;
import com.oplus.aiunit.vision.jrk;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.pi0;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.vob;
import com.oplus.aiunit.vision.wob;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCMcElieceCCA2PublicKey implements eb3, PublicKey {
    private static final long serialVersionUID = 1;
    private wob params;

    public BCMcElieceCCA2PublicKey(wob wobVar) {
        this.params = wobVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
        return this.params.e() == bCMcElieceCCA2PublicKey.getN() && this.params.f() == bCMcElieceCCA2PublicKey.getT() && this.params.c().equals(bCMcElieceCCA2PublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t2j(new tz(n1e.mcElieceCca2), new vob(this.params.e(), this.params.f(), this.params.c(), jrk.a(this.params.b()))).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public h18 getG() {
        return this.params.c();
    }

    public int getK() {
        return this.params.d();
    }

    public pi0 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.e();
    }

    public int getT() {
        return this.params.f();
    }

    public int hashCode() {
        return ((this.params.e() + (this.params.f() * 37)) * 37) + this.params.c().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.params.e() + Weather.SEPARATOR) + " error correction capability: " + this.params.f() + Weather.SEPARATOR) + " generator matrix           : " + this.params.c().toString();
    }
}
