package com.heytap.device.sleep;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.databaseengine.model.UserPreference;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.protocol.fitness.FitnessProto$SleepModelSetting;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.joh;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.zqh;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.KotlinNothingValueException;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/device/sleep/SleepModeRepository;", "", "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
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

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J$\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eJ\u0018\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0014R\u0014\u0010%\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010&¨\u0006-"}, d2 = {"Lcom/heytap/device/sleep/SleepModeRepository$Companion;", "", "", "forceLoadFromCloud", "Lcom/heytap/databaseengine/model/SleepModelSettings;", b2n.g, "setting", "", "i", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;", LogFieldKey.LEVEL_KEY, "", LogFieldKey.MESSAGE_KEY, "", "c", "b", MapSchema.FIELD_NAME_KEY, "j", "d", b2n.f, "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "useDefault", MapSchema.FIELD_NAME_ENTRY, "", ClickApiEntity.TIME, "o", LogFieldKey.PROCESS_NAME_KEY, "sleepMode", "q", "Lcom/heytap/health/protocol/fitness/FitnessProto$SleepModelSetting;", "deviceProtoData", "a", "type", "action", "r", "n", "ACTION_SLEEP_SETTING_CHANGED", "Ljava/lang/String;", "ACTION_SLEEP_SETTING_CHANGED_FROM_TP", "NOTIFICATION_ID", "I", "TAG", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "it", "", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)V"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements o14 {
            public final /* synthetic */ SportHealthSetting i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f3008j;
            public final /* synthetic */ List<String> k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f3009l;

            public a(SportHealthSetting sportHealthSetting, boolean z, List<String> list, CountDownLatch countDownLatch) {
                this.i = sportHealthSetting;
                this.f3008j = z;
                this.k = list;
                this.f3009l = countDownLatch;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0064  */
            @Override // com.oplus.aiunit.vision.o14
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull CommonBackBean it) {
                String strB;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getErrorCode() != 0 || it.getObj() == null) {
                    strB = null;
                } else {
                    Object obj = it.getObj();
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<com.heytap.databaseengine.model.UserPreference>{ kotlin.collections.TypeAliasesKt.ArrayList<com.heytap.databaseengine.model.UserPreference> }");
                    ArrayList arrayList = (ArrayList) obj;
                    if (!(!arrayList.isEmpty()) || TextUtils.isEmpty(((UserPreference) arrayList.get(0)).getValue())) {
                        strB = null;
                    } else {
                        strB = ((UserPreference) arrayList.get(0)).getValue();
                        a7b.f(SleepModeRepository.TAG, "Read preference success, name=" + this.i.name() + ", value=" + strB);
                    }
                }
                if (strB == null && this.f3008j) {
                    strB = joh.b(this.i);
                    a7b.f(SleepModeRepository.TAG, "Read preference is empty, name=" + this.i.name() + ", use default=" + strB);
                }
                List<String> list = this.k;
                Intrinsics.checkNotNull(strB);
                list.add(strB);
                this.f3009l.countDown();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        public static final class b<T> implements o14 {
            public final /* synthetic */ boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f3010j;
            public final /* synthetic */ SportHealthSetting k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ List<String> f3011l;
            public final /* synthetic */ CountDownLatch m;

            public b(boolean z, boolean z2, SportHealthSetting sportHealthSetting, List<String> list, CountDownLatch countDownLatch) {
                this.i = z;
                this.f3010j = z2;
                this.k = sportHealthSetting;
                this.f3011l = list;
                this.m = countDownLatch;
            }

            @Override // com.oplus.aiunit.vision.o14
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!this.i && this.f3010j) {
                    String result = joh.b(this.k);
                    a7b.f(SleepModeRepository.TAG, "Read preference fail, name=" + this.k.name() + ", use default=" + result + ", error:" + it);
                    List<String> list = this.f3011l;
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    list.add(result);
                }
                this.m.countDown();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "it", "", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)V"}, k = 3, mv = {1, 8, 0})
        public static final class c<T> implements o14 {
            public final /* synthetic */ AtomicBoolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f3012j;

            public c(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
                this.i = atomicBoolean;
                this.f3012j = countDownLatch;
            }

            @Override // com.oplus.aiunit.vision.o14
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull CommonBackBean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.i.set(it.getErrorCode() == 0);
                this.f3012j.countDown();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        public static final class d<T> implements o14 {
            public final /* synthetic */ AtomicBoolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f3013j;

            public d(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
                this.i = atomicBoolean;
                this.f3013j = countDownLatch;
            }

            @Override // com.oplus.aiunit.vision.o14
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                a7b.b(SleepModeRepository.TAG, "Save sleep mode to db fail=" + it);
                this.i.set(false);
                this.f3013j.countDown();
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
        public final SleepModelSettings a(@NotNull FitnessProto$SleepModelSetting deviceProtoData) {
            Intrinsics.checkNotNullParameter(deviceProtoData, "deviceProtoData");
            SleepModelSettings sleepModelSettings = new SleepModelSettings();
            sleepModelSettings.setTimestamp(deviceProtoData.getTime());
            sleepModelSettings.setStartNow(zqh.d(deviceProtoData.getStartNow()) ? 1 : 0);
            sleepModelSettings.setAccordRestSwitch(zqh.d(deviceProtoData.getAccordRestSwitch()) ? 1 : 0);
            sleepModelSettings.setStateSyncUpdateTime(deviceProtoData.getStateSyncTime());
            sleepModelSettings.setStateSync(zqh.d(deviceProtoData.getStateSync()) ? 1 : 0);
            return sleepModelSettings;
        }

        @JvmStatic
        public final int b(boolean forceLoadFromCloud) {
            String strF = f(this, SportHealthSetting.BED_TIME_SWITCH, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        @JvmStatic
        public final int c(boolean forceLoadFromCloud) {
            String strF = f(this, SportHealthSetting.BED_TIME, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th))) != null) {
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
            a7b.f(SleepModeRepository.TAG, "Start read setting from db, name=" + item + " userDefault=" + useDefault + " forceLoadFromCloud=" + forceLoadFromCloud);
            String ssoid = um.c().getSsoid();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList = new ArrayList();
            String strB = "";
            SportHealthDataAPI.getInstance().getUserPreferenceNew(ssoid, item.name(), "", forceLoadFromCloud).L0(su8.c()).n0(su8.c()).b(new a(item, useDefault, arrayList, countDownLatch), new b(forceLoadFromCloud, useDefault, item, arrayList, countDownLatch));
            countDownLatch.await(10L, TimeUnit.SECONDS);
            if (!arrayList.isEmpty()) {
                return (String) arrayList.get(0);
            }
            if (forceLoadFromCloud) {
                return e(item, useDefault, false);
            }
            if (useDefault) {
                strB = joh.b(item);
                a7b.f(SleepModeRepository.TAG, "Read preference fail, name=" + item.name() + ", use default=" + strB);
            }
            Intrinsics.checkNotNullExpressionValue(strB, "{\n                if (fo…          }\n            }");
            return strB;
        }

        public final int g(boolean forceLoadFromCloud) {
            String strF = f(this, SportHealthSetting.SLEEP_GOAL, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        @JvmStatic
        @NotNull
        public final SleepModelSettings h(boolean forceLoadFromCloud) {
            SleepModelSettings sleepModelSettings = (SleepModelSettings) sc8.b(f(this, SportHealthSetting.SLEEP_MODEL_SETTINGS, false, forceLoadFromCloud, 2, null), new TypeToken<SleepModelSettings>() { // from class: com.heytap.device.sleep.SleepModeRepository$Companion$readSleepModeFromDBAndSP$modeSettings$1
            }.getType());
            if (sleepModelSettings == null) {
                sleepModelSettings = new SleepModelSettings();
            }
            i(sleepModelSettings);
            a7b.f(SleepModeRepository.TAG, "Read sleep mode from DB+SP, it=" + sleepModelSettings);
            return sleepModelSettings;
        }

        public final void i(@NotNull SleepModelSettings setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            setting.setStateSyncUpdateTime(v9g.w().B("sleep_setting_state_sync_last_time", 0L));
        }

        public final int j(boolean forceLoadFromCloud) {
            String strF = f(this, SportHealthSetting.STAY_UP_BED_TIME_SWITCH, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        public final int k(boolean forceLoadFromCloud) {
            String strF = f(this, SportHealthSetting.STAY_UP_BED_TIME, false, forceLoadFromCloud, 2, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                return Integer.parseInt(strF);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th))) != null) {
                    return 0;
                }
                throw new KotlinNothingValueException();
            }
        }

        @JvmStatic
        @Nullable
        public final SleepSettingBean.SleepRestSetting l(boolean forceLoadFromCloud) {
            return (SleepSettingBean.SleepRestSetting) sc8.b(m(forceLoadFromCloud), new TypeToken<SleepSettingBean.SleepRestSetting>() { // from class: com.heytap.device.sleep.SleepModeRepository$Companion$readUserRestFromDB$1
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
            v9g.w().T("sleep_setting_start_now_last_time", time);
        }

        public final void p(long time) {
            a7b.f(SleepModeRepository.TAG, "Save sleep mode sync update time=" + time);
            v9g.w().T("sleep_setting_state_sync_last_time", time);
        }

        @SuppressLint({"CheckResult"})
        public final boolean q(@NotNull SleepModelSettings sleepMode) throws InterruptedException {
            Intrinsics.checkNotNullParameter(sleepMode, "sleepMode");
            String dbJSON = sleepMode.toDbJSON();
            a7b.f(SleepModeRepository.TAG, "saveSleepModel: " + dbJSON);
            UserPreference userPreference = new UserPreference();
            userPreference.setSsoid(um.c().getSsoid());
            userPreference.setSyncStatus(0);
            userPreference.setModifiedTime(System.currentTimeMillis());
            userPreference.setKey(SportHealthSetting.SLEEP_MODEL_SETTINGS.name());
            userPreference.setValue(dbJSON);
            userPreference.setPushToCloud(true);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            SportHealthDataAPI.getInstance().setUserPreference(userPreference).L0(su8.c()).b(new c(atomicBoolean, countDownLatch), new d(atomicBoolean, countDownLatch));
            countDownLatch.await(10L, TimeUnit.SECONDS);
            return atomicBoolean.get();
        }

        public final void r(@NotNull SportHealthSetting type, @NotNull String action) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(action, "action");
            a7b.f(SleepModeRepository.TAG, "Send sleep setting changed broadcast, type=" + type.name() + " action=" + action);
            Context contextA = b78.a();
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
