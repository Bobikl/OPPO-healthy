package com.client.platform.opensdk.pay.download.util;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class ViewHelper {
    @TargetApi(16)
    public static void setBackgroud(View view, Drawable drawable) {
        if (view == null || drawable == null) {
            return;
        }
        view.setBackground(drawable);
    }
}
