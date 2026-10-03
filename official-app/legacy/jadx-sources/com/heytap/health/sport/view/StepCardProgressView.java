package com.heytap.health.sport.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.heytap.health.sport.R$drawable;
import com.heytap.health.sport.R$styleable;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepCardProgressView extends View {
    private static final String TAG = "StepCardProgressView";
    private ObjectAnimator animator;
    private int arrowColor;
    private int bgColor;
    private Paint bgPaint;
    private Drawable drawable;
    private Path path;
    private float phaseX;
    private float phaseY;
    private int step;
    private int stepGoal;
    private int valueColor;

    public StepCardProgressView(Context context) {
        super(context);
        this.step = 0;
        this.stepGoal = 8000;
        this.bgPaint = new Paint();
        this.path = new Path();
        this.arrowColor = -16777216;
        this.bgColor = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.valueColor = -16711936;
        this.phaseX = 1.0f;
        this.phaseY = 0.0f;
        initAttr(context, null);
    }

    private float dp(float f) {
        return ejg.a(getContext(), f);
    }

    private void drawArrow(Canvas canvas) {
        float fMax;
        float fMin;
        float measuredWidth = getMeasuredWidth() * (this.step / this.stepGoal);
        float measuredHeight = getMeasuredHeight() * 0.33333334f;
        float fCeil = (float) Math.ceil((2.0d / Math.sqrt(3.0d)) * ((double) measuredHeight));
        if (measuredWidth > getMeasuredWidth() / 2.0f) {
            fMin = Math.min(measuredWidth + (fCeil / 2.0f), getMeasuredWidth());
            fMax = fMin - fCeil;
        } else {
            fMax = Math.max(0.0f, measuredWidth - (fCeil / 2.0f));
            fMin = fMax + fCeil;
        }
        float f = this.phaseX;
        this.drawable.setBounds((int) (fMax * f), 0, (int) Math.max(fCeil, fMin * f), (int) measuredHeight);
        this.drawable.draw(canvas);
    }

    private void drawBackground(Canvas canvas) {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight() * 0.33333334f;
        this.bgPaint.setColor(this.bgColor);
        this.bgPaint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(new RectF(0.0f, measuredHeight, measuredWidth, getMeasuredHeight()), dp(3.0f), dp(3.0f), this.bgPaint);
    }

    private void drawStepBg(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * (this.step / this.stepGoal);
        if (measuredWidth > getMeasuredWidth()) {
            measuredWidth = getMeasuredWidth();
        }
        float f = measuredWidth * this.phaseX;
        float measuredHeight = getMeasuredHeight() * 0.33333334f;
        this.bgPaint.setColor(this.valueColor);
        this.bgPaint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(0.0f, measuredHeight, f, getMeasuredHeight(), dp(3.0f), dp(3.0f), this.bgPaint);
    }

    private void initAttr(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.Sport_StepCardProgressView, 0, 0);
        try {
            this.bgColor = typedArrayObtainStyledAttributes.getColor(R$styleable.Sport_StepCardProgressView_sport_bg_color, BannerConfig.INDICATOR_SELECTED_COLOR);
            this.arrowColor = typedArrayObtainStyledAttributes.getColor(R$styleable.Sport_StepCardProgressView_sport_arrow_color, -16777216);
            this.valueColor = typedArrayObtainStyledAttributes.getColor(R$styleable.Sport_StepCardProgressView_sport_value_color, -16711936);
            this.drawable = context.getDrawable(R$drawable.sports_ic_arrow);
            typedArrayObtainStyledAttributes.recycle();
            this.bgPaint.setAntiAlias(true);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public float getPhaseX() {
        return this.phaseX;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBackground(canvas);
        drawStepBg(canvas);
        drawArrow(canvas);
    }

    public void setBgColor(int i) {
        this.bgColor = i;
    }

    public void setData(int i, int i2) {
        a7b.f(TAG, "setData:" + i + "," + i2);
        this.step = i;
        this.stepGoal = i2;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public void setPhaseX(float f) {
        StringBuilder sb = new StringBuilder();
        sb.append("setPhaseX:");
        sb.append(f);
        this.phaseX = f;
        invalidate();
    }

    public void startAnimator() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        this.animator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(667L);
        this.animator.start();
    }

    public StepCardProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.step = 0;
        this.stepGoal = 8000;
        this.bgPaint = new Paint();
        this.path = new Path();
        this.arrowColor = -16777216;
        this.bgColor = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.valueColor = -16711936;
        this.phaseX = 1.0f;
        this.phaseY = 0.0f;
        initAttr(context, attributeSet);
    }

    public StepCardProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.step = 0;
        this.stepGoal = 8000;
        this.bgPaint = new Paint();
        this.path = new Path();
        this.arrowColor = -16777216;
        this.bgColor = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.valueColor = -16711936;
        this.phaseX = 1.0f;
        this.phaseY = 0.0f;
        initAttr(context, attributeSet);
    }
}
