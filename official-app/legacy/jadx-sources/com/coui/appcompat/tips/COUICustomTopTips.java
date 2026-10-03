package com.coui.appcompat.tips;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.p009cardview.COUICardView;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.support.appcompat.R$attr;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUICustomTopTips extends COUICardView {
    public View r;
    public AnimatorSet s;
    public AnimatorSet t;
    public Animator.AnimatorListener u;
    public Animator.AnimatorListener v;

    public COUICustomTopTips(@NonNull Context context) {
        this(context, null);
    }

    public void c() {
        ph2.c(this, false);
        setContentView(getContentViewId());
        if (byf.f()) {
            setRadius(lh2.c(getContext(), R$attr.couiRoundCornerMRadius));
            setWeight(lh2.e(getContext(), R$attr.couiRoundCornerMWeight));
        } else {
            setRadius(lh2.c(getContext(), R$attr.couiRoundCornerM));
        }
        setCardBackgroundColor(ColorStateList.valueOf(lh2.a(getContext(), R$attr.couiColorFillThin)));
    }

    public AnimatorSet getAnimatorSetDismiss() {
        return this.t;
    }

    public AnimatorSet getAnimatorSetShow() {
        return this.s;
    }

    public View getContentView() {
        return this.r;
    }

    public abstract int getContentViewId();

    public void setAnimatorDismissListener(Animator.AnimatorListener animatorListener) {
        this.v = animatorListener;
    }

    public void setAnimatorSetDismiss(AnimatorSet animatorSet) {
        this.t = animatorSet;
    }

    public void setAnimatorSetShow(AnimatorSet animatorSet) {
        this.s = animatorSet;
    }

    public void setAnimatorShowListener(Animator.AnimatorListener animatorListener) {
        this.u = animatorListener;
    }

    public void setContentView(View view) {
        if (this.r != null) {
            throw new RuntimeException("Repeat calls are not allowed!!");
        }
        this.r = view;
        addView(view);
    }

    public COUICustomTopTips(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUICustomTopTips(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public void setContentView(@LayoutRes int i) {
        if (i == 0) {
            return;
        }
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }
}
