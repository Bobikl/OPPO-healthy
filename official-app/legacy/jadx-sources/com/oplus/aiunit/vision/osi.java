package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.health.health_base.R$string;
import com.heytap.health.quickcard.StepDataProcess;
import com.heytap.health.quickcard.data.StepDataBean;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\r\u001a\u00020\fJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0002¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/osi;", "", "", "startTime", "endTime", "Landroid/os/Bundle;", "bundle", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "sportDataStatList", "Lcom/heytap/databaseengine/model/HeartRateDataStat;", "heartRateDataStatList", "", "stepGoal", "Lcom/heytap/health/quickcard/data/StepDataBean;", "a", "", "dataList", "b", "<init>", "()V", "quickcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepQuickTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepQuickTransform.kt\ncom/heytap/health/quickcard/model/StepQuickTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1855#2,2:171\n1855#2,2:173\n*S KotlinDebug\n*F\n+ 1 StepQuickTransform.kt\ncom/heytap/health/quickcard/model/StepQuickTransform\n*L\n51#1:171,2\n158#1:173,2\n*E\n"})
public final class osi {
    @NotNull
    public final StepDataBean a(long startTime, long endTime, @NotNull Bundle bundle, @NotNull List<SportDataStat> sportDataStatList, @NotNull List<HeartRateDataStat> heartRateDataStatList, int stepGoal) {
        HeartRateDataStat heartRateDataStat;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(sportDataStatList, "sportDataStatList");
        Intrinsics.checkNotNullParameter(heartRateDataStatList, "heartRateDataStatList");
        Context contextA = b78.a();
        int i = (int) bundle.getLong("step");
        int i2 = (int) bundle.getLong("stepGoal");
        long j2 = (long) bundle.getDouble("calorie");
        double d = bundle.getDouble("distance");
        a7b.f("StepQuickCardModel", "provider:" + i + " ,:" + i2 + " ,:" + j2 + " ,:" + d + " ,:" + stepGoal);
        boolean z = (i == 0 || i2 == 0) ? false : true;
        List<SportDataStat> listB = b(startTime, endTime, sportDataStatList);
        int iE = mq8.INSTANCE.e(System.currentTimeMillis());
        StepDataBean stepDataBean = new StepDataBean();
        if (z) {
            stepDataBean.setTotalSteps(i);
        }
        stepDataBean.setStepsGoal(stepGoal);
        stepDataBean.getChartList().clear();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            SportDataStat sportDataStat = (SportDataStat) it.next();
            if (sportDataStat.getDate() == iE) {
                if (z) {
                    sportDataStat.setTotalSteps(i);
                    sportDataStat.setTotalCalories(((long) 1000) * j2);
                    sportDataStat.setTotalDistance((int) (((double) 1000) * d));
                } else {
                    long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalCalories(), j2 * ((long) 1000));
                    sportDataStat.setTotalCalories(jCoerceAtLeast);
                    sportDataStat.setTotalDistance(RangesKt___RangesKt.coerceAtLeast(sportDataStat.getTotalDistance(), (int) (((double) 1000) * d)));
                    stepDataBean.setTotalSteps(sportDataStat.getTotalSteps());
                    j2 = jCoerceAtLeast;
                }
            }
            int size = heartRateDataStatList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    heartRateDataStat = null;
                    break;
                }
                heartRateDataStat = heartRateDataStatList.get(i3);
                if (sportDataStat.getDate() == heartRateDataStat.getDate()) {
                    break;
                }
                i3++;
            }
            int walkAvgHeartRate = heartRateDataStat != null ? heartRateDataStat.getWalkAvgHeartRate() : 0;
            String strValueOf = walkAvgHeartRate > 0 ? String.valueOf(walkAvgHeartRate) : "-- ";
            int totalSteps = sportDataStat.getTotalSteps() > 99999 ? 99999 : sportDataStat.getTotalSteps();
            float totalDistance = (sportDataStat.getTotalDistance() / 10) / 100.0f;
            if (totalDistance > 999.9d) {
                totalDistance = 999.9f;
            }
            double totalCalories = sportDataStat.getTotalCalories() / 1000.0d;
            if (totalCalories > 9999.0d) {
                totalCalories = 9999.0d;
            }
            List<StepDataBean.StepDataStat> chartList = stepDataBean.getChartList();
            int i4 = iE;
            long jG = mq8.INSTANCE.g(sportDataStat.getDate());
            int totalDistance2 = sportDataStat.getTotalDistance();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = contextA.getString(R$string.health_base_distance_tip);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…health_base_distance_tip)");
            String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(totalDistance)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            long totalCalories2 = sportDataStat.getTotalCalories();
            String string2 = contextA.getString(R$string.health_base_calorie_tip);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(com.he….health_base_calorie_tip)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf((int) totalCalories)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            String string3 = contextA.getString(com.heytap.health.heartrate.R$string.health_heart_rate_frequency, strValueOf);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(com.he…te_frequency, walkStatus)");
            chartList.add(new StepDataBean.StepDataStat(jG, totalSteps, totalDistance2, str, totalCalories2, str2, walkAvgHeartRate, string3));
            it = it;
            iE = i4;
        }
        return stepDataBean;
    }

    public final List<SportDataStat> b(long startTime, long endTime, List<? extends SportDataStat> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        a7b.f(StepDataProcess.TAG, "fillData startTime:" + startTime + " ,endTime:" + endTime + " ,daysNum:" + epochDay);
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
