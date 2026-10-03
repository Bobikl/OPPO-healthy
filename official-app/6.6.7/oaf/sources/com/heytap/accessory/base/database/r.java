package com.heytap.accessory.base.database;

import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class r {
    public static volatile r b;
    public o a;

    public r(o oVar) {
        this.a = oVar;
    }

    public static r a(o oVar) {
        if (b == null) {
            synchronized (r.class) {
                if (b == null) {
                    b = new r(oVar);
                }
            }
        }
        return b;
    }

    public List<Long> b(String str, long j, String str2, int i) {
        return this.a.a(str, j, str2, i);
    }

    public int b(int i) {
        return this.a.b(i);
    }

    public List<q> a(int i) {
        return this.a.a(i);
    }

    public int a(long j) {
        return this.a.a(j);
    }

    public int a(String str, String str2, long j, String str3, int i) {
        return this.a.a(str, str2, j, str3, i);
    }

    public long a(q qVar) {
        return this.a.a(qVar);
    }

    public void a(int i, String str, String str2) {
        this.a.a(i, str, str2);
    }

    public List<String> a(String str) {
        return this.a.a(str);
    }

    public List<Long> a() {
        return this.a.a();
    }

    public int a(int i, String str) {
        return this.a.a(i, str);
    }

    public List<Integer> a(String str, long j, String str2, int i) {
        return this.a.b(str, j, str2, i);
    }
}
