package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Random;

/* JADX INFO: loaded from: classes12.dex */
public class ugm {
    public static final String d = "virtualImeiAndImsi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17463e = "virtual_imei";
    public static final String f = "virtual_imsi";
    public static volatile ugm g;
    public String a;
    public String b = "sdk-and-lite";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17464c;

    public ugm() {
        String strA = gam.a();
        if (gam.c()) {
            return;
        }
        this.b += '_' + strA;
    }

    public static String a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static synchronized void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(chm.e().c()).edit().putString("trideskey", str).apply();
        ham.f = str;
    }

    public static synchronized ugm d() {
        if (g == null) {
            g = new ugm();
        }
        return g;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append("(");
            sb.append(packageName);
            sb.append(";");
            sb.append(packageInfo.versionCode);
            sb.append(")");
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String f() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public static String g() {
        return "-1;-1";
    }

    public static String h() {
        return "1";
    }

    public static String i() {
        Context contextC = chm.e().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences(d, 0);
        String string = sharedPreferences.getString(f17463e, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strF = TextUtils.isEmpty(ram.a(contextC).g()) ? f() : ykm.a(contextC).b();
        sharedPreferences.edit().putString(f17463e, strF).apply();
        return strF;
    }

    public static String j() {
        String strC;
        Context contextC = chm.e().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences(d, 0);
        String string = sharedPreferences.getString(f, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(ram.a(contextC).g())) {
            String strD = chm.e().d();
            strC = (TextUtils.isEmpty(strD) || strD.length() < 18) ? f() : strD.substring(3, 18);
        } else {
            strC = ykm.a(contextC).c();
        }
        String str = strC;
        sharedPreferences.edit().putString(f, str).apply();
        return str;
    }

    public static String k() {
        return "00";
    }

    public static String l() {
        return "-1";
    }

    public String b(qam qamVar, ram ramVar, boolean z) {
        Context contextC = chm.e().c();
        ykm ykmVarA = ykm.a(contextC);
        if (TextUtils.isEmpty(this.a)) {
            this.a = "Msp/15.8.17 (" + com.alipay.sdk.m.u.a.R() + ";" + com.alipay.sdk.m.u.a.O() + ";" + com.alipay.sdk.m.u.a.G(contextC) + ";" + com.alipay.sdk.m.u.a.P(contextC) + ";" + com.alipay.sdk.m.u.a.S(contextC) + ";" + a(contextC);
        }
        String strB = ykm.e(contextC).b();
        String strB2 = com.alipay.sdk.m.u.a.B(contextC);
        String strH = h();
        String strC = ykmVarA.c();
        String strB3 = ykmVarA.b();
        String strJ = j();
        String strI = i();
        if (ramVar != null) {
            this.f17464c = ramVar.f();
        }
        String strReplace = Build.MANUFACTURER.replace(";", " ");
        String strReplace2 = Build.MODEL.replace(";", " ");
        boolean zF = chm.f();
        String strF = ykmVarA.f();
        String strL = l();
        String strK = k();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(";");
        sb.append(strB);
        sb.append(";");
        sb.append(strB2);
        sb.append(";");
        sb.append(strH);
        sb.append(";");
        sb.append(strC);
        sb.append(";");
        sb.append(strB3);
        sb.append(";");
        sb.append(this.f17464c);
        sb.append(";");
        sb.append(strReplace);
        sb.append(";");
        sb.append(strReplace2);
        sb.append(";");
        sb.append(zF);
        sb.append(";");
        sb.append(strF);
        sb.append(";");
        sb.append(g());
        sb.append(";");
        sb.append(this.b);
        sb.append(";");
        sb.append(strJ);
        sb.append(";");
        sb.append(strI);
        sb.append(";");
        sb.append(strL);
        sb.append(";");
        sb.append(strK);
        if (ramVar != null) {
            String strB4 = fgm.b(qamVar, contextC, ram.a(contextC).g(), fgm.d(qamVar, contextC));
            if (!TextUtils.isEmpty(strB4)) {
                sb.append(";;;");
                sb.append(strB4);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
