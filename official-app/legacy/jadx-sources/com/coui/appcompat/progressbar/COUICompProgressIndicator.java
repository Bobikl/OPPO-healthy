package com.coui.appcompat.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.anim.EffectiveAnimationView;
import com.support.appcompat.R$attr;
import com.support.progressbar.R$dimen;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICompProgressIndicator extends LinearLayout {
    public static final String G = "COUICompProgressIndicator";
    public static final int LARGE_ANIMATION = 0;
    public static final int LARGE_ANIMATION_WITH_TEXT_VERTICAL = 3;
    public static final int SMALL_ANIMATION = 1;
    public static final int SMALL_ANIMATION_WITH_TEXT_HORIZONTAL = 2;
    public static final int SMALL_ANIMATION_WITH_TEXT_VERTICAL = 4;
    public int A;
    public int B;
    public int C;
    public int D;
    public AttributeSet E;
    public int F;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f1959j;
    public EffectiveAnimationView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f1960l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f1961n;
    public boolean o;
    public String p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public COUICompProgressIndicator(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        EffectiveAnimationView effectiveAnimationView = new EffectiveAnimationView(this.f1959j);
        this.k = effectiveAnimationView;
        effectiveAnimationView.setRepeatCount(this.r);
        LinearLayout.LayoutParams layoutParams = z ? new LinearLayout.LayoutParams(this.u, this.w) : new LinearLayout.LayoutParams(this.v, this.x);
        layoutParams.gravity = 17;
        this.k.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(this.p)) {
            this.k.setAnimation(this.p);
        }
        int i = this.q;
        if (i != -1) {
            this.k.setAnimation(i);
        }
        addView(this.k);
        if (this.s) {
            this.k.playAnimation();
        }
    }

    public final void b() {
        int i = this.m;
        if (i == 0) {
            a(true);
            return;
        }
        if (i == 1) {
            a(false);
            return;
        }
        if (i == 2) {
            setOrientation(0);
            a(false);
            c(false);
        } else if (i == 3) {
            a(true);
            c(true);
        } else {
            if (i != 4) {
                return;
            }
            a(false);
            c(true);
        }
    }

    public final void c(boolean z) {
        TextView textView = new TextView(new ContextThemeWrapper(this.f1959j, z ? R$style.Widget_COUI_COUICompProgressIndicator_TipsTextView_Vertical : R$style.Widget_COUI_COUICompProgressIndicator_TipsTextView));
        this.f1960l = textView;
        textView.setText(this.f1961n);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = this.m;
        if (i == 2) {
            layoutParams.setMarginStart(this.y);
        } else if (i == 3) {
            layoutParams.setMargins(0, this.z, 0, this.B);
        } else if (i == 4) {
            layoutParams.setMargins(0, this.A, 0, this.B);
        }
        if (this.o) {
            this.f1960l.setTextSize(1, 12.0f);
        }
        addView(this.f1960l, layoutParams);
    }

    public EffectiveAnimationView getAnimationView() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k == null) {
            b();
        }
        EffectiveAnimationView effectiveAnimationView = this.k;
        if (effectiveAnimationView == null || !this.t) {
            return;
        }
        effectiveAnimationView.resumeAnimation();
        this.t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EffectiveAnimationView effectiveAnimationView = this.k;
        if (effectiveAnimationView == null || !effectiveAnimationView.isAnimating()) {
            return;
        }
        this.t = true;
        this.k.pauseAnimation();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        EffectiveAnimationView effectiveAnimationView = this.k;
        if (effectiveAnimationView != null) {
            if (i != 0) {
                if (effectiveAnimationView.isAnimating()) {
                    this.t = true;
                    this.k.pauseAnimation();
                    return;
                }
                return;
            }
            if (this.t) {
                effectiveAnimationView.resumeAnimation();
                this.t = false;
            }
        }
    }

    public void setLoadingTips(String str) {
        this.f1961n = str;
        TextView textView = this.f1960l;
        if (textView != null) {
            textView.setText(str);
        } else {
            Log.e(G, "This method only takes effect when mCouiLoadingType is SMALL_ANIMATION_WITH_TEXT_HORIZONTAL 、LARGE_ANIMATION_WITH_TEXT_VERTICAL、SMALL_ANIMATION_WITH_TEXT_VERTICAL");
        }
    }

    public void setLoadingType(int i) {
        this.m = i;
    }

    public COUICompProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUICompProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUICompProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 0;
        this.o = false;
        this.q = -1;
        this.r = -1;
        this.s = true;
        this.t = false;
        this.E = attributeSet;
        this.F = i;
        this.f1959j = context;
        this.C = getResources().getDimensionPixelSize(R$dimen.coui_loading_max_large_width);
        this.D = getResources().getDimensionPixelSize(R$dimen.coui_loading_max_large_height);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICompProgressIndicator, i, 0);
        this.m = typedArrayObtainStyledAttributes.getInt(R$styleable.COUICompProgressIndicator_couiLoadingType, this.i);
        this.f1961n = typedArrayObtainStyledAttributes.getString(R$styleable.COUICompProgressIndicator_loadingTips);
        this.p = typedArrayObtainStyledAttributes.getString(R$styleable.COUICompProgressIndicator_couiLottieLoadingJsonName);
        this.q = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUICompProgressIndicator_couiLottieLoadingRawRes, -1);
        this.r = typedArrayObtainStyledAttributes.getInt(R$styleable.COUICompProgressIndicator_couiRepeatCount, this.r);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICompProgressIndicator_couiAutoPlay, this.s);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICompProgressIndicator_couiLottieLoadingViewWidth, getResources().getDimensionPixelOffset(R$dimen.coui_loading_large_width));
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICompProgressIndicator_couiLottieLoadingViewHeight, getResources().getDimensionPixelOffset(R$dimen.coui_loading_large_height));
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICompProgressIndicator_couiSmallLottieLoadingViewWidth, getResources().getDimensionPixelOffset(R$dimen.coui_loading_small_width));
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICompProgressIndicator_couiSmallLottieLoadingViewHeight, getResources().getDimensionPixelOffset(R$dimen.coui_loading_small_height));
        int i3 = this.u;
        int i4 = this.C;
        if (i3 > i4) {
            this.u = i4;
            bj2.f(G, "couiLottieLoadingViewWidth Cannot be larger than 40 dp");
        }
        int i5 = this.w;
        int i6 = this.D;
        if (i5 > i6) {
            this.w = i6;
            bj2.f(G, "couiLottieLoadingViewHeight Cannot be larger than 40 dp");
        }
        int i7 = this.v;
        int i8 = this.C;
        if (i7 > i8) {
            this.v = i8;
            bj2.f(G, "couiSmallLottieLoadingViewWidth Cannot be larger than 40 dp");
        }
        int i9 = this.x;
        int i10 = this.D;
        if (i9 > i10) {
            this.x = i10;
            bj2.f(G, "couiSmallLottieLoadingViewHeight Cannot be larger than 40 dp");
        }
        if (TextUtils.isEmpty(this.p)) {
            this.p = lh2.g(this.f1959j, R$attr.couiRotatingSpinnerJsonName);
        }
        this.o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICompProgressIndicator_couiTextFix, this.o);
        typedArrayObtainStyledAttributes.recycle();
        this.y = context.getResources().getDimensionPixelSize(R$dimen.coui_loading_textview_left_margin);
        this.z = context.getResources().getDimensionPixelSize(R$dimen.coui_loading_textview_top_margin);
        this.A = context.getResources().getDimensionPixelSize(R$dimen.coui_loading_textview_top_margin_small);
        this.B = context.getResources().getDimensionPixelSize(R$dimen.coui_loading_textview_bottom_margin);
        setGravity(17);
        setOrientation(1);
    }

    public void setLoadingTips(int i) {
        setLoadingTips(this.f1959j.getString(i));
    }
}
