package com.heytap.health.watchpair.manager;

import com.oplus.aiunit.vision.ml4;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.watchpair.manager.DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3", f = "DeviceResDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $model;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3(String str, Continuation<? super DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3> continuation) {
        super(3, continuation);
        this.$model = str;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ml4.c("DeviceResManager", "flow catch:" + ((Throwable) this.L$0).getMessage() + " by model:" + this.$model);
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3 deviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3 = new DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3(this.$model, continuation);
        deviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3.L$0 = th;
        return deviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$3.invokeSuspend(Unit.INSTANCE);
    }
}
