package com.oplus.aiunit.vision;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.healthbase.bean.SupportedPhoneBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.onet.IONetService;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005J7\u0010\u0014\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eJ7\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eJ7\u0010\u0017\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eJ7\u0010\u0018\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eJ7\u0010\u0019\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eJ\u0014\u0010\u001b\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ*\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fJA\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eH\u0002R\u0014\u0010'\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/zhe;", "", "", "b", "c", "Landroid/hardware/SensorEventListener;", "listener", MapSchema.FIELD_NAME_KEY, "", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "", "Lcom/heytap/databaseengine/model/SportHealthData;", "sleepIndexList", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "code", "saveResult", "j", "list", "i", b2n.f, "f", b2n.g, "data", "a", "", "startTime", "endTime", "", t04.DEVICE_UNIQUE_ID, "Lcom/oplus/aiunit/vision/lbd;", "", "Lcom/heytap/databaseengine/model/SleepIndex;", "d", "table", MapSchema.FIELD_NAME_ENTRY, "SENSOR_TAG", "Ljava/lang/String;", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "mSensorManager", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSleep;", "Ljava/util/List;", "mWhitelist", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSnore;", "mSnoreWhitelist", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneSleepTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneSleepTask.kt\ncom/heytap/health/sleep/measure/sensor/PhoneSleepTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,303:1\n1855#2,2:304\n1855#2,2:306\n1855#2,2:308\n*S KotlinDebug\n*F\n+ 1 PhoneSleepTask.kt\ncom/heytap/health/sleep/measure/sensor/PhoneSleepTask\n*L\n83#1:304,2\n116#1:306,2\n232#1:308,2\n*E\n"})
public final class zhe {
    public static final int $stable;

    @NotNull
    public static final String SENSOR_TAG = "PhoneSleepSensor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static SensorManager mSensorManager;

    @NotNull
    public static final zhe INSTANCE = new zhe();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<SupportedPhoneBean.PhoneMeasureSleep> mWhitelist = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<SupportedPhoneBean.PhoneMeasureSnore> mSnoreWhitelist = new ArrayList();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/SleepIndex;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPhoneSleepTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneSleepTask.kt\ncom/heytap/health/sleep/measure/sensor/PhoneSleepTask$getPhoneSleepIndex$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,303:1\n1855#2,2:304\n*S KotlinDebug\n*F\n+ 1 PhoneSleepTask.kt\ncom/heytap/health/sleep/measure/sensor/PhoneSleepTask$getPhoneSleepIndex$1\n*L\n288#1:304,2\n*E\n"})
    public static final class a<T, R> implements d08 {
        public final /* synthetic */ String i;

