package com.oplus.aiunit.vision;

import com.heytap.health.community.data.PostRespData;
import com.heytap.health.community.data.SearchRequestParams;
import com.heytap.health.network.core.BaseResponse;
import io.protostuff.MapSchema;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ'\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/eoe;", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/community/data/PostRespData;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "d", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/heytap/health/community/data/SearchRequestParams;", "f", "(Lcom/heytap/health/community/data/SearchRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public interface eoe {
    @m1e("v1/c2s/health/community/post/highQualityPosts")
    @Nullable
    Object a(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<PostRespData>> continuation);

    @m1e("v1/c2s/health/community/post/recommendPostForFree")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super BaseResponse<PostRespData>> continuation);

    @m1e("v1/c2s/health/community/post/postLikeRisk")
    @Nullable
    Object c(@av1 @NotNull Map<String, Long> map, @NotNull Continuation<? super BaseResponse<Object>> continuation);

    @m1e("v1/c2s/health/community/post/recommendPost")
    @Nullable
    Object d(@av1 @Nullable Object obj, @NotNull Continuation<? super BaseResponse<PostRespData>> continuation);

    @m1e("v1/c2s/health/community/post/followPostList")
    @Nullable
    Object e(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<PostRespData>> continuation);

    @m1e("v1/c2s/health/community/post/searchPost")
    @Nullable
    Object f(@av1 @NotNull SearchRequestParams searchRequestParams, @NotNull Continuation<? super BaseResponse<PostRespData>> continuation);
}
