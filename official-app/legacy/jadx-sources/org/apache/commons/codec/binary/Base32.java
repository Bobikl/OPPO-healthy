package org.apache.commons.codec.binary;

import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes11.dex */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    private static final byte[] HEX_ENCODE_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    private static final long MASK_1BITS = 1;
    private static final long MASK_2BITS = 3;
    private static final long MASK_3BITS = 7;
    private static final long MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base32() {
        this(false);
    }

    private void validateCharacter(long j2, BaseNCodec.Context context) {
        if (isStrictDecoding() && (context.lbitWorkArea & j2) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    private void validateTrailingCharacters() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
        }
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        byte b;
        if (context.eof) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            context.eof = true;
        }
        int i3 = 0;
        int i4 = i;
        while (i3 < i2) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == this.pad) {
                context.eof = r3;
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.decodeSize, context);
            if (b2 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (context.modulus + r3) % 8;
                    context.modulus = i6;
                    long j2 = (context.lbitWorkArea << 5) + ((long) b);
                    context.lbitWorkArea = j2;
                    if (i6 == 0) {
                        int i7 = context.pos;
                        int i8 = i7 + 1;
                        bArrEnsureBufferSize[i7] = (byte) ((j2 >> 32) & 255);
                        int i9 = i8 + 1;
                        bArrEnsureBufferSize[i8] = (byte) ((j2 >> 24) & 255);
                        int i10 = i9 + 1;
                        bArrEnsureBufferSize[i9] = (byte) ((j2 >> 16) & 255);
                        int i11 = i10 + 1;
                        bArrEnsureBufferSize[i10] = (byte) ((j2 >> 8) & 255);
                        context.pos = i11 + 1;
                        bArrEnsureBufferSize[i11] = (byte) (j2 & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
            r3 = 1;
        }
        if (!context.eof || context.modulus <= 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        switch (context.modulus) {
            case 1:
                validateTrailingCharacters();
                break;
            case 2:
                break;
            case 3:
                validateTrailingCharacters();
                int i12 = context.pos;
                context.pos = i12 + 1;
                bArrEnsureBufferSize2[i12] = (byte) ((context.lbitWorkArea >> MASK_3BITS) & 255);
                return;
            case 4:
                validateCharacter(MASK_4BITS, context);
                long j3 = context.lbitWorkArea >> 4;
                context.lbitWorkArea = j3;
                int i13 = context.pos;
                int i14 = i13 + 1;
                bArrEnsureBufferSize2[i13] = (byte) ((j3 >> 8) & 255);
                context.pos = i14 + 1;
                bArrEnsureBufferSize2[i14] = (byte) (j3 & 255);
                return;
            case 5:
                validateCharacter(1L, context);
                long j4 = context.lbitWorkArea >> 1;
                context.lbitWorkArea = j4;
                int i15 = context.pos;
                int i16 = i15 + 1;
                bArrEnsureBufferSize2[i15] = (byte) ((j4 >> 16) & 255);
                int i17 = i16 + 1;
                bArrEnsureBufferSize2[i16] = (byte) ((j4 >> 8) & 255);
                context.pos = i17 + 1;
                bArrEnsureBufferSize2[i17] = (byte) (j4 & 255);
                return;
            case 6:
                validateTrailingCharacters();
                long j5 = context.lbitWorkArea >> 6;
                context.lbitWorkArea = j5;
                int i18 = context.pos;
                int i19 = i18 + 1;
                bArrEnsureBufferSize2[i18] = (byte) ((j5 >> 16) & 255);
                int i20 = i19 + 1;
                bArrEnsureBufferSize2[i19] = (byte) ((j5 >> 8) & 255);
                context.pos = i20 + 1;
                bArrEnsureBufferSize2[i20] = (byte) (j5 & 255);
                return;
            case 7:
                validateCharacter(MASK_3BITS, context);
                long j6 = context.lbitWorkArea >> 3;
                context.lbitWorkArea = j6;
                int i21 = context.pos;
                int i22 = i21 + 1;
                bArrEnsureBufferSize2[i21] = (byte) ((j6 >> 24) & 255);
                int i23 = i22 + 1;
                bArrEnsureBufferSize2[i22] = (byte) ((j6 >> 16) & 255);
                int i24 = i23 + 1;
                bArrEnsureBufferSize2[i23] = (byte) ((j6 >> 8) & 255);
                context.pos = i24 + 1;
                bArrEnsureBufferSize2[i24] = (byte) (j6 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + context.modulus);
        }
        validateCharacter(3L, context);
        int i25 = context.pos;
        context.pos = i25 + 1;
        bArrEnsureBufferSize2[i25] = (byte) ((context.lbitWorkArea >> 2) & 255);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        boolean z;
        int i3;
        if (context.eof) {
            return;
        }
        boolean z2 = false;
        int i4 = 1;
        if (i2 >= 0) {
            int i5 = i;
            int i6 = 0;
            while (i6 < i2) {
                byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i7 = (context.modulus + i4) % 5;
                context.modulus = i7;
                int i8 = i5 + 1;
                int i9 = bArr[i5];
                if (i9 < 0) {
                    i9 += 256;
                }
                long j2 = (context.lbitWorkArea << 8) + ((long) i9);
                context.lbitWorkArea = j2;
                if (i7 == 0) {
                    int i10 = context.pos;
                    int i11 = i10 + 1;
                    byte[] bArr2 = this.encodeTable;
                    bArrEnsureBufferSize[i10] = bArr2[((int) (j2 >> 35)) & 31];
                    int i12 = i11 + 1;
                    bArrEnsureBufferSize[i11] = bArr2[((int) (j2 >> 30)) & 31];
                    int i13 = i12 + 1;
                    i3 = i8;
                    bArrEnsureBufferSize[i12] = bArr2[((int) (j2 >> 25)) & 31];
                    int i14 = i13 + 1;
                    bArrEnsureBufferSize[i13] = bArr2[((int) (j2 >> 20)) & 31];
                    int i15 = i14 + 1;
                    bArrEnsureBufferSize[i14] = bArr2[((int) (j2 >> MASK_4BITS)) & 31];
                    int i16 = i15 + 1;
                    bArrEnsureBufferSize[i15] = bArr2[((int) (j2 >> 10)) & 31];
                    int i17 = i16 + 1;
                    bArrEnsureBufferSize[i16] = bArr2[((int) (j2 >> 5)) & 31];
                    int i18 = i17 + 1;
                    context.pos = i18;
                    bArrEnsureBufferSize[i17] = bArr2[((int) j2) & 31];
                    int i19 = context.currentLinePos + 8;
                    context.currentLinePos = i19;
                    int i20 = this.lineLength;
                    if (i20 <= 0 || i20 > i19) {
                        z = false;
                    } else {
                        byte[] bArr3 = this.lineSeparator;
                        z = false;
                        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i18, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                } else {
                    z = z2;
                    i3 = i8;
                }
                i6++;
                i5 = i3;
                z2 = z;
                i4 = 1;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i21 = context.pos;
        int i22 = context.modulus;
        if (i22 != 0) {
            if (i22 == 1) {
                int i23 = i21 + 1;
                byte[] bArr4 = this.encodeTable;
                long j3 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i21] = bArr4[((int) (j3 >> 3)) & 31];
                int i24 = i23 + 1;
                bArrEnsureBufferSize2[i23] = bArr4[((int) (j3 << 2)) & 31];
                int i25 = i24 + 1;
                byte b = this.pad;
                bArrEnsureBufferSize2[i24] = b;
                int i26 = i25 + 1;
                bArrEnsureBufferSize2[i25] = b;
                int i27 = i26 + 1;
                bArrEnsureBufferSize2[i26] = b;
                int i28 = i27 + 1;
                bArrEnsureBufferSize2[i27] = b;
                int i29 = i28 + 1;
                bArrEnsureBufferSize2[i28] = b;
                context.pos = i29 + 1;
                bArrEnsureBufferSize2[i29] = b;
            } else if (i22 == 2) {
                int i30 = i21 + 1;
                byte[] bArr5 = this.encodeTable;
                long j4 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i21] = bArr5[((int) (j4 >> 11)) & 31];
                int i31 = i30 + 1;
                bArrEnsureBufferSize2[i30] = bArr5[((int) (j4 >> 6)) & 31];
                int i32 = i31 + 1;
                bArrEnsureBufferSize2[i31] = bArr5[((int) (j4 >> 1)) & 31];
                int i33 = i32 + 1;
                bArrEnsureBufferSize2[i32] = bArr5[((int) (j4 << 4)) & 31];
                int i34 = i33 + 1;
                byte b2 = this.pad;
                bArrEnsureBufferSize2[i33] = b2;
                int i35 = i34 + 1;
                bArrEnsureBufferSize2[i34] = b2;
                int i36 = i35 + 1;
                bArrEnsureBufferSize2[i35] = b2;
                context.pos = i36 + 1;
                bArrEnsureBufferSize2[i36] = b2;
            } else if (i22 == 3) {
                int i37 = i21 + 1;
                byte[] bArr6 = this.encodeTable;
                long j5 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i21] = bArr6[((int) (j5 >> 19)) & 31];
                int i38 = i37 + 1;
                bArrEnsureBufferSize2[i37] = bArr6[((int) (j5 >> 14)) & 31];
                int i39 = i38 + 1;
                bArrEnsureBufferSize2[i38] = bArr6[((int) (j5 >> 9)) & 31];
                int i40 = i39 + 1;
                bArrEnsureBufferSize2[i39] = bArr6[((int) (j5 >> 4)) & 31];
                int i41 = i40 + 1;
                bArrEnsureBufferSize2[i40] = bArr6[((int) (j5 << 1)) & 31];
                int i42 = i41 + 1;
                byte b3 = this.pad;
                bArrEnsureBufferSize2[i41] = b3;
                int i43 = i42 + 1;
                bArrEnsureBufferSize2[i42] = b3;
                context.pos = i43 + 1;
                bArrEnsureBufferSize2[i43] = b3;
            } else {
                if (i22 != 4) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i44 = i21 + 1;
                byte[] bArr7 = this.encodeTable;
                long j6 = context.lbitWorkArea;
                bArrEnsureBufferSize2[i21] = bArr7[((int) (j6 >> 27)) & 31];
                int i45 = i44 + 1;
                bArrEnsureBufferSize2[i44] = bArr7[((int) (j6 >> 22)) & 31];
                int i46 = i45 + 1;
                bArrEnsureBufferSize2[i45] = bArr7[((int) (j6 >> 17)) & 31];
                int i47 = i46 + 1;
                bArrEnsureBufferSize2[i46] = bArr7[((int) (j6 >> 12)) & 31];
                int i48 = i47 + 1;
                bArrEnsureBufferSize2[i47] = bArr7[((int) (j6 >> MASK_3BITS)) & 31];
                int i49 = i48 + 1;
                bArrEnsureBufferSize2[i48] = bArr7[((int) (j6 >> 2)) & 31];
                int i50 = i49 + 1;
                bArrEnsureBufferSize2[i49] = bArr7[((int) (j6 << 3)) & 31];
                context.pos = i50 + 1;
                bArrEnsureBufferSize2[i50] = this.pad;
            }
        }
        int i51 = context.currentLinePos;
        int i52 = context.pos;
        int i53 = i51 + (i52 - i21);
        context.currentLinePos = i53;
        if (this.lineLength <= 0 || i53 <= 0) {
            return;
        }
        byte[] bArr8 = this.lineSeparator;
        System.arraycopy(bArr8, 0, bArrEnsureBufferSize2, i52, bArr8.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.decodeTable;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public Base32(boolean z) {
        this(0, null, z, p010kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(boolean z, byte b) {
        this(0, null, z, b);
    }

    public Base32(byte b) {
        this(false, b);
    }

    public Base32(int i) {
        this(i, BaseNCodec.CHUNK_SEPARATOR);
    }

    public Base32(int i, byte[] bArr) {
        this(i, bArr, false, p010kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, p010kotlin.io.encoding.Base64.padSymbol);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b) {
        this(i, bArr, z, b, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b, CodecPolicy codecPolicy) {
        super(5, 8, i, bArr == null ? 0 : bArr.length, b, codecPolicy);
        if (z) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else if (bArr != null) {
            if (!containsAlphabetOrPad(bArr)) {
                this.encodeSize = bArr.length + 8;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
        } else {
            throw new IllegalArgumentException("lineLength " + i + " > 0, but lineSeparator is null");
        }
        this.decodeSize = this.encodeSize - 1;
        if (isInAlphabet(b) || BaseNCodec.isWhiteSpace(b)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }
}
