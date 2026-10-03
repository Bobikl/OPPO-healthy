package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import dalvik.system.DexClassLoader;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ngd {
    public static final String TAG = "OmojiUtil";

    public static boolean a(Context context) {
        ltl.a(TAG, "check isSupportOmoji");
        int i = qe0.i(context, "com.oplus.omoji");
        boolean zBooleanValue = false;
        if (i < 39) {
            ltl.i(TAG, "[isSupportOmoji] packageCode is too low not support omoji watchface." + i);
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("com.oplus.omoji.main", (Uri) null), 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.size() == 0) {
            return false;
        }
        ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
        String str = activityInfo.packageName;
        String str2 = activityInfo.applicationInfo.sourceDir;
        String str3 = context.getApplicationInfo().dataDir;
        String str4 = activityInfo.applicationInfo.nativeLibraryDir;
        ltl.a(TAG, "packageName is : " + str + "\ndexPath is : " + str2 + "\ndexOutputDir is : " + str3 + "\nlibPath is : " + str4);
        try {
            Class<?> clsLoadClass = new DexClassLoader(str2, str3, str4, context.getClass().getClassLoader()).loadClass(str + ".FUApplication");
            Boolean bool = (Boolean) clsLoadClass.getMethod("isSupportWatch", new Class[0]).invoke(clsLoadClass.newInstance(), new Object[0]);
            zBooleanValue = bool.booleanValue();
            ltl.d(TAG, "return value is " + bool);
            return zBooleanValue;
        } catch (Exception e2) {
            ltl.d(TAG, "ClassNotFoundException" + e2.getMessage());
            return zBooleanValue;
        }
    }
}
