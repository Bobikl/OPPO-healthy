package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.HearingHealth;
import com.heytap.databaseengine.model.HearingHealthStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.hearing.bean.Exposure;
import com.heytap.health.hearing.bean.Volume;
import com.heytap.health.hearing.util.HearingChart;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ax8 {
    public static double a(List<HearingHealthStat> list) {
        if (list == null || list.isEmpty()) {
            return 0.0d;
        }
        long totalDuration = 0;
        long averageValue = 0;
        for (int i = 0; i < list.size(); i++) {
            averageValue = (long) (averageValue + (list.get(i).getAverageValue() * list.get(i).getTotalDuration()));
            totalDuration += list.get(i).getTotalDuration();
        }
        if (totalDuration == 0) {
            return 0.0d;
        }
        return new BigDecimal(averageValue / totalDuration).setScale(0, RoundingMode.HALF_UP).doubleValue();
    }

    public static double b(List<HearingHealthStat> list) {
        double totalDuration = 0.0d;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                totalDuration += (double) ((list.get(i).getTotalDuration() / 1000.0f) / 60.0f);
            }
        }
        return totalDuration;
    }

    public static double c(List<HearingHealthStat> list) {
        double exposure = 0.0d;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                exposure += list.get(i).getExposure();
            }
        }
        return exposure;
    }

    public static List<SportHealthData> d(List<Exposure> list) {
        ArrayList arrayList = new ArrayList();
        for (Exposure exposure : list) {
            HearingHealthStat hearingHealthStat = new HearingHealthStat();
            hearingHealthStat.setSsoid(i());
            hearingHealthStat.setDeviceUniqueId(ilj.e());
            hearingHealthStat.setDate(v05.i(exposure.getTime()));
            hearingHealthStat.setSyncStatus(0);
            hearingHealthStat.setExposure(exposure.getValue());
            arrayList.add(hearingHealthStat);
        }
        return arrayList;
    }

    public static List<vw8> e(List<HearingHealthStat> list) {
        ArrayList arrayList = new ArrayList();
        for (HearingHealthStat hearingHealthStat : list) {
            vw8 vw8Var = new vw8();
            vw8Var.f(((long) hearingHealthStat.getDate()) * 1000);
            vw8Var.i(hearingHealthStat.getAverageValue());
            vw8Var.j(hearingHealthStat.getTotalDuration());
            vw8Var.e((int) hearingHealthStat.getMinValue());
            vw8Var.d((int) hearingHealthStat.getMaxValue());
            arrayList.add(vw8Var);
        }
        return arrayList;
    }

    public static List<bx8> f(List<HearingHealthStat> list, long j2, long j3) {
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            long j4 = i2;
            if (j4 >= jAbs) {
                a7b.f(b04.TAG, "convertDayBeanList end, size = " + arrayList.size());
                return arrayList;
            }
            bx8 bx8Var = new bx8();
            long epochMilli = localDateTimeAtStartOfDay.plusDays(j4).withHour(i).withMinute(i).withSecond(i).withNano(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            i2++;
            long epochMilli2 = localDateTimeAtStartOfDay.plusDays(i2).withHour(i).withMinute(i).withSecond(i).withNano(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
            bx8Var.insertUndueDataList(epochMilli, epochMilli2);
            bx8Var.setCurPageTimestamp(epochMilli);
            ArrayList arrayList2 = new ArrayList();
            int i3 = i;
            while (i3 < list.size()) {
                HearingHealthStat hearingHealthStat = list.get(i3);
                LocalDateTime localDateTime = localDateTimeAtStartOfDay;
                long j5 = jAbs;
                long date = ((long) hearingHealthStat.getDate()) * 1000;
                if (date >= epochMilli && date <= epochMilli2) {
                    arrayList2.add(hearingHealthStat);
                }
                i3++;
                localDateTimeAtStartOfDay = localDateTime;
                jAbs = j5;
            }
            LocalDateTime localDateTime2 = localDateTimeAtStartOfDay;
            long j6 = jAbs;
            bx8Var.setHalfHourData(arrayList2);
            List<vw8> listE = e(arrayList2);
            if (listE.isEmpty()) {
                bx8Var.insertEmptyData(epochMilli, epochMilli2);
            } else {
                bx8Var.setDataList(listE);
            }
            arrayList.add(bx8Var);
            localDateTimeAtStartOfDay = localDateTime2;
            jAbs = j6;
            i = 0;
        }
    }

    public static List<vw8> g(List<HearingHealthStat> list) {
        ArrayList arrayList = new ArrayList();
        for (HearingHealthStat hearingHealthStat : list) {
            vw8 vw8Var = new vw8();
            vw8Var.f(v05.a(hearingHealthStat.getDate()));
            vw8Var.i(hearingHealthStat.getAverageValue());
            vw8Var.j(hearingHealthStat.getTotalDuration());
            vw8Var.e((int) hearingHealthStat.getMinValue());
            vw8Var.d((int) hearingHealthStat.getMaxValue());
            arrayList.add(vw8Var);
        }
        return arrayList;
    }

    public static List<SportHealthData> h(List<Volume> list) {
        ArrayList arrayList = new ArrayList();
        for (Volume volume : list) {
            HearingHealth hearingHealth = new HearingHealth();
            hearingHealth.setSsoid(i());
            hearingHealth.setDeviceUniqueId(ilj.e());
            hearingHealth.setDataCreatedTimestamp(volume.getTimestamp());
            hearingHealth.setDisplay(1);
            hearingHealth.setSyncStatus(0);
            hearingHealth.setDbValue(volume.getVolume());
            hearingHealth.setDuration(volume.getDuration());
            arrayList.add(hearingHealth);
        }
        return arrayList;
    }

    public static String i() {
        return v9g.w().D("user_ssoid");
    }

    public static List<HearingHealthStat> j(List<HearingHealthStat> list, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        int i = 0;
        while (true) {
            long j4 = i;
            if (j4 >= jAbs) {
                break;
            }
            HearingHealthStat hearingHealthStat = new HearingHealthStat();
            hearingHealthStat.setDate(v05.i(localDateTimeAtStartOfDay.plusDays(j4).withHour(0).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
            arrayList.add(hearingHealthStat);
            i++;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (int i3 = 0; i3 < jAbs; i3++) {
                if (list.get(i2).getDate() == ((HearingHealthStat) arrayList.get(i3)).getDate()) {
                    arrayList.set(i3, list.get(i2));
                }
            }
        }
        return arrayList;
    }

    public static List<vw8> k(List<vw8> list, long j2, long j3, HearingChart hearingChart) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = hearingChart == HearingChart.YEAR ? (int) (Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)) + 1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < totalMonths; i++) {
            vw8 vw8Var = new vw8();
            vw8Var.f(hearingChart == HearingChart.YEAR ? localDateTimeAtStartOfDay.plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            arrayList.add(vw8Var);
        }
        for (vw8 vw8Var2 : list) {
            LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(vw8Var2.c()), ZoneId.systemDefault());
            arrayList.set((int) (hearingChart == HearingChart.YEAR ? Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant2.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)), vw8Var2);
        }
        a7b.f(b04.TAG, "insertEmptyData end, size = " + arrayList.size());
        return arrayList;
    }
}
