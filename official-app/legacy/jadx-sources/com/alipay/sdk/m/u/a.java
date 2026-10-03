package com.alipay.sdk.m.u;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.app.EnvUtils;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.a1n;
import com.oplus.aiunit.vision.chm;
import com.oplus.aiunit.vision.dam;
import com.oplus.aiunit.vision.evm;
import com.oplus.aiunit.vision.gam;
import com.oplus.aiunit.vision.h9m;
import com.oplus.aiunit.vision.ham;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.lqm;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.qrm;
import com.oplus.aiunit.vision.rnb;
import com.oplus.aiunit.vision.sgm;
import com.oplus.aiunit.vision.t4n;
import com.oplus.aiunit.vision.xpg;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    public static final String a = "com.alipay.android.app";
    public static final String b = "com.eg.android.AlipayGphone";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f607c = "hk.alipay.wallet";
    public static final String d = "hk.alipay.walletRC";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f608e = "com.eg.android.AlipayGphoneRC";
    public static final int f = 99;
    public static final int h = 125;
    public static final int i = 460;
    public static final String[] g = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f609j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', mla.SEPARATOR};

    /* JADX INFO: renamed from: com.alipay.sdk.m.u.a$a, reason: collision with other inner class name */
    public static class RunnableC0153a implements Runnable {
        public final /* synthetic */ Activity i;

        public RunnableC0153a(Activity activity) {
            this.i = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.finish();
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f610j;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.i = runnable;
            this.f610j = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.i.run();
            } finally {
                this.f610j.open();
            }
        }
    }

    public static final class c {
        public final PackageInfo a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f611c;

        public c(PackageInfo packageInfo, int i, String str) {
            this.a = packageInfo;
            this.b = i;
            this.f611c = str;
        }

        public boolean a() {
            return this.a.versionCode < this.b;
        }

        public boolean b(qam qamVar) {
            Signature[] signatureArr = this.a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String strM = a.m(qamVar, signature.toByteArray());
                if (strM != null && !TextUtils.equals(strM, this.f611c)) {
                    l9m.h(qamVar, sgm.f16581l, sgm.D, String.format("Got %s, expected %s", strM, this.f611c));
                    return true;
                }
            }
            return false;
        }
    }

    public static String A() {
        if (EnvUtils.c()) {
            return TextUtils.equals("hk.alipay.wallet", gam.d.get(0).a) ? d : f608e;
        }
        try {
            return gam.d.get(0).a;
        } catch (Throwable unused) {
            return b;
        }
    }

    public static String B(Context context) {
        return "-1;-1";
    }

    public static String C(String str, String str2) {
        String strA = xpg.a(((Application) chm.e().c()).getContentResolver(), str);
        return strA != null ? strA : str2;
    }

    public static Map<String, String> D(qam qamVar, String str) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), Q(qamVar, str2.substring(iIndexOf2 + 1)));
                }
            }
        }
        return map;
    }

    public static Map<String, String> E(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf(HttpUtils.EQUAL_SIGN, 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static boolean F(qam qamVar) {
        if (qamVar == null || TextUtils.isEmpty(qamVar.g)) {
            return false;
        }
        return qamVar.g.toLowerCase().contains(sgm.f16582n);
    }

    public static String G(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String H(qam qamVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
        } catch (Exception e2) {
            l9m.h(qamVar, sgm.f16581l, "rflex", e2.getClass().getSimpleName());
            return null;
        }
    }

    public static String I(String str) {
        return (EnvUtils.c() && TextUtils.equals(str, f608e)) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static int J(String str) {
        for (int i2 = 0; i2 < 64; i2++) {
            if (str.equals(String.valueOf(f609j[i2]))) {
                return i2;
            }
        }
        return 0;
    }

    public static DisplayMetrics K(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String L() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + Weather.SEPARATOR + matcher.group(2) + " " + matcher.group(3) + Weather.SEPARATOR + matcher.group(4);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static boolean M(qam qamVar, String str) {
        try {
            int iN = N(str);
            l9m.c(qamVar, sgm.f16581l, "bindExt", "" + iN);
            return h9m.I().v() && (iN & 2) == 2;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int N(String str) {
        try {
            String strQ = h9m.I().q();
            if (TextUtils.isEmpty(strQ)) {
                return 0;
            }
            return (C(strQ, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String O() {
        String strL = L();
        int iIndexOf = strL.indexOf("-");
        if (iIndexOf != -1) {
            strL = strL.substring(0, iIndexOf);
        }
        int iIndexOf2 = strL.indexOf(Weather.SEPARATOR);
        if (iIndexOf2 != -1) {
            strL = strL.substring(0, iIndexOf2);
        }
        return "Linux " + strL;
    }

    public static String P(Context context) {
        String strA = t4n.a(context);
        return strA.substring(0, strA.indexOf("://"));
    }

    public static String Q(qam qamVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            l9m.d(qamVar, sgm.f16581l, sgm.B, e2);
            return "";
        }
    }

    public static String R() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String S(Context context) {
        DisplayMetrics displayMetricsK = K(context);
        return displayMetricsK.widthPixels + "*" + displayMetricsK.heightPixels;
    }

    public static boolean T(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static int U() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            qrm.d(th);
            return Const.ERROR_CODE_NON_EXIST;
        }
    }

    public static String V(Context context) {
        return " (" + R() + ";" + O() + ";" + G(context) + ";;" + S(context) + ")(sdk android)";
    }

    public static String W(String str) {
        return p(str, true);
    }

    public static JSONObject X(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static boolean Y() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean Z(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static int a() {
        String strD = chm.e().d();
        if (TextUtils.isEmpty(strD)) {
            return -1;
        }
        String strReplaceAll = strD.replaceAll(HttpUtils.EQUAL_SIGN, "");
        if (strReplaceAll.length() >= 5) {
            strReplaceAll = strReplaceAll.substring(0, 5);
        }
        int iB = (int) (b(strReplaceAll) % 10000);
        return iB < 0 ? iB * (-1) : iB;
    }

    public static String a0(String str) {
        try {
            Uri uri = Uri.parse(str);
            return String.format("%s%s", uri.getAuthority(), uri.getPath());
        } catch (Throwable th) {
            qrm.d(th);
            return "-";
        }
    }

    public static long b(String str) {
        return c(str, 6);
    }

    public static long c(String str, int i2) {
        int iPow = (int) Math.pow(2.0d, i2);
        int length = str.length();
        long j2 = 0;
        int i3 = 0;
        int i4 = length;
        while (i3 < length) {
            int i5 = i3 + 1;
            j2 += ((long) Integer.parseInt(String.valueOf(J(str.substring(i3, i5))))) * ((long) Math.pow(iPow, i4 - 1));
            i4--;
            i3 = i5;
        }
        return j2;
    }

    public static ActivityInfo d(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            qrm.d(th);
            return null;
        }
    }

    public static PackageInfo e(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static c f(PackageInfo packageInfo, int i2, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i2, str);
    }

    public static c g(qam qamVar, Context context, String str, int i2, String str2) {
        PackageInfo packageInfoE;
        if (EnvUtils.c()) {
            if (b.equals(str)) {
                str = f608e;
            } else if ("hk.alipay.wallet".equals(str)) {
                str = d;
            }
        }
        try {
            packageInfoE = e(context, str);
        } catch (Throwable th) {
            l9m.h(qamVar, sgm.f16582n, sgm.v, th.getMessage());
            packageInfoE = null;
        }
        if (x(qamVar, packageInfoE)) {
            return f(packageInfoE, i2, str2);
        }
        return null;
    }

    public static c h(qam qamVar, Context context, List<h9m.b> list) {
        c cVarG;
        if (list == null) {
            return null;
        }
        for (h9m.b bVar : list) {
            if (bVar != null && (cVarG = g(qamVar, context, bVar.a, bVar.b, bVar.f12079c)) != null && !cVarG.b(qamVar) && !cVarG.a()) {
                return cVarG;
            }
        }
        return null;
    }

    public static <T> T i(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String j(int i2) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String k(qam qamVar) {
        return H(qamVar, "ro.build.fingerprint");
    }

    public static String l(qam qamVar, Context context) {
        try {
            String strB = a1n.b(qamVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                a1n.c(qamVar, context, "alipay_cashier_ap_fi", dam.b("FU", System.currentTimeMillis(), new lqm(), (short) 0, new evm()).a());
                String strB2 = a1n.b(qamVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(strB2)) {
                    return strB2;
                }
                l9m.h(qamVar, sgm.f16581l, "e_regen_empty", "");
                return "";
            } catch (Exception e2) {
                l9m.h(qamVar, sgm.f16581l, "e_gen", e2.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e3) {
            l9m.d(qamVar, sgm.f16581l, "e_gen_err", e3);
            return "";
        }
    }

    public static String m(qam qamVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e2) {
            l9m.d(qamVar, sgm.f16582n, sgm.x, e2);
            return null;
        }
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str) + str.length();
            if (iIndexOf <= str.length()) {
                return "";
            }
            int iIndexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, iIndexOf) : 0;
            return iIndexOf2 < 1 ? str3.substring(iIndexOf) : str3.substring(iIndexOf, iIndexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String p(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (!z || bArrDigest.length <= 16) {
                return q(bArrDigest);
            }
            byte[] bArr = new byte[16];
            System.arraycopy(bArrDigest, 0, bArr, 0, 16);
            return q(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String q(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 & 240) >> 4, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static Map<String, String> r(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject.optString(next));
            } catch (Throwable th) {
                qrm.d(th);
            }
        }
        return map;
    }

    public static JSONObject s(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static void t(String str, String str2, Context context, qam qamVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || F(qamVar) || !h9m.I().B()) {
            return;
        }
        try {
            Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            l9m.c(qamVar, sgm.f16581l, "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    public static boolean u(long j2, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j2 > 0) {
                return conditionVariable.block(j2);
            }
            conditionVariable.block();
            return true;
        } catch (Throwable unused) {
        }
    }

    public static boolean v(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = g;
            return TextUtils.equals(str, strArr[0]) || TextUtils.equals(str, strArr[1]);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean w(qam qamVar, Context context, List<h9m.b> list, boolean z) {
        try {
            for (h9m.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.a;
                    if (EnvUtils.c()) {
                        if (b.equals(str)) {
                            str = f608e;
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = d;
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z) {
                                return true;
                            }
                            l9m.c(qamVar, sgm.f16581l, sgm.X, packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, sgm.h0, th);
            return false;
        }
    }

    public static boolean x(qam qamVar, PackageInfo packageInfo) {
        String str = "";
        boolean z = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z = true;
            }
        }
        if (!z) {
            l9m.h(qamVar, sgm.f16582n, sgm.w, str);
        }
        return z;
    }

    public static boolean y(qam qamVar, String str) {
        try {
            String host = new URL(str).getHost();
            return host.endsWith(ham.B) || host.endsWith(ham.C);
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, "ckUrlErr", th);
            return false;
        }
    }

    public static boolean z(qam qamVar, String str, Activity activity) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (str.toLowerCase().startsWith(ham.f12088n.toLowerCase()) || str.toLowerCase().startsWith(ham.o.toLowerCase())) {
            try {
                c cVarH = h(qamVar, activity, gam.d);
                if (cVarH != null && !cVarH.a() && !cVarH.b(qamVar)) {
                    if (str.startsWith("intent://platformapi/startapp")) {
                        str = str.replaceFirst("intent://platformapi/startapp\\?", ham.f12088n);
                    }
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        if (TextUtils.equals(str, ham.q) || TextUtils.equals(str, n("http", ham.s))) {
            qgm.c(qgm.a());
            activity.finish();
            return true;
        }
        if (!str.startsWith(ham.p)) {
            return false;
        }
        try {
            String strSubstring2 = str.substring(str.indexOf(ham.p) + 24);
            int i2 = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf(ham.t) + 10));
            if (i2 == com.alipay.sdk.m.j.c.SUCCEEDED.b() || i2 == com.alipay.sdk.m.j.c.PAY_WAITTING.b()) {
                if (ham.x) {
                    StringBuilder sb = new StringBuilder();
                    String strDecode = URLDecoder.decode(str);
                    String strDecode2 = URLDecoder.decode(strDecode);
                    String str2 = strDecode2.substring(strDecode2.indexOf(ham.p) + 24, strDecode2.lastIndexOf(ham.t)).split(ham.v)[0];
                    int iIndexOf = strDecode.indexOf(ham.v) + 12;
                    sb.append(str2);
                    sb.append(ham.v);
                    sb.append(strDecode.substring(iIndexOf, strDecode.indexOf("&", iIndexOf)));
                    sb.append(strDecode.substring(strDecode.indexOf("&", iIndexOf)));
                    strSubstring = sb.toString();
                } else {
                    String strDecode3 = URLDecoder.decode(str);
                    strSubstring = strDecode3.substring(strDecode3.indexOf(ham.p) + 24, strDecode3.lastIndexOf(ham.t));
                }
                com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(i2);
                qgm.c(qgm.b(cVarB.b(), cVarB.a(), strSubstring));
            } else {
                com.alipay.sdk.m.j.c cVarB2 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.FAILED.b());
                qgm.c(qgm.b(cVarB2.b(), cVarB2.a(), ""));
            }
        } catch (Exception unused2) {
            qgm.c(qgm.h());
        }
        activity.runOnUiThread(new RunnableC0153a(activity));
        return true;
    }
}
