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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class vga {
    public static int s;
    public yfa a;
    public Context b;
    public SauUpdateAgent c;
    public gum d;
    public int e;
    public boolean f;
    public String g;
    public boolean h;
    public String i;
    public Integer j;
    public Float k;
    public Integer l;
    public int m;
    public IBinder n;
    public Handler p;
    public sga q;
    public boolean o = false;
    public xfa r = new b(this);

    public static abstract class a {
        public Context a;
        public String b;
        public yfa d;
        public String f;
        public int g;
        public Integer h;
        public Float i;
        public Integer j;
        public int c = 0;
        public boolean e = false;
        public int k = SauAarConstants.I;
        public IBinder l = null;

        public a(Context context, int i) {
            this.a = context;
            this.f = context.getPackageName();
            this.g = i;
        }

        public a m(yfa yfaVar) {
            this.d = yfaVar;
            return this;
        }

        public a n(String str) {
            this.f = str;
            return this;
        }

        public a o(boolean z) {
            this.e = z;
            return this;
        }

        public a p(int i) {
            this.c = i;
            return this;
        }
    }

    public static class b extends xfa {
        public WeakReference a;

        public b(vga vgaVar) {
            this.a = new WeakReference(vgaVar);
        }

        public static /* synthetic */ void g(vga vgaVar, yfa yfaVar, int i) {
            vgaVar.q = vgaVar.d(yfaVar, i);
            if (vgaVar.q != null) {
                vgaVar.q.l();
            }
        }

        @Override // com.oplus.aiunit.vision.xfa
        public void a(String str, int i) {
            vga vgaVar = (vga) this.a.get();
            if (vgaVar == null || vgaVar.i == null) {
                if (vgaVar != null) {
                    q8b.f("SauSelfUpdateAgent", "some thing error, set observer to null");
                    vgaVar.c.o(null);
                }
                q8b.f("SauSelfUpdateAgent", "agent == null");
                return;
            }
            if (!vgaVar.i.equals(str)) {
                q8b.a("SauSelfUpdateAgent", "packageName=" + str + ", target=" + vgaVar.i + ", mismatch only return");
                return;
            }
            yfa yfaVar = vgaVar.a;
            if (i != 1) {
                q8b.d("SauSelfUpdateAgent", "no new update version");
            } else {
                if (vgaVar.I()) {
                    q8b.d("SauSelfUpdateAgent", "not allow to pop");
                    if (yfaVar != null) {
                        yfaVar.b(i, vgaVar.c.m(vgaVar.i), vgaVar.o);
                    }
                    vgaVar.c.o(null);
                    return;
                }
                SharedPreferences sharedPreferences = vgaVar.b.getSharedPreferences(SauAarConstants.Q, 0);
                int i2 = sharedPreferences.getInt(SauAarConstants.R, 0) + 1;
                if (vgaVar.e == 0) {
                    if (vgaVar.l()) {
                        vgaVar.e = 2;
                    } else {
                        vgaVar.e = 1;
                    }
                }
                if (i2 < vgaVar.e) {
                    sharedPreferences.edit().putInt(SauAarConstants.R, i2).apply();
                    if (yfaVar != null) {
                        yfaVar.b(i, vgaVar.c.m(vgaVar.i), vgaVar.o);
                    }
                    vgaVar.c.o(null);
                    q8b.a("SauSelfUpdateAgent", "lastPop < threshold ,not pop");
                    return;
                }
                sharedPreferences.edit().putInt(SauAarConstants.R, 0).apply();
                q8b.a("SauSelfUpdateAgent", " pop times set to 0");
                if (vgaVar.z()) {
                    q8b.a("SauSelfUpdateAgent", "package has finishDownload");
                    f(1);
                } else if (vgaVar.D() && vgaVar.B()) {
                    q8b.a("SauSelfUpdateAgent", "package is before download and has notwork connected");
                    f(0);
                } else if (vgaVar.B()) {
                    q8b.d("SauSelfUpdateAgent", vgaVar.i + " is downloading");
                } else {
                    q8b.d("SauSelfUpdateAgent", "has no network");
                }
            }
            q8b.a("SauSelfUpdateAgent", "action = " + yfaVar);
            if (yfaVar != null) {
                yfaVar.b(i, vgaVar.c.m(vgaVar.i), vgaVar.o);
            }
            if (vgaVar.o) {
                return;
            }
            vgaVar.c.o(null);
        }

        @Override // com.oplus.aiunit.vision.xfa
        public void c(String str, long j, long j2, long j3, int i) {
            vga vgaVar = (vga) this.a.get();
            if (vgaVar == null || vgaVar.i == null || !vgaVar.i.equals(str) || !vgaVar.f || j == -1 || j == 0 || j != j2) {
                return;
            }
            vgaVar.c.o(null);
            vgaVar.o();
        }

        public final void f(final int i) {
            final vga vgaVar = (vga) this.a.get();
            if (vgaVar == null) {
                return;
            }
            final yfa yfaVar = vgaVar.a;
            if (vgaVar.b instanceof Activity) {
                q8b.a("SauSelfUpdateAgent", "context is activity context");
                if (((Activity) vgaVar.b).isFinishing()) {
                    q8b.d("SauSelfUpdateAgent", "activity is finished");
                    return;
                }
            } else if (vgaVar.n != null) {
                q8b.a("SauSelfUpdateAgent", "there is custom window token");
            } else {
                if (!(vgaVar.b instanceof Service)) {
                    q8b.a("SauSelfUpdateAgent", "context is not activity context or service context,or activity is finished");
                    return;
                }
                q8b.a("SauSelfUpdateAgent", "context is service context");
            }
            try {
                vgaVar.p.post(new Runnable() { // from class: com.oplus.aiunit.vision.wga
                    @Override // java.lang.Runnable
                    public final void run() {
                        vga.b.g(vgaVar, yfaVar, i);
                    }
                });
                vgaVar.o = true;
                q8b.a("SauSelfUpdateAgent", "createOnlyInstallSauDialog success!");
            } catch (Exception e) {
                StringBuilder sbA = pgm.a("create dialog error, the exception message is  ");
                sbA.append(e.getMessage());
                q8b.d("SauSelfUpdateAgent", sbA.toString());
            }
        }
    }

    public vga(a aVar) {
        this.b = aVar.a;
        this.g = aVar.b;
        this.e = aVar.c;
        this.a = aVar.d;
        this.h = aVar.e;
        this.i = aVar.f;
        s = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        this.c = SauUpdateAgent.D(this.b.getApplicationContext(), null);
        yfa yfaVar = this.a;
        if (yfaVar != null) {
            yfaVar.g(this);
        }
        this.p = new Handler(Looper.getMainLooper());
    }

    public static int A() {
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i, yfa yfaVar, DialogInterface dialogInterface) {
        q8b.a("SauSelfUpdateAgent", "onCancel");
        this.c.o(null);
        if (i == 0) {
            if (yfaVar != null) {
                yfaVar.c();
            }
        } else if (yfaVar != null) {
            yfaVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i, yfa yfaVar, sga sgaVar, int i2) {
        if (i2 == -2) {
            this.c.o(null);
            if (i == 0) {
                if (yfaVar != null) {
                    yfaVar.c();
                }
            } else if (yfaVar != null) {
                yfaVar.e();
            }
            sgaVar.c();
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
            this.c.o(null);
            if (yfaVar != null) {
                yfaVar.f();
            }
            N();
            sgaVar.c();
            if (this.i.equals(this.b.getPackageName())) {
                o();
                return;
            }
            return;
        }
        if (yfaVar != null) {
            yfaVar.d();
        }
        O();
        xga xgaVarS = s(this.b);
        Context context = this.b;
        if ((context instanceof Activity) && !((Activity) context).isFinishing() && !l() && this.i.equals(this.b.getPackageName())) {
            xgaVarS.b();
        }
        if (this.i.equals(this.b.getPackageName())) {
            this.f = true;
        }
        sgaVar.c();
    }

    public final boolean B() {
        return this.c.R(this.i);
    }

    public final boolean D() {
        return this.c.G(this.i) == -1 || (this.c.G(this.i) == 32 && !this.c.T(this.i));
    }

    public boolean F() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo(SauAarConstants.V, 0);
            if (packageInfo != null) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sbA = pgm.a("the errorInfo is ");
            sbA.append(e.getMessage());
            q8b.a("SauSelfUpdateAgent", sbA.toString());
            packageInfo = null;
        }
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo(SauAarConstants.U, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sbA2 = pgm.a("the errorInfo is ");
            sbA2.append(e2.getMessage());
            q8b.a("SauSelfUpdateAgent", sbA2.toString());
        }
        boolean z = packageInfo != null;
        if (!z) {
            q8b.f("SauSelfUpdateAgent", " not support sau");
        }
        return z;
    }

    public boolean G() {
        return this.c.j();
    }

    public boolean H() {
        return G() || F();
    }

    public final boolean I() {
        return (this.c.J(this.i) || this.c.L(this.i)) && this.c.N(this.i);
    }

    public final boolean L() {
        return this.c.V(this.i);
    }

    public final void N() {
        this.c.q(this.i, 0);
    }

    public final void O() {
        this.c.w(this.i, 2080374784);
    }

    public void S() {
        if (G()) {
            i(this.h ? 1 : 0);
        } else if (F()) {
            gum gumVar = new gum(this.b, this);
            this.d = gumVar;
            gumVar.h(this.g, this.e, this.i, this.a, this.k, this.l);
        }
    }

    public final sga d(final yfa yfaVar, final int i) {
        Window window;
        String strX = x();
        String strQ = q();
        String strG = g(t());
        final sga sgaVarR = r(this.b);
        q8b.a("SauSelfUpdateAgent", "sauAlertDialog =" + sgaVarR);
        if (i == 0) {
            if (L()) {
                sgaVarR.h(1);
            } else {
                sgaVarR.h(0);
            }
            if (l()) {
                sgaVarR.f(8);
            } else {
                sgaVarR.f(9);
            }
        } else {
            sgaVarR.h(2);
            if (l()) {
                sgaVarR.f(6);
            } else {
                sgaVarR.f(7);
            }
        }
        sgaVarR.k(strX);
        sgaVarR.i(strG);
        sgaVarR.j(strQ);
        if (this.g != null) {
            q8b.a("SauSelfUpdateAgent", "setTitle");
            sgaVarR.e().setTitle(this.g);
        }
        sgaVarR.setOnButtonClickListener(new sga.a() { // from class: com.oplus.aiunit.vision.tga
            @Override // com.oplus.aiunit.vision.sga.a
            public final void onClick(int i2) {
                this.a.k(i, yfaVar, sgaVarR, i2);
            }
        });
        sgaVarR.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.uga
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.i.j(i, yfaVar, dialogInterface);
            }
        });
        if (!(this.b instanceof Activity)) {
            Dialog dialogE = sgaVarR.e();
            if (dialogE == null || (window = dialogE.getWindow()) == null) {
                return null;
            }
            if (this.k != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = this.k.floatValue();
                window.setAttributes(attributes);
            }
            Integer num = this.l;
            if (num != null) {
                window.addFlags(num.intValue());
            }
            if (this.m != Integer.MIN_VALUE) {
                StringBuilder sbA = pgm.a("this app set a custom windoe-type : ");
                sbA.append(this.m);
                q8b.a("SauSelfUpdateAgent", sbA.toString());
                window.setType(this.m);
            } else if (this.n == null) {
                window.setType(2038);
            }
            if (this.n != null) {
                window.getAttributes().token = this.n;
            }
        }
        return sgaVarR;
    }

    public final String g(long j) {
        String[] strArr = {"B", "KB", "MB", "GB"};
        double d = j;
        int i = 0;
        while (d >= 1024.0d) {
            d /= 1024.0d;
            i++;
        }
        return (Math.round(d * 10.0d) / 10.0f) + strArr[i];
    }

    public final void i(int i) {
        this.c.o(this.r);
        this.c.v();
        this.c.i(this.i, i);
    }

    public boolean l() {
        if (G()) {
            return this.c.z(this.i);
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
            return this.c.F(this.i);
        }
        if (F()) {
            return this.d.p();
        }
        return null;
    }

    public abstract sga r(Context context);

    public abstract xga s(Context context);

    public long t() {
        if (G()) {
            return this.c.c(this.i);
        }
        if (F()) {
            return this.d.b();
        }
        return -1L;
    }

    public String x() {
        if (G()) {
            return this.c.u(this.i);
        }
        if (F()) {
            return this.d.n();
        }
        return null;
    }

    public final boolean z() {
        return this.c.P(this.i);
    }
}
