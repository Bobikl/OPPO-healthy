package com.oplus.aiunit.vision;

import android.text.format.DateFormat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.newsleep.SleepAdvice;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.device_data_sync.data_sync.SleepCalibrationItem;
import com.heytap.health.device_data_sync.data_sync.SleepFixDataItem;
import com.heytap.health.sleep.bean.SleepBloodDayBean;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.SleepPhoneMeasureActivity;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b<\u0010=J@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J2\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020\u00022\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0#H\u0002J2\u0010+\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020\u00022\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0%0#H\u0002J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020\u00062\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0005H\u0002J \u00101\u001a\u00020.2\u0006\u0010,\u001a\u00020\u00062\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0005H\u0002J$\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00052\u0006\u00104\u001a\u00020\u000bH\u0002J$\u00106\u001a\b\u0012\u0004\u0012\u0002020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00052\u0006\u00104\u001a\u00020\u000bH\u0002J$\u00107\u001a\b\u0012\u0004\u0012\u0002020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00052\u0006\u00104\u001a\u00020\u000bH\u0002J\u001e\u0010;\u001a\u00020:2\u0006\u00108\u001a\u00020\u00022\f\u00109\u001a\b\u0012\u0004\u0012\u0002020\u0005H\u0002¨\u0006?"}, d2 = {"Lcom/oplus/aiunit/vision/qfh;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/Sleep;", "sleeps", "Lcom/oplus/aiunit/vision/geh;", "sleepCalibrationBean", "phoneSleepList", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "f", "", DBHealthArchiveRecord.AGE, "Lcom/heytap/databaseengine/model/UserInfo;", dde.KEY_USER_INFO, "sleepDataList", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "bloodOxygenList", "Lcom/heytap/databaseengine/model/SleepDataStat;", "sleepDataStatList", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "osaResultBeanList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "sleepAdviceList", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "hrvStatList", c7n.f, "curDaySleepStartTime", "curDaySleepEndTime", "j", "time", "", "", "", "Lcom/heytap/health/device_data_sync/data_sync/SleepFixDataItem;", "fixDataMap", "i", "Lcom/heytap/health/device_data_sync/data_sync/SleepCalibrationItem;", "calibrationDataMap", c7n.g, Element.ELEMENT_NAME_SLEEP, "sleepCalibrationItems", "", "b", "fixDataItems", "a", "Lcom/heytap/health/core/widget/charts/data/SleepUnitData;", "sleepUnitDataList", "sleepDayBean", "c", "d", MapSchema.FIELD_NAME_ENTRY, "startTimeStamp", "sleepUnitDatas", "", MapSchema.FIELD_NAME_KEY, "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDataTransform.kt\ncom/heytap/health/sleep/day/model/SleepDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,751:1\n1002#2,2:752\n1855#2,2:754\n*S KotlinDebug\n*F\n+ 1 SleepDataTransform.kt\ncom/heytap/health/sleep/day/model/SleepDataTransform\n*L\n229#1:752,2\n248#1:754,2\n*E\n"})
public final class qfh {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SleepDataTransform.kt\ncom/heytap/health/sleep/day/model/SleepDataTransform\n*L\n1#1,328:1\n229#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepUnitData) t).getTimestamp()), Long.valueOf(((SleepUnitData) t2).getTimestamp()));
        }
    }

    public final boolean a(Sleep sleep, List<SleepFixDataItem> fixDataItems) {
        if (fixDataItems == null) {
            return false;
        }
        for (SleepFixDataItem sleepFixDataItem : fixDataItems) {
            long j2 = 1000;
            if (sleep.getStartTimestamp() / j2 >= sleepFixDataItem.getSleepOriginalInTime() && sleep.getStartTimestamp() / j2 < sleepFixDataItem.getSleepInTime()) {
                return true;
            }
            if (sleep.getStartTimestamp() / j2 > sleepFixDataItem.getSleepOutTime() && sleep.getStartTimestamp() / j2 <= sleepFixDataItem.getSleepOriginalOutTime()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Sleep sleep, List<SleepCalibrationItem> sleepCalibrationItems) {
        if (sleepCalibrationItems == null) {
            return false;
        }
        for (SleepCalibrationItem sleepCalibrationItem : sleepCalibrationItems) {
            long j2 = 1000;
            if (sleep.getStartTimestamp() / j2 >= sleepCalibrationItem.getStartTimestamp() && sleep.getStartTimestamp() / j2 <= sleepCalibrationItem.getEndTimestamp()) {
                return true;
            }
        }
        return false;
    }

    public final List<SleepUnitData> c(List<SleepUnitData> sleepUnitDataList, SleepDayBean sleepDayBean) {
        if (sleepDayBean.getDataVersion() == 12) {
            m8b.f("SleepDataTransform", "device is i watch");
            return sleepUnitDataList;
        }
        if (sleepUnitDataList.size() <= 1 || sleepDayBean.getDataVersion() == 10 || sleepDayBean.getDataVersion() == 11) {
            return (sleepUnitDataList.size() <= 1 || sleepDayBean.getDataVersion() != 11) ? sleepUnitDataList : e(sleepUnitDataList, sleepDayBean);
        }
        return d(sleepUnitDataList, sleepDayBean);
    }

    public final List<SleepUnitData> d(List<SleepUnitData> sleepUnitDataList, SleepDayBean sleepDayBean) {
        m8b.f("SleepDataTransform", "addWakeForWatch1AndBand1:" + sleepDayBean.getCurDayEndTime());
        ArrayList arrayList = new ArrayList();
        SleepUnitData sleepUnitData = sleepUnitDataList.get(0);
        arrayList.add(sleepUnitData);
        int size = sleepUnitDataList.size();
        int i = 1;
        while (i < size) {
            SleepUnitData sleepUnitData2 = sleepUnitDataList.get(i);
            long timestamp = sleepUnitData.getTimestamp() + sleepUnitData.getDuration();
            long timestamp2 = sleepUnitData2.getTimestamp() - timestamp;
            if (timestamp2 < 7200000 && timestamp2 >= 60000) {
                SleepUnitData sleepUnitData3 = new SleepUnitData();
                sleepUnitData3.setType(4);
                sleepUnitData3.setTimestamp(timestamp);
                sleepUnitData3.setDuration(timestamp2);
                arrayList.add(sleepUnitData3);
            }
            arrayList.add(sleepUnitData2);
            i++;
            sleepUnitData = sleepUnitData2;
        }
        return arrayList;
    }

    public final List<SleepUnitData> e(List<SleepUnitData> sleepUnitDataList, SleepDayBean sleepDayBean) {
        SleepUnitData sleepUnitData;
        m8b.f("SleepDataTransform", "addWakeForWatch2AndWatchFree:" + sleepDayBean.getCurDayEndTime());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= sleepUnitDataList.size()) {
                sleepUnitData = null;
                break;
            }
            sleepUnitData = sleepUnitDataList.get(i);
            if (sleepUnitData.getType() != 4) {
                break;
            }
            i++;
        }
        if (sleepUnitData == null) {
            m8b.b("SleepDataTransform", "no sleep data!");
            return sleepUnitDataList;
        }
        arrayList.add(sleepUnitData);
        SleepUnitData sleepUnitData2 = sleepUnitData;
        long duration = 0;
        for (int i2 = i + 1; i2 < sleepUnitDataList.size(); i2++) {
            if (sleepUnitData.getType() != 4) {
                sleepUnitData2 = sleepUnitData;
                duration = 0;
            }
            sleepUnitData = sleepUnitDataList.get(i2);
            if (sleepUnitData.getType() == 4) {
                duration = sleepUnitData.getDuration();
            } else {
                Intrinsics.checkNotNull(sleepUnitData2);
                long timestamp = sleepUnitData2.getTimestamp() + sleepUnitData2.getDuration();
                long timestamp2 = sleepUnitData.getTimestamp() - timestamp;
                if (timestamp2 >= 60000) {
                    m8b.f("SleepDataTransform", "offTime:" + timestamp2);
                    if (timestamp2 <= SleepPhoneMeasureActivity.SLEEP_MEASURE_VALID_MIN_TIME) {
                        SleepUnitData sleepUnitData3 = new SleepUnitData();
                        sleepUnitData3.setType(4);
                        sleepUnitData3.setTimestamp(timestamp);
                        sleepUnitData3.setDuration(timestamp2);
                        arrayList.add(sleepUnitData3);
                    } else if (timestamp2 == duration) {
                        SleepUnitData sleepUnitData4 = new SleepUnitData();
                        sleepUnitData4.setType(4);
                        sleepUnitData4.setTimestamp(timestamp);
                        sleepUnitData4.setDuration(timestamp2);
                        arrayList.add(sleepUnitData4);
                    }
                }
                arrayList.add(sleepUnitData);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<SleepDayBean> f(long startTime, long endTime, @NotNull List<Sleep> sleeps, @NotNull geh sleepCalibrationBean, @NotNull List<Sleep> phoneSleepList) {
        int i;
        List<SleepFixDataItem> list;
        List<SleepCalibrationItem> list2;
        int i2;
        qfh qfhVar = this;
        List<Sleep> sleeps2 = sleeps;
        Intrinsics.checkNotNullParameter(sleeps2, "sleeps");
        Intrinsics.checkNotNullParameter(sleepCalibrationBean, "sleepCalibrationBean");
        Intrinsics.checkNotNullParameter(phoneSleepList, "phoneSleepList");
        m8b.f("SleepDataTransform", "parseSleepUnitData startTime:" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", new Date(startTime))) + ",endTime:" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", new Date(endTime))));
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        pr8 pr8Var = pr8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d());
        int i3 = 20;
        LocalDateTime localDateTimeWithNano = localDateTimeOfInstant.getHour() >= 20 ? LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).withHour(20).withMinute(0).withSecond(0).withNano(0) : LocalDateTime.of(localDateTimeOfInstant.toLocalDate().minusDays(1L), LocalTime.MIN).withHour(20).withMinute(0).withSecond(0).withNano(0);
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), pr8Var.d()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeWithNano.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i4 = 0;
        while (j2 < epochDay) {
            SleepDayBean sleepDayBean = new SleepDayBean();
            List<SleepUnitData> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = arrayList;
            LocalDateTime localDateTimeWithNano2 = localDateTimeWithNano.plusDays(j2).withHour(i3).withMinute(0).withSecond(0).withNano(0);
            pr8 pr8Var2 = pr8.INSTANCE;
            long epochMilli = localDateTimeWithNano2.atZone(pr8Var2.d()).toInstant().toEpochMilli();
            long j3 = j2 + 1;
            LocalDateTime localDateTime = localDateTimeWithNano;
            long epochMilli2 = localDateTimeWithNano.plusDays(j3).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(pr8Var2.d()).toInstant().toEpochMilli();
            List<SleepFixDataItem> listI = qfhVar.i(epochMilli2, sleepCalibrationBean.b());
            if (listI != null) {
                for (SleepFixDataItem sleepFixDataItem : listI) {
                    long j4 = j3;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fixDataItems:");
                    sb.append(sleepFixDataItem);
                    i4 = i4;
                    j3 = j4;
                }
            }
            long j5 = j3;
            int i5 = i4;
            List<SleepCalibrationItem> listH = qfhVar.h(epochMilli2, sleepCalibrationBean.a());
            if (listH != null) {
                Iterator<SleepCalibrationItem> it = listH.iterator();
                while (it.hasNext()) {
                    SleepCalibrationItem next = it.next();
                    Iterator<SleepCalibrationItem> it2 = it;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("sleepCalibrationItems:");
                    sb2.append(next);
                    it = it2;
                    epochDay = epochDay;
                }
            }
            long j6 = epochDay;
            sleepDayBean.init(epochMilli, epochMilli2);
            boolean z = true;
            if (!sleeps2.isEmpty()) {
                int i6 = i5;
                while (i6 < sleeps.size()) {
                    Sleep sleep = sleeps2.get(i6);
                    if (sleep.getSleepState() != 0 && sleep.getEndTimestamp() - sleep.getStartTimestamp() >= 60000) {
                        if (qfhVar.b(sleep, listH)) {
                            sleepDayBean.setCalibration(z);
                        } else if (qfhVar.a(sleep, listI)) {
                            sleepDayBean.setCalibration(z);
                        } else {
                            if (sleep.getStartTimestamp() < epochMilli || sleep.getEndTimestamp() > epochMilli2) {
                                list = listI;
                                list2 = listH;
                                if (sleep.getStartTimestamp() >= epochMilli2) {
                                    if (!(!arrayList2.isEmpty())) {
                                        break;
                                    }
                                    SleepUnitData sleepUnitData = arrayList2.get(arrayList2.size() - 1);
                                    if (sleepUnitData.getType() != 4 && sleepUnitData.getDuration() >= 60000) {
                                        break;
                                    }
                                    arrayList2.remove(sleepUnitData);
                                    break;
                                }
                            } else {
                                arrayList3.add(sleep);
                                if (sleep.getDataVersion() == 11) {
                                    sleepDayBean.setDataVersion(11);
                                    list = listI;
                                } else {
                                    if (sleep.getDataVersion() == 10) {
                                        list = listI;
                                        i2 = 11;
                                        if (sleepDayBean.getDataVersion() != 11) {
                                            sleepDayBean.setDataVersion(10);
                                        }
                                    } else {
                                        list = listI;
                                        i2 = 11;
                                    }
                                    if (sleepDayBean.getDataVersion() != i2 && sleepDayBean.getDataVersion() != 10) {
                                        sleepDayBean.setDataVersion(sleep.getDataVersion());
                                    }
                                }
                                long endTimestamp = sleep.getEndTimestamp() - sleep.getStartTimestamp();
                                int iE = pfh.e(sleep.getSleepState());
                                if (!arrayList2.isEmpty()) {
                                    list2 = listH;
                                    SleepUnitData sleepUnitData2 = arrayList2.get(arrayList2.size() - 1);
                                    long timestamp = sleepUnitData2.getTimestamp() + sleepUnitData2.getDuration();
                                    if (sleepUnitData2.getType() == iE && timestamp == sleep.getStartTimestamp()) {
                                        sleepUnitData2.setDuration(sleep.getEndTimestamp() - sleepUnitData2.getTimestamp());
                                        sleepDayBean.addData(endTimestamp, iE, sleep.getEndTimestamp());
                                    }
                                } else {
                                    list2 = listH;
                                }
                                SleepUnitData sleepUnitData3 = new SleepUnitData();
                                sleepUnitData3.setType(iE);
                                sleepUnitData3.setTimestamp(sleep.getStartTimestamp());
                                sleepUnitData3.setDuration(endTimestamp);
                                sleepUnitData3.setDeviceType(sleep.getDeviceType());
                                arrayList2.add(sleepUnitData3);
                                sleepDayBean.addData(endTimestamp, iE, sleep.getEndTimestamp());
                            }
                            i6++;
                            z = true;
                            qfhVar = this;
                            sleeps2 = sleeps;
                            listI = list;
                            listH = list2;
                        }
                    }
                    i6++;
                }
                i = i6;
            } else {
                i = i5;
            }
            List<Sleep> listJ = j(phoneSleepList, epochMilli, epochMilli2);
            List<SleepUnitData> listC = c(arrayList2, sleepDayBean);
            if (listC.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(listC, new b());
            }
            k(epochMilli, listC);
            m8b.f("SleepDataTransform", "buildSleepDayBean resultList size:" + listC.size());
            sleepDayBean.setSleepList(arrayList3);
            sleepDayBean.setPhoneSleepList(listJ);
            sleepDayBean.setSleepUnitDataList(listC);
            sleepDayBean.setHasPhoneSleepData(!listJ.isEmpty());
            arrayList4.add(sleepDayBean);
            i4 = i;
            arrayList = arrayList4;
            localDateTimeWithNano = localDateTime;
            i3 = 20;
            sleeps2 = sleeps;
            qfhVar = this;
            j2 = j5;
            epochDay = j6;
        }
        ArrayList arrayList5 = arrayList;
        m8b.f("SleepDataTransform", "sleepDayBeanList size:" + arrayList5.size());
        return arrayList5;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0217  */
    @NotNull
    public final List<SleepDayBean> g(int age, @NotNull UserInfo userInfo, @NotNull List<SleepDayBean> sleepDataList, @NotNull List<BloodOxygenSaturation> bloodOxygenList, @NotNull List<SleepDataStat> sleepDataStatList, @NotNull List<OsaResultBean> osaResultBeanList, @NotNull List<SleepIndex> sleepIndexList, @NotNull List<SleepAdvice> sleepAdviceList, @NotNull List<PhysicalMentalStat> hrvStatList) {
        int size;
        int i;
        int i2;
        int i3;
        int iIntValue;
        int iIntValue2;
        UserInfo userInfo2 = userInfo;
        List<SleepDataStat> sleepDataStatList2 = sleepDataStatList;
        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
        Intrinsics.checkNotNullParameter(sleepDataList, "sleepDataList");
        Intrinsics.checkNotNullParameter(bloodOxygenList, "bloodOxygenList");
        Intrinsics.checkNotNullParameter(sleepDataStatList2, "sleepDataStatList");
        Intrinsics.checkNotNullParameter(osaResultBeanList, "osaResultBeanList");
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        Intrinsics.checkNotNullParameter(sleepAdviceList, "sleepAdviceList");
        Intrinsics.checkNotNullParameter(hrvStatList, "hrvStatList");
        m8b.f("SleepDataTransform", "start merge sleep data");
        Iterator<SleepDayBean> it = sleepDataList.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            SleepDayBean next = it.next();
            next.setAge(age);
            next.setUserInfo(userInfo2);
            Instant instantOfEpochMilli = Instant.ofEpochMilli(next.getCurDayEndTime());
            pr8 pr8Var = pr8.INSTANCE;
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d());
            Iterator<SleepDayBean> it2 = it;
            int i6 = i4;
            int i7 = i5;
            long epochMilli = LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).atZone(pr8Var.d()).toInstant().toEpochMilli();
            long epochMilli2 = LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MAX).atZone(pr8Var.d()).toInstant().toEpochMilli();
            int iE = pr8Var.e(epochMilli);
            int i8 = i6;
            long jC = pr8Var.c(next.getCurDayStartTime());
            int size2 = sleepDataStatList.size();
            int i9 = i8;
            while (i8 < size2) {
                SleepDataStat sleepDataStat = sleepDataStatList2.get(i8);
                long jA = o15.a(sleepDataStat.getDate());
                if (jA > epochMilli2) {
                    break;
                }
                if (epochMilli <= jA) {
                    i9++;
                    i3 = size2;
                    i2 = iE;
                    m8b.f("SleepDataTransform", "date:" + sleepDataStat.getDate() + " /:" + sleepDataStat.getSleepScore() + " /:" + sleepDataStat.getCheckedSleepScore() + " /:" + next.getIsCalibration());
                    if (sleepDataStat.getSleepScore() != null) {
                        Integer sleepScore = sleepDataStat.getSleepScore();
                        Intrinsics.checkNotNullExpressionValue(sleepScore, "sleepDataStat.sleepScore");
                        iIntValue = sleepScore.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (sleepDataStat.getCheckedSleepScore() != null) {
                        Integer checkedSleepScore = sleepDataStat.getCheckedSleepScore();
                        Intrinsics.checkNotNullExpressionValue(checkedSleepScore, "sleepDataStat.checkedSleepScore");
                        iIntValue2 = checkedSleepScore.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (next.getIsCalibration()) {
                        next.setScore(iIntValue2);
                    } else {
                        next.setScore(iIntValue);
                    }
                } else {
                    i2 = iE;
                    i3 = size2;
                }
                i8++;
                sleepDataStatList2 = sleepDataStatList;
                size2 = i3;
                iE = i2;
            }
            int i10 = iE;
            ArrayList<BloodOxygenSaturation> arrayList = new ArrayList();
            int size3 = bloodOxygenList.size();
            for (int i11 = i7; i11 < size3; i11++) {
                BloodOxygenSaturation bloodOxygenSaturation = bloodOxygenList.get(i11);
                if (bloodOxygenSaturation.getDataCreatedTimestamp() >= next.getCurDayEndTime()) {
                    break;
                }
                if (next.getCurDayStartTime() <= bloodOxygenSaturation.getDataCreatedTimestamp()) {
                    i7++;
                    arrayList.add(bloodOxygenSaturation);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (BloodOxygenSaturation bloodOxygenSaturation2 : arrayList) {
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(bloodOxygenSaturation2.getDataCreatedTimestamp());
                timeStampedData.setY(bloodOxygenSaturation2.getBloodOxygenSaturationValue());
                arrayList2.add(timeStampedData);
            }
            SleepBloodDayBean sleepBloodDayBean = new SleepBloodDayBean();
            TimeStampedData timeStampedData2 = null;
            float y = 0.0f;
            for (TimeStampedData timeStampedData3 : arrayList2) {
                y += timeStampedData3.getY();
                if (timeStampedData2 != null) {
                    long timestamp = timeStampedData3.getTimestamp() - timeStampedData2.getTimestamp();
                    if (timestamp > 1440000 && timestamp <= 7200000) {
                        timeStampedData2.setBloodOxDottedFlag(true);
                        timeStampedData3.setBloodOxDottedFlag(true);
                    }
                }
                timeStampedData2 = timeStampedData3;
            }
            if (arrayList2.isEmpty()) {
                size = 0;
            } else if (y == 0.0f) {
                size = 0;
            } else {
                size = (int) (y / arrayList2.size());
            }
            sleepBloodDayBean.setAverageBlood(size);
            sleepBloodDayBean.setBloodOxDataList(arrayList2);
            next.setSleepBloodDayBean(sleepBloodDayBean);
            int size4 = osaResultBeanList.size();
            for (int i12 = 0; i12 < size4; i12++) {
                OsaResultBean osaResultBean = osaResultBeanList.get(i12);
                long jA2 = o15.a(osaResultBean.getDate());
                if (jC == jA2 && (next.getBeforeOsaResultBean() == null || osaResultBean.getVersion() == 1)) {
                    next.setBeforeOsaResultBean(osaResultBean);
                }
                if (epochMilli <= jA2 && jA2 < epochMilli2) {
                    if (next.getOsaResultBean() == null) {
                        next.setOsaResultBean(osaResultBean);
                    } else if (osaResultBean.getVersion() == 1) {
                        next.setOsaResultBean(osaResultBean);
                    }
                }
            }
            int size5 = sleepIndexList.size();
            for (int i13 = 0; i13 < size5; i13++) {
                SleepIndex sleepIndex = sleepIndexList.get(i13);
                long dataTimestamp = sleepIndex.getDataTimestamp();
                if (jC == dataTimestamp) {
                    next.setBeforeSleepIndex(sleepIndex);
                }
                if (dataTimestamp >= epochMilli && dataTimestamp < epochMilli2) {
                    next.setSleepIndex(sleepIndex);
                }
            }
            next.setSleepIndexList(sleepIndexList);
            ArrayList arrayList3 = new ArrayList();
            int size6 = hrvStatList.size();
            int i14 = 0;
            while (i14 < size6) {
                PhysicalMentalStat physicalMentalStat = hrvStatList.get(i14);
                int i15 = i10;
                if (i15 == physicalMentalStat.getDate()) {
                    arrayList3.add(physicalMentalStat);
                }
                i14++;
                i10 = i15;
            }
            if (arrayList3.size() > 1 && next.getSleepIndex() != null) {
                int size7 = arrayList3.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    PhysicalMentalStat physicalMentalStat2 = (PhysicalMentalStat) arrayList3.get(i16);
                    String deviceUniqueId = physicalMentalStat2.getDeviceUniqueId();
                    SleepIndex sleepIndex2 = next.getSleepIndex();
                    Intrinsics.checkNotNull(sleepIndex2);
                    if (Intrinsics.areEqual(deviceUniqueId, sleepIndex2.getDeviceUniqueId())) {
                        next.setHrvStat(physicalMentalStat2);
                    }
                }
            }
            if (next.getHrvStat() == null && w0b.b(arrayList3, 1)) {
                i = 0;
                next.setHrvStat((PhysicalMentalStat) arrayList3.get(0));
            } else {
                i = 0;
            }
            int size8 = sleepAdviceList.size();
            for (int i17 = i; i17 < size8; i17++) {
                SleepAdvice sleepAdvice = sleepAdviceList.get(i17);
                long dataTimestamp2 = sleepAdvice.getDataTimestamp();
                if (jC == dataTimestamp2) {
                    next.setBeforeSleepAdvice(sleepAdvice);
                }
                if (dataTimestamp2 >= epochMilli && dataTimestamp2 < epochMilli2) {
                    next.setSleepAdvice(sleepAdvice);
                }
            }
            userInfo2 = userInfo;
            sleepDataStatList2 = sleepDataStatList;
            it = it2;
            i5 = i7;
            i4 = i9;
        }
        return sleepDataList;
    }

    public final List<SleepCalibrationItem> h(long time, Map<String, ? extends List<? extends SleepCalibrationItem>> calibrationDataMap) {
        return TypeIntrinsics.asMutableList(calibrationDataMap.get(String.valueOf(o15.i(time))));
    }

    public final List<SleepFixDataItem> i(long time, Map<String, ? extends List<? extends SleepFixDataItem>> fixDataMap) {
        return TypeIntrinsics.asMutableList(fixDataMap.get(String.valueOf(o15.i(time))));
    }

    public final List<Sleep> j(List<Sleep> phoneSleepList, long curDaySleepStartTime, long curDaySleepEndTime) {
        ArrayList arrayList = new ArrayList();
        for (Sleep sleep : phoneSleepList) {
            if (sleep.getStartTimestamp() < curDaySleepStartTime || sleep.getEndTimestamp() >= curDaySleepEndTime) {
                if (sleep.getStartTimestamp() >= curDaySleepEndTime) {
                    break;
                }
            } else {
                arrayList.add(sleep);
            }
        }
        return arrayList;
    }

    public final void k(long startTimeStamp, List<SleepUnitData> sleepUnitDatas) {
        if (!sleepUnitDatas.isEmpty()) {
            int size = sleepUnitDatas.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (sleepUnitDatas.get(size).getType() != 4) {
                        break;
                    }
                    m8b.f("SleepDataTransform", "remove1:" + sleepUnitDatas.get(size));
                    sleepUnitDatas.remove(size);
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            Iterator<SleepUnitData> it = sleepUnitDatas.iterator();
            while (it.hasNext()) {
                SleepUnitData next = it.next();
                if (next.getType() != 4) {
                    break;
                }
                m8b.f("SleepDataTransform", "remove2:" + next);
                it.remove();
            }
            int i2 = 0;
            while (i2 < sleepUnitDatas.size()) {
                SleepUnitData sleepUnitData = sleepUnitDatas.get(i2);
                if (sleepUnitData.getType() == 4) {
                    int i3 = i2 + 1;
                    SleepUnitData sleepUnitData2 = sleepUnitDatas.get(i3);
                    if (sleepUnitData2.getType() != 4) {
                        i2 = i3;
                    } else if (sleepUnitData.getTimestamp() + sleepUnitData.getDuration() == sleepUnitData2.getTimestamp()) {
                        sleepUnitData.setDuration(sleepUnitData.getDuration() + sleepUnitData2.getDuration());
                        m8b.f("SleepDataTransform", "remove3:" + sleepUnitData2);
                        sleepUnitDatas.remove(sleepUnitData2);
                        i2 += -1;
                    }
                }
                i2++;
            }
            int i4 = 0;
            while (i4 < sleepUnitDatas.size()) {
                SleepUnitData sleepUnitData3 = sleepUnitDatas.get(i4);
                if (sleepUnitData3.getType() == 4) {
                    SleepUnitData sleepUnitData4 = sleepUnitDatas.get(i4 - 1);
                    SleepUnitData sleepUnitData5 = sleepUnitDatas.get(i4 + 1);
                    if (sleepUnitData3.getTimestamp() != sleepUnitData4.getTimestamp() + sleepUnitData4.getDuration()) {
                        m8b.f("SleepDataTransform", "remove4:" + sleepUnitData3);
                        sleepUnitDatas.remove(i4);
                    } else if (sleepUnitData3.getTimestamp() + sleepUnitData3.getDuration() != sleepUnitData5.getTimestamp()) {
                        m8b.f("SleepDataTransform", "remove5:" + sleepUnitData3);
                        sleepUnitDatas.remove(i4);
                    }
                    i4--;
                }
                i4++;
            }
        }
        if (sleepUnitDatas.isEmpty()) {
            SleepUnitData sleepUnitData6 = new SleepUnitData();
            sleepUnitData6.setType(4);
            sleepUnitData6.setTimestamp(startTimeStamp);
            sleepUnitData6.setDuration(0L);
            sleepUnitDatas.add(0, sleepUnitData6);
            Instant instantOfEpochMilli = Instant.ofEpochMilli(startTimeStamp);
            pr8 pr8Var = pr8.INSTANCE;
            long epochMilli = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d()).plusDays(1L).atZone(pr8Var.d()).toInstant().toEpochMilli();
            SleepUnitData sleepUnitData7 = new SleepUnitData();
            sleepUnitData7.setType(4);
            sleepUnitData7.setTimestamp(epochMilli);
            sleepUnitData7.setDuration(0L);
            sleepUnitDatas.add(sleepUnitData7);
        }
    }
}