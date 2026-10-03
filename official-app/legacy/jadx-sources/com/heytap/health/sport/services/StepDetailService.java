package com.heytap.health.sport.services;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.core.widget.charts.customChart.WeekHorizonChart;
import com.heytap.health.core.widget.charts.customChart.WeekTrentChart;
import com.oplus.aiunit.vision.DateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H&J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/sport/services/StepDetailService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/oplus/aiunit/vision/dlf;", "dateRange", "Lcom/oplus/aiunit/vision/p05;", "G7", "(Lcom/oplus/aiunit/vision/dlf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "relativeDatePair", "dateRangeStat", "", "isGoalView", "Lcom/heytap/health/core/widget/charts/customChart/WeekTrentChart$f;", "ta", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/dlf;Lcom/oplus/aiunit/vision/p05;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cardType", "", "D0", "", "stepDiff", "Landroid/text/SpannableStringBuilder;", "G0", "Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;", "Q3", "sport_release"}, k = 1, mv = {1, 8, 0})
public interface StepDetailService extends IProvider {
    @NotNull
    String D0(int cardType);

    @NotNull
    SpannableStringBuilder G0(float stepDiff, int cardType);

    @Nullable
    Object G7(@NotNull RelativeDateRange relativeDateRange, @NotNull Continuation<? super DateRangeStat> continuation);

    @NotNull
    WeekHorizonChart.b Q3(@NotNull Context context, @NotNull RelativeDateRange relativeDatePair, @NotNull DateRangeStat dateRangeStat);

    @Nullable
    Object ta(@NotNull Context context, @NotNull RelativeDateRange relativeDateRange, @NotNull DateRangeStat dateRangeStat, boolean z, @NotNull Continuation<? super WeekTrentChart.StepTrent> continuation);
}
