package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/SearchCityListParam;", "", "version", "", "(J)V", "getVersion", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchCityListParam {
    private final long version;

    public SearchCityListParam(long j2) {
        this.version = j2;
    }

    public static /* synthetic */ SearchCityListParam copy$default(SearchCityListParam searchCityListParam, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = searchCityListParam.version;
        }
        return searchCityListParam.copy(j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @NotNull
    public final SearchCityListParam copy(long version) {
        return new SearchCityListParam(version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchCityListParam) && this.version == ((SearchCityListParam) other).version;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Long.hashCode(this.version);
    }

    @NotNull
    public String toString() {
        return "SearchCityListParam(version=" + this.version + ")";
    }
}
