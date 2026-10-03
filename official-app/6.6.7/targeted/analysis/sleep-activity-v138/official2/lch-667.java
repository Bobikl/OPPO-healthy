package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.sleep.bean.SleepDayBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J2\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H\u0002J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J8\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/lch;", "", "", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDayList", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "spo2List", "Lcom/heytap/databaseengine/model/HeartRate;", "heartRateList", "Lcom/oplus/aiunit/vision/ich;", "c", "sleepDayData", "Ljava/util/ArrayList;", "Lcom/oplus/aiunit/vision/ich$a;", c7n.f, "Lcom/heytap/health/core/widget/charts/data/SleepUnitData;", "sleepUnitDataList", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "spo2TimeStampedDataList", "hrTimeStampedDataList", "", "f", "sleepIntervalTimeList", c7n.g, "d", "<init>", "()V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepAssembleTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAssembleTransform.kt\ncom/heytap/health/sleep/day/model/SleepAssembleTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1855#2,2:240\n*S KotlinDebug\n*F\n+ 1 SleepAssembleTransform.kt\ncom/heytap/health/sleep/day/model/SleepAssembleTransform\n*L\n120#1:240,2\n*E\n"})
public final class lch {
    public static final int $stable = 0;

    public static final int e(TimeStampedData timeStampedData, TimeStampedData timeStampedData2) {
        long timestamp = timeStampedData.getTimestamp() - timeStampedData2.getTimestamp();
        if (timestamp > 0) {
            return 1;
        }
        return timestamp < 0 ? -1 : 0;
    }

    public static final int i(TimeStampedData timeStampedData, TimeStampedData timeStampedData2) {
        long timestamp = timeStampedData.getTimestamp() - timeStampedData2.getTimestamp();
        if (timestamp > 0) {
            return 1;
        }
        return timestamp < 0 ? -1 : 0;
    }

