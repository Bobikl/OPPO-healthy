package com.heytap.health.sport.coach;

import com.oplus.aiunit.vision.ixb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.sport.coach.CoachCommonKt", f = "CoachCommon.kt", i = {}, l = {ixb.DIVE_ALARM}, m = "getAmountOfExerciseRecommendInSportMotive", n = {}, s = {})
public final class CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;

    public CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3(Continuation<? super CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CoachCommonKt.c(0, this);
    }
}
