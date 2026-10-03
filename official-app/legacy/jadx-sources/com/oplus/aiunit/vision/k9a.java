package com.oplus.aiunit.vision;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class k9a implements Cloneable {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13200j;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13201l = null;
    public LatLonPoint m;

    public k9a(String str, String str2) {
        this.i = str;
        this.f13200j = str2;
    }

    public String a() {
        return this.f13200j;
    }

    public boolean b() {
        return this.k;
    }

    public String c() {
        return this.i;
    }

    public LatLonPoint d() {
        return this.m;
    }

    public String e() {
        return this.f13201l;
    }

    public void f(boolean z) {
        this.k = z;
    }
}
