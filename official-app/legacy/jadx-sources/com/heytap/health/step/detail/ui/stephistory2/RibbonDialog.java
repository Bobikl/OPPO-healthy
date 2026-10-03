package com.heytap.health.step.detail.ui.stephistory2;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;
import com.heytap.health.step.R$mipmap;
import com.heytap.health.step.R$style;

/* JADX INFO: loaded from: classes18.dex */
public class RibbonDialog extends Dialog {
    public final AnimationDrawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Activity f5966j;

    public RibbonDialog(@NonNull Activity activity) {
        super(activity);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        this.i = animationDrawable;
        this.f5966j = activity;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(displayMetrics.widthPixels, displayMetrics.heightPixels);
        getWindow().setContentView(R$layout.step_dialog_ribbon);
        getWindow().setDimAmount(0.0f);
        getWindow().setWindowAnimations(R$style.step_dialogWindowAnim);
        setCanceledOnTouchOutside(false);
        e();
        animationDrawable.setOneShot(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        synchronized (RibbonDialog.class) {
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_6, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_7, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_8, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_9, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_10, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_11, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_12, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_13, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_14, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_15, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_16, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_17, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_18, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_19, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_20, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_21, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_22, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_23, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_24, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_25, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_26, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_27, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_28, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_29, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_30, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_31, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_32, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_33, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_34, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_35, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_36, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_37, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_38, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_39, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_40, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_41, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_42, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_43, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_44, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_45, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_46, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_47, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_48, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_49, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_50, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_51, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_52, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_53, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_54, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_55, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_56, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_57, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_58, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_59, null), 42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        synchronized (RibbonDialog.class) {
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_1, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_2, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_3, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_4, null), 42);
            this.i.addFrame(ResourcesCompat.getDrawable(c(), R$mipmap.step_ribbon_5, null), 42);
        }
    }

    public final Resources c() {
        return getContext().getResources();
    }

    public final void d() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.gxf
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f();
            }
        });
    }

    public final void e() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.exf
            @Override // java.lang.Runnable
            public final void run() {
                this.i.g();
            }
        });
    }

    public void h() {
        int numberOfFrames = this.i.getNumberOfFrames();
        StringBuilder sb = new StringBuilder();
        sb.append("showRibbon  getNumberOfFrames ");
        sb.append(numberOfFrames);
        if (numberOfFrames >= 5) {
            i();
        } else {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.dxf
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.h();
                }
            }, 42L);
        }
    }

    public final void i() {
        if (this.f5966j.isFinishing() || this.f5966j.isDestroyed()) {
            return;
        }
        d();
        show();
        ImageView imageView = (ImageView) findViewById(R$id.imageview);
        imageView.setImageDrawable(this.i);
        this.i.start();
        imageView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.fxf
            @Override // java.lang.Runnable
            public final void run() {
                this.i.dismiss();
            }
        }, 1800L);
    }
}
