package com.heytap.device.data.sporthealth.pull.fetcher;

import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.qx4;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.yei;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public abstract class h {
    public static final int RESULT_ERROR_BT = 2;
    public static final int RESULT_ERROR_DATA = 3;
    public static final int RESULT_ERROR_SAVE = 4;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_TIMEOUT = 5;
    public static final String TAG = "Data-Sync";
    public static final ExecutorService m = cs8.e("Data-Sync");
    public volatile String f;
    public volatile int i;
    public volatile int j;
    public final int a = 60000;
    public final List<b> b = new ArrayList();
    public final List<a> c = new ArrayList();
    public qr0 d = qr0.w();
    public volatile boolean e = false;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public volatile boolean k = false;
    public volatile boolean l = false;

    public interface a {
        void a(h hVar, int i);
    }

    public interface b {
        void a(h hVar, int i);
    }

    public void h(a aVar) {
        this.c.add(aVar);
    }

    public void i(b bVar) {
        this.b.add(bVar);
    }

    public int j(long j, String str) {
        double[] dArrI = yei.a(str).I();
        return (int) (Math.max(j / dArrI[0], (int) dArrI[1]) * 1000.0d);
    }

    public boolean k(int i) {
        this.f = qr0.w().x();
        if (this.f == null) {
            return false;
        }
        this.g = yei.a(wl4.managerApi.getCurrentConnectId()).z2();
        this.k = yei.a(this.f).k4();
        this.l = yei.a(this.f).m4(i);
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
            return i != 5 ? kq5.NOT_SET : "RESULT_TIMEOUT";
        }
        return "RESULT_SAVE_FAIL";
    }

    public abstract String m();

    public int n() {
        return this.j;
    }

    public int o() {
        return this.i;
    }

    public boolean p() {
        return this.h;
    }

    public boolean q() {
        return this.l;
    }

    public void r(int i) {
        m8b.f("Data-Sync", m() + " Fetch bt data complete, result=" + l(i));
        if (this.c.size() > 0) {
            Iterator it = new ArrayList(this.c).iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this, i);
            }
        }
    }

    public void s(int i) {
        m8b.f("Data-Sync", m() + " Fetch complete, result=" + l(i));
        this.e = false;
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
        qx4.n(i, this.f, i2, this.g);
    }

    public void v(boolean z) {
        this.h = z;
    }

    public void w(int i) {
        if (this.j < i) {
            this.j = i;
        }
    }

    public void x(int i) {
        if (this.i == 0) {
            this.i = i;
        }
    }

    public abstract void y();
}