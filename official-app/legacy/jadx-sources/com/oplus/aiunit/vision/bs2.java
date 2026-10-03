package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class bs2 {
    public HashMap<String, Object> a = new HashMap<>();

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }

    public void b() {
        this.a.clear();
    }

    public Object c(String str) {
        return this.a.get(str);
    }
}
