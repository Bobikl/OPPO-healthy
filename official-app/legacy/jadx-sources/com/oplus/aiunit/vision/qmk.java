package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.pay.opensdk.AreaConstants;

/* JADX INFO: loaded from: classes8.dex */
public class qmk {
    public static String a(Context context, String str, String str2) {
        String str3;
        String strA = yo6.c().a(context);
        String strC = AreaConstants.c(str2);
        strA.hashCode();
        switch (strA) {
            case "1":
                str3 = "test1";
                break;
            case "2":
                str3 = "gray";
                break;
            case "3":
                str3 = "test3";
                break;
            case "4":
                str3 = "dev";
                break;
            default:
                str3 = "release";
                break;
        }
        return AreaConstants.b(str3, strC) + str;
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        return a(context, str, str2);
    }
}
