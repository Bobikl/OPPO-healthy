package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes18.dex */
public abstract class jrc {
    public Handler a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12994c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f12995e;
    public b f;
    public Runnable g;

    public class a extends w60<String> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            t6b.i("NfcGetCplcTask", "get cplc failed, " + obj.toString() + ",  retry " + this.b);
            jrc.this.j(this.b + (-1));
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(String str) {
            t6b.i("NfcGetCplcTask", "get cplc success: " + str + " " + this.b + "  time");
            if (e1j.l(str)) {
                jrc.this.f.a(this.b - 1);
                jrc.this.a.postDelayed(jrc.this.f, jrc.this.b * jrc.this.f12995e[this.b - 1]);
            } else {
                jrc.this.a.removeCallbacks(jrc.this.g);
                jrc.this.l(str);
            }
        }
    }

    public class b implements Runnable {
        public int i;

        public void a(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            jrc.this.j(this.i);
        }

        public b() {
        }
    }

    public jrc() {
        this.a = new Handler(Looper.getMainLooper());
        this.b = 1500;
        this.f12994c = 8500;
        this.d = 3;
        this.f12995e = new int[]{0, 1, 1};
        this.f = new b();
        this.g = new Runnable() { // from class: com.oplus.aiunit.vision.irc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        t6b.b("NfcGetCplcTask", "get cplc time out!");
        this.a.removeCallbacks(this.f);
        l("");
    }

    public void h() {
        this.a.postDelayed(this.g, this.f12994c);
        j(this.d);
    }

    public void i(int[] iArr) {
        this.a.postDelayed(this.g, this.f12994c);
        this.f12995e = iArr;
        j(this.d);
    }

    public final void j(int i) {
        if (i >= 1) {
            tpc.b().g(new a70(), new a(i));
            return;
        }
        t6b.i("NfcGetCplcTask", "get cplc is null");
        this.a.removeCallbacks(this.g);
        l("");
    }

    public abstract void l(String str);

    public jrc(int i, int i2, int i3) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = 1500;
        this.f12994c = 8500;
        this.d = 3;
        this.f12995e = new int[]{0, 1, 1};
        this.f = new b();
        this.g = new Runnable() { // from class: com.oplus.aiunit.vision.irc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k();
            }
        };
        this.b = i2;
        this.f12994c = i;
        this.d = i3;
    }
}
