package org.spongycastle.jcajce.provider.asymmetric.dsa;

import com.oplus.aiunit.vision.f1;
import com.oplus.aiunit.vision.k1;
import com.oplus.aiunit.vision.n5m;
import com.oplus.aiunit.vision.rj4;
import com.oplus.aiunit.vision.roa;
import com.oplus.aiunit.vision.so4;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.vo4;
import com.oplus.aiunit.vision.wo4;
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
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient vo4 lwKeyParams;
    private BigInteger y;

    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new vo4(this.y, wo4.b(this.dsaSpec));
    }

    private boolean isNotNull(f1 f1Var) {
        return (f1Var == null || rj4.INSTANCE.equals(f1Var.c())) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new vo4(this.y, wo4.b(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            objectOutputStream.writeObject(ZERO);
            return;
        }
        objectOutputStream.writeObject(dSAParams.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public vo4 engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        if (this.dsaSpec != null) {
            return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        return dSAParams == null ? roa.c(new tz(n5m.id_dsa), new k1(this.y)) : roa.c(new tz(n5m.id_dsa, new so4(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).c()), new k1(this.y));
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
        if (this.dsaSpec == null) {
            return getY().hashCode();
        }
        return getParams().getQ().hashCode() ^ ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = Strings.d();
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(wo4.a(this.y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new vo4(this.y, wo4.b(this.dsaSpec));
    }

    public BCDSAPublicKey(vo4 vo4Var) {
        this.y = vo4Var.c();
        this.dsaSpec = new DSAParameterSpec(vo4Var.b().b(), vo4Var.b().c(), vo4Var.b().a());
        this.lwKeyParams = vo4Var;
    }

    public BCDSAPublicKey(t2j t2jVar) {
        try {
            this.y = ((k1) t2jVar.j()).o();
            if (isNotNull(t2jVar.f().h())) {
                so4 so4VarG = so4.g(t2jVar.f().h());
                this.dsaSpec = new DSAParameterSpec(so4VarG.h(), so4VarG.i(), so4VarG.f());
            } else {
                this.dsaSpec = null;
            }
            this.lwKeyParams = new vo4(this.y, wo4.b(this.dsaSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
