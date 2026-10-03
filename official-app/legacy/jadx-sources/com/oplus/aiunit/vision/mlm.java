package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class mlm {
    public static final String a = "mlm";

    public static int a(Context context, String str) {
        int i = 0;
        try {
            i = context.getPackageManager().getApplicationInfo(str, 128).uid;
            Log.d(a, "uid end");
            return i;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return i;
        }
    }

    public static String b(Context context, String str, String str2) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            if (bundle == null) {
                Log.e(a, "target meta-data was null");
                return "";
            }
            Set<String> setKeySet = bundle.keySet();
            boolean z = bundle.getBoolean("com.oplus.ocs.support_middleware");
            for (String str3 : setKeySet) {
                if (str3.endsWith(str2)) {
                    String string = bundle.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        if (!z) {
                            return string;
                        }
                        String[] strArrSplit = string.split(";");
                        if (strArrSplit.length != 1) {
                            if (strArrSplit.length <= 1) {
                                break;
                            }
                            for (String str4 : strArrSplit) {
                                String[] strArrSplit2 = str4.split(" ");
                                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(str)) {
                                    return str4.substring(str.length() + 1);
                                }
                            }
                            break;
                        }
                        return strArrSplit[0].substring(str.length() + 1);
                    }
                    break;
                }
            }
            return "";
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(a, String.format("Unable to fetch metadata from teh manifest %s", e2.getMessage()));
            return "";
        }
    }
}
