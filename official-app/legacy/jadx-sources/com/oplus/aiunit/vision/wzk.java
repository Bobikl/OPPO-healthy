package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class wzk {
    public View a;
    public mo9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<hz9> f18453c;
    public d d;

    public class a implements mo9.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.mo9.a
        public void a(Bitmap bitmap) {
            wzk.this.f(bitmap);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Bitmap i;

        public class a implements Runnable {
            public final /* synthetic */ Bitmap i;

            public a(Bitmap bitmap) {
                this.i = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                wzk.this.d.a(this.i);
            }
        }

        public b(Bitmap bitmap) {
            this.i = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapA = this.i;
            if (bitmapA != null && wzk.this.f18453c.size() > 0) {
                Iterator it = wzk.this.f18453c.iterator();
                while (it.hasNext()) {
                    bitmapA = ((hz9) it.next()).a(bitmapA);
                }
            }
            if (wzk.this.d != null) {
                wzk.this.a.post(new a(bitmapA));
            }
        }
    }

    public static class c {
        public View a;
        public mo9 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<hz9> f18456c = new ArrayList();
        public d d;

        public c(View view) {
            this.a = view;
        }

        public c e(hz9 hz9Var) {
            if (!this.f18456c.contains(hz9Var)) {
                this.f18456c.add(hz9Var);
            }
            return this;
        }

        public wzk f() {
            return new wzk(this);
        }

        public c g(mo9 mo9Var) {
            this.b = mo9Var;
            return this;
        }

        public c h(d dVar) {
            this.d = dVar;
            return this;
        }
    }

    public interface d {
        void a(Bitmap bitmap);
    }

    public void e() {
        if (this.b == null) {
            this.b = new e45();
        }
        this.b.a(this.a, new a());
    }

    public final void f(Bitmap bitmap) {
        new qv8(new b(bitmap)).start();
    }

    public wzk(c cVar) {
        this.f18453c = new ArrayList();
        this.a = cVar.a;
        this.b = cVar.b;
        this.f18453c = cVar.f18456c;
        this.d = cVar.d;
    }
}
