package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.heytap.databaseengine.model.bloodPressure.BloodPressure;
import com.heytap.databaseengine.model.bloodPressure.BloodPressureStat;
import com.heytap.health.bloodpressure.R$color;
import com.heytap.health.bloodpressure.R$string;
import com.heytap.health.bloodpressure.bean.BloodPressureBean;
import com.heytap.health.bloodpressure.bean.BloodPressureDayBean;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class xp1 {
    public static final long CHART_START_TIME = 1546272000000L;
    public static final int CHART_TYPE_DAY = 0;
    public static final int CHART_TYPE_MONTH = 2;
    public static final int CHART_TYPE_WEEK = 1;
    public static final int CHART_TYPE_YEAR = 3;
    public static final String Health_Research_H5 = "https://health-researchkit-cn.heytapmobi.com/hypertenSionriskAssess/recruitment?from=healthApp";

    public static float[] a(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            return new float[0];
        }
        float f = 0.0f;
        for (int i2 : iArr) {
            f += i2;
        }
        float fPow = (float) Math.pow(10.0d, i);
        int length = iArr.length;
        float[] fArr = new float[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            fArr[i3] = (iArr[i3] / f) * fPow * 100.0f;
        }
        float f2 = 100.0f * fPow;
        int length2 = iArr.length;
        float[] fArr2 = new float[length2];
        for (int i4 = 0; i4 < length; i4++) {
            fArr2[i4] = (float) Math.floor(fArr[i4]);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < length2; i6++) {
            i5 = (int) (i5 + fArr2[i6]);
        }
        int length3 = iArr.length;
        float[] fArr3 = new float[length3];
        for (int i7 = 0; i7 < length2; i7++) {
            fArr3[i7] = fArr[i7] - fArr2[i7];
        }
        while (i5 < f2) {
            int i8 = 0;
            float f3 = 0.0f;
            for (int i9 = 0; i9 < length3; i9++) {
                float f4 = fArr3[i9];
                if (f4 > f3) {
                    i8 = i9;
                    f3 = f4;
                }
            }
            fArr2[i8] = fArr2[i8] + 1.0f;
            fArr3[i8] = 0.0f;
            i5++;
        }
        float[] fArr4 = new float[iArr.length];
        for (int i10 = 0; i10 < length2; i10++) {
            fArr4[i10] = fArr2[i10] / fPow;
        }
        return fArr4;
    }

    public static List<BloodPressureDayBean> b(long j2, long j3, List<BloodPressureStat> list, List<BloodPressureStat> list2, List<BloodPressure> list3) {
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            long j4 = i;
            if (j4 >= jAbs) {
                lq0.c("BloodPressureHelper", "convertDayBeanList end, size = " + arrayList.size());
                return arrayList;
            }
            BloodPressureDayBean bloodPressureDayBean = new BloodPressureDayBean();
            long epochMilli = localDateTimeAtStartOfDay.plusDays(j4).with((TemporalAdjuster) LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long epochMilli2 = localDateTimeAtStartOfDay.plusDays(j4).with((TemporalAdjuster) LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            bloodPressureDayBean.insertUndueDataList(epochMilli, epochMilli2);
            bloodPressureDayBean.setStartTime(epochMilli);
            bloodPressureDayBean.setEndTime(epochMilli2);
            bloodPressureDayBean.setDayStatData(list2.get(i));
            ArrayList<BloodPressureStat> arrayList2 = new ArrayList();
            int i2 = 0;
            while (i2 < list.size()) {
                BloodPressureStat bloodPressureStat = list.get(i2);
                LocalDateTime localDateTime = localDateTimeAtStartOfDay;
                long j5 = jAbs;
                long date = ((long) bloodPressureStat.getDate()) * 1000;
                if (date >= epochMilli && date <= epochMilli2) {
                    arrayList2.add(bloodPressureStat);
                }
                i2++;
                localDateTimeAtStartOfDay = localDateTime;
                jAbs = j5;
            }
            LocalDateTime localDateTime2 = localDateTimeAtStartOfDay;
            long j6 = jAbs;
            ArrayList arrayList3 = new ArrayList();
            for (BloodPressure bloodPressure : list3) {
                if (bloodPressure.getMeasureTimestamp() >= bloodPressureDayBean.getStartTime() && bloodPressure.getMeasureTimestamp() <= bloodPressureDayBean.getEndTime()) {
                    arrayList3.add(bloodPressure);
                }
            }
            bloodPressureDayBean.setRecordList(arrayList3);
            list3.removeAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (BloodPressureStat bloodPressureStat2 : arrayList2) {
                if (bloodPressureStat2.getMaxSystolic() > 0) {
                    fo1 fo1Var = new fo1();
                    fo1Var.f(((long) bloodPressureStat2.getDate()) * 1000);
                    fo1Var.l(0);
                    fo1Var.e(bloodPressureStat2.getMinSystolic());
                    fo1Var.d(bloodPressureStat2.getMaxSystolic());
                    fo1Var.j(bloodPressureStat2.getMaxDiastolic());
                    fo1Var.k(bloodPressureStat2.getMinDiastolic());
                    arrayList4.add(fo1Var);
                    fo1 fo1Var2 = new fo1();
                    fo1Var2.f(((long) bloodPressureStat2.getDate()) * 1000);
                    fo1Var2.l(1);
                    fo1Var2.e(bloodPressureStat2.getMinDiastolic());
                    fo1Var2.d(bloodPressureStat2.getMaxDiastolic());
                    fo1Var2.j(bloodPressureStat2.getMaxSystolic());
                    fo1Var2.k(bloodPressureStat2.getMinSystolic());
                    arrayList5.add(fo1Var2);
                }
            }
            if (arrayList4.isEmpty() || arrayList5.isEmpty()) {
                arrayList4.add(new fo1(j2, 0, 0, 0, 0));
                arrayList4.add(new fo1(j3, 0, 0, 0, 0));
                arrayList5.add(new fo1(j2, 0, 0, 0, 0));
                arrayList5.add(new fo1(j3, 0, 0, 0, 0));
            }
            bloodPressureDayBean.setSystolicDataList(arrayList4);
            bloodPressureDayBean.setDiastolicDataList(arrayList5);
            arrayList.add(bloodPressureDayBean);
            i++;
            localDateTimeAtStartOfDay = localDateTime2;
            jAbs = j6;
        }
    }

    public static BloodPressureBean c(List<BloodPressureStat> list, long j2, long j3, int i) {
        long j4;
        boolean z;
        long epochMilli;
        BloodPressureBean bloodPressureBean = new BloodPressureBean();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BloodPressureStat bloodPressureStat : list) {
            fo1 fo1Var = new fo1();
            fo1Var.l(0);
            fo1Var.d(bloodPressureStat.getMaxSystolic());
            fo1Var.e(bloodPressureStat.getMinSystolic());
            fo1Var.j(bloodPressureStat.getMaxDiastolic());
            fo1Var.k(bloodPressureStat.getMinDiastolic());
            fo1Var.f(v05.a(bloodPressureStat.getDate()));
            fo1 fo1Var2 = new fo1();
            fo1Var2.l(1);
            fo1Var2.d(bloodPressureStat.getMaxDiastolic());
            fo1Var2.e(bloodPressureStat.getMinDiastolic());
            fo1Var2.k(bloodPressureStat.getMinSystolic());
            fo1Var2.j(bloodPressureStat.getMaxSystolic());
            fo1Var2.f(v05.a(bloodPressureStat.getDate()));
            arrayList.add(fo1Var);
            arrayList2.add(fo1Var2);
        }
        if (list.size() > 0) {
            long jA = v05.a(list.get(0).getDate());
            if (i == 1) {
                epochMilli = jA < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jA), ZoneId.systemDefault()).toLocalDate().with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : j2;
                lq0.c("BloodPressureHelper", "week fill data startTime:" + x05.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            } else if (i == 2) {
                epochMilli = jA < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jA), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : j2;
                lq0.c("BloodPressureHelper", "month fill data startTime:" + x05.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            } else {
                epochMilli = jA < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jA), ZoneId.systemDefault()).with(TemporalAdjusters.firstDayOfYear()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : j2;
                lq0.c("BloodPressureHelper", "year fill data startTime:" + x05.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            }
            z = false;
            j4 = epochMilli;
        } else {
            fo1 fo1Var3 = new fo1();
            fo1Var3.f(j3);
            fo1Var3.d(0);
            fo1Var3.e(0);
            arrayList.add(fo1Var3);
            arrayList2.add(fo1Var3);
            j4 = j2;
            z = true;
        }
        int i2 = i == 3 ? 2 : 1;
        List<fo1> listF = f(j4, j3, arrayList, i2);
        List<fo1> listF2 = f(j4, j3, arrayList2, i2);
        bloodPressureBean.setSystolicDataList(listF);
        bloodPressureBean.setDiastolicDataList(listF2);
        bloodPressureBean.setChartStartTime(1546272000000L);
        bloodPressureBean.setShowEmptyChart(z);
        return bloodPressureBean;
    }

    public static int[] d(int i, int i2) {
        if (i >= 180 || i2 >= 110) {
            return new int[]{5, R$color.health_blood_pressure_severe_color, R$string.health_blood_pressure_value_severe};
        }
        if (i >= 160 || i2 >= 100) {
            return new int[]{4, R$color.health_blood_pressure_moderate_color, R$string.health_blood_pressure_value_moderate};
        }
        if (i >= 140 || i2 >= 90) {
            return new int[]{3, R$color.health_blood_pressure_mild_color, R$string.health_blood_pressure_value_mild};
        }
        if (i >= 120 || i2 >= 80) {
            return new int[]{2, R$color.health_blood_pressure_high_normal_color, R$string.health_blood_pressure_high_normal};
        }
        return (i >= 120 || i2 >= 80) ? new int[]{0, com.heytap.health.health_base.R$color.health_base_A000000, R$string.health_blood_pressure_null} : new int[]{1, R$color.health_blood_pressure_normal_color, R$string.health_blood_pressure_value_nomal};
    }

    public static Drawable e(Context context) {
        float fA = ejg.a(context, 3.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fA, fA, fA, fA, fA, fA, fA, fA}, null, null));
        Rect rect = new Rect(0, 0, ejg.a(context, 26.0f), ejg.a(context, 14.0f));
        int iA = ejg.a(context, 3.0f);
        shapeDrawable.setPadding(iA, 0, iA, 0);
        shapeDrawable.setBounds(rect);
        return shapeDrawable;
    }

    public static List<fo1> f(long j2, long j3, List<fo1> list, int i) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = i == 2 ? (int) (Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)) + 1;
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i2 = 0; i2 < totalMonths; i2++) {
            fo1 fo1Var = new fo1();
            fo1Var.e(0);
            fo1Var.d(0);
            fo1Var.f(i == 2 ? localDateTimeAtStartOfDay.plusMonths(i2).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i2).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            arrayList.add(fo1Var);
        }
        for (fo1 fo1Var2 : list) {
            LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(fo1Var2.c()), ZoneId.systemDefault());
            arrayList.set((int) (i == 2 ? Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant2.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / 86400000)), fo1Var2);
        }
        lq0.c("BloodPressureHelper", "insertEmptyData end, size = " + arrayList.size());
        return arrayList;
    }

    public static List<BloodPressureStat> g(List<BloodPressureStat> list, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        int i = 0;
        while (true) {
            long j4 = i;
            if (j4 >= jAbs) {
                break;
            }
            BloodPressureStat bloodPressureStat = new BloodPressureStat();
            bloodPressureStat.setDate(v05.i(localDateTimeAtStartOfDay.plusDays(j4).withHour(0).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
            arrayList.add(bloodPressureStat);
            i++;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (int i3 = 0; i3 < jAbs; i3++) {
                if (list.get(i2).getDate() == ((BloodPressureStat) arrayList.get(i3)).getDate()) {
                    arrayList.set(i3, list.get(i2));
                }
            }
        }
        return arrayList;
    }
}
