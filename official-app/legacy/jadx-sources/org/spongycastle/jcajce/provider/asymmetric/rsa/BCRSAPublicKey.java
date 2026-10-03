package org.spongycastle.jcajce.provider.asymmetric.rsa;

import com.oplus.aiunit.vision.b9f;
import com.oplus.aiunit.vision.c9f;
import com.oplus.aiunit.vision.h1e;
import com.oplus.aiunit.vision.rj4;
import com.oplus.aiunit.vision.roa;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.tz;
import com.oplus.aiunit.vision.y8f;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class BCRSAPublicKey implements RSAPublicKey {
    private static final tz DEFAULT_ALGORITHM_IDENTIFIER = new tz(h1e.rsaEncryption, rj4.INSTANCE);
    static final long serialVersionUID = 2675817738516720772L;
    private transient tz algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;

    public BCRSAPublicKey(y8f y8fVar) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        throw null;
    }

    private void populateFromPublicKeyInfo(t2j t2jVar) {
        try {
            b9f b9fVarF = b9f.f(t2jVar.j());
            this.algorithmIdentifier = t2jVar.f();
            this.modulus = b9fVarF.g();
            this.publicExponent = b9fVarF.h();
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = tz.g(objectInputStream.readObject());
        } catch (Exception unused) {
            this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.algorithmIdentifier.equals(DEFAULT_ALGORITHM_IDENTIFIER)) {
            return;
        }
        objectOutputStream.writeObject(this.algorithmIdentifier.d());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return roa.c(this.algorithmIdentifier, new b9f(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getPublicExponent().hashCode() ^ getModulus().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = Strings.d();
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(c9f.a(getModulus(), getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
    }

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
    }

    public BCRSAPublicKey(t2j t2jVar) {
        populateFromPublicKeyInfo(t2jVar);
    }
}
