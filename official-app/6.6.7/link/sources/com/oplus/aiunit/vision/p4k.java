package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class p4k {
    public final Context a;
    public final vm0 b;

    public p4k(Context context) {
        this.a = context;
        this.b = new vm0(context);
    }

    public final boolean a(gn0 gn0Var, String str) {
        int iC = gn0Var.c();
        if (iC == 1001) {
            return false;
        }
        e(iC, str);
        return true;
    }

    public final boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            e3e.c("Tingle Authentication Failed Cause Caller Package Empty");
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            return false;
        }
        e3e.c("Tingle Authentication Failed Cause Descriptor Empty : " + str);
        return true;
    }

    public final boolean c(String str) {
        return this.b.d(str);
    }

    public final boolean d() {
        return Binder.getCallingUid() == 1000;
    }

    public final void e(int i, String str) {
        e3e.c("Tingle Authentication Failed " + np3.a(i) + " Package : " + str);
    }

    public final void f(boolean z, String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Tingle verity ");
        sb.append(z ? "SUCCESS" : "FAILED");
        sb.append(" Caller : [");
        sb.append(str);
        sb.append("] Descriptor : [");
        sb.append(str2);
        sb.append("] Method : [");
        sb.append(bzg.a(str2, i));
        sb.append("]");
        e3e.b(sb.toString());
    }

    public final boolean g(String str, String str2) {
        if (!bzg.c(str2)) {
            return false;
        }
        e3e.b("Tingle verity SUCCESS cause descriptor is [" + str2 + "], Caller Package [" + str + "]");
        return true;
    }

    public boolean h(String str, int i) {
        if (this.b.c()) {
            return true;
        }
        String strC = f5e.c(this.a, Binder.getCallingUid(), Binder.getCallingPid());
        String strF = o53.f(this.a, strC);
        if (b(strC, str)) {
            return false;
        }
        if (d() || c(strF) || g(strC, str)) {
            return true;
        }
        if (this.b.b(strC, strF)) {
            boolean zI = i(bzg.a(str, i), strC);
            f(zI, strC, str, i);
            return zI;
        }
        gn0 gn0VarA = pn0.a(this.a, strC);
        if (a(gn0VarA, strC)) {
            return false;
        }
        this.b.e(strC, gn0VarA, strF);
        boolean zI2 = i(bzg.a(str, i), strC);
        f(zI2, strC, str, i);
        return zI2;
    }

    public final boolean i(String str, String str2) {
        gn0 gn0VarA = this.b.a(str2);
        if (gn0VarA != null) {
            return gn0VarA.a(d14.TYPE_TINGLE, str);
        }
        return false;
    }
}
