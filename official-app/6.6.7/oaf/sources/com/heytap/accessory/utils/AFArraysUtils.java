package com.heytap.accessory.utils;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AFArraysUtils {
    public static boolean isEmpty(@Nullable List<?> list) {
        return list == null || list.isEmpty();
    }

    public static long[] toArray(@Nullable Set<Long> set) {
        if (set == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(set);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        return jArr;
    }

    public static List<Long> toList(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }
}
