package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.health.base.R$string;
import com.heytap.health.health.impl.R$plurals;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/hpi;", "", "", "startTime", "endTime", "curTime", "Landroid/os/Bundle;", "bundle", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "sportDataStatList", "Lcom/oplus/aiunit/vision/nri;", "a", "dataList", "b", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepCardDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepCardDataTransform.kt\ncom/heytap/health/assistantscreen/model/StepCardDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1855#2,2:150\n1855#2,2:152\n*S KotlinDebug\n*F\n+ 1 StepCardDataTransform.kt\ncom/heytap/health/assistantscreen/model/StepCardDataTransform\n*L\n44#1:150,2\n137#1:152,2\n*E\n"})
public final class hpi {
    public static final int $stable = 0;

    @NotNull
    public final StepDetailsData a(long startTime, long endTime, long curTime, @NotNull Bundle bundle, @NotNull List<? extends SportDataStat> sportDataStatList) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(sportDataStatList, "sportDataStatList");
        Context contextA = b78.a();
        int iCoerceAtLeast = (int) bundle.getLong("step");
        int i = (int) bundle.getLong("stepGoal");
        long jCoerceAtLeast = (long) bundle.getDouble("calorie");
        int iCoerceAtLeast2 = (int) bundle.getDouble("distance");
        List<SportDataStat> listB = b(startTime, endTime, sportDataStatList);
        StepDetailsData stepDetailsData = new StepDetailsData();
        String string = contextA.getString(R$string.lib_base_main_health_tab);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…lib_base_main_health_tab)");
        stepDetailsData.w(string);
        int iE = mq8.INSTANCE.e(curTime);
        int i2 = 0;
        int iCoerceAtLeast3 = 0;
        int totalSteps = 0;
        int i3 = 0;
        for (SportDataStat sportDataStat : listB) {
            if (sportDataStat.getDate() == iE) {
                iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalSteps(), iCoerceAtLeast);
                sportDataStat.setTotalSteps(RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalSteps(), iCoerceAtLeast));
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalCalories(), jCoerceAtLeast);
                sportDataStat.setTotalCalories(RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalCalories(), jCoerceAtLeast));
                iCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalDistance(), iCoerceAtLeast2);
                sportDataStat.setTotalDistance(RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalDistance(), iCoerceAtLeast2));
            }
            totalSteps += sportDataStat.getTotalSteps();
            if (sportDataStat.getTotalSteps() > 0) {
                i3++;
            }
            iCoerceAtLeast3 = RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalSteps(), iCoerceAtLeast3);
            int i4 = i3 > 0 ? totalSteps / i3 : 0;
            stepDetailsData.d().add(Integer.valueOf(sportDataStat.getTotalSteps()));
            i2 = i4;
        }
        stepDetailsData.s(i);
        stepDetailsData.p(iCoerceAtLeast);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_cur_calorie);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ealth_screen_cur_calorie)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(jCoerceAtLeast / ((long) 1000))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        stepDetailsData.o(str);
        String string3 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_cur_cur_distance);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…_screen_cur_cur_distance)");
        String str2 = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf((iCoerceAtLeast2 / 10) / 100.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        stepDetailsData.q(str2);
        String string4 = contextA.getString(com.heytap.health.health.impl.R$string.health_screen_cur_day_no_step_tip);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…reen_cur_day_no_step_tip)");
        stepDetailsData.v(string4);
        String quantityString = contextA.getResources().getQuantityString(R$plurals.health_screen_average_step_tip, i2, String.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…, averageStep.toString())");
        stepDetailsData.n(quantityString);
        if (iCoerceAtLeast3 % 1000 != 0) {
            iCoerceAtLeast3 = ((iCoerceAtLeast3 / 1000) + 1) * 1000;
        }
        stepDetailsData.t(iCoerceAtLeast3);
        if (stepDetailsData.getMaxYAxisValue() <= 0) {
            stepDetailsData.t(1000);
        }
        stepDetailsData.u(0);
        stepDetailsData.r(i2);
        String string5 = contextA.getString(R$string.lib_base_date_monday);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(com.he…ing.lib_base_date_monday)");
        stepDetailsData.x(string5);
        String string6 = contextA.getString(R$string.lib_base_date_sunday);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(com.he…ing.lib_base_date_sunday)");
        stepDetailsData.y(string6);
        return stepDetailsData;
    }

    public final List<SportDataStat> b(long startTime, long endTime, List<? extends SportDataStat> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= epochDay) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusDays(j2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                SportDataStat sportDataStat = new SportDataStat();
                sportDataStat.setDate(mq8.INSTANCE.e(epochMilli));
                arrayList.add(sportDataStat);
                if (j2 == epochDay) {
                    break;
                }
                j2++;
            }
        }
        for (SportDataStat sportDataStat2 : dataList) {
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(mq8.INSTANCE.g(sportDataStat2.getDate())), zoneIdSystemDefault).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), sportDataStat2);
        }
        return arrayList;
    }
}
