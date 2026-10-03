package com.oplus.aiunit.vision;

import androidx.annotation.ColorInt;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.stress.R$array;
import com.heytap.health.stress.bean.StressBean;
import com.heytap.health.stress.bean.StressDayBean;
import com.heytap.health.stress.bean.StressTSData;
import com.heytap.health.stress.util.ChartType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class mxi {
    public static int a(List<StressDataStat> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator<StressDataStat> it = list.iterator();
        float averageStress = 0.0f;
        while (it.hasNext()) {
            averageStress += it.next().getAverageStress();
        }
        return new BigDecimal(averageStress / list.size()).setScale(0, RoundingMode.HALF_UP).intValue();
    }

    public static float b(List<StressDataStat> list, ChartType chartType) {
        if (chartType == ChartType.DAY && list.size() < 12) {
            return 0.0f;
        }
        float fA = a(list);
        float f = 45.0f;
        if (fA > 45.0f) {
            fA = (fA + 100.0f) - 90.0f;
            f = 55.0f;
        }
        return new BigDecimal((fA / f) * 5.0f).setScale(1, RoundingMode.HALF_UP).floatValue();
    }

    public static List<axi> c(List<StressDataStat> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<StressDataStat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g(it.next()));
        }
        a0j.c("StressDataHelper", "convertDataStatToCandleData end, size = " + arrayList.size());
        return arrayList;
    }

    public static StressBean d(List<StressDataStat> list, long j2, long j3, ChartType chartType) {
        StressBean stressBean = new StressBean();
        stressBean.setDataStatList(list);
        List<axi> listC = c(list);
        boolean z = false;
        if (listC.size() > 0) {
            long jC = listC.get(0).c();
            if (chartType == ChartType.WEEK) {
                if (jC < j2) {
                    j2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(jC), ZoneId.systemDefault()).toLocalDate().with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                }
                a0j.c("StressDataHelper", "week fill data startTime:" + x05.a(j2, "yyyy-MM-dd HH:mm:ss"));
            } else if (chartType == ChartType.MONTH) {
                if (jC < j2) {
                    j2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(jC), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                }
                a0j.c("StressDataHelper", "month fill data startTime:" + x05.a(j2, "yyyy-MM-dd HH:mm:ss"));
            } else {
                j2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(jC), ZoneId.systemDefault()).with(TemporalAdjusters.firstDayOfYear()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                a0j.c("StressDataHelper", "year fill data startTime:" + x05.a(j2, "yyyy-MM-dd HH:mm:ss"));
            }
        } else {
            axi axiVar = new axi();
            axiVar.f(j3);
            axiVar.d(0);
            axiVar.e(0);
            listC.add(axiVar);
            z = true;
        }
        stressBean.setStressCandleDataList(i(j2, listC, chartType));
        stressBean.setChartStartTime(1546272000000L);
        stressBean.setShowEmptyChart(z);
        return stressBean;
    }

    public static List<StressTSData> e(List<StressDataStat> list) {
        int[] intArray = b78.a().getResources().getIntArray(R$array.health_stress_color_array);
        ArrayList arrayList = new ArrayList();
        for (StressDataStat stressDataStat : list) {
            arrayList.add(h(stressDataStat, intArray[dyi.b(stressDataStat.getAverageStress())]));
        }
        a0j.c("StressDataHelper", "convertDataStatToTimeStamped end, size = " + arrayList.size());
        return arrayList;
    }

    public static List<StressDayBean> f(long j2, long j3, List<StressDataStat> list) {
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            long j4 = i2;
            if (j4 >= jAbs) {
                a0j.c("StressDataHelper", "convertDayBeanList end, size = " + arrayList.size());
                return arrayList;
            }
            StressDayBean stressDayBean = new StressDayBean();
            long epochMilli = localDateTimeAtStartOfDay.plusDays(j4).withHour(i).withMinute(i).withSecond(i).withNano(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            i2++;
            long epochMilli2 = localDateTimeAtStartOfDay.plusDays(i2).withHour(i).withMinute(i).withSecond(i).withNano(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
            stressDayBean.insertUndueDataList(epochMilli, epochMilli2);
            stressDayBean.setStartTime(epochMilli);
            ArrayList arrayList2 = new ArrayList();
            int i3 = i;
            while (i3 < list.size()) {
                StressDataStat stressDataStat = list.get(i3);
                LocalDateTime localDateTime = localDateTimeAtStartOfDay;
                long j5 = jAbs;
                long date = ((long) stressDataStat.getDate()) * 1000;
                if (date >= epochMilli && date <= epochMilli2) {
                    arrayList2.add(stressDataStat);
                }
                i3++;
                localDateTimeAtStartOfDay = localDateTime;
                jAbs = j5;
            }
            LocalDateTime localDateTime2 = localDateTimeAtStartOfDay;
            long j6 = jAbs;
            stressDayBean.setHalfHourData(arrayList2);
            List<StressTSData> listE = e(arrayList2);
            if (listE.isEmpty()) {
                stressDayBean.insertEmptyData(epochMilli, epochMilli2);
            } else {
                stressDayBean.setDataList(listE);
            }
            arrayList.add(stressDayBean);
            localDateTimeAtStartOfDay = localDateTime2;
            jAbs = j6;
            i = 0;
        }
    }

    public static axi g(StressDataStat stressDataStat) {
        axi axiVar = new axi();
        axiVar.d(stressDataStat.getMaxStress());
        axiVar.e(stressDataStat.getMinStress());
        axiVar.h(stressDataStat.getAverageStress());
        axiVar.f(v05.a(stressDataStat.getDate()));
        return axiVar;
    }

    public static StressTSData h(StressDataStat stressDataStat, @ColorInt int i) {
        StressTSData stressTSData = new StressTSData();
        stressTSData.setY(stressDataStat.getAverageStress());
        stressTSData.setTimestamp(((long) stressDataStat.getDate()) * 1000);
        stressTSData.setColor(i);
        stressTSData.setMinStress(stressDataStat.getMinStress());
        stressTSData.setMaxStress(stressDataStat.getMaxStress());
        return stressTSData;
    }

    public static List<axi> i(long j2, List<axi> list, ChartType chartType) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(list.get(list.size() - 1).c()), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        LocalDateTime localDateTimeAtStartOfDay2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = chartType == ChartType.YEAR ? (int) (Period.between(localDateTimeAtStartOfDay2.toLocalDate().withDayOfMonth(1), LocalDateTime.now().with(TemporalAdjusters.lastDayOfYear()).toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeAtStartOfDay.with(TemporalAdjusters.lastDayOfMonth()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)) + 1;
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i = 0; i < totalMonths; i++) {
            axi axiVar = new axi();
            axiVar.e(0);
            axiVar.d(0);
            axiVar.f(chartType == ChartType.YEAR ? localDateTimeAtStartOfDay2.plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : localDateTimeAtStartOfDay2.plusDays(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            arrayList.add(axiVar);
        }
        for (axi axiVar2 : list) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(axiVar2.c()), ZoneId.systemDefault());
            arrayList.set((int) (chartType == ChartType.YEAR ? Period.between(localDateTimeAtStartOfDay2.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)), axiVar2);
        }
        a0j.c("StressDataHelper", "insertEmptyData end, size = " + arrayList.size());
        return arrayList;
    }

    public static List<StressDataStat> j(List<StressDataStat> list, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        int i = 0;
        while (true) {
            long j4 = i;
            if (j4 >= jAbs) {
                break;
            }
            StressDataStat stressDataStat = new StressDataStat();
            stressDataStat.setDate(v05.i(localDateTimeAtStartOfDay.plusDays(j4).withHour(0).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
            arrayList.add(stressDataStat);
            i++;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (int i3 = 0; i3 < jAbs; i3++) {
                if (list.get(i2).getDate() == ((StressDataStat) arrayList.get(i3)).getDate()) {
                    arrayList.set(i3, list.get(i2));
                }
            }
        }
        return arrayList;
    }
}
