package com.heytap.health.insight.singledimen.hrv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.hrv.HrvService;
import com.heytap.health.health.insight.ModuleType;
import com.oplus.aiunit.vision.HrvDateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.g11;
import com.oplus.aiunit.vision.gg9;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.o61;
import com.oplus.aiunit.vision.x0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/insight/singledimen/hrv/HrvModuleLogic;", "Lcom/oplus/aiunit/vision/o61;", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/g11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/util/List;", "visibleList", "Lcom/heytap/health/health/hrv/HrvService;", "Lkotlin/Lazy;", "d", "()Lcom/heytap/health/health/hrv/HrvService;", "hrvService", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHrvModuleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrvModuleLogic.kt\ncom/heytap/health/insight/singledimen/hrv/HrvModuleLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1855#2,2:128\n*S KotlinDebug\n*F\n+ 1 HrvModuleLogic.kt\ncom/heytap/health/insight/singledimen/hrv/HrvModuleLogic\n*L\n65#1:128,2\n*E\n"})
public final class HrvModuleLogic implements o61 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<g11> visibleList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy hrvService = LazyKt__LazyJVMKt.lazy(new Function0<HrvService>() { // from class: com.heytap.health.insight.singledimen.hrv.HrvModuleLogic$hrvService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final HrvService invoke() {
            return (HrvService) x0.d().h(HrvService.class);
        }
    });
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.o61
    @NotNull
    public ModuleType a() {
        return ModuleType.HRV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.o61
    @Nullable
    public Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends g11>> continuation) {
        HrvModuleLogic$countContentLogic$1 hrvModuleLogic$countContentLogic$1;
        Ref.ObjectRef objectRef;
        Iterator it;
        RelativeDateRange relativeDateRange;
        Ref.ObjectRef objectRef2;
        RelativeDateRange relativeDateRange2;
        HrvModuleLogic hrvModuleLogic = this;
        if (continuation instanceof HrvModuleLogic$countContentLogic$1) {
            hrvModuleLogic$countContentLogic$1 = (HrvModuleLogic$countContentLogic$1) continuation;
            int i = hrvModuleLogic$countContentLogic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrvModuleLogic$countContentLogic$1.label = i - Integer.MIN_VALUE;
            } else {
                hrvModuleLogic$countContentLogic$1 = new HrvModuleLogic$countContentLogic$1(hrvModuleLogic, continuation);
            }
        } else {
            hrvModuleLogic$countContentLogic$1 = new HrvModuleLogic$countContentLogic$1(hrvModuleLogic, continuation);
        }
        Object obj = hrvModuleLogic$countContentLogic$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = hrvModuleLogic$countContentLogic$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            a7b.f("HrvModuleLogic", "Hrv countContentLogic begin, queryDate=" + localDate);
            LocalDate anchorDate = localDate.minusDays(1L);
            Intrinsics.checkNotNullExpressionValue(anchorDate, "anchorDate");
            RelativeDateRange relativeDateRangeT = o05.t(anchorDate);
            RelativeDateRange relativeDateRangeJ = o05.J(anchorDate);
            ArrayList arrayList = new ArrayList();
            objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            arrayList.add(BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HrvModuleLogic$countContentLogic$monthJob$1(objectRef, hrvModuleLogic, relativeDateRangeT, null), 3, null));
            arrayList.add(BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HrvModuleLogic$countContentLogic$weekJob$1(objectRef3, hrvModuleLogic, relativeDateRangeJ, null), 3, null));
            it = arrayList.iterator();
            relativeDateRange = relativeDateRangeJ;
            objectRef2 = objectRef3;
            relativeDateRange2 = relativeDateRangeT;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) hrvModuleLogic$countContentLogic$1.L$5;
            objectRef2 = (Ref.ObjectRef) hrvModuleLogic$countContentLogic$1.L$4;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) hrvModuleLogic$countContentLogic$1.L$3;
            RelativeDateRange relativeDateRange3 = (RelativeDateRange) hrvModuleLogic$countContentLogic$1.L$2;
            relativeDateRange2 = (RelativeDateRange) hrvModuleLogic$countContentLogic$1.L$1;
            HrvModuleLogic hrvModuleLogic2 = (HrvModuleLogic) hrvModuleLogic$countContentLogic$1.L$0;
            ResultKt.throwOnFailure(obj);
            relativeDateRange = relativeDateRange3;
            objectRef = objectRef4;
            it = it2;
            hrvModuleLogic = hrvModuleLogic2;
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            hrvModuleLogic$countContentLogic$1.L$0 = hrvModuleLogic;
            hrvModuleLogic$countContentLogic$1.L$1 = relativeDateRange2;
            hrvModuleLogic$countContentLogic$1.L$2 = relativeDateRange;
            hrvModuleLogic$countContentLogic$1.L$3 = objectRef;
            hrvModuleLogic$countContentLogic$1.L$4 = objectRef2;
            hrvModuleLogic$countContentLogic$1.L$5 = it;
            hrvModuleLogic$countContentLogic$1.label = 1;
            if (job.join(hrvModuleLogic$countContentLogic$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        gg9 gg9Var = new gg9();
        if (gg9Var.x(relativeDateRange2, relativeDateRange, (HrvDateRangeStat) objectRef.element, (HrvDateRangeStat) objectRef2.element) != null) {
            hrvModuleLogic.visibleList.add(gg9Var);
        }
        return hrvModuleLogic.visibleList;
    }

    public final HrvService d() {
        Object value = this.hrvService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-hrvService>(...)");
        return (HrvService) value;
    }
}
