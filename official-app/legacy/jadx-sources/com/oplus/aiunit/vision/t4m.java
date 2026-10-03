package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class t4m extends ska {
    public static final char[] J = a83.d();
    public final Writer A;
    public char B;
    public char[] C;
    public int D;
    public int E;
    public int F;
    public char[] G;
    public wtg H;
    public char[] I;

    public t4m(ht9 ht9Var, int i, yad yadVar, Writer writer, char c2) {
        super(ht9Var, i, yadVar);
        this.A = writer;
        char[] cArrE = ht9Var.e();
        this.C = cArrE;
        this.F = cArrE.length;
        this.B = c2;
        if (c2 != '\"') {
            this.t = a83.f(c2);
        }
    }

    @Override // com.oplus.aiunit.vision.u48
    public final void C0(String str) throws IOException {
        char c2;
        int iX = this.p.x();
        if (this.i != null) {
            E0(str, iX);
            return;
        }
        if (iX == 1) {
            c2 = StringUtil.COMMA;
        } else {
            if (iX != 2) {
                if (iX != 3) {
                    if (iX != 5) {
                        return;
                    }
                    D0(str);
                    return;
                } else {
                    wtg wtgVar = this.w;
                    if (wtgVar != null) {
                        h0(wtgVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c2 = ':';
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = c2;
    }

    public final char[] F0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.G = cArr;
        return cArr;
    }

    public final void G0(char c2, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            if (this.E + 2 > this.F) {
                H0();
            }
            char[] cArr = this.C;
            int i3 = this.E;
            int i4 = i3 + 1;
            cArr[i3] = '\\';
            this.E = i4 + 1;
            cArr[i4] = (char) i;
            return;
        }
        if (i == -2) {
            wtg wtgVar = this.H;
            if (wtgVar == null) {
                value = this.v.getEscapeSequence(c2).getValue();
            } else {
                value = wtgVar.getValue();
                this.H = null;
            }
            int length = value.length();
            if (this.E + length > this.F) {
                H0();
                if (length > this.F) {
                    this.A.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.C, this.E);
            this.E += length;
            return;
        }
        if (this.E + 5 >= this.F) {
            H0();
        }
        int i5 = this.E;
        char[] cArr2 = this.C;
        int i6 = i5 + 1;
        cArr2[i5] = '\\';
        int i7 = i6 + 1;
        cArr2[i6] = 'u';
        if (c2 > 255) {
            int i8 = 255 & (c2 >> '\b');
            int i9 = i7 + 1;
            char[] cArr3 = J;
            cArr2[i7] = cArr3[i8 >> 4];
            i2 = i9 + 1;
            cArr2[i9] = cArr3[i8 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i10 = i7 + 1;
            cArr2[i7] = '0';
            i2 = i10 + 1;
            cArr2[i10] = '0';
        }
        int i11 = i2 + 1;
        char[] cArr4 = J;
        cArr2[i2] = cArr4[c2 >> 4];
        cArr2[i11] = cArr4[c2 & 15];
        this.E = i11 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int H(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        C0("write a binary value");
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr[i2] = this.B;
        byte[] bArrD = this.s.d();
        try {
            if (i < 0) {
                i = M0(base64Variant, inputStream, bArrD);
            } else {
                int iN0 = N0(base64Variant, inputStream, bArrD, i);
                if (iN0 > 0) {
                    a("Too few bytes available: missing " + iN0 + " bytes (out of " + i + ")");
                }
            }
            this.s.o(bArrD);
            if (this.E >= this.F) {
                H0();
            }
            char[] cArr2 = this.C;
            int i3 = this.E;
            this.E = i3 + 1;
            cArr2[i3] = this.B;
            return i;
        } catch (Throwable th) {
            this.s.o(bArrD);
            throw th;
        }
    }

    public void H0() throws IOException {
        int i = this.E;
        int i2 = this.D;
        int i3 = i - i2;
        if (i3 > 0) {
            this.D = 0;
            this.E = 0;
            this.A.write(this.C, i2, i3);
        }
    }

    public final int I0(char[] cArr, int i, int i2, char c2, int i3) throws IOException {
        String value;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i3;
                return i5;
            }
            char[] cArrF0 = this.G;
            if (cArrF0 == null) {
                cArrF0 = F0();
            }
            cArrF0[1] = (char) i3;
            this.A.write(cArrF0, 0, 2);
            return i;
        }
        if (i3 == -2) {
            wtg wtgVar = this.H;
            if (wtgVar == null) {
                value = this.v.getEscapeSequence(c2).getValue();
            } else {
                value = wtgVar.getValue();
                this.H = null;
            }
            int length = value.length();
            if (i < length || i >= i2) {
                this.A.write(value);
                return i;
            }
            int i6 = i - length;
            value.getChars(0, length, cArr, i6);
            return i6;
        }
        if (i <= 5 || i >= i2) {
            char[] cArrF1 = this.G;
            if (cArrF1 == null) {
                cArrF1 = F0();
            }
            this.D = this.E;
            if (c2 <= 255) {
                char[] cArr2 = J;
                cArrF1[6] = cArr2[c2 >> 4];
                cArrF1[7] = cArr2[c2 & 15];
                this.A.write(cArrF1, 2, 6);
                return i;
            }
            int i7 = (c2 >> '\b') & 255;
            int i8 = c2 & 255;
            char[] cArr3 = J;
            cArrF1[10] = cArr3[i7 >> 4];
            cArrF1[11] = cArr3[i7 & 15];
            cArrF1[12] = cArr3[i8 >> 4];
            cArrF1[13] = cArr3[i8 & 15];
            this.A.write(cArrF1, 8, 6);
            return i;
        }
        int i9 = i - 6;
        int i10 = i9 + 1;
        cArr[i9] = '\\';
        int i11 = i10 + 1;
        cArr[i10] = 'u';
        if (c2 > 255) {
            int i12 = (c2 >> '\b') & 255;
            int i13 = i11 + 1;
            char[] cArr4 = J;
            cArr[i11] = cArr4[i12 >> 4];
            i4 = i13 + 1;
            cArr[i13] = cArr4[i12 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i14 = i11 + 1;
            cArr[i11] = '0';
            i4 = i14 + 1;
            cArr[i14] = '0';
        }
        int i15 = i4 + 1;
        char[] cArr5 = J;
        cArr[i4] = cArr5[c2 >> 4];
        cArr[i15] = cArr5[c2 & 15];
        return i15 - 5;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void J(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        C0("write a binary value");
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i3 = this.E;
        this.E = i3 + 1;
        cArr[i3] = this.B;
        O0(base64Variant, bArr, i, i2 + i);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i4 = this.E;
        this.E = i4 + 1;
        cArr2[i4] = this.B;
    }

    public final void J0(char c2, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            int i3 = this.E;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.D = i4;
                char[] cArr = this.C;
                cArr[i4] = '\\';
                cArr[i4 + 1] = (char) i;
                return;
            }
            char[] cArrF0 = this.G;
            if (cArrF0 == null) {
                cArrF0 = F0();
            }
            this.D = this.E;
            cArrF0[1] = (char) i;
            this.A.write(cArrF0, 0, 2);
            return;
        }
        if (i == -2) {
            wtg wtgVar = this.H;
            if (wtgVar == null) {
                value = this.v.getEscapeSequence(c2).getValue();
            } else {
                value = wtgVar.getValue();
                this.H = null;
            }
            int length = value.length();
            int i5 = this.E;
            if (i5 < length) {
                this.D = i5;
                this.A.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this.D = i6;
                value.getChars(0, length, this.C, i6);
                return;
            }
        }
        int i7 = this.E;
        if (i7 < 6) {
            char[] cArrF1 = this.G;
            if (cArrF1 == null) {
                cArrF1 = F0();
            }
            this.D = this.E;
            if (c2 <= 255) {
                char[] cArr2 = J;
                cArrF1[6] = cArr2[c2 >> 4];
                cArrF1[7] = cArr2[c2 & 15];
                this.A.write(cArrF1, 2, 6);
                return;
            }
            int i8 = (c2 >> '\b') & 255;
            int i9 = c2 & 255;
            char[] cArr3 = J;
            cArrF1[10] = cArr3[i8 >> 4];
            cArrF1[11] = cArr3[i8 & 15];
            cArrF1[12] = cArr3[i9 >> 4];
            cArrF1[13] = cArr3[i9 & 15];
            this.A.write(cArrF1, 8, 6);
            return;
        }
        char[] cArr4 = this.C;
        int i10 = i7 - 6;
        this.D = i10;
        cArr4[i10] = '\\';
        int i11 = i10 + 1;
        cArr4[i11] = 'u';
        if (c2 > 255) {
            int i12 = (c2 >> '\b') & 255;
            int i13 = i11 + 1;
            char[] cArr5 = J;
            cArr4[i13] = cArr5[i12 >> 4];
            i2 = i13 + 1;
            cArr4[i2] = cArr5[i12 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i14 = i11 + 1;
            cArr4[i14] = '0';
            i2 = i14 + 1;
            cArr4[i2] = '0';
        }
        int i15 = i2 + 1;
        char[] cArr6 = J;
        cArr4[i15] = cArr6[c2 >> 4];
        cArr4[i15 + 1] = cArr6[c2 & 15];
    }

    public final int K0(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i5 = iMin - i4;
            if (i5 == 0) {
                break;
            }
            int i6 = inputStream.read(bArr, i4, i5);
            if (i6 < 0) {
                return i4;
            }
            i4 += i6;
        } while (i4 < 3);
        return i4;
    }

    public void L0() {
        char[] cArr = this.C;
        if (cArr != null) {
            this.C = null;
            this.s.p(cArr);
        }
        char[] cArr2 = this.I;
        if (cArr2 != null) {
            this.I = null;
            this.s.q(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void M(boolean z) throws IOException {
        int i;
        C0("write a boolean value");
        if (this.E + 5 >= this.F) {
            H0();
        }
        int i2 = this.E;
        char[] cArr = this.C;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.E = i + 1;
    }

    public final int M0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.F - 6;
        int i2 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int iK0 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i3) {
                iK0 = K0(inputStream, bArr, i4, iK0, bArr.length);
                if (iK0 < 3) {
                    break;
                }
                i3 = iK0 - 3;
                i4 = 0;
            }
            if (this.E > i) {
                H0();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i5 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.C, this.E);
            this.E = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.C;
                int i9 = iEncodeBase64Chunk + 1;
                cArr[iEncodeBase64Chunk] = '\\';
                this.E = i9 + 1;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iK0 <= 0) {
            return i5;
        }
        if (this.E > i) {
            H0();
        }
        int i10 = bArr[0] << 16;
        if (1 < iK0) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i5 + i2;
        this.E = base64Variant.encodeBase64Partial(i10, i2, this.C, this.E);
        return i11;
    }

    public final int N0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iK0;
        int i2 = this.F - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int iK1 = 0;
        while (i > 2) {
            if (i5 > i4) {
                iK1 = K0(inputStream, bArr, i5, iK1, i);
                if (iK1 < 3) {
                    i5 = 0;
                    break;
                }
                i4 = iK1 - 3;
                i5 = 0;
            }
            if (this.E > i2) {
                H0();
            }
            int i6 = i5 + 1;
            int i7 = bArr[i5] << 8;
            int i8 = i6 + 1;
            i5 = i8 + 1;
            i -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.C, this.E);
            this.E = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.C;
                int i9 = iEncodeBase64Chunk + 1;
                cArr[iEncodeBase64Chunk] = '\\';
                this.E = i9 + 1;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0 || (iK0 = K0(inputStream, bArr, i5, iK1, i)) <= 0) {
            return i;
        }
        if (this.E > i2) {
            H0();
        }
        int i10 = bArr[0] << 16;
        if (1 < iK0) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.E = base64Variant.encodeBase64Partial(i10, i3, this.C, this.E);
        return i - i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void O() throws IOException {
        if (!this.p.f()) {
            a("Current context not Array but " + this.p.j());
        }
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeEndArray(this, this.p.d());
        } else {
            if (this.E >= this.F) {
                H0();
            }
            char[] cArr = this.C;
            int i = this.E;
            this.E = i + 1;
            cArr[i] = ']';
        }
        this.p = this.p.l();
    }

    public final void O0(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 - 3;
        int i4 = this.F - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this.E > i4) {
                H0();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i] << 8) | (bArr[i5] & 255)) << 8;
            int i8 = i6 + 1;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this.C, this.E);
            this.E = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.C;
                int i9 = iEncodeBase64Chunk + 1;
                cArr[iEncodeBase64Chunk] = '\\';
                this.E = i9 + 1;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i8;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this.E > i4) {
                H0();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this.E = base64Variant.encodeBase64Partial(i12, i10, this.C, this.E);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void P() throws IOException {
        if (!this.p.g()) {
            a("Current context not Object but " + this.p.j());
        }
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeEndObject(this, this.p.d());
        } else {
            if (this.E >= this.F) {
                H0();
            }
            char[] cArr = this.C;
            int i = this.E;
            this.E = i + 1;
            cArr[i] = '}';
        }
        this.p = this.p.l();
    }

    public final void P0(wtg wtgVar, boolean z) throws IOException {
        if (this.i != null) {
            U0(wtgVar, z);
            return;
        }
        if (this.E + 1 >= this.F) {
            H0();
        }
        if (z) {
            char[] cArr = this.C;
            int i = this.E;
            this.E = i + 1;
            cArr[i] = StringUtil.COMMA;
        }
        if (this.x) {
            char[] cArrAsQuotedChars = wtgVar.asQuotedChars();
            i0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this.C;
        int i2 = this.E;
        int i3 = i2 + 1;
        this.E = i3;
        cArr2[i2] = this.B;
        int iAppendQuoted = wtgVar.appendQuoted(cArr2, i3);
        if (iAppendQuoted < 0) {
            R0(wtgVar);
            return;
        }
        int i4 = this.E + iAppendQuoted;
        this.E = i4;
        if (i4 >= this.F) {
            H0();
        }
        char[] cArr3 = this.C;
        int i5 = this.E;
        this.E = i5 + 1;
        cArr3[i5] = this.B;
    }

    public final void Q0(String str, boolean z) throws IOException {
        if (this.i != null) {
            V0(str, z);
            return;
        }
        if (this.E + 1 >= this.F) {
            H0();
        }
        if (z) {
            char[] cArr = this.C;
            int i = this.E;
            this.E = i + 1;
            cArr[i] = StringUtil.COMMA;
        }
        if (this.x) {
            d1(str);
            return;
        }
        char[] cArr2 = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr2[i2] = this.B;
        d1(str);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr3 = this.C;
        int i3 = this.E;
        this.E = i3 + 1;
        cArr3[i3] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void R(wtg wtgVar) throws IOException {
        int iW = this.p.w(wtgVar.getValue());
        if (iW == 4) {
            a("Can not write a field name, expecting a value");
        }
        P0(wtgVar, iW == 1);
    }

    public final void R0(wtg wtgVar) throws IOException {
        char[] cArrAsQuotedChars = wtgVar.asQuotedChars();
        i0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void S(String str) throws IOException {
        int iW = this.p.w(str);
        if (iW == 4) {
            a("Can not write a field name, expecting a value");
        }
        Q0(str, iW == 1);
    }

    public final void S0(String str) throws IOException {
        H0();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.F;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.C, 0);
            if (this.v != null) {
                c1(i2);
            } else {
                int i4 = this.u;
                if (i4 != 0) {
                    b1(i2, i4);
                } else {
                    a1(i2);
                }
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void T() throws IOException {
        C0("write a null");
        T0();
    }

    public final void T0() throws IOException {
        if (this.E + 4 >= this.F) {
            H0();
        }
        int i = this.E;
        char[] cArr = this.C;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.E = i4 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void U(double d) throws IOException {
        if (this.o || (nzc.o(d) && v(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            t0(String.valueOf(d));
        } else {
            C0("write a number");
            h0(String.valueOf(d));
        }
    }

    public final void U0(wtg wtgVar, boolean z) throws IOException {
        if (z) {
            this.i.writeObjectEntrySeparator(this);
        } else {
            this.i.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = wtgVar.asQuotedChars();
        if (this.x) {
            i0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = this.B;
        i0(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void V(float f) throws IOException {
        if (this.o || (nzc.p(f) && v(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            t0(String.valueOf(f));
        } else {
            C0("write a number");
            h0(String.valueOf(f));
        }
    }

    public final void V0(String str, boolean z) throws IOException {
        if (z) {
            this.i.writeObjectEntrySeparator(this);
        } else {
            this.i.beforeObjectEntries(this);
        }
        if (this.x) {
            d1(str);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = this.B;
        d1(str);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void W(int i) throws IOException {
        C0("write a number");
        if (this.o) {
            W0(i);
            return;
        }
        if (this.E + 11 >= this.F) {
            H0();
        }
        this.E = nzc.r(i, this.C, this.E);
    }

    public final void W0(int i) throws IOException {
        if (this.E + 13 >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i2 = this.E;
        int i3 = i2 + 1;
        this.E = i3;
        cArr[i2] = this.B;
        int iR = nzc.r(i, cArr, i3);
        char[] cArr2 = this.C;
        this.E = iR + 1;
        cArr2[iR] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void X(long j2) throws IOException {
        C0("write a number");
        if (this.o) {
            X0(j2);
            return;
        }
        if (this.E + 21 >= this.F) {
            H0();
        }
        this.E = nzc.t(j2, this.C, this.E);
    }

    public final void X0(long j2) throws IOException {
        if (this.E + 23 >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        int i2 = i + 1;
        this.E = i2;
        cArr[i] = this.B;
        int iT = nzc.t(j2, cArr, i2);
        char[] cArr2 = this.C;
        this.E = iT + 1;
        cArr2[iT] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Y(String str) throws IOException {
        C0("write a number");
        if (str == null) {
            T0();
        } else if (this.o) {
            Y0(str);
        } else {
            h0(str);
        }
    }

    public final void Y0(String str) throws IOException {
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = this.B;
        h0(str);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Z(BigDecimal bigDecimal) throws IOException {
        C0("write a number");
        if (bigDecimal == null) {
            T0();
        } else if (this.o) {
            Y0(z0(bigDecimal));
        } else {
            h0(z0(bigDecimal));
        }
    }

    public final void Z0(short s) throws IOException {
        if (this.E + 8 >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        int i2 = i + 1;
        this.E = i2;
        cArr[i] = this.B;
        int iR = nzc.r(s, cArr, i2);
        char[] cArr2 = this.C;
        this.E = iR + 1;
        cArr2[iR] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a0(BigInteger bigInteger) throws IOException {
        C0("write a number");
        if (bigInteger == null) {
            T0();
        } else if (this.o) {
            Y0(bigInteger.toString());
        } else {
            h0(bigInteger.toString());
        }
    }

    public final void a1(int i) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this.t;
        int length = iArr.length;
        int i2 = 0;
        int iI0 = 0;
        while (i2 < i) {
            do {
                cArr = this.C;
                c2 = cArr[i2];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i3 = i2 - iI0;
            if (i3 > 0) {
                this.A.write(cArr, iI0, i3);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            iI0 = I0(this.C, i2, i, c2, iArr[c2]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b0(short s) throws IOException {
        C0("write a number");
        if (this.o) {
            Z0(s);
            return;
        }
        if (this.E + 6 >= this.F) {
            H0();
        }
        this.E = nzc.r(s, this.C, this.E);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[PHI: r4
  0x001d: PHI (r4v5 int) = (r4v2 int), (r4v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b1(int i, int i2) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this.t;
        int iMin = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int iI0 = 0;
        int i4 = 0;
        while (i3 < i) {
            do {
                cArr = this.C;
                c2 = cArr[i3];
                if (c2 < iMin) {
                    i4 = iArr[c2];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c2 > i2) {
                        i4 = -1;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i3 - iI0;
            if (i5 > 0) {
                this.A.write(cArr, iI0, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iI0 = I0(this.C, i3, i, c2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r6
  0x0031: PHI (r6v6 int) = (r6v2 int), (r6v7 int) binds: [B:15:0x002d, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c1(int i) throws IOException {
        char c2;
        int[] iArr = this.t;
        int i2 = this.u;
        if (i2 < 1) {
            i2 = 65535;
        }
        int iMin = Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this.v;
        int i3 = 0;
        int iI0 = 0;
        int i4 = 0;
        while (i3 < i) {
            do {
                c2 = this.C[i3];
                if (c2 < iMin) {
                    i4 = iArr[c2];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c2 > i2) {
                        i4 = -1;
                        break;
                    }
                    wtg escapeSequence = characterEscapes.getEscapeSequence(c2);
                    this.H = escapeSequence;
                    if (escapeSequence != null) {
                        i4 = -2;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i3 - iI0;
            if (i5 > 0) {
                this.A.write(this.C, iI0, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iI0 = I0(this.C, i3, i, c2, i4);
        }
    }

    @Override // com.oplus.aiunit.vision.u48, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.C != null && v(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                zla zlaVarT = t();
                if (!zlaVarT.f()) {
                    if (!zlaVarT.g()) {
                        break;
                    } else {
                        P();
                    }
                } else {
                    O();
                }
            }
        }
        H0();
        this.D = 0;
        this.E = 0;
        if (this.A != null) {
            if (this.s.n() || v(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.A.close();
            } else if (v(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.A.flush();
            }
        }
        L0();
    }

    public final void d1(String str) throws IOException {
        int length = str.length();
        int i = this.F;
        if (length > i) {
            S0(str);
            return;
        }
        if (this.E + length > i) {
            H0();
        }
        str.getChars(0, length, this.C, this.E);
        if (this.v != null) {
            j1(length);
            return;
        }
        int i2 = this.u;
        if (i2 != 0) {
            h1(length, i2);
        } else {
            f1(length);
        }
    }

    public final void e1(char[] cArr, int i, int i2) throws IOException {
        if (this.v != null) {
            k1(cArr, i, i2);
            return;
        }
        int i3 = this.u;
        if (i3 != 0) {
            i1(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.t;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c2 = cArr[i5];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i5++;
                }
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this.E + i6 > this.F) {
                    H0();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this.C, this.E, i6);
                    this.E += i6;
                }
            } else {
                H0();
                this.A.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                return;
            }
            i = i5 + 1;
            char c3 = cArr[i5];
            G0(c3, iArr[c3]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void f0(char c2) throws IOException {
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = c2;
    }

    public final void f1(int i) throws IOException {
        int i2;
        int i3 = this.E + i;
        int[] iArr = this.t;
        int length = iArr.length;
        while (this.E < i3) {
            do {
                char[] cArr = this.C;
                int i4 = this.E;
                char c2 = cArr[i4];
                if (c2 >= length || iArr[c2] == 0) {
                    i2 = i4 + 1;
                    this.E = i2;
                } else {
                    int i5 = this.D;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this.A.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this.C;
                    int i7 = this.E;
                    this.E = i7 + 1;
                    char c3 = cArr2[i7];
                    J0(c3, iArr[c3]);
                }
            } while (i2 < i3);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        H0();
        if (this.A == null || !v(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.A.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g0(wtg wtgVar) throws IOException {
        int iAppendUnquoted = wtgVar.appendUnquoted(this.C, this.E);
        if (iAppendUnquoted < 0) {
            h0(wtgVar.getValue());
        } else {
            this.E += iAppendUnquoted;
        }
    }

    public final void g1(wtg wtgVar) throws IOException {
        char[] cArrAsQuotedChars = wtgVar.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this.F - this.E) {
                H0();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this.C, this.E, length);
            this.E += length;
        } else {
            H0();
            this.A.write(cArrAsQuotedChars, 0, length);
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void h0(String str) throws IOException {
        int length = str.length();
        int i = this.F - this.E;
        if (i == 0) {
            H0();
            i = this.F - this.E;
        }
        if (i < length) {
            l1(str);
        } else {
            str.getChars(0, length, this.C, this.E);
            this.E += length;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[SYNTHETIC] */
    public final void h1(int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.E + i;
        int[] iArr = this.t;
        int iMin = Math.min(iArr.length, i2 + 1);
        while (this.E < i7) {
            do {
                char[] cArr = this.C;
                int i8 = this.E;
                char c2 = cArr[i8];
                if (c2 < iMin) {
                    i3 = iArr[c2];
                    if (i3 != 0) {
                        i4 = this.D;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this.A.write(cArr, i4, i5);
                        }
                        this.E++;
                        J0(c2, i3);
                    }
                    i6 = i8 + 1;
                    this.E = i6;
                } else {
                    if (c2 > i2) {
                        i3 = -1;
                        i4 = this.D;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this.A.write(cArr, i4, i5);
                        }
                        this.E++;
                        J0(c2, i3);
                    }
                    i6 = i8 + 1;
                    this.E = i6;
                }
            } while (i6 < i7);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void i0(char[] cArr, int i, int i2) throws IOException {
        if (i2 >= 32) {
            H0();
            this.A.write(cArr, i, i2);
        } else {
            if (i2 > this.F - this.E) {
                H0();
            }
            System.arraycopy(cArr, i, this.C, this.E, i2);
            this.E += i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[PHI: r2
  0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public final void i1(char[] cArr, int i, int i2, int i3) throws IOException {
        char c2;
        int i4 = i2 + i;
        int[] iArr = this.t;
        int iMin = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i;
            do {
                c2 = cArr[i6];
                if (c2 < iMin) {
                    i5 = iArr[c2];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c2 > i3) {
                        i5 = -1;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i4);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.E + i7 > this.F) {
                    H0();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.C, this.E, i7);
                    this.E += i7;
                }
            } else {
                H0();
                this.A.write(cArr, i, i7);
            }
            if (i6 >= i4) {
                return;
            }
            i = i6 + 1;
            G0(c2, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[SYNTHETIC] */
    public final void j1(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.E + i;
        int[] iArr = this.t;
        int i7 = this.u;
        if (i7 < 1) {
            i7 = 65535;
        }
        int iMin = Math.min(iArr.length, i7 + 1);
        CharacterEscapes characterEscapes = this.v;
        while (this.E < i6) {
            do {
                char c2 = this.C[this.E];
                if (c2 < iMin) {
                    i2 = iArr[c2];
                    if (i2 != 0) {
                        int i8 = this.E;
                        i3 = this.D;
                        i4 = i8 - i3;
                        if (i4 > 0) {
                            this.A.write(this.C, i3, i4);
                        }
                        this.E++;
                        J0(c2, i2);
                    }
                    i5 = this.E + 1;
                    this.E = i5;
                } else {
                    if (c2 > i7) {
                        i2 = -1;
                    } else {
                        wtg escapeSequence = characterEscapes.getEscapeSequence(c2);
                        this.H = escapeSequence;
                        if (escapeSequence != null) {
                            i2 = -2;
                        }
                        i5 = this.E + 1;
                        this.E = i5;
                    }
                    int i9 = this.E;
                    i3 = this.D;
                    i4 = i9 - i3;
                    if (i4 > 0) {
                        this.A.write(this.C, i3, i4);
                    }
                    this.E++;
                    J0(c2, i2);
                }
            } while (i5 < i6);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[PHI: r4
  0x002f: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002b, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void k1(char[] cArr, int i, int i2) throws IOException {
        char c2;
        int i3 = i2 + i;
        int[] iArr = this.t;
        int i4 = this.u;
        if (i4 < 1) {
            i4 = 65535;
        }
        int iMin = Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this.v;
        int i5 = 0;
        while (i < i3) {
            int i6 = i;
            do {
                c2 = cArr[i6];
                if (c2 < iMin) {
                    i5 = iArr[c2];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c2 > i4) {
                        i5 = -1;
                        break;
                    }
                    wtg escapeSequence = characterEscapes.getEscapeSequence(c2);
                    this.H = escapeSequence;
                    if (escapeSequence != null) {
                        i5 = -2;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i3);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.E + i7 > this.F) {
                    H0();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.C, this.E, i7);
                    this.E += i7;
                }
            } else {
                H0();
                this.A.write(cArr, i, i7);
            }
            if (i6 >= i3) {
                return;
            }
            i = i6 + 1;
            G0(c2, i5);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void l0() throws IOException {
        C0("start an array");
        this.p = this.p.m();
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartArray(this);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = '[';
    }

    public final void l1(String str) throws IOException {
        int i = this.F;
        int i2 = this.E;
        int i3 = i - i2;
        str.getChars(0, i3, this.C, i2);
        this.E += i3;
        H0();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.F;
            if (length <= i4) {
                str.getChars(i3, i3 + length, this.C, 0);
                this.D = 0;
                this.E = length;
                return;
            } else {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.C, 0);
                this.D = 0;
                this.E = i4;
                H0();
                length -= i4;
                i3 = i5;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void n0(Object obj) throws IOException {
        C0("start an array");
        this.p = this.p.n(obj);
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartArray(this);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void o0(Object obj, int i) throws IOException {
        C0("start an array");
        this.p = this.p.n(obj);
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartArray(this);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void p0() throws IOException {
        C0("start an object");
        this.p = this.p.o();
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartObject(this);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void q0(Object obj) throws IOException {
        C0("start an object");
        this.p = this.p.p(obj);
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartObject(this);
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void s0(wtg wtgVar) throws IOException {
        C0("write a string");
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        int i2 = i + 1;
        this.E = i2;
        cArr[i] = this.B;
        int iAppendQuoted = wtgVar.appendQuoted(cArr, i2);
        if (iAppendQuoted < 0) {
            g1(wtgVar);
            return;
        }
        int i3 = this.E + iAppendQuoted;
        this.E = i3;
        if (i3 >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i4 = this.E;
        this.E = i4 + 1;
        cArr2[i4] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void t0(String str) throws IOException {
        C0("write a string");
        if (str == null) {
            T0();
            return;
        }
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr = this.C;
        int i = this.E;
        this.E = i + 1;
        cArr[i] = this.B;
        d1(str);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i2 = this.E;
        this.E = i2 + 1;
        cArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void u0(char[] cArr, int i, int i2) throws IOException {
        C0("write a string");
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr2 = this.C;
        int i3 = this.E;
        this.E = i3 + 1;
        cArr2[i3] = this.B;
        e1(cArr, i, i2);
        if (this.E >= this.F) {
            H0();
        }
        char[] cArr3 = this.C;
        int i4 = this.E;
        this.E = i4 + 1;
        cArr3[i4] = this.B;
    }
}
