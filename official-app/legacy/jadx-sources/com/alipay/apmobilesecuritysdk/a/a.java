package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.oplus.aiunit.vision.cam;
import com.oplus.aiunit.vision.fjm;
import com.oplus.aiunit.vision.iqm;
import com.oplus.aiunit.vision.kqm;
import com.oplus.aiunit.vision.qkm;
import com.oplus.aiunit.vision.vam;
import com.oplus.aiunit.vision.yhm;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public Context a;
    public com.alipay.apmobilesecuritysdk.b.a b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f567c = 4;

    public a(Context context) {
        this.a = context;
    }

    private qkm b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        b bVarB;
        b bVarC;
        String str4 = "";
        try {
            Context context = this.a;
            kqm kqmVar = new kqm();
            String strB = vam.b(map, "appName", "");
            String strB2 = vam.b(map, "sessionId", "");
            String strB3 = vam.b(map, "rpcVersion", "");
            String strA = a(context, strB);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String strD = h.d(context);
            if (vam.f(strB2)) {
                kqmVar.f13384c = strB2;
            } else {
                kqmVar.f13384c = strA;
            }
            kqmVar.d = securityToken;
            kqmVar.f13385e = strD;
            kqmVar.a = "android";
            c cVarC = d.c(context);
            if (cVarC != null) {
                str2 = cVarC.a;
                str = cVarC.f569c;
            } else {
                str = "";
                str2 = str;
            }
            if (vam.c(str2) && (bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = bVarC.a;
                str = bVarC.f568c;
            }
            c cVarB = d.b();
            if (cVarB != null) {
                str4 = cVarB.a;
                str3 = cVarB.f569c;
            } else {
                str3 = "";
            }
            if (vam.c(str4) && (bVarB = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str4 = bVarB.a;
                str3 = bVarB.f568c;
            }
            kqmVar.h = str2;
            kqmVar.g = str4;
            kqmVar.f13386j = strB3;
            if (vam.c(str2)) {
                kqmVar.b = str4;
                str = str3;
            } else {
                kqmVar.b = str2;
            }
            kqmVar.i = str;
            kqmVar.f = e.a(context, map);
            return iqm.c(this.a, this.b.c()).a(kqmVar);
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0200 A[Catch: Exception -> 0x023f, TryCatch #0 {Exception -> 0x023f, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:37:0x00be, B:69:0x01e6, B:71:0x0200, B:74:0x0208, B:76:0x020e, B:80:0x0217, B:82:0x021d, B:40:0x00d6, B:42:0x00ee, B:48:0x00fb, B:49:0x010b, B:51:0x0112, B:55:0x0124, B:57:0x0174, B:59:0x017e, B:61:0x0186, B:63:0x0193, B:65:0x019d, B:67:0x01a5, B:66:0x01a1, B:60:0x0182, B:11:0x0055, B:13:0x0063, B:16:0x006e, B:18:0x0074, B:21:0x007f, B:24:0x0088, B:27:0x0095, B:30:0x00a2, B:33:0x00af), top: B:88:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0205  */
    public final int a(Map<String, String> map) {
        boolean z;
        int i;
        String str;
        cam camVarC;
        Context context;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.a, vam.b(map, "tid", ""), vam.b(map, "utdid", ""), a(this.a));
            String strB = vam.b(map, "appName", "");
            b();
            b(this.a);
            a(this.a, strB);
            i.a();
            boolean z2 = false;
            if (!a() && !com.alipay.apmobilesecuritysdk.common.a.a(this.a)) {
                e.a();
                if (!(!vam.d(e.b(this.a, map), i.c()))) {
                    String strB2 = vam.b(map, "tid", "");
                    String strB3 = vam.b(map, "utdid", "");
                    if ((!vam.f(strB2) || vam.d(strB2, i.d())) && ((!vam.f(strB3) || vam.d(strB3, i.e())) && i.a(this.a, strB) && !vam.c(a(this.a, strB)) && !vam.c(b(this.a)))) {
                        z = false;
                    }
                }
                z = true;
            } else if (vam.c(a(this.a, strB)) || vam.c(b(this.a))) {
                z = true;
            } else {
                z = false;
            }
            Context context2 = this.a;
            yhm.a(APSecuritySdk.getInstance(context2));
            h.b(context2, String.valueOf(yhm.A()));
            if (z) {
                new com.alipay.apmobilesecuritysdk.c.b();
                UmidSdkWrapper.startUmidTaskSync(this.a, com.alipay.apmobilesecuritysdk.b.a.a().b());
                qkm qkmVarB = b(map);
                int iC = qkmVarB != null ? qkmVarB.c() : 2;
                if (iC != 1) {
                    if (iC != 3) {
                        if (qkmVarB != null) {
                            str = "Server error, result:" + qkmVarB.b;
                        } else {
                            str = "Server error, returned null";
                        }
                        com.alipay.apmobilesecuritysdk.c.a.a(str);
                        if (vam.c(a(this.a, strB))) {
                            i = 4;
                        }
                    } else {
                        i = 1;
                    }
                    this.f567c = i;
                    camVarC = iqm.c(this.a, this.b.c());
                    context = this.a;
                    connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    } else {
                        activeNetworkInfo = null;
                    }
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                        z2 = true;
                    }
                    if (z2 && h.c(context)) {
                        new fjm(context.getFilesDir().getAbsolutePath() + "/log/ap", camVarC).b();
                    }
                    return this.f567c;
                }
                h.a(this.a, qkmVarB.b());
                h.d(this.a, qkmVarB.a());
                h.e(this.a, qkmVarB.g);
                h.a(this.a, qkmVarB.h);
                h.f(this.a, qkmVarB.i);
                h.g(this.a, qkmVarB.k);
                i.c(e.b(this.a, map));
                i.a(strB, qkmVarB.d);
                i.b(qkmVarB.f15838c);
                i.d(qkmVarB.f15840j);
                String strB4 = vam.b(map, "tid", "");
                if (!vam.f(strB4) || vam.d(strB4, i.d())) {
                    strB4 = i.d();
                } else {
                    i.e(strB4);
                }
                i.e(strB4);
                String strB5 = vam.b(map, "utdid", "");
                if (!vam.f(strB5) || vam.d(strB5, i.e())) {
                    strB5 = i.e();
                } else {
                    i.f(strB5);
                }
                i.f(strB5);
                i.a();
                d.a(this.a, i.g());
                d.a();
                com.alipay.apmobilesecuritysdk.e.a.a(this.a, new b(i.b(), i.c(), i.f()));
                com.alipay.apmobilesecuritysdk.e.a.a();
                g.a(this.a, strB, i.a(strB));
                g.a();
                h.a(this.a, strB, System.currentTimeMillis());
            }
            i = 0;
            this.f567c = i;
            camVarC = iqm.c(this.a, this.b.c());
            context = this.a;
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo != null) {
                z2 = true;
            }
            if (z2) {
                new fjm(context.getFilesDir().getAbsolutePath() + "/log/ap", camVarC).b();
            }
        } catch (Exception e2) {
            com.alipay.apmobilesecuritysdk.c.a.a(e2);
        }
        return this.f567c;
    }

    public static String a(Context context) {
        String strB = b(context);
        return vam.c(strB) ? h.f(context) : strB;
    }

    public static String b(Context context) {
        try {
            String strB = i.b();
            if (!vam.c(strB)) {
                return strB;
            }
            c cVarB = d.b(context);
            if (cVarB != null) {
                i.a(cVarB);
                String str = cVarB.a;
                if (vam.f(str)) {
                    return str;
                }
            }
            b bVarB = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (bVarB == null) {
                return "";
            }
            i.a(bVarB);
            String str2 = bVarB.a;
            return vam.f(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!vam.c(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !vam.c(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        for (int i = 0; i < 3; i++) {
            try {
                String[] strArrSplit = strArr[i].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(13, iRandom);
                    Date time = calendar.getTime();
                    if (date.after(date2) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
