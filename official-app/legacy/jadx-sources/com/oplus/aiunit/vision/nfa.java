package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.oplus.sau.common.R$string;
import com.oplusos.sau.common.client.SauUpdateAgent;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nfa {
    public static int s;
    public qea a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SauUpdateAgent f14493c;
    public rpm d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14494e;
    public boolean f;
    public String g;
    public boolean h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f14495j;
    public Float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f14496l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IBinder f14497n;
    public Handler p;
    public kfa q;
    public boolean o = false;
    public pea r = new b(this);

    public static abstract class a {
        public Context a;
        public String b;
        public qea d;
        public String f;
        public int g;
        public Integer h;
        public Float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f14500j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14498c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14499e = false;
        public int k = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public IBinder f14501l = null;

        public a(Context context, int i) {
            this.a = context;
            this.f = context.getPackageName();
            this.g = i;
        }

        public a m(qea qeaVar) {
            this.d = qeaVar;
            return this;
        }

        public a n(String str) {
            this.f = str;
            return this;
        }

        public a o(boolean z) {
            this.f14499e = z;
            return this;
        }

        public a p(int i) {
            this.f14498c = i;
            return this;
        }
    }

    public static class b extends pea {
        public WeakReference a;

        public b(nfa nfaVar) {
            this.a = new WeakReference(nfaVar);
        }

        public static /* synthetic */ void g(nfa nfaVar, qea qeaVar, int i) {
            nfaVar.q = nfaVar.d(qeaVar, i);
            if (nfaVar.q != null) {
                nfaVar.q.l();
            }
        }

        @Override // com.oplus.aiunit.vision.pea
        public void a(String str, int i) {
            nfa nfaVar = (nfa) this.a.get();
            if (nfaVar == null || nfaVar.i == null) {
                if (nfaVar != null) {
                    e7b.f("SauSelfUpdateAgent", "some thing error, set observer to null");
                    nfaVar.f14493c.o(null);
                }
                e7b.f("SauSelfUpdateAgent", "agent == null");
                return;
            }
            if (!nfaVar.i.equals(str)) {
                e7b.a("SauSelfUpdateAgent", "packageName=" + str + ", target=" + nfaVar.i + ", mismatch only return");
                return;
            }
            qea qeaVar = nfaVar.a;
            if (i != 1) {
                e7b.d("SauSelfUpdateAgent", "no new update version");
            } else {
                if (nfaVar.I()) {
                    e7b.d("SauSelfUpdateAgent", "not allow to pop");
                    if (qeaVar != null) {
                        qeaVar.b(i, nfaVar.f14493c.m(nfaVar.i), nfaVar.o);
                    }
                    nfaVar.f14493c.o(null);
                    return;
                }
                SharedPreferences sharedPreferences = nfaVar.b.getSharedPreferences(SauAarConstants.Q, 0);
                int i2 = sharedPreferences.getInt(SauAarConstants.R, 0) + 1;
                if (nfaVar.f14494e == 0) {
                    if (nfaVar.l()) {
                        nfaVar.f14494e = 2;
                    } else {
                        nfaVar.f14494e = 1;
                    }
                }
                if (i2 < nfaVar.f14494e) {
                    sharedPreferences.edit().putInt(SauAarConstants.R, i2).apply();
                    if (qeaVar != null) {
                        qeaVar.b(i, nfaVar.f14493c.m(nfaVar.i), nfaVar.o);
                    }
                    nfaVar.f14493c.o(null);
                    e7b.a("SauSelfUpdateAgent", "lastPop < threshold ,not pop");
                    return;
                }
                sharedPreferences.edit().putInt(SauAarConstants.R, 0).apply();
                e7b.a("SauSelfUpdateAgent", " pop times set to 0");
                if (nfaVar.z()) {
                    e7b.a("SauSelfUpdateAgent", "package has finishDownload");
                    f(1);
                } else if (nfaVar.D() && nfaVar.B()) {
                    e7b.a("SauSelfUpdateAgent", "package is before download and has notwork connected");
                    f(0);
                } else if (nfaVar.B()) {
                    e7b.d("SauSelfUpdateAgent", nfaVar.i + " is downloading");
                } else {
                    e7b.d("SauSelfUpdateAgent", "has no network");
                }
            }
            e7b.a("SauSelfUpdateAgent", "action = " + qeaVar);
            if (qeaVar != null) {
                qeaVar.b(i, nfaVar.f14493c.m(nfaVar.i), nfaVar.o);
            }
            if (nfaVar.o) {
                return;
            }
            nfaVar.f14493c.o(null);
        }

        @Override // com.oplus.aiunit.vision.pea
        public void c(String str, long j2, long j3, long j4, int i) {
            nfa nfaVar = (nfa) this.a.get();
            if (nfaVar == null || nfaVar.i == null || !nfaVar.i.equals(str) || !nfaVar.f || j2 == -1 || j2 == 0 || j2 != j3) {
                return;
            }
            nfaVar.f14493c.o(null);
            nfaVar.o();
        }

        public final void f(final int i) {
            final nfa nfaVar = (nfa) this.a.get();
            if (nfaVar == null) {
                return;
            }
            final qea qeaVar = nfaVar.a;
            if (nfaVar.b instanceof Activity) {
                e7b.a("SauSelfUpdateAgent", "context is activity context");
                if (((Activity) nfaVar.b).isFinishing()) {
                    e7b.d("SauSelfUpdateAgent", "activity is finished");
                    return;
                }
            } else if (nfaVar.f14497n != null) {
                e7b.a("SauSelfUpdateAgent", "there is custom window token");
            } else {
                if (!(nfaVar.b instanceof Service)) {
                    e7b.a("SauSelfUpdateAgent", "context is not activity context or service context,or activity is finished");
                    return;
                }
                e7b.a("SauSelfUpdateAgent", "context is service context");
            }
            try {
                nfaVar.p.post(new Runnable() { // from class: com.oplus.aiunit.vision.ofa
                    @Override // java.lang.Runnable
                    public final void run() {
                        nfa.b.g(nfaVar, qeaVar, i);
                    }
                });
                nfaVar.o = true;
                e7b.a("SauSelfUpdateAgent", "createOnlyInstallSauDialog success!");
            } catch (Exception e2) {
                StringBuilder sbA = hcm.a("create dialog error, the exception message is  ");
                sbA.append(e2.getMessage());
                e7b.d("SauSelfUpdateAgent", sbA.toString());
            }
        }
    }

    public nfa(a aVar) {
        this.b = aVar.a;
        this.g = aVar.b;
        this.f14494e = aVar.f14498c;
        this.a = aVar.d;
        this.h = aVar.f14499e;
        this.i = aVar.f;
        s = aVar.g;
        this.f14495j = aVar.h;
        this.k = aVar.i;
        this.f14496l = aVar.f14500j;
        this.m = aVar.k;
        this.f14497n = aVar.f14501l;
        this.f14493c = SauUpdateAgent.D(this.b.getApplicationContext(), null);
        qea qeaVar = this.a;
        if (qeaVar != null) {
            qeaVar.g(this);
        }
        this.p = new Handler(Looper.getMainLooper());
    }

    public static int A() {
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i, qea qeaVar, DialogInterface dialogInterface) {
        e7b.a("SauSelfUpdateAgent", "onCancel");
        this.f14493c.o(null);
        if (i == 0) {
            if (qeaVar != null) {
                qeaVar.c();
            }
        } else if (qeaVar != null) {
            qeaVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i, qea qeaVar, kfa kfaVar, int i2) {
        if (i2 == -2) {
            this.f14493c.o(null);
            if (i == 0) {
                if (qeaVar != null) {
                    qeaVar.c();
                }
            } else if (qeaVar != null) {
                qeaVar.e();
            }
            kfaVar.c();
            if (l()) {
                return;
            }
            Process.killProcess(Process.myPid());
            return;
        }
        if (i2 != -1) {
            return;
        }
        this.b.getSharedPreferences(SauAarConstants.Q, 0).edit().putInt(SauAarConstants.R, 0).apply();
        if (i != 0) {
            this.f14493c.o(null);
            if (qeaVar != null) {
                qeaVar.f();
            }
            N();
            kfaVar.c();
            if (this.i.equals(this.b.getPackageName())) {
                o();
                return;
            }
            return;
        }
        if (qeaVar != null) {
            qeaVar.d();
        }
        O();
        pfa pfaVarS = s(this.b);
        Context context = this.b;
        if ((context instanceof Activity) && !((Activity) context).isFinishing() && !l() && this.i.equals(this.b.getPackageName())) {
            pfaVarS.b();
        }
        if (this.i.equals(this.b.getPackageName())) {
            this.f = true;
        }
        kfaVar.c();
    }

    public final boolean B() {
        return this.f14493c.R(this.i);
    }

    public final boolean D() {
        return this.f14493c.G(this.i) == -1 || (this.f14493c.G(this.i) == 32 && !this.f14493c.T(this.i));
    }

    public boolean F() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo(SauAarConstants.V, 0);
            if (packageInfo != null) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sbA = hcm.a("the errorInfo is ");
            sbA.append(e2.getMessage());
            e7b.a("SauSelfUpdateAgent", sbA.toString());
            packageInfo = null;
        }
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo(SauAarConstants.U, 0);
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder sbA2 = hcm.a("the errorInfo is ");
            sbA2.append(e3.getMessage());
            e7b.a("SauSelfUpdateAgent", sbA2.toString());
        }
        boolean z = packageInfo != null;
        if (!z) {
            e7b.f("SauSelfUpdateAgent", " not support sau");
        }
        return z;
    }

    public boolean G() {
        return this.f14493c.j();
    }

    public boolean H() {
        return G() || F();
    }

    public final boolean I() {
        return (this.f14493c.J(this.i) || this.f14493c.L(this.i)) && this.f14493c.N(this.i);
    }

    public final boolean L() {
        return this.f14493c.V(this.i);
    }

    public final void N() {
        this.f14493c.q(this.i, 0);
    }

    public final void O() {
        this.f14493c.w(this.i, 2080374784);
    }

    public void S() {
        if (G()) {
            i(this.h ? 1 : 0);
        } else if (F()) {
            rpm rpmVar = new rpm(this.b, this);
            this.d = rpmVar;
            rpmVar.h(this.g, this.f14494e, this.i, this.a, this.k, this.f14496l);
        }
    }

    public final kfa d(final qea qeaVar, final int i) {
        Window window;
        String strX = x();
        String strQ = q();
        String strG = g(t());
        final kfa kfaVarR = r(this.b);
        e7b.a("SauSelfUpdateAgent", "sauAlertDialog =" + kfaVarR);
        if (i == 0) {
            if (L()) {
                kfaVarR.h(1);
            } else {
                kfaVarR.h(0);
            }
            if (l()) {
                kfaVarR.f(8);
            } else {
                kfaVarR.f(9);
            }
        } else {
            kfaVarR.h(2);
            if (l()) {
                kfaVarR.f(6);
            } else {
                kfaVarR.f(7);
            }
        }
        kfaVarR.k(strX);
        kfaVarR.i(strG);
        kfaVarR.j(strQ);
        if (this.g != null) {
            e7b.a("SauSelfUpdateAgent", "setTitle");
            kfaVarR.e().setTitle(this.g);
        }
        kfaVarR.setOnButtonClickListener(new kfa.a() { // from class: com.oplus.aiunit.vision.lfa
            @Override // com.oplus.aiunit.vision.kfa.a
            public final void onClick(int i2) {
                this.a.k(i, qeaVar, kfaVarR, i2);
            }
        });
        kfaVarR.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.mfa
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.i.j(i, qeaVar, dialogInterface);
            }
        });
        if (!(this.b instanceof Activity)) {
            Dialog dialogE = kfaVarR.e();
            if (dialogE == null || (window = dialogE.getWindow()) == null) {
                return null;
            }
            if (this.k != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = this.k.floatValue();
                window.setAttributes(attributes);
            }
            Integer num = this.f14496l;
            if (num != null) {
                window.addFlags(num.intValue());
            }
            if (this.m != Integer.MIN_VALUE) {
                StringBuilder sbA = hcm.a("this app set a custom windoe-type : ");
                sbA.append(this.m);
                e7b.a("SauSelfUpdateAgent", sbA.toString());
                window.setType(this.m);
            } else if (this.f14497n == null) {
                window.setType(2038);
            }
            if (this.f14497n != null) {
                window.getAttributes().token = this.f14497n;
            }
        }
        return kfaVarR;
    }

    public final String g(long j2) {
        String[] strArr = {c8l.KEY_B, "KB", "MB", "GB"};
        double d = j2;
        int i = 0;
        while (d >= 1024.0d) {
            d /= 1024.0d;
            i++;
        }
        return (Math.round(d * 10.0d) / 10.0f) + strArr[i];
    }

    public final void i(int i) {
        this.f14493c.o(this.r);
        this.f14493c.v();
        this.f14493c.i(this.i, i);
    }

    public boolean l() {
        if (G()) {
            return this.f14493c.z(this.i);
        }
        if (F()) {
            return this.d.o();
        }
        return false;
    }

    public final void o() {
        Activity activity;
        Context context = this.b;
        if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
            return;
        }
        activity.finish();
        Toast.makeText(this.b, R$string.sau_dialog_upgrade_installing, 0).show();
    }

    public String q() {
        if (G()) {
            return this.f14493c.F(this.i);
        }
        if (F()) {
            return this.d.p();
        }
        return null;
    }

    public abstract kfa r(Context context);

    public abstract pfa s(Context context);

    public long t() {
        if (G()) {
            return this.f14493c.c(this.i);
        }
        if (F()) {
            return this.d.b();
        }
        return -1L;
    }

    public String x() {
        if (G()) {
            return this.f14493c.u(this.i);
        }
        if (F()) {
            return this.d.n();
        }
        return null;
    }

    public final boolean z() {
        return this.f14493c.P(this.i);
    }
}
