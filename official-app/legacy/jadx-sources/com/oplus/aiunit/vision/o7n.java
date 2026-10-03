package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o7n {

    /* JADX INFO: renamed from: s_a, reason: collision with root package name */
    public static final ThreadPoolExecutor f14829s_a = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());
    public static String s_b = "phone";
    public static final String s_c = d("Y29tLmhleXRhcC5vcGVuaWQ=");

    public static PackageInfo a(Context context, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfoB = b(context, s_c, 8);
        if (packageInfoB != null && packageInfoB.getLongVersionCode() >= 50100) {
            k8n.a("openid " + packageInfoB.versionName + " supported new signing info");
            return b(context, str, 134217728);
        }
        PackageInfo packageInfoB2 = b(context, "com.oplus.stdid", 8);
        if (packageInfoB2 == null || packageInfoB2.getLongVersionCode() < 20200) {
            k8n.a("neither openid & stdid found");
            return null;
        }
        k8n.a("stdid " + packageInfoB2.versionName + " supported new signing info");
        return b(context, str, 134217728);
    }

    public static PackageInfo b(Context context, String str, int i) throws PackageManager.NameNotFoundException {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException e2) {
            k8n.a("NameNotFoundException when getting " + str);
            if (s_c.equals(str) || "com.oplus.stdid".equals(str)) {
                return null;
            }
            throw e2;
        }
    }

    public static String c(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(gc0.SHA1);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                }
                return sb.toString();
            }
        } catch (NoSuchAlgorithmException e2) {
            k8n.b("1012", e2);
        } catch (Exception e3) {
            k8n.b("1083", e3);
        }
        return null;
    }

    public static String d(String str) {
        try {
            String str2 = new String(Base64.decode(str, 0));
            k8n.a("4025: ".concat(str2));
            return str2;
        } catch (Exception e2) {
            k8n.a("4025: " + e2.toString());
            return null;
        }
    }

    public static ArrayList e(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 8) == 8) {
            arrayList.add(OpenIDHelper.OUID);
            arrayList.add("OUID_STATUS");
        }
        if ((i & 32) == 32 && !arrayList.contains("OUID_STATUS")) {
            arrayList.add("OUID_STATUS");
        }
        if ((i & 2) == 2) {
            arrayList.add(OpenIDHelper.AUID);
        }
        if ((i & 16) == 16) {
            arrayList.add(OpenIDHelper.GUID);
        }
        if ((i & 1) == 1) {
            arrayList.add(OpenIDHelper.APID);
        }
        if ((i & 4) == 4) {
            arrayList.add(OpenIDHelper.DUID);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    public static void f(Context context, i8n i8nVar, String str) {
        try {
            byte b = 0;
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("cache", 0).edit();
            int iHashCode = str.hashCode();
            if (iHashCode != 2015626) {
                if (iHashCode != 2020431) {
                    if (iHashCode != 2109804) {
                        if (iHashCode == 2199177 && str.equals(OpenIDHelper.GUID)) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals(OpenIDHelper.DUID)) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(OpenIDHelper.AUID)) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (!str.equals(OpenIDHelper.APID)) {
                b = -1;
            }
            if (b == 0) {
                Pair pairA = j8n.a(d("U3RkSWRBcHBLZXk="), i8nVar.a.getBytes());
                if (pairA != null) {
                    editorEdit.putString(OpenIDHelper.APID, (String) pairA.first);
                    editorEdit.putLong("APID_TIME", i8nVar.b);
                    editorEdit.putString("APID_IV", (String) pairA.second);
                }
            } else if (b == 1) {
                Pair pairA2 = j8n.a(d("U3RkSWRBcHBLZXk="), i8nVar.a.getBytes());
                if (pairA2 != null) {
                    editorEdit.putString(OpenIDHelper.GUID, (String) pairA2.first);
                    editorEdit.putLong("GUID_TIME", i8nVar.b);
                    editorEdit.putString("GUID_IV", (String) pairA2.second);
                }
            } else if (b == 2) {
                editorEdit.putString(OpenIDHelper.AUID, i8nVar.a);
                editorEdit.putLong("AUID_TIME", i8nVar.b);
            } else if (b == 3) {
                editorEdit.putString(OpenIDHelper.DUID, i8nVar.a);
                editorEdit.putLong("DUID_TIME", i8nVar.b);
            }
            editorEdit.apply();
        } catch (IllegalStateException e2) {
            k8n.b("1019", e2);
        } catch (Exception e3) {
            k8n.b("1063", e3);
        }
    }

    public static void g(SharedPreferences sharedPreferences, ConcurrentHashMap concurrentHashMap, String str, String str2, String str3) {
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        String string = sharedPreferences.getString(str, null);
        long j2 = sharedPreferences.getLong(str2, 0L);
        String string2 = sharedPreferences.getString(str3, null);
        if (string == null || j2 == 0 || string2 == null) {
            return;
        }
        try {
            byte[] bArrC = j8n.c(d("U3RkSWRBcHBLZXk="), string, string2);
            if (bArrC != null) {
                concurrentHashMap.put(str, new i8n(new String(bArrC, "ISO-8859-1"), j2));
            }
        } catch (UnsupportedEncodingException e2) {
            k8n.b("1065", e2);
        } catch (Exception e3) {
            k8n.b("1066", e3);
        }
    }

    public static boolean h(Context context) {
        return Build.VERSION.SDK_INT >= 31 || i(context, "android").equals(i(context, "com.oplus.stdid"));
    }

    public static String i(Context context, String str) {
        Signature[] apkContentsSigners;
        ArrayList arrayList = new ArrayList();
        Signature[] signatureArr = null;
        if (context == null || TextUtils.isEmpty(str)) {
            k8n.a("getRawSignature context or packageName is empty");
        } else {
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageInfo packageInfoA = a(context, str);
                if (packageInfoA != null) {
                    k8n.a("getRawSignature processing by new way");
                    apkContentsSigners = packageInfoA.signingInfo.getApkContentsSigners();
                } else {
                    k8n.a("getRawSignature processing by old way");
                    apkContentsSigners = packageManager.getPackageInfo(str, 64).signatures;
                }
                signatureArr = apkContentsSigners;
            } catch (PackageManager.NameNotFoundException unused) {
                k8n.a("NameNotFoundException when getting " + str);
            } catch (Exception e2) {
                k8n.b("1059", e2);
            }
        }
        if (signatureArr == null) {
            return "";
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            for (Signature signature : signatureArr) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                try {
                    byte[] encoded = ((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getEncoded();
                    StringBuffer stringBuffer = new StringBuffer(encoded.length);
                    for (byte b : encoded) {
                        String hexString = Integer.toHexString(((char) b) & 255);
                        if (hexString.length() < 2) {
                            stringBuffer.append(0);
                        }
                        stringBuffer.append(hexString.toUpperCase());
                    }
                    String strJ = j(stringBuffer.toString());
                    if (!arrayList.contains(strJ)) {
                        arrayList.add(strJ);
                    }
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
            }
            if (arrayList.isEmpty()) {
                return "";
            }
            Collections.sort(arrayList);
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(",");
            }
            String strSubstring = sb.toString().substring(0, sb.toString().length() - 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return "";
            }
            return strSubstring.length() > 32 ? strSubstring.substring(0, 32) : strSubstring;
        } catch (IOException | CertificateException | Exception unused2) {
            return "";
        }
    }

    public static String j(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            k8n.b("1060", e2);
            messageDigest = null;
        } catch (Exception e3) {
            k8n.b("1061", e3);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return "";
        }
        messageDigest.update(str.getBytes());
        return String.format("%032x", new BigInteger(1, messageDigest.digest()));
    }

    public static String k(Context context, String str) {
        try {
            PackageInfo packageInfoA = a(context, str);
            if (packageInfoA == null) {
                k8n.a("getSingInfo processing by old way");
                return c(context.getPackageManager().getPackageInfo(str, 64).signatures[0]);
            }
            k8n.a("getSingInfo processing by new way");
            SigningInfo signingInfo = packageInfoA.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                return c(signingInfo.getApkContentsSigners()[0]);
            }
            k8n.a("getSingInfo processing rotation signature");
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return c(signingCertificateHistory[signingCertificateHistory.length - 1]);
        } catch (PackageManager.NameNotFoundException e2) {
            k8n.b("1011", e2);
            return null;
        } catch (Exception e3) {
            k8n.b("1082", e3);
            return null;
        }
    }

    public static void l(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            s_b = DeviceInfoCompat.DeviceType.WATCH;
        } else if (packageManager.hasSystemFeature("android.software.leanback")) {
            s_b = DeviceInfoCompat.DeviceType.TV;
        }
    }
}
