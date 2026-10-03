package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g35 {
    @Nullable
    public static String a(Context context, Intent intent) {
        if (intent == null || intent.getData() == null) {
            return null;
        }
        return b(context, intent.getData().toString());
    }

    @Nullable
    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 131072);
            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                return listQueryIntentActivities.get(0).activityInfo.packageName;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
