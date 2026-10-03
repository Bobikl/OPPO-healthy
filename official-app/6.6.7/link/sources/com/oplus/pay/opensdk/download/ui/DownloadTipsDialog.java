package com.oplus.pay.opensdk.download.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.jwf;
import com.oplus.aiunit.vision.pid;
import com.oplus.pay.opensdk.download.ui.DownloadTipsDialog;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class DownloadTipsDialog {
    private pid mBottomBtnClickListener;
    private final Dialog mDialog;
    private final TextView mHintTextView;
    private final Button mLeftBtn;
    private final Button mRightBtn;

    @SuppressLint({"ResourceType", "ClickableViewAccessibility"})
    public DownloadTipsDialog(Context context) {
        Dialog dialog = new Dialog(context, 1);
        this.mDialog = dialog;
        Window window = dialog.getWindow();
        window.requestFeature(1);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        attributes.width = -1;
        attributes.height = -2;
        dialog.getWindow().setAttributes(attributes);
        dialog.getWindow().addFlags(2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-657931);
        TextView textView = new TextView(context);
        this.mHintTextView = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(-13224394);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = jwf.a(context, 18.0f);
        layoutParams.rightMargin = jwf.a(context, 18.0f);
        layoutParams.setMarginStart(jwf.a(context, 18.0f));
        layoutParams.setMarginEnd(jwf.a(context, 18.0f));
        layoutParams.topMargin = jwf.a(context, 18.0f);
        layoutParams.bottomMargin = jwf.a(context, 24.0f);
        linearLayout.addView(textView, layoutParams);
        View imageView = new ImageView(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, jwf.b(context, 1.0f));
        imageView.setBackgroundColor(-2368549);
        linearLayout.addView(imageView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, jwf.a(context, 8.0f), 0, jwf.a(context, 8.0f));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, jwf.a(context, 60.0f));
        layoutParams3.leftMargin = jwf.a(context, 23.0f);
        layoutParams3.rightMargin = jwf.a(context, 23.0f);
        layoutParams3.setMarginStart(jwf.a(context, 23.0f));
        layoutParams3.setMarginEnd(jwf.a(context, 23.0f));
        Button button = new Button(context);
        this.mLeftBtn = button;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
        layoutParams4.weight = 1.0f;
        button.setTextSize(1, 13.0f);
        button.setTextColor(-13224394);
        button.setGravity(17);
        Button button2 = new Button(context);
        this.mRightBtn = button2;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
        layoutParams5.weight = 1.0f;
        layoutParams5.leftMargin = jwf.a(context, 7.0f);
        layoutParams5.setMarginStart(jwf.a(context, 7.0f));
        button2.setTextSize(1, 13.0f);
        button2.setTextColor(-328966);
        button2.setGravity(17);
        linearLayout2.addView(button, layoutParams4);
        linearLayout2.addView(button2, layoutParams5);
        linearLayout.addView(linearLayout2, layoutParams3);
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(jwf.b(context, 1.0f), -3421237);
        gradientDrawable.setCornerRadius(jwf.a(context, 60.0f));
        button.setBackground(gradientDrawable);
        button.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.t46
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DownloadTipsDialog.lambda$new$0(gradientDrawable, view, motionEvent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.u46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$new$1(view);
            }
        });
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-10440203);
        gradientDrawable2.setCornerRadius(jwf.a(context, 60.0f));
        button2.setBackground(gradientDrawable2);
        button2.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.v46
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DownloadTipsDialog.lambda$new$2(gradientDrawable2, view, motionEvent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.w46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$new$3(view);
            }
        });
        dialog.setContentView(linearLayout);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(GradientDrawable gradientDrawable, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            gradientDrawable.setColor(-1710619);
            return false;
        }
        if (1 != motionEvent.getAction()) {
            return false;
        }
        gradientDrawable.setColor(-1);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$new$1(View view) {
        pid pidVar = this.mBottomBtnClickListener;
        if (pidVar != null) {
            pidVar.leftBtnClicked();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$2(GradientDrawable gradientDrawable, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            gradientDrawable.setColor(-11886618);
            return false;
        }
        if (1 != motionEvent.getAction()) {
            return false;
        }
        gradientDrawable.setColor(-10440203);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$new$3(View view) {
        pid pidVar = this.mBottomBtnClickListener;
        if (pidVar != null) {
            pidVar.rightBtnClicked();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public void dimiss() {
        this.mDialog.dismiss();
    }

    public void setBottomBtnClickedListener(pid pidVar) {
        this.mBottomBtnClickListener = pidVar;
    }

    public void setHint(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHintTextView.setText(str);
    }

    public void setLeftBtnText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mLeftBtn.setText(str);
    }

    public void setRightBtnText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mRightBtn.setText(str);
    }

    public void show() {
        this.mDialog.show();
    }
}
