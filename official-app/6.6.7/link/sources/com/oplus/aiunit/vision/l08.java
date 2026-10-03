package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class l08 {
    public Integer a;
    public Integer b;

    public l08() {
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
        uml.b("FtAbility", "getLocalSupportReTransFtChunk: not set");
        return 0;
    }

    public int c() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        uml.k("FtAbility", "getRemoteSupportReTransFtChunk: not set");
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
