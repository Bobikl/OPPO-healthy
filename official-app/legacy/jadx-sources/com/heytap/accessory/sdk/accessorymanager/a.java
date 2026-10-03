package com.heytap.accessory.sdk.accessorymanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.heytap.accessory.misc.utils.PlatformUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@SuppressLint({"UseSparseArrays"})
public class a {
    public static final String a = "a";
    public static Map<Integer, C0251a> b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.heytap.accessory.sdk.accessorymanager.a$a, reason: collision with other inner class name */
    public static class C0251a {
        public int a = 0;

        public C0251a(String str) {
        }
    }

    public static void a(Context context, String str, byte b2, String str2, String str3) {
        String str4 = str3 + ":" + ((int) b2) + ":" + str2;
        String str5 = a;
        com.heytap.accessory.base.logging.a.c(str5, "packageName = " + str3 + " mapKey = " + ((int) b2) + " deviceLimit = " + str2);
        if (b.containsKey(Integer.valueOf(b2))) {
            com.heytap.accessory.base.logging.a.e(str5, "Similar Policy already present in local cache!!");
            return;
        }
        C0251a c0251a = new C0251a(str2);
        SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0);
        String strA = a(str, sharedPreferences);
        if (strA != null && !strA.isEmpty()) {
            str4 = strA + "_" + str4;
        }
        b.put(Integer.valueOf(b2), c0251a);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, str4);
        editorEdit.apply();
        Log.d(str5, "sPolicyMap: mapKey = " + ((int) b2) + " val = " + str4);
        Log.d(str5, "Policy stored in shared prefs successfully!! ");
    }

    public static void b(int i) {
        b.remove(Integer.valueOf(i));
    }

    public static String a(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(str, null);
    }

    public static void a(Context context) {
        String string = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).getString("CMPolicy", null);
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "policyContent: " + string);
        if (string != null && !string.isEmpty()) {
            for (String str2 : string.split("_")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length >= 2) {
                    try {
                        b.put(Integer.valueOf(Integer.parseInt(strArrSplit[1])), new C0251a(strArrSplit[2]));
                    } catch (NumberFormatException unused) {
                        com.heytap.accessory.base.logging.a.e(a, "parse error:" + Integer.parseInt(strArrSplit[1]));
                    }
                }
            }
            return;
        }
        com.heytap.accessory.base.logging.a.c(str, "No entry found for CMPolicy in Shared Prefs");
    }

    public static void a(String str, Context context) {
        SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0);
        String string = sharedPreferences.getString("CMPolicy", null);
        if (string != null && !string.isEmpty()) {
            String[] strArrSplit = string.split("_");
            int i = 0;
            while (true) {
                if (i >= strArrSplit.length) {
                    i = -1;
                    break;
                }
                String[] strArrSplit2 = strArrSplit[i].split(":");
                if (strArrSplit2[0].equals(str)) {
                    b(Integer.parseInt(strArrSplit2[1]));
                    break;
                }
                i++;
            }
            if (i != -1) {
                StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    if (i2 != i) {
                        if (i2 != strArrSplit.length - 1 && (i2 != strArrSplit.length - 2 || i != strArrSplit.length - 1)) {
                            sbA.append(strArrSplit[i2]);
                            sbA.append("_");
                        } else {
                            sbA.append(strArrSplit[i2]);
                        }
                    }
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("CMPolicy", sbA.toString());
                editorEdit.apply();
                com.heytap.accessory.base.logging.a.a(a, "Policy stored in shared prefs successfully after deletion!! ");
                return;
            }
            com.heytap.accessory.base.logging.a.e(a, "Cannot remove as no entry found for package: " + str);
            return;
        }
        com.heytap.accessory.base.logging.a.c(a, "Shared Prefs is empty for CMPolicy");
    }

    public static int a(byte b2, int i, int i2) {
        if (!a(i2)) {
            return -2;
        }
        C0251a c0251a = b.get(Integer.valueOf(b2));
        if (c0251a == null) {
            return -1;
        }
        c0251a.a = i;
        b.put(Integer.valueOf(b2), c0251a);
        return i;
    }

    public static int a(byte b2, int i) {
        if (!a(i)) {
            return -2;
        }
        C0251a c0251a = b.get(Integer.valueOf(b2));
        if (c0251a != null) {
            return c0251a.a;
        }
        com.heytap.accessory.base.logging.a.b(a, "getConnections(): Map object returned as null for the key:" + ((int) b2));
        return -1;
    }

    public static boolean a(int i) {
        com.heytap.accessory.base.logging.a.c(a, "Policy not supported!! for Connectivity : " + i);
        return false;
    }
}
