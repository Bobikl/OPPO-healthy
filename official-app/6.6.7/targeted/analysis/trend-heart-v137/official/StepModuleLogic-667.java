package com.heytap.health.insight.singledimen.step;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.health.sport.services.StepDetailService;
import com.oplus.aiunit.vision.DateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.d71;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.u11;
import com.oplus.aiunit.vision.zr8;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/insight/singledimen/step/StepModuleLogic;", "Lcom/oplus/aiunit/vision/d71;", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/u11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/insight/singledimen/step/c;", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "valuableContentLogics", "", "f", "visibleContentLogics", "Lcom/heytap/health/sport/services/StepDetailService;", "c", "d", "()Lcom/heytap/health/sport/services/StepDetailService;", "stepDetailService", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepModuleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepModuleLogic.kt\ncom/heytap/health/insight/singledimen/step/StepModuleLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1855#2,2:100\n1855#2:102\n1856#2:104\n1002#2,2:105\n1#3:103\n*S KotlinDebug\n*F\n+ 1 StepModuleLogic.kt\ncom/heytap/health/insight/singledimen/step/StepModuleLogic\n*L\n78#1:100,2\n83#1:102\n83#1:104\n96#1:105,2\n*E\n"})
public final class StepModuleLogic implements d71 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy valuableContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<? extends c>>() { // from class: com.heytap.health.insight.singledimen.step.StepModuleLogic$valuableContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends c> invoke() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new c[]{new TrendContentLogic(), new b(), new a()});
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy visibleContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<u11>>() { // from class: com.heytap.health.insight.singledimen.step.StepModuleLogic$visibleContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<u11> invoke() {
            return new ArrayList();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy stepDetailService = LazyKt__LazyJVMKt.lazy(new Function0<StepDetailService>() { // from class: com.heytap.health.insight.singledimen.step.StepModuleLogic$stepDetailService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final StepDetailService invoke() {
            return (StepDetailService) e1.d().h(StepDetailService.class);
        }
    });
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.d71
    @NotNull
    public ModuleType a() {
        return ModuleType.STEP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.d71
    @Nullable
    public Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends u11>> continuation) {
        StepModuleLogic$countContentLogic$1 stepModuleLogic$countContentLogic$1;
        long jCurrentTimeMillis;
        RelativeDateRange relativeDateRangeT;
        RelativeDateRange relativeDateRangeJ;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Iterator it;
        StepModuleLogic stepModuleLogic = this;
        if (continuation instanceof StepModuleLogic$countContentLogic$1) {
            stepModuleLogic$countContentLogic$1 = (StepModuleLogic$countContentLogic$1) continuation;
            int i = stepModuleLogic$countContentLogic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepModuleLogic$countContentLogic$1.label = i - Integer.MIN_VALUE;
            } else {
                stepModuleLogic$countContentLogic$1 = new StepModuleLogic$countContentLogic$1(stepModuleLogic, continuation);
            }
        } else {
            stepModuleLogic$countContentLogic$1 = new StepModuleLogic$countContentLogic$1(stepModuleLogic, continuation);
        }
        Object obj = stepModuleLogic$countContentLogic$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepModuleLogic$countContentLogic$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            m8b.f("InsightStepModuleLogic", "Step countContentLogic begin, queryDate=" + localDate);
            jCurrentTimeMillis = System.currentTimeMillis();
            LocalDate anchorDate = localDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(anchorDate, "anchorDate");
            relativeDateRangeT = h15.t(anchorDate);
            relativeDateRangeJ = h15.J(anchorDate);
            ArrayList arrayList = new ArrayList();
            objectRef = new Ref.ObjectRef();
            objectRef2 = new Ref.ObjectRef();
            zr8 zr8Var = zr8.INSTANCE;
            arrayList.add(BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(zr8Var.e()), null, null, new StepModuleLogic$countContentLogic$monthJob$1(objectRef, stepModuleLogic, relativeDateRangeT, null), 3, null));
            arrayList.add(BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(zr8Var.e()), null, null, new StepModuleLogic$countContentLogic$weekJob$1(objectRef2, stepModuleLogic, relativeDateRangeJ, null), 3, null));
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = stepModuleLogic$countContentLogic$1.J$0;
            it = (Iterator) stepModuleLogic$countContentLogic$1.L$5;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) stepModuleLogic$countContentLogic$1.L$4;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) stepModuleLogic$countContentLogic$1.L$3;
            RelativeDateRange relativeDateRange = (RelativeDateRange) stepModuleLogic$countContentLogic$1.L$2;
            RelativeDateRange relativeDateRange2 = (RelativeDateRange) stepModuleLogic$countContentLogic$1.L$1;
            StepModuleLogic stepModuleLogic2 = (StepModuleLogic) stepModuleLogic$countContentLogic$1.L$0;
            ResultKt.throwOnFailure(obj);
            relativeDateRangeT = relativeDateRange2;
            objectRef2 = objectRef3;
            objectRef = objectRef4;
            jCurrentTimeMillis = j2;
            relativeDateRangeJ = relativeDateRange;
            stepModuleLogic = stepModuleLogic2;
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            stepModuleLogic$countContentLogic$1.L$0 = stepModuleLogic;
            stepModuleLogic$countContentLogic$1.L$1 = relativeDateRangeT;
            stepModuleLogic$countContentLogic$1.L$2 = relativeDateRangeJ;
            stepModuleLogic$countContentLogic$1.L$3 = objectRef;
            stepModuleLogic$countContentLogic$1.L$4 = objectRef2;
            stepModuleLogic$countContentLogic$1.L$5 = it;
            stepModuleLogic$countContentLogic$1.J$0 = jCurrentTimeMillis;
            stepModuleLogic$countContentLogic$1.label = 1;
            if (job.join(stepModuleLogic$countContentLogic$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        stepModuleLogic.f().clear();
        for (c cVar : stepModuleLogic.e()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (cVar.i(relativeDateRangeT, relativeDateRangeJ, (DateRangeStat) objectRef.element, (DateRangeStat) objectRef2.element) != null) {
                stepModuleLogic.f().add(cVar);
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            List<u11> listF = stepModuleLogic.f();
            StringBuilder sb = new StringBuilder();
            sb.append("StepModuleLogic ");
            sb.append(cVar);
            sb.append(" cost ");
            sb.append(jCurrentTimeMillis3);
            sb.append(", visibleLogics:");
            sb.append(listF);
        }
        m8b.f("InsightStepModuleLogic", "Step countContentLogic end, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return stepModuleLogic.f();
    }

    public final StepDetailService d() {
        Object value = this.stepDetailService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-stepDetailService>(...)");
        return (StepDetailService) value;
    }

    public final List<c> e() {
        return (List) this.valuableContentLogics.getValue();
    }

    public final List<u11> f() {
        return (List) this.visibleContentLogics.getValue();
    }
}