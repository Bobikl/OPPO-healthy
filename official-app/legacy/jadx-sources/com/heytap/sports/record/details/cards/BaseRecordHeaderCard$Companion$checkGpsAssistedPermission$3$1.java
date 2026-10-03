package com.heytap.sports.record.details.cards;

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
import p010kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.sports.record.details.cards.BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$3$1", f = "BaseRecordHeaderCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ KFunction<Boolean> $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$3$1(KFunction<Boolean> kFunction, Continuation<? super BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$3$1> continuation) {
        super(2, continuation);
        this.$this_run = kFunction;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$3$1(this.$this_run, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean((((Boolean) ((Function2) this.$this_run).invoke(Boxing.boxInt(13), "android.permission.ACCESS_FINE_LOCATION")).booleanValue() || ((Boolean) ((Function2) this.$this_run).invoke(Boxing.boxInt(13), "android.permission.ACCESS_FINE_LOCATION")).booleanValue()) && ((Boolean) ((Function2) this.$this_run).invoke(Boxing.boxInt(13), "android.permission.ACCESS_BACKGROUND_LOCATION")).booleanValue());
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
