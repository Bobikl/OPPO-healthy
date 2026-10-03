package org.spongycastle.jcajce.provider.asymmetric.rsa;

import com.oplus.aiunit.vision.a9f;
import com.oplus.aiunit.vision.f1;
import com.oplus.aiunit.vision.f1e;
import com.oplus.aiunit.vision.g1e;
import com.oplus.aiunit.vision.h1e;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.rj4;
import com.oplus.aiunit.vision.roa;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.y8f;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, f1e {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    private transient g1e attrCarrier = new g1e();
    protected BigInteger modulus;
    protected BigInteger privateExponent;

    public BCRSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new g1e();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "RSA";
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
        tz tzVar = new tz(h1e.rsaEncryption, rj4.INSTANCE);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return roa.a(tzVar, new a9f(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getPrivateExponent().hashCode() ^ getModulus().hashCode();
    }

    @Override // com.oplus.aiunit.vision.f1e
    public void setBagAttribute(n1 n1Var, f1 f1Var) {
        this.attrCarrier.setBagAttribute(n1Var, f1Var);
    }

    public BCRSAPrivateKey(y8f y8fVar) {
        throw null;
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
    }

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
    }

    public BCRSAPrivateKey(a9f a9fVar) {
        this.modulus = a9fVar.j();
        this.privateExponent = a9fVar.m();
    }
}
