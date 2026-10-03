package com.omron;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final Map<String, Gson> a = new ConcurrentHashMap();

    private static Gson a() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    public static Gson b() {
        Map<String, Gson> map = a;
        Gson gson = map.get("defaultGson");
        if (gson != null) {
            return gson;
        }
        Gson gsonA = a();
        map.put("defaultGson", gsonA);
        return gsonA;
    }

    public static <T> T a(@NonNull Gson gson, String str, @NonNull Class<T> cls) {
        return (T) gson.fromJson(str, (Class) cls);
    }

    public static <T> T a(String str, @NonNull Class<T> cls) {
        return (T) a(b(), str, cls);
    }

    public static String a(@NonNull Gson gson, Object obj) {
        return gson.toJson(obj);
    }

    public static String a(Object obj) {
        return a(b(), obj);
    }
}
