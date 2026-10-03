package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class gr3 {
    public Object[] a;
    public int d;
    public int b = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11867e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11866c = new Object[256];
    public final int[] f = new int[40];
    public final int[] g = new int[40];

    public static void a(Object[] objArr, int i, int i2, int i3) {
        if (i3 == i) {
            i3++;
        }
        while (i3 < i2) {
            Comparable comparable = (Comparable) objArr[i3];
            int i4 = i;
            int i5 = i3;
            while (i4 < i5) {
                int i6 = (i4 + i5) >>> 1;
                if (comparable.compareTo(objArr[i6]) < 0) {
                    i5 = i6;
                } else {
                    i4 = i6 + 1;
                }
            }
            int i7 = i3 - i4;
            if (i7 == 1) {
                objArr[i4 + 1] = objArr[i4];
            } else if (i7 != 2) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i7);
            } else {
                objArr[i4 + 2] = objArr[i4 + 1];
                objArr[i4 + 1] = objArr[i4];
            }
            objArr[i4] = comparable;
            i3++;
        }
    }

    public static int b(Object[] objArr, int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i3 + 1;
        if (((Comparable) objArr[i3]).compareTo(objArr[i]) < 0) {
            while (i4 < i2 && ((Comparable) objArr[i4]).compareTo(objArr[i4 - 1]) < 0) {
                i4++;
            }
            o(objArr, i, i4);
        } else {
            while (i4 < i2 && ((Comparable) objArr[i4]).compareTo(objArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    public static int e(Comparable<Object> comparable, Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparable.compareTo(objArr[i6]) > 0) {
            int i7 = i2 - i3;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparable.compareTo(objArr[i6 + i9]) > 0) {
                int i10 = (i9 << 1) + 1;
                if (i10 <= 0) {
                    i8 = i9;
                    i9 = i7;
                } else {
                    int i11 = i9;
                    i9 = i10;
                    i8 = i11;
                }
            }
            if (i9 <= i7) {
                i7 = i9;
            }
            i4 = i8 + i3;
            i5 = i7 + i3;
        } else {
            int i12 = i3 + 1;
            int i13 = 0;
            int i14 = 1;
            while (i14 < i12 && comparable.compareTo(objArr[i6 - i14]) <= 0) {
                int i15 = (i14 << 1) + 1;
                if (i15 <= 0) {
                    i13 = i14;
                    i14 = i12;
                } else {
                    int i16 = i14;
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (i14 <= i12) {
                i12 = i14;
            }
            int i17 = i3 - i12;
            int i18 = i3 - i13;
            i4 = i17;
            i5 = i18;
        }
        int i19 = i4 + 1;
        while (i19 < i5) {
            int i20 = ((i5 - i19) >>> 1) + i19;
            if (comparable.compareTo(objArr[i + i20]) > 0) {
                i19 = i20 + 1;
            } else {
                i5 = i20;
            }
        }
        return i5;
    }

    public static int f(Comparable<Object> comparable, Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparable.compareTo(objArr[i6]) < 0) {
            int i7 = i3 + 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparable.compareTo(objArr[i6 - i9]) < 0) {
                int i10 = (i9 << 1) + 1;
                if (i10 <= 0) {
                    i8 = i9;
                    i9 = i7;
                } else {
                    int i11 = i9;
                    i9 = i10;
                    i8 = i11;
                }
            }
            if (i9 <= i7) {
                i7 = i9;
            }
            i5 = i3 - i7;
            i4 = i3 - i8;
        } else {
            int i12 = i2 - i3;
            int i13 = 0;
            int i14 = 1;
            while (i14 < i12 && comparable.compareTo(objArr[i6 + i14]) >= 0) {
                int i15 = (i14 << 1) + 1;
                if (i15 <= 0) {
                    i13 = i14;
                    i14 = i12;
                } else {
                    int i16 = i14;
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (i14 <= i12) {
                i12 = i14;
            }
            int i17 = i13 + i3;
            i4 = i3 + i12;
            i5 = i17;
        }
        int i18 = i5 + 1;
        while (i18 < i4) {
            int i19 = ((i4 - i18) >>> 1) + i18;
            if (comparable.compareTo(objArr[i + i19]) < 0) {
                i4 = i19;
            } else {
                i18 = i19 + 1;
            }
        }
        return i4;
    }

    public static int l(int i) {
        int i2 = 0;
        while (i >= 32) {
            i2 |= i & 1;
            i >>= 1;
        }
        return i + i2;
    }

    public static void n(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new IllegalArgumentException("fromIndex(" + i2 + ") > toIndex(" + i3 + ")");
    }

    public static void o(Object[] objArr, int i, int i2) {
        int i3 = i2 - 1;
        while (i < i3) {
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            i3--;
            i++;
        }
    }

    public void c(Object[] objArr, int i, int i2) {
        this.f11867e = 0;
        n(objArr.length, i, i2);
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        if (i3 < 32) {
            a(objArr, i, i2, b(objArr, i, i2) + i);
            return;
        }
        this.a = objArr;
        this.d = 0;
        int iL = l(i3);
        do {
            int iB = b(objArr, i, i2);
            if (iB < iL) {
                int i4 = i3 <= iL ? i3 : iL;
                a(objArr, i, i + i4, iB + i);
                iB = i4;
            }
            m(i, iB);
            h();
            i += iB;
            i3 -= iB;
        } while (i3 != 0);
        i();
        this.a = null;
        Object[] objArr2 = this.f11866c;
        int i5 = this.d;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr2[i6] = null;
        }
    }

    public final Object[] d(int i) {
        this.d = Math.max(this.d, i);
        if (this.f11866c.length < i) {
            int i2 = (i >> 1) | i;
            int i3 = i2 | (i2 >> 2);
            int i4 = i3 | (i3 >> 4);
            int i5 = i4 | (i4 >> 8);
            int i6 = (i5 | (i5 >> 16)) + 1;
            if (i6 >= 0) {
                i = Math.min(i6, this.a.length >>> 1);
            }
            this.f11866c = new Object[i];
        }
        return this.f11866c;
    }

    public final void g(int i) {
        int[] iArr = this.f;
        int i2 = iArr[i];
        int[] iArr2 = this.g;
        int i3 = iArr2[i];
        int i4 = i + 1;
        int i5 = iArr[i4];
        int i6 = iArr2[i4];
        iArr2[i] = i3 + i6;
        int i7 = this.f11867e;
        if (i == i7 - 3) {
            int i8 = i + 2;
            iArr[i4] = iArr[i8];
            iArr2[i4] = iArr2[i8];
        }
        this.f11867e = i7 - 1;
        Object[] objArr = this.a;
        int iF = f((Comparable) objArr[i5], objArr, i2, i3, 0);
        int i9 = i2 + iF;
        int i10 = i3 - iF;
        if (i10 == 0) {
            return;
        }
        Object[] objArr2 = this.a;
        int iE = e((Comparable) objArr2[(i9 + i10) - 1], objArr2, i5, i6, i6 - 1);
        if (iE == 0) {
            return;
        }
        if (i10 <= iE) {
            k(i9, i10, i5, iE);
        } else {
            j(i9, i10, i5, iE);
        }
    }

    public final void h() {
        while (true) {
            int i = this.f11867e;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.g;
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                int i5 = iArr[i2 + 1];
                if (i3 <= i4 + i5) {
                    if (i3 < i5) {
                        i2--;
                    }
                    g(i2);
                }
            }
            int[] iArr2 = this.g;
            if (iArr2[i2] > iArr2[i2 + 1]) {
                return;
            } else {
                g(i2);
            }
        }
    }

    public final void i() {
        while (true) {
            int i = this.f11867e;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.g;
                if (iArr[i2 - 1] < iArr[i2 + 1]) {
                    i2--;
                }
            }
            g(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a A[PHI: r6 r7 r13
  0x008a: PHI (r6v6 int) = (r6v5 int), (r6v14 int) binds: [B:24:0x007a, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r7v9 int) = (r7v8 int), (r7v14 int) binds: [B:24:0x007a, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r13v8 int) = (r13v7 int), (r13v10 int) binds: [B:24:0x007a, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106 A[LOOP:2: B:23:0x006e->B:62:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc A[SYNTHETIC] */
    public final void j(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iE;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        Object[] objArr = this.a;
        Object[] objArrD = d(i4);
        System.arraycopy(objArr, i3, objArrD, 0, i4);
        int i12 = (i + i2) - 1;
        int i13 = i4 - 1;
        int i14 = (i3 + i4) - 1;
        int i15 = i14 - 1;
        int i16 = i12 - 1;
        objArr[i14] = objArr[i12];
        int i17 = i2 - 1;
        if (i17 == 0) {
            System.arraycopy(objArrD, 0, objArr, i15 - i13, i4);
            return;
        }
        if (i4 == 1) {
            int i18 = i15 - i17;
            System.arraycopy(objArr, (i16 - i17) + 1, objArr, i18 + 1, i17);
            objArr[i18] = objArrD[i13];
            return;
        }
        int i19 = this.b;
        loop0: while (true) {
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (((Comparable) objArrD[i13]).compareTo(objArr[i16]) >= 0) {
                    i5 = i15 - 1;
                    i6 = i13 - 1;
                    objArr[i15] = objArrD[i13];
                    i20++;
                    i4--;
                    if (i4 != 1) {
                        i15 = i5;
                        i13 = i6;
                        i21 = 0;
                    }
                    i7 = i5;
                    i13 = i6;
                    break loop0;
                }
                i7 = i15 - 1;
                int i22 = i16 - 1;
                objArr[i15] = objArr[i16];
                i21++;
                i17--;
                if (i17 == 0) {
                    i16 = i22;
                    break loop0;
                } else {
                    i15 = i7;
                    i16 = i22;
                    i20 = 0;
                }
                if ((i21 | i20) >= i19) {
                    while (true) {
                        int iF = i17 - f((Comparable) objArrD[i13], objArr, i, i17, i17 - 1);
                        if (iF != 0) {
                            i15 -= iF;
                            i16 -= iF;
                            i17 -= iF;
                            System.arraycopy(objArr, i16 + 1, objArr, i15 + 1, iF);
                            if (i17 == 0) {
                                i7 = i15;
                                break loop0;
                            }
                            i5 = i15 - 1;
                            i6 = i13 - 1;
                            objArr[i15] = objArrD[i13];
                            i4--;
                            if (i4 == 1) {
                                i7 = i5;
                                i13 = i6;
                                break loop0;
                            }
                            iE = i4 - e((Comparable) objArr[i16], objArrD, 0, i4, i4 - 1);
                            if (iE != 0) {
                                i8 = i5 - iE;
                                i9 = i6 - iE;
                                i4 -= iE;
                                System.arraycopy(objArrD, i9 + 1, objArr, i8 + 1, iE);
                                if (i4 <= 1) {
                                    i7 = i8;
                                    i13 = i9;
                                    break loop0;
                                }
                            } else {
                                i8 = i5;
                                i9 = i6;
                            }
                            i10 = i8 - 1;
                            i11 = i16 - 1;
                            objArr[i8] = objArr[i16];
                            i17--;
                            if (i17 == 0) {
                                i13 = i9;
                                i7 = i10;
                                i16 = i11;
                                break loop0;
                            }
                            i19--;
                            if (iF >= 7) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (iE >= 7) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z && !z2) {
                                if (i19 < 0) {
                                    i19 = 0;
                                }
                                i19 += 2;
                                i13 = i9;
                                i15 = i10;
                                i16 = i11;
                            } else {
                                i13 = i9;
                                i15 = i10;
                                i16 = i11;
                            }
                        } else {
                            i5 = i15 - 1;
                            i6 = i13 - 1;
                            objArr[i15] = objArrD[i13];
                            i4--;
                            if (i4 == 1) {
                                i7 = i5;
                                i13 = i6;
                                break loop0;
                            }
                            iE = i4 - e((Comparable) objArr[i16], objArrD, 0, i4, i4 - 1);
                            if (iE != 0) {
                                i8 = i5 - iE;
                                i9 = i6 - iE;
                                i4 -= iE;
                                System.arraycopy(objArrD, i9 + 1, objArr, i8 + 1, iE);
                                if (i4 <= 1) {
                                    i7 = i8;
                                    i13 = i9;
                                    break loop0;
                                }
                            } else {
                                i8 = i5;
                                i9 = i6;
                            }
                            i10 = i8 - 1;
                            i11 = i16 - 1;
                            objArr[i8] = objArr[i16];
                            i17--;
                            if (i17 == 0) {
                                i13 = i9;
                                i7 = i10;
                                i16 = i11;
                                break loop0;
                            }
                            i19--;
                            if (iF >= 7) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (iE >= 7) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z && !z2) {
                                if (i19 < 0) {
                                    i19 = 0;
                                }
                                i19 += 2;
                                i13 = i9;
                                i15 = i10;
                                i16 = i11;
                            } else {
                                i13 = i9;
                                i15 = i10;
                                i16 = i11;
                            }
                        }
                    }
                }
            }
        }
        if (i19 < 1) {
            i19 = 1;
        }
        this.b = i19;
        if (i4 == 1) {
            int i23 = i7 - i17;
            System.arraycopy(objArr, (i16 - i17) + 1, objArr, i23 + 1, i17);
            objArr[i23] = objArrD[i13];
        } else {
            if (i4 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(objArrD, 0, objArr, i7 - (i4 - 1), i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[PHI: r3 r5 r13
  0x0076: PHI (r3v6 int) = (r3v5 int), (r3v16 int) binds: [B:25:0x006a, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r5v10 int) = (r5v9 int), (r5v16 int) binds: [B:25:0x006a, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r13v8 int) = (r13v7 int), (r13v10 int) binds: [B:25:0x006a, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5 A[LOOP:2: B:24:0x0062->B:64:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc A[SYNTHETIC] */
    public final void k(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iE;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        int i11;
        Object[] objArr = this.a;
        Object[] objArrD = d(i2);
        System.arraycopy(objArr, i, objArrD, 0, i2);
        int i12 = i + 1;
        int i13 = i3 + 1;
        objArr[i] = objArr[i3];
        int i14 = i4 - 1;
        if (i14 == 0) {
            System.arraycopy(objArrD, 0, objArr, i12, i2);
            return;
        }
        if (i2 == 1) {
            System.arraycopy(objArr, i13, objArr, i12, i14);
            objArr[i12 + i14] = objArrD[0];
            return;
        }
        int i15 = this.b;
        int i16 = 0;
        loop0: while (true) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (((Comparable) objArr[i13]).compareTo(objArrD[i16]) < 0) {
                    i5 = i12 + 1;
                    i6 = i13 + 1;
                    objArr[i12] = objArr[i13];
                    i18++;
                    i14--;
                    if (i14 != 0) {
                        i12 = i5;
                        i13 = i6;
                        i17 = 0;
                    }
                    i13 = i6;
                    break loop0;
                }
                int i19 = i12 + 1;
                int i20 = i16 + 1;
                objArr[i12] = objArrD[i16];
                i17++;
                i2--;
                if (i2 == 1) {
                    i5 = i19;
                    i16 = i20;
                    break loop0;
                } else {
                    i12 = i19;
                    i16 = i20;
                    i18 = 0;
                }
                if ((i17 | i18) >= i15) {
                    while (true) {
                        int iF = f((Comparable) objArr[i13], objArrD, i16, i2, 0);
                        if (iF != 0) {
                            System.arraycopy(objArrD, i16, objArr, i12, iF);
                            i12 += iF;
                            i16 += iF;
                            i2 -= iF;
                            if (i2 <= 1) {
                                i5 = i12;
                                break loop0;
                            }
                            i7 = i12 + 1;
                            i6 = i13 + 1;
                            objArr[i12] = objArr[i13];
                            i14--;
                            if (i14 == 0) {
                                i5 = i7;
                                i13 = i6;
                                break loop0;
                            }
                            iE = e((Comparable) objArrD[i16], objArr, i6, i14, 0);
                            if (iE != 0) {
                                System.arraycopy(objArr, i6, objArr, i7, iE);
                                i10 = i7 + iE;
                                i11 = i6 + iE;
                                i14 -= iE;
                                if (i14 == 0) {
                                    i5 = i10;
                                    i13 = i11;
                                    break loop0;
                                } else {
                                    i7 = i10;
                                    i13 = i11;
                                }
                            } else {
                                i13 = i6;
                            }
                            i8 = i7 + 1;
                            i9 = i16 + 1;
                            objArr[i7] = objArrD[i16];
                            i2--;
                            if (i2 == 1) {
                                i5 = i8;
                                i16 = i9;
                                break loop0;
                            }
                            i15--;
                            if (iF >= 7) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (iE >= 7) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2 && !z) {
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                i15 += 2;
                                i12 = i8;
                                i16 = i9;
                            } else {
                                i12 = i8;
                                i16 = i9;
                            }
                        } else {
                            i7 = i12 + 1;
                            i6 = i13 + 1;
                            objArr[i12] = objArr[i13];
                            i14--;
                            if (i14 == 0) {
                                i5 = i7;
                                i13 = i6;
                                break loop0;
                            }
                            iE = e((Comparable) objArrD[i16], objArr, i6, i14, 0);
                            if (iE != 0) {
                                System.arraycopy(objArr, i6, objArr, i7, iE);
                                i10 = i7 + iE;
                                i11 = i6 + iE;
                                i14 -= iE;
                                if (i14 == 0) {
                                    i5 = i10;
                                    i13 = i11;
                                    break loop0;
                                } else {
                                    i7 = i10;
                                    i13 = i11;
                                }
                            } else {
                                i13 = i6;
                            }
                            i8 = i7 + 1;
                            i9 = i16 + 1;
                            objArr[i7] = objArrD[i16];
                            i2--;
                            if (i2 == 1) {
                                i5 = i8;
                                i16 = i9;
                                break loop0;
                            }
                            i15--;
                            if (iF >= 7) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (iE >= 7) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2 && !z) {
                                if (i15 < 0) {
                                    i15 = 0;
                                }
                                i15 += 2;
                                i12 = i8;
                                i16 = i9;
                            } else {
                                i12 = i8;
                                i16 = i9;
                            }
                        }
                    }
                }
            }
        }
        if (i15 < 1) {
            i15 = 1;
        }
        this.b = i15;
        if (i2 == 1) {
            System.arraycopy(objArr, i13, objArr, i5, i14);
            objArr[i5 + i14] = objArrD[i16];
        } else {
            if (i2 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(objArrD, i16, objArr, i5, i2);
        }
    }

    public final void m(int i, int i2) {
        int[] iArr = this.f;
        int i3 = this.f11867e;
        iArr[i3] = i;
        this.g[i3] = i2;
        this.f11867e = i3 + 1;
    }
}
