package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ej2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.vi2;
import com.oplus.aiunit.vision.xr9;
import com.oplus.aiunit.vision.zw3;

/* JADX INFO: loaded from: classes13.dex */
public class ListSelectedItemLayout extends COUICheckedLinearLayout implements xr9 {
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1950j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hm2 f1951l;
    public ej2 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public boolean f1952n;

    @Deprecated
    public int o;

    @Deprecated
    public Interpolator p;

    @Deprecated
    public Interpolator q;

    public ListSelectedItemLayout(Context context) {
        this(context, null);
    }

    public void a(boolean z) {
        this.k = z;
    }

    public final void b(MotionEvent motionEvent) {
        if (isEnabled() && isClickable() && this.f1950j) {
            int action = motionEvent.getAction();
            if (action == 0) {
                d();
            } else if (action == 1 || action == 3) {
                f();
            }
        }
    }

    public final void c() {
        this.m = new ej2(getContext(), 1);
        Path layoutPath = getLayoutPath();
        if (layoutPath != null) {
            this.m.D(layoutPath);
        } else {
            this.m.E(this.i, 0.0f, 0.0f);
        }
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = getBackground() == null ? new ColorDrawable(0) : getBackground();
        drawableArr[1] = this.m;
        hm2 hm2Var = new hm2(drawableArr);
        this.f1951l = hm2Var;
        hm2Var.g(this.f1950j);
        super.setBackground(this.f1951l);
    }

    public void d() {
        e(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.k) {
            if (isEnabled() && motionEvent.getActionMasked() == 9) {
                this.m.B(true, true, true);
            }
            if (motionEvent.getActionMasked() == 10) {
                this.m.B(false, false, true);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.k) {
            b(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e(boolean z) {
        hm2 hm2Var = this.f1951l;
        if (hm2Var == null) {
            return;
        }
        if (!z) {
            hm2Var.g(false);
        }
        this.f1951l.i(true);
        if (z) {
            return;
        }
        this.f1951l.g(true);
    }

    public void f() {
        g(true);
    }

    public void g(boolean z) {
        hm2 hm2Var = this.f1951l;
        if (hm2Var == null) {
            return;
        }
        if (!z) {
            hm2Var.g(false);
        }
        this.f1951l.i(false);
        if (z) {
            return;
        }
        this.f1951l.g(true);
    }

    public Path getLayoutPath() {
        return null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k) {
            b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        hm2 hm2Var = this.f1951l;
        if (hm2Var == null) {
            super.setBackground(drawable);
        } else if (drawable == null) {
            hm2Var.j(new ColorDrawable(0));
        } else {
            hm2Var.j(drawable);
        }
    }

    @Deprecated
    public void setBackgroundAnimationDrawable(Drawable drawable) {
    }

    public void setBackgroundAnimationEnabled(boolean z) {
        this.f1950j = z;
        hm2 hm2Var = this.f1951l;
        if (hm2Var == null) {
            return;
        }
        hm2Var.g(z);
    }

    public void setConfigurationChangeListener(zw3 zw3Var) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!z && isEnabled()) {
            f();
        }
        super.setEnabled(z);
    }

    public void setPositionInGroup(int i) {
    }

    public void setPressScaleEffectEnable(boolean z) {
        hm2 hm2Var = this.f1951l;
        if (hm2Var == null) {
            return;
        }
        if (z) {
            hm2Var.b(this);
        } else {
            hm2Var.a();
        }
    }

    public ListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListSelectedItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new RectF();
        this.f1950j = true;
        this.k = false;
        this.f1952n = false;
        this.o = 2;
        this.p = new PathInterpolator(0.17f, 0.17f, 0.67f, 1.0f);
        this.q = new vi2();
        c();
        setDefaultFocusHighlightEnabled(false);
    }
}
