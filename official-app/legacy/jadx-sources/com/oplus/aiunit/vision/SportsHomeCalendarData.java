package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.oji, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/oji;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getCurrentTime", "()J", "currentTime", "", "b", "Ljava/util/List;", "getDateList", "()Ljava/util/List;", "dateList", "<init>", "(JLjava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportsHomeCalendarData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long currentTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Integer> dateList;

    public SportsHomeCalendarData() {
        this(0L, null, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsHomeCalendarData)) {
            return false;
        }
        SportsHomeCalendarData sportsHomeCalendarData = (SportsHomeCalendarData) other;
        return this.currentTime == sportsHomeCalendarData.currentTime && Intrinsics.areEqual(this.dateList, sportsHomeCalendarData.dateList);
    }

    public int hashCode() {
        return (Long.hashCode(this.currentTime) * 31) + this.dateList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportsHomeCalendarData(currentTime=" + this.currentTime + ", dateList=" + this.dateList + ")";
    }

    public SportsHomeCalendarData(long j2, @NotNull List<Integer> dateList) {
        Intrinsics.checkNotNullParameter(dateList, "dateList");
        this.currentTime = j2;
        this.dateList = dateList;
    }

    public /* synthetic */ SportsHomeCalendarData(long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? System.currentTimeMillis() : j2, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
