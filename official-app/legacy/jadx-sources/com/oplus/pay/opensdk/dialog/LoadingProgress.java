package com.oplus.pay.opensdk.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.oplus.aiunit.vision.qae;
import com.oplus.pay.opensdk.R$layout;
import com.oplus.pay.opensdk.R$style;

/* JADX INFO: loaded from: classes8.dex */
public class LoadingProgress extends Dialog {
    public boolean i;

    public LoadingProgress(Context context) {
        super(context, R$style.MyDialog);
        boolean z = context instanceof Activity;
        this.i = z;
        if (!z || getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(R$layout.dialog_loading);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = displayMetrics.widthPixels;
        attributes.height = displayMetrics.heightPixels;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getWindow().getDecorView().setSystemUiVisibility(2822);
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.i) {
            super.show();
        } else {
            qae.b("applicationContext not support Dialog");
        }
    }
}
