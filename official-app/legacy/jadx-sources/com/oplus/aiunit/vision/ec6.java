package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.store.business.rn.service.RnConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ec6;", "", "", "", RnConstant.KEY_INIT_OPTIONS, "Lcom/heytap/health/network/core/BaseResponse;", "", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public interface ec6 {
    @m1e("v1/c2s/esim/feedback/queryUploadStatus")
    @Nullable
    Object a(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Integer>> continuation);

    @m1e("v1/c2s/esim/feedback/uploadDeviceInfo")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Integer>> continuation);
}
