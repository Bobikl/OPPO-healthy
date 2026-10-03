package com.utils;

/* JADX INFO: loaded from: classes10.dex */
public class UidUtils {
    static {
        System.loadLibrary("uidlib");
    }

    public static native long pathUid(String str);
}
