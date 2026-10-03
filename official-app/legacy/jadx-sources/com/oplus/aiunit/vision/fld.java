package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class fld<T> {
    public final float a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11424c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T[] f11425e;

    public fld() {
        this(16, 0.75f);
    }

    public static int c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.f11425e;
        int i = this.b;
        int iC = c(t.hashCode()) & i;
        T t3 = tArr[iC];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iC = (iC + 1) & i;
                t2 = tArr[iC];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iC] = t;
        int i2 = this.f11424c + 1;
        this.f11424c = i2;
        if (i2 >= this.d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f11425e;
    }

    public void d() {
        T t;
        T[] tArr = this.f11425e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f11424c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.b = i2;
                this.d = (int) (i * this.a);
                this.f11425e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iC = c(t.hashCode()) & i2;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i2;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i3 = i4;
        }
    }

    public boolean e(T t) {
        T t2;
        T[] tArr = this.f11425e;
        int i = this.b;
        int iC = c(t.hashCode()) & i;
        T t3 = tArr[iC];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return f(iC, tArr, i);
        }
        do {
            iC = (iC + 1) & i;
            t2 = tArr[iC];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return f(iC, tArr, i);
    }

    public boolean f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f11424c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int iC = c(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= iC && iC > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else {
                        if (i >= iC || iC > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    }
                } else {
                    tArr[i] = null;
                    return true;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public int g() {
        return this.f11424c;
    }

    public fld(int i, float f) {
        this.a = f;
        int iA = joe.a(i);
        this.b = iA - 1;
        this.d = (int) (f * iA);
        this.f11425e = (T[]) new Object[iA];
    }
}
