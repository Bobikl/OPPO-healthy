package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/bk1;", "", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "bloodSugarList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/q78;", "a", "lastLowestVisibleTime", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "bloodSugarStatList", "Lcom/oplus/aiunit/vision/p78;", "c", "startTime", "endTime", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "b", "<init>", "()V", "Companion", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseMonthTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseMonthTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BloodGlucoseMonthTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1855#2,2:242\n1855#2,2:244\n1855#2,2:246\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseMonthTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BloodGlucoseMonthTransform\n*L\n32#1:242,2\n136#1:244,2\n175#1:246,2\n*E\n"})
public final class bk1 {

    @NotNull
    public static final String TAG = "GluMonthTransform";

    @NotNull
    public final q78 a(@NotNull List<BloodSugarStat> bloodSugarList, long chartVisibleTime) {
        boolean z;
        float fDoubleValue;
        float fDoubleValue2;
        Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
        a7b.f("GluMonthTransform", "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!bloodSugarList.isEmpty()) {
            for (BloodSugarStat bloodSugarStat : bloodSugarList) {
                long jA = v05.a(bloodSugarStat.getDate());
                if (bloodSugarStat.getMin() != null) {
                    Double min = bloodSugarStat.getMin();
                    Intrinsics.checkNotNull(min);
                    fDoubleValue = (float) min.doubleValue();
                } else {
                    fDoubleValue = 0.0f;
                }
                if (bloodSugarStat.getMax() != null) {
                    Double max = bloodSugarStat.getMax();
                    Intrinsics.checkNotNull(max);
                    fDoubleValue2 = (float) max.doubleValue();
                } else {
                    fDoubleValue2 = 0.0f;
                }
                TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(jA, fDoubleValue, fDoubleValue2);
                if (bloodSugarStat.getWarningCounts() > 0) {
                    timeStampedCandleData.e(String.valueOf(bloodSugarStat.getWarningCounts()));
                }
                arrayList.add(timeStampedCandleData);
            }
            z = false;
            jCurrentTimeMillis = arrayList.get(0).getTimestamp();
            jCurrentTimeMillis2 = arrayList.get(arrayList.size() - 1).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f("GluMonthTransform", "firstDataTime:" + mq8Var.q(jCurrentTimeMillis, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(jCurrentTimeMillis2, "yyyyMMdd HH:mm"));
        } else {
            z = true;
        }
        mq8 mq8Var2 = mq8.INSTANCE;
        long jL = mq8Var2.l(jCurrentTimeMillis);
        long jK = mq8Var2.k(jCurrentTimeMillis2);
        long jL2 = chartVisibleTime > 0 ? mq8Var2.l(chartVisibleTime) : mq8Var2.l(jK);
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(jL2), mq8Var2.d()).toLocalDate().plusDays(31L).atStartOfDay().atZone(mq8Var2.d()).toInstant().toEpochMilli() - 1;
        boolean z2 = z;
        if (jK < epochMilli) {
            jK = epochMilli;
        }
        long jK2 = mq8Var2.k(System.currentTimeMillis());
        if (jK2 >= jK) {
            jK = jK2;
        }
        String strQ = mq8Var2.q(jL, "yyyyMMdd HH:mm");
        String strQ2 = mq8Var2.q(jK, "yyyyMMdd HH:mm");
        String strQ3 = mq8Var2.q(jL2, "yyyyMMdd HH:mm");
        String strQ4 = mq8Var2.q(epochMilli, "yyyyMMdd HH:mm");
        StringBuilder sb = new StringBuilder();
        long j2 = jL2;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f("GluMonthTransform", sb.toString());
        return new q78(b(jL, jK, arrayList), bloodSugarList, z2, jL, jK, j2, epochMilli);
    }

