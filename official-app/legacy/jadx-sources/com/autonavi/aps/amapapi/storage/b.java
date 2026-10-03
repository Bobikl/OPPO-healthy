package com.autonavi.aps.amapapi.storage;

import com.amap.api.location.AMapLocation;
import com.oplus.aiunit.vision.u2n;
import com.oplus.aiunit.vision.v2n;

/* JADX INFO: loaded from: classes13.dex */
@u2n(a = "c")
public class b {

    @v2n(a = "a2", b = 6)
    private String a;

    @v2n(a = "a3", b = 5)
    private long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v2n(a = "a4", b = 6)
    private String f1149c;
    private AMapLocation d;

    public final AMapLocation a() {
        return this.d;
    }

    public final String b() {
        return this.f1149c;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final void a(AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void a(String str) {
        this.f1149c = str;
    }

    public final void a(long j2) {
        this.b = j2;
    }
}
