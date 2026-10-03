package com.heytap.mspsdk.core;

/* JADX INFO: loaded from: classes19.dex */
public class d {
    public static volatile boolean a = false;
    public static volatile boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f7397c;

    public static void a() {
        if (f7397c) {
            b();
        }
    }

    public static void b() {
        b = false;
        a = false;
        f7397c = false;
    }
}
