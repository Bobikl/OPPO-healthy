package com.oplus.aiunit.vision;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.BatteryManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.google.gson.JsonObject;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import com.oplus.smartenginehelper.ParserTag;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pnm extends qnm {
    public boolean a = false;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15417c = 0;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15418e = "";
    public int f = -1;
    public String g = "";
    public String h = "";
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15419j = "0";
    public String k = "";

    @Override // com.oplus.aiunit.vision.qnm
    public void a(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("debuggable", Boolean.valueOf(this.a));
        jsonObject2.addProperty("roSecure", Integer.valueOf(this.b));
        jsonObject2.addProperty("roAdbSecure", Integer.valueOf(this.f15417c));
        jsonObject2.addProperty("development", Boolean.valueOf(this.d));
        jsonObject2.addProperty("accessibility", this.f15418e);
        jsonObject2.addProperty("simState", Integer.valueOf(this.f));
        jsonObject2.addProperty("simOperator", this.g);
        jsonObject2.addProperty("usbState", this.h);
        jsonObject2.addProperty("battery", Integer.valueOf(this.i));
        jsonObject2.addProperty(TriggerEvent.EXTRA_UID, this.f15419j);
        jsonObject2.addProperty("apkSign", this.k);
        jsonObject.add("EnvInfo", jsonObject2);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a5  */
    @Override // com.oplus.aiunit.vision.qnm
    public boolean b(Context context) {
        Signature[] signatureArr;
        this.a = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Class<?> cls2 = Integer.TYPE;
            int iIntValue = ((Integer) cls.getMethod("getInt", String.class, cls2).invoke(cls, "ro.secure", -1)).intValue();
            this.b = iIntValue;
            if (iIntValue != 0) {
                this.b = ((Integer) cls.getMethod("getInt", String.class, cls2).invoke(cls, "ro.adb.secure", -1)).intValue();
            }
        } catch (Exception e2) {
            gnm.a(e2.toString());
            this.b = -1;
        }
        try {
            Class<?> cls3 = Class.forName("android.os.SystemProperties");
            this.f15417c = ((Integer) cls3.getMethod("getInt", String.class, Integer.TYPE).invoke(cls3, "ro.adb.secure", -1)).intValue();
        } catch (Exception e3) {
            gnm.a(e3.toString());
            this.f15417c = -1;
        }
        this.d = Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 1;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1);
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            this.f15418e += enabledAccessibilityServiceList.get(i).getResolveInfo().serviceInfo.packageName;
            if (i < enabledAccessibilityServiceList.size() - 1) {
                this.f15418e += ",";
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f = telephonyManager.getSimState();
        this.g = telephonyManager.getSimOperator();
        try {
            Class<?> cls4 = Class.forName("android.os.SystemProperties");
            this.h = (String) cls4.getDeclaredMethod(ParserTag.TAG_GET, String.class).invoke(cls4, "sys.usb.config");
        } catch (Exception e4) {
            gnm.a(e4.toString());
        }
        this.i = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String strSubstring = "";
        if (absolutePath.startsWith("/data/user/")) {
            String strReplace = absolutePath.replace("/data/user/", "");
            if (strReplace.indexOf("/") > 0) {
                this.f15419j = strReplace.substring(0, strReplace.indexOf("/"));
            }
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(fnm.c_a)) {
            ArrayList arrayList = new ArrayList();
            if (packageName == null || packageName.length() == 0) {
                signatureArr = null;
            } else {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                    if (packageInfo == null) {
                        signatureArr = null;
                    } else {
                        signatureArr = packageInfo.signatures;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (signatureArr != null && signatureArr.length != 0) {
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
                            String strA = fnm.a(stringBuffer.toString());
                            if (!arrayList.contains(strA)) {
                                arrayList.add(strA);
                            }
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            byteArrayInputStream.close();
                            throw th;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Collections.sort(arrayList);
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        StringBuilder sb = new StringBuilder();
                        for (String str : strArr) {
                            sb.append(str);
                            sb.append(",");
                        }
                        String strSubstring2 = sb.toString().substring(0, sb.toString().length() - 1);
                        if (!TextUtils.isEmpty(strSubstring2)) {
                            strSubstring = strSubstring2.length() > 32 ? strSubstring2.substring(0, 32) : strSubstring2;
                        }
                    }
                } catch (IOException | CertificateException | Exception unused2) {
                }
            }
            fnm.c_a = strSubstring;
        }
        this.k = fnm.c_a;
        return false;
    }
}
