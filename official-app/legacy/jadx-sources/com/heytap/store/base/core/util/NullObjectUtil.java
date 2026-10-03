package com.heytap.store.base.core.util;

import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NullObjectUtil {
    private NullObjectUtil() {
    }

    public static <T> boolean isIndexInOfBounds(List<T> list, int i) {
        return (list == null || list.isEmpty() || i < 0 || i >= list.size() || list.get(i) == null) ? false : true;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static <T> boolean isNullOrEmpty(List<T> list) {
        return list == null || list.isEmpty();
    }

    public static <T> boolean isNullOrEmptyOrIndexOut(List<T> list, int i) {
        return list == null || list.isEmpty() || list.size() <= i || i < 0 || list.get(i) == null;
    }

    public static boolean notNull(Object obj) {
        return obj != null;
    }

    public static <T> boolean notNullNotEmpty(List<T> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static <T> boolean isNullOrEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> boolean notNullNotEmpty(T[] tArr) {
        return tArr != null && tArr.length > 0;
    }

    public static boolean isNullOrEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean notNullNotEmpty(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    public static boolean isNullOrEmpty(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    public static boolean notNullNotEmpty(char[] cArr) {
        return cArr != null || cArr.length > 0;
    }

    public static boolean isNullOrEmpty(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static boolean notNullNotEmpty(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    public static <K, V> boolean isNullOrEmpty(HashMap<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> boolean notNullNotEmpty(HashMap<K, V> map) {
        return (map == null || map.isEmpty()) ? false : true;
    }

    public static <K, V> boolean isNullOrEmpty(ArrayMap<K, V> arrayMap) {
        return arrayMap == null || arrayMap.isEmpty();
    }

    public static <K, V> boolean notNullNotEmpty(ArrayMap<K, V> arrayMap) {
        return (arrayMap == null || arrayMap.isEmpty()) ? false : true;
    }
}
