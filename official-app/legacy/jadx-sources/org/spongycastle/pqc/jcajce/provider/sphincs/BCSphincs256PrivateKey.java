package org.spongycastle.pqc.jcajce.provider.sphincs;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.g9g;
import com.oplus.aiunit.vision.h9g;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.o1;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.tj4;
import com.oplus.aiunit.vision.tz;
import java.io.IOException;
import java.security.PrivateKey;
import org.spongycastle.pqc.jcajce.interfaces.SPHINCSKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey {
    private static final long serialVersionUID = 1;
    private final h9g params;
    private final n1 treeDigest;

    public BCSphincs256PrivateKey(n1 n1Var, h9g h9gVar) {
        this.treeDigest = n1Var;
        this.params = h9gVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.treeDigest.equals(bCSphincs256PrivateKey.treeDigest) && eh0.a(this.params.b(), bCSphincs256PrivateKey.params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new pwe(new tz(n1e.sphincs256, new g9g(new tz(this.treeDigest))), new tj4(this.params.b())).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.spongycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.params.b();
    }

    public eb3 getKeyParams() {
        return this.params;
    }

    public int hashCode() {
        return this.treeDigest.hashCode() + (eh0.p(this.params.b()) * 37);
    }

    public BCSphincs256PrivateKey(pwe pweVar) throws IOException {
        this.treeDigest = g9g.f(pweVar.h().h()).g().f();
        this.params = new h9g(o1.n(pweVar.i()).o());
    }
}
