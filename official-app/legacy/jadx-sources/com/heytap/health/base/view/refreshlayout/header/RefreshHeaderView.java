package com.heytap.health.base.view.refreshlayout.header;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.heytap.health.base.R$dimen;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.R$raw;
import com.heytap.health.base.R$string;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes15.dex */
public class RefreshHeaderView extends BaseRefreshHeaderView {
    public static final int DISTANCE_BEGIN_STRATCH = 200;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3345j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3346l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LottieAnimationView f3347n;
    public ValueAnimator o;
    public ValueAnimator p;
    public float q;
    public String r;
    public String s;
    public int t;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                return;
            }
            RefreshHeaderView.this.f3347n.setProgress((((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.472f) + 0.528f);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            RefreshHeaderView.this.p.start();
        }
    }

    public RefreshHeaderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ValueAnimator valueAnimator) {
        this.f3347n.setProgress((((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.255f) + 0.273f);
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public void a() {
        this.f3345j = 3;
        this.f3347n.clearAnimation();
        this.m.setText(getRefreshingString());
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public boolean b() {
        int i = this.f3345j;
        if ((i != 2 && i != 3) || this.f3346l < this.k) {
            return false;
        }
        this.f3345j = 3;
        this.f3347n.clearAnimation();
        this.f3347n.playAnimation();
        this.m.setText(getRefreshingString());
        return true;
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public boolean c() {
        return this.f3345j == 3 && this.f3346l == ((float) this.k);
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public void d(float f) {
        this.f3346l = f;
        if (this.i) {
            setTranslationY(f);
        }
        if (this.f3345j == 3) {
            return;
        }
        if (f <= 0.0f) {
            this.f3345j = 1;
            this.f3347n.setVisibility(0);
            this.m.setText("");
        }
        if (this.f3345j == 1) {
            if (f > 200.0f) {
                float f2 = (f - 200.0f) / 60.0f;
                if (f2 >= 0.273f) {
                    f2 = 0.273f;
                }
                l();
                ValueAnimator valueAnimator = this.p;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    this.f3347n.setProgress(f2);
                }
            }
            if (f >= this.k) {
                this.f3345j = 2;
                this.f3347n.setVisibility(0);
            }
        }
        if (this.f3345j != 2 || f > this.k) {
            return;
        }
        this.f3345j = 1;
        this.f3347n.setVisibility(0);
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public void e() {
        this.f3345j = 4;
        this.f3347n.setProgress(0.528f);
        this.f3347n.clearAnimation();
        this.f3347n.setVisibility(0);
        l();
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.p.cancel();
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public void f() {
        l();
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return;
        }
        this.o.start();
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public void g() {
        a7b.f("DefaultHeader", "removeAnimationListener begin");
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.p.cancel();
            this.p = null;
        }
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.o.cancel();
            this.o = null;
        }
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public int getHeaderHeight() {
        return this.k;
    }

    public String getRefreshCompleteString() {
        return this.s;
    }

    public String getRefreshingString() {
        return this.r;
    }

    public int getStatus() {
        return this.f3345j;
    }

    public void j(Context context, AttributeSet attributeSet, int i) {
        this.f3345j = 1;
        this.k = context.getResources().getDimensionPixelSize(R$dimen.lib_base_share_item_size);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.lib_base_pull_refresh_header, (ViewGroup) this, false);
        addView(viewInflate);
        this.m = (TextView) viewInflate.findViewById(R$id.tv_tip);
        this.f3347n = (LottieAnimationView) viewInflate.findViewById(R$id.iv_tip);
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.rkf
            @Override // java.lang.Runnable
            public final void run() {
                this.i.l();
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void l() {
        if (this.p == null || this.o == null) {
            this.f3347n.setImageAssetsFolder("loadingimg");
            n();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
            this.p = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(1000L);
            this.p.setRepeatCount(-1);
            this.p.setInterpolator(new LinearInterpolator());
            this.p.addUpdateListener(new a());
            this.p.addListener(new b());
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f);
            this.o = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.setDuration(600L);
            this.o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.qkf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.i.m(valueAnimator);
                }
            });
            this.o.addListener(new c());
        }
    }

    public final void n() {
        int i = R$raw.lib_base_loading_animation;
        if (i != this.t) {
            this.f3347n.setAnimation(i);
            this.t = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a7b.f("DefaultHeader", "onDetachedFromWindow");
        g();
    }

    @Override // com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView
    public void setParent(ViewGroup viewGroup) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = -this.k;
        viewGroup.addView(this, layoutParams);
    }

    public void setRefreshCompleteString(String str) {
        this.s = str;
    }

    public void setRefreshingString(String str) {
        this.r = str;
    }

    public void setRefreshingTextStr(String str) {
        this.m.setText(str);
    }

    public RefreshHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = 0.3f;
        this.r = getContext().getString(R$string.lib_base_down_to_refresh_ing);
        this.s = "";
        this.t = 0;
        j(context, attributeSet, i);
    }
}
