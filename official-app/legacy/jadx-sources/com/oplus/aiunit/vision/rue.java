package com.oplus.aiunit.vision;

import android.util.ArrayMap;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes15.dex */
public class rue {
    public static final SparseIntArray a;
    public static final SparseIntArray b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayMap<String, Integer> f16360c;
    public static final SparseIntArray d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(6, 10);
        sparseIntArray.put(1, 20);
        sparseIntArray.put(41, 20);
        sparseIntArray.put(19, 10);
        sparseIntArray.put(8, 30);
        sparseIntArray.put(9, 40);
        sparseIntArray.put(12, 40);
        sparseIntArray.put(2, 40);
        sparseIntArray.put(40, 40);
        sparseIntArray.put(22, 40);
        sparseIntArray.put(127, 30);
        sparseIntArray.put(10, 30);
        sparseIntArray.put(13, 40);
        sparseIntArray.put(14, 30);
        sparseIntArray.put(15, 40);
        sparseIntArray.put(16, 30);
        sparseIntArray.put(17, 40);
        sparseIntArray.put(18, 30);
        sparseIntArray.put(3, 50);
        sparseIntArray.put(34, 40);
        sparseIntArray.put(5, 60);
        sparseIntArray.put(7, 70);
        sparseIntArray.put(oei.OPEN_WATER_SWIM, 70);
        sparseIntArray.put(43, 30);
        sparseIntArray.put(44, 40);
        sparseIntArray.put(oei.PLAYGROUND_RUN, 40);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        b = sparseIntArray2;
        sparseIntArray2.put(-10, 10);
        sparseIntArray2.put(0, 20);
        sparseIntArray2.put(1, 30);
        sparseIntArray2.put(-1, 40);
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        f16360c = arrayMap;
        arrayMap.put("mobile", 10);
        arrayMap.put(op5.PHONE, 10);
        arrayMap.put(op5.WATCH, 30);
        arrayMap.put(op5.BAND, 30);
        arrayMap.put(op5.WATCH2, 30);
        arrayMap.put(op5.WATCH_GT, 30);
        arrayMap.put(op5.BAND2, 30);
        arrayMap.put(op5.REALME_GT, 30);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        d = sparseIntArray3;
        sparseIntArray3.put(5, 10);
        sparseIntArray3.put(4, 20);
        sparseIntArray3.put(3, 30);
        sparseIntArray3.put(2, 50);
    }

    public static int a(int i, int i2) {
        SparseIntArray sparseIntArray = d;
        return Integer.valueOf(sparseIntArray.get(i)).compareTo(Integer.valueOf(sparseIntArray.get(i2)));
    }

    public static Integer b(String str) {
        if (hz.a(str)) {
            return f16360c.get(op5.PHONE);
        }
        ArrayMap<String, Integer> arrayMap = f16360c;
        Integer num = arrayMap.get(str);
        return num != null ? num : arrayMap.get(op5.BAND);
    }

    public static int c(int i) {
        return a.get(i);
    }
}
