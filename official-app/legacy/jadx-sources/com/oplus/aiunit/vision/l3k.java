package com.oplus.aiunit.vision;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class l3k {
    public static final String[] interceptPerms = new String[0];

    public static String[] a(String[] strArr) {
        if (!g3k.x() || interceptPerms.length == 0) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if (!b(str)) {
                    arrayList.add(str);
                }
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    public static boolean b(String str) {
        for (String str2 : interceptPerms) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
