package com.oplus.aiunit.vision;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public interface f9a {
    boolean a() throws IOException;

    byte nextByte() throws IOException;

    public static class a implements f9a {
        public final InputStream a;
        public final byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11270c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11271e;

        public a(InputStream inputStream, byte[] bArr) {
            this.a = inputStream;
            this.b = bArr;
            this.f11270c = 0;
            this.f11271e = 0;
            this.d = 0;
        }

        @Override // com.oplus.aiunit.vision.f9a
        public boolean a() throws IOException {
            int i;
            int i2 = this.f11271e;
            if (i2 < this.d) {
                return true;
            }
            InputStream inputStream = this.a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.b;
            int length = bArr.length - i2;
            if (length < 1 || (i = inputStream.read(bArr, i2, length)) <= 0) {
                return false;
            }
            this.d += i;
            return true;
        }

        public void b() {
            this.f11271e = this.f11270c;
        }

        @Override // com.oplus.aiunit.vision.f9a
        public byte nextByte() throws IOException {
            if (this.f11271e < this.d || a()) {
                byte[] bArr = this.b;
                int i = this.f11271e;
                this.f11271e = i + 1;
                return bArr[i];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this.f11271e + " bytes (max buffer size: " + this.b.length + ")");
        }

        public a(byte[] bArr, int i, int i2) {
            this.a = null;
            this.b = bArr;
            this.f11271e = i;
            this.f11270c = i;
            this.d = i + i2;
        }
    }
}
