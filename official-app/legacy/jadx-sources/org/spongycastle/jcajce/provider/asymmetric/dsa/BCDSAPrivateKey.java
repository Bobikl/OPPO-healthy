package org.spongycastle.jcajce.provider.asymmetric.dsa;

import com.oplus.aiunit.vision.f1;
import com.oplus.aiunit.vision.f1e;
import com.oplus.aiunit.vision.g1e;
import com.oplus.aiunit.vision.k1;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n5m;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.roa;
import com.oplus.aiunit.vision.so4;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.uo4;
import com.oplus.aiunit.vision.wo4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, f1e {
    private static final long serialVersionUID = -4677259546958385734L;
    private transient g1e attrCarrier = new g1e();
    private transient DSAParams dsaSpec;
    private BigInteger x;

    public BCDSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new g1e();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
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
        return roa.a(new tz(n5m.id_dsa, new so4(this.dsaSpec.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).c()), new k1(getX()));
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

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = Strings.d();
        BigInteger bigIntegerModPow = getParams().getG().modPow(this.x, getParams().getP());
        stringBuffer.append("DSA Private Key [");
        stringBuffer.append(wo4.a(bigIntegerModPow, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(bigIntegerModPow.toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.x = dSAPrivateKey.getX();
        this.dsaSpec = dSAPrivateKey.getParams();
    }

    public BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.x = dSAPrivateKeySpec.getX();
        this.dsaSpec = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(pwe pweVar) throws IOException {
        so4 so4VarG = so4.g(pweVar.h().h());
        this.x = ((k1) pweVar.i()).o();
        this.dsaSpec = new DSAParameterSpec(so4VarG.h(), so4VarG.i(), so4VarG.f());
    }

    public BCDSAPrivateKey(uo4 uo4Var) {
        throw null;
    }
}
