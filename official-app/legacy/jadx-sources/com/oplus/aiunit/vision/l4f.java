package com.oplus.aiunit.vision;

import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.store.business.rn.service.RnConstant;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/l4f;", "", "Lcom/heytap/sporthealth/blib/data/NetResult;", "Lcom/oplus/aiunit/vision/u6f;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", RnConstant.KEY_INIT_OPTIONS, "b", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public interface l4f {
    @m1e("v2/c2s/device/queryUserDeviceRecord")
    @Nullable
    Object a(@NotNull Continuation<? super NetResult<List<Question>>> continuation);

    @m1e("v1/c2s/operation/voteHealthQuestion")
    @Nullable
    Object b(@av1 @NotNull Map<String, Integer> map, @NotNull Continuation<? super NetResult<String>> continuation);

    @m1e("v1/c2s/operation/getHealthQuestion")
    @Nullable
    Object c(@NotNull Continuation<? super NetResult<Question>> continuation);
}
