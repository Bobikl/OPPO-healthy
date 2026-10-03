package com.heytap.health.watchface.business.manager.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.n28;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watchface/business/manager/bean/SuggestionReq;", "", n28.KEYWORD, "", "(Ljava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SuggestionReq {

    @NotNull
    private final String keyword;

    public SuggestionReq(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.keyword = keyword;
    }

    public static /* synthetic */ SuggestionReq copy$default(SuggestionReq suggestionReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestionReq.keyword;
        }
        return suggestionReq.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final SuggestionReq copy(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new SuggestionReq(keyword);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SuggestionReq) && Intrinsics.areEqual(this.keyword, ((SuggestionReq) other).keyword);
    }

    @NotNull
    public final String getKeyword() {
        return this.keyword;
    }

    public int hashCode() {
        return this.keyword.hashCode();
    }

    @NotNull
    public String toString() {
        return "SuggestionReq(keyword=" + this.keyword + ")";
    }
}
