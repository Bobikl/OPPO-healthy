package com.heytap.store.base.core.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GsonUtils {
    private static final Gson gson = new Gson();
    private static final JsonParser jsonParser = new JsonParser();

    private GsonUtils() {
        throw new AssertionError();
    }

    public static <T> T fromJsonString(String str, Type type) {
        return (T) gson.fromJson(str, type);
    }

    public static final boolean isJSONValid(String str) {
        try {
            gson.fromJson(str, Object.class);
            return true;
        } catch (JsonSyntaxException unused) {
            return false;
        }
    }

    public static <T> List<T> jsonToList(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonParser.parse(str).getAsJsonArray().iterator();
        while (it.hasNext()) {
            arrayList.add(gson.fromJson(it.next(), (Class) cls));
        }
        return arrayList;
    }

    public static <T> T jsonToObject(String str, Class<T> cls) {
        try {
            return (T) gson.fromJson(str, (Class) cls);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String toJsonString(Object obj) {
        return gson.toJson(obj);
    }

    public static String toJsonString(Object obj, Type type) {
        return gson.toJson(obj, type);
    }

    public static <T> T jsonToObject(Object obj, Class<T> cls) {
        try {
            return (T) gson.fromJson(toJsonString(obj), (Class) cls);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
