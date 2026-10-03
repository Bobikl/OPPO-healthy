package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes5.dex */
public class mc7 {
    public String a = FileTransferTask.ERROR_TASK_ID;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14018c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14019e;
    public long f;
    public int g;
    public int h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14020j;

    public int a() {
        return this.h;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.f14019e;
    }

    public long d() {
        return this.f;
    }

    public String e() {
        return this.f14020j;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.f14018c;
    }

    public String h() {
        return this.a;
    }

    public String i() {
        return this.d;
    }

    public boolean j() {
        return this.i;
    }

    public void k(int i) {
        this.h = i;
    }

    public void l(String str) {
        this.b = str;
    }

    public void m(long j2) {
        this.f14019e = j2;
    }

    public void n(long j2) {
        this.f = j2;
    }

    public void o(int i) {
        this.g = i;
    }

    public void p(boolean z) {
        this.i = z;
    }

    public void q(int i) {
        this.f14018c = i;
    }

    public void r(String str) {
        this.a = str;
    }

    public void s(String str) {
        this.d = str;
    }

    public String toString() {
        return "FileTaskInfo{fileName='" + this.b + "', mTaskId='" + this.a + "', serviceId=" + this.f14018c + ", uri='" + this.d + "', fileSize=" + this.f14019e + ", fileTransferSize=" + this.f + ", progress=" + this.g + '}';
    }
}
