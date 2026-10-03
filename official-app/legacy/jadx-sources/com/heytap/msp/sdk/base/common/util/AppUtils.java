package com.heytap.msp.sdk.base.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.log.MspLog;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes19.dex */
public class AppUtils {
    private static final String APP_ID = "com.heytap.msp.client.appid";
    private static final String TAG = "AppUtils";
    private static final int TARGET_SIGN_LENGTH = 32;
    private static volatile String mAppId;

    public static String getAppId() {
        Context context = BaseSdkAgent.getInstance().getContext();
        return context != null ? getAppId(context) : "";
    }

    public static String getAppVersionByPackageName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e2) {
            MspLog.e("AppUtils", "getAppVersionByPackageName: " + e2.getMessage());
            return "";
        }
    }

    public static int getAppVersionCodeByPackageName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e2) {
            MspLog.e("AppUtils", "getAppVersionCodeByPackageName: " + e2.getMessage());
            return 0;
        }
    }

    public static int getMspAppVersionCode(Context context) {
        int appVersionCodeByPackageName = getAppVersionCodeByPackageName(context, "com.heytap.htms");
        if (appVersionCodeByPackageName != 0) {
            return appVersionCodeByPackageName;
        }
        String mspVersionInfoFromMsp = getMspVersionInfoFromMsp(0);
        return !TextUtils.isEmpty(mspVersionInfoFromMsp) ? Integer.valueOf(mspVersionInfoFromMsp).intValue() : appVersionCodeByPackageName;
    }

    public static String getMspAppVersionName(Context context) {
        String appVersionByPackageName = getAppVersionByPackageName(context, "com.heytap.htms");
        return TextUtils.equals(appVersionByPackageName, "") ? getMspVersionInfoFromMsp(1) : appVersionByPackageName;
    }

    private static String getMspVersionInfoFromMsp(int i) {
        String[] strArrSplit;
        try {
            String mspVersionInfo = BaseSdkAgent.getInstance().getMspVersionInfo();
            return (TextUtils.isEmpty(mspVersionInfo) || (strArrSplit = mspVersionInfo.split("\\|")) == null || strArrSplit.length < 2) ? "" : strArrSplit[i];
        } catch (Exception e2) {
            MspLog.e("AppUtils", "getMspVersionInfoFromMsp: " + e2.getMessage());
            return "";
        }
    }

    public static String getPackageName() {
        Context context = BaseSdkAgent.getInstance().getContext();
        return context != null ? getPackageName(context) : "";
    }

    public static Signature[] getRawSignature(Context context, String str) {
        if (str != null && context != null && str.length() != 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo == null) {
                    return null;
                }
                return packageInfo.signatures;
            } catch (Exception e2) {
                MspLog.e("AppUtils", "getRawSignature: " + e2.getMessage());
            }
        }
        return null;
    }

    public static String getSignFormPackage(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        Signature[] rawSignature = getRawSignature(context, str);
        if (rawSignature != null) {
            try {
                if (rawSignature.length != 0) {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    for (Signature signature : rawSignature) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                        try {
                            String strMd5Digest = Md5Util.md5Digest(Md5Util.byteToHexString(((X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream)).getEncoded()));
                            if (!arrayList.contains(strMd5Digest)) {
                                arrayList.add(strMd5Digest);
                            }
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    Collections.sort(arrayList);
                    String strJoin = StringUtils.join((String[]) arrayList.toArray(new String[0]), ",");
                    if (TextUtils.isEmpty(strJoin)) {
                        return "";
                    }
                    return strJoin.length() > 32 ? strJoin.substring(0, 32) : strJoin;
                }
            } catch (IOException | CertificateException unused) {
            }
        }
        return "";
    }

    public static boolean hasComponentEnabled(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 512);
            if (applicationInfo != null) {
                return applicationInfo.enabled;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            MspLog.d("AppUtils", "hasComponentEnabled getApplicationInfo error: " + e2.getMessage());
            return true;
        }
    }

    private static boolean isPkgAvailable(@NonNull Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            MspLog.e("AppUtils", "isPkgAvailable: " + e2.getMessage());
            return false;
        }
    }

    public static void unInstallAppByPkg(Context context, String str) {
        if (!isPkgAvailable(context, str)) {
            MspLog.iIgnore("AppUtils", " unInstall pkg " + str + " is not available");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        context.startActivity(intent);
    }

    public static String getAppId(Context context) {
        if (mAppId == null) {
            Bundle bundle = context.getApplicationInfo().metaData;
            if (bundle != null) {
                Object obj = bundle.get(APP_ID);
                if (obj != null) {
                    mAppId = obj.toString();
                } else {
                    mAppId = "";
                    MspLog.e("AppUtils", "APP SDK found an invalid AppID: null. \n");
                }
            } else {
                mAppId = "";
                MspLog.e("AppUtils", "APP SDK could not found <meta-data>");
            }
        }
        return mAppId;
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }
}
