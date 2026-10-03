package com.health.database.depend.work.config;

import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.vd8;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.database.depend.work.config.TimeRangeSyncRateImpl$Companion$processConfig$2", f = "TimeRangeSyncRateImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TimeRangeSyncRateImpl$Companion$processConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SyncDataCloudConfig $config;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeRangeSyncRateImpl$Companion$processConfig$2(SyncDataCloudConfig syncDataCloudConfig, Continuation<? super TimeRangeSyncRateImpl$Companion$processConfig$2> continuation) {
        super(2, continuation);
        this.$config = syncDataCloudConfig;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TimeRangeSyncRateImpl$Companion$processConfig$2(this.$config, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            fdg.x(TimeRangeSyncRateImpl.CLOUD_CONFIG).U(TimeRangeSyncRateImpl.SYNC_DATA_TIME_RANGE, vd8.g(this.$config));
            fdg.x(TimeRangeSyncRateImpl.CLOUD_CONFIG).S(TimeRangeSyncRateImpl.QUERY_CONFIG_DATE, o15.i(System.currentTimeMillis()));
            m8b.f("TimeRangeSyncRateImpl", "processConfig success");
        } catch (Exception e) {
            m8b.b("TimeRangeSyncRateImpl", "processConfig e:" + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
