package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes10.dex */
public class we0<T> {
    public final int a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f18227c;
    public int d;

    public interface a<T> extends mpe<T> {
        @Override // com.oplus.aiunit.vision.mpe
        boolean test(T t);
    }

    public we0(int i) {
        this.a = i;
        Object[] objArr = new Object[i + 1];
        this.b = objArr;
        this.f18227c = objArr;
    }

    public <U> boolean a(aed<? super U> aedVar) {
        Object[] objArr = this.b;
        int i = this.a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, aedVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    public <U> boolean b(v2j<? super U> v2jVar) {
        Object[] objArr = this.b;
        int i = this.a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, v2jVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    public void c(T t) {
        int i = this.a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f18227c[i] = objArr;
            this.f18227c = objArr;
            i2 = 0;
        }
        this.f18227c[i2] = t;
        this.d = i2 + 1;
    }

    public void d(a<? super T> aVar) {
        int i = this.a;
        for (Object[] objArr = this.b; objArr != null; objArr = (Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else {
                    if (aVar.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void e(T t) {
        this.b[0] = t;
    }
}