        public a(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SleepIndex> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            ArrayList arrayList = new ArrayList();
            if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                String str = this.i;
                for (T t : (List) obj) {
                    if ((t instanceof SleepIndex) && TextUtils.equals(str, ((SleepIndex) t).getDeviceUniqueId())) {
                        arrayList.add(t);
                    }
                }
            }
            a7b.f("PhoneSleepTask", "getPhoneSleepIndex result size:" + arrayList.size() + "/code:" + commonBackBean.getErrorCode());
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "throwable", "", "Lcom/heytap/databaseengine/model/SleepIndex;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements d08 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SleepIndex> apply(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.b("PhoneSleepTask", "getPhoneSleepIndex error:" + throwable.getMessage());
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/zhe$c", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "", "c", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f19419j;
        public final /* synthetic */ Function1<Integer, Unit> k;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i, Function1<? super Integer, Unit> function1) {
            this.f19419j = i;
            this.k = function1;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@Nullable CommonBackBean result) {
            a7b.f("PhoneSleepTask", "insertData(" + this.f19419j + ") : errorCode = " + (result != null ? Integer.valueOf(result.getErrorCode()) : null));
            if (result != null) {
                this.k.invoke(Integer.valueOf(result.getErrorCode()));
            }
        }
    }

    static {
        SensorManager sensorManager;
        Object systemService = b78.a().getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            a7b.f("PhoneSleepTask", "SensorManager init err");
            sensorManager = null;
        }
        mSensorManager = sensorManager;
        $stable = 8;
    }

    public final boolean a(@NotNull List<? extends SportHealthData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        boolean z = true;
        if (!(!data.isEmpty())) {
            return false;
        }
        int[] iArr = {4, 2, 3};
        for (SportHealthData sportHealthData : data) {
            if ((sportHealthData instanceof Sleep) && ArraysKt___ArraysKt.contains(iArr, ((Sleep) sportHealthData).getSleepState())) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public final boolean b() {
        List<SupportedPhoneBean.PhoneMeasureSleep> list = mWhitelist;
        list.clear();
        list.addAll(uu3.b());
        a7b.f("PhoneSleepTask", "check whitelist size:" + list.size());
        boolean z = false;
        for (SupportedPhoneBean.PhoneMeasureSleep phoneMeasureSleep : list) {
            String model = phoneMeasureSleep.getModel();
            StringBuilder sb = new StringBuilder();
            sb.append("checkList:");
            sb.append(model);
            if (Intrinsics.areEqual(phoneMeasureSleep.getModel(), Build.MODEL)) {
                z = true;
            }
        }
        if (!z) {
            a7b.f("PhoneSleepTask", "phone not support sleep feature");
            return false;
        }
        SensorManager sensorManager = mSensorManager;
        if (sensorManager == null) {
            a7b.f("PhoneSleepTask", "checkMeasureSensor:sensorManager exception");
            return false;
        }
        if (sensorManager.getDefaultSensor(33171065, true) != null) {
            return true;
        }
        a7b.f("PhoneSleepTask", "checkMeasureSensor:getSensor exception");
        return false;
    }

    public final boolean c() {
        List<SupportedPhoneBean.PhoneMeasureSnore> list = mSnoreWhitelist;
        list.clear();
        list.addAll(uu3.c());
        a7b.f("PhoneSleepTask", "check measure sensorOsa size:" + list.size());
        boolean z = false;
        for (SupportedPhoneBean.PhoneMeasureSnore phoneMeasureSnore : list) {
            String model = phoneMeasureSnore.getModel();
            StringBuilder sb = new StringBuilder();
            sb.append("checkList:");
            sb.append(model);
            if (Intrinsics.areEqual(phoneMeasureSnore.getModel(), Build.MODEL)) {
                z = true;
            }
        }
        if (!z) {
            a7b.f("PhoneSleepTask", "phone not support sensorOsa");
        }
        return z;
    }

    @NotNull
    public final lbd<List<SleepIndex>> d(long startTime, long endTime, @NotNull String deviceUniqueId) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        a7b.f("PhoneSleepTask", "getPhoneSleepIndex: start:" + startTime + " endTime = " + endTime);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        lbd<List<SleepIndex>> lbdVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new a(deviceUniqueId)).t0(b.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(lbdVarT0, "deviceUniqueId: String):…ArrayList()\n            }");
        return lbdVarT0;
    }

    public final void e(int table, List<? extends SportHealthData> list, Function1<? super Integer, Unit> saveResult) {
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDataTable(table);
        dataInsertOption.setDatas(list);
        a7b.f("PhoneSleepTask", "insert(" + table + ") data size is: " + dataInsertOption.getDatas().size());
        StringBuilder sb = new StringBuilder();
        sb.append("insertDetailData(");
        sb.append(table);
        sb.append("): ");
        sb.append(dataInsertOption);
        SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).subscribe(new c(table, saveResult));
    }

    public final void f(@NotNull List<? extends SportHealthData> list, @NotNull Function1<? super Integer, Unit> saveResult) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(saveResult, "saveResult");
        e(IONetService.Stub.TRANSACTION_isAccountLogin, list, saveResult);
    }

    public final void g(@NotNull List<? extends SportHealthData> list, @NotNull Function1<? super Integer, Unit> saveResult) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(saveResult, "saveResult");
        e(1008, list, saveResult);
    }

    public final void h(@NotNull List<? extends SportHealthData> list, @NotNull Function1<? super Integer, Unit> saveResult) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(saveResult, "saveResult");
        e(IONetService.Stub.TRANSACTION_getQrCodeMessage, list, saveResult);
    }

    public final void i(@NotNull List<? extends SportHealthData> list, @NotNull Function1<? super Integer, Unit> saveResult) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(saveResult, "saveResult");
        e(1010, list, saveResult);
    }

    public final void j(@NotNull List<? extends SportHealthData> sleepIndexList, @NotNull Function1<? super Integer, Unit> saveResult) {
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        Intrinsics.checkNotNullParameter(saveResult, "saveResult");
        if (!sleepIndexList.isEmpty()) {
            e(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback, sleepIndexList, saveResult);
        } else {
            a7b.f("PhoneSleepTask", "sleepIndex list is empty");
            saveResult.invoke(101005);
        }
    }

    public final boolean k(@NotNull SensorEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        SensorManager sensorManager = mSensorManager;
        if (sensorManager == null) {
            a7b.f("PhoneSleepTask", "registerSensor sensor-manager null");
            return false;
        }
        a7b.f("PhoneSleepTask", "start measure");
        Sensor defaultSensor = sensorManager.getDefaultSensor(33171065, true);
        if (defaultSensor != null) {
            a7b.f("PhoneSleepTask", "starting measure");
            return sensorManager.registerListener(listener, defaultSensor, 100000);
        }
        a7b.f("PhoneSleepTask", "registerSensor sensor null");
        return false;
    }

    public final void l(@NotNull SensorEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        SensorManager sensorManager = mSensorManager;
        if (sensorManager != null) {
            a7b.f("PhoneSleepTask", "stop measure");
            Sensor defaultSensor = sensorManager.getDefaultSensor(33171065, true);
            if (defaultSensor == null) {
                a7b.f("PhoneSleepTask", "stop measure");
                return;
            }
            a7b.f("PhoneSleepTask", "stopping measure(" + sensorManager.registerListener(listener, defaultSensor, 50000) + ")");
        }
    }

    public final void m(@NotNull SensorEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        SensorManager sensorManager = mSensorManager;
        if (sensorManager == null) {
            a7b.f("PhoneSleepTask", "unregisterSensor sensor-manager null");
            return;
        }
        a7b.f("PhoneSleepTask", "unregisterSensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(33171065, true);
        if (defaultSensor != null) {
            sensorManager.unregisterListener(listener, defaultSensor);
        } else {
            a7b.f("PhoneSleepTask", "unregisterSensor sensor null");
        }
    }
}
