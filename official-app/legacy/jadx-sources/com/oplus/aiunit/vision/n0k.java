package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class n0k {
    public final Context a;
    public final dm0 b;

    public n0k(Context context) {
        this.a = context;
        this.b = new dm0(context);
    }

    public final boolean a(om0 om0Var, String str) {
        int iC = om0Var.c();
        if (iC == 1001) {
            return false;
        }
        e(iC, str);
        return true;
    }

    public final boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            j1e.c("Tingle Authentication Failed Cause Caller Package Empty");
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            return false;
        }
        j1e.c("Tingle Authentication Failed Cause Descriptor Empty : " + str);
        return true;
    }

    public final boolean c(String str) {
        return this.b.d(str);
    }

    public final boolean d() {
        return Binder.getCallingUid() == 1000;
    }

    public final void e(int i, String str) {
        j1e.c("Tingle Authentication Failed " + zo3.a(i) + " Package : " + str);
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
        sb.append(kvg.a(str2, i));
        sb.append("]");
        j1e.b(sb.toString());
    }

    public final boolean g(String str, String str2) {
        if (!kvg.c(str2)) {
            return false;
        }
        j1e.b("Tingle verity SUCCESS cause descriptor is [" + str2 + "], Caller Package [" + str + "]");
        return true;
    }

    public boolean h(String str, int i) {
        if (this.b.c()) {
            return true;
        }
        String strC = i3e.c(this.a, Binder.getCallingUid(), Binder.getCallingPid());
        String strF = a53.f(this.a, strC);
        if (b(strC, str)) {
            return false;
        }
        if (d() || c(strF) || g(strC, str)) {
            return true;
        }
        if (this.b.b(strC, strF)) {
            boolean zI = i(kvg.a(str, i), strC);
            f(zI, strC, str, i);
            return zI;
        }
        om0 om0VarA = xm0.a(this.a, strC);
        if (a(om0VarA, strC)) {
            return false;
        }
        this.b.e(strC, om0VarA, strF);
        boolean zI2 = i(kvg.a(str, i), strC);
        f(zI2, strC, str, i);
        return zI2;
    }

    public final boolean i(String str, String str2) {
        om0 om0VarA = this.b.a(str2);
        if (om0VarA != null) {
            return om0VarA.a("tingle", str);
        }
        return false;
    }
}
