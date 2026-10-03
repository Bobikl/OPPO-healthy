package com.oplus.aiunit.vision;

import com.heytap.health.community.data.SearchData;
import com.heytap.health.community.data.SearchTopic;
import com.heytap.health.community.data.TopicBoard;
import com.heytap.health.network.core.BaseResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/b2k;", "", "Lcom/heytap/health/network/core/BaseResponse;", "", "Lcom/heytap/health/community/data/TopicBoard;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "Lcom/heytap/health/community/data/SearchData;", "Lcom/heytap/health/community/data/SearchTopic;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public interface b2k {
    @m1e("v1/c2s/community/topic/board")
    @Nullable
    Object a(@NotNull Continuation<? super BaseResponse<List<TopicBoard>>> continuation);

    @m1e("v1/c2s/community/topic/search")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super BaseResponse<SearchData<SearchTopic>>> continuation);
}
