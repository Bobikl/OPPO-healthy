package com.heytap.health.bodyfat.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.ChartXY;
import com.oplus.aiunit.vision.c7n;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\t\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110-\u0012\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000203¢\u0006\u0004\b7\u00108J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR(\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\n\u0010'\"\u0004\b(\u0010)R\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u0019\u0010\r\"\u0004\b+\u0010\u000fR.\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010.\u001a\u0004\b%\u0010/\"\u0004\b0\u00101R#\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002038\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b\u0012\u00105¨\u00069"}, d2 = {"Lcom/heytap/health/bodyfat/ui/ChartDrawableData;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "d", "()J", "setLineColor", "(J)V", "lineColor", "", "b", UserInfo.SEX_FEMALE, MapSchema.FIELD_NAME_ENTRY, "()F", "setLineWidthDp", "(F)V", "lineWidthDp", "c", "i", "setPointRadiusDp", "pointRadiusDp", c7n.g, "setPointBorderWidthDp", "pointBorderWidthDp", c7n.f, "setPointBorderColor", "pointBorderColor", "", "Lcom/oplus/aiunit/vision/c93;", "f", "Ljava/util/List;", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "setLineBreakInterval", "lineBreakInterval", "Lkotlin/Pair;", "Lkotlin/Pair;", "()Lkotlin/Pair;", "setMinMax", "(Lkotlin/Pair;)V", "minMax", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "labelFormat", "<init>", "(JFFFJLjava/util/List;JLkotlin/Pair;Lkotlin/jvm/functions/Function1;)V", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChartCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChartCompose.kt\ncom/heytap/health/bodyfat/ui/ChartDrawableData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1336:1\n1855#2,2:1337\n*S KotlinDebug\n*F\n+ 1 ChartCompose.kt\ncom/heytap/health/bodyfat/ui/ChartDrawableData\n*L\n116#1:1337,2\n*E\n"})
public final /* data */ class ChartDrawableData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long lineColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public float lineWidthDp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public float pointRadiusDp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public float pointBorderWidthDp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long pointBorderColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public List<ChartXY> data;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public long lineBreakInterval;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public Pair<Float, Float> minMax;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Float, String> labelFormat;

    /* JADX WARN: Multi-variable type inference failed */
    public ChartDrawableData(long j2, float f, float f2, float f3, long j3, @NotNull List<ChartXY> data, long j4, @NotNull Pair<Float, Float> minMax, @NotNull Function1<? super Float, String> labelFormat) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(labelFormat, "labelFormat");
        this.lineColor = j2;
        this.lineWidthDp = f;
        this.pointRadiusDp = f2;
        this.pointBorderWidthDp = f3;
        this.pointBorderColor = j3;
        this.data = data;
        this.lineBreakInterval = j4;
        this.minMax = minMax;
        this.labelFormat = labelFormat;
    }

    @NotNull
    public final List<ChartXY> a() {
        return this.data;
    }

    @NotNull
    public final Function1<Float, String> b() {
        return this.labelFormat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLineBreakInterval() {
        return this.lineBreakInterval;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getLineWidthDp() {
        return this.lineWidthDp;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDrawableData)) {
            return false;
        }
        ChartDrawableData chartDrawableData = (ChartDrawableData) other;
        return this.lineColor == chartDrawableData.lineColor && Float.compare(this.lineWidthDp, chartDrawableData.lineWidthDp) == 0 && Float.compare(this.pointRadiusDp, chartDrawableData.pointRadiusDp) == 0 && Float.compare(this.pointBorderWidthDp, chartDrawableData.pointBorderWidthDp) == 0 && this.pointBorderColor == chartDrawableData.pointBorderColor && Intrinsics.areEqual(this.data, chartDrawableData.data) && this.lineBreakInterval == chartDrawableData.lineBreakInterval && Intrinsics.areEqual(this.minMax, chartDrawableData.minMax) && Intrinsics.areEqual(this.labelFormat, chartDrawableData.labelFormat);
    }

    @NotNull
    public final Pair<Float, Float> f() {
        return this.minMax;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPointBorderColor() {
        return this.pointBorderColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getPointBorderWidthDp() {
        return this.pointBorderWidthDp;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.lineColor) * 31) + Float.hashCode(this.lineWidthDp)) * 31) + Float.hashCode(this.pointRadiusDp)) * 31) + Float.hashCode(this.pointBorderWidthDp)) * 31) + Long.hashCode(this.pointBorderColor)) * 31) + this.data.hashCode()) * 31) + Long.hashCode(this.lineBreakInterval)) * 31) + this.minMax.hashCode()) * 31) + this.labelFormat.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPointRadiusDp() {
        return this.pointRadiusDp;
    }

    @NotNull
    public String toString() {
        return "ChartDrawableData(lineColor=" + this.lineColor + ", lineWidthDp=" + this.lineWidthDp + ", pointRadiusDp=" + this.pointRadiusDp + ", pointBorderWidthDp=" + this.pointBorderWidthDp + ", pointBorderColor=" + this.pointBorderColor + ", data=" + this.data + ", lineBreakInterval=" + this.lineBreakInterval + ", minMax=" + this.minMax + ", labelFormat=" + this.labelFormat + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChartDrawableData(long j2, float f, float f2, float f3, long j3, List list, long j4, Pair pair, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Pair pair2;
        Pair pair3;
        long j5 = (i & 64) != 0 ? 0L : j4;
        if ((i & 128) != 0) {
            if (list.isEmpty()) {
                pair3 = TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(100.0f));
            } else {
                Iterator it = list.iterator();
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                while (it.hasNext()) {
                    Float fB = ((ChartXY) it.next()).getY();
                    if (fB != null) {
                        float fFloatValue = fB.floatValue();
                        f5 = fFloatValue > f5 ? fFloatValue : f5;
                        if (fFloatValue < f4) {
                            f4 = fFloatValue;
                        }
                    }
                }
                float f6 = 0.1f * f5;
                float f7 = f4 - f6;
                float f8 = 10;
                float f9 = f7 % f8;
                float f10 = f7 / f8;
                float fFloor = f9 < 0.001f ? ((int) f10) * 10.0f : ((float) Math.floor(f10)) * f8;
                float f11 = f5 + f6;
                float f12 = f11 % f8;
                float f13 = f11 / f8;
                pair3 = TuplesKt.to(Float.valueOf(fFloor >= 0.0f ? fFloor : 0.0f), Float.valueOf(f12 < 0.001f ? ((int) f13) * 10.0f : ((float) Math.ceil(f13)) * f8));
            }
            pair2 = pair3;
        } else {
            pair2 = pair;
        }
        this(j2, f, f2, f3, j3, list, j5, pair2, (i & 256) != 0 ? new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartDrawableData.2
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Float f14) {
                return invoke(f14.floatValue());
            }

            @NotNull
            public final String invoke(float f14) {
                return String.valueOf((int) f14);
            }
        } : function1);
    }
}