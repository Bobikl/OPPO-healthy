package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.log.util.DateUtil;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ@\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/jk1;", "", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "bloodSugarList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/q78;", "a", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "bloodSugarStatList", "Lcom/oplus/aiunit/vision/p78;", "c", "startTime", "endTime", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "Lkotlin/Pair;", "", "b", "<init>", "()V", "Companion", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseYearTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseYearTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BloodGlucoseYearTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1855#2,2:244\n1855#2,2:246\n1855#2,2:248\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseYearTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BloodGlucoseYearTransform\n*L\n32#1:244,2\n134#1:246,2\n177#1:248,2\n*E\n"})
public final class jk1 {

    @NotNull
    public static final String TAG = "GluYearTransform";

    @NotNull
    public final q78 a(@NotNull List<BloodSugarStat> bloodSugarList, long chartVisibleTime) {
        long timestamp;
        long timestamp2;
        boolean z;
        long jU;
        long jT;
        float fDoubleValue;
        Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
        a7b.f(TAG, "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!bloodSugarList.isEmpty()) {
            for (BloodSugarStat bloodSugarStat : bloodSugarList) {
                long jA = v05.a(bloodSugarStat.getDate());
                float fDoubleValue2 = 0.0f;
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
                }
                TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(jA, fDoubleValue, fDoubleValue2);
                if (bloodSugarStat.getWarningCounts() > 0) {
                    timeStampedCandleData.e(String.valueOf(bloodSugarStat.getWarningCounts()));
                }
                arrayList.add(timeStampedCandleData);
            }
            z = false;
            timestamp2 = arrayList.get(0).getTimestamp();
            timestamp = arrayList.get(arrayList.size() - 1).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f(TAG, "firstDataTime:" + mq8Var.q(timestamp2, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm"));
        } else {
            timestamp = jCurrentTimeMillis2;
            timestamp2 = jCurrentTimeMillis;
            z = true;
        }
        mq8 mq8Var2 = mq8.INSTANCE;
        long jU2 = mq8Var2.u(timestamp2);
        long jT2 = mq8Var2.t(timestamp);
        if (chartVisibleTime > 0) {
            long jU3 = mq8Var2.u(chartVisibleTime);
            jT = mq8Var2.t(chartVisibleTime);
            jU = jU3;
        } else {
            jU = mq8Var2.u(jT2);
            jT = jT2;
        }
        long jT3 = mq8Var2.t(System.currentTimeMillis());
        long j2 = jT3 < jT2 ? jT2 : jT3;
        boolean z2 = z;
        long j3 = j2;
        a7b.f(TAG, "later chartStartTime:" + mq8Var2.q(jU2, DateUtil.DATEFORMATMINUTE) + "/chartEndTime:" + mq8Var2.q(j2, DateUtil.DATEFORMATMINUTE) + "/!" + jT2 + "/lowestVisibleTime:" + mq8Var2.q(jU, "YYYY-MM-dd HH:mm") + "/highestVisibleTime:" + mq8Var2.q(jT, DateUtil.DATEFORMATMINUTE));
        Pair<List<TimeStampedCandleData>, Integer> pairB = b(jU2, j3, jU, arrayList);
        q78 q78Var = new q78(pairB.getFirst(), bloodSugarList, z2, jU2, j3, jU, jT);
        q78Var.i(pairB.getSecond().intValue());
        return q78Var;
    }

    public final Pair<List<TimeStampedCandleData>, Integer> b(long startTime, long endTime, long chartLowestVisibleTime, List<TimeStampedCandleData> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d());
        long totalMonths = Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), mq8Var.d()).toLocalDate().atStartOfDay().toLocalDate().withDayOfMonth(1)).toTotalMonths();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        if (0 <= totalMonths) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusMonths(j2).atZone(mq8.INSTANCE.d()).toInstant().toEpochMilli();
                arrayList.add(new TimeStampedCandleData(epochMilli, -10.0f, -10.0f));
                if (chartLowestVisibleTime == epochMilli) {
                    i = (int) j2;
                }
                if (j2 == totalMonths) {
                    break;
                }
                j2++;
            }
        }
        for (TimeStampedCandleData timeStampedCandleData : dataList) {
            arrayList.set((int) Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedCandleData.getTimestamp()), mq8.INSTANCE.d()).toLocalDate().withDayOfMonth(1)).toTotalMonths(), timeStampedCandleData);
        }
        return new Pair<>(arrayList, Integer.valueOf(i));
    }

    @NotNull
    public final p78 c(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BloodSugarStat> bloodSugarStatList) {
        int iA;
        int iA2;
        int i;
        Intrinsics.checkNotNullParameter(bloodSugarStatList, "bloodSugarStatList");
        a7b.f(TAG, "getCardDataFromTime chartLowestVisibleTime:" + chartLowestVisibleTime + " /chartHighestVisibleTime:" + chartHighestVisibleTime + " /size:" + bloodSugarStatList.size());
        mq8 mq8Var = mq8.INSTANCE;
        int iE = mq8Var.e(chartLowestVisibleTime);
        int iE2 = mq8Var.e(chartHighestVisibleTime);
        int iE3 = mq8Var.e(LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), mq8Var.d()).toLocalDate().minusMonths(12L).atStartOfDay().atZone(mq8Var.d()).toInstant().toEpochMilli());
        Iterator it = bloodSugarStatList.iterator();
        Float fValueOf = Float.valueOf(0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        int warningCounts = 0;
        int goalAchieved = 0;
        int i2 = 0;
        double d = 0.0d;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        int goalAchieved2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BloodSugarStat bloodSugarStat = (BloodSugarStat) it.next();
            Iterator it2 = it;
            int date = bloodSugarStat.getDate();
            if (iE3 <= date && date < iE) {
                goalAchieved2 += bloodSugarStat.getGoalAchieved();
            }
            int date2 = bloodSugarStat.getDate();
            if (iE <= date2 && date2 <= iE2) {
                goalAchieved += bloodSugarStat.getGoalAchieved();
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
                float f3 = f2;
                f2 = (((f3 == 0.0f) || f3 > fFloatValue) && fFloatValue > 0.0f) ? fFloatValue : f3;
                Number max = bloodSugarStat.getMax();
                if (max == null) {
                    max = fValueOf;
                }
                float fFloatValue2 = max.floatValue();
                if (f < fFloatValue2) {
                    f = fFloatValue2;
                }
                iB += eik.b(bloodSugarStat.getHighCounts());
                iB2 += eik.b(bloodSugarStat.getNormalCounts());
                iB3 += eik.b(bloodSugarStat.getLowCounts());
            }
            iE3 = iE3;
            it = it2;
        }
        float f4 = f2;
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
        p78 p78Var = new p78();
        p78Var.r(f <= 0.0f);
        p78Var.k(d2);
        p78Var.p(f);
        p78Var.q(f4);
        p78Var.n(iA2);
        p78Var.s(iA);
        p78Var.o(i);
        p78Var.l(goalAchieved2);
        p78Var.m(goalAchieved);
        p78Var.t(warningCounts);
        return p78Var;
    }
}
