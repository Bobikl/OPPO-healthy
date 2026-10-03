package com.oplus.aiunit.vision;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes10.dex */
public class ve0<T> {
    public final int a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f17824c;
    public int d;

    public interface a<T> extends npe<T> {
        @Override // com.oplus.aiunit.vision.npe
        boolean test(T t);
    }

    public ve0(int i) {
        this.a = i;
        Object[] objArr = new Object[i + 1];
        this.b = objArr;
        this.f17824c = objArr;
    }

    public <U> boolean a(bed<? super U> bedVar) {
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
                if (NotificationLite.acceptFull(objArr2, bedVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    public void b(T t) {
        int i = this.a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f17824c[i] = objArr;
            this.f17824c = objArr;
            i2 = 0;
        }
        this.f17824c[i2] = t;
        this.d = i2 + 1;
    }

    public void c(a<? super T> aVar) {
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

    public void d(T t) {
        this.b[0] = t;
    }
}
