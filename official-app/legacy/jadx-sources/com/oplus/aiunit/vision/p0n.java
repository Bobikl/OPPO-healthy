package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public final class p0n {
    public static String A = "";
    public static boolean B = false;
    public static int C = -1;
    public static boolean D = false;
    public static int E = -1;
    public static boolean F = false;
    public static volatile d G = null;
    public static String a = "";
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f15137c = true;
    public static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f15138e = "";
    public static String f = null;
    public static c g = null;
    public static volatile boolean h = false;
    public static String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f15139j = false;
    public static boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f15140l = null;
    public static IBinder m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f15141n = false;
    public static boolean o = false;
    public static String p = "";
    public static String q = "";
    public static boolean r = false;
    public static String s = "";
    public static String t = "";
    public static String u = "";
    public static String v = "";
    public static long w = 0;
    public static int x = 0;
    public static String y = null;
    public static String z = "";

    public class a extends u4n {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            try {
                Map<String, String> mapB = p0n.g.b();
                String strC = p0n.g.c(p0n.D(this.i), "", "", p0n.R());
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                com.amap.api.col.p0003sl.i0.b();
                String strA = p0n.g.a(this.i, new String(com.amap.api.col.p0003sl.i0.d(p0n.g.b(strC.getBytes(), mapB)).a));
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                p0n.b = strA;
            } catch (Throwable unused) {
            }
        }
    }

    public class b extends u4n {
        public final /* synthetic */ Context i;

        public b(Context context) {
            this.i = context;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            p0n.i0(this.i);
            p0n.a0();
        }
    }

    public interface c {
        String a();

        String a(Context context, String str);

        com.amap.api.col.p0003sl.la b(byte[] bArr, Map<String, String> map);

        Map<String, String> b();

        String c(String str, String str2, String str3, String str4);
    }

    public static class d {
        public static Context a;
        public static ConnectivityManager b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static NetworkRequest f15142c;
        public static ConnectivityManager.NetworkCallback d;

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                super.onAvailable(network);
                p0n.Y();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                p0n.Y();
            }
        }

        @SuppressLint({"WrongConstant"})
        public final void a(Context context) {
            if (p0n.v(context, w0n.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && context != null && b == null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                b = connectivityManager;
                if (connectivityManager != null) {
                    f15142c = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                    a aVar = new a();
                    d = aVar;
                    b.registerNetworkCallback(f15142c, aVar);
                    a = context;
                }
            }
        }
    }

    public static class e implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinder unused = p0n.m = iBinder;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static String A() {
        return "";
    }

    public static String B(Context context) {
        try {
            if (!k || f15139j) {
                return "";
            }
            if (TextUtils.isEmpty(i) && !f15141n) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    com.amap.api.col.p0003sl.q0.h().b(new b(context));
                    return i;
                }
                f15141n = true;
                return i0(context);
            }
            return i;
        } catch (Throwable unused) {
        }
    }

    public static String C() {
        return "";
    }

    public static String D(Context context) {
        if (o) {
            String str = a;
            return str == null ? "" : str;
        }
        try {
            String str2 = a;
            if (str2 != null && !"".equals(str2)) {
                return a;
            }
            if (v(context, w0n.t("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
                a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (!TextUtils.isEmpty(a)) {
                o = true;
                return a;
            }
            try {
                String strD0 = d0(context);
                a = strD0;
                if (!TextUtils.isEmpty(strD0)) {
                    o = true;
                    return a;
                }
            } catch (Throwable unused) {
            }
            try {
                a = e0(context);
                o = true;
            } catch (Throwable unused2) {
            }
            String str3 = a;
            return str3 == null ? "" : str3;
        } catch (Throwable unused3) {
        }
    }

    public static String E() {
        return "";
    }

    public static String F(Context context) {
        try {
            TelephonyManager telephonyManagerF = f(context);
            if (telephonyManagerF == null) {
                return "";
            }
            String strA = brj.a(telephonyManagerF);
            if (!TextUtils.isEmpty(strA) && strA.length() >= 3) {
                return strA.substring(0, 3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String G() {
        return p;
    }

    public static String H(Context context) {
        if (r) {
            return q;
        }
        try {
            k(context);
            TelephonyManager telephonyManagerF = f(context);
            if (telephonyManagerF == null) {
                return q;
            }
            String strA = brj.a(telephonyManagerF);
            if (!TextUtils.isEmpty(strA) && strA.length() >= 3) {
                q = strA.substring(3);
                r = true;
                return q;
            }
            r = true;
            return q;
        } catch (Throwable unused) {
        }
    }

    public static int I(Context context) {
        try {
            return e(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String[] J() {
        return new String[]{"", ""};
    }

    public static int K(Context context) {
        try {
            return c(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String L() {
        return u;
    }

    public static NetworkInfo M(Context context) {
        ConnectivityManager connectivityManagerD;
        if (v(context, w0n.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerD = d(context)) != null) {
            return connectivityManagerD.getActiveNetworkInfo();
        }
        return null;
    }

    public static String N() {
        return t;
    }

    public static void O() {
        try {
            z1n.a();
        } catch (Throwable unused) {
        }
    }

    public static String P() {
        return "";
    }

    public static String Q(Context context) {
        String str;
        try {
            String str2 = s;
            if (str2 != null && !"".equals(str2)) {
                return s;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i3 > i2) {
                str = i2 + "*" + i3;
            } else {
                str = i3 + "*" + i2;
            }
            s = str;
            return s;
        } catch (Throwable unused) {
        }
    }

    public static String R() {
        return "";
    }

    public static String S(Context context) {
        try {
            if (!v(context, w0n.t("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return z;
            }
            TelephonyManager telephonyManagerF = f(context);
            return telephonyManagerF == null ? "" : brj.b(telephonyManagerF);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long T() {
        long j2 = w;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            w = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576);
        } catch (Throwable unused) {
        }
        return w;
    }

    public static String U(Context context) {
        ConnectivityManager connectivityManagerD;
        NetworkInfo activeNetworkInfo;
        try {
            return (!v(context, w0n.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (connectivityManagerD = d(context)) == null || (activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String V() {
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String property = System.getProperty("os.arch");
        y = property;
        return property;
    }

    public static String W(Context context) {
        try {
            String strN = N();
            try {
                if (TextUtils.isEmpty(strN)) {
                    strN = n(context);
                }
                if (TextUtils.isEmpty(strN)) {
                    strN = D(context);
                }
                if (TextUtils.isEmpty(strN)) {
                    strN = B(context);
                }
                if (TextUtils.isEmpty(strN)) {
                    strN = E();
                }
                return TextUtils.isEmpty(strN) ? a(context) : strN;
            } catch (Throwable unused) {
                return strN;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String X(Context context) {
        return N() + "#" + n(context) + "#" + W(context);
    }

    public static void Y() {
        C = -1;
        D = false;
        E = -1;
        F = false;
        A = "";
        B = false;
        q = "";
        r = false;
    }

    public static int Z(Context context) {
        int i2 = x;
        if (i2 != 0) {
            return i2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i3 = ((int) (memoryInfo.totalMem / 1024)) / 1024;
        x = i3;
        return i3;
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(v)) {
            return v;
        }
        try {
            String strO = x2n.o(context, "open_common", "a1", "");
            if (TextUtils.isEmpty(strO)) {
                v = "amap" + UUID.randomUUID().toString().replace("_", "").toLowerCase();
                SharedPreferences.Editor editorC = x2n.c(context, "open_common");
                x2n.j(editorC, "a1", w0n.p(v));
                x2n.f(editorC);
            } else {
                v = w0n.t(strO);
            }
            return v;
        } catch (Throwable unused) {
            return v;
        }
    }

    public static /* synthetic */ boolean a0() {
        f15141n = true;
        return true;
    }

    public static String b(Context context) {
        if (B) {
            return A;
        }
        k(context);
        TelephonyManager telephonyManagerF = f(context);
        if (telephonyManagerF == null) {
            return A;
        }
        String simOperatorName = telephonyManagerF.getSimOperatorName();
        A = simOperatorName;
        if (TextUtils.isEmpty(simOperatorName)) {
            A = brj.b(telephonyManagerF);
        }
        B = true;
        return A;
    }

    public static String b0(Context context) {
        try {
            return b(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int c(Context context) {
        if (D) {
            return C;
        }
        k(context);
        if (context == null || !v(context, w0n.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return C;
        }
        ConnectivityManager connectivityManagerD = d(context);
        if (connectivityManagerD == null) {
            return C;
        }
        NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            D = true;
            return C;
        }
        int type = activeNetworkInfo.getType();
        C = type;
        D = true;
        return type;
    }

    public static ConnectivityManager d(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String d0(Context context) {
        try {
            String strO = x2n.o(context, "Alvin2", "UTDID2", "");
            return TextUtils.isEmpty(strO) ? x2n.o(context, "Alvin2", "UTDID", "") : strO;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int e(Context context) {
        ConnectivityManager connectivityManagerD;
        if (F) {
            return E;
        }
        k(context);
        if (v(context, w0n.t("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (connectivityManagerD = d(context)) != null) {
            NetworkInfo activeNetworkInfo = connectivityManagerD.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                E = activeNetworkInfo.getSubtype();
                F = true;
            }
            return E;
        }
        return E;
    }

    public static String e0(Context context) {
        FileInputStream fileInputStream;
        try {
            File file = new File(context.getExternalCacheDir().getAbsolutePath() + "/.UTSystemConfig/Global/Alvin2.xml");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            fileInputStream = new FileInputStream(file);
            try {
                xmlPullParserNewPullParser.setInput(fileInputStream, "utf-8");
                boolean z2 = false;
                for (int eventType = xmlPullParserNewPullParser.getEventType(); 1 != eventType; eventType = xmlPullParserNewPullParser.next()) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            z2 = false;
                        } else if (eventType == 4 && z2) {
                            String text = xmlPullParserNewPullParser.getText();
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused) {
                            }
                            return text;
                        }
                    } else if (xmlPullParserNewPullParser.getAttributeCount() > 0) {
                        int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(i2);
                            if ("UTDID2".equals(attributeValue) || "UTDID".equals(attributeValue)) {
                                z2 = true;
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
                if (fileInputStream == null) {
                    return "";
                }
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
        }
        try {
            fileInputStream.close();
            return "";
        } catch (Throwable unused4) {
            return "";
        }
    }

    public static TelephonyManager f(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static String f0(Context context) {
        try {
            if (!TextUtils.isEmpty(f15140l)) {
                return f15140l;
            }
            byte[] bArrDigest = MessageDigest.getInstance(w0n.t("IU0hBMQ")).digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                stringBuffer.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            String string = stringBuffer.toString();
            if (!TextUtils.isEmpty(string)) {
                f15140l = string;
            }
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String g(Context context) {
        String strH;
        if (!f15137c) {
            return "";
        }
        try {
            strH = h(context);
        } catch (Throwable unused) {
            strH = null;
        }
        if (TextUtils.isEmpty(strH)) {
            f15137c = false;
            return "";
        }
        try {
            byte[] bytes = w0n.t("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(q0n.e(w0n.t("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), q0n.g(strH), bytes), "UTF-8");
        } catch (Throwable unused2) {
            f15137c = false;
            return "";
        }
    }

    public static String g0(Context context) {
        try {
            Class<?> cls = Class.forName(w0n.t("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object objInvoke = cls.getMethod(w0n.t("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (objInvoke != null) {
                String str = (String) objInvoke;
                i = str;
                return str;
            }
        } catch (Throwable th) {
            a2n.e(th, "oa", "xm");
            f15139j = true;
        }
        return i;
    }

    public static String h(Context context) {
        String strI;
        try {
            strI = i(context);
        } catch (Throwable unused) {
            strI = "";
        }
        if (TextUtils.isEmpty(strI)) {
            return context == null ? "" : context.getSharedPreferences(w0n.t("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(t0n.d(w0n.t("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
        }
        return strI;
    }

    public static String h0(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(w0n.t("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    int columnCount = cursorQuery.getColumnCount();
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        if (w0n.t("IdmFsdWU").equals(cursorQuery.getColumnName(i2))) {
                            i = cursorQuery.getString(i2);
                            break;
                        }
                    }
                }
                cursorQuery.close();
            }
        } catch (Throwable th) {
            f15139j = true;
            a2n.e(th, "oa", "vivo");
        }
        return i;
    }

    public static String i(Context context) {
        RandomAccessFile randomAccessFile;
        String[] strArrSplit;
        String strD = t0n.d(w0n.t("LYW1hcF9kZXZpY2VfYWRpdQ"));
        String strJ = j(context);
        if (TextUtils.isEmpty(strJ)) {
            return "";
        }
        File file = new File(strJ + File.separator + w0n.t("KYmFja3Vwcw"), w0n.t("MLmFkaXU"));
        if (file.exists() && file.canRead()) {
            if (file.length() == 0) {
                file.delete();
                return "";
            }
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i2 = randomAccessFile.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i2);
                        } catch (Throwable unused) {
                            byteArrayOutputStream = byteArrayOutputStream2;
                            q(byteArrayOutputStream);
                        }
                    }
                    String str = new String(byteArrayOutputStream2.toByteArray(), "UTF-8");
                    if (!TextUtils.isEmpty(str) && str.contains(w0n.t("SIw")) && (strArrSplit = str.split(w0n.t("SIw"))) != null && strArrSplit.length == 2 && TextUtils.equals(strD, strArrSplit[0])) {
                        String str2 = strArrSplit[1];
                        q(byteArrayOutputStream2);
                        q(randomAccessFile);
                        return str2;
                    }
                    q(byteArrayOutputStream2);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                randomAccessFile = null;
            }
            q(randomAccessFile);
        }
        return "";
    }

    public static String i0(Context context) {
        String strT = w0n.t("IeGlhb21p");
        String str = Build.MANUFACTURER;
        if (!strT.equalsIgnoreCase(str)) {
            String strT2 = w0n.t("IeGlhb21p");
            String str2 = Build.BRAND;
            if (!strT2.equalsIgnoreCase(str2) && !w0n.t("IUkVETUk=").equalsIgnoreCase(str) && !w0n.t("IUkVETUk=").equalsIgnoreCase(str2)) {
                if (w0n.t("Idml2bw").equalsIgnoreCase(str) || w0n.t("Idml2bw").equalsIgnoreCase(str2)) {
                    return h0(context);
                }
                if (w0n.t("IaHVhd2Vp").equalsIgnoreCase(str) || w0n.t("IaHVhd2Vp").equalsIgnoreCase(str2) || w0n.t("ISE9OT1I=").equalsIgnoreCase(str)) {
                    return o(context, 2);
                }
                if (w0n.t("Mc2Ftc3VuZw").equalsIgnoreCase(str) || w0n.t("Mc2Ftc3VuZw").equalsIgnoreCase(str2)) {
                    return o(context, 4);
                }
                if (w0n.t("IT1BQTw").equalsIgnoreCase(str) || w0n.t("IT1BQTw").equalsIgnoreCase(str2) || w0n.t("MT25lUGx1cw").equalsIgnoreCase(str) || w0n.t("MT25lUGx1cw").equalsIgnoreCase(str2) || w0n.t("IUkVBTE1F").equalsIgnoreCase(str2)) {
                    return o(context, 5);
                }
                f15139j = true;
                return i;
            }
        }
        return g0(context);
    }

    public static String j(Context context) {
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null) {
                externalCacheDir = context.getCacheDir();
            }
            if (externalCacheDir != null) {
                return externalCacheDir.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized d k(Context context) {
        if (G == null) {
            if (context == null) {
                return null;
            }
            d dVar = new d();
            G = dVar;
            dVar.a(context.getApplicationContext());
        }
        return G;
    }

    public static String m() {
        return f;
    }

    public static String n(Context context) {
        try {
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            if (context == null) {
                return "";
            }
            String strG = g(context);
            b = strG;
            if (!TextUtils.isEmpty(strG)) {
                return b;
            }
            if (x() == null || h) {
                return "";
            }
            h = true;
            com.amap.api.col.p0003sl.q0.h().b(new a(context));
            return "";
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String o(Context context, int i2) {
        boolean z2;
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(w0n.t("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(w0n.t("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(w0n.t("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), w0n.t("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else {
                if (i2 != 5) {
                    f15139j = true;
                    return i;
                }
                intent.setClassName(w0n.t("YY29tLmhleXRhcC5vcGVuaWQ"), w0n.t("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(w0n.t("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            }
            e eVar = new e();
            if (context.bindService(intent, eVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(i)) {
                    i3++;
                    if (m != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        if (i2 == 2) {
                            parcelObtain.writeInterfaceToken(w0n.t("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U"));
                        } else if (i2 != 4) {
                            if (i2 != 5) {
                                z2 = false;
                            } else {
                                parcelObtain.writeInterfaceToken(w0n.t("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                                parcelObtain.writeString(context.getPackageName());
                                parcelObtain.writeString(f0(context));
                                parcelObtain.writeString(w0n.t("IT1VJRA"));
                            }
                            if (z2) {
                                try {
                                    m.transact(1, parcelObtain, parcelObtain2, 0);
                                    parcelObtain2.readException();
                                    i = parcelObtain2.readString();
                                } catch (Throwable th) {
                                    try {
                                        a2n.e(th, "oac", String.valueOf(i2));
                                        parcelObtain2.recycle();
                                    } catch (Throwable th2) {
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th2;
                                    }
                                }
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            parcelObtain.writeInterfaceToken(w0n.t("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ"));
                        }
                        z2 = true;
                        if (z2) {
                            m.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            i = parcelObtain2.readString();
                        }
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                    Thread.sleep(15L);
                }
                context.unbindService(eVar);
                m = null;
            }
            return i;
        } catch (Throwable th3) {
            a2n.e(th3, "oa", String.valueOf(i2));
            f15139j = true;
            return i;
        }
    }

    public static void p(c cVar) {
        if (g == null) {
            g = cVar;
        }
    }

    public static void q(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void r(String str) {
        f = str;
    }

    public static String t() {
        try {
            if (!TextUtils.isEmpty(f15138e)) {
                return f15138e;
            }
            c cVar = g;
            return cVar == null ? "" : cVar.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String u(Context context) {
        try {
            return b(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static boolean v(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static int w(Context context) {
        try {
            return e(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static c x() {
        return g;
    }

    public static int y(Context context) {
        try {
            return c(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String z() {
        return "";
    }
}
