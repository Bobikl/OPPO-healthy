package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class c4i {
    public static final a a = new a();

    public static class a extends ThreadLocal<Map<String, String>> {
        @Override // java.lang.ThreadLocal
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> initialValue() {
            return new ConcurrentHashMap();
        }

        public a() {
        }
    }

    public static String a() {
        return a.get().getOrDefault("key_sp_key", "no_key");
    }

    public static String b() {
        return a.get().getOrDefault("key_sp_name", "no_name");
    }

    public static void c(String str) {
        a.get().put("key_sp_key", str);
    }

    public static void d(String str) {
        a.get().put("key_sp_name", str);
    }
}
