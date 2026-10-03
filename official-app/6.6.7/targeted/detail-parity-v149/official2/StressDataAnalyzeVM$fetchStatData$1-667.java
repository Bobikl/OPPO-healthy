package com.heytap.health.hrv.viewmodel;

import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayStat;
import com.oplus.aiunit.vision.gf8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.o15;
import java.time.LocalDate;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
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
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.hrv.viewmodel.StressDataAnalyzeVM$fetchStatData$1", f = "StressDataAnalyzeVM.kt", i = {0, 1}, l = {193, 194}, m = "invokeSuspend", n = {"sleepStatDeferred", "stressStats"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nStressDataAnalyzeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDataAnalyzeVM.kt\ncom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM$fetchStatData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,409:1\n1855#2,2:410\n*S KotlinDebug\n*F\n+ 1 StressDataAnalyzeVM.kt\ncom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM$fetchStatData$1\n*L\n216#1:410,2\n*E\n"})
public final class StressDataAnalyzeVM$fetchStatData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $endTime;
    final /* synthetic */ long $yesterdayStartTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StressDataAnalyzeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressDataAnalyzeVM$fetchStatData$1(long j2, StressDataAnalyzeVM stressDataAnalyzeVM, long j3, Continuation<? super StressDataAnalyzeVM$fetchStatData$1> continuation) {
        super(2, continuation);
        this.$endTime = j2;
        this.this$0 = stressDataAnalyzeVM;
        this.$yesterdayStartTime = j3;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StressDataAnalyzeVM$fetchStatData$1 stressDataAnalyzeVM$fetchStatData$1 = new StressDataAnalyzeVM$fetchStatData$1(this.$endTime, this.this$0, this.$yesterdayStartTime, continuation);
        stressDataAnalyzeVM$fetchStatData$1.L$0 = obj;
        return stressDataAnalyzeVM$fetchStatData$1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat] */
    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Deferred deferredAsync$default;
        Object objAwait;
        Object objAwait2;
        List<??> list;
        StressDataAnalyzeVM stressDataAnalyzeVM;
        SleepDayStat sleepDayStat;
        LocalDate localDateF;
        Ref.ObjectRef objectRef;
        T t;
        PhysicalMentalStat physicalMentalStat;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                deferredAsync$default = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait2 = obj;
            }
            List list2 = (List) objAwait2;
            stressDataAnalyzeVM = this.this$0;
            if (list.size() == 2) {
                physicalMentalStat = (PhysicalMentalStat) list.get(0);
                PhysicalMentalStat physicalMentalStat2 = (PhysicalMentalStat) list.get(1);
                if (physicalMentalStat.getAvgStress() != 0 || physicalMentalStat2.getAvgStress() == 0) {
                    stressDataAnalyzeVM._increasePercent.postValue(Boxing.boxInt(Integer.MAX_VALUE));
                } else {
                    stressDataAnalyzeVM._increasePercent.postValue(Boxing.boxInt(((physicalMentalStat2.getAvgStress() - physicalMentalStat.getAvgStress()) * 100) / physicalMentalStat.getAvgStress()));
                }
                stressDataAnalyzeVM.R(physicalMentalStat2.getAvgStress());
                stressDataAnalyzeVM._todayStat.postValue(physicalMentalStat2);
            }
            sleepDayStat = list2.isEmpty() ? null : (SleepDayStat) list2.get(0);
            localDateF = gf8.INSTANCE.f(this.$endTime);
            objectRef = new Ref.ObjectRef();
            for (?? r5 : list) {
                if (o15.a(r5.getDate()) == h15.H(localDateF)) {
                    objectRef.element = r5;
                }
            }
            t = objectRef.element;
            if (t != 0) {
                StressDataAnalyzeVM stressDataAnalyzeVM2 = this.this$0;
                long j2 = this.$endTime;
                Intrinsics.checkNotNull(t);
                stressDataAnalyzeVM2.F(j2, (PhysicalMentalStat) t, sleepDayStat);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new StressDataAnalyzeVM$fetchStatData$1$stressStatDeferred$1(this.this$0, this.$yesterdayStartTime, this.$endTime, null), 3, null);
        deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new StressDataAnalyzeVM$fetchStatData$1$sleepStatDeferred$1(this.this$0, System.currentTimeMillis(), null), 3, null);
        this.L$0 = deferredAsync$default;
        this.label = 1;
        objAwait = deferredAsync$default2.await(this);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        List list3 = (List) objAwait;
        this.L$0 = list3;
        this.label = 2;
        objAwait2 = deferredAsync$default.await(this);
        if (objAwait2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list3;
        List list4 = (List) objAwait2;
        stressDataAnalyzeVM = this.this$0;
        if (list.size() == 2) {
            physicalMentalStat = (PhysicalMentalStat) list.get(0);
            PhysicalMentalStat physicalMentalStat3 = (PhysicalMentalStat) list.get(1);
            if (physicalMentalStat.getAvgStress() != 0) {
                stressDataAnalyzeVM._increasePercent.postValue(Boxing.boxInt(Integer.MAX_VALUE));
            } else {
                stressDataAnalyzeVM._increasePercent.postValue(Boxing.boxInt(Integer.MAX_VALUE));
            }
            stressDataAnalyzeVM.R(physicalMentalStat3.getAvgStress());
            stressDataAnalyzeVM._todayStat.postValue(physicalMentalStat3);
        }
        if (list4.isEmpty()) {
        }
        localDateF = gf8.INSTANCE.f(this.$endTime);
        objectRef = new Ref.ObjectRef();
        while (r1.hasNext()) {
            if (o15.a(r5.getDate()) == h15.H(localDateF)) {
                objectRef.element = r5;
            }
        }
        t = objectRef.element;
        if (t != 0) {
            StressDataAnalyzeVM stressDataAnalyzeVM3 = this.this$0;
            long j3 = this.$endTime;
            Intrinsics.checkNotNull(t);
            stressDataAnalyzeVM3.F(j3, (PhysicalMentalStat) t, sleepDayStat);
        }
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StressDataAnalyzeVM$fetchStatData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}