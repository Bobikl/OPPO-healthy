package com.heytap.device.data.sporthealth.pull.fetcher;

import android.os.Handler;
import android.os.Looper;
import com.oplus.aiunit.vision.hii;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.od7;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.yei;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class j implements ul4.b {
    public static c s = new a();
    public final String k;
    public final int l;
    public final String m;
    public Handler o;
    public b q;
    public final String i = "FileReceiver";
    public final qr0 j = qr0.w();
    public int n = -1;
    public final LinkedHashMap<String, String> p = new LinkedHashMap<>();
    public c r = s;

    public class a implements c {
        @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.c
        public String a(od7 od7Var) {
            return od7Var.b();
        }

        @Override // com.heytap.device.data.sporthealth.pull.fetcher.j.c
        public boolean b(od7 od7Var) {
            return true;
        }
    }

    public interface b {
        void b(String str, String str2);

        void c();

        void f(int i);
    }

    public interface c {
        String a(od7 od7Var);

        boolean b(od7 od7Var);
    }

    public j(String str, String str2, int i) {
        this.k = str;
        this.l = i;
        this.m = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        m8b.b("FileReceiver", "On receive file timeout, uri=" + this.k);
        i(hii.ROLLER_SKATING);
    }

    public void a(String str, od7 od7Var) {
    }

    public void b(String str, od7 od7Var) {
        m8b.f("FileReceiver", "On file transfer completed, fileName=" + od7Var.b());
        if (!g(od7Var) || this.p.get(od7Var.h()) == null) {
            m8b.f("FileReceiver", "File not match, uri=" + od7Var.i() + " fileName=" + od7Var.b());
            return;
        }
        if (od7Var.a() == 0) {
            if (this.p.get(od7Var.h()) != null) {
                j(str, od7Var);
                return;
            } else {
                m8b.b("FileReceiver", "On file transfer error, file path not exist");
                return;
            }
        }
        m8b.b("FileReceiver", "On file transfer error, code=" + od7Var.a());
        i(od7Var.a());
    }

    public void c(String str, od7 od7Var) {
        m8b.f("FileReceiver", "On file transfer requested, fileName=" + od7Var.b());
        if (!g(od7Var)) {
            m8b.f("FileReceiver", "File not match, uri=" + od7Var.i() + " fileName=" + od7Var.b());
            return;
        }
        String absolutePath = new File(this.m, this.r.a(od7Var)).getAbsolutePath();
        this.p.put(od7Var.h(), absolutePath);
        if (!this.j.J(od7Var.h(), absolutePath)) {
            i(hii.ROLLER_SKATING);
        } else {
            m8b.f("FileReceiver", "Send receive file msg");
            e(f(od7Var.c()));
        }
    }

    public final void e(int i) {
        if (this.o == null) {
            this.o = new Handler(Looper.getMainLooper());
        }
        this.o.removeCallbacksAndMessages(null);
        this.o.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.gd7
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h();
            }
        }, i);
    }

    public final int f(long j) {
        return (int) (Math.max(j / yei.a(wl4.managerApi.getCurrentConnectId()).I()[0], 30.0d) * 1000.0d);
    }

    public final boolean g(od7 od7Var) {
        int i = this.n;
        if (i <= 0 || i == od7Var.g()) {
            return this.r.b(od7Var);
        }
        return false;
    }

    public final void i(int i) {
        k();
        b bVar = this.q;
        if (bVar != null) {
            bVar.f(i);
        }
    }

    public final void j(String str, od7 od7Var) {
        m8b.f("FileReceiver", "On receive one file SUCCESS, fileName=" + od7Var.b());
        k();
        if (this.p.size() != this.l) {
            b bVar = this.q;
            if (bVar != null) {
                bVar.b(str, this.p.get(od7Var.h()));
                return;
            }
            return;
        }
        b bVar2 = this.q;
        if (bVar2 != null) {
            bVar2.b(str, this.p.get(od7Var.h()));
            this.q.c();
        }
    }

    public final void k() {
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void l(b bVar) {
        this.q = bVar;
    }

    public void m(c cVar) {
        this.r = cVar;
    }

    public void n() {
        StringBuilder sb = new StringBuilder();
        sb.append("Start file receive, uri=");
        sb.append(this.k);
        sb.append(" serviceId=");
        int i = this.n;
        sb.append(i == -1 ? "未指定" : Integer.valueOf(i));
        m8b.f("FileReceiver", sb.toString());
        qr0.w().L(this.k, this);
        e(30000);
    }

    public void o() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stop file receive, uri=");
        sb.append(this.k);
        sb.append(" serviceId=");
        int i = this.n;
        sb.append(i == -1 ? "未指定" : Integer.valueOf(i));
        m8b.f("FileReceiver", sb.toString());
        this.p.clear();
        qr0.w().V(this.k, this);
        k();
    }
}