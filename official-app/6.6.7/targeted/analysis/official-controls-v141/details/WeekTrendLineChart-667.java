package com.heytap.health.core.widget.charts.customChart;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.R$color;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.l14;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.rp9;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 u2\u00020\u0001:\u0006vwxyz{B\u0011\b\u0016\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oB\u001b\b\u0016\u0012\u0006\u0010m\u001a\u00020l\u0012\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bn\u0010rB#\b\u0016\u0012\u0006\u0010m\u001a\u00020l\u0012\b\u0010q\u001a\u0004\u0018\u00010p\u0012\u0006\u0010s\u001a\u00020\u0013¢\u0006\u0004\bn\u0010tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002JB\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J8\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J@\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J@\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J@\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u001e\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u001e\u001a\u00020\bH\u0002J@\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\bH\u0002J\b\u0010$\u001a\u00020\bH\u0002J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060&2\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J(\u0010(\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\bH\u0002J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0016\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\u000fJ\u000e\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\bJ\u0006\u00103\u001a\u00020\bR\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010J\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010XR\u0011\u0010[\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010]\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0011\u0010_\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b^\u0010ZR\u0011\u0010a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b`\u0010ZR\u0011\u0010c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bb\u0010ZR\u0011\u0010e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bd\u0010ZR\u0011\u0010g\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bf\u0010ZR\u0011\u0010i\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010ZR\u0011\u0010k\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bj\u0010Z¨\u0006|"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart;", "Landroid/view/View;", "", "judgeTrentValid", "Landroid/graphics/Canvas;", "canvas", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;", "chartData", "", l14.TIME_STYLE_LEFT_DIR_NAME, "top", l14.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "Landroid/graphics/drawable/Drawable;", "fillDrawable", "", "drawLine", ResourcesUtil.ResourceType.DRAWABLE, "drawCubicFill", "", "yMax", "yMin", "drawRightLine", ParserTag.TAG_TEXT_COLOR, "", "text", "drawBottomText", "drawRightText", "", "textHeightList", "pairHeight", "adjustTextHeight", "number", "drawRightTextPair", "getRightTextPairHeight", "getRightTextHeight", "getRightNumberHeight", "chartHeight", "Lkotlin/Pair;", "transferData", "transferSingleData", "countYValue", "dpValue", "dp", "onDraw", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$f;", "stepTrent", "refreshData", "animateY", "phaseY", "setPhaseY", "getPhaseY", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$f;", "getStepTrent", "()Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$f;", "setStepTrent", "(Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$f;)V", "fillLeftDrawable", "Landroid/graphics/drawable/Drawable;", "getFillLeftDrawable", "()Landroid/graphics/drawable/Drawable;", "setFillLeftDrawable", "(Landroid/graphics/drawable/Drawable;)V", "fillRightDrawable", "getFillRightDrawable", "setFillRightDrawable", "Z", "getDrawRightLine", "()Z", "setDrawRightLine", "(Z)V", "drawCircle", "getDrawCircle", "setDrawCircle", "I", "getYMax", "()I", "setYMax", "(I)V", "getYMin", "setYMin", "Landroid/graphics/Paint;", rp9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "filledPath", UserInfo.SEX_FEMALE, "getBottomOffset", "()F", "bottomOffset", "getRightOffset", "rightOffset", "getLeftOffset", "leftOffset", "getTopOffset", "topOffset", "getRightTextEndOffset", "rightTextEndOffset", "getBoundary", "boundary", "getLineWidth", "lineWidth", "getCenterSpace", "centerSpace", "getRadius", "radius", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWeekTrendLineChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekTrendLineChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,547:1\n1864#2,3:548\n1855#2,2:551\n1864#2,3:553\n1054#2:556\n1855#2,2:557\n1864#2,3:559\n2624#2,3:562\n1549#2:565\n1620#2,2:566\n1549#2:568\n1620#2,3:569\n1622#2:572\n1855#2,2:573\n*S KotlinDebug\n*F\n+ 1 WeekTrendLineChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart\n*L\n211#1:548,3\n239#1:551,2\n308#1:553,3\n358#1:556\n359#1:557,2\n365#1:559,3\n448#1:562,3\n479#1:565\n479#1:566,2\n482#1:568\n482#1:569,3\n479#1:572\n496#1:573,2\n*E\n"})
public final class WeekTrendLineChart extends View {

    @NotNull
    public static final String TAG = "WeekTrendLineChart";
    private boolean drawCircle;
    private boolean drawRightLine;

    @Nullable
    private Drawable fillLeftDrawable;

    @Nullable
    private Drawable fillRightDrawable;

    @NotNull
    private final Path filledPath;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;
    private float phaseY;

    @NotNull
    private StepTrent stepTrent;
    private int yMax;
    private int yMin;

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrendLineChart$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "b", "()F", "x", "c", "y", "I", "()I", "color", "<init>", "(FFI)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Point {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final float x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float y;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int color;

        public Point(float f, float f2, int i) {
            this.x = f;
            this.y = f2;
            this.color = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Point)) {
                return false;
            }
            Point point = (Point) other;
            return Float.compare(this.x, point.x) == 0 && Float.compare(this.y, point.y) == 0 && this.color == point.color;
        }

        public int hashCode() {
            return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Integer.hashCode(this.color);
        }

        @NotNull
        public String toString() {
            return "Point(x=" + this.x + ", y=" + this.y + ", color=" + this.color + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrendLineChart$c, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "textMsg", "I", "c", "()I", "value", "drawValueStr", "d", "valueColor", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RightLineMsg {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String textMsg;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String drawValueStr;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final int valueColor;

        public RightLineMsg(@NotNull String textMsg, int i, @NotNull String drawValueStr, int i2) {
            Intrinsics.checkNotNullParameter(textMsg, "textMsg");
            Intrinsics.checkNotNullParameter(drawValueStr, "drawValueStr");
            this.textMsg = textMsg;
            this.value = i;
            this.drawValueStr = drawValueStr;
            this.valueColor = i2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDrawValueStr() {
            return this.drawValueStr;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTextMsg() {
            return this.textMsg;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getValueColor() {
            return this.valueColor;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightLineMsg)) {
                return false;
            }
            RightLineMsg rightLineMsg = (RightLineMsg) other;
            return Intrinsics.areEqual(this.textMsg, rightLineMsg.textMsg) && this.value == rightLineMsg.value && Intrinsics.areEqual(this.drawValueStr, rightLineMsg.drawValueStr) && this.valueColor == rightLineMsg.valueColor;
        }

        public int hashCode() {
            return (((((this.textMsg.hashCode() * 31) + Integer.hashCode(this.value)) * 31) + this.drawValueStr.hashCode()) * 31) + Integer.hashCode(this.valueColor);
        }

        @NotNull
        public String toString() {
            return "RightLineMsg(textMsg=" + this.textMsg + ", value=" + this.value + ", drawValueStr=" + this.drawValueStr + ", valueColor=" + this.valueColor + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrendLineChart$d, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "chartTitle", "b", "I", "()I", "color", "", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "data", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SingleChartData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String chartTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int color;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<SingleEntry> data;

        public SingleChartData(@NotNull String chartTitle, int i, @NotNull List<SingleEntry> data) {
            Intrinsics.checkNotNullParameter(chartTitle, "chartTitle");
            Intrinsics.checkNotNullParameter(data, "data");
            this.chartTitle = chartTitle;
            this.color = i;
            this.data = data;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getChartTitle() {
            return this.chartTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final List<SingleEntry> c() {
            return this.data;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleChartData)) {
                return false;
            }
            SingleChartData singleChartData = (SingleChartData) other;
            return Intrinsics.areEqual(this.chartTitle, singleChartData.chartTitle) && this.color == singleChartData.color && Intrinsics.areEqual(this.data, singleChartData.data);
        }

        public int hashCode() {
            return (((this.chartTitle.hashCode() * 31) + Integer.hashCode(this.color)) * 31) + this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "SingleChartData(chartTitle=" + this.chartTitle + ", color=" + this.color + ", data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrendLineChart$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\t\u0010\fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "barValue", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "limitValues", "c", "barColor", "", "limitLineColors", "<init>", "(ILjava/util/List;ILjava/util/List;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SingleEntry {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int barValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Integer> limitValues;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int barColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<Integer> limitLineColors;

        public SingleEntry(int i, @NotNull List<Integer> limitValues, int i2, @NotNull List<Integer> limitLineColors) {
            Intrinsics.checkNotNullParameter(limitValues, "limitValues");
            Intrinsics.checkNotNullParameter(limitLineColors, "limitLineColors");
            this.barValue = i;
            this.limitValues = limitValues;
            this.barColor = i2;
            this.limitLineColors = limitLineColors;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBarColor() {
            return this.barColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBarValue() {
            return this.barValue;
        }

        @NotNull
        public final List<Integer> c() {
            return this.limitLineColors;
        }

        @NotNull
        public final List<Integer> d() {
            return this.limitValues;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleEntry)) {
                return false;
            }
            SingleEntry singleEntry = (SingleEntry) other;
            return this.barValue == singleEntry.barValue && Intrinsics.areEqual(this.limitValues, singleEntry.limitValues) && this.barColor == singleEntry.barColor && Intrinsics.areEqual(this.limitLineColors, singleEntry.limitLineColors);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.barValue) * 31) + this.limitValues.hashCode()) * 31) + Integer.hashCode(this.barColor)) * 31) + this.limitLineColors.hashCode();
        }

        @NotNull
        public String toString() {
            return "SingleEntry(barValue=" + this.barValue + ", limitValues=" + this.limitValues + ", barColor=" + this.barColor + ", limitLineColors=" + this.limitLineColors + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrendLineChart$f, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$f;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;", "a", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;", "()Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;", "leftChartData", "b", "rightChartData", "", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "rightMsgList", "<init>", "(Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;Lcom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart$d;Ljava/util/List;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class StepTrent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final SingleChartData leftChartData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final SingleChartData rightChartData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public List<RightLineMsg> rightMsgList;

        public StepTrent(@NotNull SingleChartData leftChartData, @NotNull SingleChartData rightChartData, @NotNull List<RightLineMsg> rightMsgList) {
            Intrinsics.checkNotNullParameter(leftChartData, "leftChartData");
            Intrinsics.checkNotNullParameter(rightChartData, "rightChartData");
            Intrinsics.checkNotNullParameter(rightMsgList, "rightMsgList");
            this.leftChartData = leftChartData;
            this.rightChartData = rightChartData;
            this.rightMsgList = rightMsgList;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SingleChartData getLeftChartData() {
            return this.leftChartData;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final SingleChartData getRightChartData() {
            return this.rightChartData;
        }

        @NotNull
        public final List<RightLineMsg> c() {
            return this.rightMsgList;
        }

        public final void d(@NotNull List<RightLineMsg> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.rightMsgList = list;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepTrent)) {
                return false;
            }
            StepTrent stepTrent = (StepTrent) other;
            return Intrinsics.areEqual(this.leftChartData, stepTrent.leftChartData) && Intrinsics.areEqual(this.rightChartData, stepTrent.rightChartData) && Intrinsics.areEqual(this.rightMsgList, stepTrent.rightMsgList);
        }

        public int hashCode() {
            return (((this.leftChartData.hashCode() * 31) + this.rightChartData.hashCode()) * 31) + this.rightMsgList.hashCode();
        }

        @NotNull
        public String toString() {
            return "StepTrent(leftChartData=" + this.leftChartData + ", rightChartData=" + this.rightChartData + ", rightMsgList=" + this.rightMsgList + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WeekTrendLineChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrendLineChart\n*L\n1#1,328:1\n358#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((RightLineMsg) t2).getValue()), Integer.valueOf(((RightLineMsg) t).getValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekTrendLineChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.stepTrent = new StepTrent(new SingleChartData("", 0, CollectionsKt__CollectionsKt.emptyList()), new SingleChartData("", 0, CollectionsKt__CollectionsKt.emptyList()), CollectionsKt__CollectionsKt.emptyList());
        this.drawCircle = true;
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        this.filledPath = new Path();
        this.phaseY = 1.0f;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT > 29) {
            setForceDarkAllowed(false);
        }
    }

    private final void adjustTextHeight(List<Integer> textHeightList, float pairHeight) {
        if (textHeightList.isEmpty()) {
            return;
        }
        if (textHeightList.size() <= 1) {
            textHeightList.set(0, Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(textHeightList.get(0).intValue(), (int) (pairHeight / 2))));
            return;
        }
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.abs(textHeightList.get(0).intValue() - textHeightList.get(1).intValue()), MathKt__MathJVMKt.roundToInt(dp(2.0f) + pairHeight));
        float f = pairHeight / 2;
        if (textHeightList.get(1).intValue() < f) {
            textHeightList.set(1, Integer.valueOf(MathKt__MathJVMKt.roundToInt(f)));
            textHeightList.set(0, Integer.valueOf(textHeightList.get(1).intValue() + iCoerceAtLeast));
        }
        if (textHeightList.get(0).intValue() - textHeightList.get(1).intValue() < iCoerceAtLeast) {
            textHeightList.set(0, Integer.valueOf(textHeightList.get(1).intValue() + iCoerceAtLeast));
        }
    }

    private final Pair<Integer, Integer> countYValue(SingleChartData chartData) {
        int iCoerceAtLeast = 0;
        int iCoerceAtMost = 0;
        for (SingleEntry singleEntry : chartData.c()) {
            Integer num = (Integer) CollectionsKt___CollectionsKt.maxOrNull((Iterable) singleEntry.d());
            if (num != null) {
                iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(num.intValue(), RangesKt___RangesKt.coerceAtLeast(singleEntry.getBarValue(), iCoerceAtLeast));
            }
            Integer num2 = (Integer) CollectionsKt___CollectionsKt.maxOrNull((Iterable) singleEntry.d());
            if (num2 != null) {
                iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(num2.intValue(), RangesKt___RangesKt.coerceAtMost(singleEntry.getBarValue(), iCoerceAtMost));
            }
        }
        return new Pair<>(Integer.valueOf(iCoerceAtLeast), Integer.valueOf(iCoerceAtMost));
    }

    private final float dp(float dpValue) {
        return qmg.a(getContext(), dpValue);
    }

    private final void drawBottomText(Canvas canvas, int textColor, String text, float left, float top, float right, float bottom) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(textColor);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setTextSize(dp(10.0f));
        this.paint.setTextAlign(Paint.Align.CENTER);
        RectF rectF = new RectF(left, top, right, bottom);
        this.paint.setColor(textColor);
        canvas.drawText(text, rectF.centerX(), bottom - this.paint.getFontMetrics().descent, this.paint);
    }

    private final void drawCubicFill(Canvas canvas, Drawable drawable, float left, float top, float right, float bottom) {
        this.filledPath.reset();
        this.filledPath.addPath(this.path);
        this.filledPath.lineTo(right, bottom);
        this.filledPath.lineTo(left, bottom);
        this.filledPath.close();
        int iSave = canvas.save();
        canvas.clipPath(this.filledPath);
        drawable.setBounds((int) left, (int) top, (int) right, (int) bottom);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    private final void drawLine(Canvas canvas, SingleChartData chartData, float left, float top, float right, float bottom, Drawable fillDrawable) {
        this.path.reset();
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(chartData.getColor());
        float f = 1.0f;
        this.paint.setStrokeWidth(dp(1.0f));
        canvas.drawLine(left, bottom, right, bottom, this.paint);
        int size = chartData.c().size();
        float boundary = left + getBoundary();
        int i = 1;
        float boundary2 = ((right - getBoundary()) - boundary) / (size - 1);
        ArrayList<Point> arrayList = new ArrayList();
        int size2 = chartData.c().size();
        int i2 = 0;
        while (i2 < size2) {
            SingleEntry singleEntry = chartData.c().get(i2);
            this.paint.setColor(singleEntry.getBarColor());
            float f2 = boundary + (i2 * boundary2);
            float barValue = bottom - (this.phaseY * singleEntry.getBarValue());
            if (!this.drawRightLine && i2 != chartData.c().size() - i) {
                int i3 = 0;
                for (Object obj : singleEntry.d()) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue > 0) {
                        this.paint.setColor(singleEntry.c().get(i3).intValue());
                        this.paint.setStrokeWidth(dp(f));
                        float fI = AnimatorUtil.INSTANCE.i(this.phaseY, iIntValue, bottom);
                        canvas.drawLine(f2, fI, f2 + boundary2, fI, this.paint);
                    }
                    barValue = barValue;
                    f2 = f2;
                    i2 = i2;
                    i3 = i4;
                    f = 1.0f;
                }
            }
            float f3 = barValue;
            float f4 = f2;
            int i5 = i2;
            if (f3 < bottom) {
                arrayList.add(new Point(f4, f3, singleEntry.getBarColor()));
            }
            i2 = i5 + 1;
            f = 1.0f;
            i = 1;
        }
        if (arrayList.size() > 1) {
            float x = ((Point) arrayList.get(0)).getX();
            float x2 = ((Point) arrayList.get(arrayList.size() - 1)).getX();
            for (Point point : arrayList) {
                if (this.path.isEmpty()) {
                    this.path.moveTo(point.getX(), point.getY());
                } else {
                    this.path.lineTo(point.getX(), point.getY());
                }
            }
            if (fillDrawable != null) {
                drawCubicFill(canvas, fillDrawable, x, top, x2, bottom);
            }
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(getLineWidth());
            canvas.drawPath(this.path, this.paint);
            if (this.drawCircle && arrayList.size() > 2) {
                this.paint.setStyle(Paint.Style.FILL);
                int size3 = arrayList.size() - 1;
                for (int i6 = 1; i6 < size3; i6++) {
                    Point point2 = (Point) arrayList.get(i6);
                    this.paint.setColor(getContext().getColor(R$color.lib_base_white));
                    canvas.drawCircle(point2.getX(), point2.getY(), getRadius() + 2, this.paint);
                    this.paint.setColor(point2.getColor());
                    canvas.drawCircle(point2.getX(), point2.getY(), getRadius(), this.paint);
                }
            }
        } else if (arrayList.size() == 1) {
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(((Point) arrayList.get(0)).getX(), ((Point) arrayList.get(0)).getY(), getRadius(), this.paint);
        }
        this.path.reset();
    }

    private final void drawRightLine(Canvas canvas, int yMax, int yMin, float left, float top, float right, float bottom) {
        boolean z = this.drawRightLine;
        List<RightLineMsg> listC = this.stepTrent.c();
        StringBuilder sb = new StringBuilder();
        sb.append("drawRightLine:");
        sb.append(z);
        sb.append(",rightText:");
        sb.append(listC);
        if (this.drawRightLine) {
            List<RightLineMsg> listC2 = this.stepTrent.c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rightMsgList:");
            sb2.append(listC2);
            int i = 0;
            for (Object obj : this.stepTrent.c()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RightLineMsg rightLineMsg = (RightLineMsg) obj;
                this.paint.setStrokeWidth(dp(1.0f));
                this.paint.setColor(rightLineMsg.getValueColor());
                int value = rightLineMsg.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("bottom:");
                sb3.append(bottom);
                sb3.append(",rightMsg.value:");
                sb3.append(value);
                sb3.append(",yMax:");
                sb3.append(yMax);
                float fI = AnimatorUtil.INSTANCE.i(this.phaseY, ((rightLineMsg.getValue() - yMin) / (yMax - yMin)) * (bottom - top), bottom);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("final lineHeight:");
                sb4.append(fI);
                sb4.append(",top:");
                sb4.append(top);
                canvas.drawLine(left, fI, right, fI, this.paint);
                i = i2;
            }
        }
    }

    private final void drawRightText(Canvas canvas, int yMax, int yMin, float left, float top, float right, float bottom) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setTextSize(dp(14.0f));
        this.paint.setTextAlign(Paint.Align.RIGHT);
        float fDp = dp(2.0f);
        ArrayList arrayList = new ArrayList();
        StepTrent stepTrent = this.stepTrent;
        stepTrent.d(CollectionsKt___CollectionsKt.sortedWith(stepTrent.c(), new g()));
        Iterator<T> it = this.stepTrent.c().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) (((((RightLineMsg) it.next()).getValue() - yMin) / (yMax - yMin)) * (bottom - top))));
        }
        float rightTextPairHeight = getRightTextPairHeight();
        adjustTextHeight(arrayList, rightTextPairHeight);
        int i = 0;
        float f = 0.0f;
        for (Object obj : CollectionsKt___CollectionsKt.distinct(this.stepTrent.c())) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RightLineMsg rightLineMsg = (RightLineMsg) obj;
            if (rightLineMsg.getValue() > 0) {
                this.paint.setColor(rightLineMsg.getValueColor());
                float fFloatValue = (bottom - arrayList.get(i).floatValue()) + (rightTextPairHeight / 2);
                if (fFloatValue < rightTextPairHeight) {
                    if (f == 0.0f) {
                        fFloatValue = rightTextPairHeight;
                    }
                }
                float f2 = fFloatValue - rightTextPairHeight;
                if (f2 < 0.0f) {
                    if (f == 0.0f) {
                        fFloatValue = rightTextPairHeight + 0.0f;
                        f2 = 0.0f;
                    }
                }
                if (f2 < f - fDp) {
                    fFloatValue = f + fDp + rightTextPairHeight;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("drawRightText rightMsg:");
                sb.append(rightLineMsg);
                sb.append(",textBottom:");
                sb.append(fFloatValue);
                float fH = AnimatorUtil.INSTANCE.h(this.phaseY, fFloatValue, bottom);
                float f3 = this.phaseY;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("drawRightText after animated textBottom:");
                sb2.append(fH);
                sb2.append(",phaseY:");
                sb2.append(f3);
                drawRightTextPair(canvas, left, top, right, fH, rightLineMsg.getDrawValueStr(), rightLineMsg.getTextMsg());
                f = fH;
            }
            i = i2;
        }
    }

    private final void drawRightTextPair(Canvas canvas, float left, float top, float right, float bottom, String number, String text) {
        this.paint.setTextSize(dp(14.0f));
        float f = bottom - (this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top);
        float f2 = bottom - this.paint.getFontMetrics().descent;
        m8b.f(TAG, "drawRightTextPair number:" + f2 + ",bottom:" + bottom);
        canvas.drawText(number, right, f2, this.paint);
        this.paint.setTextSize(dp(8.0f));
        float f3 = f - this.paint.getFontMetrics().descent;
        m8b.f(TAG, "drawRightTextPair text:" + f3 + ",bottom:" + bottom);
        canvas.drawText(text, right, f3, this.paint);
    }

    private final float getRightNumberHeight() {
        this.paint.setTextSize(dp(14.0f));
        return this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
    }

    private final float getRightTextHeight() {
        List<RightLineMsg> listC = this.stepTrent.c();
        boolean z = true;
        if (!(listC instanceof Collection) || !listC.isEmpty()) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                if (!StringsKt__StringsJVMKt.isBlank(((RightLineMsg) it.next()).getTextMsg())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return 0.0f;
        }
        this.paint.setTextSize(dp(8.0f));
        return this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
    }

    private final float getRightTextPairHeight() {
        return getRightNumberHeight() + getRightTextHeight();
    }

    private final boolean judgeTrentValid() {
        List<SingleEntry> listC = this.stepTrent.getLeftChartData().c();
        if (listC == null || listC.isEmpty()) {
            return false;
        }
        List<SingleEntry> listC2 = this.stepTrent.getRightChartData().c();
        if (listC2 == null || listC2.isEmpty()) {
            return false;
        }
        List<RightLineMsg> listC3 = this.stepTrent.c();
        return !(listC3 == null || listC3.isEmpty());
    }

    private final Pair<SingleChartData, SingleChartData> transferData(float chartHeight, int yMax, int yMin) {
        return TuplesKt.to(transferSingleData(this.stepTrent.getLeftChartData(), yMax, yMin, chartHeight), transferSingleData(this.stepTrent.getRightChartData(), yMax, yMin, chartHeight));
    }

    private final SingleChartData transferSingleData(SingleChartData chartData, int yMax, int yMin, float chartHeight) {
        String chartTitle = chartData.getChartTitle();
        int color = chartData.getColor();
        List<SingleEntry> listC = chartData.c();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
        for (SingleEntry singleEntry : listC) {
            float f = yMax - yMin;
            int barValue = (int) (((singleEntry.getBarValue() - yMin) / f) * chartHeight);
            List<Integer> listD = singleEntry.d();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) (((((Number) it.next()).intValue() - yMin) / f) * chartHeight)));
            }
            arrayList.add(new SingleEntry(barValue, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2), singleEntry.getBarColor(), singleEntry.c()));
        }
        return new SingleChartData(chartTitle, color, arrayList);
    }

    public final void animateY() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(466L);
        objectAnimatorOfFloat.start();
    }

    public final float getBottomOffset() {
        return dp(18.0f);
    }

    public final float getBoundary() {
        return dp(2.0f);
    }

    public final float getCenterSpace() {
        return dp(6.0f);
    }

    public final boolean getDrawCircle() {
        return this.drawCircle;
    }

    public final boolean getDrawRightLine() {
        return this.drawRightLine;
    }

    @Nullable
    public final Drawable getFillLeftDrawable() {
        return this.fillLeftDrawable;
    }

    @Nullable
    public final Drawable getFillRightDrawable() {
        return this.fillRightDrawable;
    }

    public final float getLeftOffset() {
        return dp(16.0f);
    }

    public final float getLineWidth() {
        return dp(2.0f);
    }

    public final float getPhaseY() {
        return this.phaseY;
    }

    public final float getRadius() {
        return dp(2.0f);
    }

    public final float getRightOffset() {
        return dp(62.0f);
    }

    public final float getRightTextEndOffset() {
        return dp(16.0f);
    }

    @NotNull
    public final StepTrent getStepTrent() {
        return this.stepTrent;
    }

    public final float getTopOffset() {
        return dp(2.0f);
    }

    public final int getYMax() {
        return this.yMax;
    }

    public final int getYMin() {
        return this.yMin;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        StringBuilder sb = new StringBuilder();
        sb.append("onDraw() canvas: w=");
        sb.append(width);
        sb.append("; h=");
        sb.append(height);
        sb.append("; view:  w=");
        sb.append(measuredWidth);
        sb.append("; h=");
        sb.append(measuredHeight);
        sb.append(";}");
        this.path.reset();
        float f = 2;
        float measuredWidth2 = (((getMeasuredWidth() - getLeftOffset()) - getRightOffset()) / f) + getLeftOffset();
        float topOffset = getTopOffset();
        float measuredHeight2 = getMeasuredHeight() - getBottomOffset();
        float leftOffset = getLeftOffset();
        float centerSpace = measuredWidth2 - (getCenterSpace() / f);
        float centerSpace2 = measuredWidth2 + (getCenterSpace() / f);
        float measuredWidth3 = getMeasuredWidth() - getRightOffset();
        if (judgeTrentValid()) {
            Pair<Integer, Integer> pairCountYValue = countYValue(this.stepTrent.getLeftChartData());
            Pair<Integer, Integer> pairCountYValue2 = countYValue(this.stepTrent.getRightChartData());
            this.yMax = RangesKt___RangesKt.coerceAtLeast(pairCountYValue.getFirst().intValue(), pairCountYValue2.getFirst().intValue());
            int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(pairCountYValue.getSecond().intValue(), pairCountYValue2.getSecond().intValue());
            this.yMin = iCoerceAtMost;
            m8b.f(TAG, "final YMax:" + this.yMax + ",YMin:" + iCoerceAtMost);
            int i = ((this.yMax / 5) * 5) + 5;
            this.yMax = i;
            Pair<SingleChartData, SingleChartData> pairTransferData = transferData(measuredHeight2 - topOffset, i, this.yMin);
            SingleChartData singleChartDataComponent1 = pairTransferData.component1();
            SingleChartData singleChartDataComponent2 = pairTransferData.component2();
            drawRightLine(canvas, this.yMax, this.yMin, leftOffset, topOffset, measuredWidth3, measuredHeight2);
            drawLine(canvas, singleChartDataComponent1, leftOffset, topOffset, centerSpace, measuredHeight2, this.fillLeftDrawable);
            String chartTitle = this.stepTrent.getLeftChartData().getChartTitle();
            String chartTitle2 = this.stepTrent.getRightChartData().getChartTitle();
            drawBottomText(canvas, this.stepTrent.getLeftChartData().getColor(), chartTitle, leftOffset, measuredHeight2, centerSpace, getMeasuredHeight());
            drawLine(canvas, singleChartDataComponent2, centerSpace2, topOffset, measuredWidth3, measuredHeight2, this.fillRightDrawable);
            drawBottomText(canvas, this.stepTrent.getRightChartData().getColor(), chartTitle2, centerSpace2, measuredHeight2, measuredWidth3, getMeasuredHeight());
            drawRightText(canvas, this.yMax, this.yMin, measuredWidth3, topOffset, getMeasuredWidth() - getRightTextEndOffset(), measuredHeight2);
        }
    }

    public final void refreshData(@NotNull StepTrent stepTrent, boolean drawRightLine) {
        Intrinsics.checkNotNullParameter(stepTrent, "stepTrent");
        this.stepTrent = stepTrent;
        this.drawRightLine = drawRightLine;
        invalidate();
    }

    public final void setDrawCircle(boolean z) {
        this.drawCircle = z;
    }

    public final void setDrawRightLine(boolean z) {
        this.drawRightLine = z;
    }

    public final void setFillLeftDrawable(@Nullable Drawable drawable) {
        this.fillLeftDrawable = drawable;
    }

    public final void setFillRightDrawable(@Nullable Drawable drawable) {
        this.fillRightDrawable = drawable;
    }

    public final void setPhaseY(float phaseY) {
        this.phaseY = phaseY;
        invalidate();
    }

    public final void setStepTrent(@NotNull StepTrent stepTrent) {
        Intrinsics.checkNotNullParameter(stepTrent, "<set-?>");
        this.stepTrent = stepTrent;
    }

    public final void setYMax(int i) {
        this.yMax = i;
    }

    public final void setYMin(int i) {
        this.yMin = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekTrendLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.stepTrent = new StepTrent(new SingleChartData("", 0, CollectionsKt__CollectionsKt.emptyList()), new SingleChartData("", 0, CollectionsKt__CollectionsKt.emptyList()), CollectionsKt__CollectionsKt.emptyList());
        this.drawCircle = true;
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        this.filledPath = new Path();
        this.phaseY = 1.0f;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT > 29) {
            setForceDarkAllowed(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekTrendLineChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.stepTrent = new StepTrent(new SingleChartData("", 0, CollectionsKt__CollectionsKt.emptyList()), new SingleChartData("", 0, CollectionsKt__CollectionsKt.emptyList()), CollectionsKt__CollectionsKt.emptyList());
        this.drawCircle = true;
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        this.filledPath = new Path();
        this.phaseY = 1.0f;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT > 29) {
            setForceDarkAllowed(false);
        }
    }
}