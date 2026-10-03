package com.omron;

import com.oplus.aiunit.vision.b78;

/* JADX INFO: loaded from: classes5.dex */
public class az {
    private static final String g = b78.a().getExternalCacheDir() + "/omron_ble_file/";
    public String a = "OMRON-Lib";
    public String b = g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8833c = 5000000;
    public long d = 604800000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8834e = 5000000;
    public int f = 10;

    private void b() {
    }

    public az a(String str) {
        this.b = str;
        return this;
    }

    public ba a() {
        b();
        return new ba(this);
    }
}
