package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/ul5;", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "params", "Lcom/heytap/health/network/core/BaseResponse;", "c", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Void;", "a", "", "b", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface ul5 {
    @m1e("v1/c2s/device/passthroughCallback")
    @Nullable
    Object a(@av1 @NotNull Map<String, Object> map, @NotNull Continuation<? super BaseResponse<Void>> continuation);

    @m1e("v1/c2s/device/queryCallback")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Integer>> continuation);

    @m1e("v2/c2s/device/passthrough")
    @Nullable
    Object c(@av1 @NotNull Map<String, Object> map, @NotNull Continuation<? super BaseResponse<String>> continuation);
}
