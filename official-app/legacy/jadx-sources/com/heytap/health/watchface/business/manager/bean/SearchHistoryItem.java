package com.heytap.health.watchface.business.manager.bean;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/watchface/business/manager/bean/SearchHistoryItem;", "Ljava/io/Serializable;", "original", "", "(Ljava/lang/String;)V", "getOriginal", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchHistoryItem implements Serializable {

    @NotNull
    private final String original;

    public SearchHistoryItem(@NotNull String original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.original = original;
    }

    public static /* synthetic */ SearchHistoryItem copy$default(SearchHistoryItem searchHistoryItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchHistoryItem.original;
        }
        return searchHistoryItem.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOriginal() {
        return this.original;
    }

    @NotNull
    public final SearchHistoryItem copy(@NotNull String original) {
        Intrinsics.checkNotNullParameter(original, "original");
        return new SearchHistoryItem(original);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchHistoryItem) && Intrinsics.areEqual(this.original, ((SearchHistoryItem) other).original);
    }

    @NotNull
    public final String getOriginal() {
        return this.original;
    }

    public int hashCode() {
        return this.original.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchHistoryItem(original=" + this.original + ")";
    }
}
