package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/health/health_seedlingcard/bean/SeriesBarStyle;", "", "radius", "", "width", "showBackground", "", "backgroundColor", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getRadius", "setRadius", "getShowBackground", "()Z", "setShowBackground", "(Z)V", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeriesBarStyle {

    @NotNull
    private String backgroundColor;

    @NotNull
    private String radius;
    private boolean showBackground;

    @NotNull
    private String width;

    public SeriesBarStyle() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ SeriesBarStyle copy$default(SeriesBarStyle seriesBarStyle, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seriesBarStyle.radius;
        }
        if ((i & 2) != 0) {
            str2 = seriesBarStyle.width;
        }
        if ((i & 4) != 0) {
            z = seriesBarStyle.showBackground;
        }
        if ((i & 8) != 0) {
            str3 = seriesBarStyle.backgroundColor;
        }
        return seriesBarStyle.copy(str, str2, z, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRadius() {
        return this.radius;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowBackground() {
        return this.showBackground;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final SeriesBarStyle copy(@NotNull String radius, @NotNull String width, boolean showBackground, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new SeriesBarStyle(radius, width, showBackground, backgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeriesBarStyle)) {
            return false;
        }
        SeriesBarStyle seriesBarStyle = (SeriesBarStyle) other;
        return Intrinsics.areEqual(this.radius, seriesBarStyle.radius) && Intrinsics.areEqual(this.width, seriesBarStyle.width) && this.showBackground == seriesBarStyle.showBackground && Intrinsics.areEqual(this.backgroundColor, seriesBarStyle.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getRadius() {
        return this.radius;
    }

    public final boolean getShowBackground() {
        return this.showBackground;
    }

    @NotNull
    public final String getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.radius.hashCode() * 31) + this.width.hashCode()) * 31;
        boolean z = this.showBackground;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.backgroundColor.hashCode();
    }

    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundColor = str;
    }

    public final void setRadius(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.radius = str;
    }

    public final void setShowBackground(boolean z) {
        this.showBackground = z;
    }

    public final void setWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.width = str;
    }

    @NotNull
    public String toString() {
        return "SeriesBarStyle(radius=" + this.radius + ", width=" + this.width + ", showBackground=" + this.showBackground + ", backgroundColor=" + this.backgroundColor + ")";
    }

    public SeriesBarStyle(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "radius");
        Intrinsics.checkNotNullParameter(str2, "width");
        Intrinsics.checkNotNullParameter(str3, "backgroundColor");
        this.radius = str;
        this.width = str2;
        this.showBackground = z;
        this.backgroundColor = str3;
    }

    public /* synthetic */ SeriesBarStyle(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "23px" : str, (i & 2) != 0 ? "10px" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "rgba(0, 0, 0, 0.06)" : str3);
    }
}
