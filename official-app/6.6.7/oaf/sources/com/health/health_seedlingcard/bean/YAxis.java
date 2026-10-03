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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J_\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0005HÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 ¨\u00068"}, d2 = {"Lcom/health/health_seedlingcard/bean/YAxis;", "", "show", "", "min", "", "max", "paddingScale", "", "tickNumber", "labelPosition", "axisLine", "Lcom/health/health_seedlingcard/bean/AxisLine;", "data", "", "Lcom/health/health_seedlingcard/bean/AxisData;", "(ZIILjava/lang/String;ILjava/lang/String;Lcom/health/health_seedlingcard/bean/AxisLine;Ljava/util/List;)V", "getAxisLine", "()Lcom/health/health_seedlingcard/bean/AxisLine;", "setAxisLine", "(Lcom/health/health_seedlingcard/bean/AxisLine;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getLabelPosition", "()Ljava/lang/String;", "setLabelPosition", "(Ljava/lang/String;)V", "getMax", "()I", "setMax", "(I)V", "getMin", "setMin", "getPaddingScale", "setPaddingScale", "getShow", "()Z", "setShow", "(Z)V", "getTickNumber", "setTickNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class YAxis {

    @NotNull
    private AxisLine axisLine;

    @NotNull
    private List<AxisData> data;

    @NotNull
    private String labelPosition;
    private int max;
    private int min;

    @NotNull
    private String paddingScale;
    private boolean show;
    private int tickNumber;

    public YAxis(boolean z, int i, int i2, @NotNull String str, int i3, @NotNull String str2, @NotNull AxisLine axisLine, @NotNull List<AxisData> list) {
        Intrinsics.checkNotNullParameter(str, "paddingScale");
        Intrinsics.checkNotNullParameter(str2, "labelPosition");
        Intrinsics.checkNotNullParameter(axisLine, "axisLine");
        Intrinsics.checkNotNullParameter(list, "data");
        this.show = z;
        this.min = i;
        this.max = i2;
        this.paddingScale = str;
        this.tickNumber = i3;
        this.labelPosition = str2;
        this.axisLine = axisLine;
        this.data = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaddingScale() {
        return this.paddingScale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTickNumber() {
        return this.tickNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabelPosition() {
        return this.labelPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AxisLine getAxisLine() {
        return this.axisLine;
    }

    @NotNull
    public final List<AxisData> component8() {
        return this.data;
    }

    @NotNull
    public final YAxis copy(boolean show, int min, int max, @NotNull String paddingScale, int tickNumber, @NotNull String labelPosition, @NotNull AxisLine axisLine, @NotNull List<AxisData> data) {
        Intrinsics.checkNotNullParameter(paddingScale, "paddingScale");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(axisLine, "axisLine");
        Intrinsics.checkNotNullParameter(data, "data");
        return new YAxis(show, min, max, paddingScale, tickNumber, labelPosition, axisLine, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YAxis)) {
            return false;
        }
        YAxis yAxis = (YAxis) other;
        return this.show == yAxis.show && this.min == yAxis.min && this.max == yAxis.max && Intrinsics.areEqual(this.paddingScale, yAxis.paddingScale) && this.tickNumber == yAxis.tickNumber && Intrinsics.areEqual(this.labelPosition, yAxis.labelPosition) && Intrinsics.areEqual(this.axisLine, yAxis.axisLine) && Intrinsics.areEqual(this.data, yAxis.data);
    }

    @NotNull
    public final AxisLine getAxisLine() {
        return this.axisLine;
    }

    @NotNull
    public final List<AxisData> getData() {
        return this.data;
    }

    @NotNull
    public final String getLabelPosition() {
        return this.labelPosition;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((r0 * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max)) * 31) + this.paddingScale.hashCode()) * 31) + Integer.hashCode(this.tickNumber)) * 31) + this.labelPosition.hashCode()) * 31) + this.axisLine.hashCode()) * 31) + this.data.hashCode();
    }

    public final void setAxisLine(@NotNull AxisLine axisLine) {
        Intrinsics.checkNotNullParameter(axisLine, "<set-?>");
        this.axisLine = axisLine;
    }

    public final void setData(@NotNull List<AxisData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setLabelPosition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelPosition = str;
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

    @NotNull
    public String toString() {
        return "YAxis(show=" + this.show + ", min=" + this.min + ", max=" + this.max + ", paddingScale=" + this.paddingScale + ", tickNumber=" + this.tickNumber + ", labelPosition=" + this.labelPosition + ", axisLine=" + this.axisLine + ", data=" + this.data + ")";
    }

    public /* synthetic */ YAxis(boolean z, int i, int i2, String str, int i3, String str2, AxisLine axisLine, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 100 : i2, (i4 & 8) != 0 ? "18%" : str, (i4 & 16) != 0 ? 5 : i3, (i4 & 32) != 0 ? "right" : str2, axisLine, list);
    }
}
