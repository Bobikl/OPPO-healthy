package com.oplus.oms.split.full.splitload;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.oplus.aiunit.vision.ajd;
import com.oplus.aiunit.vision.r7i;
import com.oplus.aiunit.vision.u7i;
import com.oplus.aiunit.vision.w7i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements e, Runnable, b.a {
    public static final String d = "SplitLoadTask";
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ajd f20033j;
    public d k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                c cVar = c.this;
                cVar.i.a(cVar);
                c.this.notifyAll();
            }
        }
    }

    public c(r7i r7iVar, List<Intent> list, ajd ajdVar) {
        this.i = new b(this, r7iVar, list);
        this.f20033j = ajdVar;
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public void a(String str) throws SplitLoadException {
        d().c(str);
    }

    public Context c() {
        return this.i.b.a();
    }

    public d d() {
        if (this.k == null) {
            this.k = a();
        }
        return this.k;
    }

    public final void e() {
        try {
            wait();
        } catch (InterruptedException e2) {
            w7i.h(d, "Failed to block thread " + Thread.currentThread().getName(), e2);
            if (this.f20033j != null) {
                u7i u7iVar = new u7i("all", "all", -99);
                ArrayList arrayList = new ArrayList();
                arrayList.add(u7iVar);
                this.f20033j.a(arrayList);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.i.a(this);
            return;
        }
        synchronized (this) {
            this.i.a.post(new a());
            e();
        }
    }

    @Override // com.oplus.oms.split.full.splitload.b.a
    public void a(List<u7i> list) {
        this.f20033j.a(list);
    }
}
