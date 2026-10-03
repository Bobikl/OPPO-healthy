package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/health/health_seedlingcard/bean/LineStyle;", "", "color", "", "width", "(Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getWidth", "setWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LineStyle {

    @NotNull
    private String color;

    @NotNull
    private String width;

    /* JADX WARN: Illegal instructions before constructor call */
    public LineStyle() {
        String str = null;
        this(str, str, 3, str);
    }

    public static /* synthetic */ LineStyle copy$default(LineStyle lineStyle, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineStyle.color;
        }
        if ((i & 2) != 0) {
            str2 = lineStyle.width;
        }
        return lineStyle.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    @NotNull
    public final LineStyle copy(@NotNull String color, @NotNull String width) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(width, "width");
        return new LineStyle(color, width);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineStyle)) {
            return false;
        }
        LineStyle lineStyle = (LineStyle) other;
        return Intrinsics.areEqual(this.color, lineStyle.color) && Intrinsics.areEqual(this.width, lineStyle.width);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + this.width.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final void setWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.width = str;
    }

    @NotNull
    public String toString() {
        return "LineStyle(color=" + this.color + ", width=" + this.width + ")";
    }

    public LineStyle(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "color");
        Intrinsics.checkNotNullParameter(str2, "width");
        this.color = str;
        this.width = str2;
    }

    public /* synthetic */ LineStyle(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "black" : str, (i & 2) != 0 ? "10px" : str2);
    }
}
