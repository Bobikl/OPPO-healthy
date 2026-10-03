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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/heytap/health/cardiovascular/model/ScoreAnalysis;", "", "timestamp", "", "lastAvgScore", "", "curAvgScore", hp6.DETAIL_ENTRY, "", "Lcom/heytap/health/cardiovascular/model/ScoreResult;", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getCurAvgScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetails", "()Ljava/util/List;", "getLastAvgScore", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/heytap/health/cardiovascular/model/ScoreAnalysis;", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScoreAnalysis {
    public static final int $stable = 8;

    @Nullable
    private final Integer curAvgScore;

    @Nullable
    private final List<ScoreResult> details;

    @Nullable
    private final Integer lastAvgScore;

    @Nullable
    private final Long timestamp;

    public ScoreAnalysis() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScoreAnalysis copy$default(ScoreAnalysis scoreAnalysis, Long l2, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l2 = scoreAnalysis.timestamp;
        }
        if ((i & 2) != 0) {
            num = scoreAnalysis.lastAvgScore;
        }
        if ((i & 4) != 0) {
            num2 = scoreAnalysis.curAvgScore;
        }
        if ((i & 8) != 0) {
            list = scoreAnalysis.details;
        }
        return scoreAnalysis.copy(l2, num, num2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLastAvgScore() {
        return this.lastAvgScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCurAvgScore() {
        return this.curAvgScore;
    }

    @Nullable
    public final List<ScoreResult> component4() {
        return this.details;
    }

    @NotNull
    public final ScoreAnalysis copy(@Nullable Long timestamp, @Nullable Integer lastAvgScore, @Nullable Integer curAvgScore, @Nullable List<ScoreResult> details) {
        return new ScoreAnalysis(timestamp, lastAvgScore, curAvgScore, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScoreAnalysis)) {
            return false;
        }
        ScoreAnalysis scoreAnalysis = (ScoreAnalysis) other;
        return Intrinsics.areEqual(this.timestamp, scoreAnalysis.timestamp) && Intrinsics.areEqual(this.lastAvgScore, scoreAnalysis.lastAvgScore) && Intrinsics.areEqual(this.curAvgScore, scoreAnalysis.curAvgScore) && Intrinsics.areEqual(this.details, scoreAnalysis.details);
    }

    @Nullable
    public final Integer getCurAvgScore() {
        return this.curAvgScore;
    }

    @Nullable
    public final List<ScoreResult> getDetails() {
        return this.details;
    }

    @Nullable
    public final Integer getLastAvgScore() {
        return this.lastAvgScore;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l2 = this.timestamp;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Integer num = this.lastAvgScore;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.curAvgScore;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ScoreResult> list = this.details;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScoreAnalysis(timestamp=" + this.timestamp + ", lastAvgScore=" + this.lastAvgScore + ", curAvgScore=" + this.curAvgScore + ", details=" + this.details + ")";
    }

    public ScoreAnalysis(@Nullable Long l2, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ScoreResult> list) {
        this.timestamp = l2;
        this.lastAvgScore = num;
        this.curAvgScore = num2;
        this.details = list;
    }

    public /* synthetic */ ScoreAnalysis(Long l2, Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list);
    }
}
