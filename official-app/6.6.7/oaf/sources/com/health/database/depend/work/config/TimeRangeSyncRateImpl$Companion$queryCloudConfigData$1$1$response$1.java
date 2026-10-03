package com.health.database.depend.work.config;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.t2k;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/health/database/depend/work/config/SyncDataCloudConfig;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.database.depend.work.config.TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1", f = "TimeRangeSyncRateImpl.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BaseResponse<SyncDataCloudConfig>>, Object> {
    int label;

    public TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1(Continuation<? super TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1> continuation) {
        super(2, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            t2k t2kVar = (t2k) a.j(t2k.class);
            CloudConfigRequest cloudConfigRequest = new CloudConfigRequest(0, 1, null);
            this.label = 1;
            obj = t2kVar.a(cloudConfigRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BaseResponse<SyncDataCloudConfig>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
