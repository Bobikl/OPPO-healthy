package com.unionpay.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.connect.cipher.AESUtil;
import com.oplus.aiunit.vision.gc0;
import com.oplus.aiunit.vision.ozm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static HashMap a = new c();

    public static int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    public static String b(Context context) {
        String str;
        int i;
        String strC = UPUtils.c(context, "configs");
        String strC2 = UPUtils.c(context, "mode");
        String strC3 = UPUtils.c(context, "or");
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2) || TextUtils.isEmpty(strC3)) {
            str = "";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                String strB = ozm.b(jSONObject, "sign");
                try {
                    i = Integer.parseInt(strC2);
                } catch (Exception unused) {
                    i = 0;
                }
                str = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str2 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                String strI = i(UPUtils.d(str + str2 + strC3));
                String strB2 = UPUtils.b(i, strB);
                if (TextUtils.isEmpty(strB2) || !strB2.equals(strI)) {
                    str = "";
                }
            } catch (Exception unused2) {
            }
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object objA = ozm.a(jSONArray, i2);
                if (objA != null) {
                    JSONObject jSONObject2 = (JSONObject) objA;
                    if ("app".equals(ozm.b(jSONObject2, "type"))) {
                        return new String(Base64.decode(ozm.b(jSONObject2, "ca"), 2));
                    }
                }
            }
        } catch (Exception unused3) {
        }
        return "";
    }

    public static String c(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static boolean e() {
        try {
            return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean f(Context context, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = null;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && !TextUtils.isEmpty(str)) {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
            } catch (Exception unused) {
            }
        }
        return packageInfo != null;
    }

    public static boolean g(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    int iN = n(context, str);
                    int iO = o(str3);
                    if (f(context, str) && iN >= iO && str2.equalsIgnoreCase(h(context, str, gc0.SHA256))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0049  */
    /* JADX WARN: Code duplicated, block: B:35:0x0050 A[Catch: NoSuchAlgorithmException | CertificateEncodingException -> 0x005e, Exception -> 0x006b, TRY_LEAVE, TryCatch #2 {NoSuchAlgorithmException | CertificateEncodingException -> 0x005e, blocks: (B:33:0x004a, B:35:0x0050), top: B:48:0x004a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0064 A[Catch: Exception -> 0x006b, TRY_LEAVE, TryCatch #1 {Exception -> 0x006b, blocks: (B:4:0x0005, B:9:0x000f, B:15:0x001b, B:17:0x001f, B:19:0x0022, B:21:0x0027, B:22:0x0030, B:28:0x003e, B:33:0x004a, B:35:0x0050, B:40:0x0064, B:38:0x005f, B:31:0x0046, B:25:0x0038, B:12:0x0015), top: B:46:0x0005, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String h(Context context, String str, String str2) {
        PackageManager packageManager;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        Signature signature;
        ByteArrayInputStream byteArrayInputStream;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        MessageDigest messageDigest;
        String strD = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        if (packageManager != null) {
            try {
                packageInfo = packageManager.getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                packageInfo = null;
            }
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                try {
                    certificateFactory = CertificateFactory.getInstance("X509");
                } catch (CertificateException e3) {
                    e3.printStackTrace();
                    certificateFactory = null;
                }
                if (certificateFactory != null) {
                    try {
                        x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                    } catch (CertificateException e4) {
                        e4.printStackTrace();
                        x509Certificate = null;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance(str2);
                        if (x509Certificate != null) {
                            strD = d(messageDigest.digest(x509Certificate.getEncoded()));
                        }
                    } catch (NoSuchAlgorithmException | CertificateEncodingException e5) {
                        e5.printStackTrace();
                    }
                    if (strD != null) {
                        return strD.replaceAll(":", "");
                    }
                } else {
                    x509Certificate = null;
                    messageDigest = MessageDigest.getInstance(str2);
                    if (x509Certificate != null) {
                        strD = d(messageDigest.digest(x509Certificate.getEncoded()));
                    }
                    if (strD != null) {
                        return strD.replaceAll(":", "");
                    }
                }
            }
        } else {
            packageInfo = null;
            if (packageInfo != null) {
                byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                certificateFactory = CertificateFactory.getInstance("X509");
                if (certificateFactory != null) {
                    x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                    messageDigest = MessageDigest.getInstance(str2);
                    if (x509Certificate != null) {
                        strD = d(messageDigest.digest(x509Certificate.getEncoded()));
                    }
                    if (strD != null) {
                        return strD.replaceAll(":", "");
                    }
                } else {
                    x509Certificate = null;
                    messageDigest = MessageDigest.getInstance(str2);
                    if (x509Certificate != null) {
                        strD = d(messageDigest.digest(x509Certificate.getEncoded()));
                    }
                    if (strD != null) {
                        return strD.replaceAll(":", "");
                    }
                }
            }
        }
        return "";
    }

    public static String i(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = AESUtil.HEX.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (byte b : str.getBytes()) {
            sb.append(charArray[(b & 240) >> 4]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString().trim();
    }

    public static String j(Context context, String str) {
        return h(context, str, gc0.SHA1);
    }

    public static String k(String str) {
        return !TextUtils.isEmpty((CharSequence) a.get(str)) ? (String) a.get(str) : str;
    }

    public static String l(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String m(String str) {
        if (str == null) {
            return "";
        }
        try {
            return Pattern.compile("[\":,\\[\\]{}]").matcher(str).replaceAll("").trim();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int n(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int o(String str) {
        try {
            return Integer.valueOf(str, 10).intValue();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }
}
