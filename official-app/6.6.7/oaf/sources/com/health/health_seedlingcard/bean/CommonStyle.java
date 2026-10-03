package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/health/health_seedlingcard/bean/CommonStyle;", "", "color", "", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CommonStyle {

    @NotNull
    private String color;

    /* JADX WARN: Illegal instructions before constructor call */
    public CommonStyle() {
        String str = null;
        this(str, 1, str);
    }

    public static /* synthetic */ CommonStyle copy$default(CommonStyle commonStyle, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonStyle.color;
        }
        return commonStyle.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final CommonStyle copy(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new CommonStyle(color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonStyle) && Intrinsics.areEqual(this.color, ((CommonStyle) other).color);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public int hashCode() {
        return this.color.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    @NotNull
    public String toString() {
        return "CommonStyle(color=" + this.color + ")";
    }

    public CommonStyle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "color");
        this.color = str;
    }

    public /* synthetic */ CommonStyle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "green" : str);
    }
}
