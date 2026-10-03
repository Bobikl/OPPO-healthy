package com.oplus.pay.opensdk.download.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.view.GravityCompat;
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.oplus.aiunit.vision.htf;
import com.oplus.aiunit.vision.wc1;
import com.oplus.aiunit.vision.ygd;
import com.oplus.pay.opensdk.download.ui.DownloadStatusDialog;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DownloadStatusDialog {
    private ygd mBottomBtnClickListener;
    private final Dialog mDialog;
    private final Button mLeftBtn;
    private final TextView mPercentTextView;
    private final ProgressBar mProgressBar;
    private final Button mRightBtn;
    private final TextView mStateTextView;

    @SuppressLint({"ResourceType", "ClickableViewAccessibility"})
    public DownloadStatusDialog(Context context) {
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
        linearLayout.setBackgroundColor(Colors.bg_window);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = htf.a(context, 18.0f);
        layoutParams.rightMargin = htf.a(context, 18.0f);
        layoutParams.setMarginStart(htf.a(context, 18.0f));
        layoutParams.setMarginEnd(htf.a(context, 18.0f));
        layoutParams.topMargin = htf.a(context, 35.0f);
        TextView textView = new TextView(context);
        this.mStateTextView = textView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(20);
        textView.setTextColor(Colors.new_main_color);
        textView.setTextSize(1, 10.0f);
        TextView textView2 = new TextView(context);
        this.mPercentTextView = textView2;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(21);
        textView2.setTextColor(Colors.progressbar_bg_full);
        textView2.setTextSize(1, 10.0f);
        relativeLayout.addView(textView, layoutParams2);
        relativeLayout.addView(textView2, layoutParams3);
        linearLayout.addView(relativeLayout, layoutParams);
        ProgressBar progressBar = new ProgressBar(context, null, 0);
        this.mProgressBar = progressBar;
        progressBar.setIndeterminate(false);
        wc1.d(progressBar, "mOnlyIndeterminate", Boolean.FALSE);
        progressBar.setBackgroundColor(Colors.progressbar_bg_full);
        progressBar.setProgressDrawable(new ClipDrawable(new ColorDrawable(Colors.progressbar_progress_full), GravityCompat.START, 1));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, htf.a(context, 2.0f));
        layoutParams4.bottomMargin = htf.a(context, 18.0f);
        layoutParams4.leftMargin = htf.a(context, 18.0f);
        layoutParams4.setMarginStart(htf.a(context, 18.0f));
        layoutParams4.setMarginEnd(htf.a(context, 18.0f));
        layoutParams4.rightMargin = htf.a(context, 18.0f);
        layoutParams4.topMargin = htf.a(context, 7.0f);
        linearLayout.addView(progressBar, layoutParams4);
        View imageView = new ImageView(context);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, htf.b(context, 1.0f));
        imageView.setBackgroundColor(Colors.title_divider);
        linearLayout.addView(imageView, layoutParams5);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, htf.a(context, 8.0f), 0, htf.a(context, 8.0f));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, htf.a(context, 60.0f));
        layoutParams6.leftMargin = htf.a(context, 23.0f);
        layoutParams6.rightMargin = htf.a(context, 23.0f);
        layoutParams6.setMarginStart(htf.a(context, 23.0f));
        layoutParams6.setMarginEnd(htf.a(context, 23.0f));
        Button button = new Button(context);
        this.mLeftBtn = button;
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1);
        layoutParams7.weight = 1.0f;
        button.setTextSize(1, 13.0f);
        button.setTextColor(Colors.new_main_color);
        button.setGravity(17);
        Button button2 = new Button(context);
        this.mRightBtn = button2;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -1);
        layoutParams8.weight = 1.0f;
        layoutParams8.leftMargin = htf.a(context, 7.0f);
        layoutParams8.setMarginStart(htf.a(context, 7.0f));
        button2.setTextSize(1, 13.0f);
        button2.setTextColor(Colors.white_fa);
        button2.setGravity(17);
        linearLayout2.addView(button, layoutParams7);
        linearLayout2.addView(button2, layoutParams8);
        linearLayout.addView(linearLayout2, layoutParams6);
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(htf.b(context, 1.0f), Colors.white_btn_stroke);
        gradientDrawable.setCornerRadius(htf.a(context, 60.0f));
        button.setBackground(gradientDrawable);
        button.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.q36
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DownloadStatusDialog.lambda$new$0(gradientDrawable, view, motionEvent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.r36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$new$1(view);
            }
        });
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Colors.blue_btn_normal);
        gradientDrawable2.setCornerRadius(htf.a(context, 60.0f));
        button2.setBackground(gradientDrawable2);
        button2.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.s36
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DownloadStatusDialog.lambda$new$2(gradientDrawable2, view, motionEvent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.t36
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
            gradientDrawable.setColor(Colors.white_btn_pressed);
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
        ygd ygdVar = this.mBottomBtnClickListener;
        if (ygdVar != null) {
            ygdVar.leftBtnClicked();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$2(GradientDrawable gradientDrawable, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            gradientDrawable.setColor(Colors.blue_btn_pressed);
            return false;
        }
        if (1 != motionEvent.getAction()) {
            return false;
        }
        gradientDrawable.setColor(Colors.blue_btn_normal);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$new$3(View view) {
        ygd ygdVar = this.mBottomBtnClickListener;
        if (ygdVar != null) {
            ygdVar.rightBtnClicked();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public void dismiss() {
        this.mDialog.dismiss();
    }

    public void setBottomBtnClickedListener(ygd ygdVar) {
        this.mBottomBtnClickListener = ygdVar;
    }

    public void setLeftBtnText(String str) {
        this.mLeftBtn.setText(str);
    }

    public void setPercent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mPercentTextView.setText(str);
    }

    public void setProgress(int i) {
        this.mProgressBar.setProgress(i);
    }

    public void setRightBtnText(String str) {
        this.mRightBtn.setText(str);
    }

    public void setState(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mStateTextView.setText(str);
    }

    public void setStateTextColor(int i) {
        this.mStateTextView.setTextColor(i);
    }

    public void show() {
        this.mDialog.show();
    }
}
