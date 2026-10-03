package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.health.daily.bean.ConsumptionCompareData;
import com.heytap.health.lib_chart.R$color;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0002¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/bs4;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "sportDataStatList", "Lcom/oplus/aiunit/vision/dzj;", "a", "Lcom/heytap/health/daily/bean/ConsumptionCompareData;", "b", "dataList", "c", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDailyWeekDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyWeekDataTransform.kt\ncom/heytap/health/daily/model/DailyWeekDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n1855#2,2:92\n*S KotlinDebug\n*F\n+ 1 DailyWeekDataTransform.kt\ncom/heytap/health/daily/model/DailyWeekDataTransform\n*L\n31#1:90,2\n76#1:92,2\n*E\n"})
public final class bs4 {
    public static final int $stable = 0;

    @NotNull
    public final dzj a(long startTime, long endTime, @NotNull List<SportDataStat> sportDataStatList) {
        Intrinsics.checkNotNullParameter(sportDataStatList, "sportDataStatList");
        List<ConsumptionCompareData> listB = b(sportDataStatList);
        if (!listB.isEmpty()) {
            startTime = listB.get(0).getTimestamp();
        }
        return new dzj(c(startTime, endTime, listB), !sportDataStatList.isEmpty(), startTime);
    }

    public final List<ConsumptionCompareData> b(List<SportDataStat> sportDataStatList) {
        ArrayList arrayList = new ArrayList();
        for (SportDataStat sportDataStat : sportDataStatList) {
            ConsumptionCompareData consumptionCompareData = new ConsumptionCompareData();
            consumptionCompareData.setTimestamp(mq8.INSTANCE.g(sportDataStat.getDate()));
            if (sportDataStat.getTotalSteps() > 9999000) {
                consumptionCompareData.setY(9999000.0f);
            } else {
                consumptionCompareData.setY(sportDataStat.getTotalSteps());
            }
            consumptionCompareData.setColor(rg7.b(R$color.lib_core_charts_daily_consumption_primary_color));
            consumptionCompareData.setCalorie(consumptionCompareData.getY() / 1000.0f);
            consumptionCompareData.setMonthTotalCalorie(sportDataStat.getTotalCalories() / 1000.0f);
            consumptionCompareData.setCalorieGoal(sportDataStat.getCurrentDayCaloriesGoal() / 1000);
            consumptionCompareData.setReachGoalDays(sportDataStat.getCaloriesGoalComplete());
            consumptionCompareData.setMonthTotalValidDays(sportDataStat.getSyncStatus());
            arrayList.add(consumptionCompareData);
        }
        return arrayList;
    }

    public final List<ConsumptionCompareData> c(long startTime, long endTime, List<ConsumptionCompareData> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d()).toLocalDate().atStartOfDay();
        long j2 = 86400000;
        int iCeil = ((int) Math.ceil((LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), mq8Var.d()).toLocalDate().atStartOfDay().atZone(mq8Var.d()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(mq8Var.d()).toInstant().toEpochMilli()) / j2)) + 1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iCeil; i++) {
            ConsumptionCompareData consumptionCompareData = new ConsumptionCompareData();
            consumptionCompareData.setY(0.0f);
            consumptionCompareData.setTimestamp(localDateTimeAtStartOfDay.plusDays(i).atZone(mq8.INSTANCE.d()).toInstant().toEpochMilli());
            arrayList.add(consumptionCompareData);
        }
        for (ConsumptionCompareData consumptionCompareData2 : dataList) {
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(consumptionCompareData2.getTimestamp());
            mq8 mq8Var2 = mq8.INSTANCE;
            arrayList.set((int) Math.ceil((LocalDateTime.ofInstant(instantOfEpochMilli2, mq8Var2.d()).atZone(mq8Var2.d()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(mq8Var2.d()).toInstant().toEpochMilli()) / j2), consumptionCompareData2);
        }
        return arrayList;
    }
}
