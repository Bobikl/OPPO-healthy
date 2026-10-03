package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;

/* JADX INFO: loaded from: classes18.dex */
public class tak {
    public static int a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android"));
    }

    public static void b(Activity activity) {
        if (bn2.c() >= 6) {
            View decorView = activity.getWindow().getDecorView();
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }
}
