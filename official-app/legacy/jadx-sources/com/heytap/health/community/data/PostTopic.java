package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/community/data/PostTopic;", "", "name", "", "topicId", "", "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getTopicId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PostTopic {

    @NotNull
    private final String name;
    private final long topicId;

    public PostTopic(@NotNull String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.topicId = j2;
    }

    public static /* synthetic */ PostTopic copy$default(PostTopic postTopic, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postTopic.name;
        }
        if ((i & 2) != 0) {
            j2 = postTopic.topicId;
        }
        return postTopic.copy(str, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    public final PostTopic copy(@NotNull String name, long topicId) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PostTopic(name, topicId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostTopic)) {
            return false;
        }
        PostTopic postTopic = (PostTopic) other;
        return Intrinsics.areEqual(this.name, postTopic.name) && this.topicId == postTopic.topicId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Long.hashCode(this.topicId);
    }

    @NotNull
    public String toString() {
        return "PostTopic(name=" + this.name + ", topicId=" + this.topicId + ")";
    }
}
