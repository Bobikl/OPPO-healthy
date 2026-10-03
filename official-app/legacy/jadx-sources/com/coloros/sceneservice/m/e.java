package com.coloros.sceneservice.m;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e {
    public static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    public static String b(List list) {
        return list == null ? "null" : Arrays.toString(list.toArray());
    }
}
