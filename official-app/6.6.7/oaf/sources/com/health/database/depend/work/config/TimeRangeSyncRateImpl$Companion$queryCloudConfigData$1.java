package com.health.database.depend.work.config;

import com.heytap.health.network.core.BaseResponse;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.zr8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.database.depend.work.config.TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1", f = "TimeRangeSyncRateImpl.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.health.database.depend.work.config.TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1", f = "TimeRangeSyncRateImpl.kt", i = {}, l = {38, 50}, m = "invokeSuspend", n = {}, s = {})
    public static final class 1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public 1(Continuation<? super 1> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new 1(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1 timeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1 = new TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1(null);
                this.label = 1;
                obj = TimeoutKt.withTimeout(10000L, timeRangeSyncRateImpl$Companion$queryCloudConfigData$1$1$response$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BaseResponse baseResponse = (BaseResponse) obj;
                if (!baseResponse.isSuccess()) {
                    m8b.b("TimeRangeSyncRateImpl", "queryCloudConfigData fail code=" + baseResponse.getErrorCode());
                } else if (baseResponse.getBody() == null) {
                    m8b.m("TimeRangeSyncRateImpl", "queryCloudConfigData body is null");
                } else {
                    TimeRangeSyncRateImpl.Companion companion = TimeRangeSyncRateImpl.INSTANCE;
                    Object body = baseResponse.getBody();
                    Intrinsics.checkNotNull(body);
                    this.label = 2;
                    if (companion.b((SyncDataCloudConfig) body, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (TimeoutCancellationException unused) {
                m8b.b("TimeRangeSyncRateImpl", "queryCloudConfigData cost over 10 sec");
            } catch (Exception e) {
                m8b.b("TimeRangeSyncRateImpl", "queryCloudConfigData e:" + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1(Continuation<? super TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1> continuation) {
        super(2, continuation);
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContextE = zr8.INSTANCE.e();
            1 r1 = new 1(null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineContextE, r1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
