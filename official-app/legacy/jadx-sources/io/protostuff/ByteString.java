package io.protostuff;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class ByteString {
    public static final ByteString EMPTY;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final String EMPTY_STRING = "";
    private final byte[] bytes;
    private volatile int hash = 0;

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY = new ByteString(bArr);
    }

    private ByteString(byte[] bArr) {
        this.bytes = bArr;
    }

    public static byte[] byteArrayDefaultValue(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e2);
        }
    }

    public static ByteString bytesDefaultValue(String str) {
        return new ByteString(byteArrayDefaultValue(str));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ByteString(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        return new ByteString(StringSerializer.STRING.ser(str));
    }

    public static String stringDefaultValue(String str) {
        try {
            return new String(str.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e2);
        }
    }

    public static ByteString wrap(byte[] bArr) {
        return new ByteString(bArr);
    }

    public static void writeTo(OutputStream outputStream, ByteString byteString) throws IOException {
        outputStream.write(byteString.bytes);
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
    }

    public byte byteAt(int i) {
        return this.bytes[i];
    }

    public void copyTo(byte[] bArr, int i) {
        byte[] bArr2 = this.bytes;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof ByteString) && equals(this, (ByteString) obj, false));
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public int hashCode() {
        int i = this.hash;
        if (i == 0) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            i = length == 0 ? 1 : length;
            this.hash = i;
        }
        return i;
    }

    public boolean isEmpty() {
        return this.bytes.length == 0;
    }

    public int size() {
        return this.bytes.length;
    }

    public byte[] toByteArray() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public String toStringUtf8() {
        return StringSerializer.STRING.deser(this.bytes);
    }

    public static boolean equals(ByteString byteString, ByteString byteString2, boolean z) {
        int length = byteString.bytes.length;
        if (length != byteString2.bytes.length) {
            return false;
        }
        if (z) {
            int i = byteString.hash;
            int i2 = byteString2.hash;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
        }
        byte[] bArr = byteString.bytes;
        byte[] bArr2 = byteString2.bytes;
        for (int i3 = 0; i3 < length; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static void writeTo(DataOutput dataOutput, ByteString byteString) throws IOException {
        dataOutput.write(byteString.bytes);
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    public static void writeTo(Output output, ByteString byteString, int i, boolean z) throws IOException {
        output.writeByteArray(i, byteString.bytes, z);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(String str, String str2) {
        try {
            return new ByteString(str.getBytes(str2));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(str2 + " not supported?", e2);
        }
    }

    public boolean equals(byte[] bArr) {
        return equals(bArr, 0, bArr.length);
    }

    public boolean equals(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.bytes;
        if (i2 != bArr2.length) {
            return false;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            if (bArr2[i3] != bArr[i]) {
                return false;
            }
            i3 = i4;
            i = i5;
        }
        return true;
    }
}
