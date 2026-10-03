package com.oplus.aiunit.vision;

import com.heytap.log.consts.LogSenderConst;

/* JADX INFO: loaded from: classes12.dex */
@u2n(a = "update_item")
public class wjm {

    @v2n(a = "localPath", b = 6)
    public String h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v2n(a = "mCompleteCode", b = 2)
    public int f18305j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @v2n(a = "mState", b = 2)
    public int f18306l;

    @v2n(a = "title", b = 6)
    public String a = null;

    @v2n(a = "url", b = 6)
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v2n(a = "mAdcode", b = 6)
    public String f18303c = null;

    @v2n(a = LogSenderConst.FILENAME, b = 6)
    public String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v2n(a = "version", b = 6)
    public String f18304e = "";

    @v2n(a = "lLocalLength", b = 5)
    public long f = 0;

    @v2n(a = "lRemoteLength", b = 5)
    public long g = 0;

    @v2n(a = "isProvince", b = 2)
    public int i = 0;

    @v2n(a = "mCityCode", b = 6)
    public String k = "";

    @v2n(a = "mPinyin", b = 6)
    public String m = "";

    public static String f(String str) {
        return "mAdcode='" + str + "'";
    }

    public static String h(String str) {
        return "mPinyin='" + str + "'";
    }

    public final String a() {
        return this.a;
    }

    public final void b(String str) {
        this.f18303c = str;
    }

    public final String c() {
        return this.f18304e;
    }

    public final void d(String str) {
        this.k = str;
    }

    public final String e() {
        return this.f18303c;
    }

    public final String g() {
        return this.b;
    }

    public final int i() {
        return this.f18305j;
    }

    public final String j() {
        return this.m;
    }
}
