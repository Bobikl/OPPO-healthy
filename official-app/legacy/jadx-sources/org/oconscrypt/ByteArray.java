package org.oconscrypt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
final class ByteArray {
    private final byte[] bytes;
    private final int hashCode;

    public ByteArray(byte[] bArr) {
        this.bytes = bArr;
        this.hashCode = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ByteArray)) {
            return false;
        }
        ByteArray byteArray = (ByteArray) obj;
        if (this.hashCode != byteArray.hashCode) {
            return false;
        }
        return Arrays.equals(this.bytes, byteArray.bytes);
    }

    public int hashCode() {
        return this.hashCode;
    }
}
