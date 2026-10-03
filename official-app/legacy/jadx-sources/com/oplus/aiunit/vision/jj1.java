package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJH\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u0002J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fH\u0002¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/jj1;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "bloodSugarList", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarWarning;", "bloodSugarWarningList", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "bloodSugarStatList", "Lcom/oplus/aiunit/vision/s78;", "a", "c", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "b", "dayBean", "lineDataList", "", MapSchema.FIELD_NAME_ENTRY, "chartStartTime", "chartEndTime", "itemDayData", "d", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class jj1 {
    @NotNull
    public final List<GluDayBean> a(long startTime, long endTime, @NotNull List<? extends BloodSugar> bloodSugarList, @NotNull List<BloodSugarWarning> bloodSugarWarningList, @Nullable List<BloodSugarStat> bloodSugarStatList) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
        Intrinsics.checkNotNullParameter(bloodSugarWarningList, "bloodSugarWarningList");
        List<TimeStampedData> listB = b(bloodSugarList);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), mq8Var.d()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay());
        ArrayList arrayList = new ArrayList();
        if (0 <= jAbs) {
            long j2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                GluDayBean gluDayBean = new GluDayBean();
                LocalDateTime localDateTimeOf = LocalDateTime.of(localDateTimeAtStartOfDay.plusDays(j2).toLocalDate(), LocalTime.MIN);
                mq8 mq8Var2 = mq8.INSTANCE;
                int i5 = i4;
                long epochMilli = localDateTimeOf.atZone(mq8Var2.d()).toInstant().toEpochMilli();
                long j3 = jAbs;
                long j4 = j2 + 1;
                int i6 = i3;
                long j5 = j2;
                long epochMilli2 = LocalDateTime.of(localDateTimeAtStartOfDay.plusDays(j4).toLocalDate(), LocalTime.MIN).atZone(mq8Var2.d()).toInstant().toEpochMilli();
                int iE = mq8Var2.e(epochMilli);
                if (bloodSugarStatList != 0) {
                    int size = bloodSugarStatList.size();
                    int i7 = i6;
                    while (true) {
                        if (i7 >= size) {
                            i2 = i6;
                            break;
                        }
                        int i8 = size;
                        BloodSugarStat bloodSugarStat = bloodSugarStatList.get(i7);
                        if (iE == bloodSugarStat.getDate()) {
                            gluDayBean.l(bloodSugarStat);
                            Double average = bloodSugarStat.getAverage();
                            gluDayBean.k(average != null ? average.doubleValue() : 0.0d);
                            i2 = i7;
                            break;
                        }
                        i7++;
                        bloodSugarStatList = bloodSugarStatList;
                        size = i8;
                    }
                    i = i2;
                } else {
                    i = i6;
                }
                for (BloodSugarWarning bloodSugarWarning : bloodSugarWarningList) {
                    long timestamp = bloodSugarWarning.getTimestamp();
                    if (!(epochMilli <= timestamp && timestamp < epochMilli2)) {
                        if (bloodSugarWarning.getTimestamp() < epochMilli) {
                            break;
                        }
                    } else {
                        gluDayBean.c().add(bloodSugarWarning);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int i9 = i5;
                while (i9 < listB.size()) {
                    TimeStampedData timeStampedData = listB.get(i9);
                    long timestamp2 = timeStampedData.getTimestamp();
                    if (!(epochMilli <= timestamp2 && timestamp2 < epochMilli2)) {
                        if (timeStampedData.getTimestamp() >= epochMilli2) {
                            break;
                        }
                    } else {
                        arrayList2.add(timeStampedData);
                    }
                    i9++;
                }
                if (arrayList2.isEmpty()) {
                    d(epochMilli, epochMilli2, gluDayBean);
                } else {
                    gluDayBean.n(epochMilli);
                    gluDayBean.m(epochMilli2);
                    gluDayBean.g().clear();
                    gluDayBean.g().addAll(arrayList2);
                    gluDayBean.q(false);
                    e(gluDayBean, arrayList2);
                }
                arrayList.add(gluDayBean);
                if (j5 == j3) {
                    break;
                }
                i3 = i;
                i4 = i9;
                j2 = j4;
                jAbs = j3;
            }
        }
        return arrayList;
    }

    public final List<TimeStampedData> b(List<? extends BloodSugar> bloodSugarList) {
        ArrayList arrayList = new ArrayList();
        for (BloodSugar bloodSugar : bloodSugarList) {
            Double value = bloodSugar.getValue();
            if (value != null) {
                double dDoubleValue = value.doubleValue();
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(bloodSugar.getDataCreatedTimestamp());
                timeStampedData.setY((float) dDoubleValue);
                timeStampedData.setHeartRateType(bloodSugar.getType());
                arrayList.add(timeStampedData);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<GluDayBean> c() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d()).toLocalDate().atStartOfDay();
        long epochMilli = localDateTimeAtStartOfDay.atZone(mq8Var.d()).toInstant().toEpochMilli();
        long epochMilli2 = LocalDateTime.of(localDateTimeAtStartOfDay.plusDays(1L).toLocalDate(), LocalTime.MIN).atZone(mq8Var.d()).toInstant().toEpochMilli();
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(epochMilli);
        timeStampedData.setY(-10.0f);
        TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(epochMilli, -10.0f, -10.0f);
        ArrayList arrayList = new ArrayList();
        GluDayBean gluDayBean = new GluDayBean();
        gluDayBean.g().add(timeStampedData);
        gluDayBean.d().add(timeStampedCandleData);
        gluDayBean.n(epochMilli);
        gluDayBean.m(epochMilli2);
        arrayList.add(gluDayBean);
        return arrayList;
    }

    public final void d(long chartStartTime, long chartEndTime, GluDayBean itemDayData) {
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(chartStartTime);
        timeStampedData.setY(-10.0f);
        TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(chartStartTime, -10.0f, -10.0f);
        itemDayData.g().clear();
        itemDayData.d().clear();
        itemDayData.g().add(timeStampedData);
        itemDayData.d().add(timeStampedCandleData);
        itemDayData.k(0.0d);
        itemDayData.n(chartStartTime);
        itemDayData.m(chartEndTime);
        itemDayData.q(true);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    public final void e(GluDayBean dayBean, List<? extends TimeStampedData> lineDataList) {
        long chartStartTime = dayBean.getChartStartTime();
        List<BloodSugarWarning> listC = dayBean.c();
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        while (chartStartTime < dayBean.getChartEndTime()) {
            long j2 = ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL + chartStartTime;
            float y = 0.0f;
            float y2 = 0.0f;
            while (i < lineDataList.size()) {
                TimeStampedData timeStampedData = lineDataList.get(i);
                long timestamp = timeStampedData.getTimestamp();
                if (chartStartTime <= timestamp && timestamp < j2) {
                    if (timeStampedData.getY() < y) {
                        y = timeStampedData.getY();
                    } else if (y == 0.0f) {
                        y = timeStampedData.getY();
                    }
                    if (timeStampedData.getY() > y2) {
                        y2 = timeStampedData.getY();
                    }
                }
                if (timeStampedData.getTimestamp() >= j2) {
                    break;
                } else {
                    i++;
                }
            }
            int size = listC.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                long timestamp2 = listC.get(i3).getTimestamp();
                if (chartStartTime <= timestamp2 && timestamp2 < j2) {
                    i2++;
                }
            }
            if (y > 0.0f && y2 > 0.0f) {
                TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(chartStartTime, y, y2);
                if (i2 > 0) {
                    timeStampedCandleData.e(String.valueOf(i2));
                }
                arrayList.add(timeStampedCandleData);
                if (y2 > f) {
                    f = y2;
                }
                if (y < f2) {
                    f2 = y;
                } else if (f2 == 0.0f) {
                    f2 = y;
                }
            }
            chartStartTime = j2;
        }
        dayBean.o(f);
        dayBean.p(f2);
        dayBean.d().clear();
        dayBean.d().addAll(arrayList);
    }
}
