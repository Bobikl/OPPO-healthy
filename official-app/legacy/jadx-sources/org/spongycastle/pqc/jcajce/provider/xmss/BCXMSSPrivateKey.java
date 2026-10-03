package org.spongycastle.pqc.jcajce.provider.xmss;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.l6m;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.rs5;
import com.oplus.aiunit.vision.t6m;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.u6m;
import com.oplus.aiunit.vision.x6m;
import java.io.IOException;
import java.security.PrivateKey;
import org.spongycastle.pqc.crypto.xmss.BDS;
import org.spongycastle.pqc.crypto.xmss.g;

/* JADX INFO: loaded from: classes11.dex */
public class BCXMSSPrivateKey implements PrivateKey {
    private final g keyParams;
    private final n1 treeDigest;

    public BCXMSSPrivateKey(n1 n1Var, g gVar) {
        this.treeDigest = n1Var;
        this.keyParams = gVar;
    }

    private u6m createKeyStructure() {
        byte[] bArrC = this.keyParams.c();
        int iC = this.keyParams.b().c();
        int iD = this.keyParams.b().d();
        int iA = (int) x6m.a(bArrC, 0, 4);
        if (!x6m.l(iD, iA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrG = x6m.g(bArrC, 4, iC);
        int i = 4 + iC;
        byte[] bArrG2 = x6m.g(bArrC, i, iC);
        int i2 = i + iC;
        byte[] bArrG3 = x6m.g(bArrC, i2, iC);
        int i3 = i2 + iC;
        byte[] bArrG4 = x6m.g(bArrC, i3, iC);
        int i4 = i3 + iC;
        return new u6m(iA, bArrG, bArrG2, bArrG3, bArrG4, x6m.g(bArrC, i4, bArrC.length - i4));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.treeDigest.equals(bCXMSSPrivateKey.treeDigest) && eh0.a(this.keyParams.c(), bCXMSSPrivateKey.keyParams.c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new pwe(new tz(n1e.xmss, new l6m(this.keyParams.b().d(), new tz(this.treeDigest))), createKeyStructure()).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    public n1 getTreeDigestOID() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (eh0.p(this.keyParams.c()) * 37);
    }

    public BCXMSSPrivateKey(pwe pweVar) throws IOException {
        l6m l6mVarG = l6m.g(pweVar.h().h());
        n1 n1VarF = l6mVarG.h().f();
        this.treeDigest = n1VarF;
        u6m u6mVarH = u6m.h(pweVar.i());
        try {
            g.b bVarN = new g.b(new t6m(l6mVarG.f(), rs5.a(n1VarF))).l(u6mVarH.g()).p(u6mVarH.l()).o(u6mVarH.k()).m(u6mVarH.i()).n(u6mVarH.j());
            if (u6mVarH.f() != null) {
                bVarN.k((BDS) x6m.f(u6mVarH.f()));
            }
            this.keyParams = bVarN.j();
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }
}
