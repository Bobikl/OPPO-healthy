package com.coui.appcompat.reddot;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.support.reddot.R$dimen;
import com.support.reddot.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIRedDotFrameLayout extends FrameLayout {
    public static final int CIRCLE_TYPE = 1;
    public static final int RECTANGLE_TYPE = 0;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1983j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1984l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1985n;
    public int o;
    public int p;
    public View q;
    public COUIHintRedDot r;
    public int s;
    public final Runnable t;

    public COUIRedDotFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(COUIHintRedDot cOUIHintRedDot) {
        addView(cOUIHintRedDot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        requestLayout();
    }

    public final void c() {
        if (this.f1983j != 0) {
            final COUIHintRedDot cOUIHintRedDot = new COUIHintRedDot(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            cOUIHintRedDot.setLayoutParams(layoutParams);
            layoutParams.gravity = 8388661;
            cOUIHintRedDot.setPointMode(this.f1983j);
            int i = this.f1983j;
            if (i == 2 || i == 5) {
                cOUIHintRedDot.setViewHeight(this.p);
                cOUIHintRedDot.setPointText(this.k);
            } else {
                cOUIHintRedDot.setDotDiameter(this.o);
            }
            post(new Runnable() { // from class: com.oplus.aiunit.vision.ok2
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(cOUIHintRedDot);
                }
            });
            h();
        }
    }

    public final void d(AttributeSet attributeSet, int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_medium_icon_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_large_icon_size);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIRedDotFrameLayout, i, 0);
            this.f1983j = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIRedDotFrameLayout_couiHintRedPointMode, 0);
            this.k = typedArrayObtainStyledAttributes.getString(R$styleable.COUIRedDotFrameLayout_couiHintRedPointText);
            this.f1984l = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIRedDotFrameLayout_anchorViewShapeType, 0);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIRedDotFrameLayout_anchorViewDpSize, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f1983j;
        if (i2 == 0) {
            return;
        }
        int i3 = this.s;
        if (i3 < dimensionPixelSize) {
            if (i2 == 1 || i2 == 4) {
                this.o = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_small_reddot_size);
            }
            if (this.f1984l == 0) {
                int i4 = this.f1983j;
                if (i4 == 2 || i4 == 5) {
                    this.m = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_small_number_topend_margin_rectangle);
                } else {
                    this.m = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_small_icon_topend_margin_rectangle);
                }
            } else {
                int i5 = this.f1983j;
                if (i5 == 1 || i5 == 4) {
                    this.f1985n = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_small_icon_topend_margin_circle);
                }
            }
        } else if (i3 >= dimensionPixelSize2) {
            if (i2 == 2 || i2 == 5) {
                this.p = getResources().getDimensionPixelSize(R$dimen.coui_height_large);
            } else {
                this.o = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_large_reddot_size);
            }
            if (this.f1984l == 0) {
                int i6 = this.f1983j;
                if (i6 == 2 || i6 == 5) {
                    this.m = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_large_number_topend_margin_rectangle);
                } else {
                    this.m = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_large_icon_topend_margin_rectangle);
                }
            } else {
                int i7 = this.f1983j;
                if (i7 == 1 || i7 == 4) {
                    this.f1985n = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_large_icon_topend_margin_circle);
                }
            }
        } else {
            if (i2 == 1 || i2 == 4) {
                this.o = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_medium_reddot_size);
            }
            if (this.f1984l == 0) {
                int i8 = this.f1983j;
                if (i8 == 2 || i8 == 5) {
                    this.m = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_medium_number_topend_margin_rectangle);
                } else {
                    this.m = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_medium_icon_topend_margin_rectangle);
                }
            } else {
                int i9 = this.f1983j;
                if (i9 == 1 || i9 == 4) {
                    this.f1985n = getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_medium_icon_topend_margin_circle);
                }
            }
        }
        if (this.f1983j == 4) {
            this.o += getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_mode_stroke_extra_diameter);
        }
        if (this.f1983j == 5) {
            this.p += getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_mode_stroke_extra_diameter);
        }
    }

    public final boolean e() {
        return getLayoutDirection() == 1;
    }

    public COUIHintRedDot getRedDotView() {
        return this.r;
    }

    public final void h() {
        removeCallbacks(this.t);
        post(this.t);
    }

    public final void i() {
        if (this.r == null || this.q == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof COUIHintRedDot) {
                    this.r = (COUIHintRedDot) childAt;
                } else {
                    this.q = childAt;
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1983j == 0) {
            return;
        }
        View view = this.q;
        if (view == null || this.r == null) {
            if (view == null || this.r != null) {
                return;
            }
            view.layout(0, 0, view.getMeasuredWidth() + 0, this.q.getMeasuredHeight());
            return;
        }
        if (e()) {
            View view2 = this.q;
            int i5 = this.m;
            view2.layout(i5, i5, view2.getMeasuredWidth() + i5, this.m + this.q.getMeasuredHeight());
            COUIHintRedDot cOUIHintRedDot = this.r;
            int i6 = this.f1985n;
            cOUIHintRedDot.layout(i6, i6, cOUIHintRedDot.getWidth() + i6, this.f1985n + this.r.getHeight());
            return;
        }
        View view3 = this.q;
        view3.layout(0, this.m, view3.getMeasuredWidth() + 0, this.m + this.q.getMeasuredHeight());
        COUIHintRedDot cOUIHintRedDot2 = this.r;
        int width = getWidth() - this.r.getWidth();
        int i7 = this.f1985n;
        int width2 = getWidth();
        int i8 = this.f1985n;
        cOUIHintRedDot2.layout(width - i7, i7, width2 - i8, i8 + this.r.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1983j == 0) {
            return;
        }
        i();
        View view = this.q;
        if (view != null && this.r != null) {
            setMeasuredDimension(getMeasuredWidth() + this.m, getMeasuredHeight() + this.m);
        } else {
            if (view == null || this.r != null) {
                return;
            }
            setMeasuredDimension(view.getWidth(), this.q.getHeight());
        }
    }

    public COUIRedDotFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIRedDotFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "COUIRedDotFrameLayout";
        this.f1983j = 0;
        this.f1984l = 0;
        this.p = getResources().getDimensionPixelSize(R$dimen.coui_height);
        this.t = new Runnable() { // from class: com.oplus.aiunit.vision.nk2
            @Override // java.lang.Runnable
            public final void run() {
                this.i.g();
            }
        };
        d(attributeSet, i);
        c();
    }
}
