package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/health/health_seedlingcard/bean/WeeklyStepAxisTick;", "", "show", "", "length", "", "(ZLjava/lang/String;)V", "getLength", "()Ljava/lang/String;", "setLength", "(Ljava/lang/String;)V", "getShow", "()Z", "setShow", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStepAxisTick {

    @NotNull
    private String length;
    private boolean show;

    /* JADX WARN: Illegal instructions before constructor call */
    public WeeklyStepAxisTick() {
        String str = null;
        this(false, str, 3, str);
    }

    public static /* synthetic */ WeeklyStepAxisTick copy$default(WeeklyStepAxisTick weeklyStepAxisTick, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = weeklyStepAxisTick.show;
        }
        if ((i & 2) != 0) {
            str = weeklyStepAxisTick.length;
        }
        return weeklyStepAxisTick.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLength() {
        return this.length;
    }

    @NotNull
    public final WeeklyStepAxisTick copy(boolean show, @NotNull String length) {
        Intrinsics.checkNotNullParameter(length, "length");
        return new WeeklyStepAxisTick(show, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStepAxisTick)) {
            return false;
        }
        WeeklyStepAxisTick weeklyStepAxisTick = (WeeklyStepAxisTick) other;
        return this.show == weeklyStepAxisTick.show && Intrinsics.areEqual(this.length, weeklyStepAxisTick.length);
    }

    @NotNull
    public final String getLength() {
        return this.length;
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
        return (r0 * 31) + this.length.hashCode();
    }

    public final void setLength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.length = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    @NotNull
    public String toString() {
        return "WeeklyStepAxisTick(show=" + this.show + ", length=" + this.length + ")";
    }

    public WeeklyStepAxisTick(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "length");
        this.show = z;
        this.length = str;
    }

    public /* synthetic */ WeeklyStepAxisTick(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "10px" : str);
    }
}
