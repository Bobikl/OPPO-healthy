package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/health/health_seedlingcard/bean/AverageLineStyle;", "", "type", "", "color", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getType", "setType", "getWidth", "setWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AverageLineStyle {

    @NotNull
    private String color;

    @NotNull
    private String type;

    @NotNull
    private String width;

    public AverageLineStyle() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AverageLineStyle copy$default(AverageLineStyle averageLineStyle, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = averageLineStyle.type;
        }
        if ((i & 2) != 0) {
            str2 = averageLineStyle.color;
        }
        if ((i & 4) != 0) {
            str3 = averageLineStyle.width;
        }
        return averageLineStyle.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    @NotNull
    public final AverageLineStyle copy(@NotNull String type, @NotNull String color, @NotNull String width) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(width, "width");
        return new AverageLineStyle(type, color, width);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AverageLineStyle)) {
            return false;
        }
        AverageLineStyle averageLineStyle = (AverageLineStyle) other;
        return Intrinsics.areEqual(this.type, averageLineStyle.type) && Intrinsics.areEqual(this.color, averageLineStyle.color) && Intrinsics.areEqual(this.width, averageLineStyle.width);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.color.hashCode()) * 31) + this.width.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.width = str;
    }

    @NotNull
    public String toString() {
        return "AverageLineStyle(type=" + this.type + ", color=" + this.color + ", width=" + this.width + ")";
    }

    public AverageLineStyle(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "color");
        Intrinsics.checkNotNullParameter(str3, "width");
        this.type = str;
        this.color = str2;
        this.width = str3;
    }

    public /* synthetic */ AverageLineStyle(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "solid" : str, (i & 2) != 0 ? "#0081ff" : str2, (i & 4) != 0 ? "" : str3);
    }
}
