package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.Spo2Warning;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0002¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/w8i;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "bloodDataList", "Lcom/heytap/databaseengine/model/Spo2Warning;", "spo2WarningList", "", "warnCount", "Lcom/oplus/aiunit/vision/qk1;", "b", "spo2List", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "d", "dayBean", "", "f", "itemDayData", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpo2Transform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2Transform.kt\ncom/heytap/health/bloodoxygen/model/Spo2Transform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1855#2,2:197\n*S KotlinDebug\n*F\n+ 1 Spo2Transform.kt\ncom/heytap/health/bloodoxygen/model/Spo2Transform\n*L\n108#1:197,2\n*E\n"})
public final class w8i {
    public static final int c(TimeStampedData o1, TimeStampedData o2) {
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return Intrinsics.compare(o2.getTimestamp(), o1.getTimestamp());
    }

    @NotNull
    public final List<qk1> b(long startTime, long endTime, @NotNull List<? extends BloodOxygenSaturation> bloodDataList, @NotNull List<? extends Spo2Warning> spo2WarningList, int warnCount) {
        List<TimeStampedData> list;
        LocalDateTime localDateTime;
        Intrinsics.checkNotNullParameter(bloodDataList, "bloodDataList");
        Intrinsics.checkNotNullParameter(spo2WarningList, "spo2WarningList");
        a7b.f("Spo2Transform", "buildSpo2DataList:" + bloodDataList.size() + "/" + spo2WarningList.size());
        List<TimeStampedData> listD = d(bloodDataList);
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), ZoneId.systemDefault()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        while (j2 < jAbs) {
            qk1 qk1Var = new qk1();
            long j3 = j2 + 1;
            long j4 = jAbs;
            long epochMilli = LocalDateTime.of(localDateTimeAtStartOfDay.plusDays(j3).toLocalDate(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long epochMilli2 = LocalDateTime.of(localDateTimeAtStartOfDay.plusDays(j2 + ((long) 2)).toLocalDate(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            qk1Var.insertUndueDataList(epochMilli, epochMilli2);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                if (i >= listD.size()) {
                    list = listD;
                    localDateTime = localDateTimeAtStartOfDay;
                    break;
                }
                TimeStampedData timeStampedData = listD.get(i);
                long timestamp = timeStampedData.getTimestamp();
                if (!(epochMilli <= timestamp && timestamp < epochMilli2)) {
                    list = listD;
                    localDateTime = localDateTimeAtStartOfDay;
                    if (timeStampedData.getTimestamp() >= epochMilli2) {
                        break;
                    }
                } else {
                    arrayList2.add(timeStampedData);
                    list = listD;
                    localDateTime = localDateTimeAtStartOfDay;
                    if (timeStampedData.getHeartRateType() == 3) {
                        arrayList3.add(timeStampedData);
                    }
                }
                i++;
                listD = list;
                localDateTimeAtStartOfDay = localDateTime;
            }
            if (arrayList2.isEmpty()) {
                e(qk1Var);
            } else {
                f(qk1Var, arrayList2);
            }
            Collections.sort(arrayList3, new Comparator() { // from class: com.oplus.aiunit.vision.v8i
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return w8i.c((TimeStampedData) obj, (TimeStampedData) obj2);
                }
            });
            if (arrayList3.size() > 50) {
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                for (int i4 = 50; i3 < i4; i4 = 50) {
                    Object obj = arrayList3.get(i3);
                    Intrinsics.checkNotNullExpressionValue(obj, "spo2MeasureList[m]");
                    arrayList4.add((TimeStampedData) obj);
                    i3++;
                }
                qk1Var.o(arrayList4);
            } else {
                qk1Var.o(arrayList3);
            }
            ArrayList arrayList5 = new ArrayList();
            if (!spo2WarningList.isEmpty()) {
                while (i2 < spo2WarningList.size()) {
                    Spo2Warning spo2Warning = spo2WarningList.get(i2);
                    if (spo2Warning.getStartTimestamp() < epochMilli || spo2Warning.getEndTimestamp() >= epochMilli2) {
                        if (spo2Warning.getEndTimestamp() > epochMilli2) {
                            break;
                        }
                    } else {
                        arrayList5.add(spo2Warning);
                    }
                    i2++;
                }
            }
            qk1Var.p(new Spo2WarnBean(warnCount, arrayList5));
            BloodOxygenSaturation bloodOxygenSaturation = null;
            long dataCreatedTimestamp = 0;
            for (BloodOxygenSaturation bloodOxygenSaturation2 : bloodDataList) {
                long dataCreatedTimestamp2 = bloodOxygenSaturation2.getDataCreatedTimestamp();
                if ((epochMilli <= dataCreatedTimestamp2 && dataCreatedTimestamp2 < epochMilli2) && bloodOxygenSaturation2.getDataCreatedTimestamp() > dataCreatedTimestamp) {
                    dataCreatedTimestamp = bloodOxygenSaturation2.getDataCreatedTimestamp();
                    bloodOxygenSaturation = bloodOxygenSaturation2;
                }
                bloodOxygenSaturation2.getDataCreatedTimestamp();
            }
            qk1Var.l(bloodOxygenSaturation);
            arrayList.add(qk1Var);
            jAbs = j4;
            j2 = j3;
            listD = list;
            localDateTimeAtStartOfDay = localDateTime;
        }
        return arrayList;
    }

    public final List<TimeStampedData> d(List<? extends BloodOxygenSaturation> spo2List) {
        ArrayList arrayList = new ArrayList();
        for (BloodOxygenSaturation bloodOxygenSaturation : spo2List) {
            TimeStampedData timeStampedData = new TimeStampedData();
            timeStampedData.setTimestamp(bloodOxygenSaturation.getDataCreatedTimestamp());
            timeStampedData.setY(bloodOxygenSaturation.getBloodOxygenSaturationValue());
            timeStampedData.setHeartRateType(bloodOxygenSaturation.getBloodOxygenSaturationType());
            arrayList.add(timeStampedData);
        }
        return arrayList;
    }

    public final void e(qk1 itemDayData) {
        itemDayData.a().clear();
        itemDayData.a().add(new b49(itemDayData.d(), 0, 0));
        itemDayData.a().add(new b49(itemDayData.c(), 0, 0));
    }

    public final void f(qk1 dayBean, List<? extends TimeStampedData> spo2List) {
        long jB = dayBean.b();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (jB < dayBean.getChartEndTime()) {
            long j2 = 3600000 + jB;
            int y = 0;
            int y2 = 0;
            while (i3 < spo2List.size()) {
                TimeStampedData timeStampedData = spo2List.get(i3);
                long timestamp = timeStampedData.getTimestamp();
                if (jB <= timestamp && timestamp < j2) {
                    if (timeStampedData.getY() < y || y == 0) {
                        y = (int) timeStampedData.getY();
                    }
                    if (timeStampedData.getY() > y2) {
                        y2 = (int) timeStampedData.getY();
                    }
                }
                if (timeStampedData.getTimestamp() >= j2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (y > 0 && y2 > 0) {
                arrayList.add(new b49(jB, y, y2));
                if (y2 > i) {
                    i = y2;
                }
                if (y < i2 || i2 == 0) {
                    i2 = y;
                }
            }
            jB = j2;
        }
        dayBean.m(i);
        dayBean.n(i2);
        dayBean.k(arrayList);
    }
}
