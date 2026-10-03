package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpConst;

/* JADX INFO: loaded from: classes19.dex */
public class vye {
    public static byte[] a = {111, 112, 112, 111};
    public static byte[] b = {114, 101, 97, 108, 109, 101};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static byte[] f18037c = {111, 110, 101, 112, 108, 117, 115};
    public static byte[] d = {67, 111, 108, 111, 114, 79, 83};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static byte[] f18038e = {99, 111, 108, 111, 114, 79, 115};
    public static byte[] f = {99, 111, 108, 111, 114};

    public static String a() {
        return new String(a);
    }

    public static String b() {
        return new String(f18037c);
    }

    public static String c() {
        return new String(b);
    }

    public static String d() {
        return new String(f);
    }

    public static String e() {
        return new String(d);
    }

    public static String f() {
        return "persist.sys." + new String(a) + ".region";
    }

    public static String g() {
        return "ro.build.version." + new String(a) + HttpConst.ROM;
    }

    public static String h() {
        return new String(f18038e);
    }

    public static String i() {
        return new String(a) + ".version.exp";
    }

    public static String j() {
        return "com." + new String(f18037c) + ".mobilephone";
    }
}
