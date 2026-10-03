package com.oplus.aiunit.vision;

import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public class zsh<T> extends wg0<T> {
    public T[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public T[] f19539n;
    public int o;

    public zsh(Class cls) {
        super(cls);
    }

    @Override // com.oplus.aiunit.vision.wg0
    public void clear() {
        q();
        super.clear();
    }

    @Override // com.oplus.aiunit.vision.wg0
    public void f(int i, T t) {
        q();
        super.f(i, t);
    }

    @Override // com.oplus.aiunit.vision.wg0
    public T h(int i) {
        q();
        return (T) super.h(i);
    }

    @Override // com.oplus.aiunit.vision.wg0
    public boolean i(T t, boolean z) {
        q();
        return super.i(t, z);
    }

    @Override // com.oplus.aiunit.vision.wg0
    public void k(int i, T t) {
        q();
        super.k(i, t);
    }

    @Override // com.oplus.aiunit.vision.wg0
    public void l() {
        q();
        super.l();
    }

    public T[] o() {
        q();
        T[] tArr = this.i;
        this.m = tArr;
        this.o++;
        return tArr;
    }

    public void p() {
        int iMax = Math.max(0, this.o - 1);
        this.o = iMax;
        T[] tArr = this.m;
        if (tArr == null) {
            return;
        }
        if (tArr != this.i && iMax == 0) {
            this.f19539n = tArr;
            int length = tArr.length;
            for (int i = 0; i < length; i++) {
                this.f19539n[i] = null;
            }
        }
        this.m = null;
    }

    @Override // com.oplus.aiunit.vision.wg0
    public T pop() {
        q();
        return (T) super.pop();
    }

    public final void q() {
        T[] tArr;
        T[] tArr2 = this.m;
        if (tArr2 == null || tArr2 != (tArr = this.i)) {
            return;
        }
        T[] tArr3 = this.f19539n;
        if (tArr3 != null) {
            int length = tArr3.length;
            int i = this.f18241j;
            if (length >= i) {
                System.arraycopy(tArr, 0, tArr3, 0, i);
                this.i = this.f19539n;
                this.f19539n = null;
                return;
            }
        }
        j(tArr.length);
    }

    @Override // com.oplus.aiunit.vision.wg0
    public void sort(Comparator<? super T> comparator) {
        q();
        super.sort(comparator);
    }
}
