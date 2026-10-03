package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class qfk extends ska {
    public static final byte[] J = a83.c();
    public static final byte[] K = {110, 117, 108, 108};
    public static final byte[] L = {116, 114, 117, 101};
    public static final byte[] M = {102, 97, 108, 115, 101};
    public final OutputStream A;
    public byte B;
    public byte[] C;
    public int D;
    public final int E;
    public final int F;
    public char[] G;
    public final int H;
    public boolean I;

    public qfk(ht9 ht9Var, int i, yad yadVar, OutputStream outputStream, char c2) {
        super(ht9Var, i, yadVar);
        this.A = outputStream;
        this.B = (byte) c2;
        if (c2 != '\"') {
            this.t = a83.f(c2);
        }
        this.I = true;
        byte[] bArrJ = ht9Var.j();
        this.C = bArrJ;
        int length = bArrJ.length;
        this.E = length;
        this.F = length >> 3;
        char[] cArrE = ht9Var.e();
        this.G = cArrE;
        this.H = cArrE.length;
        if (v(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            B(127);
        }
    }

    @Override // com.oplus.aiunit.vision.u48
    public final void C0(String str) throws IOException {
        byte b;
        int iX = this.p.x();
        if (this.i != null) {
            E0(str, iX);
            return;
        }
        if (iX == 1) {
            b = 44;
        } else {
            if (iX != 2) {
                if (iX != 3) {
                    if (iX != 5) {
                        return;
                    }
                    D0(str);
                    return;
                }
                wtg wtgVar = this.w;
                if (wtgVar != null) {
                    byte[] bArrAsUnquotedUTF8 = wtgVar.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        P0(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = b;
    }

    public final void F0() throws IOException {
        int i = this.D;
        if (i > 0) {
            this.D = 0;
            this.A.write(this.C, 0, i);
        }
    }

    public final int G0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int length = bArr2.length;
        if (i + length > i2) {
            this.D = i;
            F0();
            i = this.D;
            if (length > bArr.length) {
                this.A.write(bArr2, 0, length);
                return i;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        int i4 = i + length;
        if ((i3 * 6) + i4 <= i2) {
            return i4;
        }
        this.D = i4;
        F0();
        return this.D;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int H(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        C0("write a binary value");
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        bArr[i2] = this.B;
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
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr2 = this.C;
            int i3 = this.D;
            this.D = i3 + 1;
            bArr2[i3] = this.B;
            return i;
        } catch (Throwable th) {
            this.s.o(bArrD);
            throw th;
        }
    }

    public final int H0(int i, int i2) throws IOException {
        byte[] bArr = this.C;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | oei.TAI_CHI);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = J;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    public final int I0(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            } else {
                J0(i, cArr[i2]);
            }
            return i2 + 1;
        }
        byte[] bArr = this.C;
        int i4 = this.D;
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 12) | oei.TAI_CHI);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((i >> 6) & 63) | 128);
        this.D = i6 + 1;
        bArr[i6] = (byte) ((i & 63) | 128);
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void J(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        C0("write a binary value");
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i3 = this.D;
        this.D = i3 + 1;
        bArr2[i3] = this.B;
        O0(base64Variant, bArr, i, i2 + i);
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr3 = this.C;
        int i4 = this.D;
        this.D = i4 + 1;
        bArr3[i4] = this.B;
    }

    public final void J0(int i, int i2) throws IOException {
        int iB0 = B0(i, i2);
        if (this.D + 4 > this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i3 = this.D;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((iB0 >> 18) | 240);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (((iB0 >> 12) & 63) | 128);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((iB0 >> 6) & 63) | 128);
        this.D = i6 + 1;
        bArr[i6] = (byte) ((iB0 & 63) | 128);
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
        byte[] bArr = this.C;
        if (bArr != null && this.I) {
            this.C = null;
            this.s.t(bArr);
        }
        char[] cArr = this.G;
        if (cArr != null) {
            this.G = null;
            this.s.p(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void M(boolean z) throws IOException {
        C0("write a boolean value");
        if (this.D + 5 >= this.E) {
            F0();
        }
        byte[] bArr = z ? L : M;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.C, this.D, length);
        this.D += length;
    }

    public final int M0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.E - 6;
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
            if (this.D > i) {
                F0();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i5 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.C, this.D);
            this.D = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.C;
                int i9 = iEncodeBase64Chunk + 1;
                bArr2[iEncodeBase64Chunk] = 92;
                this.D = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iK0 <= 0) {
            return i5;
        }
        if (this.D > i) {
            F0();
        }
        int i10 = bArr[0] << 16;
        if (1 < iK0) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i5 + i2;
        this.D = base64Variant.encodeBase64Partial(i10, i2, this.C, this.D);
        return i11;
    }

    public final int N0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iK0;
        int i2 = this.E - 6;
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
            if (this.D > i2) {
                F0();
            }
            int i6 = i5 + 1;
            int i7 = bArr[i5] << 8;
            int i8 = i6 + 1;
            i5 = i8 + 1;
            i -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this.C, this.D);
            this.D = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.C;
                int i9 = iEncodeBase64Chunk + 1;
                bArr2[iEncodeBase64Chunk] = 92;
                this.D = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0 || (iK0 = K0(inputStream, bArr, i5, iK1, i)) <= 0) {
            return i;
        }
        if (this.D > i2) {
            F0();
        }
        int i10 = bArr[0] << 16;
        if (1 < iK0) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.D = base64Variant.encodeBase64Partial(i10, i3, this.C, this.D);
        return i - i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O() throws IOException {
        if (!this.p.f()) {
            a("Current context not Array but " + this.p.j());
        }
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeEndArray(this, this.p.d());
        } else {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr = this.C;
            int i = this.D;
            this.D = i + 1;
            bArr[i] = 93;
        }
        this.p = this.p.l();
    }

    public final void O0(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 - 3;
        int i4 = this.E - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this.D > i4) {
                F0();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i] << 8) | (bArr[i5] & 255)) << 8;
            int i8 = i6 + 1;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i7 | (bArr[i6] & 255), this.C, this.D);
            this.D = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.C;
                int i9 = iEncodeBase64Chunk + 1;
                bArr2[iEncodeBase64Chunk] = 92;
                this.D = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i8;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this.D > i4) {
                F0();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this.D = base64Variant.encodeBase64Partial(i12, i10, this.C, this.D);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P() throws IOException {
        if (!this.p.g()) {
            a("Current context not Object but " + this.p.j());
        }
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeEndObject(this, this.p.d());
        } else {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr = this.C;
            int i = this.D;
            this.D = i + 1;
            bArr[i] = 125;
        }
        this.p = this.p.l();
    }

    public final void P0(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.D + length > this.E) {
            F0();
            if (length > 512) {
                this.A.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.C, this.D, length);
        this.D += length;
    }

    public final int Q0(byte[] bArr, int i, wtg wtgVar, int i2) throws IOException {
        byte[] bArrAsUnquotedUTF8 = wtgVar.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return G0(bArr, i, this.E, bArrAsUnquotedUTF8, i2);
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void R(wtg wtgVar) throws IOException {
        if (this.i != null) {
            V0(wtgVar);
            return;
        }
        int iW = this.p.w(wtgVar.getValue());
        if (iW == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iW == 1) {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr = this.C;
            int i = this.D;
            this.D = i + 1;
            bArr[i] = 44;
        }
        if (this.x) {
            m1(wtgVar);
            return;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i2 = this.D;
        int i3 = i2 + 1;
        this.D = i3;
        bArr2[i2] = this.B;
        int iAppendQuotedUTF8 = wtgVar.appendQuotedUTF8(bArr2, i3);
        if (iAppendQuotedUTF8 < 0) {
            P0(wtgVar.asQuotedUTF8());
        } else {
            this.D += iAppendQuotedUTF8;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr3 = this.C;
        int i4 = this.D;
        this.D = i4 + 1;
        bArr3[i4] = this.B;
    }

    public final void R0(String str, int i, int i2) throws IOException {
        if (this.D + ((i2 - i) * 6) > this.E) {
            F0();
        }
        int iH0 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        int i3 = this.u;
        if (i3 <= 0) {
            i3 = 65535;
        }
        CharacterEscapes characterEscapes = this.v;
        while (i < i2) {
            i++;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i4 = iArr[cCharAt];
                if (i4 == 0) {
                    bArr[iH0] = (byte) cCharAt;
                    iH0++;
                } else if (i4 > 0) {
                    int i5 = iH0 + 1;
                    bArr[iH0] = 92;
                    iH0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                } else if (i4 == -2) {
                    wtg escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence == null) {
                        a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                    }
                    iH0 = Q0(bArr, iH0, escapeSequence, i2 - i);
                } else {
                    iH0 = T0(cCharAt, iH0);
                }
            } else if (cCharAt > i3) {
                iH0 = T0(cCharAt, iH0);
            } else {
                wtg escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                if (escapeSequence2 != null) {
                    iH0 = Q0(bArr, iH0, escapeSequence2, i2 - i);
                } else if (cCharAt <= 2047) {
                    int i6 = iH0 + 1;
                    bArr[iH0] = (byte) ((cCharAt >> 6) | 192);
                    iH0 = i6 + 1;
                    bArr[i6] = (byte) ((cCharAt & '?') | 128);
                } else {
                    iH0 = H0(cCharAt, iH0);
                }
            }
        }
        this.D = iH0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void S(String str) throws IOException {
        if (this.i != null) {
            W0(str);
            return;
        }
        int iW = this.p.w(str);
        if (iW == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iW == 1) {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr = this.C;
            int i = this.D;
            this.D = i + 1;
            bArr[i] = 44;
        }
        if (this.x) {
            k1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.H) {
            k1(str, true);
            return;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i2 = this.D;
        int i3 = i2 + 1;
        this.D = i3;
        bArr2[i2] = this.B;
        if (length <= this.F) {
            if (i3 + length > this.E) {
                F0();
            }
            d1(str, 0, length);
        } else {
            j1(str, 0, length);
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr3 = this.C;
        int i4 = this.D;
        this.D = i4 + 1;
        bArr3[i4] = this.B;
    }

    public final void S0(char[] cArr, int i, int i2) throws IOException {
        if (this.D + ((i2 - i) * 6) > this.E) {
            F0();
        }
        int iH0 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        int i3 = this.u;
        if (i3 <= 0) {
            i3 = 65535;
        }
        CharacterEscapes characterEscapes = this.v;
        while (i < i2) {
            i++;
            char c2 = cArr[i];
            if (c2 <= 127) {
                int i4 = iArr[c2];
                if (i4 == 0) {
                    bArr[iH0] = (byte) c2;
                    iH0++;
                } else if (i4 > 0) {
                    int i5 = iH0 + 1;
                    bArr[iH0] = 92;
                    iH0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                } else if (i4 == -2) {
                    wtg escapeSequence = characterEscapes.getEscapeSequence(c2);
                    if (escapeSequence == null) {
                        a("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c2) + ", although was supposed to have one");
                    }
                    iH0 = Q0(bArr, iH0, escapeSequence, i2 - i);
                } else {
                    iH0 = T0(c2, iH0);
                }
            } else if (c2 > i3) {
                iH0 = T0(c2, iH0);
            } else {
                wtg escapeSequence2 = characterEscapes.getEscapeSequence(c2);
                if (escapeSequence2 != null) {
                    iH0 = Q0(bArr, iH0, escapeSequence2, i2 - i);
                } else if (c2 <= 2047) {
                    int i6 = iH0 + 1;
                    bArr[iH0] = (byte) ((c2 >> 6) | 192);
                    iH0 = i6 + 1;
                    bArr[i6] = (byte) ((c2 & '?') | 128);
                } else {
                    iH0 = H0(c2, iH0);
                }
            }
        }
        this.D = iH0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void T() throws IOException {
        C0("write a null");
        U0();
    }

    public final int T0(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.C;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = J;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = J;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void U(double d) throws IOException {
        if (this.o || (nzc.o(d) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f17289n))) {
            t0(String.valueOf(d));
        } else {
            C0("write a number");
            h0(String.valueOf(d));
        }
    }

    public final void U0() throws IOException {
        if (this.D + 4 >= this.E) {
            F0();
        }
        System.arraycopy(K, 0, this.C, this.D, 4);
        this.D += 4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void V(float f) throws IOException {
        if (this.o || (nzc.p(f) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f17289n))) {
            t0(String.valueOf(f));
        } else {
            C0("write a number");
            h0(String.valueOf(f));
        }
    }

    public final void V0(wtg wtgVar) throws IOException {
        int iW = this.p.w(wtgVar.getValue());
        if (iW == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iW == 1) {
            this.i.writeObjectEntrySeparator(this);
        } else {
            this.i.beforeObjectEntries(this);
        }
        boolean z = !this.x;
        if (z) {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr = this.C;
            int i = this.D;
            this.D = i + 1;
            bArr[i] = this.B;
        }
        int iAppendQuotedUTF8 = wtgVar.appendQuotedUTF8(this.C, this.D);
        if (iAppendQuotedUTF8 < 0) {
            P0(wtgVar.asQuotedUTF8());
        } else {
            this.D += iAppendQuotedUTF8;
        }
        if (z) {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr2 = this.C;
            int i2 = this.D;
            this.D = i2 + 1;
            bArr2[i2] = this.B;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void W(int i) throws IOException {
        C0("write a number");
        if (this.D + 11 >= this.E) {
            F0();
        }
        if (this.o) {
            X0(i);
        } else {
            this.D = nzc.q(i, this.C, this.D);
        }
    }

    public final void W0(String str) throws IOException {
        int iW = this.p.w(str);
        if (iW == 4) {
            a("Can not write a field name, expecting a value");
        }
        if (iW == 1) {
            this.i.writeObjectEntrySeparator(this);
        } else {
            this.i.beforeObjectEntries(this);
        }
        if (this.x) {
            k1(str, false);
            return;
        }
        int length = str.length();
        if (length > this.H) {
            k1(str, true);
            return;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = this.B;
        str.getChars(0, length, this.G, 0);
        if (length <= this.F) {
            if (this.D + length > this.E) {
                F0();
            }
            e1(this.G, 0, length);
        } else {
            l1(this.G, 0, length);
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        bArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void X(long j2) throws IOException {
        C0("write a number");
        if (this.o) {
            Y0(j2);
            return;
        }
        if (this.D + 21 >= this.E) {
            F0();
        }
        this.D = nzc.s(j2, this.C, this.D);
    }

    public final void X0(int i) throws IOException {
        if (this.D + 13 >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i2 = this.D;
        int i3 = i2 + 1;
        this.D = i3;
        bArr[i2] = this.B;
        int iQ = nzc.q(i, bArr, i3);
        byte[] bArr2 = this.C;
        this.D = iQ + 1;
        bArr2[iQ] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Y(String str) throws IOException {
        C0("write a number");
        if (str == null) {
            U0();
        } else if (this.o) {
            Z0(str);
        } else {
            h0(str);
        }
    }

    public final void Y0(long j2) throws IOException {
        if (this.D + 23 >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        int i2 = i + 1;
        this.D = i2;
        bArr[i] = this.B;
        int iS = nzc.s(j2, bArr, i2);
        byte[] bArr2 = this.C;
        this.D = iS + 1;
        bArr2[iS] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Z(BigDecimal bigDecimal) throws IOException {
        C0("write a number");
        if (bigDecimal == null) {
            U0();
        } else if (this.o) {
            Z0(z0(bigDecimal));
        } else {
            h0(z0(bigDecimal));
        }
    }

    public final void Z0(String str) throws IOException {
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = this.B;
        h0(str);
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        bArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void a0(BigInteger bigInteger) throws IOException {
        C0("write a number");
        if (bigInteger == null) {
            U0();
        } else if (this.o) {
            Z0(bigInteger.toString());
        } else {
            h0(bigInteger.toString());
        }
    }

    public final void a1(short s) throws IOException {
        if (this.D + 8 >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        int i2 = i + 1;
        this.D = i2;
        bArr[i] = this.B;
        int iQ = nzc.q(s, bArr, i2);
        byte[] bArr2 = this.C;
        this.D = iQ + 1;
        bArr2[iQ] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void b0(short s) throws IOException {
        C0("write a number");
        if (this.D + 6 >= this.E) {
            F0();
        }
        if (this.o) {
            a1(s);
        } else {
            this.D = nzc.q(s, this.C, this.D);
        }
    }

    public final void b1(char[] cArr, int i, int i2) throws IOException {
        while (i < i2) {
            do {
                char c2 = cArr[i];
                if (c2 > 127) {
                    i++;
                    if (c2 < 2048) {
                        byte[] bArr = this.C;
                        int i3 = this.D;
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) ((c2 >> 6) | 192);
                        this.D = i4 + 1;
                        bArr[i4] = (byte) ((c2 & '?') | 128);
                    } else {
                        i = I0(c2, cArr, i, i2);
                    }
                } else {
                    byte[] bArr2 = this.C;
                    int i5 = this.D;
                    this.D = i5 + 1;
                    bArr2[i5] = (byte) c2;
                    i++;
                }
            } while (i < i2);
            return;
        }
    }

    public final void c1(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.E;
        byte[] bArr = this.C;
        int i4 = i2 + i;
        while (i < i4) {
            do {
                char c2 = cArr[i];
                if (c2 >= 128) {
                    if (this.D + 3 >= this.E) {
                        F0();
                    }
                    int i5 = i + 1;
                    char c3 = cArr[i];
                    if (c3 < 2048) {
                        int i6 = this.D;
                        int i7 = i6 + 1;
                        bArr[i6] = (byte) ((c3 >> 6) | 192);
                        this.D = i7 + 1;
                        bArr[i7] = (byte) ((c3 & '?') | 128);
                        i = i5;
                    } else {
                        i = I0(c3, cArr, i5, i4);
                    }
                } else {
                    if (this.D >= i3) {
                        F0();
                    }
                    int i8 = this.D;
                    this.D = i8 + 1;
                    bArr[i8] = (byte) c2;
                    i++;
                }
            } while (i < i4);
            return;
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
        F0();
        this.D = 0;
        if (this.A != null) {
            if (this.s.n() || v(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.A.close();
            } else if (v(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.A.flush();
            }
        }
        L0();
    }

    public final void d1(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        while (i < i3) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i4] = (byte) cCharAt;
            i++;
            i4++;
        }
        this.D = i4;
        if (i < i3) {
            if (this.v != null) {
                R0(str, i, i3);
            } else if (this.u == 0) {
                f1(str, i, i3);
            } else {
                h1(str, i, i3);
            }
        }
    }

    public final void e1(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        while (i < i3) {
            char c2 = cArr[i];
            if (c2 > 127 || iArr[c2] != 0) {
                break;
            }
            bArr[i4] = (byte) c2;
            i++;
            i4++;
        }
        this.D = i4;
        if (i < i3) {
            if (this.v != null) {
                S0(cArr, i, i3);
            } else if (this.u == 0) {
                g1(cArr, i, i3);
            } else {
                i1(cArr, i, i3);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void f0(char c2) throws IOException {
        if (this.D + 3 >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        if (c2 <= 127) {
            int i = this.D;
            this.D = i + 1;
            bArr[i] = (byte) c2;
        } else {
            if (c2 >= 2048) {
                I0(c2, null, 0, 0);
                return;
            }
            int i2 = this.D;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((c2 >> 6) | 192);
            this.D = i3 + 1;
            bArr[i3] = (byte) ((c2 & '?') | 128);
        }
    }

    public final void f1(String str, int i, int i2) throws IOException {
        if (this.D + ((i2 - i) * 6) > this.E) {
            F0();
        }
        int iH0 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        while (i < i2) {
            i++;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i3 = iArr[cCharAt];
                if (i3 == 0) {
                    bArr[iH0] = (byte) cCharAt;
                    iH0++;
                } else if (i3 > 0) {
                    int i4 = iH0 + 1;
                    bArr[iH0] = 92;
                    iH0 = i4 + 1;
                    bArr[i4] = (byte) i3;
                } else {
                    iH0 = T0(cCharAt, iH0);
                }
            } else if (cCharAt <= 2047) {
                int i5 = iH0 + 1;
                bArr[iH0] = (byte) ((cCharAt >> 6) | 192);
                iH0 = i5 + 1;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else {
                iH0 = H0(cCharAt, iH0);
            }
        }
        this.D = iH0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        F0();
        if (this.A == null || !v(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.A.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void g0(wtg wtgVar) throws IOException {
        int iAppendUnquotedUTF8 = wtgVar.appendUnquotedUTF8(this.C, this.D);
        if (iAppendUnquotedUTF8 < 0) {
            P0(wtgVar.asUnquotedUTF8());
        } else {
            this.D += iAppendUnquotedUTF8;
        }
    }

    public final void g1(char[] cArr, int i, int i2) throws IOException {
        if (this.D + ((i2 - i) * 6) > this.E) {
            F0();
        }
        int iH0 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        while (i < i2) {
            i++;
            char c2 = cArr[i];
            if (c2 <= 127) {
                int i3 = iArr[c2];
                if (i3 == 0) {
                    bArr[iH0] = (byte) c2;
                    iH0++;
                } else if (i3 > 0) {
                    int i4 = iH0 + 1;
                    bArr[iH0] = 92;
                    iH0 = i4 + 1;
                    bArr[i4] = (byte) i3;
                } else {
                    iH0 = T0(c2, iH0);
                }
            } else if (c2 <= 2047) {
                int i5 = iH0 + 1;
                bArr[iH0] = (byte) ((c2 >> 6) | 192);
                iH0 = i5 + 1;
                bArr[i5] = (byte) ((c2 & '?') | 128);
            } else {
                iH0 = H0(c2, iH0);
            }
        }
        this.D = iH0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void h0(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.G;
        if (length > cArr.length) {
            n1(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            i0(cArr, 0, length);
        }
    }

    public final void h1(String str, int i, int i2) throws IOException {
        if (this.D + ((i2 - i) * 6) > this.E) {
            F0();
        }
        int iH0 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        int i3 = this.u;
        while (i < i2) {
            i++;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i4 = iArr[cCharAt];
                if (i4 == 0) {
                    bArr[iH0] = (byte) cCharAt;
                    iH0++;
                } else if (i4 > 0) {
                    int i5 = iH0 + 1;
                    bArr[iH0] = 92;
                    iH0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                } else {
                    iH0 = T0(cCharAt, iH0);
                }
            } else if (cCharAt > i3) {
                iH0 = T0(cCharAt, iH0);
            } else if (cCharAt <= 2047) {
                int i6 = iH0 + 1;
                bArr[iH0] = (byte) ((cCharAt >> 6) | 192);
                iH0 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            } else {
                iH0 = H0(cCharAt, iH0);
            }
        }
        this.D = iH0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i2 + i2;
        int i4 = this.D + i3;
        int i5 = this.E;
        if (i4 > i5) {
            if (i5 < i3) {
                c1(cArr, i, i2);
                return;
            }
            F0();
        }
        int i6 = i2 + i;
        while (i < i6) {
            do {
                char c2 = cArr[i];
                if (c2 > 127) {
                    i++;
                    if (c2 < 2048) {
                        byte[] bArr = this.C;
                        int i7 = this.D;
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) ((c2 >> 6) | 192);
                        this.D = i8 + 1;
                        bArr[i8] = (byte) ((c2 & '?') | 128);
                    } else {
                        i = I0(c2, cArr, i, i6);
                    }
                } else {
                    byte[] bArr2 = this.C;
                    int i9 = this.D;
                    this.D = i9 + 1;
                    bArr2[i9] = (byte) c2;
                    i++;
                }
            } while (i < i6);
            return;
        }
    }

    public final void i1(char[] cArr, int i, int i2) throws IOException {
        if (this.D + ((i2 - i) * 6) > this.E) {
            F0();
        }
        int iH0 = this.D;
        byte[] bArr = this.C;
        int[] iArr = this.t;
        int i3 = this.u;
        while (i < i2) {
            i++;
            char c2 = cArr[i];
            if (c2 <= 127) {
                int i4 = iArr[c2];
                if (i4 == 0) {
                    bArr[iH0] = (byte) c2;
                    iH0++;
                } else if (i4 > 0) {
                    int i5 = iH0 + 1;
                    bArr[iH0] = 92;
                    iH0 = i5 + 1;
                    bArr[i5] = (byte) i4;
                } else {
                    iH0 = T0(c2, iH0);
                }
            } else if (c2 > i3) {
                iH0 = T0(c2, iH0);
            } else if (c2 <= 2047) {
                int i6 = iH0 + 1;
                bArr[iH0] = (byte) ((c2 >> 6) | 192);
                iH0 = i6 + 1;
                bArr[i6] = (byte) ((c2 & '?') | 128);
            } else {
                iH0 = H0(c2, iH0);
            }
        }
        this.D = iH0;
    }

    @Override // com.oplus.aiunit.vision.u48, com.fasterxml.jackson.core.JsonGenerator
    public void j0(wtg wtgVar) throws IOException {
        C0("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = wtgVar.appendUnquotedUTF8(this.C, this.D);
        if (iAppendUnquotedUTF8 < 0) {
            P0(wtgVar.asUnquotedUTF8());
        } else {
            this.D += iAppendUnquotedUTF8;
        }
    }

    public final void j1(String str, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.F, i2);
            if (this.D + iMin > this.E) {
                F0();
            }
            d1(str, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void k1(String str, boolean z) throws IOException {
        if (z) {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr = this.C;
            int i = this.D;
            this.D = i + 1;
            bArr[i] = this.B;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int iMin = Math.min(this.F, length);
            if (this.D + iMin > this.E) {
                F0();
            }
            d1(str, i2, iMin);
            i2 += iMin;
            length -= iMin;
        }
        if (z) {
            if (this.D >= this.E) {
                F0();
            }
            byte[] bArr2 = this.C;
            int i3 = this.D;
            this.D = i3 + 1;
            bArr2[i3] = this.B;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void l0() throws IOException {
        C0("start an array");
        this.p = this.p.m();
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartArray(this);
            return;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = 91;
    }

    public final void l1(char[] cArr, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.F, i2);
            if (this.D + iMin > this.E) {
                F0();
            }
            e1(cArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void m1(wtg wtgVar) throws IOException {
        int iAppendQuotedUTF8 = wtgVar.appendQuotedUTF8(this.C, this.D);
        if (iAppendQuotedUTF8 < 0) {
            P0(wtgVar.asQuotedUTF8());
        } else {
            this.D += iAppendQuotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void n0(Object obj) throws IOException {
        C0("start an array");
        this.p = this.p.n(obj);
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartArray(this);
            return;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = 91;
    }

    public void n1(String str, int i, int i2) throws IOException {
        char c2;
        char[] cArr = this.G;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            i0(cArr, 0, i2);
            return;
        }
        int i3 = this.E;
        int iMin = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = iMin * 3;
        while (i2 > 0) {
            int iMin2 = Math.min(iMin, i2);
            str.getChars(i, i + iMin2, cArr, 0);
            if (this.D + i4 > this.E) {
                F0();
            }
            if (iMin2 > 1 && (c2 = cArr[iMin2 - 1]) >= 55296 && c2 <= 56319) {
                iMin2--;
            }
            b1(cArr, 0, iMin2);
            i += iMin2;
            i2 -= iMin2;
        }
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
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void p0() throws IOException {
        C0("start an object");
        this.p = this.p.o();
        gte gteVar = this.i;
        if (gteVar != null) {
            gteVar.writeStartObject(this);
            return;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = 123;
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
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void s0(wtg wtgVar) throws IOException {
        C0("write a string");
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        int i2 = i + 1;
        this.D = i2;
        bArr[i] = this.B;
        int iAppendQuotedUTF8 = wtgVar.appendQuotedUTF8(bArr, i2);
        if (iAppendQuotedUTF8 < 0) {
            P0(wtgVar.asQuotedUTF8());
        } else {
            this.D += iAppendQuotedUTF8;
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i3 = this.D;
        this.D = i3 + 1;
        bArr2[i3] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void t0(String str) throws IOException {
        C0("write a string");
        if (str == null) {
            U0();
            return;
        }
        int length = str.length();
        if (length > this.F) {
            k1(str, true);
            return;
        }
        if (this.D + length >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i = this.D;
        this.D = i + 1;
        bArr[i] = this.B;
        d1(str, 0, length);
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        bArr2[i2] = this.B;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void u0(char[] cArr, int i, int i2) throws IOException {
        C0("write a string");
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr = this.C;
        int i3 = this.D;
        int i4 = i3 + 1;
        this.D = i4;
        bArr[i3] = this.B;
        if (i2 <= this.F) {
            if (i4 + i2 > this.E) {
                F0();
            }
            e1(cArr, i, i2);
        } else {
            l1(cArr, i, i2);
        }
        if (this.D >= this.E) {
            F0();
        }
        byte[] bArr2 = this.C;
        int i5 = this.D;
        this.D = i5 + 1;
        bArr2[i5] = this.B;
    }
}
