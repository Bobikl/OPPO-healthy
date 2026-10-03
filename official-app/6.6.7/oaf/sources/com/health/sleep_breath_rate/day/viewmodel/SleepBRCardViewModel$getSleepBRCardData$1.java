package com.health.sleep_breath_rate.day.viewmodel;

import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.BreathRate;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.oplus.aiunit.vision.afd;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.be1;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.xch;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.sleep_breath_rate.day.viewmodel.SleepBRCardViewModel$getSleepBRCardData$1", f = "SleepBRCardViewModel.kt", i = {}, l = {48, 48}, m = "invokeSuspend", n = {}, s = {})
public final class SleepBRCardViewModel$getSleepBRCardData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $endTime;
    final /* synthetic */ long $startTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SleepBRCardViewModel this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/heytap/databaseengine/model/BreathRate;", "breathRateList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "Lcom/oplus/aiunit/vision/xch;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/oplus/aiunit/vision/xch;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T1, T2, R> implements be1 {
        public final /* synthetic */ SleepBRCardViewModel i;
        public final /* synthetic */ long j;
        public final /* synthetic */ long k;
        public final /* synthetic */ long l;
        public final /* synthetic */ BreathRateStat m;

        public a(SleepBRCardViewModel sleepBRCardViewModel, long j, long j2, long j3, BreathRateStat breathRateStat) {
            this.i = sleepBRCardViewModel;
            this.j = j;
            this.k = j2;
            this.l = j3;
            this.m = breathRateStat;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xch apply(@NotNull List<BreathRate> list, @NotNull List<SleepIndex> list2) {
            Intrinsics.checkNotNullParameter(list, "breathRateList");
            Intrinsics.checkNotNullParameter(list2, "sleepIndexList");
            return this.i.B().a(this.j, this.k, this.l, list, this.m, list2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/xch;", "it", "", "a", "(Lcom/oplus/aiunit/vision/xch;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements b24 {
        public final /* synthetic */ SleepBRCardViewModel i;

        public b(SleepBRCardViewModel sleepBRCardViewModel) {
            this.i = sleepBRCardViewModel;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull xch xchVar) {
            Intrinsics.checkNotNullParameter(xchVar, "it");
            this.i.z().postValue(xchVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepBRCardViewModel$getSleepBRCardData$1(SleepBRCardViewModel sleepBRCardViewModel, long j, long j2, Continuation<? super SleepBRCardViewModel$getSleepBRCardData$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepBRCardViewModel;
        this.$startTime = j;
        this.$endTime = j2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SleepBRCardViewModel$getSleepBRCardData$1 sleepBRCardViewModel$getSleepBRCardData$1 = new SleepBRCardViewModel$getSleepBRCardData$1(this.this$0, this.$startTime, this.$endTime, continuation);
        sleepBRCardViewModel$getSleepBRCardData$1.L$0 = obj;
        return sleepBRCardViewModel$getSleepBRCardData$1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNullExpressionValue(obj, "@SuppressLint(\"CheckResu…        }\n        }\n    }");
            list = (List) obj;
            if (!list.isEmpty()) {
                BreathRateStat breathRateStat = (BreathRateStat) list.get(0);
                pr8 pr8Var = pr8.INSTANCE;
                long jG = pr8Var.g(breathRateStat.getDate());
                long jB = pr8Var.b(jG);
                long jO = pr8Var.o(jG);
                long jN = pr8Var.n(jG);
                ddd.j1(this.this$0.j.a(jO, jN), this.this$0.j.c(jG, jB), new a(this.this$0, jG, jO, jN, breathRateStat)).a(new b(this.this$0));
            } else {
                this.this$0.z().postValue(this.this$0.y());
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Deferred deferredAsync$default = BuildersKt.async$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new SleepBRCardViewModel$getSleepBRCardData$1$sleepBRStatList$1(this.this$0, this.$startTime, this.$endTime, null), 3, (Object) null);
        this.label = 1;
        obj = deferredAsync$default.await(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.label = 2;
        obj = RxExtendKt.c((afd) obj, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "@SuppressLint(\"CheckResu…        }\n        }\n    }");
        list = (List) obj;
        if (!list.isEmpty()) {
            BreathRateStat breathRateStat2 = (BreathRateStat) list.get(0);
            pr8 pr8Var2 = pr8.INSTANCE;
            long jG2 = pr8Var2.g(breathRateStat2.getDate());
            long jB2 = pr8Var2.b(jG2);
            long jO2 = pr8Var2.o(jG2);
            long jN2 = pr8Var2.n(jG2);
            ddd.j1(this.this$0.j.a(jO2, jN2), this.this$0.j.c(jG2, jB2), new a(this.this$0, jG2, jO2, jN2, breathRateStat2)).a(new b(this.this$0));
        } else {
            this.this$0.z().postValue(this.this$0.y());
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
