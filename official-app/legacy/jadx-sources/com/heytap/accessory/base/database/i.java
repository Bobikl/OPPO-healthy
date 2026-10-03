package com.heytap.accessory.base.database;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class i {
    public static volatile i b;
    public f a;

    public i(f fVar) {
        this.a = fVar;
    }

    public static i a(f fVar) {
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i(fVar);
                }
            }
        }
        return b;
    }

    public int b(h hVar) {
        return this.a.b(hVar);
    }

    public List<h> a(String str) {
        return this.a.a(str);
    }

    public List<h> a(String str, int i, int i2) {
        return this.a.a(str, i, i2);
    }

    public long a(h hVar) {
        return this.a.a(hVar);
    }
}
