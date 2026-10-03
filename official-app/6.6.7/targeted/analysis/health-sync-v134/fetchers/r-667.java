package com.heytap.device.data.sporthealth.pull.fetcher;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class r extends h implements h.b {
    public final LinkedList<h> n = new LinkedList<>();
    public int o = 0;
    public boolean p = false;
    public int q = 0;
    public Handler r;

    public r A(h hVar) {
        this.n.add(hVar);
        return this;
    }

    public final synchronized void B() {
        if (this.n.size() > 0) {
            h hVarRemoveFirst = this.n.removeFirst();
            hVarRemoveFirst.i(this);
            hVarRemoveFirst.y();
        }
    }

    public final Handler C() {
        if (this.r == null) {
            this.r = new Handler(Looper.getMainLooper());
        }
        return this.r;
    }

    public void D(boolean z) {
        this.p = z;
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h.b
    public void a(h hVar, int i) {
        if (i != 1) {
            this.o++;
            if (this.p) {
                super.s(i);
                return;
            }
        } else if (hVar.p()) {
            v(true);
        }
        hVar.t(this);
        if (this.n.isEmpty()) {
            this.e = false;
            super.s(i);
        } else if (this.q == 0) {
            B();
        } else {
            C().postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.lxg
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.B();
                }
            }, this.q);
        }
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public String m() {
        return "SerialDataFetcher";
    }

    @Override // com.heytap.device.data.sporthealth.pull.fetcher.h
    public synchronized void y() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (!this.n.isEmpty()) {
            B();
        } else {
            this.e = false;
            super.s(1);
        }
    }
}