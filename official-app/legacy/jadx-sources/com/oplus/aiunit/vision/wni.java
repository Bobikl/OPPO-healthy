package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import com.oplus.mydevices.sdk.IResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class wni {
    public static final int ACTION_TIMEOUT = 30000;
    public static final String ERROT_TIMEOUT = "errot_timeout";
    public static final String TAG = "LA.StatusAction";
    public IResult a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18327c;
    public Handler d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f18328e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wni.this.i(-1, wni.ERROT_TIMEOUT);
        }
    }

    public final boolean a(String str) {
        if (this.a == null) {
            return true;
        }
        if (Objects.equals(str, this.b)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkNull: mac:");
        sb.append(str);
        sb.append("    mMac:");
        sb.append(this.b);
        return true;
    }

    public void b(String str, IResult iResult) {
        g(str, iResult, true);
    }

    public void c(String str, IResult iResult) {
        g(str, iResult, false);
    }

    public void d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("doConnectAction: mac:");
        sb.append(str);
        if (a(str)) {
            return;
        }
        i(this.f18327c ? 100 : -1, "");
    }

    public void e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("doDisconnectAction: mac:");
        sb.append(str);
        if (a(str)) {
            return;
        }
        i(this.f18327c ? -1 : 100, "");
    }

    public String f() {
        return this.b;
    }

    public final void g(String str, IResult iResult, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("init: mac:");
        sb.append(str);
        sb.append("    connect:");
        sb.append(z);
        this.a = iResult;
        this.b = str;
        this.f18327c = z;
        this.d.removeCallbacksAndMessages(null);
        this.d.postDelayed(this.f18328e, 30000L);
    }

    public void h() {
        this.a = null;
        this.d.removeCallbacksAndMessages(null);
    }

    public void i(int i, String str) {
        IResult iResult = this.a;
        if (iResult != null) {
            try {
                iResult.result(i, str);
            } catch (Exception e2) {
                a7b.b(TAG, "Exception!!!" + e2.getMessage());
            }
            h();
        }
    }
}
