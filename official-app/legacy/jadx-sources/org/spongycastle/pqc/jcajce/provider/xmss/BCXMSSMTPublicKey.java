package org.spongycastle.pqc.jcajce.provider.xmss;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.n6m;
import com.oplus.aiunit.vision.o6m;
import com.oplus.aiunit.vision.r6m;
import com.oplus.aiunit.vision.rs5;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.v6m;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCXMSSMTPublicKey implements PublicKey {
    private final r6m keyParams;
    private final n1 treeDigest;

    public BCXMSSMTPublicKey(n1 n1Var, r6m r6mVar) {
        this.treeDigest = n1Var;
        this.keyParams = r6mVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.treeDigest.equals(bCXMSSMTPublicKey.treeDigest) && eh0.a(this.keyParams.e(), bCXMSSMTPublicKey.keyParams.e());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t2j(new tz(n1e.xmss_mt, new n6m(this.keyParams.b().c(), this.keyParams.b().d(), new tz(this.treeDigest))), new v6m(this.keyParams.c(), this.keyParams.d())).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int getHeight() {
        return this.keyParams.b().c();
    }

    public eb3 getKeyParams() {
        return this.keyParams;
    }

    public int getLayers() {
        return this.keyParams.b().d();
    }

    public String getTreeDigest() {
        return rs5.b(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (eh0.p(this.keyParams.e()) * 37);
    }

    public BCXMSSMTPublicKey(t2j t2jVar) throws IOException {
        n6m n6mVarG = n6m.g(t2jVar.f().h());
        n1 n1VarF = n6mVarG.i().f();
        this.treeDigest = n1VarF;
        v6m v6mVarF = v6m.f(t2jVar.j());
        this.keyParams = new r6m.b(new o6m(n6mVarG.f(), n6mVarG.h(), rs5.a(n1VarF))).f(v6mVarF.g()).g(v6mVarF.h()).e();
    }
}
