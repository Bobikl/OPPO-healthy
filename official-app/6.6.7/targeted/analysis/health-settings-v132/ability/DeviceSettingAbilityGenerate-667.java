package com.heytap.health.settings.watch.sporthealthsettings2.ability;

import android.util.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.settings.DeviceSettings;
import com.oplus.aiunit.vision.as8;
import com.oplus.aiunit.vision.hy9;
import com.oplus.aiunit.vision.km4;
import com.oplus.aiunit.vision.lcg;
import com.oplus.aiunit.vision.r7i;
import com.oplus.aiunit.vision.svc;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.zr8;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006R\u001a\u0010\u001a\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ability/DeviceSettingAbilityGenerate;", "", "", "q", "", "mac", "Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "r", "g", "m", "l", "o", "b", "k", "j", "i", "h", "n", "d", "c", "f", "e", "a", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "TAG", "", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ability/DeviceSettingAbilityGenerate$DeviceAbilityRepo;", "Ljava/util/Map;", "deviceAbilityRepo", "<init>", "()V", "DeviceAbilityRepo", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceSettingAbilityGenerate {

    @NotNull
    public static final DeviceSettingAbilityGenerate INSTANCE = new DeviceSettingAbilityGenerate();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "Ability";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Map<String, DeviceAbilityRepo> deviceAbilityRepo = new LinkedHashMap();
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R/\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ability/DeviceSettingAbilityGenerate$DeviceAbilityRepo;", "Lcom/oplus/aiunit/vision/hy9;", "", "o", "i", "Lkotlin/Lazy;", "c", "()Ljava/lang/String;", "fileName", "", "<set-?>", "j", "Lcom/oplus/aiunit/vision/lcg;", "b", "()[B", "d", "([B)V", "abilityByte", "Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "k", "a", "()Lcom/heytap/health/settings/DeviceSettings$SettingAbility;", "ability", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class DeviceAbilityRepo implements hy9 {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final Lazy fileName = LazyKt.lazy(new Function0<String>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ability.DeviceSettingAbilityGenerate$DeviceAbilityRepo$fileName$2
            @NotNull
            public final String invoke() {
                return "ability_" + wl4.managerApi.getCurrActiveMac().hashCode();
            }
        });

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final lcg abilityByte = new lcg();

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Lazy ability = r7i.a(new Function0<DeviceSettings.SettingAbility>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ability.DeviceSettingAbilityGenerate$DeviceAbilityRepo$ability$2
            {
                super(0);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DeviceSettings.SettingAbility m5invoke() {
                byte[] bArrB = this.this$0.b();
                if (bArrB != null) {
                    return DeviceSettings.SettingAbility.parseFrom(bArrB);
                }
                return null;
            }
        });
        public static final /* synthetic */ KProperty<Object>[] l = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceAbilityRepo.class, "abilityByte", "getAbilityByte()[B", 0))};
        public static final int $stable = 8;

        @Nullable
        public final DeviceSettings.SettingAbility a() {
            return (DeviceSettings.SettingAbility) this.ability.getValue();
        }

        @Nullable
        public final byte[] b() {
            return this.abilityByte.a(this, l[0]);
        }

        public final String c() {
            return (String) this.fileName.getValue();
        }

        public final void d(@Nullable byte[] bArr) {
            this.abilityByte.b(this, l[0], bArr);
        }

        @NotNull
        public String identity() {
            return hy9.a.a(this);
        }

        @NotNull
        public String o() {
            return c();
        }
    }

    @NotNull
    public final DeviceSettings.SettingAbility b() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setExerciseDurationGoal(1).setActivityCountGoal(1).setSedentaryReminder(7).setDailyActivityNotification(13).setFallDetection(1).setHeartRateAutoMonitoring(1).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(1).setMentalPhysicalState(0).setBreathingRelaxationReminder(1).setMenstrualCycleReminder(0).setBloodOxygenSetting(3).setSnoringRiskAssessment(5).setSleepRespiratoryRateMonitoring(1).setSleepIntervalBloodOxygen(0).setRemSleepMonitoring(1).setSleepScheduleReminder(223).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setAutoVoiceBroadcast(1).setDoubleTapVoiceBroadcast(1).setExerciseDataDisplay(1).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility c() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(3).setHeartRateAutoMonitoring(29).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setSnoringRiskAssessment(5).setSleepIntervalBloodOxygen(1).setAutoPauseDuringExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …暂停支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility d() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(3).setDailyActivityNotification(15).setHeartRateAutoMonitoring(29).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(1).setBreathingRelaxationReminder(1).setSnoringRiskAssessment(5).setSleepIntervalBloodOxygen(1).setRemSleepMonitoring(1).setSleepScheduleReminder(95).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility e() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …目标支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility f() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(3).setHeartRateAutoMonitoring(7).setStressAutoMonitoring(1).setBreathingRelaxationReminder(1).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setSleepIntervalBloodOxygen(1).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility g() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setExerciseDurationGoal(1).setActivityCountGoal(1).setSedentaryReminder(7).setDailyActivityNotification(13).setFallDetection(1).setHeartRateAutoMonitoring(7).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(0).setBreathingRelaxationReminder(0).setMentalPhysicalState(1).setMentalPhysicalStateReminder(1).setAchievementReminder(1).setGoalSetting(7).setBloodOxygenSetting(3).setMenstrualCycleReminder(1).setSnoringRiskAssessment(6).setSleepRespiratoryRateMonitoring(1).setSleepIntervalBloodOxygen(0).setRemSleepMonitoring(1).setSleepScheduleReminder(223).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(0).setExerciseStartReminder(1).setExerciseContinueReminder(1).setExerciseEndReminder(1).setAutoVoiceBroadcast(1).setDoubleTapVoiceBroadcast(1).setButtonPauseContinue(0).setExerciseDataDisplay(0).setReminderDuringExercise(1).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility h() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(3).setHeartRateAutoMonitoring(1).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility i() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(3).setDailyActivityNotification(15).setFallDetection(1).setHeartRateAutoMonitoring(7).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(1).setBreathingRelaxationReminder(1).setSnoringRiskAssessment(5).setSleepIntervalBloodOxygen(1).setRemSleepMonitoring(1).setSleepScheduleReminder(95).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setAutoVoiceBroadcast(1).setExerciseDataDisplay(1).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility j() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(7).setDailyActivityNotification(15).setFallDetection(1).setHeartRateAutoMonitoring(7).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(1).setBreathingRelaxationReminder(1).setBloodOxygenSetting(3).setSnoringRiskAssessment(5).setSleepRespiratoryRateMonitoring(1).setRemSleepMonitoring(1).setSleepScheduleReminder(95).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setAutoVoiceBroadcast(1).setButtonPauseContinue(1).setExerciseDataDisplay(1).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility k() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setExerciseDurationGoal(1).setActivityCountGoal(1).setSedentaryReminder(7).setDailyActivityNotification(13).setFallDetection(1).setHeartRateAutoMonitoring(1).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(1).setBreathingRelaxationReminder(1).setBloodOxygenSetting(3).setSnoringRiskAssessment(5).setSleepRespiratoryRateMonitoring(1).setSleepIntervalBloodOxygen(0).setRemSleepMonitoring(1).setSleepScheduleReminder(223).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setAutoVoiceBroadcast(1).setDoubleTapVoiceBroadcast(1).setButtonPauseContinue(1).setExerciseDataDisplay(1).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility l() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setExerciseDurationGoal(1).setActivityCountGoal(1).setSedentaryReminder(7).setDailyActivityNotification(13).setFallDetection(1).setHeartRateAutoMonitoring(7).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(0).setBreathingRelaxationReminder(0).setMentalPhysicalState(1).setMentalPhysicalStateReminder(1).setAchievementReminder(1).setGoalSetting(7).setBloodOxygenSetting(3).setMenstrualCycleReminder(1).setSnoringRiskAssessment(5).setSleepRespiratoryRateMonitoring(1).setSleepIntervalBloodOxygen(0).setRemSleepMonitoring(1).setSleepScheduleReminder(223).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setExerciseStartReminder(0).setExerciseContinueReminder(0).setExerciseEndReminder(0).setAutoVoiceBroadcast(1).setDoubleTapVoiceBroadcast(1).setButtonPauseContinue(0).setExerciseDataDisplay(0).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility m() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setExerciseDurationGoal(1).setActivityCountGoal(1).setSedentaryReminder(7).setDailyActivityNotification(13).setFallDetection(1).setHeartRateAutoMonitoring(7).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(0).setBreathingRelaxationReminder(0).setMentalPhysicalState(1).setMentalPhysicalStateReminder(1).setAchievementReminder(1).setGoalSetting(7).setBloodOxygenSetting(3).setMenstrualCycleReminder(1).setSnoringRiskAssessment(5).setSleepRespiratoryRateMonitoring(1).setSleepIntervalBloodOxygen(0).setRemSleepMonitoring(1).setSleepScheduleReminder(223).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setExerciseStartReminder(0).setExerciseContinueReminder(0).setExerciseEndReminder(0).setAutoVoiceBroadcast(1).setDoubleTapVoiceBroadcast(1).setButtonPauseContinue(0).setExerciseDataDisplay(0).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility n() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setSedentaryReminder(3).setHeartRateAutoMonitoring(29).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setSnoringRiskAssessment(5).setSleepIntervalBloodOxygen(1).setRemSleepMonitoring(1).setSleepScheduleReminder(95).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final DeviceSettings.SettingAbility o() {
        DeviceSettings.SettingAbility settingAbilityBuild = DeviceSettings.SettingAbility.newBuilder().setStepGoal(1).setActivityConsumptionGoal(1).setExerciseDurationGoal(1).setActivityCountGoal(1).setSedentaryReminder(7).setDailyActivityNotification(13).setFallDetection(1).setHeartRateAutoMonitoring(7).setRestingHeartRateWarning(7).setExerciseHeartRateWarning(3).setIrregularHeartRateWarning(1).setStressAutoMonitoring(0).setBreathingRelaxationReminder(0).setMentalPhysicalState(1).setMentalPhysicalStateReminder(1).setAchievementReminder(1).setGoalSetting(7).setBloodOxygenSetting(3).setMenstrualCycleReminder(0).setSnoringRiskAssessment(5).setSleepRespiratoryRateMonitoring(1).setSleepIntervalBloodOxygen(0).setRemSleepMonitoring(1).setSleepScheduleReminder(223).setSleepDataCalibration(1).setAutoPauseDuringExercise(1).setAutoExerciseRecognition(1).setExerciseStartReminder(0).setExerciseContinueReminder(0).setExerciseEndReminder(0).setAutoVoiceBroadcast(1).setDoubleTapVoiceBroadcast(1).setButtonPauseContinue(0).setExerciseDataDisplay(0).setCustomExercise(1).build();
        Intrinsics.checkNotNullExpressionValue(settingAbilityBuild, "newBuilder()\n           …运动支持\n            .build()");
        return settingAbilityBuild;
    }

    @NotNull
    public final String p() {
        return TAG;
    }

    public final void q() {
        wl4.devicePrimary.a.l(new km4.b() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ability.DeviceSettingAbilityGenerate$init$1
            public void d(@NotNull Node node, @NotNull svc nodeStatus) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
                Map map = DeviceSettingAbilityGenerate.deviceAbilityRepo;
                String nodeId = node.getNodeId();
                Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
                Object deviceAbilityRepo2 = map.get(nodeId);
                if (deviceAbilityRepo2 == null) {
                    deviceAbilityRepo2 = new DeviceSettingAbilityGenerate.DeviceAbilityRepo();
                    map.put(nodeId, deviceAbilityRepo2);
                }
                BuildersKt.launch$default(as8.a(zr8.INSTANCE.b("settAbility")), (CoroutineContext) null, (CoroutineStart) null, new DeviceSettingAbilityGenerate$init$1$onNodeStatusChanged$1((DeviceSettingAbilityGenerate.DeviceAbilityRepo) deviceAbilityRepo2, node, null), 3, (Object) null);
            }

            public void getInterestingStatus(@NotNull ArraySet<svc> interests) {
                Intrinsics.checkNotNullParameter(interests, "interests");
                interests.add(svc.e.INSTANCE);
            }
        });
    }

    @Nullable
    public final DeviceSettings.SettingAbility r(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return deviceAbilityRepo.getOrDefault(mac, new DeviceAbilityRepo()).a();
    }
}