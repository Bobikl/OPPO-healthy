package com.heytap.health.sleep.measure;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.BreathRate;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.rhe;
import com.oplus.aiunit.vision.um;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0018 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\"\u0010\f\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J4\u0010\u0010\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¨\u0006!"}, d2 = {"Lcom/heytap/health/sleep/measure/PhoneStatDataParser;", "", "", "Lcom/heytap/databaseengine/model/SportHealthData;", "sleepIndexList", "Lcom/heytap/databaseengine/model/SleepIndex;", "dbSleepIndexList", "", "b", "hrAllList", "brAllList", "Lcom/oplus/aiunit/vision/rhe;", "c", "Lcom/heytap/health/sleep/measure/PhoneStatDataParser$SleepDayTime;", "sleepDayTime", "phoneDayStatBean", MapSchema.FIELD_NAME_ENTRY, "", "Lcom/heytap/databaseengine/model/HeartRate;", "dataList", "", "d", "hrList", "brList", "a", "", "startTime", "endTime", "f", "<init>", "()V", "Companion", "SleepDayTime", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneStatDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneStatDataParser.kt\ncom/heytap/health/sleep/measure/PhoneStatDataParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,262:1\n1855#2:263\n1855#2,2:264\n1856#2:266\n2634#2:267\n1855#2,2:269\n1855#2,2:271\n1855#2,2:273\n1#3:268\n215#4,2:275\n*S KotlinDebug\n*F\n+ 1 PhoneStatDataParser.kt\ncom/heytap/health/sleep/measure/PhoneStatDataParser\n*L\n39#1:263\n40#1:264,2\n39#1:266\n82#1:267\n105#1:269,2\n116#1:271,2\n159#1:273,2\n82#1:268\n170#1:275,2\n*E\n"})
public final class PhoneStatDataParser {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/sleep/measure/PhoneStatDataParser$SleepDayTime;", "", "startDayTime", "", "endDayTime", "(JJ)V", "getEndDayTime", "()J", "getStartDayTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SleepDayTime {
        public static final int $stable = 0;
        private final long endDayTime;
        private final long startDayTime;

        public SleepDayTime(long j2, long j3) {
            this.startDayTime = j2;
            this.endDayTime = j3;
        }

        public static /* synthetic */ SleepDayTime copy$default(SleepDayTime sleepDayTime, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j2 = sleepDayTime.startDayTime;
            }
            if ((i & 2) != 0) {
                j3 = sleepDayTime.endDayTime;
            }
            return sleepDayTime.copy(j2, j3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartDayTime() {
            return this.startDayTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndDayTime() {
            return this.endDayTime;
        }

        @NotNull
        public final SleepDayTime copy(long startDayTime, long endDayTime) {
            return new SleepDayTime(startDayTime, endDayTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepDayTime)) {
                return false;
            }
            SleepDayTime sleepDayTime = (SleepDayTime) other;
            return this.startDayTime == sleepDayTime.startDayTime && this.endDayTime == sleepDayTime.endDayTime;
        }

        public final long getEndDayTime() {
            return this.endDayTime;
        }

        public final long getStartDayTime() {
            return this.startDayTime;
        }

        public int hashCode() {
            return (Long.hashCode(this.startDayTime) * 31) + Long.hashCode(this.endDayTime);
        }

        @NotNull
        public String toString() {
            return "SleepDayTime(startDayTime=" + this.startDayTime + ", endDayTime=" + this.endDayTime + ")";
        }
    }

    public final List<SleepDayTime> a(List<? extends SportHealthData> hrList, List<? extends SportHealthData> brList) {
        long dataCreatedTimestamp;
        long dataCreatedTimestamp2;
        if (!hrList.isEmpty()) {
            SportHealthData sportHealthData = hrList.get(0);
            dataCreatedTimestamp = sportHealthData instanceof HeartRate ? ((HeartRate) sportHealthData).getDataCreatedTimestamp() : 0L;
            SportHealthData sportHealthData2 = hrList.get(hrList.size() - 1);
            dataCreatedTimestamp2 = sportHealthData2 instanceof HeartRate ? ((HeartRate) sportHealthData2).getDataCreatedTimestamp() : 0L;
        } else {
            dataCreatedTimestamp = 0;
            dataCreatedTimestamp2 = 0;
        }
        if (!brList.isEmpty()) {
            SportHealthData sportHealthData3 = brList.get(0);
            if (sportHealthData3 instanceof BreathRate) {
                BreathRate breathRate = (BreathRate) sportHealthData3;
                if (dataCreatedTimestamp > breathRate.getDataCreatedTimestamp() || dataCreatedTimestamp == 0) {
                    dataCreatedTimestamp = breathRate.getDataCreatedTimestamp();
                }
            }
            SportHealthData sportHealthData4 = brList.get(brList.size() - 1);
            if (sportHealthData4 instanceof BreathRate) {
                BreathRate breathRate2 = (BreathRate) sportHealthData4;
                if (dataCreatedTimestamp2 < breathRate2.getDataCreatedTimestamp()) {
                    dataCreatedTimestamp2 = breathRate2.getDataCreatedTimestamp();
                }
            }
        }
        return f(dataCreatedTimestamp, dataCreatedTimestamp2);
    }

    public final void b(@NotNull List<? extends SportHealthData> sleepIndexList, @NotNull List<? extends SleepIndex> dbSleepIndexList) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        Intrinsics.checkNotNullParameter(dbSleepIndexList, "dbSleepIndexList");
        if (sleepIndexList.isEmpty() || dbSleepIndexList.isEmpty()) {
            return;
        }
        for (SportHealthData sportHealthData : sleepIndexList) {
            for (SleepIndex sleepIndex : dbSleepIndexList) {
                if (sportHealthData instanceof SleepIndex) {
                    SleepIndex sleepIndex2 = (SleepIndex) sportHealthData;
                    if (sleepIndex2.getDataTimestamp() == sleepIndex.getDataTimestamp()) {
                        Integer sleepHeartRateRangeLow = sleepIndex.getSleepHeartRateRangeLow();
                        if (sleepHeartRateRangeLow == null) {
                            iIntValue = 255;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(sleepHeartRateRangeLow, "dbItem.sleepHeartRateRangeLow ?: 255");
                            iIntValue = sleepHeartRateRangeLow.intValue();
                        }
                        Integer sleepHeartRateRangeLow2 = sleepIndex2.getSleepHeartRateRangeLow();
                        if (sleepHeartRateRangeLow2 == null) {
                            iIntValue2 = 255;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(sleepHeartRateRangeLow2, "dataI.sleepHeartRateRangeLow ?: 255");
                            iIntValue2 = sleepHeartRateRangeLow2.intValue();
                        }
                        int iMin = Math.min(iIntValue, iIntValue2);
                        sleepIndex2.setSleepHeartRateRangeLow(iMin == 255 ? null : Integer.valueOf(iMin));
                        Integer sleepHeartRateRangeHigh = sleepIndex2.getSleepHeartRateRangeHigh();
                        if (sleepHeartRateRangeHigh == null) {
                            iIntValue3 = -1;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(sleepHeartRateRangeHigh, "dataI.sleepHeartRateRangeHigh ?: -1");
                            iIntValue3 = sleepHeartRateRangeHigh.intValue();
                        }
                        Integer sleepHeartRateRangeHigh2 = sleepIndex.getSleepHeartRateRangeHigh();
                        if (sleepHeartRateRangeHigh2 == null) {
                            iIntValue4 = -1;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(sleepHeartRateRangeHigh2, "dbItem.sleepHeartRateRangeHigh ?: -1");
                            iIntValue4 = sleepHeartRateRangeHigh2.intValue();
                        }
                        int iMax = Math.max(iIntValue3, iIntValue4);
                        sleepIndex2.setSleepHeartRateRangeHigh(iMax == -1 ? null : Integer.valueOf(iMax));
                        Integer avgSleepBreathRangeLow = sleepIndex2.getAvgSleepBreathRangeLow();
                        if (avgSleepBreathRangeLow == null) {
                            iIntValue5 = 255;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(avgSleepBreathRangeLow, "dataI.avgSleepBreathRangeLow ?: 255");
                            iIntValue5 = avgSleepBreathRangeLow.intValue();
                        }
                        Integer avgSleepBreathRangeLow2 = sleepIndex.getAvgSleepBreathRangeLow();
                        if (avgSleepBreathRangeLow2 == null) {
                            iIntValue6 = 255;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(avgSleepBreathRangeLow2, "dbItem.avgSleepBreathRangeLow ?: 255");
                            iIntValue6 = avgSleepBreathRangeLow2.intValue();
                        }
                        int iMin2 = Math.min(iIntValue5, iIntValue6);
                        sleepIndex2.setAvgSleepBreathRangeLow(iMin2 == 255 ? null : Integer.valueOf(iMin2));
                        Integer avgSleepBreathRangeHigh = sleepIndex2.getAvgSleepBreathRangeHigh();
                        if (avgSleepBreathRangeHigh == null) {
                            iIntValue7 = -1;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(avgSleepBreathRangeHigh, "dataI.avgSleepBreathRangeHigh ?: -1");
                            iIntValue7 = avgSleepBreathRangeHigh.intValue();
                        }
                        Integer avgSleepBreathRangeHigh2 = sleepIndex.getAvgSleepBreathRangeHigh();
                        if (avgSleepBreathRangeHigh2 == null) {
                            iIntValue8 = -1;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(avgSleepBreathRangeHigh2, "dbItem.avgSleepBreathRangeHigh ?: -1");
                            iIntValue8 = avgSleepBreathRangeHigh2.intValue();
                        }
                        int iMax2 = Math.max(iIntValue7, iIntValue8);
                        sleepIndex2.setAvgSleepBreathRangeHigh(iMax2 != -1 ? Integer.valueOf(iMax2) : null);
                    }
                }
            }
        }
    }

    @NotNull
    public final rhe c(@NotNull List<? extends SportHealthData> hrAllList, @NotNull List<? extends SportHealthData> brAllList) {
        Intrinsics.checkNotNullParameter(hrAllList, "hrAllList");
        Intrinsics.checkNotNullParameter(brAllList, "brAllList");
        List<SleepDayTime> listA = a(hrAllList, brAllList);
        rhe rheVar = new rhe();
        rheVar.c().addAll(listA);
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            e(hrAllList, brAllList, (SleepDayTime) it.next(), rheVar);
        }
        return rheVar;
    }

    public final int d(List<HeartRate> dataList) {
        List<HeartRate> list = dataList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = dataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int heartRateValue = ((HeartRate) it.next()).getHeartRateValue();
            if (linkedHashMap.containsKey(Integer.valueOf(heartRateValue))) {
                Integer numValueOf = Integer.valueOf(heartRateValue);
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(heartRateValue));
                linkedHashMap.put(numValueOf, Integer.valueOf(num != null ? num.intValue() : 2));
            } else {
                linkedHashMap.put(Integer.valueOf(heartRateValue), 1);
            }
        }
        int iIntValue = 0;
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(((Number) entry.getKey()).intValue() - 1));
            int iIntValue3 = iIntValue2 + (num2 != null ? num2.intValue() : 0);
            Integer num3 = (Integer) linkedHashMap.get(Integer.valueOf(((Number) entry.getKey()).intValue() - 2));
            int iIntValue4 = iIntValue3 + (num3 != null ? num3.intValue() : 0);
            Integer num4 = (Integer) linkedHashMap.get(Integer.valueOf(((Number) entry.getKey()).intValue() + 1));
            int iIntValue5 = iIntValue4 + (num4 != null ? num4.intValue() : 0);
            Integer num5 = (Integer) linkedHashMap.get(Integer.valueOf(((Number) entry.getKey()).intValue() + 2));
            int iIntValue6 = iIntValue5 + (num5 != null ? num5.intValue() : 0);
            if (iIntValue6 > i) {
                iIntValue = ((Number) entry.getKey()).intValue();
                i = iIntValue6;
            } else if (iIntValue6 == i && iIntValue > ((Number) entry.getKey()).intValue()) {
                iIntValue = ((Number) entry.getKey()).intValue();
            }
        }
        a7b.f("PhoneStatDataParser", "mAvgSleepHeartRate=" + iIntValue + " maxNum=" + i);
        return iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    public final void e(List<? extends SportHealthData> hrAllList, List<? extends SportHealthData> brAllList, SleepDayTime sleepDayTime, rhe phoneDayStatBean) {
        a7b.f("PhoneStatDataParser", "parseOneDay: start:" + sleepDayTime.getStartDayTime() + " endTime = " + sleepDayTime.getEndDayTime());
        ArrayList arrayList = new ArrayList();
        Integer value = null;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        for (SportHealthData sportHealthData : hrAllList) {
            if (sportHealthData instanceof HeartRate) {
                HeartRate heartRate = (HeartRate) sportHealthData;
                if (heartRate.getDataCreatedTimestamp() >= sleepDayTime.getStartDayTime() && heartRate.getDataCreatedTimestamp() < sleepDayTime.getEndDayTime()) {
                    if (numValueOf == null || numValueOf.intValue() > heartRate.getHeartRateValue()) {
                        numValueOf = Integer.valueOf(heartRate.getHeartRateValue());
                    }
                    if (numValueOf2 == null || numValueOf2.intValue() < heartRate.getHeartRateValue()) {
                        numValueOf2 = Integer.valueOf(heartRate.getHeartRateValue());
                    }
                    arrayList.add(sportHealthData);
                }
            }
        }
        Integer value2 = null;
        for (SportHealthData sportHealthData2 : brAllList) {
            if (sportHealthData2 instanceof BreathRate) {
                if (value != null) {
                    int iIntValue = value.intValue();
                    Integer value3 = ((BreathRate) sportHealthData2).getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "it.value");
                    if (iIntValue > value3.intValue()) {
                        value = ((BreathRate) sportHealthData2).getValue();
                    }
                } else {
                    value = ((BreathRate) sportHealthData2).getValue();
                }
                if (value2 != null) {
                    int iIntValue2 = value2.intValue();
                    Integer value4 = ((BreathRate) sportHealthData2).getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "it.value");
                    if (iIntValue2 < value4.intValue()) {
                    }
                }
                value2 = ((BreathRate) sportHealthData2).getValue();
            }
        }
        int iD = d(arrayList);
        long jC = mq8.INSTANCE.c(sleepDayTime.getEndDayTime());
        List<SportHealthData> listD = phoneDayStatBean.d();
        SleepIndex sleepIndex = new SleepIndex();
        sleepIndex.setSsoid(um.c().getSsoid());
        sleepIndex.setDeviceUniqueId(ilj.g());
        sleepIndex.setDataTimestamp(jC);
        sleepIndex.setSleepHeartRateRangeLow(numValueOf);
        sleepIndex.setSleepHeartRateRangeHigh(numValueOf2);
        sleepIndex.setAvgSleepBreathRangeLow(value);
        sleepIndex.setAvgSleepBreathRangeHigh(value2);
        sleepIndex.setAvgSleepHeartRate(Integer.valueOf(iD));
        listD.add(sleepIndex);
        List<SportHealthData> listB = phoneDayStatBean.b();
        HeartRate heartRate2 = new HeartRate();
        heartRate2.setSsoid(um.c().getSsoid());
        heartRate2.setDeviceUniqueId(ilj.g());
        heartRate2.setHeartRateType(5);
        heartRate2.setDataCreatedTimestamp(jC);
        heartRate2.setHeartRateValue(iD);
        listB.add(heartRate2);
    }

    public final List<SleepDayTime> f(long startTime, long endTime) {
        mq8 mq8Var = mq8.INSTANCE;
        a7b.f("PhoneStatDataParser", "processTimeRange: ,startTime: " + mq8Var.y(startTime, "yyyy/MM/dd HH:mm:ss") + ",endTime: " + mq8Var.y(endTime, "yyyy/MM/dd HH:mm:ss"));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (startTime != 0 && endTime != 0) {
            long jO = mq8Var.o(startTime);
            long jM = mq8Var.m(jO, mq8Var.n(endTime));
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(jO), zoneIdSystemDefault);
            while (j2 < jM) {
                long epochMilli = localDateTimeOfInstant.plusDays(j2).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                j2++;
                arrayList.add(new SleepDayTime(epochMilli, localDateTimeOfInstant.plusDays(j2).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli()));
            }
            a7b.f("PhoneStatDataParser", "processTimeRange day:" + arrayList.size());
        }
        return arrayList;
    }
}
