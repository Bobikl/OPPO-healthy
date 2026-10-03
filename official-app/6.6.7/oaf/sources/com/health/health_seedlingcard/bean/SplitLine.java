package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/health/health_seedlingcard/bean/SplitLine;", "", "show", "", "lineStyle", "Lcom/health/health_seedlingcard/bean/SplitLineStyle;", "(ZLcom/health/health_seedlingcard/bean/SplitLineStyle;)V", "getLineStyle", "()Lcom/health/health_seedlingcard/bean/SplitLineStyle;", "setLineStyle", "(Lcom/health/health_seedlingcard/bean/SplitLineStyle;)V", "getShow", "()Z", "setShow", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SplitLine {

    @NotNull
    private SplitLineStyle lineStyle;
    private boolean show;

    public SplitLine(boolean z, @NotNull SplitLineStyle splitLineStyle) {
        Intrinsics.checkNotNullParameter(splitLineStyle, "lineStyle");
        this.show = z;
        this.lineStyle = splitLineStyle;
    }

    public static /* synthetic */ SplitLine copy$default(SplitLine splitLine, boolean z, SplitLineStyle splitLineStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            z = splitLine.show;
        }
        if ((i & 2) != 0) {
            splitLineStyle = splitLine.lineStyle;
        }
        return splitLine.copy(z, splitLineStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SplitLineStyle getLineStyle() {
        return this.lineStyle;
    }

    @NotNull
    public final SplitLine copy(boolean show, @NotNull SplitLineStyle lineStyle) {
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        return new SplitLine(show, lineStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitLine)) {
            return false;
        }
        SplitLine splitLine = (SplitLine) other;
        return this.show == splitLine.show && Intrinsics.areEqual(this.lineStyle, splitLine.lineStyle);
    }

    @NotNull
    public final SplitLineStyle getLineStyle() {
        return this.lineStyle;
    }

    public final boolean getShow() {
        return this.show;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.lineStyle.hashCode();
    }

    public final void setLineStyle(@NotNull SplitLineStyle splitLineStyle) {
        Intrinsics.checkNotNullParameter(splitLineStyle, "<set-?>");
        this.lineStyle = splitLineStyle;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    @NotNull
    public String toString() {
        return "SplitLine(show=" + this.show + ", lineStyle=" + this.lineStyle + ")";
    }

    public /* synthetic */ SplitLine(boolean z, SplitLineStyle splitLineStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, splitLineStyle);
    }
}