    public final List<TimeStampedCandleData> b(long startTime, long endTime, List<TimeStampedCandleData> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d());
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), mq8Var.d()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= epochDay) {
            while (true) {
                arrayList.add(new TimeStampedCandleData(localDateTimeOfInstant.plusDays(j2).atZone(mq8.INSTANCE.d()).toInstant().toEpochMilli(), -10.0f, -10.0f));
                if (j2 == epochDay) {
                    break;
                }
                j2++;
            }
        }
        for (TimeStampedCandleData timeStampedCandleData : dataList) {
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedCandleData.getTimestamp()), mq8.INSTANCE.d()).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), timeStampedCandleData);
        }
        return arrayList;
    }

    @NotNull
    public final p78 c(long lastLowestVisibleTime, long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BloodSugarStat> bloodSugarStatList) {
        int iA;
        int iA2;
        int i;
        Intrinsics.checkNotNullParameter(bloodSugarStatList, "bloodSugarStatList");
        a7b.f("GluMonthTransform", "getCardDataFromTime:" + lastLowestVisibleTime + " /chartLowestVisibleTime:" + chartLowestVisibleTime + " /chartHighestVisibleTime:" + chartHighestVisibleTime + " /size:" + bloodSugarStatList.size());
        mq8 mq8Var = mq8.INSTANCE;
        int iE = mq8Var.e(chartLowestVisibleTime);
        int iE2 = mq8Var.e(chartHighestVisibleTime);
        int iE3 = mq8Var.e(lastLowestVisibleTime);
        Iterator it = bloodSugarStatList.iterator();
        Float fValueOf = Float.valueOf(0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        int warningCounts = 0;
        int goalAchieved = 0;
        int goalAchieved2 = 0;
        int i2 = 0;
        double d = 0.0d;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BloodSugarStat bloodSugarStat = (BloodSugarStat) it.next();
            Iterator it2 = it;
            int date = bloodSugarStat.getDate();
            if (iE3 <= date && date < iE) {
                goalAchieved += bloodSugarStat.getGoalAchieved();
            }
            int date2 = bloodSugarStat.getDate();
            if (iE <= date2 && date2 <= iE2) {
                goalAchieved2 += bloodSugarStat.getGoalAchieved();
                warningCounts += bloodSugarStat.getWarningCounts();
                Double average = bloodSugarStat.getAverage();
                double dDoubleValue = average != null ? average.doubleValue() : 0.0d;
                if (dDoubleValue > 0.0d) {
                    d += dDoubleValue;
                    i2++;
                }
                Number min = bloodSugarStat.getMin();
                if (min == null) {
                    min = fValueOf;
                }
                float fFloatValue = min.floatValue();
                float f3 = f;
                f = (((f3 == 0.0f) || f3 > fFloatValue) && fFloatValue > 0.0f) ? fFloatValue : f3;
                Number max = bloodSugarStat.getMax();
                if (max == null) {
                    max = fValueOf;
                }
                float fFloatValue2 = max.floatValue();
                float f4 = f2;
                f2 = f4 < fFloatValue2 ? fFloatValue2 : f4;
                iB += eik.b(bloodSugarStat.getHighCounts());
                iB2 += eik.b(bloodSugarStat.getNormalCounts());
                iB3 += eik.b(bloodSugarStat.getLowCounts());
            }
            iE3 = iE3;
            it = it2;
        }
        float f5 = f;
        float f6 = f2;
        double d2 = i2 > 0 ? d / ((double) i2) : 0.0d;
        int i3 = iB + iB2 + iB3;
        if (i3 > 0) {
            iA2 = qu8.a(iB, i3);
            int i4 = 100 - iA2;
            iA = qu8.a(iB2, i3);
            if (iA > i4) {
                iA = i4;
            }
            i = i4 - iA;
        } else {
            iA = 0;
            iA2 = 0;
            i = 0;
        }
        a7b.f("GluMonthTransform", "getCardDataFromTime result minValue:" + f5 + " ,maxValue:" + f6);
        p78 p78Var = new p78();
        p78Var.r(f6 <= 0.0f);
        p78Var.k(d2);
        p78Var.p(f6);
        p78Var.q(f5);
        p78Var.n(iA2);
        p78Var.s(iA);
        p78Var.o(i);
        p78Var.l(goalAchieved);
        p78Var.m(goalAchieved2);
        p78Var.t(warningCounts);
        return p78Var;
    }
}
