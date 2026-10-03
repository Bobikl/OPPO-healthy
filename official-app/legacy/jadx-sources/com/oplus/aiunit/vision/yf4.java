package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/yf4;", "", "Lcom/oplus/aiunit/vision/gqf;", "body", "Lcom/heytap/health/network/core/BaseResponse;", "", "a", "(Lcom/oplus/aiunit/vision/gqf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public interface yf4 {
    @m1e("v1/c2s/file/uploadUserFileReview")
    @Nullable
    Object a(@av1 @NotNull gqf gqfVar, @NotNull Continuation<? super BaseResponse<String>> continuation);
}
