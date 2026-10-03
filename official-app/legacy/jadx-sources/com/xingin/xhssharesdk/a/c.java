package com.xingin.xhssharesdk.a;

import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public final byte[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20412c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20413e;
    public int f;
    public int g = Integer.MAX_VALUE;
    public int h;

    public c(byte[] bArr, int i, int i2, boolean z) {
        this.a = bArr;
        this.b = i2 + i;
        this.d = i;
        this.f = -i;
    }

    public final int a() throws m {
        int i = this.d;
        if (this.b - i < 4) {
            l(4);
            throw m.b();
        }
        byte[] bArr = this.a;
        this.d = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final void b(int i) throws m {
        if (this.f20413e != i) {
            throw new m("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int c(int i) throws m {
        if (i < 0) {
            throw new m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f + this.d + i;
        int i3 = this.g;
        if (i2 > i3) {
            throw m.b();
        }
        this.g = i2;
        m();
        return i3;
    }

    public final long d() throws m {
        int i = this.d;
        if (this.b - i < 8) {
            l(8);
            throw m.b();
        }
        byte[] bArr = this.a;
        this.d = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e() throws m {
        int i;
        int i2 = this.d;
        int i3 = this.b;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.d = i5;
                return i;
            }
        }
        long j2 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.d;
            if (i11 == this.b) {
                l(1);
                throw m.b();
            }
            byte[] bArr2 = this.a;
            this.d = i11 + 1;
            byte b3 = bArr2[i11];
            j2 |= ((long) (b3 & ByteCompanionObject.MAX_VALUE)) << i10;
            if ((b3 & ByteCompanionObject.MIN_VALUE) == 0) {
                return (int) j2;
            }
        }
        throw new m("CodedInputStream encountered a malformed varint.");
    }

    public final byte[] f(int i) throws m {
        if (i <= 0) {
            if (i == 0) {
                return f.b;
            }
            throw new m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        if (i4 > 67108864) {
            throw new m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.g;
        if (i4 <= i5) {
            throw m.b();
        }
        j((i5 - i2) - i3);
        throw m.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        if (r4[r0] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g() throws m {
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.d;
        int i3 = this.b;
        long j5 = 0;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j2 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j6 = i9;
                            int i10 = i5 + 1;
                            long j7 = j6 ^ (((long) bArr[i5]) << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j8 = j7 ^ (((long) bArr[i10]) << 35);
                                if (j8 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j7 = j8 ^ (((long) bArr[i5]) << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j8 = j7 ^ (((long) bArr[i10]) << 49);
                                        if (j8 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            long j9 = (j8 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            i5 = j9 < 0 ? i11 + 1 : i11;
                                            j2 = j9;
                                        }
                                    }
                                }
                                j2 = j3 ^ j8;
                            }
                            j2 = j7 ^ j4;
                            i5 = i10;
                        }
                    }
                    this.d = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.d = i5;
                return j2;
            }
        }
        for (int i12 = 0; i12 < 64; i12 += 7) {
            int i13 = this.d;
            if (i13 == this.b) {
                l(1);
                throw m.b();
            }
            byte[] bArr2 = this.a;
            this.d = i13 + 1;
            byte b2 = bArr2[i13];
            j5 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i12;
            if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j5;
            }
        }
        throw new m("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078 A[LOOP:2: B:38:0x0065->B:44:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0077 A[SYNTHETIC] */
    public final boolean h(int i) throws m {
        int i2;
        byte[] bArr;
        int iE;
        int iK;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 1) {
                iE = 8;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            return false;
                        }
                        if (i3 != 5) {
                            throw new m("Protocol message tag had invalid wire type.");
                        }
                        j(4);
                        return true;
                    }
                    do {
                        iK = k();
                        if (iK == 0) {
                            break;
                        }
                    } while (h(iK));
                    if (this.f20413e == c0.a(i >>> 3, 4)) {
                        return true;
                    }
                    throw new m("Protocol message end-group tag did not match expected tag.");
                }
                iE = e();
            }
            j(iE);
            return true;
        }
        int i4 = this.b;
        int i5 = this.d;
        if (i4 - i5 < 10) {
            for (int i6 = 0; i6 < 10; i6++) {
                i2 = this.d;
                if (i2 != this.b) {
                    l(1);
                    throw m.b();
                }
                bArr = this.a;
                this.d = i2 + 1;
                if (bArr[i2] >= 0) {
                }
            }
            throw new m("CodedInputStream encountered a malformed varint.");
        }
        byte[] bArr2 = this.a;
        int i7 = 0;
        while (i7 < 10) {
            int i8 = i5 + 1;
            if (bArr2[i5] >= 0) {
                this.d = i8;
            } else {
                i7++;
                i5 = i8;
            }
        }
        while (i6 < 10) {
            i2 = this.d;
            if (i2 != this.b) {
                l(1);
                throw m.b();
            }
            bArr = this.a;
            this.d = i2 + 1;
            if (bArr[i2] >= 0) {
            }
        }
        throw new m("CodedInputStream encountered a malformed varint.");
        return true;
    }

    public final String i() throws m {
        byte[] bArrF;
        int iE = e();
        int i = this.d;
        int i2 = this.b;
        if (iE <= i2 - i && iE > 0) {
            bArrF = this.a;
            this.d = i + iE;
        } else {
            if (iE == 0) {
                return "";
            }
            if (iE <= i2) {
                l(iE);
                throw m.b();
            }
            bArrF = f(iE);
            i = 0;
        }
        if (b0.d(bArrF, i, i + iE)) {
            return new String(bArrF, i, iE, f.a);
        }
        throw new m("Protocol message had invalid UTF-8.");
    }

    public final void j(int i) throws m {
        int i2 = this.b;
        int i3 = this.d;
        if (i <= i2 - i3 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = this.f;
        int i5 = i4 + i3 + i;
        int i6 = this.g;
        if (i5 > i6) {
            j((i6 - i4) - i3);
            throw m.b();
        }
        this.d = i2;
        l(1);
        throw m.b();
    }

    public final int k() throws m {
        boolean z;
        if (this.d == this.b) {
            z = true;
            l(1);
        } else {
            z = false;
        }
        if (z) {
            this.f20413e = 0;
            return 0;
        }
        int iE = e();
        this.f20413e = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new m("Protocol message contained an invalid tag (zero).");
    }

    public final void l(int i) {
        if (this.d + i > this.b) {
            return;
        }
        throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
    }

    public final void m() {
        int i = this.b + this.f20412c;
        this.b = i;
        int i2 = this.f + i;
        int i3 = this.g;
        if (i2 <= i3) {
            this.f20412c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f20412c = i4;
        this.b = i - i4;
    }
}
