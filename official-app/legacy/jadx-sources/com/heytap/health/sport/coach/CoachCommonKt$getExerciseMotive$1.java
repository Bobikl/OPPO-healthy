package com.heytap.health.sport.coach;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sport.coach.CoachCommonKt", f = "CoachCommon.kt", i = {0}, l = {170}, m = "getExerciseMotive", n = {"$this$getExerciseMotive_u24lambda_u244"}, s = {"L$0"})
public final class CoachCommonKt$getExerciseMotive$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public CoachCommonKt$getExerciseMotive$1(Continuation<? super CoachCommonKt$getExerciseMotive$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CoachCommonKt.e(this);
    }
}
