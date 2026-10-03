package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/homemodule/data/ColorSpanInfo;", "", "color", "", "length", "", "start", "(Ljava/lang/String;II)V", "getColor", "()Ljava/lang/String;", "getLength", "()I", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ColorSpanInfo {

    @NotNull
    private final String color;
    private final int length;
    private final int start;

    public ColorSpanInfo() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ ColorSpanInfo copy$default(ColorSpanInfo colorSpanInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = colorSpanInfo.color;
        }
        if ((i3 & 2) != 0) {
            i = colorSpanInfo.length;
        }
        if ((i3 & 4) != 0) {
            i2 = colorSpanInfo.start;
        }
        return colorSpanInfo.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @NotNull
    public final ColorSpanInfo copy(@NotNull String color, int length, int start) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new ColorSpanInfo(color, length, start);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorSpanInfo)) {
            return false;
        }
        ColorSpanInfo colorSpanInfo = (ColorSpanInfo) other;
        return Intrinsics.areEqual(this.color, colorSpanInfo.color) && this.length == colorSpanInfo.length && this.start == colorSpanInfo.start;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.color.hashCode() * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.start);
    }

    @NotNull
    public String toString() {
        return "ColorSpanInfo(color=" + this.color + ", length=" + this.length + ", start=" + this.start + ')';
    }

    public ColorSpanInfo(@NotNull String color, int i, int i2) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
        this.length = i;
        this.start = i2;
    }

    public /* synthetic */ ColorSpanInfo(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
