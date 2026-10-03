package com.oplus.seedling.sdk;

import com.oplus.seedling.sdk.callback.InitCallback;
import com.pantanal.fundation.internal.utils.STraceUtils;
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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$buildInitCallbackWrapper$1$onPluginCheckUpdateResult$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SeedlingSdk$buildInitCallbackWrapper$1$onPluginCheckUpdateResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $downloadSize;
    final /* synthetic */ InitCallback $entranceCallBack;
    final /* synthetic */ int $newVersion;
    final /* synthetic */ int $oldVersion;
    final /* synthetic */ int $status;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedlingSdk$buildInitCallbackWrapper$1$onPluginCheckUpdateResult$1(InitCallback initCallback, int i, int i2, int i3, long j, Continuation<? super SeedlingSdk$buildInitCallbackWrapper$1$onPluginCheckUpdateResult$1> continuation) {
        super(2, continuation);
        this.$entranceCallBack = initCallback;
        this.$status = i;
        this.$newVersion = i2;
        this.$oldVersion = i3;
        this.$downloadSize = j;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SeedlingSdk$buildInitCallbackWrapper$1$onPluginCheckUpdateResult$1(this.$entranceCallBack, this.$status, this.$newVersion, this.$oldVersion, this.$downloadSize, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        STraceUtils.a("panta:sdk:SeedlingSdk.InitCb.pluginCheckUpdateResult");
        this.$entranceCallBack.onPluginCheckUpdateResult(this.$status, this.$newVersion, this.$oldVersion, this.$downloadSize);
        STraceUtils.b();
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
