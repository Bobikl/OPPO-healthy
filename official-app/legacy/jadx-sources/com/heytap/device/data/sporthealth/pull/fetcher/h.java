package com.heytap.device.data.sporthealth.pull.fetcher;

import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hbi;
import com.oplus.aiunit.vision.zq0;
import com.oplus.aiunit.vision.zq8;
import com.oplus.aiunit.vision.zw4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public abstract class h {
    public static final int RESULT_ERROR_BT = 2;
    public static final int RESULT_ERROR_DATA = 3;
    public static final int RESULT_ERROR_SAVE = 4;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_TIMEOUT = 5;
    public static final String TAG = "Data-Sync";
    public static final ExecutorService m = zq8.e("Data-Sync");
    public volatile String f;
    public volatile int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f2947j;
    public final int a = 60000;
    public final List<b> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f2945c = new ArrayList();
    public zq0 d = zq0.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f2946e = false;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public volatile boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f2948l = false;

    public interface a {
        void a(h hVar, int i);
    }

    public interface b {
        void a(h hVar, int i);
    }

    public void h(a aVar) {
        this.f2945c.add(aVar);
    }

    public void i(b bVar) {
        this.b.add(bVar);
    }

    public int j(long j2, String str) {
        double[] dArrI = hbi.a(str).I();
        return (int) (Math.max(j2 / dArrI[0], (int) dArrI[1]) * 1000.0d);
    }

    public boolean k(int i) {
        this.f = zq0.w().x();
        if (this.f == null) {
            return false;
        }
        this.g = hbi.a(gl4.managerApi.getCurrentConnectId()).y2();
        this.k = hbi.a(this.f).l4();
        this.f2948l = hbi.a(this.f).n4(i);
        return true;
    }

    public String l(int i) {
        if (i == 1) {
            return "RESULT_SUCCESS";
        }
        if (i == 2) {
            return "RESULT_ERROR_BT";
        }
        if (i == 3) {
            return "RESULT_ERROR_DATA";
        }
        if (i != 4) {
            return i != 5 ? "" : "RESULT_TIMEOUT";
        }
        return "RESULT_SAVE_FAIL";
    }

    public abstract String m();

    public int n() {
        return this.f2947j;
    }

    public int o() {
        return this.i;
    }

    public boolean p() {
        return this.h;
    }

    public boolean q() {
        return this.f2948l;
    }

    public void r(int i) {
        a7b.f("Data-Sync", m() + " Fetch bt data complete, result=" + l(i));
        if (this.f2945c.size() > 0) {
            Iterator it = new ArrayList(this.f2945c).iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this, i);
            }
        }
    }

    public void s(int i) {
        a7b.f("Data-Sync", m() + " Fetch complete, result=" + l(i));
        this.f2946e = false;
        if (this.b.size() > 0) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(this, i);
            }
        }
    }

    public void t(b bVar) {
        this.b.remove(bVar);
    }

    public void u(int i, int i2) {
        zw4.n(i, this.f, i2, this.g);
    }

    public void v(boolean z) {
        this.h = z;
    }

    public void w(int i) {
        if (this.f2947j < i) {
            this.f2947j = i;
        }
    }

    public void x(int i) {
        if (this.i == 0) {
            this.i = i;
        }
    }

    public abstract void y();
}
