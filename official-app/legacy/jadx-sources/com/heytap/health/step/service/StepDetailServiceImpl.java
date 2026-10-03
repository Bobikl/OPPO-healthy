package com.heytap.health.step.service;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.widget.charts.customChart.WeekHorizonChart;
import com.heytap.health.core.widget.charts.customChart.WeekTrentChart;
import com.heytap.health.sport.services.StepDetailService;
import com.heytap.health.step.R$string;
import com.heytap.health.step.detail.ui.stephistory2.datamanager.RangeDateDataHandler;
import com.heytap.health.step.detail.ui.stephistory2.datamanager.StepDetailSuspendRepo;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.BaseItemView;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.StepItemDataHandler;
import com.oplus.aiunit.vision.DateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.StepStat;
import com.oplus.aiunit.vision.gqi;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.wq8;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/step/StepDetailService")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/step/service/StepDetailServiceImpl;", "Lcom/heytap/health/sport/services/StepDetailService;", "Landroid/content/Context;", "context", "", "init", "Lcom/oplus/aiunit/vision/dlf;", "dateRange", "Lcom/oplus/aiunit/vision/p05;", "G7", "(Lcom/oplus/aiunit/vision/dlf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "relativeDatePair", "dateRangeStat", "", "isGoalView", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", "ta", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/dlf;Lcom/oplus/aiunit/vision/p05;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "stepDiff", "", "cardType", "Landroid/text/SpannableStringBuilder;", "G0", "", "D0", "Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;", "Q3", "<init>", "()V", "step_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepDetailServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDetailServiceImpl.kt\ncom/heytap/health/step/service/StepDetailServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 StepDetailServiceImpl.kt\ncom/heytap/health/step/service/StepDetailServiceImpl\n*L\n65#1:149,2\n*E\n"})
public final class StepDetailServiceImpl implements StepDetailService {
    @Override // com.heytap.health.sport.services.StepDetailService
    @NotNull
    public String D0(int cardType) {
        if (cardType != 0) {
            return cardType != 1 ? qtf.l(R$string.step_total_distance_title) : qtf.l(R$string.step_reach_goal_title);
        }
        return qtf.l(R$string.step_step_trent_title);
    }

