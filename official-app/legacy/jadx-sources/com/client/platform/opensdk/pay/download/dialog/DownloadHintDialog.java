package com.client.platform.opensdk.pay.download.dialog;

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
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.client.platform.opensdk.pay.download.resource.ResourceHelper;
import com.client.platform.opensdk.pay.download.util.ViewHelper;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes13.dex */
public class DownloadHintDialog {
    private OnBottomBtnClickListener mBottomBtnClickListener;
    private Dialog mDialog;
    private TextView mHintTextView;
    private Button mLeftBtn;
    private Button mRightBtn;

    @SuppressLint({"ResourceType"})
    public DownloadHintDialog(Context context) {
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
        TextView textView = new TextView(context);
        this.mHintTextView = textView;
        textView.setTextSize(1, 15.0f);
        this.mHintTextView.setTextColor(Colors.new_main_color);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams.rightMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams.topMargin = ResourceHelper.getDp(context, 18.0f);
        layoutParams.bottomMargin = ResourceHelper.getDp(context, 24.0f);
        linearLayout.addView(this.mHintTextView, layoutParams);
        View imageView = new ImageView(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, ResourceHelper.getPx(context, 1.0f));
        imageView.setBackgroundColor(Colors.title_divider);
        linearLayout.addView(imageView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, ResourceHelper.getDp(context, 8.0f), 0, ResourceHelper.getDp(context, 8.0f));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, ResourceHelper.getDp(context, 60.0f));
        layoutParams3.leftMargin = ResourceHelper.getDp(context, 23.0f);
        layoutParams3.rightMargin = ResourceHelper.getDp(context, 23.0f);
        this.mLeftBtn = new Button(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
        layoutParams4.weight = 1.0f;
        this.mLeftBtn.setTextSize(1, 13.0f);
        this.mLeftBtn.setTextColor(Colors.new_main_color);
        this.mLeftBtn.setGravity(17);
        this.mRightBtn = new Button(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
        layoutParams5.weight = 1.0f;
        layoutParams5.leftMargin = ResourceHelper.getDp(context, 7.0f);
        this.mRightBtn.setTextSize(1, 13.0f);
        this.mRightBtn.setTextColor(Colors.white_fa);
        this.mRightBtn.setGravity(17);
        linearLayout2.addView(this.mLeftBtn, layoutParams4);
        linearLayout2.addView(this.mRightBtn, layoutParams5);
        linearLayout.addView(linearLayout2, layoutParams3);
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(ResourceHelper.getPx(context, 1.0f), Colors.white_btn_stroke);
        gradientDrawable.setCornerRadius(ResourceHelper.getDp(context, 60.0f));
        ViewHelper.setBackgroud(this.mLeftBtn, gradientDrawable);
        this.mLeftBtn.setOnTouchListener(new View.OnTouchListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadHintDialog.1
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
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadHintDialog.2
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (DownloadHintDialog.this.mBottomBtnClickListener != null) {
                    DownloadHintDialog.this.mBottomBtnClickListener.leftBtnClicked();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Colors.blue_btn_normal);
        gradientDrawable2.setCornerRadius(ResourceHelper.getDp(context, 60.0f));
        ViewHelper.setBackgroud(this.mRightBtn, gradientDrawable2);
        this.mRightBtn.setOnTouchListener(new View.OnTouchListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadHintDialog.3
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
        this.mRightBtn.setOnClickListener(new View.OnClickListener() { // from class: com.client.platform.opensdk.pay.download.dialog.DownloadHintDialog.4
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (DownloadHintDialog.this.mBottomBtnClickListener != null) {
                    DownloadHintDialog.this.mBottomBtnClickListener.rightBtnClicked();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        this.mDialog.setContentView(linearLayout);
        this.mDialog.setCanceledOnTouchOutside(false);
        this.mDialog.setCancelable(false);
    }

    public void dimiss() {
        this.mDialog.dismiss();
    }

    public void setBottomBtnClickedListener(OnBottomBtnClickListener onBottomBtnClickListener) {
        this.mBottomBtnClickListener = onBottomBtnClickListener;
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

    public void setSystemAlertFlag() {
        this.mDialog.getWindow().setType(2003);
    }

    public void show() {
        this.mDialog.show();
    }
}
