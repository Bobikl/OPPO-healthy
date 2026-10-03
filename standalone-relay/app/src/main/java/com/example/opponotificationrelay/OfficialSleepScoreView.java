package com.example.opponotificationrelay;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/** Ported from official 6.6.7 SleepScoreProgressView. See analysis/reuse-audit-v140/PROVENANCE.md. */
public final class OfficialSleepScoreView extends View {
    private static final float CIRCLE_DEGREE = 360.0f;

    private static final String TAG = "StepProgressView";
    private boolean fill;
    private int gradientBottomColor;
    private int gradientTopColor;
    private int mMaxProgress;

    private Paint mPaintBg;
    private int mProgress;

    private Paint mProgressPaint;

    private Paint mShadowProgressPaint;
    private float mSubTextSize;
    private float mTextNoDataSize;

    private Paint mTextPaint;
    private float mTextSize;

    private Paint mTextSubPaint;
    private final Typeface medium;

    private String noCurDataTip;

    private final PathInterpolator pathInterpolator;

    private final RectF rectF;
    private float shadowOffsetRadius;
    private final float shadowPaddingAngle;
    private float strokeWidth;

    private String subTitleStr;
    private float sweepAngle;

    private Rect textRect;
    private float textSubPadding;
    private float textTop;
    private float textYOffset;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfficialSleepScoreView(Context context) {
        super(OfficialUiScale.darkContext(context));
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mTextSubPaint = new Paint();
        this.textRect = new Rect();
        this.mMaxProgress = 100;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.subTitleStr = "";
        this.shadowPaddingAngle = 3.0f;
        this.shadowOffsetRadius = 2.0f;
        this.fill = true;
        initView(getContext());
    }

