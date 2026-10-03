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
import androidx.core.view.GravityCompat;
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.oplus.aiunit.vision.htf;
import com.oplus.aiunit.vision.ygd;
import com.oplus.pay.opensdk.download.ui.DownloadTipsDialog;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DownloadTipsDialog {
    private ygd mBottomBtnClickListener;
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
        linearLayout.setBackgroundColor(Colors.bg_window);
        TextView textView = new TextView(context);
        this.mHintTextView = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(Colors.new_main_color);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.START;
        layoutParams.leftMargin = htf.a(context, 18.0f);
        layoutParams.rightMargin = htf.a(context, 18.0f);
        layoutParams.setMarginStart(htf.a(context, 18.0f));
        layoutParams.setMarginEnd(htf.a(context, 18.0f));
        layoutParams.topMargin = htf.a(context, 18.0f);
        layoutParams.bottomMargin = htf.a(context, 24.0f);
        linearLayout.addView(textView, layoutParams);
        View imageView = new ImageView(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, htf.b(context, 1.0f));
        imageView.setBackgroundColor(Colors.title_divider);
        linearLayout.addView(imageView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, htf.a(context, 8.0f), 0, htf.a(context, 8.0f));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, htf.a(context, 60.0f));
        layoutParams3.leftMargin = htf.a(context, 23.0f);
        layoutParams3.rightMargin = htf.a(context, 23.0f);
        layoutParams3.setMarginStart(htf.a(context, 23.0f));
        layoutParams3.setMarginEnd(htf.a(context, 23.0f));
        Button button = new Button(context);
        this.mLeftBtn = button;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
        layoutParams4.weight = 1.0f;
        button.setTextSize(1, 13.0f);
        button.setTextColor(Colors.new_main_color);
        button.setGravity(17);
        Button button2 = new Button(context);
        this.mRightBtn = button2;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
        layoutParams5.weight = 1.0f;
        layoutParams5.leftMargin = htf.a(context, 7.0f);
        layoutParams5.setMarginStart(htf.a(context, 7.0f));
        button2.setTextSize(1, 13.0f);
        button2.setTextColor(Colors.white_fa);
        button2.setGravity(17);
        linearLayout2.addView(button, layoutParams4);
        linearLayout2.addView(button2, layoutParams5);
        linearLayout.addView(linearLayout2, layoutParams3);
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(htf.b(context, 1.0f), Colors.white_btn_stroke);
        gradientDrawable.setCornerRadius(htf.a(context, 60.0f));
        button.setBackground(gradientDrawable);
        button.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.v36
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DownloadTipsDialog.lambda$new$0(gradientDrawable, view, motionEvent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.w36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$new$1(view);
            }
        });
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Colors.blue_btn_normal);
        gradientDrawable2.setCornerRadius(htf.a(context, 60.0f));
        button2.setBackground(gradientDrawable2);
        button2.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.x36
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DownloadTipsDialog.lambda$new$2(gradientDrawable2, view, motionEvent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.y36
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

    public void dimiss() {
        this.mDialog.dismiss();
    }

    public void setBottomBtnClickedListener(ygd ygdVar) {
        this.mBottomBtnClickListener = ygdVar;
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
