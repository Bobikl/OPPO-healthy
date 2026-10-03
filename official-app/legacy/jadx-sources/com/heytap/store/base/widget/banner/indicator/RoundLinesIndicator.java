package com.heytap.store.base.widget.banner.indicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class RoundLinesIndicator extends BaseIndicator {
    private float progress;

    public RoundLinesIndicator(Context context) {
        this(context, null);
    }

    @Override // com.heytap.store.base.widget.banner.indicator.BaseIndicator
    public boolean animationPageSelected(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", this.progress, i / this.config.getIndicatorSize());
        objectAnimatorOfFloat.setDuration(this.config.getAnimDuration());
        objectAnimatorOfFloat.start();
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.config.getIndicatorSize() <= 1) {
            return;
        }
        this.mPaint.setColor(this.config.getNormalColor());
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, canvas.getWidth(), this.config.getHeight()), this.config.getRadius(), this.config.getRadius(), this.mPaint);
        this.mPaint.setColor(this.config.getSelectedColor());
        float width = canvas.getWidth() * this.progress;
        canvas.drawRoundRect(new RectF(width, 0.0f, this.config.getSelectedWidth() + width, this.config.getHeight()), this.config.getRadius(), this.config.getRadius(), this.mPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int indicatorSize = this.config.getIndicatorSize();
        if (indicatorSize <= 1) {
            return;
        }
        setMeasuredDimension(this.config.getSelectedWidth() * indicatorSize, this.config.getHeight());
    }

    @Override // com.heytap.store.base.widget.banner.indicator.BaseIndicator, com.heytap.store.base.widget.banner.indicator.Indicator
    public void onPageChanged(int i, int i2) {
        this.progress = i2 / i;
        super.onPageChanged(i, i2);
    }

    public void setProgress(float f) {
        this.progress = f;
        invalidate();
    }

    public RoundLinesIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundLinesIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progress = 1.0f;
        this.mPaint.setStyle(Paint.Style.FILL);
    }
}
