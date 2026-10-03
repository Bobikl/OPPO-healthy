package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.oms.split.full.splitdownload.DownloadCallback;
import com.oplus.oms.split.full.splitdownload.DownloadRequest;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class pbm {
    public int a;
    public List<DownloadRequest> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15304c;
    public DownloadCallback d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15305e;

    public pbm(int i, @NonNull List<DownloadRequest> list, boolean z, @NonNull DownloadCallback downloadCallback, boolean z2) {
        this.a = i;
        this.b = list;
        this.f15304c = z;
        this.d = downloadCallback;
        this.f15305e = z2;
    }

    public DownloadCallback a() {
        return this.d;
    }

    public void b(boolean z) {
        this.f15305e = z;
    }

    public void c(boolean z) {
        this.f15304c = z;
    }

    public boolean d() {
        return this.f15305e;
    }

    public List<DownloadRequest> e() {
        return this.b;
    }

    public boolean f() {
        return this.f15304c;
    }

    public int g() {
        return this.a;
    }
}
