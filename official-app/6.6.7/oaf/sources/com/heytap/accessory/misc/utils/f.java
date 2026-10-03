package com.heytap.accessory.misc.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.oplus.aiunit.vision.jtg;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class f {
    public static boolean a = true;
    public static final String b = "f";

    public static String a(int i) {
        if (i == 0) {
            return "D";
        }
        if (i == 1) {
            return "C";
        }
        if (i != 2) {
            return i != 3 ? "Z" : "A";
        }
        return "B";
    }

    public static String b() {
        Context context = PlatformUtils.getContext();
        if (context != null) {
            return jtg.a(context.getContentResolver(), "android_id");
        }
        return null;
    }

    public static String c() {
        if (PlatformUtils.getContext() != null) {
            return PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).getString("uniqueId", null);
        }
        com.heytap.accessory.base.logging.a.e(b, "failed to retrieve uniqueId");
        return null;
    }

    public static void d() {
        a = "OPPO".compareToIgnoreCase(Build.BRAND) == 0 || "OPPO".compareToIgnoreCase(Build.MANUFACTURER) == 0;
    }

    public static boolean e() {
        if (PlatformUtils.getContext() == null) {
            com.heytap.accessory.base.logging.a.e(b, "failed to storeUniqueId ");
            return false;
        }
        SharedPreferences.Editor editorEdit = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).edit();
        editorEdit.putString("uniqueId", PlatformUtils.sMyUniqueId);
        if (editorEdit.commit()) {
            com.heytap.accessory.base.logging.a.a(b, "UniqueId stored successfully ");
            return true;
        }
        com.heytap.accessory.base.logging.a.e(b, "failed to store UniqueId");
        return false;
    }

    public static String a() {
        int i;
        UnsupportedEncodingException e;
        int length;
        StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
        StringBuilder sbA2 = com.heytap.accessory.base.objectpool.a.a();
        try {
            try {
                com.heytap.accessory.base.logging.a.c(b, "Generating Peer ID for android version : " + PlatformUtils.sBuildVersion);
                String strB = b();
                if (strB == null || strB.length() == 0) {
                    i = 0;
                    length = 0;
                } else {
                    i = 2;
                    try {
                        length = strB.length() < 16 ? strB.length() : 16;
                        sbA.append(strB);
                    } catch (UnsupportedEncodingException e2) {
                        e = e2;
                        com.heytap.accessory.base.logging.a.e(b, "generateUniqueId Exception:" + e);
                    }
                }
                int i2 = 31 - length;
                if (i2 > 0) {
                    String string = UUID.nameUUIDFromBytes(String.valueOf(System.currentTimeMillis()).getBytes("UTF-8")).toString();
                    if (string != null) {
                        string = string.replaceAll("-", "");
                    }
                    if (string != null) {
                        sbA.append((CharSequence) string, 0, i2);
                    }
                }
            } catch (UnsupportedEncodingException e3) {
                i = 0;
                e = e3;
            }
            sbA2.append(PlatformUtils.PEERID_PREFIX);
            sbA2.append(a(i));
            sbA2.append(sbA.toString().toUpperCase());
            return sbA2.toString();
        } finally {
            com.heytap.accessory.base.objectpool.a.a(sbA);
            com.heytap.accessory.base.objectpool.a.a(sbA2);
        }
    }
}
