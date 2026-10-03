package com.heytap.health.core.widget.charts.customChart;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.core.widget.charts.customChart.WeekTrentChart;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.y04;
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
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 N2\u00020\u0001:\u0006OPQRSTB\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\bE\u00105B\u0011\b\u0016\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bE\u0010HB\u001b\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bE\u0010KB#\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\u0006\u0010L\u001a\u00020\u000f¢\u0006\u0004\bE\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J8\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J@\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J8\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u001e\u0010\u001a\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0002J@\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\bH\u0002J\b\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060!2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\bH\u0002J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0002J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0016\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010*\u001a\u00020\r2\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020\bJ\u0006\u00100\u001a\u00020\bR$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0017\u00106\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00107¨\u0006U"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart;", "Landroid/view/View;", "", "judgeTrentValid", "Landroid/graphics/Canvas;", "canvas", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;", "chartData", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "", "drawBarChart", "", "yMax", "drawRightLine", ParserTag.TAG_TEXT_COLOR, "", "text", "drawBottomText", "drawRightText", "", "textHeightList", "pairHeight", "adjustTextHeight", "number", "drawRightTextPair", "getRightTextPairHeight", "getRightTextHeight", "getRightNumberHeight", "chartHeight", "Lkotlin/Pair;", "transferData", "transferSingleData", "countYMax", "dpValue", "dp", "onDraw", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", "stepTrent", "refreshData", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$a;", "builder", "animateY", "phaseY", "setPhaseY", "getPhaseY", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$a;", "getBuilder", "()Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$a;", "setBuilder", "(Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$a;)V", "density", UserInfo.SEX_FEMALE, "getDensity", "()F", "I", "getYMax", "()I", "setYMax", "(I)V", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "<init>", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWeekTrentChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekTrentChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrentChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1864#2,3:443\n1864#2,3:446\n1054#2:449\n1855#2,2:450\n1864#2,3:452\n2624#2,3:455\n1549#2:458\n1620#2,2:459\n1549#2:461\n1620#2,3:462\n1622#2:465\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 WeekTrentChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrentChart\n*L\n179#1:443,3\n206#1:446,3\n253#1:449\n254#1:450,2\n260#1:452,3\n338#1:455,3\n360#1:458\n360#1:459,2\n362#1:461\n362#1:462,3\n360#1:465\n373#1:466,2\n*E\n"})
public final class WeekTrentChart extends View {

    @Nullable
    private Builder builder;
    private final float density;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;
    private float phaseY;
    private int yMax;

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrentChart$c, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "textMsg", "I", "c", "()I", "value", "drawValueStr", "d", "valueColor", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
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

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrentChart$d, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "chartTitle", "b", "I", "()I", "color", "", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "data", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
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

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrentChart$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\t\u0010\fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "barValue", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "limitValues", "c", "barColor", "", "limitLineColors", "<init>", "(ILjava/util/List;ILjava/util/List;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
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

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrentChart$f, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;", "a", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;", "()Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;", "leftChartData", "b", "rightChartData", "", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "rightMsgs", "<init>", "(Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$d;Ljava/util/List;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class StepTrent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final SingleChartData leftChartData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final SingleChartData rightChartData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public List<RightLineMsg> rightMsgs;

        public StepTrent(@NotNull SingleChartData leftChartData, @NotNull SingleChartData rightChartData, @NotNull List<RightLineMsg> rightMsgs) {
            Intrinsics.checkNotNullParameter(leftChartData, "leftChartData");
            Intrinsics.checkNotNullParameter(rightChartData, "rightChartData");
            Intrinsics.checkNotNullParameter(rightMsgs, "rightMsgs");
            this.leftChartData = leftChartData;
            this.rightChartData = rightChartData;
            this.rightMsgs = rightMsgs;
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
            return this.rightMsgs;
        }

