package com.oplus.aiunit.vision;

import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public class nxj<T> {
    public T[] a;
    public Comparator<? super T> b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14683e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14682c = 7;
    public int f = 0;
    public T[] d = (T[]) new Object[256];
    public final int[] g = new int[40];
    public final int[] h = new int[40];

    public static <T> void a(T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        if (i3 == i) {
            i3++;
        }
        while (i3 < i2) {
            T t = tArr[i3];
            int i4 = i;
            int i5 = i3;
            while (i4 < i5) {
                int i6 = (i4 + i5) >>> 1;
                if (comparator.compare(t, tArr[i6]) < 0) {
                    i5 = i6;
                } else {
                    i4 = i6 + 1;
                }
            }
            int i7 = i3 - i4;
            if (i7 == 1) {
                tArr[i4 + 1] = tArr[i4];
            } else if (i7 != 2) {
                System.arraycopy(tArr, i4, tArr, i4 + 1, i7);
            } else {
                tArr[i4 + 2] = tArr[i4 + 1];
                tArr[i4 + 1] = tArr[i4];
            }
            tArr[i4] = t;
            i3++;
        }
    }

    public static <T> int b(T[] tArr, int i, int i2, Comparator<? super T> comparator) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i3 + 1;
        if (comparator.compare(tArr[i3], tArr[i]) < 0) {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) < 0) {
                i4++;
            }
            o(tArr, i, i4);
        } else {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    public static <T> int e(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparator.compare(t, tArr[i6]) > 0) {
            int i7 = i2 - i3;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparator.compare(t, tArr[i6 + i9]) > 0) {
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
            while (i14 < i12 && comparator.compare(t, tArr[i6 - i14]) <= 0) {
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
            if (comparator.compare(t, tArr[i + i20]) > 0) {
                i19 = i20 + 1;
            } else {
                i5 = i20;
            }
        }
        return i5;
    }

    public static <T> int f(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (comparator.compare(t, tArr[i6]) < 0) {
            int i7 = i3 + 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && comparator.compare(t, tArr[i6 - i9]) < 0) {
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
            while (i14 < i12 && comparator.compare(t, tArr[i6 + i14]) >= 0) {
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
            if (comparator.compare(t, tArr[i + i19]) < 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public void c(T[] tArr, Comparator<T> comparator, int i, int i2) {
        this.f = 0;
        n(tArr.length, i, i2);
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        if (i3 < 32) {
            a(tArr, i, i2, b(tArr, i, i2, comparator) + i, comparator);
            return;
        }
        this.a = tArr;
        this.b = comparator;
        this.f14683e = 0;
        int iL = l(i3);
        do {
            int iB = b(tArr, i, i2, comparator);
            if (iB < iL) {
                int i4 = i3 <= iL ? i3 : iL;
                a(tArr, i, i + i4, iB + i, comparator);
                iB = i4;
            }
            m(i, iB);
            h();
            i += iB;
            i3 -= iB;
        } while (i3 != 0);
        i();
        this.a = null;
        this.b = null;
        T[] tArr2 = this.d;
        int i5 = this.f14683e;
        for (int i6 = 0; i6 < i5; i6++) {
            tArr2[i6] = null;
        }
    }

    public final T[] d(int i) {
        this.f14683e = Math.max(this.f14683e, i);
        if (this.d.length < i) {
            int i2 = (i >> 1) | i;
            int i3 = i2 | (i2 >> 2);
            int i4 = i3 | (i3 >> 4);
            int i5 = i4 | (i4 >> 8);
            int i6 = (i5 | (i5 >> 16)) + 1;
            if (i6 >= 0) {
                i = Math.min(i6, this.a.length >>> 1);
            }
            this.d = (T[]) new Object[i];
        }
        return this.d;
    }

    public final void g(int i) {
        int[] iArr = this.g;
        int i2 = iArr[i];
        int[] iArr2 = this.h;
        int i3 = iArr2[i];
        int i4 = i + 1;
        int i5 = iArr[i4];
        int i6 = iArr2[i4];
        iArr2[i] = i3 + i6;
        int i7 = this.f;
        if (i == i7 - 3) {
            int i8 = i + 2;
            iArr[i4] = iArr[i8];
            iArr2[i4] = iArr2[i8];
        }
        this.f = i7 - 1;
        T[] tArr = this.a;
        int iF = f(tArr[i5], tArr, i2, i3, 0, this.b);
        int i9 = i2 + iF;
        int i10 = i3 - iF;
        if (i10 == 0) {
            return;
        }
        T[] tArr2 = this.a;
        int iE = e(tArr2[(i9 + i10) - 1], tArr2, i5, i6, i6 - 1, this.b);
        if (iE == 0) {
            return;
        }
        if (i10 <= iE) {
            k(i9, i10, i5, iE);
        } else {
            j(i9, i10, i5, iE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void h() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        while (true) {
            int i = this.f;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 >= 1) {
                int[] iArr4 = this.h;
                if (iArr4[i2 - 1] > iArr4[i2] + iArr4[i2 + 1]) {
                    if (i2 >= 2) {
                        iArr2 = this.h;
                        if (iArr2[i2 - 2] <= iArr2[i2] + iArr2[i2 - 1]) {
                            iArr3 = this.h;
                            if (iArr3[i2 - 1] < iArr3[i2 + 1]) {
                                i2--;
                            }
                        }
                    }
                    iArr = this.h;
                    if (iArr[i2] > iArr[i2 + 1]) {
                        return;
                    }
                } else {
                    iArr3 = this.h;
                    if (iArr3[i2 - 1] < iArr3[i2 + 1]) {
                        i2--;
                    }
                }
            } else {
                if (i2 >= 2) {
                    iArr2 = this.h;
                    if (iArr2[i2 - 2] <= iArr2[i2] + iArr2[i2 - 1]) {
                        iArr3 = this.h;
                        if (iArr3[i2 - 1] < iArr3[i2 + 1]) {
                            i2--;
                        }
                    }
                }
                iArr = this.h;
                if (iArr[i2] > iArr[i2 + 1]) {
                    return;
                }
            }
            g(i2);
        }
    }

    public final void i() {
        while (true) {
            int i = this.f;
            if (i <= 1) {
                return;
            }
            int i2 = i - 2;
            if (i2 > 0) {
                int[] iArr = this.h;
                if (iArr[i2 - 1] < iArr[i2 + 1]) {
                    i2--;
                }
            }
            g(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[LOOP:2: B:24:0x007c->B:65:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0133 A[SYNTHETIC] */
    public final void j(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iE;
        int i8;
        boolean z;
        boolean z2;
        int i9;
        int i10;
        int i11 = i4;
        T[] tArr = this.a;
        T[] tArrD = d(i11);
        System.arraycopy(tArr, i3, tArrD, 0, i11);
        int i12 = (i + i2) - 1;
        int i13 = i11 - 1;
        int i14 = (i3 + i11) - 1;
        int i15 = i14 - 1;
        int i16 = i12 - 1;
        tArr[i14] = tArr[i12];
        int i17 = i2 - 1;
        if (i17 == 0) {
            System.arraycopy(tArrD, 0, tArr, i15 - i13, i11);
            return;
        }
        if (i11 == 1) {
            int i18 = i15 - i17;
            System.arraycopy(tArr, (i16 - i17) + 1, tArr, i18 + 1, i17);
            tArr[i18] = tArrD[i13];
            return;
        }
        Comparator<? super T> comparator = this.b;
        int i19 = this.f14682c;
        loop0: while (true) {
            int i20 = 0;
            int i21 = 0;
            do {
                if (comparator.compare(tArrD[i13], tArr[i16]) < 0) {
                    i5 = i15 - 1;
                    int i22 = i16 - 1;
                    tArr[i15] = tArr[i16];
                    i21++;
                    i17--;
                    if (i17 == 0) {
                        i16 = i22;
                        break loop0;
                    } else {
                        i15 = i5;
                        i16 = i22;
                        i20 = 0;
                    }
                } else {
                    int i23 = i15 - 1;
                    int i24 = i13 - 1;
                    tArr[i15] = tArrD[i13];
                    i20++;
                    i11--;
                    if (i11 == 1) {
                        i5 = i23;
                        i13 = i24;
                        break loop0;
                    } else {
                        i15 = i23;
                        i13 = i24;
                        i21 = 0;
                    }
                }
            } while ((i21 | i20) < i19);
            int i25 = i17;
            int i26 = i11;
            i19 = i19;
            int i27 = i13;
            int i28 = i15;
            int i29 = i16;
            while (true) {
                int iF = i25 - f(tArrD[i27], tArr, i, i25, i25 - 1, comparator);
                if (iF == 0) {
                    i6 = i28 - 1;
                    i7 = i27 - 1;
                    tArr[i28] = tArrD[i27];
                    i26--;
                    if (i26 == 1) {
                        i17 = i25;
                        i11 = i26;
                        i16 = i29;
                        i5 = i6;
                    } else {
                        iE = i26 - e(tArr[i29], tArrD, 0, i26, i26 - 1, comparator);
                        if (iE != 0) {
                            i9 = i6 - iE;
                            i13 = i7 - iE;
                            i10 = i26 - iE;
                            System.arraycopy(tArrD, i13 + 1, tArr, i9 + 1, iE);
                            if (i10 <= 1) {
                                i17 = i25;
                                i16 = i29;
                                i5 = i9;
                                i11 = i10;
                                i19 = i19;
                                break loop0;
                            }
                            i6 = i9;
                            i26 = i10;
                            i7 = i13;
                        }
                        i28 = i6 - 1;
                        i8 = i29 - 1;
                        tArr[i6] = tArr[i29];
                        i25--;
                        if (i25 == 0) {
                            i16 = i8;
                            i17 = i25;
                            i11 = i26;
                            i5 = i28;
                        } else {
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
                            if (!z2 && !z) {
                                if (i19 < 0) {
                                    i19 = 0;
                                }
                                i19 += 2;
                                i16 = i8;
                                i17 = i25;
                                i11 = i26;
                                i15 = i28;
                                i13 = i7;
                            } else {
                                i29 = i8;
                                i27 = i7;
                            }
                        }
                    }
                    i13 = i7;
                    break loop0;
                }
                int i30 = i28 - iF;
                int i31 = i29 - iF;
                int i32 = i25 - iF;
                System.arraycopy(tArr, i31 + 1, tArr, i30 + 1, iF);
                if (i32 != 0) {
                    i28 = i30;
                    i29 = i31;
                    i25 = i32;
                    i6 = i28 - 1;
                    i7 = i27 - 1;
                    tArr[i28] = tArrD[i27];
                    i26--;
                    if (i26 == 1) {
                        i17 = i25;
                        i11 = i26;
                        i16 = i29;
                        i5 = i6;
                    } else {
                        iE = i26 - e(tArr[i29], tArrD, 0, i26, i26 - 1, comparator);
                        if (iE != 0) {
                            i9 = i6 - iE;
                            i13 = i7 - iE;
                            i10 = i26 - iE;
                            System.arraycopy(tArrD, i13 + 1, tArr, i9 + 1, iE);
                            if (i10 <= 1) {
                                i17 = i25;
                                i16 = i29;
                                i5 = i9;
                                i11 = i10;
                                i19 = i19;
                                break loop0;
                            }
                            i6 = i9;
                            i26 = i10;
                            i7 = i13;
                        }
                        i28 = i6 - 1;
                        i8 = i29 - 1;
                        tArr[i6] = tArr[i29];
                        i25--;
                        if (i25 == 0) {
                            i16 = i8;
                            i17 = i25;
                            i11 = i26;
                            i5 = i28;
                        } else {
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
                            if (!z2 && !z) {
                                if (i19 < 0) {
                                    i19 = 0;
                                }
                                i19 += 2;
                                i16 = i8;
                                i17 = i25;
                                i11 = i26;
                                i15 = i28;
                                i13 = i7;
                            } else {
                                i29 = i8;
                                i27 = i7;
                            }
                        }
                    }
                    i13 = i7;
                    break loop0;
                }
                i5 = i30;
                i16 = i31;
                i17 = i32;
                i11 = i26;
                i19 = i19;
                i13 = i27;
                break loop0;
            }
        }
        if (i19 < 1) {
            i19 = 1;
        }
        this.f14682c = i19;
        if (i11 == 1) {
            int i33 = i5 - i17;
            System.arraycopy(tArr, (i16 - i17) + 1, tArr, i33 + 1, i17);
            tArr[i33] = tArrD[i13];
        } else {
            if (i11 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(tArrD, 0, tArr, i5 - (i11 - 1), i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126 A[LOOP:2: B:25:0x0071->B:66:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x012b A[LOOP:1: B:12:0x0033->B:67:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[SYNTHETIC] */
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
        int i12 = i2;
        T[] tArr = this.a;
        T[] tArrD = d(i12);
        int i13 = 0;
        System.arraycopy(tArr, i, tArrD, 0, i12);
        int i14 = i + 1;
        int i15 = i3 + 1;
        tArr[i] = tArr[i3];
        int i16 = i4 - 1;
        if (i16 == 0) {
            System.arraycopy(tArrD, 0, tArr, i14, i12);
            return;
        }
        int i17 = 1;
        if (i12 == 1) {
            System.arraycopy(tArr, i15, tArr, i14, i16);
            tArr[i14 + i16] = tArrD[0];
            return;
        }
        Comparator<? super T> comparator = this.b;
        int i18 = this.f14682c;
        int i19 = 0;
        loop0: while (true) {
            int i20 = i13;
            int i21 = i20;
            while (true) {
                if (comparator.compare(tArr[i15], tArrD[i19]) < 0) {
                    i6 = i14 + 1;
                    int i22 = i15 + 1;
                    tArr[i14] = tArr[i15];
                    i21 += i17;
                    i16--;
                    if (i16 == 0) {
                        i5 = i17;
                        i15 = i22;
                        break loop0;
                    }
                    i14 = i6;
                    i15 = i22;
                    i20 = i13;
                    if ((i20 | i21) >= i18) {
                        break;
                    } else {
                        i13 = 0;
                    }
                } else {
                    int i23 = i14 + 1;
                    int i24 = i19 + 1;
                    tArr[i14] = tArrD[i19];
                    i20 += i17;
                    i12--;
                    if (i12 == i17) {
                        i5 = i17;
                        i6 = i23;
                        i19 = i24;
                        break loop0;
                    } else {
                        i14 = i23;
                        i19 = i24;
                        i21 = i13;
                        if ((i20 | i21) >= i18) {
                            break;
                        } else {
                            i13 = 0;
                        }
                    }
                }
            }
            int i25 = i16;
            int i26 = i12;
            int i27 = i14;
            int i28 = i15;
            int i29 = i18;
            while (true) {
                int i30 = i19;
                int iF = f(tArr[i28], tArrD, i19, i26, 0, comparator);
                if (iF != 0) {
                    System.arraycopy(tArrD, i30, tArr, i27, iF);
                    int i31 = i27 + iF;
                    int i32 = i30 + iF;
                    int i33 = i26 - iF;
                    if (i33 <= i17) {
                        i19 = i32;
                        i12 = i33;
                        i5 = i17;
                        i15 = i28;
                        i18 = i29;
                        int i34 = i25;
                        i6 = i31;
                        i16 = i34;
                        break loop0;
                    }
                    i27 = i31;
                    i30 = i32;
                    i26 = i33;
                    i7 = i27 + 1;
                    i15 = i28 + 1;
                    tArr[i27] = tArr[i28];
                    i25--;
                    if (i25 == 0) {
                        i19 = i30;
                        i5 = i17;
                        i16 = i25;
                        i12 = i26;
                        i6 = i7;
                        i18 = i29;
                        break loop0;
                    }
                    i28 = i15;
                    iE = e(tArrD[i30], tArr, i15, i25, 0, comparator);
                    if (iE != 0) {
                        System.arraycopy(tArr, i28, tArr, i7, iE);
                        i10 = i7 + iE;
                        i15 = i28 + iE;
                        i11 = i25 - iE;
                        if (i11 == 0) {
                            i6 = i10;
                            i16 = i11;
                            i19 = i30;
                            i12 = i26;
                            i18 = i29;
                            i5 = 1;
                            break loop0;
                        }
                        i8 = i10;
                        i25 = i11;
                        i28 = i15;
                    } else {
                        i8 = i7;
                    }
                    i9 = i8 + 1;
                    i19 = i30 + 1;
                    tArr[i8] = tArrD[i30];
                    i26--;
                    i5 = 1;
                    if (i26 == 1) {
                        i16 = i25;
                        i15 = i28;
                        i18 = i29;
                        i6 = i9;
                        i12 = i26;
                        break loop0;
                    }
                    i29--;
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
                        break;
                    }
                    i27 = i9;
                    i17 = 1;
                } else {
                    i7 = i27 + 1;
                    i15 = i28 + 1;
                    tArr[i27] = tArr[i28];
                    i25--;
                    if (i25 == 0) {
                        i19 = i30;
                        i5 = i17;
                        i16 = i25;
                        i12 = i26;
                        i6 = i7;
                        i18 = i29;
                        break loop0;
                    }
                    i28 = i15;
                    iE = e(tArrD[i30], tArr, i15, i25, 0, comparator);
                    if (iE != 0) {
                        System.arraycopy(tArr, i28, tArr, i7, iE);
                        i10 = i7 + iE;
                        i15 = i28 + iE;
                        i11 = i25 - iE;
                        if (i11 == 0) {
                            i6 = i10;
                            i16 = i11;
                            i19 = i30;
                            i12 = i26;
                            i18 = i29;
                            i5 = 1;
                            break loop0;
                        }
                        i8 = i10;
                        i25 = i11;
                        i28 = i15;
                    } else {
                        i8 = i7;
                    }
                    i9 = i8 + 1;
                    i19 = i30 + 1;
                    tArr[i8] = tArrD[i30];
                    i26--;
                    i5 = 1;
                    if (i26 == 1) {
                        i16 = i25;
                        i15 = i28;
                        i18 = i29;
                        i6 = i9;
                        i12 = i26;
                        break loop0;
                    }
                    i29--;
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
                        break;
                    }
                    i27 = i9;
                    i17 = 1;
                }
            }
            if (i29 < 0) {
                i29 = 0;
            }
            i18 = i29 + 2;
            i14 = i9;
            i17 = 1;
            i16 = i25;
            i12 = i26;
            i15 = i28;
            i13 = 0;
        }
        if (i18 < i5) {
            i18 = i5;
        }
        this.f14682c = i18;
        if (i12 == i5) {
            System.arraycopy(tArr, i15, tArr, i6, i16);
            tArr[i6 + i16] = tArrD[i19];
        } else {
            if (i12 == 0) {
                throw new IllegalArgumentException("Comparison method violates its general contract!");
            }
            System.arraycopy(tArrD, i19, tArr, i6, i12);
        }
    }

    public final void m(int i, int i2) {
        int[] iArr = this.g;
        int i3 = this.f;
        iArr[i3] = i;
        this.h[i3] = i2;
        this.f = i3 + 1;
    }
}
