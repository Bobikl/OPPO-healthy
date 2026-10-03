package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.hrv.hrv.util.HrvDataType;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/bh9;", "", "", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "hrvStatList", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "Lcom/heytap/health/hrv/hrv/util/HrvDataType;", "hrvDataType", "Lcom/oplus/aiunit/vision/sh9;", "a", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHrvSameTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrvSameTransform.kt\ncom/heytap/health/hrv/hrv/model/HrvSameTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1855#2,2:173\n1855#2,2:175\n1855#2,2:177\n*S KotlinDebug\n*F\n+ 1 HrvSameTransform.kt\ncom/heytap/health/hrv/hrv/model/HrvSameTransform\n*L\n62#1:173,2\n83#1:175,2\n123#1:177,2\n*E\n"})
public final class bh9 {
    public static final int $stable = 0;

    @NotNull
    public final sh9 a(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<PhysicalMentalStat> hrvStatList, @NotNull HealthFrgType healthFrgType, @NotNull HrvDataType hrvDataType) {
        long epochMilli;
        long epochMilli2;
        int avgHrv;
        int avgHrv2;
        Intrinsics.checkNotNullParameter(hrvStatList, "hrvStatList");
        Intrinsics.checkNotNullParameter(healthFrgType, "healthFrgType");
        Intrinsics.checkNotNullParameter(hrvDataType, "hrvDataType");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        if (healthFrgType == HealthFrgType.WEEK) {
            epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(7L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartHighestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(7L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        } else if (healthFrgType == HealthFrgType.MONTH) {
            epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(30L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            epochMilli2 = LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), ZoneId.systemDefault()).minusDays(1L).toLocalDate(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        } else {
            epochMilli = 0;
            epochMilli2 = 0;
        }
        ArrayList<PhysicalMentalStat> arrayList = new ArrayList();
        ArrayList<PhysicalMentalStat> arrayList2 = new ArrayList();
        Iterator<T> it = hrvStatList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PhysicalMentalStat physicalMentalStat = (PhysicalMentalStat) it.next();
            long jG = mq8.INSTANCE.g(physicalMentalStat.getDate());
            if (epochMilli <= jG && jG <= epochMilli2) {
                arrayList.add(physicalMentalStat);
            }
            if (chartLowestVisibleTime <= jG && jG <= chartHighestVisibleTime) {
                arrayList2.add(physicalMentalStat);
            }
        }
        mq8 mq8Var = mq8.INSTANCE;
        String strY = mq8Var.y(chartLowestVisibleTime, "yyyy/MM/dd HH:mm:ss");
        String strY2 = mq8Var.y(chartHighestVisibleTime, "yyyy/MM/dd HH:mm:ss");
        String strY3 = mq8Var.y(epochMilli, "yyyy/MM/dd HH:mm:ss");
        String strY4 = mq8Var.y(epochMilli2, "yyyy/MM/dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("chartLowestVisibleTime:");
        sb.append(strY);
        sb.append("chartHighestVisibleTime:");
        sb.append(strY2);
        sb.append("beforeChartLowestVisibleTime:");
        sb.append(strY3);
        sb.append("beforeChartHighestVisibleTime:");
        sb.append(strY4);
        int minHrv = 0;
        int maxHrv = 0;
        int avgHrv3 = 0;
        int i = 0;
        int i2 = 0;
        int avgHrv4 = 0;
        for (PhysicalMentalStat physicalMentalStat2 : arrayList2) {
            if (hrvDataType == HrvDataType.ALL_DAY) {
                if (minHrv == 0 || minHrv > physicalMentalStat2.getMinHrv()) {
                    minHrv = physicalMentalStat2.getMinHrv();
                }
                if (maxHrv < physicalMentalStat2.getMaxHrv()) {
                    maxHrv = physicalMentalStat2.getMaxHrv();
                }
                if (avgHrv3 == 0 || avgHrv3 > physicalMentalStat2.getAvgHrv()) {
                    avgHrv3 = physicalMentalStat2.getAvgHrv();
                }
                if (avgHrv4 < physicalMentalStat2.getAvgHrv()) {
                    avgHrv4 = physicalMentalStat2.getAvgHrv();
                }
                if (physicalMentalStat2.getAvgHrv() > 0) {
                    avgHrv2 = physicalMentalStat2.getAvgHrv();
                    i2 += avgHrv2;
                    i++;
                }
            } else {
                if (minHrv == 0 || minHrv > physicalMentalStat2.getMinSleepHrv()) {
                    minHrv = physicalMentalStat2.getMinSleepHrv();
                }
                if (maxHrv < physicalMentalStat2.getMaxSleepHrv()) {
                    maxHrv = physicalMentalStat2.getMaxSleepHrv();
                }
                if (avgHrv3 == 0 || avgHrv3 > physicalMentalStat2.getAvgSleepHrv()) {
                    avgHrv3 = physicalMentalStat2.getAvgSleepHrv();
                }
                if (avgHrv4 < physicalMentalStat2.getAvgSleepHrv()) {
                    avgHrv4 = physicalMentalStat2.getAvgSleepHrv();
                }
                if (physicalMentalStat2.getAvgSleepHrv() > 0) {
                    avgHrv2 = physicalMentalStat2.getAvgSleepHrv();
                    i2 += avgHrv2;
                    i++;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        for (PhysicalMentalStat physicalMentalStat3 : arrayList) {
            if (hrvDataType == HrvDataType.ALL_DAY) {
                if (physicalMentalStat3.getAvgHrv() > 0) {
                    avgHrv = physicalMentalStat3.getAvgHrv();
                    i4 += avgHrv;
                    i3++;
                }
            } else if (physicalMentalStat3.getAvgSleepHrv() > 0) {
                avgHrv = physicalMentalStat3.getAvgSleepHrv();
                i4 += avgHrv;
                i3++;
            }
        }
        Object obj = arrayList2.isEmpty() ^ true ? arrayList2.get(arrayList2.size() - 1) : null;
        xf9 xf9Var = new xf9();
        if (i > 0) {
            xf9Var.f(i2 / i);
        }
        if (i3 > 0) {
            xf9Var.e(i4 / i3);
        }
        PhysicalMentalStat physicalMentalStat4 = (PhysicalMentalStat) obj;
        if (physicalMentalStat4 != null && hrvDataType == HrvDataType.SLEEP) {
            xf9Var.h(physicalMentalStat4.getHrvReasonableRangeLow());
            xf9Var.g(physicalMentalStat4.getHrvReasonableRangeHigh());
        }
        sh9 sh9Var = new sh9();
        sh9Var.n(arrayList2.isEmpty());
        sh9Var.m(minHrv);
        sh9Var.k(maxHrv);
        sh9Var.l(avgHrv3);
        sh9Var.j(avgHrv4);
        sh9Var.i(xf9Var.getIntervalLow());
        sh9Var.h(xf9Var.getIntervalHigh());
        sh9Var.g(xf9Var);
        return sh9Var;
    }
}
