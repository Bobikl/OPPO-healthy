package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.health.voiceassistant.VAM;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.upgrade.UpgradeSDK;
import com.heytap.wearable.support.watchface.common.Constants;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes19.dex */
public class rqk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f16316e;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Locale b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16315c = null;
    public static int d = -1;
    public static String f = "";

    public class a implements PackageManager$OnChecksumsReadyListener {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ Lock b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Condition f16317c;

        public a(String[] strArr, Lock lock, Condition condition) {
            this.a = strArr;
            this.b = lock;
            this.f16317c = condition;
        }

        public void onChecksumsReady(List<ApkChecksum> list) {
            this.a[0] = rqk.w(oqk.a(list.get(0)).getValue());
            try {
                this.b.tryLock();
                this.f16317c.signal();
            } finally {
                this.b.unlock();
            }
        }
    }

    public static void a(File file) {
        if (file == null || !file.exists()) {
            u6b.b("upgrade_Util", file.getAbsolutePath() + " 不存在");
            return;
        }
        u6b.b("upgrade_Util", "delete base package, path=" + file.getAbsolutePath());
        file.delete();
    }

    public static Context b() {
        return f16316e;
    }

    public static int c() {
        int iIntValue;
        String str;
        String str2;
        int i = d;
        if (i >= 0) {
            return i;
        }
        try {
            if (Build.VERSION.SDK_INT <= 29) {
                str = "com." + vye.d() + ".os.ColorBuild";
                str2 = ParserTag.TAG_GET + vye.e() + "VERSION";
            } else {
                str = "com.oplus.os.OplusBuild";
                str2 = "getOplusOSVERSION";
            }
            iIntValue = ((Integer) lkf.f(lkf.a(str), str2, null, null)).intValue();
        } catch (Throwable unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            try {
                String strH = h();
                if (strH.startsWith("V1.4")) {
                    return 3;
                }
                if (strH.startsWith(Constants.HeyBuildVersion.V2_0)) {
                    return 4;
                }
                if (strH.startsWith("V2.1")) {
                    return 5;
                }
            } catch (Throwable unused2) {
            }
        }
        d = iIntValue;
        return iIntValue;
    }

    public static Locale d(Context context) {
        if (b == null) {
            try {
                b = context.getResources().getConfiguration().locale;
            } catch (Throwable unused) {
            }
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00aa: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:39:0x00aa */
    public static String e(File file) throws Throwable {
        FileInputStream fileInputStream;
        InputStream inputStream;
        StringBuilder sb;
        byte[] bArr = new byte[8192];
        InputStream inputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                    }
                    String strW = w(messageDigest.digest());
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e6b.a("upgrade_Util", "getMD5 failed : " + e2.getMessage());
                    }
                    return strW;
                } catch (Exception e3) {
                    e = e3;
                    u6b.a("getMd5Exception:" + e.getMessage());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                            sb = new StringBuilder();
                            sb.append("getMD5 failed : ");
                            sb.append(e.getMessage());
                            e6b.a("upgrade_Util", sb.toString());
                            return null;
                        }
                    }
                    return null;
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    u6b.a("getMd5OutOfMemoryError:" + e.getMessage());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            e = e6;
                            sb = new StringBuilder();
                            sb.append("getMD5 failed : ");
                            sb.append(e.getMessage());
                            e6b.a("upgrade_Util", sb.toString());
                            return null;
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        e6b.a("upgrade_Util", "getMD5 failed : " + e7.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (OutOfMemoryError e9) {
            e = e9;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public static String f(String str, File file) {
        String[] strArr = {""};
        if (Build.VERSION.SDK_INT >= 31) {
            ReentrantLock reentrantLock = new ReentrantLock();
            Condition conditionNewCondition = reentrantLock.newCondition();
            try {
                try {
                    b().getPackageManager().requestChecksums(str, false, 2, PackageManager.TRUST_ALL, new a(strArr, reentrantLock, conditionNewCondition));
                    reentrantLock.tryLock();
                    conditionNewCondition.await(60L, TimeUnit.SECONDS);
                } catch (PackageManager.NameNotFoundException | InterruptedException | CertificateEncodingException e2) {
                    e2.printStackTrace();
                }
            } finally {
                reentrantLock.unlock();
            }
        } else {
            strArr[0] = e(file);
        }
        return strArr[0];
    }

    public static String g(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            e6b.a("upgrade_Util", "getMD5 failed : " + e2.getMessage());
            return String.valueOf(Arrays.hashCode(bArr));
        }
    }

    public static String h() {
        if (TextUtils.isEmpty(f)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f = (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, vye.g(), "0");
            } catch (Exception e2) {
                e6b.a("upgrade_Util", "getMobileRomVersion failed : " + e2.getMessage());
            }
        }
        return f;
    }

    public static PackageInfo i(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            u6b.a("getPackageInfo(" + str + ") NameNotFoundException " + e2);
            return null;
        }
    }

    public static String j(Context context) {
        return context.getPackageName();
    }

    public static String k(Context context) {
        String strA = "";
        try {
            strA = ffb.a(context, "upgrade_product_code");
            if (Integer.parseInt(strA) < 10) {
                int length = strA.length();
                for (int i = 0; i < 3 - length; i++) {
                    strA = "0" + strA;
                }
            }
        } catch (Exception e2) {
            e6b.a("upgrade_Util", "getProductCode failed : " + e2.getMessage());
        }
        return strA;
    }

    public static String l(String str) {
        return "com.nearme.instant.platform".equals(str) ? "58" : k(b());
    }

    public static String m(Context context) {
        if (f16315c == null) {
            String strU = u(context);
            f16315c = strU;
            if (strU == null || "".equals(strU.trim())) {
                Locale localeD = d(context);
                if (localeD != null) {
                    f16315c = localeD.getCountry();
                }
                String str = f16315c;
                if (str == null || "".equals(str.trim())) {
                    f16315c = "CN";
                }
            }
        }
        return f16315c;
    }

    public static String n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    public static String o(String str, String str2) {
        return (String) lkf.f(lkf.a("android.os.SystemProperties"), ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{str, str2});
    }

    public static boolean p(long j2) {
        UpgradeSDK upgradeSDK = UpgradeSDK.instance;
        if (upgradeSDK.getInitParam() == null || upgradeSDK.getInitParam().b() == null) {
            return false;
        }
        File fileB = upgradeSDK.getInitParam().b();
        if (!fileB.exists()) {
            fileB.mkdirs();
        }
        StatFs statFs = new StatFs(fileB.getPath());
        return j2 < ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    public static boolean q() {
        String strH = h();
        return !TextUtils.isEmpty(strH) && (strH.startsWith(VAM.STREAM_ALGORITHM_VERSION) || strH.startsWith("V3"));
    }

    public static boolean r() {
        if (f16316e == null) {
            return false;
        }
        return p04.DEBUG;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT > 29 && c() > 21;
    }

    public static String t(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb.append(key);
                sb.append(HttpUtils.EQUAL_SIGN);
                sb.append(value);
                sb.append("\t");
            }
            try {
                return Base64.encodeToString(sb.toString().getBytes("UTF-8"), 0);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static String u(Context context) {
        String strO;
        String country;
        if (context == null) {
            return "";
        }
        String strB = gq5.b(context);
        if (!s()) {
            if (TextUtils.isEmpty(strB) || !strB.trim().equalsIgnoreCase(vye.b())) {
                strO = o(vye.f(), "CN");
                if ("oc".equalsIgnoreCase(strO) && !context.getPackageManager().hasSystemFeature(vye.i())) {
                    return "CN";
                }
            } else {
                strO = o("persist.sys.oem.region", "CN");
                if ("OverSeas".equalsIgnoreCase(strO)) {
                    country = context.getResources().getConfiguration().locale.getCountry();
                    if ("CN".equalsIgnoreCase(country)) {
                        country = "OC";
                    }
                }
            }
            return strO;
        }
        country = o("persist.sys.oplus.region", "CN");
        if ("oc".equalsIgnoreCase(country)) {
            return "CN";
        }
        return country;
    }

    public static void v(Context context) {
        f16316e = context.getApplicationContext();
    }

    public static String w(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
