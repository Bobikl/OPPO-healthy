package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisNoRiskList;", "", "keyIndex", "", "", "commonIndex", "(Ljava/util/List;Ljava/util/List;)V", "getCommonIndex", "()Ljava/util/List;", "getKeyIndex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryAiAnalysisNoRiskList {
    public static final int $stable = 8;

    @Nullable
    private final List<Integer> commonIndex;

    @Nullable
    private final List<Integer> keyIndex;

    public QueryAiAnalysisNoRiskList(@Nullable List<Integer> list, @Nullable List<Integer> list2) {
        this.keyIndex = list;
        this.commonIndex = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryAiAnalysisNoRiskList copy$default(QueryAiAnalysisNoRiskList queryAiAnalysisNoRiskList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = queryAiAnalysisNoRiskList.keyIndex;
        }
        if ((i & 2) != 0) {
            list2 = queryAiAnalysisNoRiskList.commonIndex;
        }
        return queryAiAnalysisNoRiskList.copy(list, list2);
    }

    @Nullable
    public final List<Integer> component1() {
        return this.keyIndex;
    }

    @Nullable
    public final List<Integer> component2() {
        return this.commonIndex;
    }

    @NotNull
    public final QueryAiAnalysisNoRiskList copy(@Nullable List<Integer> keyIndex, @Nullable List<Integer> commonIndex) {
        return new QueryAiAnalysisNoRiskList(keyIndex, commonIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAiAnalysisNoRiskList)) {
            return false;
        }
        QueryAiAnalysisNoRiskList queryAiAnalysisNoRiskList = (QueryAiAnalysisNoRiskList) other;
        return Intrinsics.areEqual(this.keyIndex, queryAiAnalysisNoRiskList.keyIndex) && Intrinsics.areEqual(this.commonIndex, queryAiAnalysisNoRiskList.commonIndex);
    }

    @Nullable
    public final List<Integer> getCommonIndex() {
        return this.commonIndex;
    }

    @Nullable
    public final List<Integer> getKeyIndex() {
        return this.keyIndex;
    }

    public int hashCode() {
        List<Integer> list = this.keyIndex;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.commonIndex;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QueryAiAnalysisNoRiskList(keyIndex=" + this.keyIndex + ", commonIndex=" + this.commonIndex + ")";
    }

    public /* synthetic */ QueryAiAnalysisNoRiskList(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
