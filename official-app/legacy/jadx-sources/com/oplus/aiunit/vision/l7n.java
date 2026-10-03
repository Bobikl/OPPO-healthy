package com.oplus.aiunit.vision;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class l7n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecimalFormat f13563e = new DecimalFormat("0.00");
    public final ExecutorService a;
    public nmm<List<byte[]>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7n f13564c;
    public final com.xingin.xhssharesdk.b.r d;

    public l7n(final com.xingin.xhssharesdk.b.r rVar, b7n b7nVar) {
        d();
        this.f13564c = b7nVar;
        this.d = rVar;
        this.a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.f7n
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return l7n.c(rVar, runnable);
            }
        });
        f();
    }

    public static Thread c(com.xingin.xhssharesdk.b.r rVar, Runnable runnable) {
        return new Thread(runnable, "TrackerUpload-" + rVar.a);
    }

    public final void d() {
        bqm bqmVar;
        try {
            bqmVar = new bqm(new wcm());
        } catch (Throwable unused) {
            bqmVar = null;
        }
        this.b = bqmVar;
        if (bqmVar != null) {
            v6n.a("use OKHTTPTransport ", new Object[0]);
        } else {
            this.b = new msm(new wcm());
            v6n.a("use OriginalHTTPTransport ", new Object[0]);
        }
    }

    public final void e(yum yumVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(yumVar.f19163c);
        arrayList2.add(yumVar);
        v6n.a("uploadData() count=%s length=%s \nresult=%s", 1, f13563e.format(yumVar.f19163c.length / 1024.0d) + "KB", this.b.a(arrayList));
    }

    public final void f() {
        b7n b7nVar = this.f13564c;
        long jA = b7nVar.a.a();
        b7nVar.a.getClass();
        b7nVar.a.getClass();
        long j2 = (jA + 99) / 100;
        for (long j3 = 0; j3 < j2; j3++) {
            i();
        }
    }

    public final void g(final yum yumVar) {
        this.a.execute(new Runnable() { // from class: com.oplus.aiunit.vision.h7n
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e(yumVar);
            }
        });
    }

    public final void h() {
        ArrayList<yum> arrayListF = this.f13564c.a.f();
        if (arrayListF == null || arrayListF.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long length = 0;
        for (yum yumVar : arrayListF) {
            byte[] bArr = yumVar.f19163c;
            if (bArr.length >= 1048576) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList3.add(yumVar.f19163c);
                arrayList4.add(yumVar);
                avm avmVarA = this.b.a(arrayList3);
                v6n.a("%s, uploadData() count=%s length=%s \nresult=%s", this.d, 1, f13563e.format(yumVar.f19163c.length / 1024.0d) + "KB", avmVarA);
                if (avmVarA.a) {
                    this.f13564c.a.c(arrayList4);
                }
            } else {
                if (((long) bArr.length) + length > 1048576) {
                    avm avmVarA2 = this.b.a(arrayList);
                    v6n.a("%s, uploadData() count=%s length=%s \nresult=%s", this.d, Integer.valueOf(arrayList2.size()), f13563e.format(length / 1024.0d) + "KB", avmVarA2);
                    if (avmVarA2.a) {
                        this.f13564c.a.c(arrayList2);
                    }
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    length = 0;
                }
                byte[] bArr2 = yumVar.f19163c;
                length += (long) bArr2.length;
                arrayList.add(bArr2);
                arrayList2.add(yumVar);
            }
        }
        if (length > 0) {
            avm avmVarA3 = this.b.a(arrayList);
            v6n.a("%s, uploadData() count=%s length=%s \nresult=%s", this.d, Integer.valueOf(arrayList2.size()), f13563e.format(length / 1024.0d) + "KB", avmVarA3);
            if (avmVarA3.a) {
                this.f13564c.a.c(arrayList2);
            }
        }
    }

    public final void i() {
        this.a.execute(new Runnable() { // from class: com.oplus.aiunit.vision.g7n
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h();
            }
        });
    }
}
