package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartenginehelper.ParserTag;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lqm {
    public sga a;
    public xga b;
    public yfa u;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public int h = 0;
    public int i = 0;
    public boolean j = true;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public String p = null;
    public String q = null;
    public String r = null;
    public Context s = null;
    public uwm t = null;
    public qgm v = new a();

    public class a implements qgm {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qgm
        public void a() {
            Log.d("SauJar", lqm.this.c + " upgrade later!");
            lqm.this.a.c();
        }

        @Override // com.oplus.aiunit.vision.qgm
        public void b() {
            StringBuilder sbA = pgm.a("Install Button clicked. install ");
            sbA.append(lqm.this.c);
            sbA.append("now!");
            Log.d("SauJar", sbA.toString());
            Intent intent = new Intent(SauAarConstants.d);
            lqm lqmVar = lqm.this;
            Intent intentC = lqmVar.c(lqmVar.s, intent);
            if (intentC != null) {
                intentC.putExtra("type", "appJar");
                intentC.putExtra(ParserTag.TAG_ACTION, 1);
                intentC.putExtra(TraceConstants.KEY_PKG_NAME, lqm.this.c);
                lqm.this.s.startService(intentC);
            }
            lqm.this.a.c();
        }

        @Override // com.oplus.aiunit.vision.qgm
        public void c() {
            Log.d("SauJar", lqm.this.c + " exit upgrade!");
            lqm.this.a.c();
            lqm.l(lqm.this);
        }

        @Override // com.oplus.aiunit.vision.qgm
        public void d() {
            StringBuilder sbA = pgm.a("Upgrade Button clicked. Download ");
            sbA.append(lqm.this.c);
            sbA.append("now!");
            Log.d("SauJar", sbA.toString());
            Intent intent = new Intent(SauAarConstants.d);
            lqm lqmVar = lqm.this;
            Intent intentC = lqmVar.c(lqmVar.s, intent);
            if (intentC != null) {
                intentC.putExtra("type", "appJar");
                intentC.putExtra(ParserTag.TAG_ACTION, 0);
                intentC.putExtra(TraceConstants.KEY_PKG_NAME, lqm.this.c);
                if (lqm.this.n) {
                    intentC.putExtra("fileDeleted", true);
                }
                lqm.this.s.startService(intentC);
            }
            StringBuilder sbA2 = pgm.a("mpkg = ");
            sbA2.append(lqm.this.c);
            sbA2.append(",mContext.getPackageName = ");
            sbA2.append(lqm.this.s.getPackageName());
            sbA2.append(",mCanUseOld = ");
            sbA2.append(lqm.this.j);
            Log.d("SauJar", sbA2.toString());
            lqm.this.a.c();
            if (lqm.this.j || !lqm.this.c.equals(lqm.this.s.getPackageName()) || !(lqm.this.s instanceof Activity) || ((Activity) lqm.this.s).isFinishing()) {
                return;
            }
            lqm.this.b.b();
        }
    }

    public static void l(lqm lqmVar) {
        lqmVar.getClass();
        Process.killProcess(Process.myPid());
    }

    public final int a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        NetworkInfo.State state = NetworkInfo.State.UNKNOWN;
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return 0;
        }
        NetworkInfo.State state2 = connectivityManager.getNetworkInfo(1) != null ? connectivityManager.getNetworkInfo(1).getState() : state;
        if (connectivityManager.getNetworkInfo(0) != null) {
            state = connectivityManager.getNetworkInfo(0).getState();
        }
        if (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING) {
            return 2;
        }
        return (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) ? 1 : 0;
    }

    public int b(String str, Float f, Integer num) {
        Window window;
        g();
        int iA = a(this.s);
        if (iA == 0 && !this.k) {
            Log.d("SauJar", "no network connected and need download, so return.");
            return 0;
        }
        boolean z = iA == 2;
        kzm.l(this.v);
        kzm.k(this.a, !this.j, this.k, this.u);
        kzm.i(this.a, this.f, e(this.h), this.g, this.l, z);
        Dialog dialogE = this.a.e();
        if (dialogE != null) {
            if (str != null) {
                dialogE.setTitle(str);
            }
            if (!(this.s instanceof Activity) && (window = dialogE.getWindow()) != null) {
                if (f != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.dimAmount = f.floatValue();
                    window.setAttributes(attributes);
                }
                if (num != null) {
                    window.addFlags(num.intValue());
                }
                window.setType(2038);
            }
        }
        Context context = this.s;
        if ((!(context instanceof Activity) || ((Activity) context).isFinishing()) && !(this.s instanceof Service)) {
            Log.d("SauJar", "activity is finishing, do not show");
            return 0;
        }
        this.a.l();
        return 1;
    }

    public final Intent c(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() != 1) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    public final String e(long j) {
        String[] strArr = {"B", "KB", "MB", "GB"};
        double d = j;
        int i = 0;
        while (d >= 1024.0d) {
            d /= 1024.0d;
            i++;
        }
        return (Math.round(d * 10.0d) / 10.0f) + strArr[i];
    }

    public final void g() {
        uwm uwmVar = this.t;
        this.c = uwmVar.a;
        this.f = uwmVar.e;
        this.g = uwmVar.f;
        this.h = uwmVar.g;
        this.i = uwmVar.h;
        this.j = uwmVar.i == 1;
        boolean z = uwmVar.j == 1;
        this.k = z;
        this.l = uwmVar.k == 1;
        this.m = uwmVar.l == 1;
        this.d = uwmVar.b;
        this.o = uwmVar.m;
        this.p = uwmVar.n;
        this.q = uwmVar.o;
        this.r = uwmVar.p;
        String str = uwmVar.c;
        this.e = str;
        if (str != null && z && !new File(this.e).exists()) {
            StringBuilder sbA = pgm.a("file not exist, set patchFinished to false.   lost file: ");
            sbA.append(this.e);
            Log.d("SauJar", sbA.toString());
            this.k = false;
            this.n = true;
        }
        StringBuilder sbA2 = pgm.a("AlertService receive info: ");
        sbA2.append(this.c);
        sbA2.append(", newVerName=");
        sbA2.append(this.f);
        sbA2.append(", patchFinished=");
        sbA2.append(this.k);
        sbA2.append(", canUseOld=");
        sbA2.append(this.j);
        sbA2.append(", fileName=");
        sbA2.append(this.e);
        sbA2.append(", patchSize=");
        sbA2.append(this.h);
        Log.d("SauJar", sbA2.toString());
    }

    public void h(Context context, uwm uwmVar, yfa yfaVar) {
        this.s = context;
        this.t = uwmVar;
        this.u = yfaVar;
    }

    public void i(sga sgaVar) {
        this.a = sgaVar;
    }

    public void j(xga xgaVar) {
        this.b = xgaVar;
    }
}