    private final long getAniDuration(float circleNum) {
        long j2;
        double d = circleNum;
        boolean z = false;
        if (0.0d <= d && d <= 1.0d) {
            z = true;
        }
        if (z) {
            j2 = 600;
        } else {
            j2 = d > 1.0d ? (long) (600.0f * circleNum) : 0L;
        }
        if (j2 > 3000) {
            j2 = 3000;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getTimeDuration duration is ");
        sb.append(j2);
        sb.append(" ,circleNum:");
        sb.append(circleNum);
        return j2;
    }

    private final int getTextHeight(Paint paint, String str, Rect rect) {
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    private final void initView(Context context) {
        this.strokeWidth = getResources().getDimension(R.dimen.official_health_sleep_progress_circle_stroke_width);
        this.shadowOffsetRadius = getResources().getDimension(R.dimen.official_health_sleep_progress_shadow_offset_radius);
        this.mTextSize = getResources().getDimension(R.dimen.official_health_sleep_progress_text_size);
        this.mTextNoDataSize = getResources().getDimension(R.dimen.official_health_sleep_progress_no_data_text_size);
        this.mSubTextSize = getResources().getDimension(R.dimen.official_health_sleep_progress_sub_text_size);
        this.textYOffset = getResources().getDimension(R.dimen.official_health_sleep_progress_text_y_offset);
        this.textTop = getResources().getDimension(R.dimen.official_health_sleep_progress_sub_text_top);
        this.textSubPadding = getResources().getDimension(R.dimen.official_health_sleep_progress_sub_text_padding);
        this.mPaintBg.setAntiAlias(true);
        this.mPaintBg.setStrokeCap(Paint.Cap.ROUND);
        this.mPaintBg.setColor(context.getColor(R.color.official_health_sleep_progress_circle_bg));
        this.mPaintBg.setStrokeWidth(this.strokeWidth);
        this.mPaintBg.setTextAlign(Paint.Align.CENTER);
        this.mPaintBg.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressPaint.setColor(context.getColor(R.color.official_health_sleep_7366FF));
        this.mProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mShadowProgressPaint.setAntiAlias(true);
        this.mShadowProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mShadowProgressPaint.setColor(context.getColor(R.color.official_lib_base_card_white_bg_3));
        this.mShadowProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mShadowProgressPaint.setStyle(Paint.Style.STROKE);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(context.getColor(R.color.official_health_base_black));
        this.mTextPaint.setStrokeWidth(2.0f);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(this.medium);
        this.mTextSubPaint.setAntiAlias(true);
        this.mTextSubPaint.setColor(context.getColor(R.color.official_health_base_black_55alpha));
        this.mTextSubPaint.setStrokeWidth(2.0f);
        this.mTextSubPaint.setTextSize(this.mSubTextSize);
        this.mTextSubPaint.setStyle(Paint.Style.FILL);
        this.mTextSubPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextSubPaint.setTypeface(Typeface.DEFAULT);
        this.gradientTopColor = context.getColor(R.color.official_health_sleep_color_b462f4);
        this.gradientBottomColor = context.getColor(R.color.official_health_sleep_color_7366ff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAni$lambda$0(OfficialSleepScoreView this$0, ValueAnimator valueAnimator, ValueAnimator it) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        this$0.sweepAngle = (((Float) animatedValue).floatValue() * 360.0f) / this$0.mMaxProgress;
        this$0.invalidate();
    }

    public final boolean getFill() {
        return this.fill;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        float width = (getWidth() / 2.0f) - (this.strokeWidth / f);
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width2, height, width, this.mPaintBg);
        if (this.mProgress <= 0 || this.mMaxProgress <= 0) {
            String str = this.noCurDataTip;
            this.mTextPaint.setShader(null);
            this.mTextPaint.setTextSize(this.mTextNoDataSize);
            canvas.drawText(str, width2, height + (getTextHeight(this.mTextPaint, str, this.textRect) / 2), this.mTextPaint);
            return;
        }
        SweepGradient sweepGradient = new SweepGradient(width2, height, new int[]{this.gradientTopColor, this.gradientBottomColor}, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(-95.0f, width2, height);
        sweepGradient.setLocalMatrix(matrix);
        this.mProgressPaint.setShader(sweepGradient);
        RectF rectF = this.rectF;
        float f2 = this.strokeWidth;
        rectF.set(f2 / 2.0f, f2 / 2.0f, getWidth() - (this.strokeWidth / 2.0f), getWidth() - (this.strokeWidth / 2.0f));
        float f3 = this.sweepAngle;
        if (f3 <= 348.0f) {
            RectF rectF2 = this.rectF;
            float f4 = this.shadowPaddingAngle;
            canvas.drawArc(rectF2, (-90.0f) - f4, (f4 * f) + f3, false, this.mShadowProgressPaint);
            canvas.drawArc(this.rectF, -90.0f, this.sweepAngle, false, this.mProgressPaint);
        } else if (f3 < 360.0f) {
            RectF rectF3 = this.rectF;
            float f5 = this.shadowPaddingAngle;
            canvas.drawArc(rectF3, (-90.0f) - f5, f5, false, this.mShadowProgressPaint);
            canvas.drawArc(this.rectF, -90.0f, 90.0f, false, this.mProgressPaint);
            canvas.drawArc(this.rectF, this.sweepAngle - 90.0f, this.shadowPaddingAngle, false, this.mShadowProgressPaint);
            canvas.drawArc(this.rectF, 0.0f, this.sweepAngle - 90.0f, false, this.mProgressPaint);
        } else {
            float f6 = f3 - (((int) (f3 / 360)) * 360);
            canvas.drawArc(this.rectF, -90.0f, 360.0f, false, this.mProgressPaint);
            if (!this.fill) {
                float f7 = f6 - 90.0f;
                canvas.drawArc(this.rectF, f7, this.shadowPaddingAngle, false, this.mShadowProgressPaint);
                RectF rectF4 = this.rectF;
                float f8 = this.shadowPaddingAngle;
                float f9 = this.shadowOffsetRadius;
                canvas.drawArc(rectF4, (f7 - f8) - f9, f8 + f9, false, this.mProgressPaint);
            }
        }
        String strValueOf = String.valueOf(this.mProgress);
        this.mTextPaint.setTextSize(this.mTextSize);
        int textHeight = getTextHeight(this.mTextPaint, strValueOf, this.textRect);
        int iWidth = this.textRect.width() / 2;
        float f10 = (height + (textHeight / 2)) - this.textYOffset;
        Rect rect = this.textRect;
        float f11 = iWidth;
        this.mTextPaint.setShader(new LinearGradient(width2 - f11, f10 + rect.bottom, width2 + f11, f10 + rect.top, this.gradientTopColor, this.gradientBottomColor, Shader.TileMode.CLAMP));
        canvas.drawText(strValueOf, width2, f10, this.mTextPaint);
        canvas.drawText(this.subTitleStr, width2, f10 + getTextHeight(this.mTextSubPaint, this.subTitleStr, this.textRect) + this.textTop, this.mTextSubPaint);
    }

    public final void setData(int maxProgress, int progress, String subTitleStr, String noCurDataTip) {
        this.mMaxProgress = maxProgress;
        this.mProgress = progress;
        this.subTitleStr = subTitleStr;
        this.noCurDataTip = noCurDataTip;
        this.sweepAngle = maxProgress > 0 ? (progress * 360.0f) / maxProgress : 0;
        setContentDescription("睡眠评分 "+(progress>0?progress+"分":"暂无评分"));
        invalidate();
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final void startAni(boolean startAni) {
        int i;
        int i2 = this.mProgress;
        if (i2 <= 0 || (i = this.mMaxProgress) <= 0) {
            invalidate();
            return;
        }
        if (!startAni) {
            this.sweepAngle = (i2 * 360.0f) / i;
            invalidate();
            return;
        }
        float f = (float)i2 / i;
        if (f > 3.0f) {
            f = (f % 1) + 2.0f;
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.vqh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OfficialSleepScoreView.startAni$lambda$0(OfficialSleepScoreView.this, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(getAniDuration(f));
        valueAnimatorOfFloat.setInterpolator(this.pathInterpolator);
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfficialSleepScoreView(Context context, AttributeSet attributeSet) {
        super(OfficialUiScale.darkContext(context), attributeSet);
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mTextSubPaint = new Paint();
        this.textRect = new Rect();
        this.mMaxProgress = 100;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.subTitleStr = "";
        this.shadowPaddingAngle = 3.0f;
        this.shadowOffsetRadius = 2.0f;
        this.fill = true;
        initView(getContext());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfficialSleepScoreView(Context context, AttributeSet attributeSet, int i) {
        super(OfficialUiScale.darkContext(context), attributeSet, i);
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mTextSubPaint = new Paint();
        this.textRect = new Rect();
        this.mMaxProgress = 100;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.subTitleStr = "";
        this.shadowPaddingAngle = 3.0f;
        this.shadowOffsetRadius = 2.0f;
        this.fill = true;
        initView(getContext());
    }
}
