package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class b84 extends t91 {
    public static final int CONTENT_ITEM_DOWNLOAD_MANAGER = 2;
    public static final int CONTENT_ITEM_EXPERIMENT = 4;
    public static final int CONTENT_ITEM_HAS_BUY = 3;
    public static final int CONTENT_ITEM_HISTORY = 5;
    public static final int CONTENT_ITEM_MY_COUPON = 6;
    public static final int CONTENT_ITEM_MY_WF = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9639c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9640e;
    public int f;
    public boolean g;

    public b84(int i) {
        super(3);
        this.f9639c = i;
    }

    public int d() {
        return this.f9639c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.f;
    }

    public String g() {
        return this.f9640e;
    }

    public boolean h() {
        return this.f9639c == 2;
    }

    public boolean i() {
        return this.g;
    }

    public void j(int i) {
        this.d = i;
    }

    public void k(int i) {
        this.f = i;
    }

    public void l(String str) {
        this.f9640e = str;
    }

    public void m(boolean z) {
        this.g = z;
    }

    @Override // com.oplus.aiunit.vision.t91
    public String toString() {
        return "ContentItem{contentType=" + this.f9639c + ", title='" + this.f9640e + "', tipsCount=" + this.f + '}';
    }
}
