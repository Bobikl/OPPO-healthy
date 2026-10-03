package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c1 extends r1 implements x1 {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9911j;

    public c1(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.i = eh0.e(bArr);
        this.f9911j = i;
    }

    public static byte[] m(byte[] bArr, int i) {
        byte[] bArrE = eh0.e(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrE[length] = (byte) ((255 << i) & bArrE[length]);
        }
        return bArrE;
    }

    public static c1 n(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = inputStream.read();
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            if (pwi.c(inputStream, bArr) != i3) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (i2 > 0 && i2 < 8) {
                byte b = bArr[i3 - 1];
                if (b != ((byte) ((255 << i2) & b))) {
                    return new qk4(bArr, i2);
                }
            }
        }
        return new kj4(bArr, i2);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (!(r1Var instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) r1Var;
        return this.f9911j == c1Var.f9911j && eh0.a(o(), c1Var.o());
    }

    @Override // com.oplus.aiunit.vision.x1
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new q1(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = k;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e2) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e2.getMessage(), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return eh0.p(o()) ^ this.f9911j;
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 k() {
        return new kj4(this.i, this.f9911j);
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 l() {
        return new qk4(this.i, this.f9911j);
    }

    public byte[] o() {
        return m(this.i, this.f9911j);
    }

    public byte[] p() {
        if (this.f9911j == 0) {
            return eh0.e(this.i);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int q() {
        return this.f9911j;
    }

    public String toString() {
        return getString();
    }
}
