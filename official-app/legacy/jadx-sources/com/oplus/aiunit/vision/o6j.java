package com.oplus.aiunit.vision;

import com.heytap.health.p003switch.FuncNetData;
import com.heytap.health.p003switch.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/o6j;", "", "params", "Lcom/heytap/health/switch/Response;", "Lcom/heytap/health/switch/FuncNetData;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface o6j {
    @m1e("v1/c2s/switch/querySwitchStatus")
    @Nullable
    Object a(@av1 @NotNull Object obj, @NotNull Continuation<? super Response<FuncNetData>> continuation);
}
