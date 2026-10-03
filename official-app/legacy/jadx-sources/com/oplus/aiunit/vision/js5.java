package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.oplus.nearx.track.internal.scan.SchemeActivity;

/* JADX INFO: loaded from: classes8.dex */
public class js5 {
    public static Dialog a;

    public static void a(Dialog dialog) {
        try {
            Dialog dialog2 = a;
            if (dialog2 != null && dialog2.isShowing()) {
                try {
                    a.dismiss();
                    k6k.e().i("DialogUtils", "Dialog dismiss", null, new Object[0]);
                } catch (Exception e2) {
                    k6k.e().c("DialogUtils", "exception:", e2, new Object[0]);
                }
            }
            a = dialog;
            dialog.show();
        } catch (Exception e3) {
            k6k.e().c("DialogUtils", "exception:", e3, new Object[0]);
        }
    }

    public static void b(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setCancelable(false);
        builder.setNegativeButton(str4, onClickListener2);
        builder.setPositiveButton(str3, onClickListener);
        a(builder.create());
    }

    public static void c(Context context) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
            ((SchemeActivity) context).finish();
            k6k.e().i("DialogUtils", "startLaunchActivity", null, new Object[0]);
        } catch (Exception e2) {
            k6k.e().c("DialogUtils", "exception:", e2, new Object[0]);
        }
    }
}
