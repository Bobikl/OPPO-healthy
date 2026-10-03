package org.oconscrypt;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class ScryptKeySpec implements KeySpec {
    private final int blockSize;
    private final int costParameter;
    private final int keyOutputBits;
    private final int parallelizationParameter;
    private final char[] password;
    private final byte[] salt;

    public ScryptKeySpec(char[] cArr, byte[] bArr, int i, int i2, int i3, int i4) {
        this.password = cArr;
        this.salt = bArr;
        this.costParameter = i;
        this.blockSize = i2;
        this.parallelizationParameter = i3;
        this.keyOutputBits = i4;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getCostParameter() {
        return this.costParameter;
    }

    public int getKeyLength() {
        return this.keyOutputBits;
    }

    public int getParallelizationParameter() {
        return this.parallelizationParameter;
    }

    public char[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return this.salt;
    }
}
