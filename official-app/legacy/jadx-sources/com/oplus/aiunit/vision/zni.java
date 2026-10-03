package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class zni {
    public static boolean a(Context context) {
        return 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    public static void b(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        if (z) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
    }

    @TargetApi(23)
    public static void c(Activity activity, boolean z) {
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            }
        }
    }
}
