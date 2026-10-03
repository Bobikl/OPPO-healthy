package com.heytap.health.sleep.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
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
import com.oplus.aiunit.vision.qe0;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u001dB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bX\u0010YB\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bX\u0010ZB#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010[\u001a\u00020\u0007¢\u0006\u0004\bX\u0010\\J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J$\u0010\u000b\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003J:\u0010\u0017\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J*\u0010\u001a\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J:\u0010\u001d\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010,\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00102R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105R\u0016\u0010<\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00105R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00102R\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00102R\u0016\u0010J\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010L\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00102R\u0016\u0010N\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00105R\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00105R,\u0010W\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006]"}, d2 = {"Lcom/heytap/health/sleep/view/SleepStandardView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "Lkotlin/Function2;", "", "", "", "f", "setXLabelFormat", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", MapSchema.FIELD_NAME_ENTRY, "", "startX", "drawRightX", "startY", "drawBottomY", "xLabelTextHeight", "a", "labelTextHeight", "drawYHalf", "c", "minuteValue", "d", "b", "", "Lcom/heytap/health/sleep/view/SleepStandardView$a;", "i", "Ljava/util/List;", "dataList", "Landroid/graphics/Paint;", "j", "Landroid/graphics/Paint;", "gridLinePaint", MapSchema.FIELD_NAME_KEY, "mTextPaint", LogFieldKey.LEVEL_KEY, "barPaint", LogFieldKey.MESSAGE_KEY, "barPaint2", "Landroid/graphics/DashPathEffect;", "n", "Landroid/graphics/DashPathEffect;", SpeechConstant.KEY_EFFECT, "o", "I", "gridLineColor", LogFieldKey.PROCESS_NAME_KEY, UserInfo.SEX_FEMALE, "gridLineWidth", "q", "labelTextColor", "r", "labelTextSize", "s", "xLabelTextMarginTop", "t", "yLabelTextMargin", "Landroid/graphics/Rect;", "u", "Landroid/graphics/Rect;", "textRect", "v", "yAxisMinimum", "w", "yAxisMaximum", "x", "barColor", "y", "barWidthScale", "z", "barColor2", "A", "barWidthScale2", "Landroid/graphics/Path;", c8l.KEY_B, "Landroid/graphics/Path;", "mPath", "C", "radius", "D", "Lkotlin/jvm/functions/Function2;", "mXLabelFormat", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepStandardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepStandardView.kt\ncom/heytap/health/sleep/view/SleepStandardView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
public final class SleepStandardView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public float barWidthScale2;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public Path mPath;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public float radius;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public Function2<? super Integer, ? super Long, String> mXLabelFormat;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<Data> dataList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Paint gridLinePaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Paint mTextPaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Paint barPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Paint barPaint2;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DashPathEffect effect;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int gridLineColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float gridLineWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int labelTextColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float labelTextSize;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float xLabelTextMarginTop;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float yLabelTextMargin;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public Rect textRect;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int yAxisMinimum;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int yAxisMaximum;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int barColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public float barWidthScale;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int barColor2;

    /* JADX INFO: renamed from: com.heytap.health.sleep.view.SleepStandardView$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/sleep/view/SleepStandardView$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "c", "()J", "setXTimestamp", "(J)V", "xTimestamp", "Lcom/heytap/health/sleep/view/SleepStandardView$b;", "item1", "Lcom/heytap/health/sleep/view/SleepStandardView$b;", "()Lcom/heytap/health/sleep/view/SleepStandardView$b;", "setItem1", "(Lcom/heytap/health/sleep/view/SleepStandardView$b;)V", "item2", "b", "setItem2", "<init>", "(JLcom/heytap/health/sleep/view/SleepStandardView$b;Lcom/heytap/health/sleep/view/SleepStandardView$b;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Data {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public long xTimestamp;

        public Data() {
            this(0L, null, null, 7, null);
        }

        @Nullable
        public final b a() {
            return null;
        }

        @Nullable
        public final b b() {
            return null;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getXTimestamp() {
            return this.xTimestamp;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && this.xTimestamp == ((Data) other).xTimestamp && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public int hashCode() {
            return (((Long.hashCode(this.xTimestamp) * 31) + 0) * 31) + 0;
        }

        @NotNull
        public String toString() {
            return "Data(xTimestamp=" + this.xTimestamp + ", item1=" + ((Object) null) + ", item2=" + ((Object) null) + ")";
        }

        public Data(long j2, @Nullable b bVar, @Nullable b bVar2) {
            this.xTimestamp = j2;
        }

        public /* synthetic */ Data(long j2, b bVar, b bVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : bVar2);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/heytap/health/sleep/view/SleepStandardView$b;", "", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b {
        public static final int $stable = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStandardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = new ArrayList();
        this.gridLinePaint = new Paint();
        this.mTextPaint = new Paint();
        this.barPaint = new Paint();
        this.barPaint2 = new Paint();
        this.gridLineWidth = 0.7f;
        this.textRect = new Rect();
        this.barWidthScale = 0.52f;
        this.barWidthScale2 = 0.368f;
        this.mPath = new Path();
        e(context, null);
    }

    public final void a(Canvas canvas, float startX, float drawRightX, float startY, float drawBottomY, int xLabelTextHeight) {
        String strValueOf;
        float size = (drawRightX - startX) / this.dataList.size();
        float f = size / 2.0f;
        float height = getHeight() - (xLabelTextHeight / 2.0f);
        int size2 = this.dataList.size();
        for (int i = 0; i < size2; i++) {
            float f2 = (i * size) + f;
            Data data = this.dataList.get(i);
            data.a();
            data.b();
            Function2<? super Integer, ? super Long, String> function2 = this.mXLabelFormat;
            if (function2 == null) {
                strValueOf = String.valueOf(i);
            } else if (function2 == null || (strValueOf = function2.invoke(Integer.valueOf(i), Long.valueOf(data.getXTimestamp()))) == null) {
                strValueOf = "";
            }
            this.mTextPaint.setTextAlign(Paint.Align.CENTER);
            if (canvas != null) {
                canvas.drawText(strValueOf, f2, height, this.mTextPaint);
            }
        }
    }

    public final void b(Canvas canvas, float drawBottomY, float drawRightX, float drawYHalf, float startX, float startY) {
        this.gridLinePaint.setColor(this.gridLineColor);
        this.gridLinePaint.setStrokeWidth(this.gridLineWidth);
        if (canvas != null) {
            canvas.drawLine(startX, startY, startX, drawBottomY, this.gridLinePaint);
        }
        if (canvas != null) {
            canvas.drawLine(drawRightX, startY, drawRightX, drawBottomY, this.gridLinePaint);
        }
        if (canvas != null) {
            canvas.drawLine(startX, startY, getWidth(), startY, this.gridLinePaint);
        }
        if (canvas != null) {
            canvas.drawLine(startX, drawBottomY, getWidth(), drawBottomY, this.gridLinePaint);
        }
        if (canvas != null) {
            canvas.drawLine(startX, drawYHalf, drawRightX, drawYHalf, this.gridLinePaint);
        }
    }

    public final void c(Canvas canvas, float labelTextHeight, float drawYHalf, float drawBottomY) {
        this.mTextPaint.setTextAlign(Paint.Align.RIGHT);
        int i = this.yAxisMaximum;
        int i2 = this.yAxisMinimum;
        int i3 = ((i - i2) / 2) + i2;
        if (canvas != null) {
            canvas.drawText(d(i2), getWidth(), this.yLabelTextMargin + labelTextHeight, this.mTextPaint);
        }
        if (canvas != null) {
            canvas.drawText(d(i3), getWidth(), drawYHalf + (labelTextHeight / 2), this.mTextPaint);
        }
        if (canvas != null) {
            canvas.drawText(d(this.yAxisMaximum), getWidth(), drawBottomY - this.yLabelTextMargin, this.mTextPaint);
        }
    }

    public final String d(int minuteValue) {
        String strValueOf;
        String strValueOf2;
        int i = minuteValue + 1200;
        if (i >= 1440) {
            i -= 1440;
        }
        int i2 = i / 60;
        if (i2 < 10) {
            strValueOf = "0" + i2;
        } else {
            strValueOf = String.valueOf(i2);
        }
        int i3 = i % 60;
        if (i3 < 10) {
            strValueOf2 = "0" + i3;
        } else {
            strValueOf2 = String.valueOf(i3);
        }
        return strValueOf + ":" + strValueOf2;
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void e(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.Health_StandardView);
        this.labelTextSize = typedArrayObtainStyledAttributes.getDimension(R$styleable.Health_StandardView_health_textSize, this.labelTextSize);
        this.xLabelTextMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.Health_StandardView_health_xLabelTextMarginTop, 8.0f);
        this.yLabelTextMargin = typedArrayObtainStyledAttributes.getDimension(R$styleable.Health_StandardView_health_yLabelTextMargin, 4.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.effect = new DashPathEffect(new float[]{hfk.a(context, 3.67f), hfk.a(context, 3.67f)}, 0.0f);
        this.gridLineWidth = hfk.a(context, 0.7f);
        this.radius = hfk.a(context, 2.0f);
        if (qe0.y(getContext())) {
            this.gridLineColor = ContextCompat.getColor(context, R$color.lib_core_charts_grid_line_night);
            this.labelTextColor = ContextCompat.getColor(context, R$color.lib_core_charts_axis_label_night);
        } else {
            this.gridLineColor = ContextCompat.getColor(context, R$color.lib_core_charts_grid_line);
            this.labelTextColor = ContextCompat.getColor(context, R$color.lib_core_charts_axis_label);
        }
        this.barColor = ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_color_c7c2ff);
        this.barColor2 = ContextCompat.getColor(context, com.heytap.health.sleep.R$color.health_sleep_color_7366ff);
        this.gridLinePaint.setAntiAlias(true);
        this.gridLinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.gridLinePaint.setStyle(Paint.Style.STROKE);
        this.gridLinePaint.setPathEffect(this.effect);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(this.labelTextColor);
        this.mTextPaint.setTextSize(this.labelTextSize);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.barPaint.setAntiAlias(true);
        this.barPaint.setStrokeCap(Paint.Cap.ROUND);
        this.barPaint.setStyle(Paint.Style.STROKE);
        this.barPaint.setStrokeWidth(this.gridLineWidth);
        this.barPaint.setPathEffect(this.effect);
        this.barPaint.setColor(this.barColor2);
        this.barPaint2.setAntiAlias(true);
        this.barPaint2.setStrokeCap(Paint.Cap.ROUND);
        this.barPaint2.setStyle(Paint.Style.FILL);
        this.barPaint2.setColor(this.barColor);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int iB = f0l.b(this.mTextPaint, "A", this.textRect);
        int iC = f0l.c(this.mTextPaint, "00:00", this.textRect);
        float f = iB;
        float f2 = 2;
        float height = getHeight() - ((this.xLabelTextMarginTop * f2) + f);
        float f3 = height / 2.0f;
        float width = (getWidth() - iC) - (this.yLabelTextMargin * f2);
        float f4 = this.gridLineWidth;
        float f5 = f4 / f2;
        float f6 = f4 / f2;
        b(canvas, height, width, f3, f5, f6);
        c(canvas, f, f3, height);
        a(canvas, f5, width, f6, height, iB);
    }

    public final void setXLabelFormat(@Nullable Function2<? super Integer, ? super Long, String> f) {
        this.mXLabelFormat = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStandardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = new ArrayList();
        this.gridLinePaint = new Paint();
        this.mTextPaint = new Paint();
        this.barPaint = new Paint();
        this.barPaint2 = new Paint();
        this.gridLineWidth = 0.7f;
        this.textRect = new Rect();
        this.barWidthScale = 0.52f;
        this.barWidthScale2 = 0.368f;
        this.mPath = new Path();
        e(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStandardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = new ArrayList();
        this.gridLinePaint = new Paint();
        this.mTextPaint = new Paint();
        this.barPaint = new Paint();
        this.barPaint2 = new Paint();
        this.gridLineWidth = 0.7f;
        this.textRect = new Rect();
        this.barWidthScale = 0.52f;
        this.barWidthScale2 = 0.368f;
        this.mPath = new Path();
        e(context, attributeSet);
    }
}
