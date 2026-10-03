package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.y04;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Ji\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006:"}, d2 = {"Lcom/health/health_seedlingcard/bean/WaveStyle;", "", "type", "", "radius", "blockHeight", "lineWidth", "labelPosition", "labelMargin", "smooth", "", "splitLine", "Lcom/health/health_seedlingcard/bean/SplitLine;", "pieces", "", "Lcom/health/health_seedlingcard/bean/Pieces;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/health/health_seedlingcard/bean/SplitLine;Ljava/util/List;)V", "getBlockHeight", "()Ljava/lang/String;", "setBlockHeight", "(Ljava/lang/String;)V", "getLabelMargin", "setLabelMargin", "getLabelPosition", "setLabelPosition", "getLineWidth", "setLineWidth", "getPieces", "()Ljava/util/List;", "setPieces", "(Ljava/util/List;)V", "getRadius", "setRadius", "getSmooth", "()Z", "setSmooth", "(Z)V", "getSplitLine", "()Lcom/health/health_seedlingcard/bean/SplitLine;", "setSplitLine", "(Lcom/health/health_seedlingcard/bean/SplitLine;)V", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WaveStyle {

    @NotNull
    private String blockHeight;

    @NotNull
    private String labelMargin;

    @NotNull
    private String labelPosition;

    @NotNull
    private String lineWidth;

    @NotNull
    private List<Pieces> pieces;

    @NotNull
    private String radius;
    private boolean smooth;

    @NotNull
    private SplitLine splitLine;

    @NotNull
    private String type;

    public WaveStyle(@NotNull String type, @NotNull String radius, @NotNull String blockHeight, @NotNull String lineWidth, @NotNull String labelPosition, @NotNull String labelMargin, boolean z, @NotNull SplitLine splitLine, @NotNull List<Pieces> pieces) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(blockHeight, "blockHeight");
        Intrinsics.checkNotNullParameter(lineWidth, "lineWidth");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(labelMargin, "labelMargin");
        Intrinsics.checkNotNullParameter(splitLine, "splitLine");
        Intrinsics.checkNotNullParameter(pieces, "pieces");
        this.type = type;
        this.radius = radius;
        this.blockHeight = blockHeight;
        this.lineWidth = lineWidth;
        this.labelPosition = labelPosition;
        this.labelMargin = labelMargin;
        this.smooth = z;
        this.splitLine = splitLine;
        this.pieces = pieces;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRadius() {
        return this.radius;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBlockHeight() {
        return this.blockHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLineWidth() {
        return this.lineWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabelPosition() {
        return this.labelPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabelMargin() {
        return this.labelMargin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSmooth() {
        return this.smooth;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SplitLine getSplitLine() {
        return this.splitLine;
    }

    @NotNull
    public final List<Pieces> component9() {
        return this.pieces;
    }

    @NotNull
    public final WaveStyle copy(@NotNull String type, @NotNull String radius, @NotNull String blockHeight, @NotNull String lineWidth, @NotNull String labelPosition, @NotNull String labelMargin, boolean smooth, @NotNull SplitLine splitLine, @NotNull List<Pieces> pieces) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(blockHeight, "blockHeight");
        Intrinsics.checkNotNullParameter(lineWidth, "lineWidth");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(labelMargin, "labelMargin");
        Intrinsics.checkNotNullParameter(splitLine, "splitLine");
        Intrinsics.checkNotNullParameter(pieces, "pieces");
        return new WaveStyle(type, radius, blockHeight, lineWidth, labelPosition, labelMargin, smooth, splitLine, pieces);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaveStyle)) {
            return false;
        }
        WaveStyle waveStyle = (WaveStyle) other;
        return Intrinsics.areEqual(this.type, waveStyle.type) && Intrinsics.areEqual(this.radius, waveStyle.radius) && Intrinsics.areEqual(this.blockHeight, waveStyle.blockHeight) && Intrinsics.areEqual(this.lineWidth, waveStyle.lineWidth) && Intrinsics.areEqual(this.labelPosition, waveStyle.labelPosition) && Intrinsics.areEqual(this.labelMargin, waveStyle.labelMargin) && this.smooth == waveStyle.smooth && Intrinsics.areEqual(this.splitLine, waveStyle.splitLine) && Intrinsics.areEqual(this.pieces, waveStyle.pieces);
    }

    @NotNull
    public final String getBlockHeight() {
        return this.blockHeight;
    }

    @NotNull
    public final String getLabelMargin() {
        return this.labelMargin;
    }

    @NotNull
    public final String getLabelPosition() {
        return this.labelPosition;
    }

    @NotNull
    public final String getLineWidth() {
        return this.lineWidth;
    }

    @NotNull
    public final List<Pieces> getPieces() {
        return this.pieces;
    }

    @NotNull
    public final String getRadius() {
        return this.radius;
    }

    public final boolean getSmooth() {
        return this.smooth;
    }

    @NotNull
    public final SplitLine getSplitLine() {
        return this.splitLine;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    public int hashCode() {
        int iHashCode = ((((((((((this.type.hashCode() * 31) + this.radius.hashCode()) * 31) + this.blockHeight.hashCode()) * 31) + this.lineWidth.hashCode()) * 31) + this.labelPosition.hashCode()) * 31) + this.labelMargin.hashCode()) * 31;
        boolean z = this.smooth;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.splitLine.hashCode()) * 31) + this.pieces.hashCode();
    }

    public final void setBlockHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.blockHeight = str;
    }

    public final void setLabelMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelMargin = str;
    }

    public final void setLabelPosition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelPosition = str;
    }

    public final void setLineWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lineWidth = str;
    }

    public final void setPieces(@NotNull List<Pieces> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.pieces = list;
    }

    public final void setRadius(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.radius = str;
    }

    public final void setSmooth(boolean z) {
        this.smooth = z;
    }

    public final void setSplitLine(@NotNull SplitLine splitLine) {
        Intrinsics.checkNotNullParameter(splitLine, "<set-?>");
        this.splitLine = splitLine;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "WaveStyle(type=" + this.type + ", radius=" + this.radius + ", blockHeight=" + this.blockHeight + ", lineWidth=" + this.lineWidth + ", labelPosition=" + this.labelPosition + ", labelMargin=" + this.labelMargin + ", smooth=" + this.smooth + ", splitLine=" + this.splitLine + ", pieces=" + this.pieces + ")";
    }

    public /* synthetic */ WaveStyle(String str, String str2, String str3, String str4, String str5, String str6, boolean z, SplitLine splitLine, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "rect" : str, (i & 2) != 0 ? "0px" : str2, (i & 4) != 0 ? "6.86px" : str3, (i & 8) != 0 ? "1px" : str4, (i & 16) != 0 ? y04.TIME_STYLE_RIGHT_DIR_NAME : str5, (i & 32) != 0 ? "8px" : str6, (i & 64) != 0 ? false : z, splitLine, list);
    }
}
