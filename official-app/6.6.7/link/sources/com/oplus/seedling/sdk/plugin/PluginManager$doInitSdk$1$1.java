package com.oplus.seedling.sdk.plugin;

import com.oplus.seedling.sdk.callback.InitCallback;
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
@DebugMetadata(c = "com.oplus.seedling.sdk.plugin.PluginManager$doInitSdk$1$1", f = "PluginManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PluginManager$doInitSdk$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InitCallback $initCallback;
    final /* synthetic */ PluginManager.InstallMonitor $installMonitorCallback;
    int label;
    final /* synthetic */ PluginManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginManager$doInitSdk$1$1(PluginManager pluginManager, PluginManager.InstallMonitor installMonitor, InitCallback initCallback, Continuation<? super PluginManager$doInitSdk$1$1> continuation) {
        super(2, continuation);
        this.this$0 = pluginManager;
        this.$installMonitorCallback = installMonitor;
        this.$initCallback = initCallback;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PluginManager$doInitSdk$1$1(this.this$0, this.$installMonitorCallback, this.$initCallback, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.invokeInitSdk(this.$installMonitorCallback, this.$initCallback);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
