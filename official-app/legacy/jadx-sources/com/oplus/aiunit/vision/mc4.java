package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes19.dex */
public class mc4 {
    public static String a() {
        String str = "k_max_count" + x05.j(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append("getMaxK | k is ");
        sb.append(str);
        return str;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("xCrash_" + gxe.c(), 0);
    }

    public static int c(Context context) {
        return b(context).getInt(a(), 0);
    }

    public static void d(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("record() called with: context = [");
        sb.append(context);
        sb.append("], backtrace = [");
        sb.append(str);
        sb.append("]");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        SharedPreferences sharedPreferencesB = b(context);
        String strD = vbb.d(strE);
        int i = sharedPreferencesB.getInt(strD, 0);
        int i2 = i + 1;
        sharedPreferencesB.edit().putInt(strD, i2).commit();
        int i3 = sharedPreferencesB.getInt(a(), 0);
        a7b.f("CrashRecorder", strE + " \n" + strD + ", count is " + i + ", maxCount is " + i3);
        if (i >= i3) {
            sharedPreferencesB.edit().putInt(a(), i2).commit();
        }
    }

    public static String e(String str) {
        int iIndexOf;
        String[] strArrSplit = str.split(Weather.SEPARATOR);
        if (strArrSplit.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (TextUtils.isEmpty(str2) || !str2.trim().startsWith("#00")) {
                if (TextUtils.isEmpty(str2) || !str2.trim().startsWith("#01")) {
                    if (TextUtils.isEmpty(str2) || !str2.trim().startsWith("#02")) {
                        if (!TextUtils.isEmpty(str2) && str2.trim().startsWith("#03")) {
                            break;
                        }
                    } else {
                        sb.append(str2);
                    }
                } else {
                    sb.append(str2);
                }
            } else {
                sb.append(str2);
            }
        }
        return (!TextUtils.isEmpty(sb.toString()) && (iIndexOf = sb.indexOf("/")) > 0) ? sb.substring(iIndexOf) : "";
    }
}
