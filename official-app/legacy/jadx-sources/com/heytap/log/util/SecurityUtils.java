package com.heytap.log.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.ISimpleLog;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.store.base.core.http.HttpUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class SecurityUtils {
    private static final String TAG = "com.heytap.log.util.SecurityUtils";

    private static String binToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 255) < 16) {
                sb.append("0");
            }
            sb.append(Long.toString(bArr[i] & 255, 16));
        }
        return sb.toString();
    }

    private static byte[] byteMerger(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            Log.e("SecurityUtils", "log zip file is null");
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static String getHmacSHA1(byte[] bArr, String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str.getBytes("UTF-8"), mac.getAlgorithm()));
            return binToHex(mac.doFinal(bArr));
        } catch (Exception e2) {
            throw new RuntimeException("HMAC-SHA1 encode error", e2);
        }
    }

    private static String getUrlParamStr(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            sb.append(str);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(map.get(str));
            sb.append("&");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static String makeSignature(String str, String str2, long j2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ISimpleLog iSimpleLog) {
        HashMap map = new HashMap();
        map.put(LogSenderConst.SPECIFICID, str);
        map.put(LogSenderConst.REPORTREASON, str2);
        map.put("ts", String.valueOf(j2));
        map.put(LogSenderConst.BUSINESSVERSION, AppUtil.getAppVersionName(AppUtil.getAppContext()));
        map.put(LogSenderConst.PROTOCOLVERSION, "3");
        map.put("errorCode", String.valueOf(i));
        map.put(LogSenderConst.SUBTYPE, str3);
        map.put("brand", DeviceUtil.getPhoneBrand());
        map.put("model", Build.MODEL);
        map.put("osVersion", DeviceUtil.getOsVersion());
        map.put("romVersion", DeviceUtil.getMobileRomVersion());
        map.put("androidVersion", Build.VERSION.RELEASE);
        map.put("imei", str4.replace("%23", "#"));
        map.put("openId", str5.replace("%23", "#"));
        map.put("tracePkg", str6);
        map.put(LogSenderConst.Program, str7);
        if (!TextUtils.isEmpty(str8)) {
            map.put(LogSenderConst.FILENAME, str8);
        }
        if (!TextUtils.isEmpty(str9)) {
            map.put("errorMsg", str9);
        }
        String str12 = str10 + File.separator + str8;
        String urlParamStr = getUrlParamStr(map);
        iSimpleLog.d("NearX-HLog", "签名生成空格替换前参数: " + urlParamStr + "url: " + str12);
        String strReplaceAll = urlParamStr.replaceAll(" ", "_");
        String hmacSHA1 = getHmacSHA1(byteMerger(strReplaceAll.getBytes(), FileUtil.File2byte(str12)), str11);
        iSimpleLog.d("NearX-HLog", "签名生成空格替换后参数: " + strReplaceAll + "url: " + str12 + "\n sign: " + hmacSHA1);
        return hmacSHA1;
    }
}
