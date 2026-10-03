package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes18.dex */
public class ljc {
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    public static boolean a(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).isInMultiWindowMode();
        }
        return false;
    }
}
