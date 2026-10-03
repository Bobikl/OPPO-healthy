package com.heytap.health.sleep.day.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.lib_chart.R$color;
import com.heytap.health.sleep.R$styleable;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.f0l;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.v05;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0007\u0018\u0000 W2\u00020\u0001:\u0002\u001a\u0011B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bR\u0010SB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bR\u0010TB#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010U\u001a\u00020\u0002¢\u0006\u0004\bR\u0010VJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003J(\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010,\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010+R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010+R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010+R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010.R\u0016\u0010Q\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010+¨\u0006X"}, d2 = {"Lcom/heytap/health/sleep/day/view/SleepProposeView;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lcom/heytap/health/sleep/day/view/SleepProposeView$b;", "realData", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "b", "", "drawAreaY", "drawAreaYHalf", "xLabelTextHeight", "c", "", ClickApiEntity.TIME, "", "a", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "mPaint", "j", "mPaint2", MapSchema.FIELD_NAME_KEY, "mPaint3", LogFieldKey.LEVEL_KEY, "mTextPaint", LogFieldKey.MESSAGE_KEY, "J", "minTime", "n", "maxTime", "o", UserInfo.SEX_FEMALE, "gridLineWidth", LogFieldKey.PROCESS_NAME_KEY, "I", "gridLineColor", "q", "labelTextColor", "r", "xHeight", "Landroid/graphics/DashPathEffect;", "s", "Landroid/graphics/DashPathEffect;", SpeechConstant.KEY_EFFECT, "t", "labelTextSize", "u", "labelTextMarginTop", "v", "chartRectPaddingVertical", "Landroid/graphics/Rect;", "w", "Landroid/graphics/Rect;", "textRect", "Landroid/graphics/RectF;", "x", "Landroid/graphics/RectF;", "chartRect", "", "y", "Ljava/util/List;", "dataList", "", "z", "[I", "rectColorArray", "A", "chartColor", c8l.KEY_B, "desiredHeight", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepProposeView extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public int chartColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public float desiredHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Paint mPaint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Paint mPaint2;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Paint mPaint3;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Paint mTextPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long minTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long maxTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float gridLineWidth;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int gridLineColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int labelTextColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float xHeight;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public DashPathEffect effect;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float labelTextSize;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float labelTextMarginTop;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float chartRectPaddingVertical;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public Rect textRect;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public RectF chartRect;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> dataList;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int[] rectColorArray;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.sleep.day.view.SleepProposeView$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/sleep/day/view/SleepProposeView$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "setStartTime", "(J)V", "startTime", "setEndTime", "endTime", "<init>", "(JJ)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TimeStampedData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public long startTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public long endTime;

        public TimeStampedData() {
            this(0L, 0L, 3, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeStampedData)) {
                return false;
            }
            TimeStampedData timeStampedData = (TimeStampedData) other;
            return this.startTime == timeStampedData.startTime && this.endTime == timeStampedData.endTime;
        }

        public int hashCode() {
            return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
        }

        @NotNull
        public String toString() {
            return "TimeStampedData(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        }

        public TimeStampedData(long j2, long j3) {
            this.startTime = j2;
            this.endTime = j3;
        }

        public /* synthetic */ TimeStampedData(long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepProposeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPaint = new Paint();
        this.mPaint2 = new Paint();
        this.mPaint3 = new Paint();
        this.mTextPaint = new Paint();
        this.gridLineWidth = 0.7f;
        this.xHeight = 0.7f;
        this.textRect = new Rect();
        this.chartRect = new RectF();
        this.dataList = new ArrayList();
        b(context, null);
    }

    public final String a(long time) {
        return mq8.INSTANCE.y(time, v05.DATE_FORMAT_HOUR);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void b(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.Health_SleepProposeView);
        this.xHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.Health_SleepProposeView_health_xHeight, 112.0f);
        this.labelTextSize = typedArrayObtainStyledAttributes.getDimension(R$styleable.Health_SleepProposeView_health_labelTextSize, 14.0f);
        this.labelTextMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.Health_SleepProposeView_health_labelTextMarginTop, 2.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.desiredHeight = hfk.a(context, 73.0f);
        this.gridLineWidth = hfk.a(context, 0.7f);
        this.gridLineColor = ContextCompat.getColor(context, R$color.lib_core_charts_grid_line);
        this.labelTextColor = ContextCompat.getColor(context, com.heytap.health.health_base.R$color.health_base_black_30alpha);
        this.effect = new DashPathEffect(new float[]{hfk.a(context, 3.67f), hfk.a(context, 3.67f)}, 0.0f);
        this.chartRectPaddingVertical = hfk.a(context, 8.0f);
        this.rectColorArray = new int[]{ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_propose_color1), ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_propose_color2), ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_propose_color3), ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_propose_color4)};
        this.chartColor = ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_propose_color5);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(this.labelTextColor);
        this.mTextPaint.setTextSize(this.labelTextSize);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final void c(Canvas canvas, float drawAreaY, float drawAreaYHalf, int xLabelTextHeight) {
        int[] iArr;
        long j2 = 60000;
        float width = ((this.maxTime - this.minTime) / j2) / getWidth();
        long j3 = this.minTime;
        long j4 = this.maxTime;
        StringBuilder sb = new StringBuilder();
        sb.append("minTime:");
        sb.append(j3);
        sb.append(" ,maxTime:");
        sb.append(j4);
        sb.append(" ,xUnit:");
        sb.append(width);
        int size = this.dataList.size();
        for (int i = 0; i < size; i++) {
            TimeStampedData timeStampedData = this.dataList.get(i);
            float startTime = ((timeStampedData.getStartTime() - this.minTime) / j2) / width;
            float endTime = ((timeStampedData.getEndTime() - this.minTime) / j2) / width;
            if (i == 0) {
                RectF rectF = this.chartRect;
                rectF.left = startTime;
                float f = this.chartRectPaddingVertical;
                rectF.top = drawAreaYHalf + f;
                rectF.right = endTime;
                rectF.bottom = drawAreaY - f;
                RectF rectF2 = this.chartRect;
                float f2 = rectF2.left;
                float f3 = rectF2.top;
                float f4 = rectF2.right;
                int[] iArr2 = this.rectColorArray;
                if (iArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rectColorArray");
                    iArr = null;
                } else {
                    iArr = iArr2;
                }
                this.mPaint2.setShader(new LinearGradient(f2, f3, f4, f3, iArr, (float[]) null, Shader.TileMode.MIRROR));
                canvas.drawRect(this.chartRect, this.mPaint2);
                float fA = f0l.a(this.mTextPaint, (getHeight() - (xLabelTextHeight / 2.0f)) - this.labelTextMarginTop);
                this.mTextPaint.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(a(timeStampedData.getStartTime()), this.chartRect.left, fA, this.mTextPaint);
                this.mTextPaint.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(a(timeStampedData.getEndTime()), this.chartRect.right, fA, this.mTextPaint);
            } else {
                RectF rectF3 = this.chartRect;
                rectF3.left = startTime;
                float f5 = this.chartRectPaddingVertical;
                rectF3.top = f5;
                rectF3.right = endTime;
                rectF3.bottom = drawAreaYHalf - f5;
                this.mPaint3.setShader(null);
                this.mPaint3.setColor(this.chartColor);
                canvas.drawRect(this.chartRect, this.mPaint3);
                float fA2 = f0l.a(this.mTextPaint, drawAreaY + (xLabelTextHeight / 2.0f) + this.labelTextMarginTop);
                this.mTextPaint.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(a(timeStampedData.getStartTime()), this.chartRect.left, fA2, this.mTextPaint);
                this.mTextPaint.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(a(timeStampedData.getEndTime()), this.chartRect.right, fA2, this.mTextPaint);
            }
            RectF rectF4 = this.chartRect;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("chartRect:");
            sb2.append(rectF4);
            RectF rectF5 = this.chartRect;
            float f6 = rectF5.left;
            canvas.drawLine(f6, rectF5.top, f6, drawAreaY, this.mPaint);
            RectF rectF6 = this.chartRect;
            float f7 = rectF6.right;
            canvas.drawLine(f7, rectF6.top, f7, drawAreaY, this.mPaint);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        StringBuilder sb = new StringBuilder();
        sb.append("onDraw width:");
        sb.append(width);
        sb.append(" ,height:");
        sb.append(height);
        int iB = f0l.b(this.mTextPaint, "A", this.textRect);
        float height2 = getHeight() - ((iB * 2) + (this.labelTextMarginTop * 3));
        float f = height2 / 2.0f;
        this.mPaint.setColor(this.gridLineColor);
        this.mPaint.setStrokeWidth(this.gridLineWidth);
        canvas.drawLine(0.0f, 0.0f, 0.0f, height2, this.mPaint);
        canvas.drawLine(getWidth(), 0.0f, getWidth(), height2, this.mPaint);
        this.mPaint.setPathEffect(this.effect);
        canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.mPaint);
        canvas.drawLine(0.0f, height2, getWidth(), height2, this.mPaint);
        if (this.dataList.size() != 2) {
            c(canvas, height2, 0.0f, iB);
        } else {
            canvas.drawLine(0.0f, f, getWidth(), f, this.mPaint);
            c(canvas, height2, f, iB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), (int) (this.desiredHeight * this.dataList.size()));
    }

    public final void setData(@NotNull TimeStampedData realData) {
        Intrinsics.checkNotNullParameter(realData, "realData");
        this.minTime = realData.getStartTime();
        this.maxTime = realData.getEndTime();
        this.dataList.clear();
        this.dataList.add(realData);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepProposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPaint = new Paint();
        this.mPaint2 = new Paint();
        this.mPaint3 = new Paint();
        this.mTextPaint = new Paint();
        this.gridLineWidth = 0.7f;
        this.xHeight = 0.7f;
        this.textRect = new Rect();
        this.chartRect = new RectF();
        this.dataList = new ArrayList();
        b(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepProposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPaint = new Paint();
        this.mPaint2 = new Paint();
        this.mPaint3 = new Paint();
        this.mTextPaint = new Paint();
        this.gridLineWidth = 0.7f;
        this.xHeight = 0.7f;
        this.textRect = new Rect();
        this.chartRect = new RectF();
        this.dataList = new ArrayList();
        b(context, attributeSet);
    }
}
