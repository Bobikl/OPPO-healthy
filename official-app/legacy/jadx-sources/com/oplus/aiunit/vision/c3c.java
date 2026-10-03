package com.oplus.aiunit.vision;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class c3c {
    public final List<a3c> a = new ArrayList();
    public Handler b = d3c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9937c;

    public class a implements Runnable {
        public a3c i;

        @Override // java.lang.Runnable
        public void run() {
            if (c3c.this.f9937c) {
                return;
            }
            c3c.this.b.postDelayed(this, this.i.a());
            this.i.b();
        }

        public a(a3c a3cVar) {
            this.i = a3cVar;
        }
    }

    public void c(a3c a3cVar) {
        this.a.add(a3cVar);
    }

    public void d() {
        for (a3c a3cVar : this.a) {
            a3cVar.start();
            this.b.post(new a(a3cVar));
        }
    }
}
