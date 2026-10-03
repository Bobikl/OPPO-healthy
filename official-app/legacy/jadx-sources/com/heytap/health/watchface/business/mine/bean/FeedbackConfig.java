package com.heytap.health.watchface.business.mine.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watchface/business/mine/bean/FeedbackConfig;", "", "contentUrl", "", "(Ljava/lang/String;)V", "getContentUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeedbackConfig {

    @NotNull
    private final String contentUrl;

    public FeedbackConfig(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.contentUrl = contentUrl;
    }

    public static /* synthetic */ FeedbackConfig copy$default(FeedbackConfig feedbackConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackConfig.contentUrl;
        }
        return feedbackConfig.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @NotNull
    public final FeedbackConfig copy(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        return new FeedbackConfig(contentUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeedbackConfig) && Intrinsics.areEqual(this.contentUrl, ((FeedbackConfig) other).contentUrl);
    }

    @NotNull
    public final String getContentUrl() {
        return this.contentUrl;
    }

    public int hashCode() {
        return this.contentUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "FeedbackConfig(contentUrl=" + this.contentUrl + ")";
    }
}
