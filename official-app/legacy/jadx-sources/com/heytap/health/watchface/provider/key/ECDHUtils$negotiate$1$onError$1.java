package com.heytap.health.watchface.provider.key;

import com.heytap.health.devicemanager.client.call.DMCallException;
import com.oplus.aiunit.vision.bt2;
import com.oplus.aiunit.vision.ltl;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.watchface.provider.key.ECDHUtils$negotiate$1$onError$1", f = "ECDHUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ECDHUtils$negotiate$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ bt2 $callback;
    final /* synthetic */ DMCallException $throwable;
    final /* synthetic */ String $uuid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECDHUtils$negotiate$1$onError$1(DMCallException dMCallException, bt2 bt2Var, String str, Continuation<? super ECDHUtils$negotiate$1$onError$1> continuation) {
        super(2, continuation);
        this.$throwable = dMCallException;
        this.$callback = bt2Var;
        this.$uuid = str;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ECDHUtils$negotiate$1$onError$1(this.$throwable, this.$callback, this.$uuid, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ltl.b(ECDHUtils.TAG, "[negotiate] --> onError, " + this.$throwable.getMessage());
        this.$callback.onResult(this.$uuid, null);
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ECDHUtils$negotiate$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
