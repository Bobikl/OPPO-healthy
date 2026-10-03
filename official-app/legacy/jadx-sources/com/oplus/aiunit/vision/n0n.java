package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class n0n {
    public static String a = "";
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f14284c = "";
    public static String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f14285e = null;
    public static boolean f = false;

    public class a extends u4n {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14286j;

        public a(Context context, String str) {
            this.i = context;
            this.f14286j = str;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            FileOutputStream fileOutputStream = null;
            try {
                File file = new File(b2n.i(this.i, "k.store"));
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(w0n.n(this.f14286j));
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        a2n.e(th, c0.SPNAME, "stf");
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static String a(Context context) {
        try {
            return l(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return d;
        }
    }

    public static void b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d = str;
        if (context != null) {
            com.amap.api.col.p0003sl.q0.h().b(new a(context, str));
        }
    }

    public static void c(String str) {
        b = str;
    }

    public static boolean d() {
        try {
            if (f) {
                return true;
            }
            if (g(f14285e)) {
                f = true;
                return true;
            }
            if (!TextUtils.isEmpty(f14285e)) {
                f = false;
                f14285e = null;
                return false;
            }
            if (g(b)) {
                f = true;
                return true;
            }
            if (!TextUtils.isEmpty(b)) {
                f = false;
                b = null;
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        try {
            if (!"".equals(a)) {
                return a;
            }
            PackageManager packageManager = context.getPackageManager();
            a = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return a;
        } catch (Throwable th) {
            a2n.e(th, c0.SPNAME, "gAN");
        }
    }

    public static String f(Context context) {
        try {
            String str = b;
            if (str != null && !"".equals(str)) {
                return b;
            }
            String packageName = context.getPackageName();
            b = packageName;
            if (!g(packageName)) {
                b = context.getPackageName();
            }
            return b;
        } catch (Throwable th) {
            a2n.e(th, c0.SPNAME, "gpck");
        }
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    c2n.o(w0n.a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    public static String h(Context context) {
        try {
            if (!"".equals(f14284c)) {
                return f14284c;
            }
            f14284c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            String str = f14284c;
            return str == null ? "" : str;
        } catch (Throwable th) {
            a2n.e(th, c0.SPNAME, "gAV");
        }
    }

    public static String i(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] bArrDigest = MessageDigest.getInstance(w0n.t("IU0hBMQ")).digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String strF = packageInfo.packageName;
            if (g(strF)) {
                strF = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(b)) {
                strF = f(context);
            }
            stringBuffer.append(strF);
            String string = stringBuffer.toString();
            f14285e = string;
            return string;
        } catch (Throwable th) {
            a2n.e(th, c0.SPNAME, "gsp");
            return f14285e;
        }
    }

    public static String j(Context context) {
        try {
            com.amap.api.col.p0003sl.e0.g(context);
        } catch (Throwable unused) {
        }
        try {
            return l(context);
        } catch (Throwable th) {
            a2n.e(th, c0.SPNAME, "gKy");
            return d;
        }
    }

    public static String k(Context context) {
        FileInputStream fileInputStream;
        Throwable th;
        File file = new File(b2n.i(context, "k.store"));
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String strG = w0n.g(bArr);
                String str = strG.length() == 32 ? strG : "";
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return str;
            } catch (Throwable th3) {
                th = th3;
                try {
                    a2n.e(th, c0.SPNAME, "gKe");
                    try {
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th6) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            fileInputStream = null;
            th = th8;
        }
    }

    public static String l(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        String str = d;
        if (str == null || str.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return d;
            }
            String string = bundle.getString("com.amap.api.v2.apikey");
            d = string;
            if (string == null) {
                d = k(context);
            }
        }
        return d;
    }
}
