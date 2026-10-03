package com.heytap.sports.home.compose;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJ@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/heytap/sports/home/compose/SportsHomeExerciseLoad;", "", "state", "", "list", "", "Lkotlin/Pair;", "", "lastDateTime", "", "(ILjava/util/List;Ljava/lang/Long;)V", "getLastDateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getList", "()Ljava/util/List;", "getState", "()I", "component1", "component2", "component3", "copy", "(ILjava/util/List;Ljava/lang/Long;)Lcom/heytap/sports/home/compose/SportsHomeExerciseLoad;", "equals", "", "other", "hashCode", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportsHomeExerciseLoad {
    public static final int $stable = 8;

    @Nullable
    private final Long lastDateTime;

    @NotNull
    private final List<Pair<Integer, Float>> list;
    private final int state;

    public SportsHomeExerciseLoad() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportsHomeExerciseLoad copy$default(SportsHomeExerciseLoad sportsHomeExerciseLoad, int i, List list, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportsHomeExerciseLoad.state;
        }
        if ((i2 & 2) != 0) {
            list = sportsHomeExerciseLoad.list;
        }
        if ((i2 & 4) != 0) {
            l2 = sportsHomeExerciseLoad.lastDateTime;
        }
        return sportsHomeExerciseLoad.copy(i, list, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final List<Pair<Integer, Float>> component2() {
        return this.list;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getLastDateTime() {
        return this.lastDateTime;
    }

    @NotNull
    public final SportsHomeExerciseLoad copy(int state, @NotNull List<Pair<Integer, Float>> list, @Nullable Long lastDateTime) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new SportsHomeExerciseLoad(state, list, lastDateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsHomeExerciseLoad)) {
            return false;
        }
        SportsHomeExerciseLoad sportsHomeExerciseLoad = (SportsHomeExerciseLoad) other;
        return this.state == sportsHomeExerciseLoad.state && Intrinsics.areEqual(this.list, sportsHomeExerciseLoad.list) && Intrinsics.areEqual(this.lastDateTime, sportsHomeExerciseLoad.lastDateTime);
    }

    @Nullable
    public final Long getLastDateTime() {
        return this.lastDateTime;
    }

    @NotNull
    public final List<Pair<Integer, Float>> getList() {
        return this.list;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.state) * 31) + this.list.hashCode()) * 31;
        Long l2 = this.lastDateTime;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportsHomeExerciseLoad(state=" + this.state + ", list=" + this.list + ", lastDateTime=" + this.lastDateTime + ")";
    }

    public SportsHomeExerciseLoad(int i, @NotNull List<Pair<Integer, Float>> list, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.state = i;
        this.list = list;
        this.lastDateTime = l2;
    }

    public /* synthetic */ SportsHomeExerciseLoad(int i, List list, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -2 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? null : l2);
    }
}
