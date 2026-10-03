package com.autonavi.aps.amapapi.restruct;

import android.net.wifi.WifiInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public final class j {
    private WifiInfo a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1137c;
    private int d = -1;

    public j(WifiInfo wifiInfo) {
        this.a = wifiInfo;
    }

    public final String a() {
        if (this.f1137c == null) {
            this.f1137c = h.a(this.a);
        }
        return this.f1137c;
    }

    public final String b() {
        if (this.b == null) {
            this.b = h.b(this.a);
        }
        return this.b;
    }

    public final int c() {
        if (this.d == -1) {
            this.d = h.c(this.a);
        }
        return this.d;
    }

    public final boolean d() {
        return (this.a == null || TextUtils.isEmpty(b()) || !com.autonavi.aps.amapapi.utils.k.a(a())) ? false : true;
    }
}
