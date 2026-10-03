package com.coui.appcompat.poplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.byg;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.jf2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.graphics.OplusOutline;
import com.oplus.graphics.OplusOutlineAdapter;
import com.oplus.graphics.OplusPath;
import com.oplus.graphics.OplusPathAdapter;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.poplist.R$color;
import com.support.poplist.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class RoundFrameLayout extends FrameLayout {
    public static final int CANVAS_CLIP = 0;
    public static final int OUTLINE_CLIP = 1;
    public final Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f1869j;
    public Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f1870l;
    public RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1871n;
    public float o;
    public float p;
    public int q;
    public boolean r;
    public float s;
    public jf2 t;
    public OplusPathAdapter u;
    public int v;
    public int w;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (RoundFrameLayout.this.f1869j.isEmpty()) {
                RoundFrameLayout.this.i.set((int) RoundFrameLayout.this.m.left, (int) RoundFrameLayout.this.m.top, (int) RoundFrameLayout.this.m.right, (int) RoundFrameLayout.this.m.bottom);
            } else {
                outline.setAlpha(RoundFrameLayout.this.p);
                RoundFrameLayout.this.i.set(RoundFrameLayout.this.f1869j);
            }
            float f = RoundFrameLayout.this.o != 0.0f ? RoundFrameLayout.this.o : RoundFrameLayout.this.f1871n;
            if (!byf.g(RoundFrameLayout.this.t.y())) {
                outline.setRoundRect(RoundFrameLayout.this.i, f);
                return;
            }
            if (RoundFrameLayout.this.o()) {
                OplusOutline oplusOutline = new OplusOutline(outline);
                if (bn2.c() > 37) {
                    oplusOutline.setSmoothRoundRect(RoundFrameLayout.this.i, RoundFrameLayout.this.w, RoundFrameLayout.this.s);
                    return;
                } else {
                    oplusOutline.setSmoothRoundRect(RoundFrameLayout.this.i, f, RoundFrameLayout.this.s);
                    return;
                }
            }
            if (!RoundFrameLayout.this.p()) {
                outline.setRoundRect(RoundFrameLayout.this.i, f);
                return;
            }
            OplusOutlineAdapter oplusOutlineAdapter = new OplusOutlineAdapter(outline, 1);
            if (bn2.c() > 37) {
                oplusOutlineAdapter.setSmoothRoundRect(RoundFrameLayout.this.i, RoundFrameLayout.this.v, 3.0f);
            } else {
                oplusOutlineAdapter.setSmoothRoundRect(RoundFrameLayout.this.i, f);
            }
        }
    }

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.f1869j.isEmpty()) {
            getBackground().setBounds(this.f1869j);
        }
        n(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.r) {
            return false;
        }
        if (this.f1869j.isEmpty() || this.f1869j.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f1869j.isEmpty()) {
            getBackground().setBounds(this.f1869j);
        }
        super.draw(canvas);
    }

    public boolean getUseBackgroundBlur() {
        return this.t.y();
    }

    public void m() {
        this.f1869j.setEmpty();
        this.p = 1.0f;
        invalidateOutline();
    }

    public final void n(Canvas canvas) {
        canvas.save();
        canvas.clipPath(q());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean o() {
        return (byf.a() == 0 && this.s > 0.0f) || this.t.y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            bj2.c("RoundFrameLayout", "Hardware accelerate is disabled! Set background blur failed.");
            return;
        }
        if (this.t.y()) {
            this.t.u(this);
            float f = this.o;
            if (f == 0.0f) {
                f = this.f1871n;
            }
            if (byf.e()) {
                bj2.d("RoundFrameLayout", "current version support roundCorner when use blur");
                this.t.t(lh2.e(getContext(), R$attr.couiRoundCornerMWeight));
                if (bn2.c() > 37) {
                    f = this.w;
                }
            }
            this.t.o(f);
            this.t.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t.k();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    public final boolean p() {
        return byf.a() == 1;
    }

    public final Path q() {
        this.k.reset();
        float f = this.o;
        if (f == 0.0f) {
            f = this.f1871n;
        }
        float f2 = f;
        if (!byf.g(this.t.y())) {
            this.k.addRoundRect(this.m, f2, f2, Path.Direction.CW);
        } else if (o()) {
            OplusPath oplusPath = new OplusPath(this.k);
            if (bn2.c() > 37) {
                oplusPath.addSmoothRoundRect(this.m, this.w, this.s, Path.Direction.CW);
            } else {
                oplusPath.addSmoothRoundRect(this.m, f2, this.s, Path.Direction.CW);
            }
        } else if (p()) {
            if (this.u == null) {
                this.u = new OplusPathAdapter(this.k, 1);
            }
            if (bn2.c() > 37) {
                this.u.addSmoothRoundRect(this.m, f2, this.v, 3.0f, Path.Direction.CCW);
            } else {
                this.u.addSmoothRoundRect(this.m, f2, f2, Path.Direction.CCW);
            }
        } else {
            this.k.addRoundRect(this.m, f2, f2, Path.Direction.CW);
        }
        return this.k;
    }

    public void r(boolean z, AnimLevel animLevel) {
        this.t.v(z, animLevel);
    }

    public void s(int i, int i2, int i3, int i4, float f) {
        this.p = f;
        this.f1869j.set(i, i2, i3, i4);
        if (getBackground() != null) {
            getBackground().setBounds(this.f1869j);
        }
        invalidateOutline();
    }

    public void setAllowDispatchEvent(boolean z) {
        this.r = z;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (!this.t.y() || getBackground() == null) {
            return;
        }
        getBackground().setAlpha((int) (f * 255.0f));
    }

    public void setClipMode(int i) {
        this.q = i;
        if (i == 0) {
            setClipToOutline(false);
            setElevation(0.0f);
            setBackgroundColor(0);
        } else if (i == 1) {
            setClipToOutline(true);
            if (byg.a()) {
                byg.e(this, 3);
            } else {
                setElevation(getContext().getResources().getDimensionPixelSize(R$dimen.support_shadow_size_level_five));
                setOutlineSpotShadowColor(ContextCompat.getColor(getContext(), R$color.coui_popup_outline_spot_shadow_color));
            }
            setBackgroundColor(-1);
        }
    }

    public void setRadius(float f) {
        this.f1871n = f;
        postInvalidate();
    }

    public void setRoundCornerRadius(float f) {
        this.o = f;
        postInvalidate();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Rect();
        this.f1869j = new Rect();
        this.p = 1.0f;
        this.r = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundFrameLayout);
        this.o = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_couiRoundCornerRadius, 0.0f);
        this.f1871n = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundFrameLayout_rfRadius, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getInt(R$styleable.RoundFrameLayout_couiClipType, 0);
        this.s = typedArrayObtainStyledAttributes.getFloat(R$styleable.RoundFrameLayout_couirfRoundCornerWeight, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.v = getResources().getDimensionPixelSize(com.support.poplist.R$dimen.coui_popup_list_window_os_16_1_radius_16_dp);
        this.w = getResources().getDimensionPixelSize(com.support.poplist.R$dimen.coui_popup_list_window_os_16_1_radius_9_dp);
        this.k = new Path();
        this.f1870l = new Paint(1);
        this.m = new RectF();
        this.f1870l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setOutlineProvider(new a());
        setClipMode(this.q);
        setDefaultFocusHighlightEnabled(false);
        jf2 jf2Var = new jf2(getContext());
        this.t = jf2Var;
        jf2Var.r(ifk.a(lh2.h(getContext(), com.support.appcompat.R$color.coui_popup_list_mix_blur_light)));
        this.t.q(ifk.a(lh2.h(getContext(), com.support.appcompat.R$color.coui_popup_list_mix_blur_dark)));
        this.t.m(ifk.a(lh2.h(getContext(), com.support.appcompat.R$color.coui_popup_list_blend_blur_light)));
        this.t.l(ifk.a(lh2.h(getContext(), com.support.appcompat.R$color.coui_popup_list_blend_blur_dark)));
    }
}