        public final void d(@NotNull List<RightLineMsg> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.rightMsgs = list;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepTrent)) {
                return false;
            }
            StepTrent stepTrent = (StepTrent) other;
            return Intrinsics.areEqual(this.leftChartData, stepTrent.leftChartData) && Intrinsics.areEqual(this.rightChartData, stepTrent.rightChartData) && Intrinsics.areEqual(this.rightMsgs, stepTrent.rightMsgs);
        }

        public int hashCode() {
            return (((this.leftChartData.hashCode() * 31) + this.rightChartData.hashCode()) * 31) + this.rightMsgs.hashCode();
        }

        @NotNull
        public String toString() {
            return "StepTrent(leftChartData=" + this.leftChartData + ", rightChartData=" + this.rightChartData + ", rightMsgs=" + this.rightMsgs + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WeekTrentChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrentChart\n*L\n1#1,328:1\n253#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((RightLineMsg) t2).getValue()), Integer.valueOf(((RightLineMsg) t).getValue()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeekTrentChart(@NotNull Builder builder) {
        this(builder.getContext());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
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

    private final int countYMax(SingleChartData chartData) {
        int iCoerceAtLeast = 0;
        for (SingleEntry singleEntry : chartData.c()) {
            Integer num = (Integer) CollectionsKt___CollectionsKt.maxOrNull((Iterable) singleEntry.d());
            if (num != null) {
                iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(num.intValue(), RangesKt___RangesKt.coerceAtLeast(singleEntry.getBarValue(), iCoerceAtLeast));
            }
        }
        return iCoerceAtLeast;
    }

    private final float dp(float dpValue) {
        return (dpValue * this.density) + 0.5f;
    }

    private final void drawBarChart(Canvas canvas, SingleChartData chartData, float left, float top, float right, float bottom) {
        this.path.reset();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(chartData.getColor());
        canvas.drawLine(left, bottom, right, bottom, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        int size = chartData.c().size();
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        char c2 = 2;
        float f = 2;
        float boundary = (right - left) - (builder.getBoundary() * f);
        Builder builder2 = this.builder;
        Intrinsics.checkNotNull(builder2);
        float barSpacePercent = boundary / (size + ((size - 1) * builder2.getBarSpacePercent()));
        Builder builder3 = this.builder;
        Intrinsics.checkNotNull(builder3);
        float barSpacePercent2 = barSpacePercent * builder3.getBarSpacePercent();
        Builder builder4 = this.builder;
        Intrinsics.checkNotNull(builder4);
        float boundary2 = left + builder4.getBoundary();
        int size2 = chartData.c().size();
        int i = 0;
        while (i < size2) {
            float f2 = boundary2 + (i * (barSpacePercent + barSpacePercent2));
            float f3 = f2 + barSpacePercent;
            SingleEntry singleEntry = chartData.c().get(i);
            this.paint.setColor(singleEntry.getBarColor());
            Path path = this.path;
            int i2 = i;
            RectF rectFG = AnimatorUtil.INSTANCE.g(this.phaseY, f2, bottom - chartData.c().get(i).getBarValue(), f3, bottom);
            float[] fArr = new float[8];
            fArr[0] = dp(1.0f);
            fArr[1] = dp(1.0f);
            fArr[c2] = dp(1.0f);
            fArr[3] = dp(1.0f);
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            path.addRoundRect(rectFG, fArr, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
            this.path.reset();
            Builder builder5 = this.builder;
            Intrinsics.checkNotNull(builder5);
            if (!builder5.getDrawRightLine()) {
                int i3 = 0;
                for (Object obj : singleEntry.d()) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue > 0) {
                        this.paint.setColor(singleEntry.c().get(i3).intValue());
                        this.paint.setStrokeWidth(dp(2.0f));
                        float f4 = barSpacePercent2 / f;
                        AnimatorUtil.Companion companion = AnimatorUtil.INSTANCE;
                        float f5 = iIntValue;
                        canvas.drawLine(f2 - f4, companion.i(this.phaseY, f5, bottom), f3 + f4, companion.i(this.phaseY, f5, bottom), this.paint);
                    }
                    i3 = i4;
                }
            }
            i = i2 + 1;
            c2 = 2;
        }
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

    private final void drawRightLine(Canvas canvas, int yMax, float left, float top, float right, float bottom) {
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        if (builder.getDrawRightLine()) {
            Builder builder2 = this.builder;
            Intrinsics.checkNotNull(builder2);
            int i = 0;
            for (Object obj : builder2.getStepTrent().c()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RightLineMsg rightLineMsg = (RightLineMsg) obj;
                this.paint.setColor(rightLineMsg.getValueColor());
                this.paint.setStrokeWidth(dp(1.0f));
                float fI = AnimatorUtil.INSTANCE.i(this.phaseY, (rightLineMsg.getValue() / yMax) * (bottom - top), bottom);
                canvas.drawLine(left, fI, right, fI, this.paint);
                i = i2;
            }
        }
    }

    private final void drawRightText(Canvas canvas, int yMax, float left, float top, float right, float bottom) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setTextSize(dp(14.0f));
        this.paint.setTextAlign(Paint.Align.RIGHT);
        float fDp = dp(2.0f);
        ArrayList arrayList = new ArrayList();
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        StepTrent stepTrent = builder.getStepTrent();
        Builder builder2 = this.builder;
        Intrinsics.checkNotNull(builder2);
        stepTrent.d(CollectionsKt___CollectionsKt.sortedWith(builder2.getStepTrent().c(), new g()));
        Builder builder3 = this.builder;
        Intrinsics.checkNotNull(builder3);
        Iterator<T> it = builder3.getStepTrent().c().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((((RightLineMsg) it.next()).getValue() / yMax) * (bottom - top))));
        }
        float rightTextPairHeight = getRightTextPairHeight();
        adjustTextHeight(arrayList, rightTextPairHeight);
        Builder builder4 = this.builder;
        Intrinsics.checkNotNull(builder4);
        int i = 0;
        float f = 0.0f;
        for (Object obj : CollectionsKt___CollectionsKt.distinct(builder4.getStepTrent().c())) {
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
                float fH = AnimatorUtil.INSTANCE.h(this.phaseY, fFloatValue, bottom);
                drawRightTextPair(canvas, left, top, right, fH, rightLineMsg.getDrawValueStr(), rightLineMsg.getTextMsg());
                f = fH;
            }
            i = i2;
        }
    }

    private final void drawRightTextPair(Canvas canvas, float left, float top, float right, float bottom, String number, String text) {
        this.paint.setTextSize(dp(14.0f));
        float f = bottom - (this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top);
        canvas.drawText(number, right, bottom - this.paint.getFontMetrics().descent, this.paint);
        this.paint.setTextSize(dp(8.0f));
        canvas.drawText(text, right, f - this.paint.getFontMetrics().descent, this.paint);
    }

    private final float getRightNumberHeight() {
        this.paint.setTextSize(dp(14.0f));
        return this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
    }

    private final float getRightTextHeight() {
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        List<RightLineMsg> listC = builder.getStepTrent().c();
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
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        List<SingleEntry> listC = builder.getStepTrent().getLeftChartData().c();
        if (listC == null || listC.isEmpty()) {
            return false;
        }
        Builder builder2 = this.builder;
        Intrinsics.checkNotNull(builder2);
        List<SingleEntry> listC2 = builder2.getStepTrent().getRightChartData().c();
        if (listC2 == null || listC2.isEmpty()) {
            return false;
        }
        Builder builder3 = this.builder;
        Intrinsics.checkNotNull(builder3);
        List<RightLineMsg> listC3 = builder3.getStepTrent().c();
        return !(listC3 == null || listC3.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshData$lambda$1(WeekTrentChart this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshData$lambda$2(WeekTrentChart this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidate();
    }

    private final Pair<SingleChartData, SingleChartData> transferData(float chartHeight, int yMax) {
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        SingleChartData singleChartDataTransferSingleData = transferSingleData(builder.getStepTrent().getLeftChartData(), yMax, chartHeight);
        Builder builder2 = this.builder;
        Intrinsics.checkNotNull(builder2);
        return TuplesKt.to(singleChartDataTransferSingleData, transferSingleData(builder2.getStepTrent().getRightChartData(), yMax, chartHeight));
    }

    private final SingleChartData transferSingleData(SingleChartData chartData, int yMax, float chartHeight) {
        String chartTitle = chartData.getChartTitle();
        int color = chartData.getColor();
        List<SingleEntry> listC = chartData.c();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
        for (SingleEntry singleEntry : listC) {
            float f = yMax;
            int barValue = (int) ((singleEntry.getBarValue() / f) * chartHeight);
            List<Integer> listD = singleEntry.d();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) ((((Number) it.next()).intValue() / f) * chartHeight)));
            }
            arrayList.add(new SingleEntry(barValue, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2), singleEntry.getBarColor(), singleEntry.c()));
        }
        return new SingleChartData(chartTitle, color, arrayList);
    }

    public final void animateY() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(AnimatorUtil.INSTANCE.n());
        objectAnimatorOfFloat.start();
    }

    @Nullable
    public final Builder getBuilder() {
        return this.builder;
    }

    public final float getDensity() {
        return this.density;
    }

    public final float getPhaseY() {
        return this.phaseY;
    }

    public final int getYMax() {
        return this.yMax;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.builder == null) {
            return;
        }
        this.path.reset();
        float width = canvas.getWidth();
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        float leftOffset = width - builder.getLeftOffset();
        Builder builder2 = this.builder;
        Intrinsics.checkNotNull(builder2);
        float rightOffset = leftOffset - builder2.getRightOffset();
        float f = 2;
        Builder builder3 = this.builder;
        Intrinsics.checkNotNull(builder3);
        float leftOffset2 = (rightOffset / f) + builder3.getLeftOffset();
        Builder builder4 = this.builder;
        Intrinsics.checkNotNull(builder4);
        float topOffset = builder4.getTopOffset();
        float height = canvas.getHeight();
        Builder builder5 = this.builder;
        Intrinsics.checkNotNull(builder5);
        float bottomOffset = height - builder5.getBottomOffset();
        Builder builder6 = this.builder;
        Intrinsics.checkNotNull(builder6);
        float leftOffset3 = builder6.getLeftOffset();
        Builder builder7 = this.builder;
        Intrinsics.checkNotNull(builder7);
        float centerSpace = leftOffset2 - (builder7.getCenterSpace() / f);
        Builder builder8 = this.builder;
        Intrinsics.checkNotNull(builder8);
        float centerSpace2 = leftOffset2 + (builder8.getCenterSpace() / f);
        float width2 = canvas.getWidth();
        Builder builder9 = this.builder;
        Intrinsics.checkNotNull(builder9);
        float rightOffset2 = width2 - builder9.getRightOffset();
        if (judgeTrentValid()) {
            Builder builder10 = this.builder;
            Intrinsics.checkNotNull(builder10);
            int iCountYMax = countYMax(builder10.getStepTrent().getLeftChartData());
            Builder builder11 = this.builder;
            Intrinsics.checkNotNull(builder11);
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtLeast(iCountYMax, countYMax(builder11.getStepTrent().getRightChartData())), 1);
            this.yMax = iCoerceAtLeast;
            Pair<SingleChartData, SingleChartData> pairTransferData = transferData(bottomOffset - topOffset, iCoerceAtLeast);
            SingleChartData singleChartDataComponent1 = pairTransferData.component1();
            SingleChartData singleChartDataComponent2 = pairTransferData.component2();
            drawRightLine(canvas, this.yMax, leftOffset3, topOffset, rightOffset2, bottomOffset);
            drawBarChart(canvas, singleChartDataComponent1, leftOffset3, topOffset, centerSpace, bottomOffset);
            Builder builder12 = this.builder;
            Intrinsics.checkNotNull(builder12);
            String chartTitle = builder12.getStepTrent().getLeftChartData().getChartTitle();
            Builder builder13 = this.builder;
            Intrinsics.checkNotNull(builder13);
            String chartTitle2 = builder13.getStepTrent().getRightChartData().getChartTitle();
            Builder builder14 = this.builder;
            Intrinsics.checkNotNull(builder14);
            drawBottomText(canvas, builder14.getStepTrent().getLeftChartData().getColor(), chartTitle, leftOffset3, bottomOffset, centerSpace, canvas.getHeight());
            drawBarChart(canvas, singleChartDataComponent2, centerSpace2, topOffset, rightOffset2, bottomOffset);
            Builder builder15 = this.builder;
            Intrinsics.checkNotNull(builder15);
            drawBottomText(canvas, builder15.getStepTrent().getRightChartData().getColor(), chartTitle2, centerSpace2, bottomOffset, rightOffset2, canvas.getHeight());
            int i = this.yMax;
            float width3 = canvas.getWidth();
            Builder builder16 = this.builder;
            Intrinsics.checkNotNull(builder16);
            drawRightText(canvas, i, rightOffset2, topOffset, width3 - builder16.getLeftOffset(), bottomOffset);
        }
    }

    public final void refreshData(@NotNull StepTrent stepTrent, boolean drawRightLine) {
        Intrinsics.checkNotNullParameter(stepTrent, "stepTrent");
        if (this.builder == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            this.builder = new Builder(context, stepTrent, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 1020, null);
        }
        Builder builder = this.builder;
        Intrinsics.checkNotNull(builder);
        builder.o(stepTrent);
        Builder builder2 = this.builder;
        Intrinsics.checkNotNull(builder2);
        builder2.n(drawRightLine);
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.rpl
            @Override // java.lang.Runnable
            public final void run() {
                WeekTrentChart.refreshData$lambda$1(this.i);
            }
        });
    }

    public final void setBuilder(@Nullable Builder builder) {
        this.builder = builder;
    }

    public final void setPhaseY(float phaseY) {
        this.phaseY = phaseY;
        invalidate();
    }

    public final void setYMax(int i) {
        this.yMax = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekTrentChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        this.phaseY = 1.0f;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT > 29) {
            setForceDarkAllowed(false);
        }
        this.density = b78.a().getResources().getDisplayMetrics().density;
    }

    public final void refreshData(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.spl
            @Override // java.lang.Runnable
            public final void run() {
                WeekTrentChart.refreshData$lambda$2(this.i);
            }
        });
    }

    /* JADX INFO: renamed from: com.heytap.health.core.widget.charts.customChart.WeekTrentChart$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b-\u0010!R\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b0\u0010!R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b2\u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00104\u001a\u0004\b/\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$a;", "", "", "rightOffset", LogFieldKey.MESSAGE_KEY, "", "drawRightLine", "b", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart;", "a", "", "toString", "", "hashCode", "other", "equals", "Landroid/content/Context;", "Landroid/content/Context;", b2n.f, "()Landroid/content/Context;", "context", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", MapSchema.FIELD_NAME_KEY, "()Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", "o", "(Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;)V", "stepTrent", "c", UserInfo.SEX_FEMALE, "d", "()F", "setBottomOffset", "(F)V", "bottomOffset", "j", "setRightOffset", MapSchema.FIELD_NAME_ENTRY, "i", "setLeftOffset", "leftOffset", "f", LogFieldKey.LEVEL_KEY, "setTopOffset", "topOffset", "setBoundary", "boundary", b2n.g, "setBarSpacePercent", "barSpacePercent", "setCenterSpace", "centerSpace", "Z", "()Z", "n", "(Z)V", "<init>", "(Landroid/content/Context;Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;FFFFFFFZ)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWeekTrentChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekTrentChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekTrentChart$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public StepTrent stepTrent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public float bottomOffset;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public float rightOffset;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public float leftOffset;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public float topOffset;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public float boundary;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public float barSpacePercent;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public float centerSpace;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean drawRightLine;

        public Builder(@NotNull Context context, @NotNull StepTrent stepTrent, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stepTrent, "stepTrent");
            this.context = context;
            this.stepTrent = stepTrent;
            this.bottomOffset = f;
            this.rightOffset = f2;
            this.leftOffset = f3;
            this.topOffset = f4;
            this.boundary = f5;
            this.barSpacePercent = f6;
            this.centerSpace = f7;
            this.drawRightLine = z;
        }

        @NotNull
        public final WeekTrentChart a() {
            return new WeekTrentChart(this);
        }

        @NotNull
        public final Builder b(boolean drawRightLine) {
            this.drawRightLine = drawRightLine;
            return this;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getBarSpacePercent() {
            return this.barSpacePercent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getBottomOffset() {
            return this.bottomOffset;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getBoundary() {
            return this.boundary;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.context, builder.context) && Intrinsics.areEqual(this.stepTrent, builder.stepTrent) && Float.compare(this.bottomOffset, builder.bottomOffset) == 0 && Float.compare(this.rightOffset, builder.rightOffset) == 0 && Float.compare(this.leftOffset, builder.leftOffset) == 0 && Float.compare(this.topOffset, builder.topOffset) == 0 && Float.compare(this.boundary, builder.boundary) == 0 && Float.compare(this.barSpacePercent, builder.barSpacePercent) == 0 && Float.compare(this.centerSpace, builder.centerSpace) == 0 && this.drawRightLine == builder.drawRightLine;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getCenterSpace() {
            return this.centerSpace;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getDrawRightLine() {
            return this.drawRightLine;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            int iHashCode = ((((((((((((((((this.context.hashCode() * 31) + this.stepTrent.hashCode()) * 31) + Float.hashCode(this.bottomOffset)) * 31) + Float.hashCode(this.rightOffset)) * 31) + Float.hashCode(this.leftOffset)) * 31) + Float.hashCode(this.topOffset)) * 31) + Float.hashCode(this.boundary)) * 31) + Float.hashCode(this.barSpacePercent)) * 31) + Float.hashCode(this.centerSpace)) * 31;
            boolean z = this.drawRightLine;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            return iHashCode + r2;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getLeftOffset() {
            return this.leftOffset;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getRightOffset() {
            return this.rightOffset;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final StepTrent getStepTrent() {
            return this.stepTrent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final float getTopOffset() {
            return this.topOffset;
        }

        @NotNull
        public final Builder m(float rightOffset) {
            this.rightOffset = rightOffset;
            return this;
        }

        public final void n(boolean z) {
            this.drawRightLine = z;
        }

        public final void o(@NotNull StepTrent stepTrent) {
            Intrinsics.checkNotNullParameter(stepTrent, "<set-?>");
            this.stepTrent = stepTrent;
        }

        @NotNull
        public String toString() {
            return "Builder(context=" + this.context + ", stepTrent=" + this.stepTrent + ", bottomOffset=" + this.bottomOffset + ", rightOffset=" + this.rightOffset + ", leftOffset=" + this.leftOffset + ", topOffset=" + this.topOffset + ", boundary=" + this.boundary + ", barSpacePercent=" + this.barSpacePercent + ", centerSpace=" + this.centerSpace + ", drawRightLine=" + this.drawRightLine + ")";
        }

        public /* synthetic */ Builder(Context context, StepTrent stepTrent, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, stepTrent, (i & 4) != 0 ? ejg.a(context, 18.0f) : f, (i & 8) != 0 ? ejg.a(context, 64.0f) : f2, (i & 16) != 0 ? ejg.a(context, 16.0f) : f3, (i & 32) != 0 ? ejg.a(context, 2.0f) : f4, (i & 64) != 0 ? ejg.a(context, 2.0f) : f5, (i & 128) != 0 ? 1.0f : f6, (i & 256) != 0 ? ejg.a(context, 6.0f) : f7, (i & 512) != 0 ? false : z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekTrentChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        this.phaseY = 1.0f;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT > 29) {
            setForceDarkAllowed(false);
        }
        this.density = b78.a().getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekTrentChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        this.phaseY = 1.0f;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT > 29) {
            setForceDarkAllowed(false);
        }
        this.density = b78.a().getResources().getDisplayMetrics().density;
    }
}
