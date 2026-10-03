package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.m2h, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/m2h;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "enable", "Lkotlin/Pair;", "b", "Lkotlin/Pair;", "c", "()Lkotlin/Pair;", "startTime", "endTime", "<init>", "(ZLkotlin/Pair;Lkotlin/Pair;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SiestaSetting {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Pair<Integer, Integer> startTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Pair<Integer, Integer> endTime;

    public SiestaSetting(boolean z, @NotNull Pair<Integer, Integer> startTime, @NotNull Pair<Integer, Integer> endTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this.enable = z;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final Pair<Integer, Integer> b() {
        return this.endTime;
    }

    @NotNull
    public final Pair<Integer, Integer> c() {
        return this.startTime;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiestaSetting)) {
            return false;
        }
        SiestaSetting siestaSetting = (SiestaSetting) other;
        return this.enable == siestaSetting.enable && Intrinsics.areEqual(this.startTime, siestaSetting.startTime) && Intrinsics.areEqual(this.endTime, siestaSetting.endTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "SiestaSetting(enable=" + this.enable + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
