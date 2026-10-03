package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.operations.bean.KeepTrainBean;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/jb4;", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "c", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "", "Lcom/heytap/health/operations/bean/KeepTrainBean;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface jb4 {
    @m1e("v1/c2s/new/training/data/queryCollectCourseList")
    @Nullable
    Object a(@NotNull Continuation<? super BaseResponse<List<KeepTrainBean>>> continuation);

    @m1e("v1/c2s/new/training/data/deleteCollectCourse")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<?>> continuation);

    @m1e("v1/c2s/new/training/data/collectCourse")
    @Nullable
    Object c(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<?>> continuation);
}
