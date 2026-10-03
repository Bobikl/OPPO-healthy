package com.heytap.sports.record.list.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.sports.R$styleable;
import com.heytap.sports.record.list.widget.HealthCustomChart;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000 p2\u00020\u0001:\bqrstuvwxB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bi\u0010jB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bi\u0010kB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010l\u001a\u00020\u0017¢\u0006\u0004\bi\u0010mB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010l\u001a\u00020\u0017\u0012\u0006\u0010n\u001a\u00020\u0017¢\u0006\u0004\bi\u0010oJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003J\b\u0010\b\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\b\u0010\n\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014J0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J0\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J0\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\n\u0010#\u001a\u0004\u0018\u00010!H\u0016J\n\u0010%\u001a\u0004\u0018\u00010$H\u0016J$\u0010)\u001a\u00020\u00062\u001a\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0'\u0018\u00010&H\u0016J\u001c\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0'\u0018\u00010&H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001fH\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u000eH\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u000eH\u0016J\b\u00102\u001a\u00020\u000eH\u0016J\b\u00103\u001a\u00020\u0017H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u00105\u001a\u00020\u000eH\u0016J\u0010\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u000eH\u0016J\b\u00108\u001a\u00020\u000eH\u0016J\u0010\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u000eH\u0016J\b\u0010;\u001a\u00020\u0017H\u0016J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0017H\u0016J\b\u0010>\u001a\u00020\u0017H\u0016J\u0010\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0017H\u0016J\b\u0010A\u001a\u00020\u000eH\u0016J\u0010\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u000eH\u0016R\u0018\u0010F\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010IR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010KR\u0016\u0010M\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010LR\u0016\u0010O\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010NR\u0016\u00106\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010NR\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010NR\u0016\u0010<\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010KR\u0016\u0010?\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010KR\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010NR\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NR\u0016\u0010B\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010NR*\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0'\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010+\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010LR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020W0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010d\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010N\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006y"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "n", LogFieldKey.PROCESS_NAME_KEY, "q", "o", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "dataLeft", "dataTop", "dataRight", "dataBottom", LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "s", "", "position", "r", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$e;", "onSelectedListener", "setOnSelectedListener", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$a;", "getXAxisRenderer", "getYAxisRenderer", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$d;", "getDataRenderer", "", "Landroid/util/Pair;", "data", "setData", "getData", "scrollable", "setScrollable", "min", "setMin", "getMin", "max", "setMax", "getMax", "getPosition", "setPosition", "getXAxisLabHeight", "xAxisLabHeight", "setXAxisLabHeight", "getYAxisLabWidth", "yAxisLabWidth", "setYAxisLabWidth", "getYAxisLineVisibleCount", "yAxisLineVisibleCount", "setYAxisLineVisibleCount", "getXAxisLineVisibleCount", "xAxisLineVisibleCount", "setXAxisLineVisibleCount", "getDataRadius", "dataRadius", "setDataRadius", "i", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$a;", "yAxisRenderer", "j", "xAxisRenderer", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$d;", "dataRenderer", "I", "Z", "positionHasSet", UserInfo.SEX_FEMALE, "xAxisZero", "xAxisInterval", "t", "u", "v", "w", "Ljava/util/List;", "x", "Landroid/graphics/RectF;", "y", "Landroid/graphics/RectF;", "drawingAreaRect", "", "z", "Ljava/util/Map;", "visibleDataRect", "A", "getDataCenterX", "()F", "setDataCenterX", "(F)V", "dataCenterX", "Landroid/view/GestureDetector;", c8l.KEY_B, "Landroid/view/GestureDetector;", "mGestureDetector", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f", b2n.f, b2n.g, "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public class HealthCustomChart extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public float dataCenterX;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final GestureDetector mGestureDetector;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a yAxisRenderer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a xAxisRenderer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public d dataRenderer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean positionHasSet;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float xAxisZero;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float xAxisInterval;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float xAxisLabHeight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float yAxisLabWidth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int yAxisLineVisibleCount;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int xAxisLineVisibleCount;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float max;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float min;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float dataRadius;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public List<? extends Pair<Float, Float>> data;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean scrollable;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final RectF drawingAreaRect;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, RectF> visibleDataRect;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R.\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00100\u001a\u00020&2\u0006\u0010-\u001a\u00020&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+¨\u00063"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$a;", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$f;", "Landroid/graphics/Paint$Align;", "align", "", c8l.KEY_B, "Landroid/graphics/Paint;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Paint;", "x", "()Landroid/graphics/Paint;", "linePaint", LogFieldKey.LEVEL_KEY, "w", "labPaint", "", "color", LogFieldKey.MESSAGE_KEY, "I", "A", "()I", UserInfo.SEX_FEMALE, "(I)V", ParserTag.TAG_TEXT_COLOR, "n", "z", ExifInterface.LONGITUDE_EAST, "selectedTextColor", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$b;", "axisValueFormatter", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$b;", "v", "()Lcom/heytap/sports/record/list/widget/HealthCustomChart$b;", "setAxisValueFormatter", "(Lcom/heytap/sports/record/list/widget/HealthCustomChart$b;)V", "getLineColor", "C", "lineColor", "", Fields.WIDTH_FIELD, "y", "()F", "D", "(F)V", "lineWidth", "size", "getTextSize", "G", ParserTag.TAG_TEXT_SIZE, "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a extends f {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Paint linePaint;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Paint labPaint;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public int textColor;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public int selectedTextColor;

        public a() {
            Paint paint = new Paint();
            this.linePaint = paint;
            Paint paint2 = new Paint();
            this.labPaint = paint2;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final int getTextColor() {
            return this.textColor;
        }

        public final void B(@Nullable Paint.Align align) {
            this.labPaint.setTextAlign(align);
        }

        public final void C(int i) {
            this.linePaint.setColor(i);
        }

        public final void D(float f) {
            this.linePaint.setStrokeWidth(f);
        }

        public final void E(int i) {
            this.selectedTextColor = i;
        }

        public final void F(int i) {
            this.labPaint.setColor(i);
            this.textColor = i;
        }

        public final void G(float f) {
            this.labPaint.setTextSize(f);
        }

        @Nullable
        public final b v() {
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final Paint getLabPaint() {
            return this.labPaint;
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final Paint getLinePaint() {
            return this.linePaint;
        }

        public final float y() {
            return this.linePaint.getStrokeWidth();
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final int getSelectedTextColor() {
            return this.selectedTextColor;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$b;", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006H\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\r\u0010\u001bR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001bR\u001a\u0010&\u001a\u00020!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001b¨\u0006,"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$d;", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$f;", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "rect", "", "Landroid/util/Pair;", "", "data", "", "v", "x", "y", "w", TypedValues.Custom.S_DIMENSION, "Landroid/graphics/Paint;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Paint;", "dataPaint", LogFieldKey.LEVEL_KEY, "selectedShapePaint", "", LogFieldKey.MESSAGE_KEY, "I", "getColor", "()I", "(I)V", "color", "n", "getSelectedColor", "z", "selectedColor", "Landroid/graphics/Path;", "o", "Landroid/graphics/Path;", "getSelectedShape", "()Landroid/graphics/Path;", "selectedShape", "getSelectedShapeColor", "A", "selectedShapeColor", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthCustomChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCustomChart.kt\ncom/heytap/sports/record/list/widget/HealthCustomChart$DataRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,758:1\n1#2:759\n*E\n"})
    public static class d extends f {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Paint dataPaint;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Paint selectedShapePaint;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public int color;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public int selectedColor;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final Path selectedShape;

        public d() {
            Paint paint = new Paint();
            this.dataPaint = paint;
            Paint paint2 = new Paint();
            this.selectedShapePaint = paint2;
            this.selectedShape = new Path();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.FILL);
        }

        public final void A(int i) {
            this.selectedShapePaint.setColor(i);
        }

        public void v(@NotNull Canvas canvas, @NotNull RectF rect, @Nullable List<? extends Pair<Float, Float>> data) {
            float axisZero;
            RectF rectF;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
            List<? extends Pair<Float, Float>> list = data;
            if (list == null || list.isEmpty()) {
                return;
            }
            int size = data.size();
            StringBuilder sb = new StringBuilder();
            sb.append("DataRenderer drawData data:");
            sb.append(size);
            float axisZero2 = getAxisZero();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DataRenderer drawData:(axisZero)");
            sb2.append(axisZero2);
            canvas.save();
            canvas.clipRect(rect);
            Map<Integer, RectF> mapJ = j();
            if (mapJ != null) {
                mapJ.clear();
            }
            int axisZero3 = (int) ((0.0f - getAxisZero()) / getAxisInterval());
            float max = getMax() - getMin() == 0.0f ? 0.0f : (rect.bottom - rect.top) / (getMax() - getMin());
            while (true) {
                float fFloatValue = rect.bottom;
                axisZero = getAxisZero() + (getAxisInterval() * axisZero3);
                if (axisZero - getPointRadius() > rect.right || axisZero3 >= data.size()) {
                    break;
                }
                if (axisZero3 >= 0) {
                    data.size();
                    fFloatValue = rect.bottom - ((((Number) data.get(axisZero3).second).floatValue() - getMin()) * max);
                }
                if (axisZero3 == getPosition()) {
                    this.dataPaint.setColor(this.selectedColor);
                } else {
                    this.dataPaint.setColor(this.color);
                }
                Map<Integer, RectF> mapJ2 = j();
                if (mapJ2 != null) {
                    mapJ2.put(Integer.valueOf(axisZero3), new RectF(axisZero - getPointRadius(), fFloatValue, getPointRadius() + axisZero, rect.bottom + getXAxisTextHeight()));
                }
                Map<Integer, RectF> mapJ3 = j();
                if (mapJ3 != null && (rectF = mapJ3.get(Integer.valueOf(axisZero3))) != null) {
                    canvas.drawRect(rectF, this.dataPaint);
                }
                if (axisZero3 == getPosition() && data.size() > axisZero3) {
                    w(canvas, axisZero, rect.bottom);
                }
                axisZero3++;
            }
            float f = rect.right;
            float pointRadius = getPointRadius();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DataRenderer drawData data 超过右边界:");
            sb3.append(f);
            sb3.append(" xTemp:");
            sb3.append(axisZero);
            sb3.append(" pointRadius:");
            sb3.append(pointRadius);
            sb3.append(" i:");
            sb3.append(axisZero3);
            canvas.restore();
        }

        public void w(@NotNull Canvas canvas, float x, float y) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            this.selectedShape.reset();
            this.selectedShape.moveTo(x - (getPointRadius() / 3.0f), y);
            this.selectedShape.lineTo(x, (float) (((double) y) - Math.sqrt(Math.pow((getPointRadius() / 3.0f) * 2, 2.0d) - Math.pow(getPointRadius() / 3.0f, 2.0d))));
            this.selectedShape.lineTo(x + (getPointRadius() / 3.0f), y);
            this.selectedShape.close();
            canvas.drawPath(this.selectedShape, this.selectedShapePaint);
        }

        public final void x(float dimension) {
            this.dataPaint.setPathEffect(new CornerPathEffect(dimension));
        }

        public final void y(int i) {
            this.color = i;
        }

        public final void z(int i) {
            this.selectedColor = i;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$e;", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface e {
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J4\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0016R\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b#\u0010\u001cR\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b\"\u0010\u001a\"\u0004\b)\u0010\u001cR\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b+\u0010\u001cR\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b(\u0010\u001a\"\u0004\b-\u0010\u001cR0\u00105\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$f;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "rect", "", "b", "", "Landroid/util/Pair;", "", "data", "a", "", "I", b2n.g, "()I", "q", "(I)V", "position", "i", "r", "visibleLabCount", "c", UserInfo.SEX_FEMALE, MapSchema.FIELD_NAME_KEY, "()F", "t", "(F)V", "xAxisTextHeight", "d", "getYAxisTextWidth", "u", "yAxisTextWidth", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "axisZero", "f", LogFieldKey.LEVEL_KEY, "axisInterval", b2n.f, "n", "max", "o", "min", LogFieldKey.PROCESS_NAME_KEY, "pointRadius", "", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "s", "(Ljava/util/Map;)V", "visibleRect", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static class f {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int position;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int visibleLabCount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public float xAxisTextHeight;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public float yAxisTextWidth;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public float axisZero;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public float axisInterval;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public float max;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public float min;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public float pointRadius;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Map<Integer, RectF> visibleRect;

        public void a(@NotNull Canvas canvas, @NotNull RectF rect, @Nullable List<? extends Pair<Float, Float>> data) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
        }

        public void b(@NotNull Canvas canvas, @NotNull RectF rect) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getAxisInterval() {
            return this.axisInterval;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getAxisZero() {
            return this.axisZero;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getPointRadius() {
            return this.pointRadius;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getVisibleLabCount() {
            return this.visibleLabCount;
        }

        @Nullable
        public final Map<Integer, RectF> j() {
            return this.visibleRect;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final float getXAxisTextHeight() {
            return this.xAxisTextHeight;
        }

        public final void l(float f) {
            this.axisInterval = f;
        }

        public final void m(float f) {
            this.axisZero = f;
        }

        public final void n(float f) {
            this.max = f;
        }

        public final void o(float f) {
            this.min = f;
        }

        public final void p(float f) {
            this.pointRadius = f;
        }

        public final void q(int i) {
            this.position = i;
        }

        public final void r(int i) {
            this.visibleLabCount = i;
        }

        public final void s(@Nullable Map<Integer, RectF> map) {
            this.visibleRect = map;
        }

        public final void t(float f) {
            this.xAxisTextHeight = f;
        }

        public final void u(float f) {
            this.yAxisTextWidth = f;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J4\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$g;", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$a;", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "rect", "", "b", "", "Landroid/util/Pair;", "", "data", "a", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static class g extends a {
        public static final int $stable = 0;

        public g() {
            B(Paint.Align.CENTER);
        }

        @Override // com.heytap.sports.record.list.widget.HealthCustomChart.f
        public void a(@NotNull Canvas canvas, @NotNull RectF rect, @Nullable List<? extends Pair<Float, Float>> data) {
            float axisZero;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
            if (data == null) {
                return;
            }
            int size = data.size();
            StringBuilder sb = new StringBuilder();
            sb.append("XAxisRenderer drawLab data:");
            sb.append(size);
            canvas.save();
            canvas.clipRect(rect);
            float fMeasureText = getLabPaint().measureText("H");
            int axisZero2 = (int) ((0.0f - getAxisZero()) / getAxisInterval());
            while (true) {
                axisZero = getAxisZero() + (getAxisInterval() * axisZero2);
                if (axisZero2 >= 0) {
                    v();
                    String strValueOf = String.valueOf(axisZero2 * 100);
                    if (axisZero - (getLabPaint().measureText(String.valueOf(strValueOf)) / 2.0f) > rect.right || axisZero2 >= data.size()) {
                        break;
                    }
                    if (axisZero2 == getPosition()) {
                        getLabPaint().setColor(getSelectedTextColor());
                    } else {
                        getLabPaint().setColor(getTextColor());
                    }
                    canvas.drawText(String.valueOf(strValueOf), axisZero, rect.bottom - (fMeasureText / 2.0f), getLabPaint());
                    axisZero2++;
                }
            }
            float f = rect.right;
            float pointRadius = getPointRadius();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("XAxisRenderer drawLab data 超过右边界:");
            sb2.append(f);
            sb2.append(" xTemp:");
            sb2.append(axisZero);
            sb2.append(" pointRadius:");
            sb2.append(pointRadius);
            sb2.append(" i:");
            sb2.append(axisZero2);
            canvas.restore();
        }

        @Override // com.heytap.sports.record.list.widget.HealthCustomChart.f
        public void b(@NotNull Canvas canvas, @NotNull RectF rect) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
            if (y() <= 0.0f) {
                return;
            }
            canvas.save();
            canvas.clipRect(rect);
            int axisZero = (int) ((0.0f - getAxisZero()) / getAxisInterval());
            while (true) {
                float axisZero2 = getAxisZero() + (getAxisInterval() * axisZero);
                if (axisZero2 > rect.right) {
                    canvas.restore();
                    return;
                } else {
                    if (axisZero2 >= 0.0f) {
                        canvas.drawLine(axisZero2, rect.top, axisZero2, rect.bottom, getLinePaint());
                    }
                    axisZero++;
                }
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J4\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/sports/record/list/widget/HealthCustomChart$h;", "Lcom/heytap/sports/record/list/widget/HealthCustomChart$a;", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "rect", "", "b", "", "Landroid/util/Pair;", "", "data", "a", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthCustomChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCustomChart.kt\ncom/heytap/sports/record/list/widget/HealthCustomChart$YAxisRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,758:1\n1#2:759\n*E\n"})
    public static class h extends a {
        public static final int $stable = 0;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Paint.Align.values().length];
                try {
                    iArr[Paint.Align.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Paint.Align.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public h() {
            B(Paint.Align.RIGHT);
        }

        @Override // com.heytap.sports.record.list.widget.HealthCustomChart.f
        public void a(@NotNull Canvas canvas, @NotNull RectF rect, @Nullable List<? extends Pair<Float, Float>> data) {
            float f;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
            float fMeasureText = getLabPaint().measureText("H");
            Paint.Align textAlign = getLabPaint().getTextAlign();
            int i = textAlign == null ? -1 : a.$EnumSwitchMapping$0[textAlign.ordinal()];
            if (i == 1) {
                f = rect.left;
            } else if (i != 2) {
                f = rect.right;
            } else {
                float f2 = rect.right;
                f = f2 - ((f2 - rect.left) / 2.0f);
            }
            float max = getVisibleLabCount() - 1 == 0 ? 0.0f : (getMax() - getMin()) / (getVisibleLabCount() - 1);
            int visibleLabCount = getVisibleLabCount();
            for (int i2 = 0; i2 < visibleLabCount; i2++) {
                float f3 = i2;
                float axisZero = (getAxisZero() - (getAxisInterval() * f3)) + (fMeasureText / 2.0f);
                v();
                String strValueOf = String.valueOf(getMin() + (f3 * max));
                if (strValueOf != null) {
                    canvas.drawText(strValueOf, f, axisZero, getLabPaint());
                }
            }
        }

        @Override // com.heytap.sports.record.list.widget.HealthCustomChart.f
        public void b(@NotNull Canvas canvas, @NotNull RectF rect) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(rect, "rect");
            int visibleLabCount = getVisibleLabCount();
            for (int i = 0; i < visibleLabCount; i++) {
                float axisZero = getAxisZero() - (getAxisInterval() * i);
                canvas.drawLine(rect.left, axisZero, rect.right, axisZero, getLinePaint());
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"com/heytap/sports/record/list/widget/HealthCustomChart$i", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", MapSchema.FIELD_NAME_ENTRY, "", "onSingleTapUp", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "velocityX", "velocityY", "onFling", "", "i", "I", "FLING_MIN_DISTANCE", "j", "FLING_MIN_VELOCITY", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class i extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final int FLING_MIN_DISTANCE = 500;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final int FLING_MIN_VELOCITY = 200;

        public i() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float velocityX, float velocityY) {
            int size;
            Intrinsics.checkNotNullParameter(e2, "e2");
            super.onFling(e1, e2, velocityX, velocityY);
            if (!HealthCustomChart.this.scrollable) {
                return true;
            }
            if (e1 != null && Math.abs(e1.getX() - e2.getX()) > this.FLING_MIN_DISTANCE && Math.abs(velocityX) > this.FLING_MIN_VELOCITY) {
                HealthCustomChart.this.xAxisZero += (velocityX < 0.0f ? -1 : 1) * ((HealthCustomChart.this.xAxisLineVisibleCount * HealthCustomChart.this.xAxisInterval) - Math.abs(e1.getX() - e2.getX()));
                float dataCenterX = HealthCustomChart.this.getDataCenterX();
                float f = HealthCustomChart.this.xAxisInterval;
                if (HealthCustomChart.this.data == null) {
                    size = 0;
                } else {
                    List list = HealthCustomChart.this.data;
                    Intrinsics.checkNotNull(list);
                    size = list.size() - 1;
                }
                float f2 = dataCenterX - (f * size);
                HealthCustomChart healthCustomChart = HealthCustomChart.this;
                healthCustomChart.xAxisZero = RangesKt___RangesKt.coerceAtLeast(healthCustomChart.xAxisZero, f2);
                HealthCustomChart.this.invalidate();
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
            int size;
            Intrinsics.checkNotNullParameter(e2, "e2");
            if (!HealthCustomChart.this.scrollable) {
                return true;
            }
            HealthCustomChart.this.xAxisZero -= distanceX;
            float dataCenterX = HealthCustomChart.this.getDataCenterX();
            float f = HealthCustomChart.this.xAxisInterval;
            List list = HealthCustomChart.this.data;
            if (list == null || list.isEmpty()) {
                size = 0;
            } else {
                List list2 = HealthCustomChart.this.data;
                Intrinsics.checkNotNull(list2);
                size = list2.size() - 1;
            }
            HealthCustomChart healthCustomChart = HealthCustomChart.this;
            healthCustomChart.xAxisZero = RangesKt___RangesKt.coerceAtLeast(healthCustomChart.xAxisZero, dataCenterX - (f * size));
            HealthCustomChart.this.invalidate();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(@NotNull MotionEvent e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            super.onSingleTapUp(e2);
            for (Map.Entry entry : HealthCustomChart.this.visibleDataRect.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (((RectF) entry.getValue()).contains(e2.getX(), e2.getY())) {
                    HealthCustomChart.this.position = iIntValue;
                    HealthCustomChart.this.s();
                    return true;
                }
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthCustomChart(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void t(HealthCustomChart this$0, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.xAxisZero = f2;
        this$0.invalidate();
        this$0.r(this$0.position);
    }

    public static final void u(HealthCustomChart this$0, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float f3 = this$0.xAxisZero;
        this$0.xAxisZero = f3 + ((f2 > f3 ? this$0.xAxisInterval : -this$0.xAxisInterval) / 5);
        this$0.invalidate();
        if (this$0.xAxisZero >= this$0.getPaddingStart() + this$0.dataRadius) {
            this$0.r(this$0.position);
        } else {
            this$0.s();
        }
    }

    @Nullable
    public List<Pair<Float, Float>> getData() {
        return this.data;
    }

    public final float getDataCenterX() {
        return this.dataCenterX;
    }

    public float getDataRadius() {
        return this.dataRadius;
    }

    @Nullable
    public d getDataRenderer() {
        return this.dataRenderer;
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public int getPosition() {
        return this.position;
    }

    public float getXAxisLabHeight() {
        return this.xAxisLabHeight;
    }

    public int getXAxisLineVisibleCount() {
        return this.xAxisLineVisibleCount;
    }

    @Nullable
    public a getXAxisRenderer() {
        return this.xAxisRenderer;
    }

    public float getYAxisLabWidth() {
        return this.yAxisLabWidth;
    }

    public int getYAxisLineVisibleCount() {
        return this.yAxisLineVisibleCount;
    }

    @Nullable
    public a getYAxisRenderer() {
        return this.yAxisRenderer;
    }

    public void k(@NotNull Canvas canvas, float dataLeft, float dataTop, float dataRight, float dataBottom) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.dataRenderer != null) {
            this.xAxisLineVisibleCount = RangesKt___RangesKt.coerceAtLeast(this.xAxisLineVisibleCount, 2);
            d dVar = this.dataRenderer;
            if (dVar != null) {
                dVar.q(this.position);
            }
            d dVar2 = this.dataRenderer;
            if (dVar2 != null) {
                dVar2.r(this.xAxisLineVisibleCount);
            }
            d dVar3 = this.dataRenderer;
            if (dVar3 != null) {
                dVar3.t(this.xAxisLabHeight);
            }
            d dVar4 = this.dataRenderer;
            if (dVar4 != null) {
                dVar4.u(this.yAxisLabWidth);
            }
            d dVar5 = this.dataRenderer;
            if (dVar5 != null) {
                dVar5.m(this.xAxisZero);
            }
            d dVar6 = this.dataRenderer;
            if (dVar6 != null) {
                dVar6.l(this.xAxisInterval);
            }
            d dVar7 = this.dataRenderer;
            if (dVar7 != null) {
                dVar7.p(this.dataRadius);
            }
            d dVar8 = this.dataRenderer;
            if (dVar8 != null) {
                dVar8.s(this.visibleDataRect);
            }
            d dVar9 = this.dataRenderer;
            if (dVar9 != null) {
                dVar9.n(this.max);
            }
            d dVar10 = this.dataRenderer;
            if (dVar10 != null) {
                dVar10.o(this.min);
            }
            this.drawingAreaRect.set(dataLeft, dataTop, dataRight, dataBottom);
            d dVar11 = this.dataRenderer;
            if (dVar11 != null) {
                dVar11.v(canvas, this.drawingAreaRect, this.data);
            }
        }
    }

    public void l(@NotNull Canvas canvas, float dataLeft, float dataTop, float dataRight, float dataBottom) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a aVar = this.xAxisRenderer;
        if (aVar != null) {
            if (aVar != null) {
                aVar.q(this.position);
            }
            int i2 = this.xAxisLineVisibleCount;
            if (i2 < 2) {
                i2 = (int) ((dataRight - dataLeft) / this.xAxisInterval);
            }
            a aVar2 = this.xAxisRenderer;
            if (aVar2 != null) {
                aVar2.r(i2);
            }
            a aVar3 = this.xAxisRenderer;
            if (aVar3 != null) {
                aVar3.t(this.xAxisLabHeight);
            }
            a aVar4 = this.xAxisRenderer;
            if (aVar4 != null) {
                aVar4.u(this.yAxisLabWidth);
            }
            a aVar5 = this.xAxisRenderer;
            if (aVar5 != null) {
                aVar5.m(this.xAxisZero);
            }
            a aVar6 = this.xAxisRenderer;
            if (aVar6 != null) {
                aVar6.l(this.xAxisInterval);
            }
            a aVar7 = this.xAxisRenderer;
            if (aVar7 != null) {
                aVar7.p(this.dataRadius);
            }
            this.drawingAreaRect.set(dataLeft, dataTop, dataRight, dataBottom);
            a aVar8 = this.xAxisRenderer;
            if (aVar8 != null) {
                aVar8.b(canvas, this.drawingAreaRect);
            }
            this.drawingAreaRect.set(dataLeft, dataBottom, dataRight, this.xAxisLabHeight + dataBottom);
            a aVar9 = this.xAxisRenderer;
            if (aVar9 != null) {
                aVar9.a(canvas, this.drawingAreaRect, this.data);
            }
        }
    }

    public void m(@NotNull Canvas canvas, float dataLeft, float dataTop, float dataRight, float dataBottom) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.yAxisLineVisibleCount, 2);
        this.yAxisLineVisibleCount = iCoerceAtLeast;
        float f2 = (dataBottom - dataTop) / (iCoerceAtLeast - 1);
        if (this.yAxisRenderer != null) {
            this.drawingAreaRect.set(dataLeft, dataTop, dataRight, dataBottom);
            a aVar = this.yAxisRenderer;
            if (aVar != null) {
                aVar.r(this.yAxisLineVisibleCount);
            }
            a aVar2 = this.yAxisRenderer;
            if (aVar2 != null) {
                aVar2.t(this.xAxisLabHeight);
            }
            a aVar3 = this.yAxisRenderer;
            if (aVar3 != null) {
                aVar3.u(this.yAxisLabWidth);
            }
            a aVar4 = this.yAxisRenderer;
            if (aVar4 != null) {
                aVar4.m(dataBottom);
            }
            a aVar5 = this.yAxisRenderer;
            if (aVar5 != null) {
                aVar5.l(f2);
            }
            a aVar6 = this.yAxisRenderer;
            if (aVar6 != null) {
                aVar6.b(canvas, this.drawingAreaRect);
            }
            this.drawingAreaRect.set(dataRight, dataTop, this.yAxisLabWidth + dataRight, dataBottom);
            a aVar7 = this.yAxisRenderer;
            if (aVar7 != null) {
                aVar7.o(this.min);
            }
            a aVar8 = this.yAxisRenderer;
            if (aVar8 != null) {
                aVar8.n(this.max);
            }
            a aVar9 = this.yAxisRenderer;
            if (aVar9 != null) {
                aVar9.a(canvas, this.drawingAreaRect, this.data);
            }
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void n(Context context, AttributeSet attrs) {
        p();
        q();
        o();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.sports_HealthCustomChart);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…sports_HealthCustomChart)");
            this.min = typedArrayObtainStyledAttributes.getFloat(R$styleable.sports_HealthCustomChart_sports_YLabelMin, 0.0f);
            this.max = typedArrayObtainStyledAttributes.getFloat(R$styleable.sports_HealthCustomChart_sports_YLabelMax, 100.0f);
            this.scrollable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.sports_HealthCustomChart_sports_scrollable, false);
            this.dataRadius = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_dataRadius, 8.0f);
            this.yAxisLabWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_yAxisLabWidth, 12.0f);
            a aVar = this.yAxisRenderer;
            Intrinsics.checkNotNull(aVar);
            aVar.G(typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_yAxisLabTextSize, 36.0f));
            a aVar2 = this.yAxisRenderer;
            Intrinsics.checkNotNull(aVar2);
            aVar2.F(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_yAxisLabTextColor, -16777216));
            a aVar3 = this.yAxisRenderer;
            Intrinsics.checkNotNull(aVar3);
            aVar3.D(typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_yAxisLineWidth, 1.0f));
            a aVar4 = this.yAxisRenderer;
            Intrinsics.checkNotNull(aVar4);
            aVar4.C(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_yAxisLineColor, -16777216));
            this.yAxisLineVisibleCount = typedArrayObtainStyledAttributes.getInteger(R$styleable.sports_HealthCustomChart_sports_yAxisLineVisibleCount, this.yAxisLineVisibleCount);
            this.xAxisLabHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_xAxisLabHeight, 20.0f);
            a aVar5 = this.xAxisRenderer;
            Intrinsics.checkNotNull(aVar5);
            aVar5.G(typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_xAxisLabTextSize, 36.0f));
            a aVar6 = this.xAxisRenderer;
            Intrinsics.checkNotNull(aVar6);
            aVar6.F(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_xAxisLabTextColor, -16777216));
            a aVar7 = this.xAxisRenderer;
            Intrinsics.checkNotNull(aVar7);
            aVar7.E(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_xAxisLabSelectedTextColor, -16777216));
            a aVar8 = this.xAxisRenderer;
            Intrinsics.checkNotNull(aVar8);
            aVar8.D(typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_xAxisLineWidth, -1.0f));
            a aVar9 = this.xAxisRenderer;
            Intrinsics.checkNotNull(aVar9);
            aVar9.C(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_xAxisLineColor, -16777216));
            this.xAxisInterval = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_xAxisInterval, 180.0f);
            this.xAxisLineVisibleCount = typedArrayObtainStyledAttributes.getInteger(R$styleable.sports_HealthCustomChart_sports_xAxisLineVisibleCount, 0);
            d dVar = this.dataRenderer;
            Intrinsics.checkNotNull(dVar);
            dVar.y(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_dataColor, -1895825408));
            d dVar2 = this.dataRenderer;
            Intrinsics.checkNotNull(dVar2);
            dVar2.z(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_dataSelectedColor, -16777216));
            d dVar3 = this.dataRenderer;
            Intrinsics.checkNotNull(dVar3);
            dVar3.A(typedArrayObtainStyledAttributes.getColor(R$styleable.sports_HealthCustomChart_sports_selectedShapeColor, -1));
            d dVar4 = this.dataRenderer;
            Intrinsics.checkNotNull(dVar4);
            dVar4.x(typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_HealthCustomChart_sports_dataCorner, 0.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void o() {
        this.dataRenderer = new d();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = (getWidth() - getPaddingEnd()) - this.yAxisLabWidth;
        float paddingStart = getPaddingStart();
        float height = (getHeight() - getPaddingBottom()) - this.xAxisLabHeight;
        float paddingTop = getPaddingTop();
        int i2 = this.xAxisLineVisibleCount;
        boolean z = true;
        if (i2 >= 2) {
            this.xAxisInterval = ((width - paddingStart) - (this.scrollable ? 0.0f : this.dataRadius * 2)) / (i2 - 1);
        }
        if (this.xAxisInterval == 0.0f) {
            return;
        }
        this.dataCenterX = ((width - paddingStart) / 2.0f) + paddingStart;
        if (this.positionHasSet) {
            List<? extends Pair<Float, Float>> list = this.data;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (z) {
                f2 = this.dataCenterX;
                f3 = (this.xAxisInterval * this.xAxisLineVisibleCount) / 2;
            } else {
                f2 = this.dataCenterX;
                f3 = this.xAxisInterval * this.position;
            }
            this.xAxisZero = f2 - f3;
            this.positionHasSet = false;
        }
        this.xAxisZero = this.scrollable ? RangesKt___RangesKt.coerceAtMost(this.xAxisZero, getPaddingStart() + this.dataRadius) : getPaddingStart() + this.dataRadius;
        l(canvas, paddingStart, paddingTop, width, height);
        m(canvas, paddingStart, paddingTop, width, height);
        k(canvas, paddingStart, paddingTop, width, height);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.mGestureDetector.onTouchEvent(event) && event.getAction() == 1) {
            int iRoundToInt = MathKt__MathJVMKt.roundToInt((this.dataCenterX - this.xAxisZero) / this.xAxisInterval);
            this.position = iRoundToInt;
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.xAxisLineVisibleCount / 2, iRoundToInt);
            this.position = iCoerceAtLeast;
            List<? extends Pair<Float, Float>> list = this.data;
            int size = 0;
            if (!(list == null || list.isEmpty())) {
                List<? extends Pair<Float, Float>> list2 = this.data;
                Intrinsics.checkNotNull(list2);
                size = list2.size() - 1;
            }
            this.position = RangesKt___RangesKt.coerceAtMost(iCoerceAtLeast, size);
            s();
        }
        return true;
    }

    public void p() {
        this.xAxisRenderer = new g();
    }

    public void q() {
        this.yAxisRenderer = new h();
    }

    public void r(int position) {
    }

    public void s() {
        float f2 = this.dataCenterX;
        float f3 = this.xAxisZero;
        float f4 = this.xAxisInterval;
        float f5 = (f2 - f3) / f4;
        int i2 = this.position;
        if (f5 == ((float) i2)) {
            r(i2);
            return;
        }
        final float f6 = f2 - (f4 * i2);
        if (Math.abs(f6 - f3) <= this.xAxisInterval / 5) {
            postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.eq8
                @Override // java.lang.Runnable
                public final void run() {
                    HealthCustomChart.t(this.i, f6);
                }
            }, 10L);
        } else {
            postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.fq8
                @Override // java.lang.Runnable
                public final void run() {
                    HealthCustomChart.u(this.i, f6);
                }
            }, 10L);
        }
    }

    public void setData(@Nullable List<? extends Pair<Float, Float>> data) {
        this.data = data;
    }

    public final void setDataCenterX(float f2) {
        this.dataCenterX = f2;
    }

    public void setDataRadius(float dataRadius) {
        this.dataRadius = dataRadius;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public void setOnSelectedListener(@Nullable e onSelectedListener) {
    }

    public void setPosition(int position) {
        if (position < 0) {
            return;
        }
        this.position = position;
        this.positionHasSet = true;
    }

    public void setScrollable(boolean scrollable) {
        this.scrollable = scrollable;
    }

    public void setXAxisLabHeight(float xAxisLabHeight) {
        this.xAxisLabHeight = xAxisLabHeight;
    }

    public void setXAxisLineVisibleCount(int xAxisLineVisibleCount) {
        this.xAxisLineVisibleCount = xAxisLineVisibleCount;
    }

    public void setYAxisLabWidth(float yAxisLabWidth) {
        this.yAxisLabWidth = yAxisLabWidth;
    }

    public void setYAxisLineVisibleCount(int yAxisLineVisibleCount) {
        this.yAxisLineVisibleCount = yAxisLineVisibleCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthCustomChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthCustomChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthCustomChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.position = 2;
        this.yAxisLineVisibleCount = 5;
        this.max = 10.0f;
        this.drawingAreaRect = new RectF();
        this.visibleDataRect = new HashMap();
        this.mGestureDetector = new GestureDetector(getContext(), new i());
        n(context, attributeSet);
    }
}
