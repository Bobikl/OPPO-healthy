package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J}\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001J\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0007HÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001b¨\u0006D"}, d2 = {"Lcom/health/health_seedlingcard/bean/WeeklyStepyAxis;", "", "show", "", "type", "", "min", "", "max", "paddingScale", "axisPosition", "tickNumber", "axisLine", "Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;", "axisMargin", "scale", "data", "", "Lcom/health/health_seedlingcard/bean/yAxisDataItem;", "(ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;Ljava/lang/String;ZLjava/util/List;)V", "getAxisLine", "()Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;", "setAxisLine", "(Lcom/health/health_seedlingcard/bean/WeeklyStepAxisLine;)V", "getAxisMargin", "()Ljava/lang/String;", "setAxisMargin", "(Ljava/lang/String;)V", "getAxisPosition", "setAxisPosition", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getMax", "()I", "setMax", "(I)V", "getMin", "setMin", "getPaddingScale", "setPaddingScale", "getScale", "()Z", "setScale", "(Z)V", "getShow", "setShow", "getTickNumber", "setTickNumber", "getType", "setType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStepyAxis {

    @NotNull
    private WeeklyStepAxisLine axisLine;

    @NotNull
    private String axisMargin;

    @NotNull
    private String axisPosition;

    @NotNull
    private List<yAxisDataItem> data;
    private int max;
    private int min;

    @NotNull
    private String paddingScale;
    private boolean scale;
    private boolean show;
    private int tickNumber;

    @NotNull
    private String type;

    public WeeklyStepyAxis(boolean z, @NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, int i3, @NotNull WeeklyStepAxisLine weeklyStepAxisLine, @NotNull String str4, boolean z2, @NotNull List<yAxisDataItem> list) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "paddingScale");
        Intrinsics.checkNotNullParameter(str3, "axisPosition");
        Intrinsics.checkNotNullParameter(weeklyStepAxisLine, "axisLine");
        Intrinsics.checkNotNullParameter(str4, "axisMargin");
        Intrinsics.checkNotNullParameter(list, "data");
        this.show = z;
        this.type = str;
        this.min = i;
        this.max = i2;
        this.paddingScale = str2;
        this.axisPosition = str3;
        this.tickNumber = i3;
        this.axisLine = weeklyStepAxisLine;
        this.axisMargin = str4;
        this.scale = z2;
        this.data = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getScale() {
        return this.scale;
    }

    @NotNull
    public final List<yAxisDataItem> component11() {
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

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAxisPosition() {
        return this.axisPosition;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTickNumber() {
        return this.tickNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WeeklyStepAxisLine getAxisLine() {
        return this.axisLine;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAxisMargin() {
        return this.axisMargin;
    }

    @NotNull
    public final WeeklyStepyAxis copy(boolean show, @NotNull String type, int min, int max, @NotNull String paddingScale, @NotNull String axisPosition, int tickNumber, @NotNull WeeklyStepAxisLine axisLine, @NotNull String axisMargin, boolean scale, @NotNull List<yAxisDataItem> data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paddingScale, "paddingScale");
        Intrinsics.checkNotNullParameter(axisPosition, "axisPosition");
        Intrinsics.checkNotNullParameter(axisLine, "axisLine");
        Intrinsics.checkNotNullParameter(axisMargin, "axisMargin");
        Intrinsics.checkNotNullParameter(data, "data");
        return new WeeklyStepyAxis(show, type, min, max, paddingScale, axisPosition, tickNumber, axisLine, axisMargin, scale, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStepyAxis)) {
            return false;
        }
        WeeklyStepyAxis weeklyStepyAxis = (WeeklyStepyAxis) other;
        return this.show == weeklyStepyAxis.show && Intrinsics.areEqual(this.type, weeklyStepyAxis.type) && this.min == weeklyStepyAxis.min && this.max == weeklyStepyAxis.max && Intrinsics.areEqual(this.paddingScale, weeklyStepyAxis.paddingScale) && Intrinsics.areEqual(this.axisPosition, weeklyStepyAxis.axisPosition) && this.tickNumber == weeklyStepyAxis.tickNumber && Intrinsics.areEqual(this.axisLine, weeklyStepyAxis.axisLine) && Intrinsics.areEqual(this.axisMargin, weeklyStepyAxis.axisMargin) && this.scale == weeklyStepyAxis.scale && Intrinsics.areEqual(this.data, weeklyStepyAxis.data);
    }

    @NotNull
    public final WeeklyStepAxisLine getAxisLine() {
        return this.axisLine;
    }

    @NotNull
    public final String getAxisMargin() {
        return this.axisMargin;
    }

    @NotNull
    public final String getAxisPosition() {
        return this.axisPosition;
    }

    @NotNull
    public final List<yAxisDataItem> getData() {
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

    public final boolean getScale() {
        return this.scale;
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
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((((((((((((((r0 * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max)) * 31) + this.paddingScale.hashCode()) * 31) + this.axisPosition.hashCode()) * 31) + Integer.hashCode(this.tickNumber)) * 31) + this.axisLine.hashCode()) * 31) + this.axisMargin.hashCode()) * 31;
        boolean z2 = this.scale;
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

    public final void setAxisPosition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.axisPosition = str;
    }

    public final void setData(@NotNull List<yAxisDataItem> list) {
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

    public final void setScale(boolean z) {
        this.scale = z;
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
        return "WeeklyStepyAxis(show=" + this.show + ", type=" + this.type + ", min=" + this.min + ", max=" + this.max + ", paddingScale=" + this.paddingScale + ", axisPosition=" + this.axisPosition + ", tickNumber=" + this.tickNumber + ", axisLine=" + this.axisLine + ", axisMargin=" + this.axisMargin + ", scale=" + this.scale + ", data=" + this.data + ")";
    }

    public /* synthetic */ WeeklyStepyAxis(boolean z, String str, int i, int i2, String str2, String str3, int i3, WeeklyStepAxisLine weeklyStepAxisLine, String str4, boolean z2, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? "value" : str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 20000 : i2, (i4 & 16) != 0 ? "30%" : str2, (i4 & 32) != 0 ? "right" : str3, (i4 & 64) != 0 ? 11 : i3, weeklyStepAxisLine, (i4 & 256) != 0 ? "10px" : str4, (i4 & 512) != 0 ? true : z2, list);
    }
}
