package com.heytap.sporthealth.blib.helper;

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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.sporthealth.blib.helper.PrefDsl$onMarkClickSuspend$1$1", f = "PreferenceDSL.kt", i = {}, l = {1088}, m = "invokeSuspend", n = {}, s = {})
public final class PrefDsl$onMarkClickSuspend$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Continuation<? super Unit>, Object> $action;
    final /* synthetic */ Object $newValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrefDsl$onMarkClickSuspend$1$1(Function2<? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function2, Object obj, Continuation<? super PrefDsl$onMarkClickSuspend$1$1> continuation) {
        super(2, continuation);
        this.$action = function2;
        this.$newValue = obj;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PrefDsl$onMarkClickSuspend$1$1(this.$action, this.$newValue, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<Boolean, Continuation<? super Unit>, Object> function2 = this.$action;
            Boolean boolBoxBoolean = Boxing.boxBoolean(Boolean.parseBoolean(this.$newValue.toString()));
            this.label = 1;
            if (function2.invoke(boolBoxBoolean, this) == coroutine_suspended) {
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

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PrefDsl$onMarkClickSuspend$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
