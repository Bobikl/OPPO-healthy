package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class fbl {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 2) {
            ltl.b("WatchFaceKeyChecker", "[checkWatchFaceKey] --> split.length !=2");
            return false;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        ltl.b("WatchFaceKeyChecker", "[checkWatchFaceKey] --> TextUtils.isEmpty(packageName)||TextUtils.isEmpty(serviceName)");
        return false;
    }

    public static ComponentName b(String str) {
        if (a(str)) {
            String[] strArrSplit = str.split("/");
            return new ComponentName(strArrSplit[0], strArrSplit[1]);
        }
        ltl.b("WatchFaceKeyChecker", "[convertWatchFaceKey] --> convertWatchFaceKey null");
        return null;
    }
}
