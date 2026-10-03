package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import s_a.s_a;
import s_a.s_c;

/* JADX INFO: loaded from: classes11.dex */
public final class f8n extends a8n {
    public f8n() {
        this.f9248e = new b8n(this);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(o7n.d("Y29tLmhleXRhcC5vcGVuaWQ="), o7n.d("Y29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl")));
        intent.setAction(o7n.d("YWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ=="));
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
            return ((s_a) ((s_c) this.a)).s_a(this.b, this.f9247c, str);
        } catch (NullPointerException e2) {
            k8n.b("1027", e2);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        } catch (Exception e3) {
            k8n.b("1070", e3);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        }
    }

    public final boolean k(Context context) {
        this.h = context;
        String strD = o7n.d("Y29tLmhleXRhcC5vcGVuaWQ=");
        k8n.a("2008:" + strD);
        try {
            PackageInfo packageInfo = this.h.getPackageManager().getPackageInfo(strD, 8);
            boolean z = packageInfo != null && packageInfo.versionCode >= 1;
            if (z && a8n.g(packageInfo.providers)) {
                this.f9249j = true;
                k8n.a("2053");
            }
            return z;
        } catch (PackageManager.NameNotFoundException e2) {
            k8n.b("1068", e2);
            return false;
        } catch (Exception e3) {
            k8n.b("1069", e3);
            return false;
        }
    }
}
