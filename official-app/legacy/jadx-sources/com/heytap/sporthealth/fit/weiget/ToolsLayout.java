package com.heytap.sporthealth.fit.weiget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ToolsLayout extends ConstraintLayout {
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<ViewGroup> f7792j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7793l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7794n;
    public Animator.AnimatorListener o;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ToolsLayout.this.f7794n = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ToolsLayout.this.f7794n = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ToolsLayout.this.f7794n = true;
        }
    }

    public ToolsLayout(Context context) {
        super(context);
        this.i = 136.0f;
        this.f7792j = new ArrayList();
        this.o = new a();
    }

    public final void f(int i, View view, long j2) {
        int top = view.getTop();
        int bottom = view.getBottom();
        int left = view.getLeft();
        int right = view.getRight();
        float f = bottom;
        float f2 = this.i;
        if (f < f2) {
            j(view, i != 0 ? -bottom : 0.0f, j2);
            return;
        }
        int i2 = this.m;
        if (i2 - top < f2) {
            j(view, i != 0 ? i2 - top : 0.0f, j2);
            return;
        }
        if (right < f2) {
            i(view, i != 0 ? -right : 0.0f, j2);
            return;
        }
        int i3 = this.f7793l;
        if (i3 - left < f2) {
            i(view, i != 0 ? i3 - left : 0.0f, j2);
        } else if (f2 == 0.0f) {
            this.i = MultiStateLayout.g(136.0f);
        }
    }

    public final void g(View view) {
        view.animate().cancel();
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.k;
    }

    public final void h(View view, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    f(i, viewGroup.getChildAt(i2), 0L);
                }
                return;
            }
        }
        f(i, view, 0L);
    }

    public void i(View view, float f, long j2) {
        g(view);
        view.animate().translationX(f).setDuration(300L).setListener(this.o).setStartDelay(j2).start();
    }

    public void j(View view, float f, long j2) {
        g(view);
        view.animate().translationY(f).setDuration(300L).setListener(this.o).setStartDelay(j2).start();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k = 0;
        requestLayout();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, this.f7793l, this.m);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7793l = i;
        this.m = i2;
        this.i = i2 / 2.0f;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.f7794n) {
            return;
        }
        this.f7792j.clear();
        h(this, i);
        this.k = i;
    }

    public void setVisibilityByTag(String str) {
        if (getChildCount() > 0) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (str.equals(childAt.getTag())) {
                    f(0, childAt, 0L);
                } else {
                    f(8, childAt, 0L);
                }
            }
        }
    }

    public ToolsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 136.0f;
        this.f7792j = new ArrayList();
        this.o = new a();
    }

    public ToolsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 136.0f;
        this.f7792j = new ArrayList();
        this.o = new a();
    }
}
