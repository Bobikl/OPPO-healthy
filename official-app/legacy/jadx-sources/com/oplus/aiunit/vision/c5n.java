package com.oplus.aiunit.vision;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class c5n {
    public static volatile c5n g;
    public static Object h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9959c;
    public j6n d;
    public j6n f = new j6n();
    public b5n a = new b5n();
    public d5n b = new d5n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y4n f9960e = new y4n();

    public static class a {
        public j6n a;
        public List<k6n> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9961c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9962e;
        public long f;
        public byte g;
        public String h;
        public List<com.amap.api.col.p0003sl.ni> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9963j;
    }

    public static c5n a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new c5n();
                }
            }
        }
        return g;
    }

    public final e5n b(a aVar) {
        e5n e5nVar = null;
        if (aVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j6n j6nVar = this.d;
        if (j6nVar == null || aVar.a.a(j6nVar) >= 10.0d) {
            b5n.a aVarA = this.a.a(aVar.a, aVar.f9963j, aVar.g, aVar.h, aVar.i);
            List<k6n> listA = this.b.a(aVar.a, aVar.b, aVar.f9962e, aVar.d, jCurrentTimeMillis);
            if (aVarA != null || listA != null) {
                g6n.a(this.f, aVar.a, aVar.f, jCurrentTimeMillis);
                e5nVar = new e5n(0, this.f9960e.f(this.f, aVarA, aVar.f9961c, listA));
            }
            this.d = aVar.a;
            this.f9959c = jElapsedRealtime;
        }
        return e5nVar;
    }
}
