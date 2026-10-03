package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class yye {
    public final int a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19198c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19199e;

    public yye(int i, Class<?> cls, String str, boolean z, String str2) {
        this.a = i;
        this.b = cls;
        this.f19198c = str;
        this.d = z;
        this.f19199e = str2;
    }

    public kvl a(Object obj) {
        return new kvl.b(this, "=?", obj);
    }

    public kvl b(Object obj) {
        return new kvl.b(this, "<?", obj);
    }
}
