package com.coui.appcompat.seekbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.oplus.aiunit.vision.lh2;
import com.support.seekbar.R$attr;
import com.support.seekbar.R$color;
import com.support.seekbar.R$dimen;
import com.support.seekbar.R$style;
import com.support.seekbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 22)
public class COUIIntentSeekBar extends COUISeekBarDeprecate {
    public int k1;
    public int l1;
    public float m1;
    public boolean n1;

    public COUIIntentSeekBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar
    public int getSecondaryProgress() {
        return this.k1;
    }

    public final void l0(Canvas canvas) {
        float seekBarWidth = getSeekBarWidth();
        int seekBarCenterY = getSeekBarCenterY();
        float start = L() ? ((getStart() + this.T) + seekBarWidth) - (this.i * seekBarWidth) : getStart() + this.T + (this.i * seekBarWidth);
        float f = this.Q;
        float f2 = start - f;
        float f3 = start + f;
        this.u0.setColor(this.A);
        if (!this.u || this.n1) {
            float f4 = seekBarCenterY;
            float f5 = this.Q;
            canvas.drawRoundRect(f2, f4 - f5, f3, f4 + f5, f5, f5, this.u0);
        } else {
            float f6 = this.m1;
            float f7 = seekBarCenterY;
            float f8 = this.Q;
            canvas.drawRoundRect(f2 - f6, (f7 - f8) - f6, f3 + f6, f7 + f8 + f6, f8 + f6, f8 + f6, this.u0);
        }
        this.v0 = f2 + ((f3 - f2) / 2.0f);
    }

    @Override // com.coui.appcompat.seekbar.COUISeekBarDeprecate
    public void m(Canvas canvas, float f) {
        float f2;
        float f3;
        float start;
        float f4;
        if (this.z0) {
            int seekBarCenterY = getSeekBarCenterY();
            getWidth();
            getEnd();
            int i = this.s - this.t;
            if (L()) {
                start = getStart() + this.T + f;
                int i2 = this.q;
                int i3 = this.t;
                float f5 = i;
                float f6 = start - (((i2 - i3) * f) / f5);
                f4 = start - (((this.k1 - i3) * f) / f5);
                f2 = f6;
                f3 = start;
            } else {
                float start2 = this.T + getStart();
                int i4 = this.q;
                int i5 = this.t;
                float f7 = i;
                float f8 = (((i4 - i5) * f) / f7) + start2;
                float f9 = start2 + (((this.k1 - i5) * f) / f7);
                f2 = start2;
                f3 = f8;
                start = f9;
                f4 = f2;
            }
            this.u0.setColor(this.l1);
            float f10 = this.M;
            float f11 = seekBarCenterY;
            this.p0.set(f4 - f10, f11 - f10, start + f10, f10 + f11);
            RectF rectF = this.p0;
            float f12 = this.M;
            canvas.drawRoundRect(rectF, f12, f12, this.u0);
            if (this.n1) {
                super.m(canvas, f);
                return;
            }
            this.u0.setColor(this.y);
            RectF rectF2 = this.p0;
            float f13 = this.M;
            rectF2.set(f2 - f13, f11 - f13, f3 + f13, f11 + f13);
            RectF rectF3 = this.p0;
            float f14 = this.M;
            canvas.drawRoundRect(rectF3, f14, f14, this.u0);
            l0(canvas);
        }
    }

    public void setFollowThumb(boolean z) {
        this.n1 = z;
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgress(int i) {
        if (i >= 0) {
            this.k1 = Math.max(this.t, Math.min(i, this.s));
            invalidate();
        }
    }

    public void setSecondaryProgressColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l1 = v(this, colorStateList, ContextCompat.getColor(getContext(), R$color.coui_seekbar_secondary_progress_color));
            invalidate();
        }
    }

    public COUIIntentSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiIntentSeekBarStyle);
    }

    public COUIIntentSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, lh2.j(context) ? R$style.COUIIntentSeekBar_Dark : R$style.COUIIntentSeekBar);
    }

    public COUIIntentSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k1 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIIntentSeekBar, i, i2);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUIIntentSeekBar_couiSeekBarSecondaryProgressColor);
        this.n1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIIntentSeekBar_couiSeekBarIsFollowThumb, false);
        typedArrayObtainStyledAttributes.recycle();
        this.l1 = v(this, colorStateList, lh2.h(getContext(), R$color.coui_seekbar_progress_color_normal));
        this.m1 = getResources().getDimensionPixelSize(R$dimen.coui_seekbar_intent_thumb_out_shade_radius);
    }
}
