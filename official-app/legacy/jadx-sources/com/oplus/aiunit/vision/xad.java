package com.oplus.aiunit.vision;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class xad {
    public xya<Object[]> a;
    public xya<Object[]> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18558c;
    public Object[] d;

    public final void a(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (xya<Object[]> xyaVarC = this.a; xyaVarC != null; xyaVarC = xyaVarC.c()) {
            Object[] objArrD = xyaVarC.d();
            int length = objArrD.length;
            System.arraycopy(objArrD, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 == i) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
    }

    public void b() {
        xya<Object[]> xyaVar = this.b;
        if (xyaVar != null) {
            this.d = xyaVar.d();
        }
        this.b = null;
        this.a = null;
        this.f18558c = 0;
    }

    public Object[] c(Object[] objArr) {
        xya<Object[]> xyaVar = new xya<>(objArr, null);
        if (this.a == null) {
            this.b = xyaVar;
            this.a = xyaVar;
        } else {
            this.b.b(xyaVar);
            this.b = xyaVar;
        }
        int length = objArr.length;
        this.f18558c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int d() {
        return this.f18558c;
    }

    public void e(Object[] objArr, int i, List<Object> list) {
        int i2;
        xya<Object[]> xyaVarC = this.a;
        while (true) {
            i2 = 0;
            if (xyaVarC == null) {
                break;
            }
            Object[] objArrD = xyaVarC.d();
            int length = objArrD.length;
            while (i2 < length) {
                list.add(objArrD[i2]);
                i2++;
            }
            xyaVarC = xyaVarC.c();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        b();
    }

    public Object[] f(Object[] objArr, int i) {
        int i2 = this.f18558c + i;
        Object[] objArr2 = new Object[i2];
        a(objArr2, i2, objArr, i);
        b();
        return objArr2;
    }

    public <T> T[] g(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.f18558c + i;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        a(tArr, i2, objArr, i);
        b();
        return tArr;
    }

    public int h() {
        Object[] objArr = this.d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] i() {
        b();
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.d = objArr2;
        return objArr2;
    }

    public Object[] j(Object[] objArr, int i) {
        b();
        Object[] objArr2 = this.d;
        if (objArr2 == null || objArr2.length < i) {
            this.d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.d, 0, i);
        return this.d;
    }
}
