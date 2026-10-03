package com.oplus.aiunit.vision;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class u3n {
    public static WeakReference<s3n> a;

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f17284j;

        public a(String str, Context context) {
            this.i = str;
            this.f17284j = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (u3n.class) {
                try {
                    String strB = t0n.b(w0n.n(this.i));
                    s3n s3nVarA = z3n.a(u3n.a);
                    z3n.f(this.f17284j, s3nVarA, b2n.f9567j, 50, 102400, "10");
                    if (s3nVarA.f16462e == null) {
                        s3nVarA.f16462e = new a3n(new d3n(new c3n()));
                    }
                    t3n.c(strB, w0n.n(" \"timestamp\":\"" + w0n.c(System.currentTimeMillis(), ozj.DATE_TIME_FORMAT) + "\",\"details\":" + this.i), s3nVarA);
                } catch (Throwable th) {
                    c2n.r(th, "mam", "ap");
                }
            }
        }
    }

    public static void a(String str, Context context) {
        c2n.s().submit(new a(str, context));
    }
}
