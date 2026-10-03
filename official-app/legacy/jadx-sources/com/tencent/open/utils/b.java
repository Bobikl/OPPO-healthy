package com.tencent.open.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.lcm;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.uum;
import com.oplus.aiunit.vision.yzm;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static String a = "";
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f20318c = "";
    public static String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f20319e = -1;

    public static class a extends Thread {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Bundle f20320j;

        public a(Context context, Bundle bundle) {
            this.i = context;
            this.f20320j = bundle;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                HttpUtils.j(this.i, "https://cgi.qplus.com/report/report", "GET", this.f20320j);
            } catch (Exception e2) {
                q8g.f("openSDK_LOG.Util", "reportBernoulli has exception: " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.utils.b$b, reason: collision with other inner class name */
    public static class C1015b {
        public String a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f20321c;

        public C1015b(String str, int i) {
            this.a = str;
            this.b = i;
            if (str != null) {
                this.f20321c = str.length();
            }
        }
    }

    public static boolean A(Context context) {
        double dSqrt;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            dSqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            dSqrt = 0.0d;
        }
        return dSqrt > 6.5d;
    }

    public static String B(Context context, String str) {
        if (context == null) {
            return "";
        }
        v(context, str);
        return a;
    }

    public static JSONObject C(String str) throws JSONException {
        if (str.equals(SpeechConstant.FALSE_STR)) {
            str = "{value : false}";
        }
        if (str.equals(SpeechConstant.TRUE_STR)) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + "}";
        }
        return new JSONObject(str);
    }

    public static String D(Context context, String str) {
        if (context == null) {
            return "";
        }
        String strB = B(context, str);
        f20318c = strB;
        return strB;
    }

    public static String E(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(K(str));
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(a(b2 >>> 4));
                sb.append(a(b2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            q8g.f("openSDK_LOG.Util", "encrypt has exception: " + e2.getMessage());
            return str;
        }
    }

    public static boolean F(Context context, String str) {
        boolean z = !A(context) || yzm.e(context, s04.PACKAGE_QQ_PAD) == null;
        if (z && yzm.e(context, s04.PACKAGE_TIM) != null) {
            z = false;
        }
        if (z && yzm.e(context, s04.PACKAGE_QQ_SPEED) != null) {
            z = false;
        }
        if (z) {
            return yzm.j(context, str) < 0;
        }
        return z;
    }

    public static boolean G(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (yzm.b(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strI = i(messageDigest.digest());
                    messageDigest.reset();
                    if (strI.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e2) {
                    q8g.f("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e2.getMessage());
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static final boolean H(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static File I(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null || (externalFilesDirs = context.getExternalFilesDirs(str)) == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    public static boolean J(String str) {
        return str != null && new File(str).exists();
    }

    public static byte[] K(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String L(String str) {
        if (str == null) {
            return null;
        }
        return Base64.encodeToString(s(str.getBytes(), "JCPTZXEZ"), 3);
    }

    public static File M(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() == null || file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                file.createNewFile();
            } else {
                q8g.d("openSDK_LOG.Util", "createFile failed" + str);
            }
        }
        return file;
    }

    public static boolean N(String str) {
        String strU = u();
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(strU) || !str.contains(strU)) ? false : true;
    }

    public static char a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }

    public static Drawable b(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        if (context == null) {
            q8g.f("openSDK_LOG.Util", "context null!");
            return null;
        }
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("inputStream close exception: ");
                        sb.append(e.getMessage());
                        q8g.f("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e3) {
                    e = e3;
                    q8g.f("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e4) {
                        e = e4;
                        sb = new StringBuilder();
                        sb.append("inputStream close exception: ");
                        sb.append(e.getMessage());
                        q8g.f("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    q8g.f("openSDK_LOG.Util", "inputStream close exception: " + e5.getMessage());
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream.close();
            throw th;
        }
        return drawableCreateFromStream;
    }

    public static Bundle c(String str) {
        Bundle bundle = new Bundle();
        if (str == null) {
            return bundle;
        }
        try {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split(com.heytap.store.base.core.http.HttpUtils.EQUAL_SIGN);
                if (strArrSplit.length == 2) {
                    bundle.putString(URLDecoder.decode(strArrSplit[0]), URLDecoder.decode(strArrSplit[1]));
                }
            }
            return bundle;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bundle d(String str, String str2, String str3, String str4, String str5, String str6) {
        return f(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "1");
        bundle.putString("result", str);
        bundle.putString("code", str2);
        bundle.putString("tmcost", str3);
        bundle.putString("rate", str4);
        bundle.putString("cmd", str5);
        bundle.putString("uin", str6);
        bundle.putString("appid", str7);
        bundle.putString(SensorsBean.SHARE_TYPE, str8);
        bundle.putString("detail", str9);
        bundle.putString("os_ver", Build.VERSION.RELEASE);
        bundle.putString("network", lcm.a(uum.a()));
        bundle.putString("apn", lcm.b(uum.a()));
        bundle.putString("model_name", Build.MODEL);
        bundle.putString("sdk_ver", s04.SDK_VERSION);
        bundle.putString(StatisticsTrackUtil.KEY_PACKAGE_NAME, uum.d());
        bundle.putString("app_ver", B(uum.a(), uum.d()));
        return bundle;
    }

    public static Bundle f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString("app_id", str5);
        bundle.putString("result", str6);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        bundle.putString("platform", "1");
        return bundle;
    }

    public static final String g(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    public static final String h(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UTF-8";
        }
        try {
            if (str.getBytes(str2).length <= i) {
                return str;
            }
            int i2 = 0;
            int length = 0;
            while (i2 < str.length()) {
                int i3 = i2 + 1;
                length += str.substring(i2, i3).getBytes(str2).length;
                if (length > i) {
                    String strSubstring = str.substring(0, i2);
                    if (TextUtils.isEmpty(str3)) {
                        return strSubstring;
                    }
                    return strSubstring + str3;
                }
                i2 = i3;
            }
            return str;
        } catch (Exception e2) {
            q8g.f("openSDK_LOG.Util", "Util.subString has exception: " + e2.getMessage());
            return str;
        }
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            String string = Integer.toString(b2 & 255, 16);
            if (string.length() == 1) {
                string = "0" + string;
            }
            sb.append(string);
        }
        return sb.toString();
    }

    public static JSONObject j(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split(com.heytap.store.base.core.http.HttpUtils.EQUAL_SIGN);
                if (strArrSplit.length == 2) {
                    try {
                        strArrSplit[0] = URLDecoder.decode(strArrSplit[0]);
                        strArrSplit[1] = URLDecoder.decode(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    } catch (JSONException e2) {
                        q8g.f("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e2.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void k(Context context, String str, long j2, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("appid_for_getting_config", str2);
        bundle.putString("strValue", str2);
        bundle.putString("nValue", str);
        bundle.putString("qver", s04.SDK_VERSION);
        if (j2 != 0) {
            bundle.putLong("elt", j2);
        }
        new a(context, bundle).start();
    }

    public static void l(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    public static boolean m() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null) != null;
    }

    public static boolean n(Context context, String str) {
        boolean zG;
        try {
            zG = G(context);
            try {
                if (zG) {
                    l(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    l(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (!zG) {
                    try {
                        try {
                            l(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused2) {
                            return false;
                        }
                    } catch (Exception unused3) {
                        l(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                }
                try {
                    try {
                        try {
                            l(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused4) {
                            return false;
                        }
                    } catch (Exception unused5) {
                        l(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                } catch (Exception unused6) {
                    l(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                    return true;
                }
            }
        } catch (Exception unused7) {
            zG = false;
        }
    }

    public static boolean o(Context context, String str, String str2) {
        boolean zR = r(str, str2);
        q8g.i("openSDK_LOG.Util", "copyFileByCheckPermission() copy success:" + zR);
        return zR;
    }

    public static boolean p(Context context, boolean z) {
        return (A(context) && yzm.e(context, s04.PACKAGE_QQ_PAD) != null) || yzm.j(context, "4.1") >= 0 || yzm.e(context, s04.PACKAGE_TIM) != null || yzm.e(context, s04.PACKAGE_QQ_SPEED) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static boolean q(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream((File) file2);
                    try {
                        file2 = new BufferedInputStream(new FileInputStream(file));
                        try {
                            byte[] bArr = new byte[102400];
                            while (true) {
                                int i = file2.read(bArr);
                                if (i != -1) {
                                    fileOutputStream2.write(bArr, 0, i);
                                    fileOutputStream2.flush();
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e2) {
                                        q8g.g("openSDK_LOG.Util", "copyFile error, ", e2);
                                    }
                                }
                            }
                            fileOutputStream2.close();
                            try {
                                file2.close();
                            } catch (IOException e3) {
                                q8g.g("openSDK_LOG.Util", "copyFile error, ", e3);
                            }
                            return true;
                        } catch (IOException e4) {
                            e = e4;
                            fileOutputStream = fileOutputStream2;
                            file2 = file2;
                            q8g.g("openSDK_LOG.Util", "copyFile error, ", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e5) {
                                    q8g.g("openSDK_LOG.Util", "copyFile error, ", e5);
                                }
                            }
                            if (file2 != 0) {
                                file2.close();
                                file2 = file2;
                            }
                            return false;
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                            fileOutputStream = fileOutputStream2;
                            file2 = file2;
                            q8g.g("openSDK_LOG.Util", "copyFile error, ", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e7) {
                                    q8g.g("openSDK_LOG.Util", "copyFile error, ", e7);
                                }
                            }
                            if (file2 != 0) {
                                file2.close();
                                file2 = file2;
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e8) {
                                    q8g.g("openSDK_LOG.Util", "copyFile error, ", e8);
                                }
                            }
                            if (file2 == 0) {
                                throw th;
                            }
                            try {
                                file2.close();
                                throw th;
                            } catch (IOException e9) {
                                q8g.g("openSDK_LOG.Util", "copyFile error, ", e9);
                                throw th;
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        file2 = 0;
                    } catch (OutOfMemoryError e11) {
                        e = e11;
                        file2 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        file2 = 0;
                    }
                } catch (IOException e12) {
                    q8g.g("openSDK_LOG.Util", "copyFile error, ", e12);
                    return false;
                }
            } catch (IOException e13) {
                e = e13;
                file2 = 0;
            } catch (OutOfMemoryError e14) {
                e = e14;
                file2 = 0;
            } catch (Throwable th3) {
                th = th3;
                file2 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean r(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            try {
                return q(file, M(str2));
            } catch (IOException e2) {
                q8g.e("openSDK_LOG.Util", "copy fail from " + str + " to " + str2 + " ", e2);
            }
        }
        return false;
    }

    public static byte[] s(byte[] bArr, String str) {
        if (bArr != null) {
            try {
                char[] charArray = str.toCharArray();
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr2[i] = (byte) (bArr[i] ^ charArray[i % charArray.length]);
                }
                return bArr2;
            } catch (Throwable th) {
                q8g.g("Util", "xor Exception! ", th);
            }
        }
        return bArr;
    }

    public static Bundle t(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleC = c(url.getQuery());
            bundleC.putAll(c(url.getRef()));
            return bundleC;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static String u() {
        File fileG = uum.g();
        if (fileG == null) {
            return null;
        }
        if (!fileG.exists()) {
            fileG.mkdirs();
        }
        return fileG.toString();
    }

    public static void v(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            b = str2;
            a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = b;
            d = str3.substring(str3.lastIndexOf(46) + 1, b.length());
            f20319e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            q8g.f("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        } catch (Exception e3) {
            q8g.f("openSDK_LOG.Util", "getPackageInfo has exception: " + e3.getMessage());
        }
    }

    public static boolean w(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String x(Context context, String str) {
        if (context == null) {
            return "";
        }
        v(context, str);
        return b;
    }

    public static JSONObject y(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectJ = j(null, url.getQuery());
            j(jSONObjectJ, url.getRef());
            return jSONObjectJ;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    public static boolean z() {
        Context contextA = uum.a();
        return contextA != null && contextA.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", contextA.getPackageName()) == 0;
    }
}
