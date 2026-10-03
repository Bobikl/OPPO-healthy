package com.heytap.health.bodyfat.ui.frg;

import java.time.LocalDate;
import java.util.Set;
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

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$1", f = "BodyfatDayFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BodyfatDayFragment$DayContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<LocalDate> $animatedProgressDates;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyfatDayFragment$DayContent$1(Set<LocalDate> set, Continuation<? super BodyfatDayFragment$DayContent$1> continuation) {
        super(2, continuation);
        this.$animatedProgressDates = set;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BodyfatDayFragment$DayContent$1(this.$animatedProgressDates, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$animatedProgressDates.clear();
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BodyfatDayFragment$DayContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
