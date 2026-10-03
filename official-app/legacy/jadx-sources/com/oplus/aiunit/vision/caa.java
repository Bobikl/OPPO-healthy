package com.oplus.aiunit.vision;

import com.heytap.health.insight.data.datasource.net.IntegrateDataBean;
import com.heytap.health.insight.data.datasource.net.RecentDataBean;
import com.heytap.health.insight.data.datasource.net.SyncSingleAxisItem;
import com.heytap.health.network.core.BaseResponse;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ1\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ+\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/caa;", "", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/insight/data/datasource/net/IntegrateDataBean;", "b", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "c", "Lcom/heytap/health/insight/data/datasource/net/SyncSingleAxisItem;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/insight/data/datasource/net/RecentDataBean;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface caa {
    @m1e("v5/c2s/insight/syncSingleAxis")
    @Nullable
    Object a(@av1 @NotNull List<SyncSingleAxisItem> list, @NotNull Continuation<? super BaseResponse<Object>> continuation);

    @m1e("v5/c2s/insight/queryIntegrateData")
    @Nullable
    Object b(@av1 @NotNull Map<String, Integer> map, @NotNull Continuation<? super BaseResponse<IntegrateDataBean>> continuation);

    @m1e("v1/c2s/survey/commitAnswer")
    @Nullable
    Object c(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<Object>> continuation);

    @m1e("v5/c2s/insight/queryDateByExistData")
    @Nullable
    Object d(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<List<Integer>>> continuation);

    @m1e("v5/c2s/insight/queryRecentData")
    @Nullable
    Object e(@NotNull Continuation<? super BaseResponse<RecentDataBean>> continuation);
}
