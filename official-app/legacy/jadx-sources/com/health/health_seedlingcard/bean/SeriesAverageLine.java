package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/health/health_seedlingcard/bean/SeriesAverageLine;", "", CardAction.LIFE_CIRCLE_VALUE_SHOW, "", "lineStyle", "Lcom/health/health_seedlingcard/bean/AverageLineStyle;", Feedback.WIDGET_LABEL, "Lcom/health/health_seedlingcard/bean/AverageLineLabel;", "(ZLcom/health/health_seedlingcard/bean/AverageLineStyle;Lcom/health/health_seedlingcard/bean/AverageLineLabel;)V", "getLabel", "()Lcom/health/health_seedlingcard/bean/AverageLineLabel;", "setLabel", "(Lcom/health/health_seedlingcard/bean/AverageLineLabel;)V", "getLineStyle", "()Lcom/health/health_seedlingcard/bean/AverageLineStyle;", "setLineStyle", "(Lcom/health/health_seedlingcard/bean/AverageLineStyle;)V", "getShow", "()Z", "setShow", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeriesAverageLine {

    @NotNull
    private AverageLineLabel label;

    @NotNull
    private AverageLineStyle lineStyle;
    private boolean show;

    public SeriesAverageLine(boolean z, @NotNull AverageLineStyle lineStyle, @NotNull AverageLineLabel label) {
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        Intrinsics.checkNotNullParameter(label, "label");
        this.show = z;
        this.lineStyle = lineStyle;
        this.label = label;
    }

    public static /* synthetic */ SeriesAverageLine copy$default(SeriesAverageLine seriesAverageLine, boolean z, AverageLineStyle averageLineStyle, AverageLineLabel averageLineLabel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = seriesAverageLine.show;
        }
        if ((i & 2) != 0) {
            averageLineStyle = seriesAverageLine.lineStyle;
        }
        if ((i & 4) != 0) {
            averageLineLabel = seriesAverageLine.label;
        }
        return seriesAverageLine.copy(z, averageLineStyle, averageLineLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AverageLineStyle getLineStyle() {
        return this.lineStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AverageLineLabel getLabel() {
        return this.label;
    }

    @NotNull
    public final SeriesAverageLine copy(boolean show, @NotNull AverageLineStyle lineStyle, @NotNull AverageLineLabel label) {
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        Intrinsics.checkNotNullParameter(label, "label");
        return new SeriesAverageLine(show, lineStyle, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeriesAverageLine)) {
            return false;
        }
        SeriesAverageLine seriesAverageLine = (SeriesAverageLine) other;
        return this.show == seriesAverageLine.show && Intrinsics.areEqual(this.lineStyle, seriesAverageLine.lineStyle) && Intrinsics.areEqual(this.label, seriesAverageLine.label);
    }

    @NotNull
    public final AverageLineLabel getLabel() {
        return this.label;
    }

    @NotNull
    public final AverageLineStyle getLineStyle() {
        return this.lineStyle;
    }

    public final boolean getShow() {
        return this.show;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.lineStyle.hashCode()) * 31) + this.label.hashCode();
    }

    public final void setLabel(@NotNull AverageLineLabel averageLineLabel) {
        Intrinsics.checkNotNullParameter(averageLineLabel, "<set-?>");
        this.label = averageLineLabel;
    }

    public final void setLineStyle(@NotNull AverageLineStyle averageLineStyle) {
        Intrinsics.checkNotNullParameter(averageLineStyle, "<set-?>");
        this.lineStyle = averageLineStyle;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    @NotNull
    public String toString() {
        return "SeriesAverageLine(show=" + this.show + ", lineStyle=" + this.lineStyle + ", label=" + this.label + ")";
    }

    public /* synthetic */ SeriesAverageLine(boolean z, AverageLineStyle averageLineStyle, AverageLineLabel averageLineLabel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, averageLineStyle, averageLineLabel);
    }
}
