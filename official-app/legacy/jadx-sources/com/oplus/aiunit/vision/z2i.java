package com.oplus.aiunit.vision;

import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public class z2i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static z2i f19256c;
    public nxj a;
    public gr3 b;

    public static z2i a() {
        if (f19256c == null) {
            f19256c = new z2i();
        }
        return f19256c;
    }

    public void b(Object[] objArr, int i, int i2) {
        if (this.b == null) {
            this.b = new gr3();
        }
        this.b.c(objArr, i, i2);
    }

    public <T> void c(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        if (this.a == null) {
            this.a = new nxj();
        }
        this.a.c(tArr, comparator, i, i2);
    }
}
