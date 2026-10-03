package com.heytap.health.insight.singledimen.snore;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.health.sleep.service.homecard.SleepCardService;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.g11;
import com.oplus.aiunit.vision.iph;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.o61;
import com.oplus.aiunit.vision.t5h;
import com.oplus.aiunit.vision.x0;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/singledimen/snore/SnoreModuleLogic;", "Lcom/oplus/aiunit/vision/o61;", "Lcom/heytap/health/health/insight/ModuleType;", "a", "Ljava/time/LocalDate;", "queryDate", "", "Lcom/oplus/aiunit/vision/g11;", "b", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/sleep/service/homecard/SleepCardService;", "Lkotlin/Lazy;", "c", "()Lcom/heytap/health/sleep/service/homecard/SleepCardService;", "snoreService", "", "d", "()Ljava/util/List;", "visibleContentLogics", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnoreModuleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnoreModuleLogic.kt\ncom/heytap/health/insight/singledimen/snore/SnoreModuleLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1549#2:75\n1620#2,3:76\n1002#2,2:79\n*S KotlinDebug\n*F\n+ 1 SnoreModuleLogic.kt\ncom/heytap/health/insight/singledimen/snore/SnoreModuleLogic\n*L\n62#1:75\n62#1:76,3\n72#1:79,2\n*E\n"})
public final class SnoreModuleLogic implements o61 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy snoreService = LazyKt__LazyJVMKt.lazy(new Function0<SleepCardService>() { // from class: com.heytap.health.insight.singledimen.snore.SnoreModuleLogic$snoreService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final SleepCardService invoke() {
            return (SleepCardService) x0.d().h(SleepCardService.class);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy visibleContentLogics = LazyKt__LazyJVMKt.lazy(new Function0<List<g11>>() { // from class: com.heytap.health.insight.singledimen.snore.SnoreModuleLogic$visibleContentLogics$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<g11> invoke() {
            return new ArrayList();
        }
    });
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.o61
    @NotNull
    public ModuleType a() {
        return ModuleType.SNORE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.o61
    @Nullable
    public Object b(@NotNull LocalDate localDate, @NotNull Continuation<? super List<? extends g11>> continuation) {
        SnoreModuleLogic$countContentLogic$1 snoreModuleLogic$countContentLogic$1;
        long jCurrentTimeMillis;
        if (continuation instanceof SnoreModuleLogic$countContentLogic$1) {
            snoreModuleLogic$countContentLogic$1 = (SnoreModuleLogic$countContentLogic$1) continuation;
            int i = snoreModuleLogic$countContentLogic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                snoreModuleLogic$countContentLogic$1.label = i - Integer.MIN_VALUE;
            } else {
                snoreModuleLogic$countContentLogic$1 = new SnoreModuleLogic$countContentLogic$1(this, continuation);
            }
        } else {
            snoreModuleLogic$countContentLogic$1 = new SnoreModuleLogic$countContentLogic$1(this, continuation);
        }
        SnoreModuleLogic$countContentLogic$1 snoreModuleLogic$countContentLogic$2 = snoreModuleLogic$countContentLogic$1;
        Object objX8 = snoreModuleLogic$countContentLogic$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = snoreModuleLogic$countContentLogic$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objX8);
            jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f("SnoreModuleLogic", "snore countContentLogic begin, queryDate=" + localDate);
            RelativeDateRange relativeDateRangeJ = o05.J(localDate);
            Context context = b78.a();
            SleepCardService sleepCardServiceC = c();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            long jH = o05.H(relativeDateRangeJ.h());
            long jH2 = o05.H(relativeDateRangeJ.g());
            snoreModuleLogic$countContentLogic$2.L$0 = this;
            snoreModuleLogic$countContentLogic$2.J$0 = jCurrentTimeMillis;
            snoreModuleLogic$countContentLogic$2.label = 1;
            objX8 = sleepCardServiceC.x8(context, jH, jH2, snoreModuleLogic$countContentLogic$2);
            if (objX8 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = snoreModuleLogic$countContentLogic$2.J$0;
            SnoreModuleLogic snoreModuleLogic = (SnoreModuleLogic) snoreModuleLogic$countContentLogic$2.L$0;
            ResultKt.throwOnFailure(objX8);
            jCurrentTimeMillis = j2;
            this = snoreModuleLogic;
        }
        List list = (List) objX8;
        this.d().clear();
        a7b.f("SnoreModuleLogic", "countContentLogic weekResult:" + list);
        List<g11> listD = this.d();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new iph((t5h) it.next()));
        }
        listD.addAll(arrayList);
        int size = this.d().size();
        StringBuilder sb = new StringBuilder();
        sb.append("countContentLogic visibleContentLogics size is ");
        sb.append(size);
        a7b.f("SnoreModuleLogic", "Snore countContentLogic end, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return this.d();
    }

    public final SleepCardService c() {
        Object value = this.snoreService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-snoreService>(...)");
        return (SleepCardService) value;
    }

    public final List<g11> d() {
        return (List) this.visibleContentLogics.getValue();
    }
}
