package org.spongycastle.jce.provider;

import com.oplus.aiunit.vision.f1;
import com.oplus.aiunit.vision.f1e;
import com.oplus.aiunit.vision.g1e;
import com.oplus.aiunit.vision.k1;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.pi6;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.qi6;
import com.oplus.aiunit.vision.ri6;
import com.oplus.aiunit.vision.roa;
import com.oplus.aiunit.vision.si6;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.y2d;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;

/* JADX INFO: loaded from: classes11.dex */
public class JCEElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, f1e {
    static final long serialVersionUID = 4819350091141529678L;
    private g1e attrCarrier = new g1e();
    qi6 elSpec;
    BigInteger x;

    public JCEElGamalPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.x = (BigInteger) objectInputStream.readObject();
        this.elSpec = new qi6((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // com.oplus.aiunit.vision.f1e
    public f1 getBagAttribute(n1 n1Var) {
        return this.attrCarrier.getBagAttribute(n1Var);
    }

    @Override // com.oplus.aiunit.vision.f1e
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return roa.a(new tz(y2d.elGamalAlgorithm, new pi6(this.elSpec.b(), this.elSpec.a())), new k1(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPrivateKey
    public qi6 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    @Override // com.oplus.aiunit.vision.f1e
    public void setBagAttribute(n1 n1Var, f1 f1Var) {
        this.attrCarrier.setBagAttribute(n1Var, f1Var);
    }

    public JCEElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }

    public JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new qi6(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public JCEElGamalPrivateKey(si6 si6Var) {
        throw null;
    }

    public JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new qi6(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEElGamalPrivateKey(pwe pweVar) throws IOException {
        pi6 pi6VarG = pi6.g(pweVar.h().h());
        this.x = k1.m(pweVar.i()).o();
        this.elSpec = new qi6(pi6VarG.h(), pi6VarG.f());
    }

    public JCEElGamalPrivateKey(ri6 ri6Var) {
        throw null;
    }
}
