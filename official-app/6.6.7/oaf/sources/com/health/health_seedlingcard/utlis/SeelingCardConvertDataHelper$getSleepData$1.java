package com.health.health_seedlingcard.utlis;

import com.health.health_seedlingcard.bean.SleepCardBean;
import com.heytap.health.sleep.day.viewmodel.SleepDataExportViewModel;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.pantanal.seedling.bean.SeedlingCardSizeEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "block", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/health/health_seedlingcard/bean/SleepCardBean;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SeelingCardConvertDataHelper$getSleepData$1 extends Lambda implements Function1<Function1<? super Result<? extends SleepCardBean>, ? extends Unit>, Unit> {
    final /* synthetic */ SeedlingCardSizeEnum $cardEnum;
    final /* synthetic */ long $upkVersionCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeelingCardConvertDataHelper$getSleepData$1(SeedlingCardSizeEnum seedlingCardSizeEnum, long j) {
        super(1);
        this.$cardEnum = seedlingCardSizeEnum;
        this.$upkVersionCode = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(SeedlingCardSizeEnum seedlingCardSizeEnum, long j, Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(seedlingCardSizeEnum, "$cardEnum");
        Intrinsics.checkNotNullParameter(function1, "$block");
        m8b.f(SeelingCardConvertDataHelper.a, " sleep data list size = " + list.size());
        SleepCardBean sleepCardBeanF = SeelingCardConvertDataHelper.INSTANCE.f(list, seedlingCardSizeEnum, j);
        if (sleepCardBeanF != null) {
            function1.invoke(Result.box-impl(Result.constructor-impl(sleepCardBeanF)));
        } else {
            Result.Companion companion = Result.Companion;
            function1.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalArgumentException("")))));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Function1<? super Result<SleepCardBean>, Unit>) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final Function1<? super Result<SleepCardBean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "block");
        SleepDataExportViewModel sleepDataExportViewModel = new SleepDataExportViewModel();
        final SeedlingCardSizeEnum seedlingCardSizeEnum = this.$cardEnum;
        final long j = this.$upkVersionCode;
        sleepDataExportViewModel.f(new ln3() { // from class: com.health.health_seedlingcard.utlis.c
            public final void onResult(Object obj) {
                SeelingCardConvertDataHelper$getSleepData$1.invoke$lambda$0(seedlingCardSizeEnum, j, function1, (List) obj);
            }
        });
    }
}
