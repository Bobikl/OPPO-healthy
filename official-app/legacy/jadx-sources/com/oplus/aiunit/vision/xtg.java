package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes18.dex */
public class xtg {
    public static <T> T a(String str, Class<?> cls) {
        return (T) new Gson().fromJson(str, (Type) cls);
    }

    public static <T> String b(T t) {
        return new Gson().toJson(t);
    }
}
