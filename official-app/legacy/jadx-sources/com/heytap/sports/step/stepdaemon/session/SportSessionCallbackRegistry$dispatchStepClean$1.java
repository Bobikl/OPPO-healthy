package com.heytap.sports.step.stepdaemon.session;

import android.os.RemoteException;
import com.heytap.sports.step.daemon.ISportSessionCallback;
import com.oplus.aiunit.vision.a7b;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.sports.step.stepdaemon.session.SportSessionCallbackRegistry$dispatchStepClean$1", f = "SportSessionCallbackRegistry.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportSessionCallbackRegistry$dispatchStepClean$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ISportSessionCallback $cb;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportSessionCallbackRegistry$dispatchStepClean$1(ISportSessionCallback iSportSessionCallback, Continuation<? super SportSessionCallbackRegistry$dispatchStepClean$1> continuation) {
        super(2, continuation);
        this.$cb = iSportSessionCallback;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SportSessionCallbackRegistry$dispatchStepClean$1(this.$cb, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            this.$cb.onStepClean();
        } catch (RemoteException e2) {
            a7b.b("SportSessionCbRegistry", "dispatchStepClean RemoteException: " + e2.getMessage());
        } catch (Throwable th) {
            a7b.b("SportSessionCbRegistry", "dispatchStepClean threw: " + th.getClass().getSimpleName() + ": " + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SportSessionCallbackRegistry$dispatchStepClean$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
