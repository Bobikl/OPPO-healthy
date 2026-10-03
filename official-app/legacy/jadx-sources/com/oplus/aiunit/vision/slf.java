package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.relax.RelaxStat;
import com.heytap.health.relax.bean.RelaxBarData;
import com.heytap.health.relax.bean.RelaxBean;
import com.heytap.health.relax.bean.RelaxDayBean;
import com.heytap.health.relax.util.ChartType;
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

/* JADX INFO: loaded from: classes17.dex */
public class slf {
    public static List<RelaxDayBean> a(Object[] objArr, long j2) {
        int length = objArr.length / 4;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            long j3 = (((long) i) * 86400000) + j2;
            int i2 = i * 4;
            Object[] objArr2 = {objArr[i2], objArr[i2 + 1], objArr[i2 + 2], objArr[i2 + 3]};
            RelaxDayBean relaxDayBean = new RelaxDayBean();
            relaxDayBean.setStartTime(j3);
            long j4 = 86400000 + j3;
            relaxDayBean.insertUndueDataList(j3, j4);
            relaxDayBean.setDataList(c(objArr2, j3));
            if (relaxDayBean.getDataList().isEmpty()) {
                relaxDayBean.insertCurTimeEmptyData(j3, j4);
            }
            arrayList.add(relaxDayBean);
        }
        return arrayList;
    }

    public static List<RelaxBarData> b(List<RelaxStat> list, ChartType chartType) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        long jA = v05.a(list.get(0).getDate());
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(v05.a(list.get(list.size() - 1).getDate())), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        LocalDateTime localDateTimeAtStartOfDay2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(jA), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = chartType == ChartType.YEAR ? (int) (Period.between(localDateTimeAtStartOfDay2.toLocalDate().withDayOfMonth(1), localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)) + 1;
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i = 0; i < totalMonths; i++) {
            arrayList.add(new RelaxBarData(chartType == ChartType.YEAR ? localDateTimeAtStartOfDay2.plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : localDateTimeAtStartOfDay2.plusDays(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L, 0L));
        }
        for (RelaxStat relaxStat : list) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(v05.a(relaxStat.getDate())), ZoneId.systemDefault());
            f(relaxStat, (RelaxBarData) arrayList.get((int) (chartType == ChartType.YEAR ? Period.between(localDateTimeAtStartOfDay2.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000))));
        }
        qmf.c("RelaxDataHelper", "convertStatDataToBarData barDataList size: " + arrayList.size());
        return arrayList;
    }

    public static List<RelaxBarData> c(Object[] objArr, long j2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < objArr.length; i++) {
            arrayList.add(new RelaxBarData(j2 + (((long) i) * 1000 * 60 * 60 * 6), 0L, 0L));
        }
        for (int i2 = 0; i2 < objArr.length; i2++) {
            try {
                List list = (List) ((CommonBackBean) objArr[i2]).getObj();
                if (list != null && !list.isEmpty()) {
                    RelaxBarData relaxBarData = new RelaxBarData(v05.a(((RelaxStat) list.get(0)).getDate()), 0L, 0L);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        f((RelaxStat) it.next(), relaxBarData);
                    }
                    arrayList.set(i2, relaxBarData);
                }
            } catch (Exception e2) {
                qmf.b("RelaxDataHelper", e2.toString());
                return new ArrayList();
            }
        }
        return arrayList;
    }

    public static RelaxBean d(List<RelaxStat> list, long j2, long j3, ChartType chartType) {
        boolean z;
        long epochMilli;
        RelaxBean relaxBean = new RelaxBean();
        relaxBean.setRelaxStatList(list);
        List<RelaxBarData> listB = b(list, chartType);
        if (list.size() > 0) {
            z = false;
            long timestamp = listB.get(0).getTimestamp();
            if (chartType == ChartType.WEEK) {
                epochMilli = timestamp < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : j2;
                qmf.c("RelaxDataHelper", "week fill data startTime:" + x05.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            } else if (chartType == ChartType.MONTH) {
                epochMilli = timestamp < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : j2;
                qmf.c("RelaxDataHelper", "month fill data startTime:" + x05.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            } else {
                epochMilli = timestamp < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).with(TemporalAdjusters.firstDayOfYear()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : j2;
                qmf.c("RelaxDataHelper", "year fill data startTime:" + x05.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            }
        } else {
            listB.add(new RelaxBarData(j3, 0L, 0L));
            z = true;
            epochMilli = j2;
        }
        relaxBean.setDataList(e(epochMilli, listB, chartType));
        relaxBean.setChartStartTime(epochMilli);
        relaxBean.setShowEmptyChart(z);
        return relaxBean;
    }

    public static List<RelaxBarData> e(long j2, List<RelaxBarData> list, ChartType chartType) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(list.get(list.size() - 1).getTimestamp()), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        LocalDateTime localDateTimeAtStartOfDay2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = chartType == ChartType.YEAR ? (int) (Period.between(localDateTimeAtStartOfDay2.toLocalDate().withDayOfMonth(1), localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)) + 1;
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i = 0; i < totalMonths; i++) {
            arrayList.add(new RelaxBarData(chartType == ChartType.YEAR ? localDateTimeAtStartOfDay2.plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : localDateTimeAtStartOfDay2.plusDays(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L, 0L));
        }
        for (RelaxBarData relaxBarData : list) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(relaxBarData.getTimestamp()), ZoneId.systemDefault());
            arrayList.set((int) (chartType == ChartType.YEAR ? Period.between(localDateTimeAtStartOfDay2.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)), relaxBarData);
        }
        qmf.c("RelaxDataHelper", "insertEmptyData end, size = " + arrayList.size());
        return arrayList;
    }

    public static void f(RelaxStat relaxStat, RelaxBarData relaxBarData) {
        if (relaxStat.getType() == 1) {
            relaxBarData.setBreath(relaxStat.getTotalDuration());
        } else if (relaxStat.getType() == 2) {
            relaxBarData.setMeditation(relaxStat.getTotalDuration());
        }
    }
}
