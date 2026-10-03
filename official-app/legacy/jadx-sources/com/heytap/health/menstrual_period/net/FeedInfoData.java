package com.heytap.health.menstrual_period.net;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/menstrual_period/net/FeedInfoData;", "", "addTime", "", "title", "", "author", "coverUrl", "detailUrl", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddTime", "()J", "getAuthor", "()Ljava/lang/String;", "getCoverUrl", "getDetailUrl", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeedInfoData {
    public static final int $stable = 0;
    private final long addTime;

    @NotNull
    private final String author;

    @NotNull
    private final String coverUrl;

    @NotNull
    private final String detailUrl;

    @NotNull
    private final String title;

    public FeedInfoData(long j2, @NotNull String title, @NotNull String author, @NotNull String coverUrl, @NotNull String detailUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(detailUrl, "detailUrl");
        this.addTime = j2;
        this.title = title;
        this.author = author;
        this.coverUrl = coverUrl;
        this.detailUrl = detailUrl;
    }

    public static /* synthetic */ FeedInfoData copy$default(FeedInfoData feedInfoData, long j2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = feedInfoData.addTime;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            str = feedInfoData.title;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = feedInfoData.author;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = feedInfoData.coverUrl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = feedInfoData.detailUrl;
        }
        return feedInfoData.copy(j3, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAddTime() {
        return this.addTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @NotNull
    public final FeedInfoData copy(long addTime, @NotNull String title, @NotNull String author, @NotNull String coverUrl, @NotNull String detailUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(detailUrl, "detailUrl");
        return new FeedInfoData(addTime, title, author, coverUrl, detailUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedInfoData)) {
            return false;
        }
        FeedInfoData feedInfoData = (FeedInfoData) other;
        return this.addTime == feedInfoData.addTime && Intrinsics.areEqual(this.title, feedInfoData.title) && Intrinsics.areEqual(this.author, feedInfoData.author) && Intrinsics.areEqual(this.coverUrl, feedInfoData.coverUrl) && Intrinsics.areEqual(this.detailUrl, feedInfoData.detailUrl);
    }

    public final long getAddTime() {
        return this.addTime;
    }

    @NotNull
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @NotNull
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.addTime) * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + this.coverUrl.hashCode()) * 31) + this.detailUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "FeedInfoData(addTime=" + this.addTime + ", title=" + this.title + ", author=" + this.author + ", coverUrl=" + this.coverUrl + ", detailUrl=" + this.detailUrl + ")";
    }
}
