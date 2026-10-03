package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/cardiovascular/model/SnoreAnalysis;", "", "timestamp", "", "totalOsaResult", "", hp6.DETAIL_ENTRY, "", "Lcom/heytap/health/cardiovascular/model/SnoreResult;", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;)V", "getDetails", "()Ljava/util/List;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalOsaResult", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;)Lcom/heytap/health/cardiovascular/model/SnoreAnalysis;", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SnoreAnalysis {
    public static final int $stable = 8;

    @Nullable
    private final List<SnoreResult> details;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final Integer totalOsaResult;

    public SnoreAnalysis() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SnoreAnalysis copy$default(SnoreAnalysis snoreAnalysis, Long l2, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l2 = snoreAnalysis.timestamp;
        }
        if ((i & 2) != 0) {
            num = snoreAnalysis.totalOsaResult;
        }
        if ((i & 4) != 0) {
            list = snoreAnalysis.details;
        }
        return snoreAnalysis.copy(l2, num, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTotalOsaResult() {
        return this.totalOsaResult;
    }

    @Nullable
    public final List<SnoreResult> component3() {
        return this.details;
    }

    @NotNull
    public final SnoreAnalysis copy(@Nullable Long timestamp, @Nullable Integer totalOsaResult, @Nullable List<SnoreResult> details) {
        return new SnoreAnalysis(timestamp, totalOsaResult, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoreAnalysis)) {
            return false;
        }
        SnoreAnalysis snoreAnalysis = (SnoreAnalysis) other;
        return Intrinsics.areEqual(this.timestamp, snoreAnalysis.timestamp) && Intrinsics.areEqual(this.totalOsaResult, snoreAnalysis.totalOsaResult) && Intrinsics.areEqual(this.details, snoreAnalysis.details);
    }

    @Nullable
    public final List<SnoreResult> getDetails() {
        return this.details;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Integer getTotalOsaResult() {
        return this.totalOsaResult;
    }

    public int hashCode() {
        Long l2 = this.timestamp;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Integer num = this.totalOsaResult;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<SnoreResult> list = this.details;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SnoreAnalysis(timestamp=" + this.timestamp + ", totalOsaResult=" + this.totalOsaResult + ", details=" + this.details + ")";
    }

    public SnoreAnalysis(@Nullable Long l2, @Nullable Integer num, @Nullable List<SnoreResult> list) {
        this.timestamp = l2;
        this.totalOsaResult = num;
        this.details = list;
    }

    public /* synthetic */ SnoreAnalysis(Long l2, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
