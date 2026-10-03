package com.coui.appcompat.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ph2;
import com.oplus.anim.EffectiveAnimationView;
import com.support.progressbar.R$attr;
import com.support.progressbar.R$dimen;
import com.support.progressbar.R$string;
import com.support.progressbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUILottieLoadingView extends FrameLayout {
    public final EffectiveAnimationView i;

    public COUILottieLoadingView(Context context) {
        this(context, null);
    }

    public final void a() {
        EffectiveAnimationView effectiveAnimationView = this.i;
        if (effectiveAnimationView == null || !effectiveAnimationView.isAnimating()) {
            return;
        }
        this.i.pauseAnimation();
    }

    public final void b() {
        if (this.i != null && getVisibility() == 0 && getWindowVisibility() == 0) {
            this.i.resumeAnimation();
        }
    }

    @Nullable
    public EffectiveAnimationView getLoadingView() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getVisibility() == 0) {
            b();
        } else {
            a();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            b();
        } else {
            a();
        }
    }

    public COUILottieLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiLottieLoadingViewStyle);
    }

    public COUILottieLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUILottieLoadingView, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUILottieLoadingView_couiLottieLoadingViewWidth, getResources().getDimensionPixelOffset(R$dimen.coui_lottie_loading_view_large_width));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUILottieLoadingView_couiLottieLoadingViewHeight, getResources().getDimensionPixelOffset(R$dimen.coui_lottie_loading_view_large_height));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUILottieLoadingView_couiLottieLoadingJsonName);
        string = string == null ? getResources().getString(R$string.coui_lottie_loading_large_json) : string;
        typedArrayObtainStyledAttributes.recycle();
        EffectiveAnimationView effectiveAnimationView = new EffectiveAnimationView(context);
        this.i = effectiveAnimationView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
        layoutParams.gravity = 17;
        effectiveAnimationView.setLayoutParams(layoutParams);
        effectiveAnimationView.setRepeatCount(-1);
        effectiveAnimationView.setAnimation(string);
        addView(effectiveAnimationView);
    }
}
