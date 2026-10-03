package com.heytap.device.data.storage;

import com.heytap.databaseengine.model.Sedentary;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.hii;
import com.oplus.aiunit.vision.hv4;
import com.oplus.aiunit.vision.jij;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.l9b;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.n05;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.vy4;
import com.oplus.aiunit.vision.w0b;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/device/data/storage/ActivityDataRepository;", kq5.NOT_SET, "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ActivityDataRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001e\u0010\u000f\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0016\u0010\u0011\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0002¨\u0006\u0014"}, d2 = {"Lcom/heytap/device/data/storage/ActivityDataRepository$Companion;", kq5.NOT_SET, kq5.NOT_SET, "Lcom/heytap/health/protocol/fitness/FitnessProto$ActivityItem;", "data", kq5.NOT_SET, "dataStartTime", kq5.NOT_SET, "deviceUniqueId", kq5.NOT_SET, "a", "Lcom/heytap/health/protocol/fitness/FitnessProto$SportStatData;", "dataList", "c", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SportStatDataV2;", "d", "Lcom/heytap/databaseengine/model/SportHealthData;", "b", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull List<FitnessProto.ActivityItem> data, int dataStartTime, @Nullable String deviceUniqueId) {
            DataInsertOption dataInsertOption;
            Intrinsics.checkNotNullParameter(data, "data");
            long jE = e.INSTANCE.e(dataStartTime);
            DataInsertOption dataInsertOption2 = new DataInsertOption();
            dataInsertOption2.setDataTable(hii.CUSTOM_OUTDOOR_SPORTS);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean zBooleanValue = ((Boolean) gd5.c(deviceUniqueId).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.storage.ActivityDataRepository$Companion$saveActivityData$isWatch1$1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                    return Boolean.valueOf(deviceInfo.O9());
                }
            })).booleanValue();
            Iterator<FitnessProto.ActivityItem> it = data.iterator();
            int minuteStep = 0;
            int minuteDistance = 0;
            int minuteHeight = 0;
            int minuteCalorie = 0;
            int minuteExercise = 0;
            int sedentaryState = 0;
            int exerciseAmount = 0;
            while (true) {
                dataInsertOption = dataInsertOption2;
                if (!it.hasNext()) {
                    break;
                }
                FitnessProto.ActivityItem next = it.next();
                Iterator<FitnessProto.ActivityItem> it2 = it;
                long timeOffset = (((long) next.getTimeOffset()) * 60000) + jE;
                long j = jE;
                SportDataDetail sportDataDetail = new SportDataDetail();
                int i = sedentaryState;
                int i2 = exerciseAmount;
                sportDataDetail.setCalories(((long) next.getMinuteCalorie()) * 1000);
                sportDataDetail.setDistance(next.getMinuteDistance());
                if (next.getMinuteExercise() != 0) {
                    sportDataDetail.setWorkout(1);
                } else {
                    sportDataDetail.setWorkout(0);
                }
                int minuteSportType = next.getMinuteSportType();
                if (zBooleanValue) {
                    minuteSportType = n05.b(minuteSportType);
                }
                sportDataDetail.setSportMode(minuteSportType);
                sportDataDetail.setSteps(next.getMinuteStep());
                sportDataDetail.setDeviceType(hv4.b(deviceUniqueId));
                sportDataDetail.setAltitudeOffset(next.getMinuteHeight());
                sportDataDetail.setDeviceUniqueId(deviceUniqueId);
                e.Companion companion = e.INSTANCE;
                sportDataDetail.setSsoid(companion.d());
                sportDataDetail.setStartTimestamp(timeOffset);
                long j2 = timeOffset + 60000;
                sportDataDetail.setEndTimestamp(j2);
                boolean z = zBooleanValue;
                sportDataDetail.setDisplay(1);
                arrayList.add(sportDataDetail);
                if (next.getSedentaryState() != 0) {
                    Sedentary sedentary = new Sedentary(null, 0L, 0L, null, 0, 31, null);
                    sedentary.setSsoid(companion.d());
                    sedentary.setStartTimestamp(timeOffset);
                    sedentary.setEndTimestamp(j2);
                    Intrinsics.checkNotNull(deviceUniqueId);
                    sedentary.setDataClient(deviceUniqueId);
                    sedentary.setValue(next.getSedentaryState());
                    arrayList2.add(sedentary);
                }
                if (next.getMinuteExercise() > 1) {
                    m8b.f("Data-Sync", "Daily activity minute exercise data incorrect: " + next.getMinuteExercise());
                }
                minuteStep += next.getMinuteStep();
                minuteDistance += next.getMinuteDistance();
                minuteHeight += next.getMinuteHeight();
                minuteCalorie += next.getMinuteCalorie();
                minuteExercise += next.getMinuteExercise();
                sedentaryState = i + next.getSedentaryState();
                exerciseAmount = i2 + next.getExerciseAmount();
                dataInsertOption2 = dataInsertOption;
                it = it2;
                zBooleanValue = z;
                jE = j;
            }
            int i3 = exerciseAmount;
            l9b.f("Data-Sync", "Daily activity data stat, totalStep=" + minuteStep + ", totalDistance=" + minuteDistance + ", totalHeight=" + minuteHeight + ", totalCalories=" + minuteCalorie + ", totalExercise=" + minuteExercise + ", totalSedentaryState=" + sedentaryState + ", totalExerciseAmount=" + i3);
            if (arrayList.size() == 0) {
                return true;
            }
            e.Companion companion2 = e.INSTANCE;
            l9b.f("Data-Sync", "Daily activity detail data stat, statTime=" + companion2.a(((SportHealthData) arrayList.get(0)).getStartTimestamp()) + ", endTime=" + companion2.a(((SportHealthData) arrayList.get(arrayList.size() - 1)).getStartTimestamp()) + ", totalStep=" + minuteStep + ", totalDistance=" + minuteDistance + ", totalCalories=" + minuteCalorie + ", totalExercise=" + minuteExercise + ", totalHeight=" + minuteHeight + ", totalSedentaryState=" + sedentaryState + ", totalExerciseAmount=" + i3);
            dataInsertOption.setDatas(arrayList);
            jij jijVar = new jij();
            companion2.b().insertSportHealthData(dataInsertOption).subscribe(jijVar);
            boolean zD = jijVar.d();
            boolean zB = arrayList2.size() > 0 ? b(arrayList2) : true;
            if (!zD) {
                m8b.f("Data-Sync", "Daily activity, save fail, startTime=" + companion2.a(((SportHealthData) CollectionsKt.first(arrayList)).getStartTimestamp()) + " endTime=" + companion2.a(((SportHealthData) CollectionsKt.last(arrayList)).getStartTimestamp()));
            }
            if (!zB) {
                m8b.f("Data-Sync", "Sedentary data save fail, data size=" + arrayList.size());
            }
            return zD && zB;
        }

        public final boolean b(List<? extends SportHealthData> dataList) {
            DataInsertOption dataInsertOption = new DataInsertOption();
            dataInsertOption.setDataTable(1069);
            dataInsertOption.setDatas(dataList);
            jij jijVar = new jij();
            e.INSTANCE.b().insertSportHealthData(dataInsertOption).subscribe(jijVar);
            return jijVar.d();
        }

        @JvmStatic
        public final boolean c(@NotNull List<FitnessProto.SportStatData> dataList, @NotNull String deviceUniqueId) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            ArrayList arrayList = new ArrayList();
            boolean zBooleanValue = ((Boolean) gd5.c(deviceUniqueId).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.storage.ActivityDataRepository$Companion$saveStatData$isWatch2$1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                    return Boolean.valueOf(deviceInfo.Q9());
                }
            })).booleanValue();
            for (FitnessProto.SportStatData sportStatData : dataList) {
                if (Intrinsics.areEqual(o15.d(new Date(((long) sportStatData.getTimestamp()) * 1000), n05.dataFormat), n05.dataZero)) {
                    m8b.f("Data-Sync", "Drop sport stat data time is 00:00:00");
                } else {
                    SportDataStat sportDataStat = new SportDataStat();
                    sportDataStat.setSsoid(e.INSTANCE.d());
                    sportDataStat.setDeviceUniqueId(deviceUniqueId);
                    sportDataStat.setSportMode(-3);
                    sportDataStat.setTotalSteps(sportStatData.getTotalStep());
                    sportDataStat.setTotalDistance(sportStatData.getTotalDistance());
                    sportDataStat.setTotalCalories(((long) sportStatData.getTotalCalorie()) * 1000);
                    sportDataStat.setTotalAltitudeOffset(sportStatData.getTotalFloor() * 30);
                    sportDataStat.setTotalWorkoutMinutes(sportStatData.getTotalExercise());
                    sportDataStat.setTotalStaticCal(((long) sportStatData.getStaticCalorie()) * 1000);
                    if (zBooleanValue) {
                        sportDataStat.setStaticCalSource(300);
                    }
                    sportDataStat.setSedentaryCounts(sportStatData.getSedentaryCount());
                    sportDataStat.setSedentaryTotalDuration(sportStatData.getSedentaryTime());
                    sportDataStat.setTotalAmountOfExercise(sportStatData.getTotalAmountOfExercise());
                    sportDataStat.setDate(o15.i(((long) sportStatData.getTimestamp()) * 1000));
                    sportDataStat.setSyncStatus(0);
                    sportDataStat.setUpdateTimestamp(((long) sportStatData.getTimestamp()) * 1000);
                    sportDataStat.setTimezone(o15.r(null));
                    if (sportStatData.getActivityCount() > 0) {
                        sportDataStat.setTotalMoveAboutTimes(sportStatData.getActivityCount());
                    }
                    arrayList.add(sportDataStat);
                }
            }
            if (w0b.a(arrayList)) {
                return true;
            }
            FitnessProto.SportStatData sportStatData2 = dataList.get(dataList.size() - 1);
            vy4.Companion companion = vy4.INSTANCE;
            companion.G(sportStatData2.getTotalStep());
            companion.y(sportStatData2.getActivityCount());
            companion.C(sportStatData2.getTotalExercise());
            companion.A(sportStatData2.getTotalCalorie());
            companion.E();
            DataInsertOption dataInsertOption = new DataInsertOption();
            dataInsertOption.setDataTable(hii.CUSTOM_INDOOR_SPORTS);
            dataInsertOption.setDatas(arrayList);
            jij jijVar = new jij();
            e.INSTANCE.b().insertSportHealthData(dataInsertOption).subscribe(jijVar);
            return jijVar.d();
        }

        @JvmStatic
        public final boolean d(@NotNull List<FitnessProtoV2.SportStatDataV2> dataList, @NotNull String deviceUniqueId) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            ArrayList arrayList = new ArrayList();
            boolean zBooleanValue = ((Boolean) gd5.c(deviceUniqueId).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.storage.ActivityDataRepository$Companion$saveStatDataV2$isWatch2$1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                    return Boolean.valueOf(deviceInfo.Q9());
                }
            })).booleanValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (FitnessProtoV2.SportStatDataV2 sportStatDataV2 : dataList) {
                SportDataStat sportDataStat = new SportDataStat();
                sportDataStat.setSsoid(e.INSTANCE.d());
                sportDataStat.setDeviceUniqueId(deviceUniqueId);
                sportDataStat.setSportMode(-3);
                sportDataStat.setTotalSteps(sportStatDataV2.getTotalStep());
                sportDataStat.setTotalDistance(sportStatDataV2.getTotalDistance());
                sportDataStat.setTotalCalories(((long) sportStatDataV2.getTotalCalorie()) * 1000);
                sportDataStat.setTotalAltitudeOffset(sportStatDataV2.getTotalFloor() * 30);
                sportDataStat.setTotalWorkoutMinutes(sportStatDataV2.getTotalExercise());
                sportDataStat.setTotalStaticCal(((long) sportStatDataV2.getStaticCalorie()) * 1000);
                if (zBooleanValue) {
                    sportDataStat.setStaticCalSource(300);
                }
                sportDataStat.setSedentaryCounts(sportStatDataV2.getSedentaryCount());
                sportDataStat.setSedentaryTotalDuration(sportStatDataV2.getSedentaryTime());
                sportDataStat.setDate(o15.i(((long) sportStatDataV2.getTimestamp()) * 1000));
                sportDataStat.setSyncStatus(0);
                sportDataStat.setUpdateTimestamp(jCurrentTimeMillis);
                sportDataStat.setTimezone(o15.r(null));
                if (sportStatDataV2.getActivityCount() > 0) {
                    sportDataStat.setTotalMoveAboutTimes(sportStatDataV2.getActivityCount());
                }
                arrayList.add(sportDataStat);
            }
            if (w0b.a(arrayList)) {
                return true;
            }
            FitnessProtoV2.SportStatDataV2 sportStatDataV3 = dataList.get(dataList.size() - 1);
            vy4.Companion companion = vy4.INSTANCE;
            companion.G(sportStatDataV3.getTotalStep());
            companion.y(sportStatDataV3.getActivityCount());
            companion.C(sportStatDataV3.getTotalExercise());
            companion.A(sportStatDataV3.getTotalCalorie());
            companion.E();
            DataInsertOption dataInsertOption = new DataInsertOption();
            dataInsertOption.setDataTable(hii.CUSTOM_INDOOR_SPORTS);
            dataInsertOption.setDatas(arrayList);
            jij jijVar = new jij();
            e.INSTANCE.b().insertSportHealthData(dataInsertOption).subscribe(jijVar);
            return jijVar.d();
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull List<FitnessProto.SportStatData> list, @NotNull String str) {
        return INSTANCE.c(list, str);
    }
}