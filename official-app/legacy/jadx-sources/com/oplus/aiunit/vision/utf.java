package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.util.LruCache;

/* JADX INFO: loaded from: classes19.dex */
public class utf {
    public LruCache<String, Resources> a;

    public static class a {
        public static final utf a = new utf();
    }

    public static utf d() {
        return a.a;
    }

    public void a(String str, Resources resources) {
        this.a.put(str, resources);
    }

    public void b() {
        this.a.evictAll();
    }

    public Resources c(String str) {
        return this.a.get(str);
    }

    public utf() {
        this.a = new LruCache<>(18);
    }
}