    @Override // com.heytap.health.sport.services.StepDetailService
    @NotNull
    public SpannableStringBuilder G0(float stepDiff, int cardType) {
        return new StepItemDataHandler().f(stepDiff, cardType);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.sport.services.StepDetailService
    @Nullable
    public Object G7(@NotNull RelativeDateRange relativeDateRange, @NotNull Continuation<? super DateRangeStat> continuation) {
        StepDetailServiceImpl$fetchDateRangeStepStat$1 stepDetailServiceImpl$fetchDateRangeStepStat$1;
        StepDetailSuspendRepo stepDetailSuspendRepo;
        Ref.ObjectRef objectRef;
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate localDate3;
        LocalDate localDate4;
        Iterator it;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof StepDetailServiceImpl$fetchDateRangeStepStat$1) {
            stepDetailServiceImpl$fetchDateRangeStepStat$1 = (StepDetailServiceImpl$fetchDateRangeStepStat$1) continuation;
            int i = stepDetailServiceImpl$fetchDateRangeStepStat$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepDetailServiceImpl$fetchDateRangeStepStat$1.label = i - Integer.MIN_VALUE;
            } else {
                stepDetailServiceImpl$fetchDateRangeStepStat$1 = new StepDetailServiceImpl$fetchDateRangeStepStat$1(this, continuation);
            }
        } else {
            stepDetailServiceImpl$fetchDateRangeStepStat$1 = new StepDetailServiceImpl$fetchDateRangeStepStat$1(this, continuation);
        }
        Object obj = stepDetailServiceImpl$fetchDateRangeStepStat$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepDetailServiceImpl$fetchDateRangeStepStat$1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            LocalDate beforeStartDate = relativeDateRange.getBeforeStartDate();
            LocalDate beforeEndDate = relativeDateRange.getBeforeEndDate();
            LocalDate startDate = relativeDateRange.getStartDate();
            LocalDate endDate = relativeDateRange.getEndDate();
            stepDetailSuspendRepo = new StepDetailSuspendRepo(null, i3, 0 == true ? 1 : 0);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            wq8 wq8Var = wq8.INSTANCE;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Job[]{BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8Var.e()), null, null, new StepDetailServiceImpl$fetchDateRangeStepStat$beforeJob$1(objectRef3, stepDetailSuspendRepo, beforeStartDate, beforeEndDate, null), 3, null), BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8Var.e()), null, null, new StepDetailServiceImpl$fetchDateRangeStepStat$afterJob$1(objectRef4, stepDetailSuspendRepo, startDate, endDate, null), 3, null)}).iterator();
            objectRef = objectRef3;
            localDate = beforeStartDate;
            localDate2 = endDate;
            localDate3 = startDate;
            localDate4 = beforeEndDate;
            it = it2;
            objectRef2 = objectRef4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$7;
            objectRef2 = (Ref.ObjectRef) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$6;
            objectRef = (Ref.ObjectRef) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$5;
            StepDetailSuspendRepo stepDetailSuspendRepo2 = (StepDetailSuspendRepo) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$4;
            LocalDate localDate5 = (LocalDate) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$3;
            LocalDate localDate6 = (LocalDate) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$2;
            LocalDate localDate7 = (LocalDate) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$1;
            LocalDate localDate8 = (LocalDate) stepDetailServiceImpl$fetchDateRangeStepStat$1.L$0;
            ResultKt.throwOnFailure(obj);
            stepDetailSuspendRepo = stepDetailSuspendRepo2;
            localDate2 = localDate5;
            localDate3 = localDate6;
            localDate4 = localDate7;
            localDate = localDate8;
        }
        while (it.hasNext()) {
            Job job = (Job) it.next();
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$0 = localDate;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$1 = localDate4;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$2 = localDate3;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$3 = localDate2;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$4 = stepDetailSuspendRepo;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$5 = objectRef;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$6 = objectRef2;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.L$7 = it;
            stepDetailServiceImpl$fetchDateRangeStepStat$1.label = 1;
            if (job.join(stepDetailServiceImpl$fetchDateRangeStepStat$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        T t = objectRef.element;
        Intrinsics.checkNotNull(t);
        StepDetailSuspendRepo stepDetailSuspendRepo3 = stepDetailSuspendRepo;
        LocalDate localDate9 = localDate3;
        List<StepStat> listF = stepDetailSuspendRepo3.f(localDate, localDate4, (List) t, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        T t2 = objectRef2.element;
        Intrinsics.checkNotNull(t2);
        List<StepStat> listF2 = stepDetailSuspendRepo3.f(localDate9, localDate2, (List) t2, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        RangeDateDataHandler rangeDateDataHandler = new RangeDateDataHandler();
        gqi gqiVar = new gqi();
        return new DateRangeStat(RangeDateDataHandler.d(rangeDateDataHandler, gqiVar.a(listF), localDate, localDate4, null, null, 24, null), RangeDateDataHandler.d(rangeDateDataHandler, gqiVar.a(listF2), localDate9, localDate2, null, null, 24, null), listF, listF2);
    }

    @Override // com.heytap.health.sport.services.StepDetailService
    @NotNull
    public WeekHorizonChart.b Q3(@NotNull Context context, @NotNull RelativeDateRange relativeDatePair, @NotNull DateRangeStat dateRangeStat) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(relativeDatePair, "relativeDatePair");
        Intrinsics.checkNotNullParameter(dateRangeStat, "dateRangeStat");
        StepItemDataHandler stepItemDataHandler = new StepItemDataHandler();
        return stepItemDataHandler.r(context, relativeDatePair.f(), relativeDatePair.e(), relativeDatePair.h(), relativeDatePair.g(), stepItemDataHandler.j(dateRangeStat.e()), stepItemDataHandler.j(dateRangeStat.c()), (128 & 128) != 0 ? false : false, (128 & 256) != 0 ? false : true);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.sport.services.StepDetailService
    @Nullable
    public Object ta(@NotNull Context context, @NotNull RelativeDateRange relativeDateRange, @NotNull DateRangeStat p05Var, boolean z, @NotNull Continuation<? super WeekTrentChart.StepTrent> continuation) {
        StepItemDataHandler stepItemDataHandler = new StepItemDataHandler();
        return stepItemDataHandler.x(context, o05.e(relativeDateRange.h(), relativeDateRange.g()) > 7 ? BaseItemView.CARD_MODE.MONTH : BaseItemView.CARD_MODE.WEEK, relativeDateRange.f(), relativeDateRange.e(), relativeDateRange.h(), relativeDateRange.g(), stepItemDataHandler.l(relativeDateRange.f(), relativeDateRange.e(), p05Var.e()), stepItemDataHandler.l(relativeDateRange.h(), relativeDateRange.g(), p05Var.c()), z, true, continuation);
    }
}
