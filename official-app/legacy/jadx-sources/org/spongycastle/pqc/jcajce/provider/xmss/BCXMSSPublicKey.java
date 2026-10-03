package org.spongycastle.pqc.jcajce.provider.xmss;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.l6m;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.rs5;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.t6m;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.v6m;
import com.oplus.aiunit.vision.w6m;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCXMSSPublicKey implements PublicKey {
    private final w6m keyParams;
    private final n1 treeDigest;

    public BCXMSSPublicKey(n1 n1Var, w6m w6mVar) {
        this.treeDigest = n1Var;
        this.keyParams = w6mVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPublicKey)) {
            return false;
        }
        BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
        return this.treeDigest.equals(bCXMSSPublicKey.treeDigest) && eh0.a(this.keyParams.e(), bCXMSSPublicKey.keyParams.e());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t2j(new tz(n1e.xmss, new l6m(this.keyParams.b().d(), new tz(this.treeDigest))), new v6m(this.keyParams.c(), this.keyParams.d())).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int getHeight() {
        return this.keyParams.b().d();
    }

    public eb3 getKeyParams() {
        return this.keyParams;
    }

    public String getTreeDigest() {
        return rs5.b(this.treeDigest);
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (eh0.p(this.keyParams.e()) * 37);
    }

    public BCXMSSPublicKey(t2j t2jVar) throws IOException {
        l6m l6mVarG = l6m.g(t2jVar.f().h());
        n1 n1VarF = l6mVarG.h().f();
        this.treeDigest = n1VarF;
        v6m v6mVarF = v6m.f(t2jVar.j());
        this.keyParams = new w6m.b(new t6m(l6mVarG.f(), rs5.a(n1VarF))).f(v6mVarF.g()).g(v6mVarF.h()).e();
    }
}
