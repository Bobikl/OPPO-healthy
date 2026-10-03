package org.spongycastle.pqc.jcajce.provider.newhope;

import com.oplus.aiunit.vision.dec;
import com.oplus.aiunit.vision.eb3;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import java.io.IOException;
import org.spongycastle.pqc.jcajce.interfaces.NHPublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class BCNHPublicKey implements NHPublicKey {
    private static final long serialVersionUID = 1;
    private final dec params;

    public BCNHPublicKey(dec decVar) {
        this.params = decVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return eh0.a(this.params.b(), ((BCNHPublicKey) obj).params.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new t2j(new tz(n1e.newHope), this.params.b()).d();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public eb3 getKeyParams() {
        return this.params;
    }

    @Override // org.spongycastle.pqc.jcajce.interfaces.NHPublicKey
    public byte[] getPublicData() {
        return this.params.b();
    }

    public int hashCode() {
        return eh0.p(this.params.b());
    }

    public BCNHPublicKey(t2j t2jVar) {
        this.params = new dec(t2jVar.i().o());
    }
}
