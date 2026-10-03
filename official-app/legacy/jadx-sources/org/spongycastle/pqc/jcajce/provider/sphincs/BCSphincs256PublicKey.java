package org.spongycastle.pqc.jcajce.provider.sphincs;

import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.g9g;
import com.oplus.aiunit.vision.i9g;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import java.io.IOException;
import java.security.PublicKey;
import org.spongycastle.pqc.jcajce.interfaces.SPHINCSKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {
    private static final long serialVersionUID = 1;
    private final i9g params;
    private final n1 treeDigest;

    public BCSphincs256PublicKey(n1 n1Var, i9g i9gVar) {
        this.treeDigest = n1Var;
        this.params = i9gVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.treeDigest.equals(bCSphincs256PublicKey.treeDigest) && eh0.a(this.params.b(), bCSphincs256PublicKey.params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t2j(new tz(n1e.sphincs256, new g9g(new tz(this.treeDigest))), this.params.b()).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
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

    public BCSphincs256PublicKey(t2j t2jVar) {
        this.treeDigest = g9g.f(t2jVar.f().h()).g().f();
        this.params = new i9g(t2jVar.i().o());
    }
}
