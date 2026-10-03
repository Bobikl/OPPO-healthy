package com.heytap.store.base.core.util.encryption;

import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.rnb;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public class BASE64Decoder extends CharacterDecoder {
    private static final char[] pem_array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', mla.SEPARATOR};
    private static final byte[] pem_convert_array = new byte[256];
    final byte[] decode_buffer = new byte[4];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            pem_convert_array[i2] = -1;
        }
        while (true) {
            char[] cArr = pem_array;
            if (i >= cArr.length) {
                return;
            }
            pem_convert_array[cArr[i]] = (byte) i;
            i++;
        }
    }

    @Override // com.heytap.store.base.core.util.encryption.CharacterDecoder
    public int bytesPerAtom() {
        return 4;
    }

    @Override // com.heytap.store.base.core.util.encryption.CharacterDecoder
    public int bytesPerLine() {
        return 72;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // com.heytap.store.base.core.util.encryption.CharacterDecoder
    public void decodeAtom(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i) throws IOException {
        byte b;
        byte b2;
        byte b3;
        if (i < 2) {
            throw new CEFormatException("BASE64Decoder: Not enough bytes for an atom.");
        }
        while (true) {
            int i2 = pushbackInputStream.read();
            byte b4 = -1;
            if (i2 == -1) {
                throw new CEStreamExhausted();
            }
            if (i2 != 10 && i2 != 13) {
                byte[] bArr = this.decode_buffer;
                bArr[0] = (byte) i2;
                if (readFully(pushbackInputStream, bArr, 1, i - 1) == -1) {
                    throw new CEStreamExhausted();
                }
                if (i > 3 && this.decode_buffer[3] == 61) {
                    i = 3;
                }
                if (i > 2 && this.decode_buffer[2] == 61) {
                    i = 2;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            b3 = -1;
                            b = -1;
                            b2 = -1;
                        } else {
                            b4 = pem_convert_array[this.decode_buffer[3] & 255];
                        }
                        if (i != 2) {
                            outputStream.write((byte) (((b4 << 2) & 252) | ((b2 >>> 4) & 3)));
                            return;
                        }
                        if (i != 3) {
                            outputStream.write((byte) (((b4 << 2) & 252) | (3 & (b2 >>> 4))));
                            outputStream.write((byte) (((b3 >>> 2) & 15) | ((b2 << 4) & 240)));
                            return;
                        } else {
                            if (i != 4) {
                                return;
                            }
                            outputStream.write((byte) (((b4 << 2) & 252) | ((b2 >>> 4) & 3)));
                            outputStream.write((byte) (((b2 << 4) & 240) | ((b3 >>> 2) & 15)));
                            outputStream.write((byte) (((b3 << 6) & 192) | (b & Utf8.REPLACEMENT_BYTE)));
                            return;
                        }
                    }
                    b = b4;
                    b4 = pem_convert_array[this.decode_buffer[2] & 255];
                } else {
                    b = -1;
                }
                byte[] bArr2 = pem_convert_array;
                byte[] bArr3 = this.decode_buffer;
                b2 = bArr2[bArr3[1] & 255];
                byte b5 = b4;
                b4 = bArr2[bArr3[0] & 255];
                b3 = b5;
                if (i != 2) {
                    outputStream.write((byte) (((b4 << 2) & 252) | ((b2 >>> 4) & 3)));
                    return;
                }
                if (i != 3) {
                    outputStream.write((byte) (((b4 << 2) & 252) | (3 & (b2 >>> 4))));
                    outputStream.write((byte) (((b3 >>> 2) & 15) | ((b2 << 4) & 240)));
                    return;
                } else {
                    if (i != 4) {
                        return;
                    }
                    outputStream.write((byte) (((b4 << 2) & 252) | ((b2 >>> 4) & 3)));
                    outputStream.write((byte) (((b2 << 4) & 240) | ((b3 >>> 2) & 15)));
                    outputStream.write((byte) (((b3 << 6) & 192) | (b & Utf8.REPLACEMENT_BYTE)));
                    return;
                }
            }
        }
    }
}
