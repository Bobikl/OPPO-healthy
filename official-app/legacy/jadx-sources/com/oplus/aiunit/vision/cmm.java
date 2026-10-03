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
import com.oplusos.sau.common.utils.SauAarConstants;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class cmm {
    public kfa a;
    public pfa b;
    public qea u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10153c = null;
    public String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10154e = null;
    public String f = null;
    public String g = null;
    public int h = 0;
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10155j = true;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10156l = false;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10157n = false;
    public int o = 0;
    public String p = null;
    public String q = null;
    public String r = null;
    public Context s = null;
    public esm t = null;
    public icm v = new a();

    public class a implements icm {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.icm
        public void a() {
            Log.d("SauJar", cmm.this.f10153c + " upgrade later!");
            cmm.this.a.c();
        }

        @Override // com.oplus.aiunit.vision.icm
        public void b() {
            StringBuilder sbA = hcm.a("Install Button clicked. install ");
            sbA.append(cmm.this.f10153c);
            sbA.append("now!");
            Log.d("SauJar", sbA.toString());
            Intent intent = new Intent(SauAarConstants.d);
            cmm cmmVar = cmm.this;
            Intent intentC = cmmVar.c(cmmVar.s, intent);
            if (intentC != null) {
                intentC.putExtra("type", "appJar");
                intentC.putExtra("action", 1);
                intentC.putExtra(TraceConstants.KEY_PKG_NAME, cmm.this.f10153c);
                cmm.this.s.startService(intentC);
            }
            cmm.this.a.c();
        }

        @Override // com.oplus.aiunit.vision.icm
        public void c() {
            Log.d("SauJar", cmm.this.f10153c + " exit upgrade!");
            cmm.this.a.c();
            cmm.l(cmm.this);
        }

        @Override // com.oplus.aiunit.vision.icm
        public void d() {
            StringBuilder sbA = hcm.a("Upgrade Button clicked. Download ");
            sbA.append(cmm.this.f10153c);
            sbA.append("now!");
            Log.d("SauJar", sbA.toString());
            Intent intent = new Intent(SauAarConstants.d);
            cmm cmmVar = cmm.this;
            Intent intentC = cmmVar.c(cmmVar.s, intent);
            if (intentC != null) {
                intentC.putExtra("type", "appJar");
                intentC.putExtra("action", 0);
                intentC.putExtra(TraceConstants.KEY_PKG_NAME, cmm.this.f10153c);
                if (cmm.this.f10157n) {
                    intentC.putExtra("fileDeleted", true);
                }
                cmm.this.s.startService(intentC);
            }
            StringBuilder sbA2 = hcm.a("mpkg = ");
            sbA2.append(cmm.this.f10153c);
            sbA2.append(",mContext.getPackageName = ");
            sbA2.append(cmm.this.s.getPackageName());
            sbA2.append(",mCanUseOld = ");
            sbA2.append(cmm.this.f10155j);
            Log.d("SauJar", sbA2.toString());
            cmm.this.a.c();
            if (cmm.this.f10155j || !cmm.this.f10153c.equals(cmm.this.s.getPackageName()) || !(cmm.this.s instanceof Activity) || ((Activity) cmm.this.s).isFinishing()) {
                return;
            }
            cmm.this.b.b();
        }
    }

    public static void l(cmm cmmVar) {
        cmmVar.getClass();
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
        rum.l(this.v);
        rum.k(this.a, !this.f10155j, this.k, this.u);
        rum.i(this.a, this.f, e(this.h), this.g, this.f10156l, z);
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

    public final String e(long j2) {
        String[] strArr = {c8l.KEY_B, "KB", "MB", "GB"};
        double d = j2;
        int i = 0;
        while (d >= 1024.0d) {
            d /= 1024.0d;
            i++;
        }
        return (Math.round(d * 10.0d) / 10.0f) + strArr[i];
    }

    public final void g() {
        esm esmVar = this.t;
        this.f10153c = esmVar.a;
        this.f = esmVar.f11065e;
        this.g = esmVar.f;
        this.h = esmVar.g;
        this.i = esmVar.h;
        this.f10155j = esmVar.i == 1;
        boolean z = esmVar.f11066j == 1;
        this.k = z;
        this.f10156l = esmVar.k == 1;
        this.m = esmVar.f11067l == 1;
        this.d = esmVar.b;
        this.o = esmVar.m;
        this.p = esmVar.f11068n;
        this.q = esmVar.o;
        this.r = esmVar.p;
        String str = esmVar.f11064c;
        this.f10154e = str;
        if (str != null && z && !new File(this.f10154e).exists()) {
            StringBuilder sbA = hcm.a("file not exist, set patchFinished to false.   lost file: ");
            sbA.append(this.f10154e);
            Log.d("SauJar", sbA.toString());
            this.k = false;
            this.f10157n = true;
        }
        StringBuilder sbA2 = hcm.a("AlertService receive info: ");
        sbA2.append(this.f10153c);
        sbA2.append(", newVerName=");
        sbA2.append(this.f);
        sbA2.append(", patchFinished=");
        sbA2.append(this.k);
        sbA2.append(", canUseOld=");
        sbA2.append(this.f10155j);
        sbA2.append(", fileName=");
        sbA2.append(this.f10154e);
        sbA2.append(", patchSize=");
        sbA2.append(this.h);
        Log.d("SauJar", sbA2.toString());
    }

    public void h(Context context, esm esmVar, qea qeaVar) {
        this.s = context;
        this.t = esmVar;
        this.u = qeaVar;
    }

    public void i(kfa kfaVar) {
        this.a = kfaVar;
    }

    public void j(pfa pfaVar) {
        this.b = pfaVar;
    }
}
