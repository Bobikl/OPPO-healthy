package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import s_a.s_d;
import s_a.s_f;

/* JADX INFO: loaded from: classes11.dex */
public final class n8n extends a8n {
    public n8n() {
        this.f9248e = new l8n(this);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(o7n.d("Y29tLmNvbG9yb3MubWNz"), "com.oplus.stdid.IdentifyService"));
        intent.setAction("action.com.oplus.stdid.ID_SERVICE");
        k8n.a("2012");
        return intent;
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final void b(Context context, String str, String str2) {
        v7n.f17744s_a.b(context, str, str2);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final boolean f(String str) {
        y7n y7nVar = v7n.f17744s_a;
        return !y7nVar.a.isEmpty() && y7nVar.a.containsKey(str);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final boolean h(String str) {
        return v7n.f17744s_a.d(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[ORIG_RETURN, RETURN] */
    @Override // com.oplus.aiunit.vision.a8n
    public final String i(String str) {
        try {
            return ((s_d) ((s_f) this.a)).s_a(this.b, this.f9247c, str);
        } catch (NullPointerException e2) {
            k8n.b("1074", e2);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        } catch (Exception e3) {
            k8n.b("1075", e3);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        }
    }

    public final boolean k(Context context) {
        this.h = context;
        String strD = o7n.d("Y29tLmNvbG9yb3MubWNz");
        k8n.a("2008:" + strD);
        try {
            if (this.h.getPackageManager().getPackageInfo(strD, 0) != null) {
                k8n.a("2008: > P");
                return false;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            k8n.b("1072", e2);
        } catch (Exception e3) {
            k8n.b("1073", e3);
        }
        return false;
    }
}
