package com.heytap.health.extenalcard.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.extenalcard.R$color;
import com.heytap.health.extenalcard.R$dimen;
import com.heytap.health.extenalcard.view.StepWeekBarChart;
import com.oplus.aiunit.vision.a7b;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001EB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b=\u0010AB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010?\u0012\u0006\u0010B\u001a\u00020\u000e¢\u0006\u0004\b=\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014J<\u0010\u0016\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010/\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u00100\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010%R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010'R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010'R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010'R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0016\u00107\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010%R\u0016\u00108\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010%R\u0016\u00109\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010%R\u0016\u0010:\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010%R\u0016\u0010;\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010%R\u0016\u0010<\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010%¨\u0006F"}, d2 = {"Lcom/heytap/health/extenalcard/view/StepWeekBarChart;", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "initView", "initBarChartRect", "Landroid/graphics/Canvas;", "canvas", "drawRightYAxisText", "drawXAxisLabel", "drawBarChart", "onDraw", "", "", "dataList", "maxYAxisValue", "minYAxisValue", "limitLineValue", "", "xAxisLeftLabel", "xAxisRightLabel", "setDataList", "", "duration", "startAni", "Landroid/graphics/Paint;", "mRenderPaint", "Landroid/graphics/Paint;", "mLimitLinePaint", "Landroid/graphics/Path;", "roundPath", "Landroid/graphics/Path;", "roundBgPath", "mTextPaint", "", "mTextSize", UserInfo.SEX_FEMALE, "padding", "I", "Landroid/graphics/RectF;", "barChartRectF", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "textRect", "Landroid/graphics/Rect;", "centerX", "barWidthScale", "barRadius", "mDataList", "Ljava/util/List;", "barBgColor", "barColor", "labelColor", "Ljava/lang/String;", "xLabelMarginTop", "yLabelMarginLeft", "yAxisLabelHeight", "yAxisLabelMaxWidth", "xAxisLabelHeight", "phaseY", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "extenalcard_release"}, k = 1, mv = {1, 8, 0})
public final class StepWeekBarChart extends View {

    @NotNull
    private static final String TAG = "StepWeekBarChart";
    private int barBgColor;

    @NotNull
    private RectF barChartRectF;
    private int barColor;
    private float barRadius;
    private float barWidthScale;
    private float centerX;
    private int labelColor;
    private int limitLineValue;

    @NotNull
    private final List<Integer> mDataList;

    @NotNull
    private final Paint mLimitLinePaint;

    @NotNull
    private final Paint mRenderPaint;

    @NotNull
    private final Paint mTextPaint;
    private float mTextSize;
    private int maxYAxisValue;
    private int minYAxisValue;
    private float padding;
    private float phaseY;

    @NotNull
    private final Path roundBgPath;

    @NotNull
    private final Path roundPath;

    @NotNull
    private Rect textRect;
    private float xAxisLabelHeight;

    @NotNull
    private String xAxisLeftLabel;

