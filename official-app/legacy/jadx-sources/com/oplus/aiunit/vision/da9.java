package com.oplus.aiunit.vision;

import com.heytap.health.home.homecard.CardFollowedBean;
import com.heytap.health.network.core.BaseResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/da9;", "", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/home/homecard/CardFollowedBean;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface da9 {
    @m1e("v1/c2s/card/queryUserCardConfigList")
    @Nullable
    Object a(@NotNull Continuation<? super BaseResponse<CardFollowedBean>> continuation);

    @m1e("api/health/question")
    @Nullable
    Object b(@NotNull Continuation<? super BaseResponse<String>> continuation);
}
