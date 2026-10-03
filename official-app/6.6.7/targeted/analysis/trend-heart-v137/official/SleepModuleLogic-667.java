package com.heytap.health.insight.singledimen.sleep;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.health.sleep.service.homecard.SleepCardService;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.d71;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.l9h;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.u11;
import com.oplus.aiunit.vision.zsh;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/singledimen/sleep/SleepModuleLogic;", "Lcom/oplus/aiunit/vision/d71;", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/u11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/sleep/service/homecard/SleepCardService;", "Lkotlin/Lazy;", "c", "()Lcom/heytap/health/sleep/service/homecard/SleepCardService;", "sleepService", "", "d", "()Ljava/util/List;", "visibleContentLogics", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepModuleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepModuleLogic.kt\ncom/heytap/health/insight/singledimen/sleep/SleepModuleLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1549#2:75\n1620#2,3:76\n1002#2,2:79\n*S KotlinDebug\n*F\n+ 1 SleepModuleLogic.kt\ncom/heytap/health/insight/singledimen/sleep/SleepModuleLogic\n*L\n62#1:75\n62#1:76,3\n72#1:79,2\n*E\n"})
public final class SleepModuleLogic implements d71 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepService = LazyKt__LazyJVMKt.lazy(new Function0<SleepCardService>() { // from class: com.heytap.health.insight.singledimen.sleep.SleepModuleLogic$sleepService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final SleepCardService invoke() {
            return (SleepCardService) e1.d().h(SleepCardService.class);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy visibleContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<u11>>() { // from class: com.heytap.health.insight.singledimen.sleep.SleepModuleLogic$visibleContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<u11> invoke() {
            return new ArrayList();
        }
    });
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.d71
    @NotNull
    public ModuleType a() {
        return ModuleType.SLEEP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.d71
    @Nullable
    public Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends u11>> continuation) {
        SleepModuleLogic$countContentLogic$1 sleepModuleLogic$countContentLogic$1;
        long jCurrentTimeMillis;
        if (continuation instanceof SleepModuleLogic$countContentLogic$1) {
            sleepModuleLogic$countContentLogic$1 = (SleepModuleLogic$countContentLogic$1) continuation;
            int i = sleepModuleLogic$countContentLogic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepModuleLogic$countContentLogic$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepModuleLogic$countContentLogic$1 = new SleepModuleLogic$countContentLogic$1(this, continuation);
            }
        } else {
            sleepModuleLogic$countContentLogic$1 = new SleepModuleLogic$countContentLogic$1(this, continuation);
        }
        SleepModuleLogic$countContentLogic$1 sleepModuleLogic$countContentLogic$2 = sleepModuleLogic$countContentLogic$1;
        Object objK4 = sleepModuleLogic$countContentLogic$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepModuleLogic$countContentLogic$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK4);
            jCurrentTimeMillis = System.currentTimeMillis();
            m8b.f("InsightSleepModuleLogic", "sleep countContentLogic start, queryDate=" + localDate);
            RelativeDateRange relativeDateRangeJ = h15.J(localDate);
            Context context = e88.a();
            StringBuilder sb = new StringBuilder();
            sb.append("sleep countContentLogic | context is ");
            sb.append(context);
            SleepCardService sleepCardServiceC = c();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            long jH = h15.H(relativeDateRangeJ.h());
            long jH2 = h15.H(relativeDateRangeJ.g());
            sleepModuleLogic$countContentLogic$2.L$0 = this;
            sleepModuleLogic$countContentLogic$2.J$0 = jCurrentTimeMillis;
            sleepModuleLogic$countContentLogic$2.label = 1;
            objK4 = sleepCardServiceC.K4(context, jH, jH2, sleepModuleLogic$countContentLogic$2);
            if (objK4 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = sleepModuleLogic$countContentLogic$2.J$0;
            SleepModuleLogic sleepModuleLogic = (SleepModuleLogic) sleepModuleLogic$countContentLogic$2.L$0;
            ResultKt.throwOnFailure(objK4);
            jCurrentTimeMillis = j2;
            this = sleepModuleLogic;
        }
        List list = (List) objK4;
        m8b.f("InsightSleepModuleLogic", "sleep countContentLogic weekResult:" + list);
        this.d().clear();
        List<u11> listD = this.d();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new zsh((l9h) it.next()));
        }
        listD.addAll(arrayList);
        int size = this.d().size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("countContentLogic visibleContentLogics size is ");
        sb2.append(size);
        m8b.f("InsightSleepModuleLogic", "sleep countContentLogic end, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return this.d();
    }

    public final SleepCardService c() {
        Object value = this.sleepService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-sleepService>(...)");
        return (SleepCardService) value;
    }

    public final List<u11> d() {
        return (List) this.visibleContentLogics.getValue();
    }
}