package com.heytap.msp.sdk.base.common.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: loaded from: classes19.dex */
public class SafeToast extends Toast {
    public SafeToast(Context context) {
        super(context);
    }

    public static void setText(final Context context, final CharSequence charSequence) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Toast.makeText(context, charSequence, 0).show();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.heytap.msp.sdk.base.common.util.SafeToast.1
                @Override // java.lang.Runnable
                public void run() {
                    SafeToast.setText(context, charSequence);
                }
            });
        }
    }

    public static void setText(Context context, int i) {
        setText(context, context.getResources().getText(i));
    }
}
