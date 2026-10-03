package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006 "}, d2 = {"Lcom/health/health_seedlingcard/bean/SplitLineStyle;", "", "color", "", "width", "type", "", "", "dashOffset", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getDashOffset", "setDashOffset", "getType", "()Ljava/util/List;", "setType", "(Ljava/util/List;)V", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SplitLineStyle {

    @NotNull
    private String color;

    @NotNull
    private String dashOffset;

    @NotNull
    private List<Integer> type;

    @NotNull
    private String width;

    public SplitLineStyle() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitLineStyle copy$default(SplitLineStyle splitLineStyle, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitLineStyle.color;
        }
        if ((i & 2) != 0) {
            str2 = splitLineStyle.width;
        }
        if ((i & 4) != 0) {
            list = splitLineStyle.type;
        }
        if ((i & 8) != 0) {
            str3 = splitLineStyle.dashOffset;
        }
        return splitLineStyle.copy(str, str2, list, str3);
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
    public final List<Integer> component3() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDashOffset() {
        return this.dashOffset;
    }

    @NotNull
    public final SplitLineStyle copy(@NotNull String color, @NotNull String width, @NotNull List<Integer> type, @NotNull String dashOffset) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(dashOffset, "dashOffset");
        return new SplitLineStyle(color, width, type, dashOffset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitLineStyle)) {
            return false;
        }
        SplitLineStyle splitLineStyle = (SplitLineStyle) other;
        return Intrinsics.areEqual(this.color, splitLineStyle.color) && Intrinsics.areEqual(this.width, splitLineStyle.width) && Intrinsics.areEqual(this.type, splitLineStyle.type) && Intrinsics.areEqual(this.dashOffset, splitLineStyle.dashOffset);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getDashOffset() {
        return this.dashOffset;
    }

    @NotNull
    public final List<Integer> getType() {
        return this.type;
    }

    @NotNull
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + this.width.hashCode()) * 31) + this.type.hashCode()) * 31) + this.dashOffset.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final void setDashOffset(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dashOffset = str;
    }

    public final void setType(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.type = list;
    }

    public final void setWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.width = str;
    }

    @NotNull
    public String toString() {
        return "SplitLineStyle(color=" + this.color + ", width=" + this.width + ", type=" + this.type + ", dashOffset=" + this.dashOffset + ")";
    }

    public SplitLineStyle(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "color");
        Intrinsics.checkNotNullParameter(str2, "width");
        Intrinsics.checkNotNullParameter(list, "type");
        Intrinsics.checkNotNullParameter(str3, "dashOffset");
        this.color = str;
        this.width = str2;
        this.type = list;
        this.dashOffset = str3;
    }

    public /* synthetic */ SplitLineStyle(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "rgba(0, 0, 0, 0.1)" : str, (i & 2) != 0 ? "0.66px" : str2, (i & 4) != 0 ? CollectionsKt.listOf(new Integer[]{4, 4}) : list, (i & 8) != 0 ? "2px" : str3);
    }
}
