package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/community/data/SearchTopic;", "", "topicId", "", "name", "", "heat", "(JLjava/lang/String;J)V", "getHeat", "()J", "getName", "()Ljava/lang/String;", "getTopicId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchTopic {
    private final long heat;

    @NotNull
    private final String name;
    private final long topicId;

    public SearchTopic(long j2, @NotNull String name, long j3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.topicId = j2;
        this.name = name;
        this.heat = j3;
    }

    public static /* synthetic */ SearchTopic copy$default(SearchTopic searchTopic, long j2, String str, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = searchTopic.topicId;
        }
        long j4 = j2;
        if ((i & 2) != 0) {
            str = searchTopic.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j3 = searchTopic.heat;
        }
        return searchTopic.copy(j4, str2, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getHeat() {
        return this.heat;
    }

    @NotNull
    public final SearchTopic copy(long topicId, @NotNull String name, long heat) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SearchTopic(topicId, name, heat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTopic)) {
            return false;
        }
        SearchTopic searchTopic = (SearchTopic) other;
        return this.topicId == searchTopic.topicId && Intrinsics.areEqual(this.name, searchTopic.name) && this.heat == searchTopic.heat;
    }

    public final long getHeat() {
        return this.heat;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.topicId) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.heat);
    }

    @NotNull
    public String toString() {
        return "SearchTopic(topicId=" + this.topicId + ", name=" + this.name + ", heat=" + this.heat + ")";
    }
}
