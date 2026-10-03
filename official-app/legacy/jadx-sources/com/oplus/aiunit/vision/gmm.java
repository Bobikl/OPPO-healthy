package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class gmm {
    public static int a = 60;
    public static int b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f11819c = "OpenSDK.Client.File.Tracer";
    public static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f11820e;
    public static long f;
    public static int g;
    public static int h;
    public static int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f11821j;
    public static String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f11822l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f11823n;
    public static String o;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Tencent");
        String str = File.separator;
        sb.append(str);
        sb.append("msflogs");
        sb.append(str);
        sb.append("com");
        sb.append(str);
        sb.append("tencent");
        sb.append(str);
        sb.append("mobileqq");
        sb.append(str);
        d = sb.toString();
        f11820e = ".log";
        f = 8388608L;
        g = 262144;
        h = 1024;
        i = 10000;
        f11821j = "debug.file.blockcount";
        k = "debug.file.keepperiod";
        f11822l = "debug.file.tracelevel";
        m = 24;
        f11823n = 604800000L;
        o = s04.APP_SPECIFIC_ROOT + str + "logs";
    }
}
