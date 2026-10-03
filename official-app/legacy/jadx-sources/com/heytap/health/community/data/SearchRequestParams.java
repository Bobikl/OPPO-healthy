package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.n28;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/community/data/SearchRequestParams;", "", n28.KEYWORD, "", "(Ljava/lang/String;)V", "appSortType", "", "getAppSortType", "()Ljava/lang/Integer;", "setAppSortType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", f04.JSON_KEY_DIGITAL_KEY_TYPE, "getKeyType", "()Ljava/lang/String;", "setKeyType", "getKeyword", "orderBy", "getOrderBy", "setOrderBy", "scrollId", "getScrollId", "setScrollId", "component1", "copy", "equals", "", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchRequestParams {

    @Nullable
    private Integer appSortType;

    @Nullable
    private String keyType;

    @NotNull
    private final String keyword;

    @Nullable
    private String orderBy;

    @Nullable
    private String scrollId;

    public SearchRequestParams(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.keyword = keyword;
    }

    public static /* synthetic */ SearchRequestParams copy$default(SearchRequestParams searchRequestParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchRequestParams.keyword;
        }
        return searchRequestParams.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final SearchRequestParams copy(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new SearchRequestParams(keyword);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchRequestParams) && Intrinsics.areEqual(this.keyword, ((SearchRequestParams) other).keyword);
    }

    @Nullable
    public final Integer getAppSortType() {
        return this.appSortType;
    }

    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }

    @NotNull
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final String getOrderBy() {
        return this.orderBy;
    }

    @Nullable
    public final String getScrollId() {
        return this.scrollId;
    }

    public int hashCode() {
        return this.keyword.hashCode();
    }

    public final void setAppSortType(@Nullable Integer num) {
        this.appSortType = num;
    }

    public final void setKeyType(@Nullable String str) {
        this.keyType = str;
    }

    public final void setOrderBy(@Nullable String str) {
        this.orderBy = str;
    }

    public final void setScrollId(@Nullable String str) {
        this.scrollId = str;
    }

    @NotNull
    public String toString() {
        return "SearchRequestParams(keyword=" + this.keyword + ")";
    }
}
