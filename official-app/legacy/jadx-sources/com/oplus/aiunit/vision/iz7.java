package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes5.dex */
public class iz7 {
    public Integer a;
    public Integer b;

    public iz7() {
        d();
    }

    public static int a() {
        return 3;
    }

    public int b() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        wil.b("FtAbility", "getLocalSupportReTransFtChunk: not set");
        return 0;
    }

    public int c() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        wil.k("FtAbility", "getRemoteSupportReTransFtChunk: not set");
        return 0;
    }

    public void d() {
        this.a = Integer.valueOf(a());
    }

    public void e(int i) {
        this.b = Integer.valueOf(i);
    }

    public boolean f() {
        return ((c() & b()) & 2) != 0;
    }

    public boolean g() {
        return ((c() & b()) & 1) != 0;
    }

    public String toString() {
        return "FtAbility{local=" + b() + " remote=" + c() + " ReTransFtChunk=" + g() + " FtBuffer=" + f() + "}";
    }
}
