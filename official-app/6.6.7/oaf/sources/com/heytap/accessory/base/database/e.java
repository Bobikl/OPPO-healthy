package com.heytap.accessory.base.database;

import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e {
    public static volatile e b;
    public b a;

    public e(b bVar) {
        this.a = bVar;
    }

    public static e a(b bVar) {
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e(bVar);
                }
            }
        }
        return b;
    }

    public List<d> a(long j) {
        return this.a.a(j);
    }

    public List<Long> a(List<d> list) {
        return this.a.a(list);
    }

    public int a(String str) {
        return this.a.a(str);
    }
}
