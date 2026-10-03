package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class oee {
    public static oee d;
    public volatile boolean a = false;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public em0 f14911c;

    public static oee a() {
        if (d == null) {
            synchronized (oee.class) {
                if (d == null) {
                    d = new oee();
                }
            }
        }
        return d;
    }

    public synchronized void b(@NonNull Context context) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = context instanceof Application ? context : context.getApplicationContext();
        this.f14911c = new em0(context);
        lvg.a();
        Context context2 = this.b;
        if (context2 != null && TextUtils.equals(context2.getPackageName(), "com.heytap.appplatform")) {
            i1e.e(this.b);
            v25.e().f(this.b);
        }
    }

    public boolean c() {
        return !v25.e().g();
    }

    public boolean d(String str, String str2, String str3) {
        if (Binder.getCallingUid() == 1000) {
            return true;
        }
        String strC = g3e.c(this.b, Binder.getCallingUid(), Binder.getCallingPid());
        if (TextUtils.isEmpty(str)) {
            i1e.c("Epona Authentication Failed Cause Component Empty : " + strC);
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            i1e.c("Epona Authentication Failed Cause ActionName Empty : " + strC);
            return false;
        }
        if (TextUtils.isEmpty(str3)) {
            i1e.c("Epona Authentication Failed Cause Register Package Empty : " + strC);
            return false;
        }
        i1e.b("Start epona verify Component : [" + str + "] action : [" + str2 + "] register pacage : [" + str3 + "] caller pacakge : [" + strC + "]");
        if (this.f14911c.b(n04.LOCAL_PLATFORM_SIGNATURE)) {
            i1e.b("Epona verity SUCCESS cause local version, Caller Package [" + strC + "]");
            return true;
        }
        if (TextUtils.isEmpty(strC)) {
            i1e.c("Get caller package is null");
            String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid == null || packagesForUid.length <= 0) {
                i1e.c("Get packages Error : Calling pid [" + Binder.getCallingPid() + "] Calling uid [" + Binder.getCallingUid() + "]");
                return false;
            }
            i1e.c("Get UID [" + Binder.getCallingUid() + "] PID [" + Binder.getCallingPid() + "] Packages [" + Arrays.toString(packagesForUid) + "]");
            strC = packagesForUid[0];
        }
        String strE = b53.e(this.b, strC);
        if (this.f14911c.b(strE)) {
            i1e.b("Epona verity SUCCESS Caller Package [" + strC + "] is platform signature");
            return true;
        }
        if (!TextUtils.equals("com.heytap.appplatform", str3)) {
            boolean zEquals = TextUtils.equals(b53.d(this.b, str3), b53.d(this.b, strC));
            StringBuilder sb = new StringBuilder();
            sb.append("Epona verity ");
            sb.append(zEquals ? "SUCCESS" : "FAILED");
            sb.append(" Caller : [");
            sb.append(strC);
            sb.append("] Component : [");
            sb.append(str);
            sb.append("] ActionName : [");
            sb.append(str2);
            sb.append("]");
            i1e.b(sb.toString());
            return zEquals;
        }
        if (TextUtils.equals("com.heytap.appplatform", strC)) {
            return true;
        }
        if (this.f14911c.a(strC, strE)) {
            boolean zD = this.f14911c.d(strC, str, str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Epona verity ");
            sb2.append(zD ? "SUCCESS" : "FAILED");
            sb2.append(" Caller : [");
            sb2.append(strC);
            sb2.append("] Component : [");
            sb2.append(str);
            sb2.append("] ActionName : [");
            sb2.append(str2);
            sb2.append("]");
            i1e.b(sb2.toString());
            return zD;
        }
        nm0 nm0VarC = ym0.c(this.b, strC);
        int iB = nm0VarC.b();
        if (iB != 1001) {
            i1e.c("Epona Authentication Failed " + ap3.a(iB) + " Package : " + strC);
            return false;
        }
        this.f14911c.c(strC, nm0VarC, strE);
        boolean zD2 = this.f14911c.d(strC, str, str2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Epona verity ");
        sb3.append(zD2 ? "SUCCESS" : "FAILED");
        sb3.append(" Caller : [");
        sb3.append(strC);
        sb3.append("] Component : [");
        sb3.append(str);
        sb3.append("] ActionName : [");
        sb3.append(str2);
        sb3.append("]");
        i1e.b(sb3.toString());
        return zD2;
    }
}
