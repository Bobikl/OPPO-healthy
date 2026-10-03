package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
@u2n(a = "update_item_download_info")
public class ujm {

    @v2n(a = "mAdcode", b = 6)
    public String a;

    @v2n(a = "fileLength", b = 5)
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v2n(a = "splitter", b = 2)
    public int f17487c;

    @v2n(a = "startPos", b = 5)
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v2n(a = "endPos", b = 5)
    public long f17488e;

    public ujm() {
        this.a = "";
        this.b = 0L;
        this.f17487c = 0;
        this.d = 0L;
        this.f17488e = 0L;
    }

    public static String a(String str) {
        return "mAdcode='" + str + "'";
    }

    public ujm(String str, long j2, int i, long j3, long j4) {
        this.a = str;
        this.b = j2;
        this.f17487c = i;
        this.d = j3;
        this.f17488e = j4;
    }
}
