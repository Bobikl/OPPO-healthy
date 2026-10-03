package com.sensorsdata.analytics.android.sdk.visual.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.visual.R;

/* JADX INFO: loaded from: classes10.dex */
public class PairingCodeEditDialog extends Dialog {
    private static final String TAG = "SA.PairingCodeEditDialog";
    private Context mContext;

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog$1, reason: invalid class name */
    public class AnonymousClass1 implements IPairingCodeInterface.OnPairingCodeChangedListener {
        final /* synthetic */ PairingCodeEditText val$pairingCodeEditText;

        public AnonymousClass1(PairingCodeEditText pairingCodeEditText) {
            this.val$pairingCodeEditText = pairingCodeEditText;
        }

        @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface.OnPairingCodeChangedListener
        public void onInputCompleted(CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                SALog.i(PairingCodeEditDialog.TAG, "onCreate | dialog input content is null and return");
            } else {
                new PairingCodeRequestHelper().verifyPairingCodeRequest(PairingCodeEditDialog.this.mContext, charSequence.toString(), new PairingCodeRequestHelper.IApiCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog.1.1
                    @Override // com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeRequestHelper.IApiCallback
                    public void onFailure(String str) {
                        AnonymousClass1.this.val$pairingCodeEditText.clearText();
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        Toast.makeText(PairingCodeEditDialog.this.mContext, str, 1).show();
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeRequestHelper.IApiCallback
                    public void onSuccess() {
                        AnonymousClass1.this.val$pairingCodeEditText.postDelayed(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass1.this.val$pairingCodeEditText.hiddenKeyBord();
                                PairingCodeEditDialog.this.dismiss();
                            }
                        }, 300L);
                    }
                });
            }
        }

        @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface.OnPairingCodeChangedListener
        public void onPairingCodeChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public PairingCodeEditDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    private int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private boolean isActivityFinishingOrDestroyed(Context context) {
        Activity activity = (Activity) context;
        if (!activity.isFinishing()) {
            return activity.isDestroyed();
        }
        SALog.i(TAG, "Activity is finish,name=" + activity.getClass().getName());
        return true;
    }

    private boolean isLiving() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((context instanceof Activity) && isActivityFinishingOrDestroyed(context)) ? false : true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Context context = this.mContext;
            if ((context instanceof Activity) && isActivityFinishingOrDestroyed(context)) {
                SALog.i(TAG, "Activity is finish");
                return;
            }
        }
        if (isShowing()) {
            try {
                SALog.i(TAG, "isShowing() == true, dismiss");
                super.dismiss();
            } catch (IllegalArgumentException e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sensors_analytics_verification_code);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = dip2px(getContext(), 350.0f);
            window.setAttributes(attributes);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius(dip2px(getContext(), 7.0f));
            window.setBackgroundDrawable(gradientDrawable);
            window.setSoftInputMode(4);
        }
        ((TextView) findViewById(R.id.sensors_analytics_verification_code_title)).setText(R.string.sensors_analytics_visual_code_title);
        PairingCodeEditText pairingCodeEditText = (PairingCodeEditText) findViewById(R.id.sensors_analytics_pairing_code);
        pairingCodeEditText.setOnPairingCodeChangedListener(new AnonymousClass1(pairingCodeEditText));
    }

    @Override // android.app.Dialog
    public void show() {
        if (!isLiving()) {
            SALog.i(TAG, "Activity is finish");
            return;
        }
        SALog.i(TAG, "show:" + this.mContext);
        super.show();
    }
}
