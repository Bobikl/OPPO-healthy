package com.heytap.store.base.core.util.encryption;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class BaseUtils {
    @SafeVarargs
    public static <T> List<T> addList(List<T> list, T... tArr) {
        if (list == null) {
            return new ArrayList(Arrays.asList(tArr));
        }
        list.addAll(new ArrayList(Arrays.asList(tArr)));
        return list;
    }

    @SafeVarargs
    public static <T> Map<String, T> addMap(Map<String, T> map, Object... objArr) {
        HashMap map2;
        Map map3 = map;
        if (map == null) {
            map2 = new HashMap();
        }
        if (objArr == null) {
            map3 = map2;
            return (Map<String, T>) map3;
        }
        if (objArr.length % 2 != 0) {
            map3 = map2;
            throw new RuntimeException("create map error ");
        }
        map3 = map2;
        int i = 0;
        while (i < objArr.length) {
            try {
                int i2 = i + 1;
                map3.put((String) objArr[i], objArr[i2]);
                i = i2 + 1;
            } catch (Exception e2) {
                throw new RuntimeException("create map error", e2);
            }
        }
        return (Map<String, T>) map3;
    }

    @SafeVarargs
    public static <T> List<T> createList(T... tArr) {
        return addList(null, tArr);
    }

    @SafeVarargs
    public static <T> Set<T> createSet(T... tArr) {
        return new HashSet(addList(null, tArr));
    }

    public static String empty(Object obj) {
        return nvl(obj, "");
    }

    public static String format(String str, Object... objArr) {
        for (Object obj : objArr) {
            str = str.replaceFirst("\\{\\}", String.valueOf(obj));
        }
        return str;
    }

    public static String nvl(Object obj) {
        return nvl(obj, "");
    }

    public static String empty(Object obj, String str) {
        return TextUtils.isEmpty((String) obj) ? empty(str) : obj.toString().trim();
    }

    public static String nvl(Object obj, String str) {
        return TextUtils.isEmpty((String) obj) ? str : obj.toString().trim();
    }
}
