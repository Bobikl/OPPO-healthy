package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.splitdownload.SplitUpdateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class v5n implements f2a {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17726j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h7i f17727l;
    public SplitUpdateInfo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v5n f17728n;

    public v5n(h7i h7iVar) {
        this.f17727l = h7iVar;
    }

    @Override // com.oplus.aiunit.vision.f2a
    public String a() {
        h7i h7iVar = this.f17727l;
        return h7iVar == null ? "" : h7iVar.a();
    }

    public v5n b() {
        return this.f17728n;
    }

    public void c(v5n v5nVar) {
        this.f17728n = v5nVar;
    }

    public void d(SplitUpdateInfo splitUpdateInfo) {
        this.m = splitUpdateInfo;
    }

    public int e() {
        return this.i;
    }

    public String f() {
        return this.f17726j + "@" + this.k;
    }

    public int g() {
        return this.k;
    }

    public String h() {
        return this.f17726j;
    }

    public SplitUpdateInfo i() {
        return this.m;
    }

    public h7i j() {
        return this.f17727l;
    }

    public String toString() {
        return "SplitVersionInfo{, mFrom=" + this.i + ", mInstallVersionCode=" + this.k + ", mDefaultInfo=" + this.f17728n + '}';
    }
}
