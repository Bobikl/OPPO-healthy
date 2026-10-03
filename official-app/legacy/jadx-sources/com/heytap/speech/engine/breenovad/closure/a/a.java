package com.heytap.speech.engine.breenovad.closure.a;

import com.oplus.aiunit.vision.t7b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7675c = -1;
    public static final int d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7676e = -3;
    public static final int f = -4;
    public static boolean g = false;
    public long a = 0;
    public boolean b = false;

    public abstract int a();

    public abstract int a(int i, byte[] bArr, int i2);

    public abstract int a(String str);

    public boolean a(String str, String str2) {
        if (this.a != 0) {
            return true;
        }
        t7b.INSTANCE.d(str, "core is null when call " + str2);
        return false;
    }

    public abstract int b();

    public abstract boolean b(String str);

    public boolean b(String str, String str2) {
        if (!this.b) {
            t7b.INSTANCE.d(str, "must call realStart before call " + str2);
        }
        return this.b;
    }

    public abstract int c();
}
