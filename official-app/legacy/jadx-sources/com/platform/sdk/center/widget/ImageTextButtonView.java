package com.platform.sdk.center.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.platform.sdk.center.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class ImageTextButtonView extends LinearLayout {
    public ImageView a;
    public TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f20266c;

    public ImageTextButtonView(Context context) {
        super(context);
    }

    public final void a(Context context) {
        View.inflate(context, R.layout.account_center_view_image_button, this);
        this.a = (ImageView) findViewById(R.id.iv_button_icon);
        this.b = (TextView) findViewById(R.id.tv_content);
    }

    public ImageView getImageView() {
        return this.a;
    }

    public String getTextViewInfo() {
        if (TextUtils.isEmpty(this.b.getText().toString())) {
            return null;
        }
        return this.b.getText().toString();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            a(1.0f, 0.9f, 1.0f, 0.8f).start();
        } else if (action == 1 || action == 3) {
            a(0.9f, 1.0f, 0.8f, 1.0f).start();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.setText(str);
    }

    public void setTextColor(int i) {
        this.b.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.b.setTextSize(0, f);
    }

    public ImageTextButtonView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ImageTextButtonView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    @NotNull
    public final AnimatorSet a(float f, float f2, float f3, float f4) {
        AnimatorSet animatorSet = this.f20266c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f20266c = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", f, f2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", f, f2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "alpha", f3, f4);
        this.f20266c.setDuration(100L);
        this.f20266c.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(objectAnimatorOfFloat3);
        return this.f20266c;
    }
}
