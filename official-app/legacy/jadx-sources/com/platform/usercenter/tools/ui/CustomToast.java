package com.platform.usercenter.tools.ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/* JADX INFO: loaded from: classes9.dex */
public class CustomToast extends Toast {
    private static CustomToast mToast;

    public CustomToast(Context context) {
        super(context);
    }

    public static void cancelToast() {
        CustomToast customToast = mToast;
        if (customToast != null) {
            customToast.cancel();
            mToast = null;
        }
    }

    public static void showHttpErrorToast(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context.getApplicationContext(), str, 0).show();
    }

    public static void showToast(Context context, int i) {
        if (i > 0) {
            Toast.makeText(context.getApplicationContext(), i, 0).show();
        }
    }

    public static void showToast(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context.getApplicationContext(), str, 0).show();
    }

    public static void showHttpErrorToast(Context context, int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toastMakeText = Toast.makeText(context.getApplicationContext(), str, 0);
        toastMakeText.setGravity(i, 0, 0);
        toastMakeText.show();
    }

    public static void showToast(Context context, int i, int i2) {
        if (i2 > 0) {
            Toast toastMakeText = Toast.makeText(context.getApplicationContext(), i2, 0);
            toastMakeText.setGravity(i, 0, 0);
            toastMakeText.show();
        }
    }

    public static void showToast(Context context, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toastMakeText = Toast.makeText(context.getApplicationContext(), str, 0);
        toastMakeText.setGravity(i, 0, 0);
        toastMakeText.show();
    }
}