    @NotNull
    private String xAxisRightLabel;
    private float xLabelMarginTop;
    private float yAxisLabelHeight;
    private float yAxisLabelMaxWidth;
    private float yLabelMarginLeft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepWeekBarChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRenderPaint = new Paint();
        this.mLimitLinePaint = new Paint();
        this.roundPath = new Path();
        this.roundBgPath = new Path();
        this.mTextPaint = new Paint();
        this.maxYAxisValue = 10000;
        this.barChartRectF = new RectF();
        this.textRect = new Rect();
        this.barWidthScale = 0.55f;
        this.barRadius = 10.0f;
        this.mDataList = new ArrayList();
        this.xAxisLeftLabel = "";
        this.xAxisRightLabel = "";
        initView(context);
    }

    private final void drawBarChart(Canvas canvas) {
        float f = this.barWidthScale;
        if (f <= 0.0f || f >= 1.0f) {
            this.barWidthScale = 0.5f;
        }
        float fWidth = this.barChartRectF.width() / (this.mDataList.size() - (1 - this.barWidthScale));
        float f2 = this.barWidthScale * fWidth;
        float fHeight = this.barChartRectF.height() / Math.abs(this.maxYAxisValue - this.minYAxisValue);
        this.roundBgPath.reset();
        this.roundPath.reset();
        int size = this.mDataList.size();
        for (int i = 0; i < size; i++) {
            float f3 = i * fWidth;
            float f4 = f3 + f2;
            Path path = this.roundBgPath;
            RectF rectF = this.barChartRectF;
            RectF rectF2 = new RectF(f3, rectF.top, f4, rectF.bottom);
            float f5 = this.barRadius;
            path.addRoundRect(rectF2, new float[]{f5, f5, f5, f5, f5, f5, f5, f5}, Path.Direction.CW);
            int iIntValue = this.mDataList.get(i).intValue();
            if (iIntValue > 0) {
                RectF rectF3 = this.barChartRectF;
                float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.barChartRectF.top, (rectF3.top + rectF3.height()) - ((iIntValue * this.phaseY) * fHeight));
                Path path2 = this.roundPath;
                RectF rectF4 = new RectF(f3, fCoerceAtLeast, f4, this.barChartRectF.bottom);
                float f6 = this.barRadius;
                path2.addRoundRect(rectF4, new float[]{f6, f6, f6, f6, f6, f6, f6, f6}, Path.Direction.CW);
            }
        }
        this.mRenderPaint.setColor(this.barBgColor);
        if (canvas != null) {
            canvas.drawPath(this.roundBgPath, this.mRenderPaint);
        }
        this.mRenderPaint.setColor(this.barColor);
        if (canvas != null) {
            canvas.drawPath(this.roundPath, this.mRenderPaint);
        }
    }

    private final void drawRightYAxisText(Canvas canvas) {
        float f;
        float f2 = this.yAxisLabelHeight;
        float f3 = f2 / 2.0f;
        RectF rectF = this.barChartRectF;
        float f4 = rectF.top + f3;
        float f5 = rectF.bottom - f3;
        float f6 = f2 + this.padding;
        int i = this.minYAxisValue + 1;
        int i2 = this.maxYAxisValue;
        int i3 = this.limitLineValue;
        if (i <= i3 && i3 <= i2) {
            float fHeight = (rectF.height() / Math.abs(this.maxYAxisValue - this.minYAxisValue)) * (this.maxYAxisValue - this.limitLineValue);
            RectF rectF2 = this.barChartRectF;
            f = fHeight + rectF2.top;
            if (canvas != null) {
                canvas.drawLine(rectF2.left, f, rectF2.right, f, this.mLimitLinePaint);
            }
            if (f < f4) {
                f = f4;
            } else if (f > f5) {
                f = f5;
            }
            float width = (getWidth() - this.padding) - this.mTextPaint.measureText(String.valueOf(this.maxYAxisValue));
            this.mTextPaint.setTextAlign(Paint.Align.LEFT);
            this.mTextPaint.setColor(this.barColor);
            if (canvas != null) {
                canvas.drawText(String.valueOf(this.limitLineValue), width, ViewExtendKt.getDrawTextY(this.mTextPaint, f), this.mTextPaint);
            }
        } else {
            f = 0.0f;
        }
        this.mTextPaint.setTextAlign(Paint.Align.LEFT);
        this.mTextPaint.setColor(this.labelColor);
        float width2 = (getWidth() - this.padding) - this.mTextPaint.measureText(String.valueOf(this.maxYAxisValue));
        if (f > 0.0f && Math.abs(f4 - f) <= f6) {
            a7b.f(TAG, "topYLabel limitLine coincide");
        } else if (canvas != null) {
            canvas.drawText(String.valueOf(this.maxYAxisValue), width2, ViewExtendKt.getDrawTextY(this.mTextPaint, f4), this.mTextPaint);
        }
        if (f > 0.0f && Math.abs(f5 - f) <= f6) {
            a7b.f(TAG, "bottomYLabel limitLine coincide");
        } else if (canvas != null) {
            canvas.drawText(String.valueOf(this.minYAxisValue), width2, ViewExtendKt.getDrawTextY(this.mTextPaint, f5), this.mTextPaint);
        }
        float fHeight2 = (this.barChartRectF.height() / 2) + this.barChartRectF.top;
        int iAbs = Math.abs(this.maxYAxisValue - this.minYAxisValue) / 2;
        if (f > 0.0f && Math.abs(fHeight2 - f) <= f6) {
            a7b.f(TAG, "centerYLabel limitLine coincide");
        } else if (canvas != null) {
            canvas.drawText(String.valueOf(iAbs), width2, ViewExtendKt.getDrawTextY(this.mTextPaint, fHeight2), this.mTextPaint);
        }
    }

    private final void drawXAxisLabel(Canvas canvas) {
        float height = getHeight() - this.padding;
        if (this.xAxisLeftLabel.length() > 0) {
            this.mTextPaint.setTextAlign(Paint.Align.LEFT);
            if (canvas != null) {
                canvas.drawText(this.xAxisLeftLabel, 0.0f, height, this.mTextPaint);
            }
        }
        if (this.xAxisRightLabel.length() > 0) {
            float width = ((getWidth() - this.padding) - this.yAxisLabelMaxWidth) - this.yLabelMarginLeft;
            this.mTextPaint.setTextAlign(Paint.Align.RIGHT);
            if (canvas != null) {
                canvas.drawText(this.xAxisRightLabel, width, height, this.mTextPaint);
            }
        }
    }

    private final void initBarChartRect() {
        this.yAxisLabelMaxWidth = this.mTextPaint.measureText(String.valueOf(this.maxYAxisValue));
        this.yAxisLabelHeight = ViewExtendKt.getTextHeight(this.mTextPaint, String.valueOf(this.maxYAxisValue), this.textRect);
        this.xAxisLabelHeight = ViewExtendKt.getTextHeight(this.mTextPaint, this.xAxisLeftLabel, this.textRect);
        RectF rectF = this.barChartRectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = ((getWidth() - this.padding) - this.mTextPaint.measureText(String.valueOf(this.maxYAxisValue))) - this.yLabelMarginLeft;
        this.barChartRectF.bottom = (getHeight() - this.xAxisLabelHeight) - this.xLabelMarginTop;
        RectF rectF2 = this.barChartRectF;
        a7b.f(TAG, "barChartRect:" + rectF2 + " ,width:" + rectF2.width() + ", height:" + this.barChartRectF.height());
    }

    private final void initView(Context context) {
        this.padding = getResources().getDimension(R$dimen.health_qt_step_week_chart_bar_padding);
        this.mTextSize = getResources().getDimension(R$dimen.health_qt_step_week_chart_text_size);
        this.barRadius = getResources().getDimension(R$dimen.health_qt_step_week_chart_bar_radius);
        this.xLabelMarginTop = getResources().getDimension(R$dimen.health_qt_step_week_chart_bar_x_margin_top);
        this.yLabelMarginLeft = getResources().getDimension(R$dimen.health_qt_step_week_chart_bar_y_margin_left);
        this.barBgColor = ContextCompat.getColor(context, R$color.health_qt_step_bar_chart_bg);
        this.barColor = ContextCompat.getColor(context, R$color.health_qt_step_bar_chart);
        this.labelColor = ContextCompat.getColor(context, R$color.health_qt_black_30alpha);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(this.labelColor);
        this.mTextPaint.setStrokeWidth(2.0f);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(Typeface.DEFAULT);
        this.mRenderPaint.setAntiAlias(true);
        this.mRenderPaint.setColor(this.barBgColor);
        this.mRenderPaint.setStrokeWidth(1.0f);
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mLimitLinePaint.setAntiAlias(true);
        this.mLimitLinePaint.setColor(this.barColor);
        this.mLimitLinePaint.setStrokeWidth(getResources().getDimension(R$dimen.health_qt_step_week_limit_line_width));
        this.mLimitLinePaint.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAni$lambda$0(StepWeekBarChart this$0, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.phaseY = ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.maxYAxisValue == 0) {
            return;
        }
        this.centerX = getWidth() / 2.0f;
        initBarChartRect();
        drawRightYAxisText(canvas);
        drawXAxisLabel(canvas);
        drawBarChart(canvas);
    }

    public final void setDataList(@NotNull List<Integer> dataList, int maxYAxisValue, int minYAxisValue, int limitLineValue, @NotNull String xAxisLeftLabel, @NotNull String xAxisRightLabel) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(xAxisLeftLabel, "xAxisLeftLabel");
        Intrinsics.checkNotNullParameter(xAxisRightLabel, "xAxisRightLabel");
        this.mDataList.clear();
        this.mDataList.addAll(dataList);
        this.maxYAxisValue = maxYAxisValue;
        this.minYAxisValue = minYAxisValue;
        this.limitLineValue = limitLineValue;
        this.xAxisLeftLabel = xAxisLeftLabel;
        this.xAxisRightLabel = xAxisRightLabel;
        this.phaseY = 1.0f;
        invalidate();
    }

    public final void startAni(long duration) {
        if (duration <= 0) {
            this.phaseY = 1.0f;
            invalidate();
        } else {
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.uti
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StepWeekBarChart.startAni$lambda$0(this.i, valueAnimatorOfFloat, valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(duration);
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepWeekBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRenderPaint = new Paint();
        this.mLimitLinePaint = new Paint();
        this.roundPath = new Path();
        this.roundBgPath = new Path();
        this.mTextPaint = new Paint();
        this.maxYAxisValue = 10000;
        this.barChartRectF = new RectF();
        this.textRect = new Rect();
        this.barWidthScale = 0.55f;
        this.barRadius = 10.0f;
        this.mDataList = new ArrayList();
        this.xAxisLeftLabel = "";
        this.xAxisRightLabel = "";
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepWeekBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRenderPaint = new Paint();
        this.mLimitLinePaint = new Paint();
        this.roundPath = new Path();
        this.roundBgPath = new Path();
        this.mTextPaint = new Paint();
        this.maxYAxisValue = 10000;
        this.barChartRectF = new RectF();
        this.textRect = new Rect();
        this.barWidthScale = 0.55f;
        this.barRadius = 10.0f;
        this.mDataList = new ArrayList();
        this.xAxisLeftLabel = "";
        this.xAxisRightLabel = "";
        initView(context);
    }
}
