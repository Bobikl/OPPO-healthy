package com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes19.dex */
public class RotateImageView extends TwoStateImageView {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6909j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6910l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6911n;
    public long o;

    public RotateImageView(Context context) {
        super(context);
        this.i = 0;
        this.f6909j = 0;
        this.k = 0;
        this.f6910l = false;
        this.m = true;
        this.f6911n = 0L;
        this.o = 0L;
    }

    public void a(int i, boolean z) {
        if (getVisibility() == 0) {
            this.m = z;
        } else {
            this.m = false;
        }
        int i2 = i >= 0 ? i % 360 : (i % 360) + 360;
        if (i2 == this.k) {
            return;
        }
        this.k = i2;
        if (this.m) {
            this.f6909j = this.i;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f6911n = jCurrentAnimationTimeMillis;
            int i3 = this.k - this.i;
            if (i3 < 0) {
                i3 += 360;
            }
            if (i3 > 180) {
                i3 -= 360;
            }
            this.f6910l = i3 >= 0;
            this.o = jCurrentAnimationTimeMillis + ((long) ((Math.abs(i3) * 1000) / 270));
        } else {
            this.i = i2;
        }
        invalidate();
    }

    public int getDegree() {
        return this.k;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        if (i == 0 || i2 == 0) {
            return;
        }
        if (this.i != this.k) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (jCurrentAnimationTimeMillis < this.o) {
                int i3 = (int) (jCurrentAnimationTimeMillis - this.f6911n);
                int i4 = this.f6909j;
                if (!this.f6910l) {
                    i3 = -i3;
                }
                int i5 = i4 + ((i3 * 270) / 1000);
                this.i = i5 >= 0 ? i5 % 360 : (i5 % 360) + 360;
                invalidate();
            } else {
                this.i = this.k;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int width = (getWidth() - paddingLeft) - paddingRight;
        int height = (getHeight() - paddingTop) - paddingBottom;
        int saveCount = canvas.getSaveCount();
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER && (width < i || height < i2)) {
            float f = width;
            float f2 = height;
            float fMin = Math.min(f / i, f2 / i2);
            canvas.scale(fMin, fMin, f * 0.5f, f2 * 0.5f);
        }
        canvas.translate(paddingLeft + (width / 2), paddingTop + (height / 2));
        canvas.rotate(-this.i);
        canvas.translate((-i) / 2, (-i2) / 2);
        drawable.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.f6909j = 0;
        this.k = 0;
        this.f6910l = false;
        this.m = true;
        this.f6911n = 0L;
        this.o = 0L;
    }

    public RotateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.f6909j = 0;
        this.k = 0;
        this.f6910l = false;
        this.m = true;
        this.f6911n = 0L;
        this.o = 0L;
    }
}
