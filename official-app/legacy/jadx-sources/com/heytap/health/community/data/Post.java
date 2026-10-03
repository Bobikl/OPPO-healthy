package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.lf8;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010-\u001a\u00020\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\u008d\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0013HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0011HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d¨\u0006<"}, d2 = {"Lcom/heytap/health/community/data/Post;", "", "title", "", "content", "publishUser", "Lcom/heytap/health/community/data/PublishUser;", "pictures", "", "Lcom/heytap/health/community/data/PostPicture;", "topics", "Lcom/heytap/health/community/data/PostTopic;", "statistic", "Lcom/heytap/health/community/data/PostStatistic;", "mutual", "Lcom/heytap/health/community/data/Mutual;", "postStatus", "", "postId", "", lf8.API_PATH_RECOMMEND, "Lcom/heytap/health/community/data/Recommend;", "publishTime", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/community/data/PublishUser;Ljava/util/List;Ljava/util/List;Lcom/heytap/health/community/data/PostStatistic;Lcom/heytap/health/community/data/Mutual;IJLcom/heytap/health/community/data/Recommend;J)V", "getContent", "()Ljava/lang/String;", "getMutual", "()Lcom/heytap/health/community/data/Mutual;", "getPictures", "()Ljava/util/List;", "getPostId", "()J", "getPostStatus", "()I", "getPublishTime", "getPublishUser", "()Lcom/heytap/health/community/data/PublishUser;", "getRecommend", "()Lcom/heytap/health/community/data/Recommend;", "getStatistic", "()Lcom/heytap/health/community/data/PostStatistic;", "getTitle", "getTopics", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Post {

    @NotNull
    private final String content;

    @NotNull
    private final Mutual mutual;

    @Nullable
    private final List<PostPicture> pictures;
    private final long postId;
    private final int postStatus;
    private final long publishTime;

    @Nullable
    private final PublishUser publishUser;

    @Nullable
    private final Recommend recommend;

    @Nullable
    private final PostStatistic statistic;

    @NotNull
    private final String title;

    @Nullable
    private final List<PostTopic> topics;

    public Post(@NotNull String title, @NotNull String content, @Nullable PublishUser publishUser, @Nullable List<PostPicture> list, @Nullable List<PostTopic> list2, @Nullable PostStatistic postStatistic, @NotNull Mutual mutual, int i, long j2, @Nullable Recommend recommend, long j3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mutual, "mutual");
        this.title = title;
        this.content = content;
        this.publishUser = publishUser;
        this.pictures = list;
        this.topics = list2;
        this.statistic = postStatistic;
        this.mutual = mutual;
        this.postStatus = i;
        this.postId = j2;
        this.recommend = recommend;
        this.publishTime = j3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Recommend getRecommend() {
        return this.recommend;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getPublishTime() {
        return this.publishTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PublishUser getPublishUser() {
        return this.publishUser;
    }

    @Nullable
    public final List<PostPicture> component4() {
        return this.pictures;
    }

    @Nullable
    public final List<PostTopic> component5() {
        return this.topics;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PostStatistic getStatistic() {
        return this.statistic;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Mutual getMutual() {
        return this.mutual;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPostStatus() {
        return this.postStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getPostId() {
        return this.postId;
    }

    @NotNull
    public final Post copy(@NotNull String title, @NotNull String content, @Nullable PublishUser publishUser, @Nullable List<PostPicture> pictures, @Nullable List<PostTopic> topics, @Nullable PostStatistic statistic, @NotNull Mutual mutual, int postStatus, long postId, @Nullable Recommend recommend, long publishTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mutual, "mutual");
        return new Post(title, content, publishUser, pictures, topics, statistic, mutual, postStatus, postId, recommend, publishTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Post)) {
            return false;
        }
        Post post = (Post) other;
        return Intrinsics.areEqual(this.title, post.title) && Intrinsics.areEqual(this.content, post.content) && Intrinsics.areEqual(this.publishUser, post.publishUser) && Intrinsics.areEqual(this.pictures, post.pictures) && Intrinsics.areEqual(this.topics, post.topics) && Intrinsics.areEqual(this.statistic, post.statistic) && Intrinsics.areEqual(this.mutual, post.mutual) && this.postStatus == post.postStatus && this.postId == post.postId && Intrinsics.areEqual(this.recommend, post.recommend) && this.publishTime == post.publishTime;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final Mutual getMutual() {
        return this.mutual;
    }

    @Nullable
    public final List<PostPicture> getPictures() {
        return this.pictures;
    }

    public final long getPostId() {
        return this.postId;
    }

    public final int getPostStatus() {
        return this.postStatus;
    }

    public final long getPublishTime() {
        return this.publishTime;
    }

    @Nullable
    public final PublishUser getPublishUser() {
        return this.publishUser;
    }

    @Nullable
    public final Recommend getRecommend() {
        return this.recommend;
    }

    @Nullable
    public final PostStatistic getStatistic() {
        return this.statistic;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<PostTopic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.content.hashCode()) * 31;
        PublishUser publishUser = this.publishUser;
        int iHashCode2 = (iHashCode + (publishUser == null ? 0 : publishUser.hashCode())) * 31;
        List<PostPicture> list = this.pictures;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PostTopic> list2 = this.topics;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PostStatistic postStatistic = this.statistic;
        int iHashCode5 = (((((((iHashCode4 + (postStatistic == null ? 0 : postStatistic.hashCode())) * 31) + this.mutual.hashCode()) * 31) + Integer.hashCode(this.postStatus)) * 31) + Long.hashCode(this.postId)) * 31;
        Recommend recommend = this.recommend;
        return ((iHashCode5 + (recommend != null ? recommend.hashCode() : 0)) * 31) + Long.hashCode(this.publishTime);
    }

    @NotNull
    public String toString() {
        return "Post(title=" + this.title + ", content=" + this.content + ", publishUser=" + this.publishUser + ", pictures=" + this.pictures + ", topics=" + this.topics + ", statistic=" + this.statistic + ", mutual=" + this.mutual + ", postStatus=" + this.postStatus + ", postId=" + this.postId + ", recommend=" + this.recommend + ", publishTime=" + this.publishTime + ")";
    }
}
