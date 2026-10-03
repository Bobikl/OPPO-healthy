package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisTextRsp;", "", "summary", "", "suggestion", "(Ljava/lang/String;Ljava/lang/String;)V", "getSuggestion", "()Ljava/lang/String;", "getSummary", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryAiAnalysisTextRsp {
    public static final int $stable = 0;

    @Nullable
    private final String suggestion;

    @Nullable
    private final String summary;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryAiAnalysisTextRsp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QueryAiAnalysisTextRsp copy$default(QueryAiAnalysisTextRsp queryAiAnalysisTextRsp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryAiAnalysisTextRsp.summary;
        }
        if ((i & 2) != 0) {
            str2 = queryAiAnalysisTextRsp.suggestion;
        }
        return queryAiAnalysisTextRsp.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @NotNull
    public final QueryAiAnalysisTextRsp copy(@Nullable String summary, @Nullable String suggestion) {
        return new QueryAiAnalysisTextRsp(summary, suggestion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAiAnalysisTextRsp)) {
            return false;
        }
        QueryAiAnalysisTextRsp queryAiAnalysisTextRsp = (QueryAiAnalysisTextRsp) other;
        return Intrinsics.areEqual(this.summary, queryAiAnalysisTextRsp.summary) && Intrinsics.areEqual(this.suggestion, queryAiAnalysisTextRsp.suggestion);
    }

    @Nullable
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        String str = this.summary;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.suggestion;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QueryAiAnalysisTextRsp(summary=" + this.summary + ", suggestion=" + this.suggestion + ")";
    }

    public QueryAiAnalysisTextRsp(@Nullable String str, @Nullable String str2) {
        this.summary = str;
        this.suggestion = str2;
    }

    public /* synthetic */ QueryAiAnalysisTextRsp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
