package com.oplus.drs.core.track;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class HashCode {

    public static class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        private final int hash;

        public IntHashCode(int i) {
            this.hash = i;
        }

        @Override // com.oplus.drs.core.track.HashCode
        public int asInt() {
            return this.hash;
        }

        @Override // com.oplus.drs.core.track.HashCode
        public void writeBytesToImpl(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (bArr != null) {
                    bArr[i + i3] = (byte) (this.hash >> (i3 * 8));
                }
            }
        }
    }

    public static HashCode fromInt(int i) {
        return new IntHashCode(i);
    }

    public abstract int asInt();

    abstract void writeBytesToImpl(byte[] bArr, int i, int i2);
}
