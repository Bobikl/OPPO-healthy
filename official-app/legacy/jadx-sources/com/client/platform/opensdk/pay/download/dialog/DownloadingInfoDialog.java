package com.client.platform.opensdk.pay.download.dialog;

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
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.client.platform.opensdk.pay.download.resource.ResourceHelper;
import com.client.platform.opensdk.pay.download.util.BeanUtils;
import com.client.platform.opensdk.pay.download.util.ViewHelper;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes13.dex */
public class DownloadingInfoDialog {
    private OnBottomBtnClickListener mBottomBtnClickListener;
    private Dialog mDialog;
    private Button mLeftBtn;
    private TextView mPercentTextView;
    private ProgressBar mProgressBar;
    private Button mRightBtn;
    private TextView mStateTextView;

    @SuppressLint({"ResourceType"})
    public DownloadingInfoDialog(Context context) {
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
        this.mDialog.getWindow().setAttributes(attributes);
        this.mDialog.getWindow().addFlags(2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Colors.bg_window);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams.rightMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams.topMargin = ResourceHelper.getDp(context, 35.0f);
        this.mStateTextView = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        this.mStateTextView.setTextColor(Colors.new_main_color);
        this.mStateTextView.setTextSize(1, 10.0f);
        this.mPercentTextView = new TextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        this.mPercentTextView.setTextColor(Colors.progressbar_bg_full);
        this.mPercentTextView.setTextSize(1, 10.0f);
        relativeLayout.addView(this.mStateTextView, layoutParams2);
        relativeLayout.addView(this.mPercentTextView, layoutParams3);
        linearLayout.addView(relativeLayout, layoutParams);
        ProgressBar progressBar = new ProgressBar(context, null, 0);
        this.mProgressBar = progressBar;
        progressBar.setIndeterminate(false);
        BeanUtils.setFieldValue(this.mProgressBar, "mOnlyIndeterminate", Boolean.FALSE);
        this.mProgressBar.setBackgroundColor(Colors.progressbar_bg_full);
        this.mProgressBar.setProgressDrawable(new ClipDrawable(new ColorDrawable(Colors.progressbar_progress_full), 3, 1));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, ResourceHelper.getDp(context, 2.0f));
        layoutParams4.bottomMargin = ResourceHelper.getDp(context, 38.0f);
        layoutParams4.leftMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams4.rightMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams4.topMargin = ResourceHelper.getDp(context, 7.0f);
        linearLayout.addView(this.mProgressBar, layoutParams4);
        View imageView = new ImageView(context);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, ResourceHelper.getPx(context, 1.0f));
        imageView.setBackgroundColor(Colors.title_divider);
        linearLayout.addView(imageView, layoutParams5);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, ResourceHelper.getDp(context, 8.0f), 0, ResourceHelper.getDp(context, 8.0f));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, ResourceHelper.getDp(context, 51.0f));
        layoutParams6.leftMargin = ResourceHelper.getDp(context, 23.0f);
        layoutParams6.rightMargin = ResourceHelper.getDp(context, 23.0f);
        this.mLeftBtn = new Button(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1);
        layoutParams7.weight = 1.0f;
        this.mLeftBtn.setTextSize(1, 14.0f);
        this.mLeftBtn.setTextColor(Colors.new_main_color);
        this.mLeftBtn.setGravity(17);
        this.mRightBtn = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -1);
        layoutParams8.weight = 1.0f;
        layoutParams8.leftMargin = ResourceHelper.getDp(context, 7.0f);
        this.mRightBtn.setTextSize(1, 14.0f);
        this.mRightBtn.setTextColor(Colors.white_fa);
        this.mRightBtn.setGravity(17);
        linearLayout2.addView(this.mLeftBtn, layoutParams7);
        linearLayout2.addView(this.mRightBtn, layoutParams8);
        linearLayout.addView(linearLayout2, layoutParams6);
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(ResourceHelper.getPx(context, 1.0f), Colors.white_btn_stroke);
        gradientDrawable.setCornerRadius(ResourceHelper.getDp(context, 60.0f));
        ViewHelper.setBackgroud(this.mLeftBtn, gradientDrawable);
        this.mLeftBtn.setOnTouchListener(new View.OnTouchListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadingInfoDialog.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
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
        });
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadingInfoDialog.2
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (DownloadingInfoDialog.this.mBottomBtnClickListener != null) {
                    DownloadingInfoDialog.this.mBottomBtnClickListener.leftBtnClicked();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Colors.blue_btn_normal);
        gradientDrawable2.setCornerRadius(ResourceHelper.getDp(context, 60.0f));
        ViewHelper.setBackgroud(this.mRightBtn, gradientDrawable2);
        this.mRightBtn.setOnTouchListener(new View.OnTouchListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadingInfoDialog.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    gradientDrawable2.setColor(Colors.blue_btn_pressed);
                    return false;
                }
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                gradientDrawable2.setColor(Colors.blue_btn_normal);
                return false;
            }
        });
        this.mRightBtn.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadingInfoDialog.4
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (DownloadingInfoDialog.this.mBottomBtnClickListener != null) {
                    DownloadingInfoDialog.this.mBottomBtnClickListener.rightBtnClicked();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        this.mDialog.setContentView(linearLayout);
        this.mDialog.setCanceledOnTouchOutside(false);
        this.mDialog.setCancelable(false);
    }

    public void dismiss() {
        this.mDialog.dismiss();
    }

    public void setBottomBtnClickedListener(OnBottomBtnClickListener onBottomBtnClickListener) {
        this.mBottomBtnClickListener = onBottomBtnClickListener;
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
