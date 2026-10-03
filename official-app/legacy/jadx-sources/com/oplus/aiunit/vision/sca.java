package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class sca {
    public static final HashMap<Integer, String> a;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        a = map;
        map.put(32768, "FLAG_ACTIVITY_CLEAR_TASK");
        map.put(536870912, "FLAG_ACTIVITY_SINGLE_TOP");
        map.put(4194304, "FLAG_ACTIVITY_BROUGHT_TO_FRONT");
        map.put(67108864, "FLAG_ACTIVITY_CLEAR_TOP");
        map.put(8388608, "FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS");
        map.put(33554432, "FLAG_ACTIVITY_FORWARD_RESULT");
        map.put(1048576, "FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY");
        map.put(134217728, "FLAG_ACTIVITY_MULTIPLE_TASK");
        map.put(524288, "FLAG_ACTIVITY_NEW_DOCUMENT");
        map.put(268435456, "FLAG_ACTIVITY_NEW_TASK");
        map.put(65536, "FLAG_ACTIVITY_NO_ANIMATION");
        map.put(1073741824, "FLAG_ACTIVITY_NO_HISTORY");
        map.put(262144, "FLAG_ACTIVITY_NO_USER_ACTION");
        map.put(16777216, "FLAG_ACTIVITY_PREVIOUS_IS_TOP");
        map.put(131072, "FLAG_ACTIVITY_REORDER_TO_FRONT");
        map.put(2097152, "FLAG_ACTIVITY_RESET_TASK_IF_NEEDED");
        map.put(8192, "FLAG_ACTIVITY_RETAIN_IN_RECENTS");
        map.put(16384, "FLAG_ACTIVITY_TASK_ON_HOME");
        map.put(8, "FLAG_DEBUG_LOG_RESOLUTION");
        map.put(16, "FLAG_EXCLUDE_STOPPED_PACKAGES");
        map.put(4, "FLAG_FROM_BACKGROUND");
        map.put(64, "FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
        map.put(128, "FLAG_GRANT_PREFIX_URI_PERMISSION");
        map.put(1, "FLAG_GRANT_READ_URI_PERMISSION");
        map.put(2, "FLAG_GRANT_WRITE_URI_PERMISSION");
        map.put(32, "FLAG_INCLUDE_STOPPED_PACKAGES");
        map.put(268435456, "FLAG_RECEIVER_FOREGROUND");
        map.put(134217728, "FLAG_RECEIVER_NO_ABORT");
        map.put(1073741824, "FLAG_RECEIVER_REGISTERED_ONLY");
        map.put(536870912, "FLAG_RECEIVER_REPLACE_PENDING");
        map.put(524288, "FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET");
    }

    public static void a(String str, Intent intent) {
        if (intent == null) {
            t6b.b(str, "no intent found");
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            t6b.b(str, "Intent[@" + Integer.toHexString(intent.hashCode()) + "] content:");
            StringBuilder sb = new StringBuilder();
            sb.append("Action   : ");
            sb.append(intent.getAction());
            t6b.b(str, sb.toString());
            t6b.b(str, "Category : " + intent.getCategories());
            t6b.b(str, "Data     : " + intent.getDataString());
            b(str, intent.getComponent());
            d(str, intent.getFlags());
            t6b.b(str, "HasExtras: " + e(extras));
            c(str, extras);
        } catch (Exception e2) {
            t6b.d("IntentLogger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    public static void b(String str, ComponentName componentName) {
        if (componentName == null) {
            t6b.b(str, "Component: null");
            return;
        }
        t6b.b(str, "Component: " + componentName.getPackageName() + "/" + componentName.getClassName());
    }

    public static void c(String str, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                c(str, (Bundle) obj);
            } else {
                try {
                    t6b.b(str, "Extra[" + str2 + "] :" + String.valueOf(bundle.get(str2)));
                } catch (BadParcelableException e2) {
                    t6b.b(str, "Extra contains unknown class instance for [" + str2 + "]: " + e2.getMessage());
                }
            }
        }
    }

    public static void d(String str, int i) {
        t6b.b(str, "Flags    : " + Integer.toBinaryString(i));
        Iterator<Integer> it = a.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if ((iIntValue & i) != 0) {
                t6b.b(str, "Flag     : " + a.get(Integer.valueOf(iIntValue)));
            }
        }
    }

    public static boolean e(Bundle bundle) {
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    return true;
                }
            } catch (BadParcelableException e2) {
                t6b.b("IntentLogger", "Extra contains unknown class instance: " + e2.getMessage());
                return true;
            }
        }
        return false;
    }
}
