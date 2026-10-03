package com.heytap.device.sleep;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.api.ISportHealthDataAPI;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.databaseengine.model.UserPreference;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.ash;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.quh;
import com.oplus.aiunit.vision.vd8;
import com.oplus.aiunit.vision.wv8;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/device/sleep/SleepModeRepository;", kq5.NOT_SET, "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepModeRepository {

    @NotNull
    public static final String ACTION_SLEEP_SETTING_CHANGED = "com.heytap.health.ACTION_SLEEP_SETTING_CHANGED";

    @NotNull
    public static final String ACTION_SLEEP_SETTING_CHANGED_FROM_TP = "com.heytap.health.ACTION_SLEEP_SETTING_CHANGED_FROM_TP";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SleepModeRepository";

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J$\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eJ\u0018\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0014R\u0014\u0010%\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010&¨\u0006-"}, d2 = {"Lcom/heytap/device/sleep/SleepModeRepository$Companion;", kq5.NOT_SET, kq5.NOT_SET, "forceLoadFromCloud", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "h", "setting", kq5.NOT_SET, "i", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;", "l", kq5.NOT_SET, "m", kq5.NOT_SET, "c", "b", "k", "j", "d", "g", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "useDefault", "e", kq5.NOT_SET, "time", "o", "p", "sleepMode", "q", "Lcom/heytap/health/protocol/fitness/FitnessProto$SleepModelSetting;", "deviceProtoData", "a", "type", "action", "r", "n", "ACTION_SLEEP_SETTING_CHANGED", "Ljava/lang/String;", "ACTION_SLEEP_SETTING_CHANGED_FROM_TP", "NOTIFICATION_ID", "I", "TAG", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "it", kq5.NOT_SET, "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)V"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements b24 {
            public final /* synthetic */ SportHealthSetting i;
            public final /* synthetic */ boolean j;
            public final /* synthetic */ List<String> k;
            public final /* synthetic */ CountDownLatch l;

            public a(SportHealthSetting sportHealthSetting, boolean z, List<String> list, CountDownLatch countDownLatch) {
                this.i = sportHealthSetting;
                this.j = z;
                this.k = list;
                this.l = countDownLatch;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0064  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull CommonBackBean commonBackBean) {
                String strB;
                Intrinsics.checkNotNullParameter(commonBackBean, "it");
                if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
                    strB = null;
                } else {
                    Object obj = commonBackBean.getObj();
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<com.heytap.databaseengine.model.UserPreference>{ kotlin.collections.TypeAliasesKt.ArrayList<com.heytap.databaseengine.model.UserPreference> }");
                    ArrayList arrayList = (ArrayList) obj;
                    if (!(!arrayList.isEmpty()) || TextUtils.isEmpty(((UserPreference) arrayList.get(0)).getValue())) {
                        strB = null;
                    } else {
                        strB = ((UserPreference) arrayList.get(0)).getValue();
                        m8b.f(SleepModeRepository.TAG, "Read preference success, name=" + this.i.name() + ", value=" + strB);
                    }
                }
                if (strB == null && this.j) {
                    strB = ash.b(this.i);
                    m8b.f(SleepModeRepository.TAG, "Read preference is empty, name=" + this.i.name() + ", use default=" + strB);
                }
                List<String> list = this.k;
                Intrinsics.checkNotNull(strB);
                list.add(strB);
                this.l.countDown();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {kq5.NOT_SET, "it", kq5.NOT_SET, "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        public static final class b<T> implements b24 {
            public final /* synthetic */ boolean i;
            public final /* synthetic */ boolean j;
            public final /* synthetic */ SportHealthSetting k;
            public final /* synthetic */ List<String> l;
            public final /* synthetic */ CountDownLatch m;

            public b(boolean z, boolean z2, SportHealthSetting sportHealthSetting, List<String> list, CountDownLatch countDownLatch) {
                this.i = z;
                this.j = z2;
                this.k = sportHealthSetting;
                this.l = list;
                this.m = countDownLatch;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                if (!this.i && this.j) {
                    String strB = ash.b(this.k);
                    m8b.f(SleepModeRepository.TAG, "Read preference fail, name=" + this.k.name() + ", use default=" + strB + ", error:" + th);
                    List<String> list = this.l;
                    Intrinsics.checkNotNullExpressionValue(strB, "result");
                    list.add(strB);
                }
                this.m.countDown();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "it", kq5.NOT_SET, "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)V"}, k = 3, mv = {1, 8, 0})
        public static final class c<T> implements b24 {
            public final /* synthetic */ AtomicBoolean i;
            public final /* synthetic */ CountDownLatch j;

            public c(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
                this.i = atomicBoolean;
                this.j = countDownLatch;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull CommonBackBean commonBackBean) {
                Intrinsics.checkNotNullParameter(commonBackBean, "it");
                this.i.set(commonBackBean.getErrorCode() == 0);
                this.j.countDown();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {kq5.NOT_SET, "it", kq5.NOT_SET, "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        public static final class d<T> implements b24 {
            public final /* synthetic */ AtomicBoolean i;
            public final /* synthetic */ CountDownLatch j;

            public d(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
                this.i = atomicBoolean;
                this.j = countDownLatch;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                m8b.b(SleepModeRepository.TAG, "Save sleep mode to db fail=" + th);
                this.i.set(false);
                this.j.countDown();
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String f(Companion companion, SportHealthSetting sportHealthSetting, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return companion.e(sportHealthSetting, z, z2);
        }

        @NotNull
        public final SleepModelSettings a(@NotNull FitnessProto.SleepModelSetting deviceProtoData) {
            Intrinsics.checkNotNullParameter(deviceProtoData, "deviceProtoData");
            SleepModelSettings sleepModelSettings = new SleepModelSettings();
            sleepModelSettings.setTimestamp(deviceProtoData.getTime());
            sleepModelSettings.setStartNow(quh.d(deviceProtoData.getStartNow()) ? 1 : 0);
            sleepModelSettings.setAccordRestSwitch(quh.d(deviceProtoData.getAccordRestSwitch()) ? 1 : 0);
            sleepModelSettings.setStateSyncUpdateTime(deviceProtoData.getStateSyncTime());
            sleepModelSettings.setStateSync(quh.d(deviceProtoData.getStateSync()) ? 1 : 0);
            return sleepModelSettings;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @JvmStatic
        public final int b(boolean forceLoadFromCloud) throws KotlinNothingValueException {
            String strF = f(this, SportHealthSetting.BED_TIME_SWITCH, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.Companion;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                if (Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @JvmStatic
        public final int c(boolean forceLoadFromCloud) throws KotlinNothingValueException {
            String strF = f(this, SportHealthSetting.BED_TIME, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.Companion;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                if (Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th))) != null) {
                    return 15;
                }
                throw new KotlinNothingValueException();
            }
        }

        @JvmStatic
        public final boolean d(boolean forceLoadFromCloud) {
            return Intrinsics.areEqual("1", f(this, SportHealthSetting.CLOSE_MUSIC, false, forceLoadFromCloud, 2, null));
        }

        @JvmStatic
        @SuppressLint({"CheckResult"})
        @NotNull
        public final String e(@NotNull SportHealthSetting item, boolean useDefault, boolean forceLoadFromCloud) throws InterruptedException {
            Intrinsics.checkNotNullParameter(item, "item");
            m8b.f(SleepModeRepository.TAG, "Start read setting from db, name=" + item + " userDefault=" + useDefault + " forceLoadFromCloud=" + forceLoadFromCloud);
            String ssoid = cn.c().getSsoid();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList = new ArrayList();
            ISportHealthDataAPI sportHealthDataAPI = SportHealthDataAPI.getInstance();
            String strName = item.name();
            String strB = kq5.NOT_SET;
            sportHealthDataAPI.getUserPreferenceNew(ssoid, strName, kq5.NOT_SET, forceLoadFromCloud).K0(wv8.c()).n0(wv8.c()).b(new a(item, useDefault, arrayList, countDownLatch), new b(forceLoadFromCloud, useDefault, item, arrayList, countDownLatch));
            countDownLatch.await(10L, TimeUnit.SECONDS);
            if (!arrayList.isEmpty()) {
                return (String) arrayList.get(0);
            }
            if (forceLoadFromCloud) {
                return e(item, useDefault, false);
            }
            if (useDefault) {
                strB = ash.b(item);
                m8b.f(SleepModeRepository.TAG, "Read preference fail, name=" + item.name() + ", use default=" + strB);
            }
            Intrinsics.checkNotNullExpressionValue(strB, "{\n                if (fo…          }\n            }");
            return strB;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final int g(boolean forceLoadFromCloud) throws KotlinNothingValueException {
            String strF = f(this, SportHealthSetting.SLEEP_GOAL, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.Companion;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                if (Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        @JvmStatic
        @NotNull
        public final SleepModelSettings h(boolean forceLoadFromCloud) {
            SleepModelSettings sleepModelSettings = (SleepModelSettings) vd8.b(f(this, SportHealthSetting.SLEEP_MODEL_SETTINGS, false, forceLoadFromCloud, 2, null), new TypeToken<SleepModelSettings>() { // from class: com.heytap.device.sleep.SleepModeRepository$Companion$readSleepModeFromDBAndSP$modeSettings$1
            }.getType());
            if (sleepModelSettings == null) {
                sleepModelSettings = new SleepModelSettings();
            }
            i(sleepModelSettings);
            m8b.f(SleepModeRepository.TAG, "Read sleep mode from DB+SP, it=" + sleepModelSettings);
            return sleepModelSettings;
        }

        public final void i(@NotNull SleepModelSettings setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            setting.setStateSyncUpdateTime(fdg.w().B("sleep_setting_state_sync_last_time", 0L));
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final int j(boolean forceLoadFromCloud) throws KotlinNothingValueException {
            String strF = f(this, SportHealthSetting.STAY_UP_BED_TIME_SWITCH, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.Companion;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                if (Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final int k(boolean forceLoadFromCloud) throws KotlinNothingValueException {
            String strF = f(this, SportHealthSetting.STAY_UP_BED_TIME, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.Companion;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                if (Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        @JvmStatic
        @Nullable
        public final SleepSettingBean.SleepRestSetting l(boolean forceLoadFromCloud) {
            return (SleepSettingBean.SleepRestSetting) vd8.b(m(forceLoadFromCloud), new TypeToken<SleepSettingBean.SleepRestSetting>() { // from class: com.heytap.device.sleep.SleepModeRepository$Companion$readUserRestFromDB$1
            }.getType());
        }

        @JvmStatic
        @NotNull
        public final String m(boolean forceLoadFromCloud) throws InterruptedException {
            String strE = e(SportHealthSetting.USER_REST_NEW, false, forceLoadFromCloud);
            return strE.length() == 0 ? e(SportHealthSetting.USER_REST, true, forceLoadFromCloud) : strE;
        }

        public final void n(@NotNull SportHealthSetting type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type == SportHealthSetting.USER_REST_NEW || type == SportHealthSetting.BED_TIME_SWITCH || type == SportHealthSetting.BED_TIME) {
                SleepRemindManager.p().C(false);
            }
        }

        public final void o(long time) {
            fdg.w().T("sleep_setting_start_now_last_time", time);
        }

        public final void p(long time) {
            m8b.f(SleepModeRepository.TAG, "Save sleep mode sync update time=" + time);
            fdg.w().T("sleep_setting_state_sync_last_time", time);
        }

        @SuppressLint({"CheckResult"})
        public final boolean q(@NotNull SleepModelSettings sleepMode) throws InterruptedException {
            Intrinsics.checkNotNullParameter(sleepMode, "sleepMode");
            String dbJSON = sleepMode.toDbJSON();
            m8b.f(SleepModeRepository.TAG, "saveSleepModel: " + dbJSON);
            UserPreference userPreference = new UserPreference();
            userPreference.setSsoid(cn.c().getSsoid());
            userPreference.setSyncStatus(0);
            userPreference.setModifiedTime(System.currentTimeMillis());
            userPreference.setKey(SportHealthSetting.SLEEP_MODEL_SETTINGS.name());
            userPreference.setValue(dbJSON);
            userPreference.setPushToCloud(true);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            SportHealthDataAPI.getInstance().setUserPreference(userPreference).K0(wv8.c()).b(new c(atomicBoolean, countDownLatch), new d(atomicBoolean, countDownLatch));
            countDownLatch.await(10L, TimeUnit.SECONDS);
            return atomicBoolean.get();
        }

        public final void r(@NotNull SportHealthSetting type, @NotNull String action) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(action, "action");
            m8b.f(SleepModeRepository.TAG, "Send sleep setting changed broadcast, type=" + type.name() + " action=" + action);
            Context contextA = e88.a();
            Intent intent = new Intent(action);
            intent.putExtra("type", type.name());
            intent.setPackage(contextA.getPackageName());
            contextA.sendBroadcast(intent);
        }
    }

    @JvmStatic
    public static final boolean a(boolean z) {
        return INSTANCE.d(z);
    }

    @JvmStatic
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final String b(@NotNull SportHealthSetting sportHealthSetting, boolean z, boolean z2) {
        return INSTANCE.e(sportHealthSetting, z, z2);
    }

    @JvmStatic
    @NotNull
    public static final String c(boolean z) {
        return INSTANCE.m(z);
    }
}