    @NotNull
    public final ich c(@NotNull List<SleepDayBean> sleepDayList, @NotNull List<? extends BloodOxygenSaturation> spo2List, @NotNull List<? extends HeartRate> heartRateList) {
        Intrinsics.checkNotNullParameter(sleepDayList, "sleepDayList");
        Intrinsics.checkNotNullParameter(spo2List, "spo2List");
        Intrinsics.checkNotNullParameter(heartRateList, "heartRateList");
        ich ichVar = new ich();
        if (sleepDayList.isEmpty()) {
            return ichVar;
        }
        SleepDayBean sleepDayBean = sleepDayList.get(0);
        ichVar.f(sleepDayBean);
        List<SleepUnitData> sleepUnitDataList = sleepDayBean.getSleepUnitDataList();
        if (w0b.a(sleepUnitDataList)) {
            return ichVar;
        }
        ichVar.b().clear();
        ichVar.b().addAll(sleepUnitDataList);
        ArrayList<ich.SleepIntervalTimeBean> arrayListG = g(sleepDayBean);
        ichVar.d().clear();
        ichVar.d().addAll(arrayListG);
        ichVar.e().clear();
        ichVar.e().addAll(h(spo2List, arrayListG));
        ichVar.a().clear();
        ichVar.a().addAll(d(heartRateList, sleepUnitDataList, arrayListG));
        f(ichVar.b(), ichVar.e(), ichVar.a());
        return ichVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    public final ArrayList<TimeStampedData> d(List<? extends HeartRate> heartRateList, List<? extends SleepUnitData> sleepUnitDataList, ArrayList<ich.SleepIntervalTimeBean> sleepIntervalTimeList) {
        boolean z;
        m8b.f("SleepAssembleTransform", "transformHeartRate start:" + heartRateList.size());
        ArrayList<TimeStampedData> arrayList = new ArrayList<>();
        boolean z2 = false;
        long timestamp = sleepUnitDataList.get(0).getTimestamp();
        long timestamp2 = sleepUnitDataList.get(sleepUnitDataList.size() - 1).getTimestamp() + sleepUnitDataList.get(sleepUnitDataList.size() - 1).getDuration();
        long timestamp3 = 0;
        for (HeartRate heartRate : heartRateList) {
            if (heartRate.getDataCreatedTimestamp() >= timestamp && heartRate.getDataCreatedTimestamp() <= timestamp2 && heartRate.getHeartRateType() != 1 && heartRate.getHeartRateType() != 4 && heartRate.getHeartRateType() != 5) {
                Iterator<ich.SleepIntervalTimeBean> it = sleepIntervalTimeList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    ich.SleepIntervalTimeBean next = it.next();
                    if (heartRate.getDataCreatedTimestamp() > next.getStartTime() && heartRate.getDataCreatedTimestamp() < next.getEndTime()) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    TimeStampedData timeStampedData = new TimeStampedData();
                    timeStampedData.setTimestamp(heartRate.getDataCreatedTimestamp());
                    timeStampedData.setY(heartRate.getHeartRateValue());
                    if (timestamp3 <= 0 || timeStampedData.getTimestamp() - timestamp3 >= k39.INTERVAL_TIME) {
                        timeStampedData.setDisconnect(true);
                    }
                    arrayList.add(timeStampedData);
                    timestamp3 = timeStampedData.getTimestamp();
                }
            }
            timestamp = timestamp;
            z2 = false;
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.kch
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lch.e((TimeStampedData) obj, (TimeStampedData) obj2);
            }
        });
        m8b.f("SleepAssembleTransform", "transformHeartRate result:" + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    public final void f(List<? extends SleepUnitData> sleepUnitDataList, List<? extends TimeStampedData> spo2TimeStampedDataList, List<? extends TimeStampedData> hrTimeStampedDataList) {
        for (SleepUnitData sleepUnitData : sleepUnitDataList) {
            if (sleepUnitData.getDuration() > 0) {
                long timestamp = sleepUnitData.getTimestamp();
                long timestamp2 = sleepUnitData.getTimestamp() + sleepUnitData.getDuration();
                Iterator<? extends TimeStampedData> it = spo2TimeStampedDataList.iterator();
                float y = 0.0f;
                float y2 = 0.0f;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TimeStampedData next = it.next();
                    long timestamp3 = next.getTimestamp();
                    if (timestamp <= timestamp3 && timestamp3 <= timestamp2) {
                        if (y > next.getY()) {
                            y = next.getY();
                        } else if (y == 0.0f) {
                            y = next.getY();
                        }
                        if (y2 < next.getY()) {
                            y2 = next.getY();
                        }
                    }
                }
                sleepUnitData.setSpo2LowY(y);
                sleepUnitData.setSpo2HeightY(y2);
                float y3 = 0.0f;
                float y4 = 0.0f;
                for (TimeStampedData timeStampedData : hrTimeStampedDataList) {
                    long timestamp4 = timeStampedData.getTimestamp();
                    if (timestamp <= timestamp4 && timestamp4 <= timestamp2) {
                        if (y3 > timeStampedData.getY()) {
                            y3 = timeStampedData.getY();
                        } else if (y3 == 0.0f) {
                            y3 = timeStampedData.getY();
                        }
                        if (y4 < timeStampedData.getY()) {
                            y4 = timeStampedData.getY();
                        }
                    }
                }
                sleepUnitData.setHeartRateLowY(y3);
                sleepUnitData.setHeartRateHeightY(y4);
            }
        }
    }

    public final ArrayList<ich.SleepIntervalTimeBean> g(SleepDayBean sleepDayData) {
        ArrayList<ich.SleepIntervalTimeBean> arrayList = new ArrayList<>();
        List<zkh> sleepFrgBeanList = sleepDayData.getSleepFrgBeanList();
        if (sleepFrgBeanList.size() < 2) {
            return arrayList;
        }
        zkh zkhVar = sleepFrgBeanList.get(0);
        int size = sleepFrgBeanList.size();
        int i = 1;
        while (i < size) {
            zkh zkhVar2 = sleepFrgBeanList.get(i);
            ich.SleepIntervalTimeBean sleepIntervalTimeBean = new ich.SleepIntervalTimeBean(zkhVar.d(), zkhVar2.j());
            m8b.f("SleepAssembleTransform", "sleepIntervalTime:" + o15.s(sleepIntervalTimeBean.getStartTime(), "yyy-MMM-dd HH:mm") + "/end: " + o15.s(sleepIntervalTimeBean.getEndTime(), "yyy-MMM-dd HH:mm"));
            arrayList.add(sleepIntervalTimeBean);
            i++;
            zkhVar = zkhVar2;
        }
        return arrayList;
    }

    public final ArrayList<TimeStampedData> h(List<? extends BloodOxygenSaturation> spo2List, ArrayList<ich.SleepIntervalTimeBean> sleepIntervalTimeList) {
        boolean z;
        ArrayList<TimeStampedData> arrayList = new ArrayList<>();
        TimeStampedData timeStampedData = null;
        for (BloodOxygenSaturation bloodOxygenSaturation : spo2List) {
            Iterator<ich.SleepIntervalTimeBean> it = sleepIntervalTimeList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ich.SleepIntervalTimeBean next = it.next();
                if (bloodOxygenSaturation.getDataCreatedTimestamp() > next.getStartTime() && bloodOxygenSaturation.getDataCreatedTimestamp() < next.getEndTime()) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                TimeStampedData timeStampedData2 = new TimeStampedData();
                timeStampedData2.setTimestamp(bloodOxygenSaturation.getDataCreatedTimestamp());
                timeStampedData2.setY(bloodOxygenSaturation.getBloodOxygenSaturationValue());
                arrayList.add(timeStampedData2);
                if (timeStampedData != null) {
                    long timestamp = timeStampedData2.getTimestamp() - timeStampedData.getTimestamp();
                    if (timestamp > 1440000 && timestamp <= 7200000) {
                        timeStampedData2.setBloodOxDottedFlag(true);
                        timeStampedData.setBloodOxDottedFlag(true);
                    }
                }
                timeStampedData = timeStampedData2;
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.jch
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lch.i((TimeStampedData) obj, (TimeStampedData) obj2);
            }
        });
        return arrayList;
    }
}