package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class a5n extends x4n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a5n f9204c = new a5n();

    public a5n() {
        super(k18.GL_BYTE);
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static a5n d() {
        return f9204c;
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, List<? extends e5n> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size <= 0 || bArr == null) {
                return null;
            }
            a();
            int iC = h5n.c(this.a, bArr);
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                e5n e5nVar = list.get(i);
                iArr[i] = m5n.b(this.a, (byte) e5nVar.a(), m5n.c(this.a, e5nVar.b()));
            }
            this.a.w(h5n.b(this.a, iC, bArr2 != null ? h5n.f(this.a, bArr2) : 0, h5n.d(this.a, iArr)));
            return this.a.z();
        } catch (Throwable th) {
            n6n.a(th);
            return null;
        }
    }

    public final byte[] e() {
        super.a();
        try {
            this.a.w(m6n.b(this.a, l6n.a(), this.a.b(l6n.m()), this.a.b(l6n.g()), (byte) l6n.A(), this.a.b(l6n.s()), this.a.b(l6n.q()), this.a.b(b(l6n.o())), this.a.b(b(l6n.u())), k6n.a(l6n.C()), this.a.b(l6n.y()), this.a.b(l6n.w()), this.a.b(l6n.i()), this.a.b(l6n.k())));
            return this.a.z();
        } catch (Exception e2) {
            n6n.a(e2);
            return null;
        }
    }
}
