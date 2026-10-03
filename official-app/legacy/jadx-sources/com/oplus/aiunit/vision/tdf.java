package com.oplus.aiunit.vision;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.community.data.Post;
import com.heytap.health.community.data.TopicBoard;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002J\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/tdf;", "", "", "Lcom/heytap/health/community/data/Post;", "postList", "", "c", "a", "Lcom/heytap/health/community/data/TopicBoard;", "topics", "d", "b", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class tdf {

    @NotNull
    public static final tdf INSTANCE = new tdf();

    @Nullable
    public final List<Post> a() {
        return GsonUtil.c(v9g.x("community_recom").D("community_recom_post"), Post.class);
    }

    @Nullable
    public final List<TopicBoard> b() {
        return GsonUtil.c(v9g.x("community_recom").D("community_recom_topics"), TopicBoard.class);
    }

    public final void c(@NotNull List<Post> postList) {
        Intrinsics.checkNotNullParameter(postList, "postList");
        v9g.x("community_recom").U("community_recom_post", GsonUtil.e(postList));
    }

    public final void d(@NotNull List<TopicBoard> topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        v9g.x("community_recom").U("community_recom_topics", GsonUtil.e(topics));
    }
}
