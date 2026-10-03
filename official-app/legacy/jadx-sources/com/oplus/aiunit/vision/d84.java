package com.oplus.aiunit.vision;

import android.os.Handler;
import android.text.TextUtils;
import com.heytap.health.wallet.widget.NetStatusErrorView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class d84 {
    public Handler a = new Handler();
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10417c = false;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NetStatusErrorView f10418e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d84.this.f10418e.setVisibility(0);
            d84.this.f10418e.p();
            d84.this.b = Calendar.getInstance().getTimeInMillis();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d84.this.d();
        }
    }

    public void c(long j2) {
        if (this.a == null) {
            this.a = new Handler();
        }
        this.a.postDelayed(new b(), j2);
    }

    public void d() {
        NetStatusErrorView netStatusErrorView = this.f10418e;
        if (netStatusErrorView == null) {
            return;
        }
        netStatusErrorView.setVisibility(8);
        this.f10418e.setFinishTag(Boolean.TRUE);
        this.d = 0;
        this.b = 0L;
        this.f10417c = false;
    }

    public void e() {
        if (this.f10418e == null) {
            return;
        }
        int i = this.d;
        if (i > 0) {
            this.d = i - 1;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (this.d > 0 || this.f10417c) {
            return;
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        long j2 = this.b;
        if (timeInMillis - j2 >= 0) {
            d();
        } else {
            c(0 - (timeInMillis - j2));
        }
    }

    public void f(NetStatusErrorView netStatusErrorView) {
        this.f10418e = netStatusErrorView;
    }

    public void g() {
        this.f10417c = false;
        this.d = 0;
        this.b = 0L;
    }

    public void h() {
        if (this.f10418e == null) {
            return;
        }
        if (this.d <= 0) {
            if (this.a == null) {
                this.a = new Handler();
            }
            this.f10418e.n();
            this.a.postDelayed(new a(), 50L);
        }
        this.d++;
    }

    public void i(int i, String str) {
        if (this.f10418e == null || TextUtils.isEmpty(str)) {
            return;
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (i == -111111) {
            this.f10418e.d(str);
        } else {
            this.f10418e.h(i, str);
        }
        this.f10417c = true;
        this.d--;
    }

    public void j(String str) {
        i(-111111, str);
    }
}
