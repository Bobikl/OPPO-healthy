package com.heytap.health.settings.watch.sporthealthsettings.utils;

import com.oplus.aiunit.vision.xm3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings.utils.SnoreActiveStateUtils$receiveDeviceReport$1$1$1", f = "SnoreActiveStateUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SnoreActiveStateUtils$receiveDeviceReport$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ xm3<Boolean> $callback;
    final /* synthetic */ Ref.BooleanRef $cloudResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnoreActiveStateUtils$receiveDeviceReport$1$1$1(xm3<Boolean> xm3Var, Ref.BooleanRef booleanRef, Continuation<? super SnoreActiveStateUtils$receiveDeviceReport$1$1$1> continuation) {
        super(2, continuation);
        this.$callback = xm3Var;
        this.$cloudResult = booleanRef;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SnoreActiveStateUtils$receiveDeviceReport$1$1$1(this.$callback, this.$cloudResult, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$callback.onResult(Boxing.boxBoolean(this.$cloudResult.element));
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SnoreActiveStateUtils$receiveDeviceReport$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
