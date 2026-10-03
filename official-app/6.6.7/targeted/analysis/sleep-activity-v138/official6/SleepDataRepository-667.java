package com.heytap.device.data.storage;

import com.google.protobuf.ByteString;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.protocol.fitness.FitnessProto$SleepData;
import com.heytap.health.protocol.fitness.FitnessProtoV2$SleepDataItemV2;
import com.heytap.health.protocol.fitness.FitnessProtoV2$SleepDataV2;
import com.oplus.aiunit.vision.g14;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.jij;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.vy4;
import com.oplus.aiunit.vision.yei;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/device/data/storage/SleepDataRepository;", "", "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDataRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0014"}, d2 = {"Lcom/heytap/device/data/storage/SleepDataRepository$Companion;", "", "Lcom/heytap/health/protocol/fitness/FitnessProto$SleepData;", "data", "", g14.DEVICE_UNIQUE_ID, "", "c", "Lcom/heytap/health/protocol/fitness/FitnessProtoV2$SleepDataV2;", "d", "", "sleepByte", "isOnePlus", "isIWatch", "isSupportShowWake20", "Lcom/heytap/databaseengine/model/Sleep;", "a", "b", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Sleep a(byte sleepByte, boolean isOnePlus, boolean isIWatch, boolean isSupportShowWake20) {
            Sleep sleep;
            int i = sleepByte & 7;
            String str = 0;
            if (i == 1) {
                sleep = new Sleep();
                sleep.setSleepState(4);
            } else if (i == 2) {
                sleep = new Sleep();
                sleep.setSleepState(2);
            } else if (i == 3) {
                sleep = new Sleep();
                sleep.setSleepState(3);
            } else if (i == 4) {
                sleep = new Sleep();
                sleep.setSleepState(5);
            } else if (i == 0 && (((sleepByte >> 4) & 1) == 1 || ((sleepByte >> 5) & 1) == 1)) {
                sleep = new Sleep();
                sleep.setSleepState(0);
            } else if (i == 0 && isIWatch) {
                sleep = new Sleep();
                sleep.setSleepState(5);
            } else {
                sleep = null;
            }
            if (sleep != null) {
                if (isOnePlus) {
                    sleep.setDataVersion(10);
                } else if (isSupportShowWake20) {
                    sleep.setDataVersion(11);
                }
                if (isSupportShowWake20) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((sleepByte >> 4) & 1) == 1 ? "1" : str);
                    sb.append(((sleepByte >> 5) & 1) == 1 ? "1" : str);
                    sb.append(((sleepByte >> 3) & 1) == 1 ? "1" : 0);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("state", sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((sleepByte >> 6) & 1);
                        sb2.append((sleepByte >> 7) & 1);
                        jSONObject.put("sleep_data_6_7_bit", sb2.toString());
                    } catch (JSONException e2) {
                        m8b.b("Data-Sync", "buildSleep: ex " + e2);
                    }
                    sleep.setMetadata(jSONObject.toString());
                }
            }
            return sleep;
        }

        public final boolean b(@Nullable String deviceUniqueId) {
            return yei.a(deviceUniqueId).P6();
        }

        public final boolean c(@NotNull FitnessProto$SleepData data, @NotNull String deviceUniqueId) {
            DataInsertOption dataInsertOption;
            Companion companion = this;
            String deviceUniqueId2 = deviceUniqueId;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(deviceUniqueId2, "deviceUniqueId");
            DataInsertOption dataInsertOption2 = new DataInsertOption();
            dataInsertOption2.setDataTable(1010);
            ArrayList arrayList = new ArrayList();
            long jE = e.INSTANCE.e(data.getStartTime());
            ByteString state = data.getState();
            boolean zBooleanValue = ((Boolean) gd5.c(deviceUniqueId).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.storage.SleepDataRepository$Companion$saveSleepData$isOnePlus$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.H9());
                }
            })).booleanValue();
            boolean zBooleanValue2 = ((Boolean) gd5.c(deviceUniqueId).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.storage.SleepDataRepository$Companion$saveSleepData$isIWatch$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.k0());
                }
            })).booleanValue();
            boolean zB = companion.b(deviceUniqueId2);
            int size = state.size();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                dataInsertOption = dataInsertOption2;
                if (i >= size) {
                    break;
                }
                Sleep sleepA = companion.a(state.byteAt(i), zBooleanValue, zBooleanValue2, zB);
                if (sleepA != null) {
                    if (zBooleanValue2) {
                        sleepA.setDataVersion(12);
                    }
                    int sleepState = sleepA.getSleepState();
                    if (sleepState == 2) {
                        i4++;
                    } else if (sleepState == 3) {
                        i5++;
                    } else if (sleepState == 4) {
                        i3++;
                    } else if (sleepState == 5) {
                        i2++;
                    }
                    sleepA.setSsoid(e.INSTANCE.d());
                    sleepA.setDisplay(1);
                    sleepA.setDeviceUniqueId(deviceUniqueId2);
                    sleepA.setStartTimestamp((((long) (i * 60)) * 1000) + jE);
                    sleepA.setEndTimestamp(sleepA.getStartTimestamp() + ((long) 60000));
                    arrayList.add(sleepA);
                }
                i++;
                companion = this;
                deviceUniqueId2 = deviceUniqueId;
                dataInsertOption2 = dataInsertOption;
                zBooleanValue = zBooleanValue;
                jE = jE;
            }
            if (arrayList.size() == 0) {
                long startTime = ((long) data.getStartTime()) * 1000;
                e.Companion companion2 = e.INSTANCE;
                m8b.f("Data-Sync", "Save sleep data, startTime=" + companion2.a(startTime) + " endTime=" + companion2.a(startTime + (((long) data.getState().size()) * 60000)) + ", all data is awake");
                return true;
            }
            vy4.INSTANCE.c0();
            long startTime2 = ((long) data.getStartTime()) * 1000;
            long endTimestamp = arrayList.get(arrayList.size() - 1).getEndTimestamp();
            e.Companion companion3 = e.INSTANCE;
            m8b.f("Data-Sync", "Save sleep data, startTime=" + companion3.a(startTime2) + " endTime=" + companion3.a(endTimestamp) + " all=" + state.size() + " light=" + i3 + " deep=" + i4 + " rem=" + i5 + " shortWake=" + i2);
            dataInsertOption.setDatas(arrayList);
            jij jijVar = new jij();
            companion3.b().insertSportHealthData(dataInsertOption).subscribe(jijVar);
            boolean zD = jijVar.d();
            if (!zD) {
                m8b.f("Data-Sync", "Save sleep data, startTime=" + companion3.a(startTime2) + " endTime=" + companion3.a(endTimestamp) + ", Save fail, light=" + i3 + " deep=" + i4);
            }
            return zD;
        }

        public final boolean d(@Nullable FitnessProtoV2$SleepDataV2 data, @NotNull String deviceUniqueId) {
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            boolean z = false;
            if (data == null) {
                m8b.f("Data-Sync", "sleep data is null");
                return false;
            }
            DataInsertOption dataInsertOption = new DataInsertOption();
            dataInsertOption.setDataTable(1010);
            ArrayList arrayList = new ArrayList();
            long jE = e.INSTANCE.e(data.getStartTime());
            List<FitnessProtoV2$SleepDataItemV2> dataList = data.getDataList();
            int size = dataList.size();
            boolean zBooleanValue = ((Boolean) gd5.c(deviceUniqueId).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.storage.SleepDataRepository$Companion$saveSleepDataV2$isIWatch$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.k0());
                }
            })).booleanValue();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i < size) {
                DataInsertOption dataInsertOption2 = dataInsertOption;
                int i6 = size;
                Sleep sleepA = a((byte) dataList.get(i).getState(), z, zBooleanValue, true);
                if (sleepA != null) {
                    if (zBooleanValue) {
                        sleepA.setDataVersion(12);
                    }
                    int sleepState = sleepA.getSleepState();
                    if (sleepState == 2) {
                        i3++;
                    } else if (sleepState == 3) {
                        i4++;
                    } else if (sleepState == 4) {
                        i2++;
                    } else if (sleepState == 5) {
                        i5++;
                    }
                    sleepA.setSsoid(e.INSTANCE.d());
                    sleepA.setDisplay(1);
                    sleepA.setDeviceUniqueId(deviceUniqueId);
                    sleepA.setStartTimestamp((((long) (dataList.get(i).getTimeOffset() * 60)) * 1000) + jE);
                    sleepA.setEndTimestamp(sleepA.getStartTimestamp() + ((long) 60000));
                    arrayList.add(sleepA);
                }
                i++;
                dataList = dataList;
                size = i6;
                dataInsertOption = dataInsertOption2;
                jE = jE;
                z = false;
            }
            DataInsertOption dataInsertOption3 = dataInsertOption;
            int i7 = size;
            if (arrayList.size() == 0) {
                m8b.f("Data-Sync", "Save sleep data, startTime=" + e.INSTANCE.a(((long) data.getStartTime()) * 1000) + " , all data is awake");
                return true;
            }
            vy4.INSTANCE.c0();
            long startTime = ((long) data.getStartTime()) * 1000;
            long endTimestamp = arrayList.get(arrayList.size() - 1).getEndTimestamp();
            e.Companion companion = e.INSTANCE;
            m8b.f("Data-Sync", "Save sleep data, startTime=" + companion.a(startTime) + " endTime=" + companion.a(endTimestamp) + " all=" + i7 + " light=" + i2 + " deep=" + i3 + " rem=" + i4 + " shortWake=" + i5);
            dataInsertOption3.setDatas(arrayList);
            jij jijVar = new jij();
            companion.b().insertSportHealthData(dataInsertOption3).subscribe(jijVar);
            boolean zD = jijVar.d();
            if (zD) {
                return zD;
            }
            m8b.f("Data-Sync", "Save sleep data, startTime=" + companion.a(startTime) + " endTime=" + companion.a(endTimestamp) + ", Save fail, light=" + i2 + " deep=" + i3);
            return zD;
        }
    }
}