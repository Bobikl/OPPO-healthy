package org.spongycastle.pqc.jcajce.provider.xmss;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.n6m;
import com.oplus.aiunit.vision.o6m;
import com.oplus.aiunit.vision.p6m;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.q6m;
import com.oplus.aiunit.vision.rs5;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.u6m;
import com.oplus.aiunit.vision.x6m;
import java.io.IOException;
import java.security.PrivateKey;
import org.spongycastle.pqc.crypto.xmss.BDSStateMap;

/* JADX INFO: loaded from: classes11.dex */
public class BCXMSSMTPrivateKey implements PrivateKey {
    private final q6m keyParams;
    private final n1 treeDigest;

    public BCXMSSMTPrivateKey(n1 n1Var, q6m q6mVar) {
        this.treeDigest = n1Var;
        this.keyParams = q6mVar;
    }

    private p6m createKeyStructure() {
        byte[] bArrC = this.keyParams.c();
        int iB = this.keyParams.b().b();
        int iC = this.keyParams.b().c();
        int i = (iC + 7) / 8;
        int iA = (int) x6m.a(bArrC, 0, i);
        if (!x6m.l(iC, iA)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        int i2 = i + 0;
        byte[] bArrG = x6m.g(bArrC, i2, iB);
        int i3 = i2 + iB;
        byte[] bArrG2 = x6m.g(bArrC, i3, iB);
        int i4 = i3 + iB;
        byte[] bArrG3 = x6m.g(bArrC, i4, iB);
        int i5 = i4 + iB;
        byte[] bArrG4 = x6m.g(bArrC, i5, iB);
        int i6 = i5 + iB;
        return new p6m(iA, bArrG, bArrG2, bArrG3, bArrG4, x6m.g(bArrC, i6, bArrC.length - i6));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPrivateKey)) {
            return false;
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) obj;
        return this.treeDigest.equals(bCXMSSMTPrivateKey.treeDigest) && eh0.a(this.keyParams.c(), bCXMSSMTPrivateKey.keyParams.c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new pwe(new tz(n1e.xmss_mt, new n6m(this.keyParams.b().c(), this.keyParams.b().d(), new tz(this.treeDigest))), createKeyStructure()).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    public n1 getTreeDigestOID() {
        return this.treeDigest;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (eh0.p(this.keyParams.c()) * 37);
    }

    public BCXMSSMTPrivateKey(pwe pweVar) throws IOException {
        n6m n6mVarG = n6m.g(pweVar.h().h());
        n1 n1VarF = n6mVarG.i().f();
        this.treeDigest = n1VarF;
        u6m u6mVarH = u6m.h(pweVar.i());
        try {
            q6m.b bVarN = new q6m.b(new o6m(n6mVarG.f(), n6mVarG.h(), rs5.a(n1VarF))).l(u6mVarH.g()).p(u6mVarH.l()).o(u6mVarH.k()).m(u6mVarH.i()).n(u6mVarH.j());
            if (u6mVarH.f() != null) {
                bVarN.k((BDSStateMap) x6m.f(u6mVarH.f()));
            }
            this.keyParams = bVarN.j();
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }
}
