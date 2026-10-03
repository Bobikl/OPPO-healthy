package org.spongycastle.pqc.jcajce.provider.mceliece;

import com.oplus.aiunit.vision.apb;
import com.oplus.aiunit.vision.bpb;
import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.ege;
import com.oplus.aiunit.vision.fne;
import com.oplus.aiunit.vision.h18;
import com.oplus.aiunit.vision.j18;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.pi0;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.tz;
import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCMcEliecePrivateKey implements eb3, PrivateKey {
    private static final long serialVersionUID = 1;
    private bpb params;

    public BCMcEliecePrivateKey(bpb bpbVar) {
        this.params = bpbVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new pwe(new tz(n1e.mcEliece), new apb(this.params.f(), this.params.e(), this.params.b(), this.params.c(), this.params.g(), this.params.h(), this.params.j())).d();
        } catch (IOException unused) {
            return null;
        }
    }

    public j18 getField() {
        return this.params.b();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public fne getGoppaPoly() {
        return this.params.c();
    }

    public h18 getH() {
        return this.params.d();
    }

    public int getK() {
        return this.params.e();
    }

    public pi0 getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.f();
    }

    public ege getP1() {
        return this.params.g();
    }

    public ege getP2() {
        return this.params.h();
    }

    public fne[] getQInv() {
        return this.params.i();
    }

    public h18 getSInv() {
        return this.params.j();
    }

    public int hashCode() {
        return (((((((((((this.params.e() * 37) + this.params.f()) * 37) + this.params.b().hashCode()) * 37) + this.params.c().hashCode()) * 37) + this.params.g().hashCode()) * 37) + this.params.h().hashCode()) * 37) + this.params.j().hashCode();
    }
}
