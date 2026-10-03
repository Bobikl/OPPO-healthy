package com.heytap.health.watchpair.manager;

import com.oplus.aiunit.vision.ml4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.watchpair.manager.DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2", f = "DeviceResDownloadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $model;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2(String str, Continuation<? super DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2> continuation) {
        super(2, continuation);
        this.$model = str;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2 deviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2 = new DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2(this.$model, continuation);
        deviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2.Z$0 = ((Boolean) obj).booleanValue();
        return deviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2;
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ml4.a("DeviceResManager", "flow onEach:" + this.Z$0 + " by model:" + this.$model);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(boolean z, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceResDownloadManager$doDownloadModels$3$async$1$flowReuslt$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
