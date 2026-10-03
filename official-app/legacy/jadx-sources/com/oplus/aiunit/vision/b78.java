package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class b78 {

    @SuppressLint({"StaticFieldLeak"})
    public static Context a;
    public static final HashMap<String, Object> b = new HashMap<>();

    public static Context a() {
        return a;
    }

    public static Application b() {
        return (Application) a;
    }

    public static HashMap<String, Object> c() {
        return b;
    }

    public static void d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        a = context;
    }

    public static void e(String str, Object obj) {
        b.put(str, obj);
    }
}
