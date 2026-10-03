package org.spongycastle.jce.provider;

import com.oplus.aiunit.vision.f1;
import com.oplus.aiunit.vision.f1e;
import com.oplus.aiunit.vision.g1e;
import com.oplus.aiunit.vision.k1;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n5m;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.so4;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.uo4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class JDKDSAPrivateKey implements DSAPrivateKey, f1e {
    private static final long serialVersionUID = -4677259546958385734L;
    private g1e attrCarrier = new g1e();
    DSAParams dsaSpec;
    BigInteger x;

    public JDKDSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.x = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        g1e g1eVar = new g1e();
        this.attrCarrier = g1eVar;
        g1eVar.a(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.x);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
        this.attrCarrier.b(objectOutputStream);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
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
        try {
            return new pwe(new tz(n5m.id_dsa, new so4(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new k1(getX())).e("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return getParams().getQ().hashCode() ^ ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    @Override // com.oplus.aiunit.vision.f1e
    public void setBagAttribute(n1 n1Var, f1 f1Var) {
        this.attrCarrier.setBagAttribute(n1Var, f1Var);
    }

    public JDKDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public JDKDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public JDKDSAPrivateKey(pwe pweVar) throws IOException {
        so4 so4VarG = so4.g(pweVar.h().h());
        this.x = k1.m(pweVar.i()).o();
        this.dsaSpec = new DSAParameterSpec(so4VarG.h(), so4VarG.i(), so4VarG.f());
    }

    public JDKDSAPrivateKey(uo4 uo4Var) {
        throw null;
    }
}
