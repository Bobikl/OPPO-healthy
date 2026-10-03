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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/gk1;", "", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "bloodSugarList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/q78;", "a", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "bloodSugarStatList", "Lcom/oplus/aiunit/vision/p78;", "c", "startTime", "endTime", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "b", "<init>", "()V", "Companion", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseWeekTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseWeekTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BloodGlucoseWeekTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1855#2,2:246\n1855#2,2:248\n1855#2,2:250\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseWeekTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BloodGlucoseWeekTransform\n*L\n37#1:246,2\n136#1:248,2\n180#1:250,2\n*E\n"})
public final class gk1 {

    @NotNull
    public static final String TAG = "GluWeekTransform";

    @NotNull
    public final q78 a(@NotNull List<BloodSugarStat> bloodSugarList, long chartVisibleTime) {
        String str;
        long jS;
        long jR;
        long j2;
        boolean z;
        long j3;
        float fDoubleValue;
        Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
        a7b.f(TAG, "buildChartData chartVisibleTime:" + chartVisibleTime);
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = "yyyyMMdd HH:mm";
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
                str2 = str2;
            }
            long timestamp = arrayList.get(0).getTimestamp();
            long timestamp2 = arrayList.get(arrayList.size() - 1).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            str = str2;
            a7b.f(TAG, "firstDataTime:" + mq8Var.q(timestamp, str) + "/lastDataTime:" + mq8Var.q(timestamp2, str));
            long jS2 = mq8Var.s(timestamp);
            long jR2 = mq8Var.r(timestamp2);
            long jR3 = mq8Var.r(jCurrentTimeMillis);
            if (jR3 < jR2) {
                jR3 = jR2;
            }
            if (chartVisibleTime > 0) {
                j3 = jS2;
                j2 = jR3;
                z = false;
                jS = mq8Var.s(chartVisibleTime);
                jR = mq8Var.r(chartVisibleTime);
            } else {
                long jS3 = mq8Var.s(jR2);
                j3 = jS2;
                j2 = jR3;
                jR = mq8Var.r(jR2);
                z = false;
                jS = jS3;
            }
        } else {
            str = "yyyyMMdd HH:mm";
            mq8 mq8Var2 = mq8.INSTANCE;
            jS = mq8Var2.s(jCurrentTimeMillis);
            jR = mq8Var2.r(jCurrentTimeMillis);
            j2 = jR;
            z = true;
            j3 = jS;
        }
        mq8 mq8Var3 = mq8.INSTANCE;
        String strQ = mq8Var3.q(j3, str);
        String strQ2 = mq8Var3.q(j2, str);
        String strQ3 = mq8Var3.q(jS, str);
        String strQ4 = mq8Var3.q(jR, str);
        StringBuilder sb = new StringBuilder();
        long j4 = jS;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f(TAG, sb.toString());
        return new q78(b(j3, j2, arrayList), bloodSugarList, z, j3, j2, j4, jR);
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
    public final p78 c(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BloodSugarStat> bloodSugarStatList) {
        int iA;
        int iA2;
        int i;
        Intrinsics.checkNotNullParameter(bloodSugarStatList, "bloodSugarStatList");
        a7b.f(TAG, "getCardDataFromTime chartLowestVisibleTime:" + chartLowestVisibleTime + " /chartHighestVisibleTime:" + chartHighestVisibleTime + " /size:" + bloodSugarStatList.size());
        mq8 mq8Var = mq8.INSTANCE;
        int iE = mq8Var.e(chartLowestVisibleTime);
        int iE2 = mq8Var.e(chartHighestVisibleTime);
        int iE3 = mq8Var.e(LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), mq8Var.d()).toLocalDate().minusDays(7L).atStartOfDay().atZone(mq8Var.d()).toInstant().toEpochMilli());
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
