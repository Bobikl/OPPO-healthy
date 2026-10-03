package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.actions.SearchIntents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/heytap/sports/record/details/bean/H5Params;", "", "requestId", "", "ssoid", SearchIntents.EXTRA_QUERY, "Lcom/heytap/sports/record/details/bean/H5QueryData;", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/sports/record/details/bean/H5QueryData;)V", "getQuery", "()Lcom/heytap/sports/record/details/bean/H5QueryData;", "getRequestId", "()Ljava/lang/String;", "getSsoid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class H5Params {
    public static final int $stable = 0;

    @NotNull
    private final H5QueryData query;

    @NotNull
    private final String requestId;

    @NotNull
    private final String ssoid;

    public H5Params(@NotNull String requestId, @NotNull String ssoid, @NotNull H5QueryData query) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(query, "query");
        this.requestId = requestId;
        this.ssoid = ssoid;
        this.query = query;
    }

    public static /* synthetic */ H5Params copy$default(H5Params h5Params, String str, String str2, H5QueryData h5QueryData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h5Params.requestId;
        }
        if ((i & 2) != 0) {
            str2 = h5Params.ssoid;
        }
        if ((i & 4) != 0) {
            h5QueryData = h5Params.query;
        }
        return h5Params.copy(str, str2, h5QueryData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final H5QueryData getQuery() {
        return this.query;
    }

    @NotNull
    public final H5Params copy(@NotNull String requestId, @NotNull String ssoid, @NotNull H5QueryData query) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(query, "query");
        return new H5Params(requestId, ssoid, query);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof H5Params)) {
            return false;
        }
        H5Params h5Params = (H5Params) other;
        return Intrinsics.areEqual(this.requestId, h5Params.requestId) && Intrinsics.areEqual(this.ssoid, h5Params.ssoid) && Intrinsics.areEqual(this.query, h5Params.query);
    }

    @NotNull
    public final H5QueryData getQuery() {
        return this.query;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        return (((this.requestId.hashCode() * 31) + this.ssoid.hashCode()) * 31) + this.query.hashCode();
    }

    @NotNull
    public String toString() {
        return "H5Params(requestId=" + this.requestId + ", ssoid=" + this.ssoid + ", query=" + this.query + ")";
    }
}
