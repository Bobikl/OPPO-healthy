package org.spongycastle.jce.provider;

import com.oplus.aiunit.vision.k1;
import com.oplus.aiunit.vision.pi6;
import com.oplus.aiunit.vision.qi6;
import com.oplus.aiunit.vision.roa;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.ti6;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.ui6;
import com.oplus.aiunit.vision.y2d;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private qi6 elSpec;
    private BigInteger y;

    public JCEElGamalPublicKey(ui6 ui6Var) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new qi6((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return roa.c(new tz(y2d.elGamalAlgorithm, new pi6(this.elSpec.b(), this.elSpec.a())), new k1(this.y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPublicKey
    public qi6 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new qi6(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new qi6(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(ti6 ti6Var) {
        throw null;
    }

    public JCEElGamalPublicKey(BigInteger bigInteger, qi6 qi6Var) {
        this.y = bigInteger;
        this.elSpec = qi6Var;
    }

    public JCEElGamalPublicKey(t2j t2jVar) {
        pi6 pi6VarG = pi6.g(t2jVar.f().h());
        try {
            this.y = ((k1) t2jVar.j()).o();
            this.elSpec = new qi6(pi6VarG.h(), pi6VarG.f());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
