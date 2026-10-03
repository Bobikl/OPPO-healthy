package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003Js\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001a¨\u0006@"}, d2 = {"Lcom/health/health_seedlingcard/bean/WeeklyStepxAxis;", "", "show", "", "type", "", "min", "", "max", "paddingScale", "tickNumber", "axisLine", "Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;", "axisMargin", "boundaryGap", "data", "", "Lcom/health/health_seedlingcard/bean/xAxisDataItem;", "(ZLjava/lang/String;IILjava/lang/String;ILcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;Ljava/lang/String;ZLjava/util/List;)V", "getAxisLine", "()Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;", "setAxisLine", "(Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;)V", "getAxisMargin", "()Ljava/lang/String;", "setAxisMargin", "(Ljava/lang/String;)V", "getBoundaryGap", "()Z", "setBoundaryGap", "(Z)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getMax", "()I", "setMax", "(I)V", "getMin", "setMin", "getPaddingScale", "setPaddingScale", "getShow", "setShow", "getTickNumber", "setTickNumber", "getType", "setType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStepxAxis {

    @NotNull
    private WeeklyStepAxisLine axisLine;

    @NotNull
    private String axisMargin;
    private boolean boundaryGap;

    @NotNull
    private List<xAxisDataItem> data;
    private int max;
    private int min;

    @NotNull
    private String paddingScale;
    private boolean show;
    private int tickNumber;

    @NotNull
    private String type;

    public WeeklyStepxAxis(boolean z, @NotNull String str, int i, int i2, @NotNull String str2, int i3, @NotNull WeeklyStepAxisLine weeklyStepAxisLine, @NotNull String str3, boolean z2, @NotNull List<xAxisDataItem> list) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "paddingScale");
        Intrinsics.checkNotNullParameter(weeklyStepAxisLine, "axisLine");
        Intrinsics.checkNotNullParameter(str3, "axisMargin");
        Intrinsics.checkNotNullParameter(list, "data");
        this.show = z;
        this.type = str;
        this.min = i;
        this.max = i2;
        this.paddingScale = str2;
        this.tickNumber = i3;
        this.axisLine = weeklyStepAxisLine;
        this.axisMargin = str3;
        this.boundaryGap = z2;
        this.data = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    public final List<xAxisDataItem> component10() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPaddingScale() {
        return this.paddingScale;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTickNumber() {
        return this.tickNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final WeeklyStepAxisLine getAxisLine() {
        return this.axisLine;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAxisMargin() {
        return this.axisMargin;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBoundaryGap() {
        return this.boundaryGap;
    }

    @NotNull
    public final WeeklyStepxAxis copy(boolean show, @NotNull String type, int min, int max, @NotNull String paddingScale, int tickNumber, @NotNull WeeklyStepAxisLine axisLine, @NotNull String axisMargin, boolean boundaryGap, @NotNull List<xAxisDataItem> data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paddingScale, "paddingScale");
        Intrinsics.checkNotNullParameter(axisLine, "axisLine");
        Intrinsics.checkNotNullParameter(axisMargin, "axisMargin");
        Intrinsics.checkNotNullParameter(data, "data");
        return new WeeklyStepxAxis(show, type, min, max, paddingScale, tickNumber, axisLine, axisMargin, boundaryGap, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStepxAxis)) {
            return false;
        }
        WeeklyStepxAxis weeklyStepxAxis = (WeeklyStepxAxis) other;
        return this.show == weeklyStepxAxis.show && Intrinsics.areEqual(this.type, weeklyStepxAxis.type) && this.min == weeklyStepxAxis.min && this.max == weeklyStepxAxis.max && Intrinsics.areEqual(this.paddingScale, weeklyStepxAxis.paddingScale) && this.tickNumber == weeklyStepxAxis.tickNumber && Intrinsics.areEqual(this.axisLine, weeklyStepxAxis.axisLine) && Intrinsics.areEqual(this.axisMargin, weeklyStepxAxis.axisMargin) && this.boundaryGap == weeklyStepxAxis.boundaryGap && Intrinsics.areEqual(this.data, weeklyStepxAxis.data);
    }

    @NotNull
    public final WeeklyStepAxisLine getAxisLine() {
        return this.axisLine;
    }

    @NotNull
    public final String getAxisMargin() {
        return this.axisMargin;
    }

    public final boolean getBoundaryGap() {
        return this.boundaryGap;
    }

    @NotNull
    public final List<xAxisDataItem> getData() {
        return this.data;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final String getPaddingScale() {
        return this.paddingScale;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final int getTickNumber() {
        return this.tickNumber;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((((((((((((r0 * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max)) * 31) + this.paddingScale.hashCode()) * 31) + Integer.hashCode(this.tickNumber)) * 31) + this.axisLine.hashCode()) * 31) + this.axisMargin.hashCode()) * 31;
        boolean z2 = this.boundaryGap;
        return ((iHashCode + (z2 ? 1 : z2)) * 31) + this.data.hashCode();
    }

    public final void setAxisLine(@NotNull WeeklyStepAxisLine weeklyStepAxisLine) {
        Intrinsics.checkNotNullParameter(weeklyStepAxisLine, "<set-?>");
        this.axisLine = weeklyStepAxisLine;
    }

    public final void setAxisMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.axisMargin = str;
    }

    public final void setBoundaryGap(boolean z) {
        this.boundaryGap = z;
    }

    public final void setData(@NotNull List<xAxisDataItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setPaddingScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paddingScale = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setTickNumber(int i) {
        this.tickNumber = i;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "WeeklyStepxAxis(show=" + this.show + ", type=" + this.type + ", min=" + this.min + ", max=" + this.max + ", paddingScale=" + this.paddingScale + ", tickNumber=" + this.tickNumber + ", axisLine=" + this.axisLine + ", axisMargin=" + this.axisMargin + ", boundaryGap=" + this.boundaryGap + ", data=" + this.data + ")";
    }

    public /* synthetic */ WeeklyStepxAxis(boolean z, String str, int i, int i2, String str2, int i3, WeeklyStepAxisLine weeklyStepAxisLine, String str3, boolean z2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? "category" : str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 7 : i2, (i4 & 16) != 0 ? "25.35%" : str2, (i4 & 32) != 0 ? 9 : i3, weeklyStepAxisLine, (i4 & Barcode.FORMAT_ITF) != 0 ? "0px" : str3, (i4 & 256) != 0 ? false : z2, list);
    }
}
