package org.spongycastle.jce.provider;

import com.oplus.aiunit.vision.f1;
import com.oplus.aiunit.vision.k1;
import com.oplus.aiunit.vision.n5m;
import com.oplus.aiunit.vision.rj4;
import com.oplus.aiunit.vision.so4;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.vo4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class JDKDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private DSAParams dsaSpec;
    private BigInteger y;

    public JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    private boolean isNotNull(f1 f1Var) {
        return (f1Var == null || rj4.INSTANCE.equals(f1Var)) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.y = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.y);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            DSAParams dSAParams = this.dsaSpec;
            return dSAParams == null ? new t2j(new tz(n5m.id_dsa), new k1(this.y)).e("DER") : new t2j(new tz(n5m.id_dsa, new so4(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new k1(this.y)).e("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return getParams().getQ().hashCode() ^ ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = Strings.d();
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    public JDKDSAPublicKey(vo4 vo4Var) {
        this.y = vo4Var.c();
        this.dsaSpec = new DSAParameterSpec(vo4Var.b().b(), vo4Var.b().c(), vo4Var.b().a());
    }

    public JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    public JDKDSAPublicKey(t2j t2jVar) {
        try {
            this.y = ((k1) t2jVar.j()).o();
            if (isNotNull(t2jVar.f().h())) {
                so4 so4VarG = so4.g(t2jVar.f().h());
                this.dsaSpec = new DSAParameterSpec(so4VarG.h(), so4VarG.i(), so4VarG.f());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
