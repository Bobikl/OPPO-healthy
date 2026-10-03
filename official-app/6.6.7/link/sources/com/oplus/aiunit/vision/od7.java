package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class od7 {
    public String a = FileTransferTask.ERROR_TASK_ID;
    public String b;
    public int c;
    public String d;
    public long e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public String j;

    public int a() {
        return this.h;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.e;
    }

    public long d() {
        return this.f;
    }

    public String e() {
        return this.j;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.c;
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

    public void m(long j) {
        this.e = j;
    }

    public void n(long j) {
        this.f = j;
    }

    public void o(int i) {
        this.g = i;
    }

    public void p(boolean z) {
        this.i = z;
    }

    public void q(int i) {
        this.c = i;
    }

    public void r(String str) {
        this.a = str;
    }

    public void s(String str) {
        this.d = str;
    }

    public String toString() {
        return "FileTaskInfo{fileName='" + this.b + "', mTaskId='" + this.a + "', serviceId=" + this.c + ", uri='" + this.d + "', fileSize=" + this.e + ", fileTransferSize=" + this.f + ", progress=" + this.g + '}';
    }
}
