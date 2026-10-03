package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.utils.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class sc8 {
    public static <T> T a(String str, Class<T> cls) {
        try {
            return (T) new Gson().fromJson(str, (Class) cls);
        } catch (Exception e2) {
            me8.a("fromJson err ", str);
            me8.b("GsonUtil", "e:" + e2.getMessage());
            return null;
        }
    }

    public static <T> T b(String str, Type type) {
        try {
            return (T) new Gson().fromJson(str, type);
        } catch (JsonSyntaxException e2) {
            me8.b("GsonUtil", "e:" + e2.getMessage());
            return null;
        }
    }

    public static <T> List<T> c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (List) new Gson().fromJson(str, new ParameterizedTypeImpl(Double.class));
        } catch (JsonSyntaxException e2) {
            me8.b("GsonUtil", "e:" + e2.getMessage());
            return null;
        }
    }

    public static <T> List<T> d(String str, Class cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (List) new Gson().fromJson(str, new ParameterizedTypeImpl(cls));
        } catch (JsonSyntaxException e2) {
            me8.b("GsonUtil", "e:" + e2.getMessage());
            return null;
        }
    }

    public static String e(Object obj) {
        return new GsonBuilder().setPrettyPrinting().serializeSpecialFloatingPointValues().create().toJson(obj);
    }

    public static <K, V> HashMap<K, V> f(String str, Class<K> cls, Class<V> cls2) {
        return (HashMap) new Gson().fromJson(str, TypeToken.getParameterized(HashMap.class, cls, cls2).getType());
    }

    public static String g(Object obj) {
        return new Gson().toJson(obj);
    }
}
