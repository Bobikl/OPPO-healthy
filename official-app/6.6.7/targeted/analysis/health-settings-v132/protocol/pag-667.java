package com.oplus.aiunit.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wl4;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/pag;", "", "Companion", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class pag {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int HEALTH_LIFE = 1;
    public static final int HEART_RATE_AI = 3;
    public static final int HEART_RATE_INTERVAL_SIX = 2;
    public static final int HEART_RATE_INTERVAL_TWO = 1;
    public static final int HEART_RATE_REALTIME = 4;
    public static final int HEART_RATE_REALTIME_FOR_BAND = 0;
    public static final int IMPROVE_PERFORMANCE = 3;
    public static final int MAINTAINING_FITNESS = 2;
    public static final int SPO2_TYPE_INTERVAL = 1;
    public static final int SPO2_TYPE_REALTIME = 0;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.pag$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/pag$a;", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "", "c", "d", "e", "f", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "settings", "Lcom/oplus/aiunit/vision/q3;", "a", "", "HEALTH_LIFE", "I", "HEART_RATE_AI", "HEART_RATE_INTERVAL_SIX", "HEART_RATE_INTERVAL_TWO", "HEART_RATE_REALTIME", "HEART_RATE_REALTIME_FOR_BAND", "IMPROVE_PERFORMANCE", "MAINTAINING_FITNESS", "SPO2_TYPE_INTERVAL", "SPO2_TYPE_REALTIME", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.pag$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0158a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SportHealthSetting.values().length];
                try {
                    iArr[SportHealthSetting.STEP_GOAL_VALUE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SportHealthSetting.CALORIE_GOAL_VALUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SportHealthSetting.EXERCISE_TIME_GOAL_VALUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SportHealthSetting.ACTIVITY_GOAL_VALUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SportHealthSetting.SEDENTARY_REMIND_ENABLE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SportHealthSetting.DISABLE_IN_LUNCH_BREAK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SportHealthSetting.ACTIVITY_PRAISE_NOTIFY_ENABLE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[SportHealthSetting.FALL_DOWN_ENABLE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[SportHealthSetting.HEART_RATE_TYPE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[SportHealthSetting.QUIET_RATE_VALUE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[SportHealthSetting.QUIET_RATE_LOW_VALUE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[SportHealthSetting.HIGH_RATE_VALUE.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[SportHealthSetting.AFIB_ENABLE.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[SportHealthSetting.BLOOD_SUGAR_DEVICE_ENABLE.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_VALUE.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[SportHealthSetting.BLOOD_SUGAR_TIME_VALUE.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[SportHealthSetting.BLOOD_SUGAR_BEFORE_BED_TIME_ENABLE.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_ENABLE.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[SportHealthSetting.BLOOD_SUGAR_BEFORE_EXERCISE_VALUE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[SportHealthSetting.LOW_SPO2_WARNING_ENABLE.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[SportHealthSetting.SPO2_WARNING_VALUE.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[SportHealthSetting.WRIST_TEMPERATURE_ENABLE.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[SportHealthSetting.OSA_ENABLE.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[SportHealthSetting.SLEEP_APNEA_MONITORING.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[SportHealthSetting.OXIMETRY.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[SportHealthSetting.OXIMETRY_TYPE.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[SportHealthSetting.SLEEP_BREATHING_RATE_ENABLE.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[SportHealthSetting.SLEEP_REM_ENABLE.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_PAUSE_SPORT_ENABLE.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ENABLE.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RUN_ENABLE.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RUN_RECORDTYPE.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_WALK_ENABLE.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_WALK_RECORDTYPE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ROWING_ENABLE.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ROWING_RECORDTYPE.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ELLIPTICAL_ENABLE.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_ELLIPTICAL_RECORDTYPE.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RIDE_ENABLE.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_RIDE_RECORDTYPE.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_SWIM_ENABLE.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_SWIM_RECORDTYPE.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_CLIMBE_ENABLE.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[SportHealthSetting.AUTO_RECOGNIZE_SPORT_CLIMB_RECORDTYPE.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[SportHealthSetting.SPORTS_VOICE_BROADCAST_ENABLE.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[SportHealthSetting.DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_ENABLE.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[SportHealthSetting.BUTTON_TO_PAUSE_OR_RESUME_ENABLE.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[SportHealthSetting.SPORTS_GOAL_VALUE.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[SportHealthSetting.MEDITATION_BREATH_VALUE.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[SportHealthSetting.MENSTRUAL_CYCLE_ENABLE.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[SportHealthSetting.CONTINUE_SPORT_REMINDER_ENABLE.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[SportHealthSetting.END_SPORT_REMINDER_ENABLE.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[SportHealthSetting.NAP_NEWGOALSETTINGSELECTED.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[SportHealthSetting.NAP_REGULAREARLYBEDTIME.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[SportHealthSetting.NAP_SUNSHINEDURATION.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final q3 a(@NotNull SportHealthSetting item, @NotNull DeviceSettings settings) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(settings, "settings");
            switch (C0158a.$EnumSwitchMapping$0[item.ordinal()]) {
                case 1:
                    return settings.getStepGoal();
                case 2:
                    return settings.getCalorieGoal();
                case 3:
                    return settings.getExerciseTimeGoal();
                case 4:
                    return settings.getActivityGoal();
                case 5:
                case 6:
                case 7:
                    return settings.getSedentary();
                case 8:
                case 9:
                case 10:
                case 11:
                    return settings.getActivityNotification();
                case 12:
                    return settings.getFallDown();
                case 13:
                case 14:
                    return settings.getAutoMeasureHeartRate();
                case 15:
                case 16:
                case 17:
                    return settings.getQuietHeartRate();
                case 18:
                case 19:
                    return settings.getSportsHeartRate();
                case 20:
                    return settings.getAfib();
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    return settings.getBloodSugar();
                case 27:
                    return settings.getStressAutoMeasure();
                case 28:
                    return settings.getBreatheRelax();
                case 29:
                case 30:
                case 31:
                    return settings.getSpo2AllDayMonitor();
                case 32:
                    return settings.getWristTemperature();
                case 33:
                case 34:
                    return settings.getOsa();
                case 35:
                case 36:
                case 37:
                case 38:
                    UserDeviceInfo userDeviceInfoJ = wl4.managerApi.j();
                    return lki.a(userDeviceInfoJ != null ? userDeviceInfoJ.getMac() : null).O5() ? settings.getOsa() : settings.getSpo2();
                case 39:
                case 40:
                    return settings.getSpo2();
                case 41:
                    return settings.getBreatheRate();
                case 42:
                    return settings.getSleepRem();
                case 43:
                    return settings.getSportsAutoPause();
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                    return settings.getSportsAutoRecognize();
                case 59:
                    return settings.getSportsVoiceBroadcast();
                case 60:
                    return settings.getDoubleClickVoiceBroadcast();
                case 61:
                    return settings.getButtonToPauseOrResume();
                case 62:
                    return settings.getSportsGoalSettings();
                case 63:
                    return settings.getMeditationBreathSettings();
                case 64:
                    return settings.getMenstrualCycleSettings();
                case 65:
                    return settings.getAchievementReminderSettings();
                case 66:
                    return settings.getContinueSportRemindSettings();
                case 67:
                    return settings.getEndSportRemindSettings();
                case 68:
                    return settings.getNewGoalSettingSelected();
                case 69:
                    return settings.getRegularEarlyBedtimeSettings();
                case 70:
                    return settings.getSunshineDurationSettings();
                default:
                    m8b.f("SHSettingHelper", "unknown setting item = " + item.name());
                    return null;
            }
        }

        @JvmStatic
        public final boolean b(@NotNull SportHealthSetting item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item == SportHealthSetting.MENSTRUAL_CYCLE_ENABLE;
        }

        @JvmStatic
        public final boolean c(@NotNull SportHealthSetting item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item == SportHealthSetting.CALORIE_GOAL_VALUE || item == SportHealthSetting.STEP_GOAL_VALUE || item == SportHealthSetting.EXERCISE_TIME_GOAL_VALUE || item == SportHealthSetting.ACTIVITY_GOAL_VALUE || item == SportHealthSetting.HIGH_RATE_NOTIFICATION_ENABLE || item == SportHealthSetting.HIGH_RATE_VALUE || item == SportHealthSetting.QUIET_RATE_NOTIFICATION_ENABLE || item == SportHealthSetting.QUIET_RATE_VALUE || item == SportHealthSetting.QUIET_RATE_LOW_VALUE || item == SportHealthSetting.SLEEP_MODEL_SETTINGS || item == SportHealthSetting.USER_REST_NEW || item == SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE || item == SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE || item == SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE || item == SportHealthSetting.SPORTS_GOAL_VALUE || item == SportHealthSetting.MENSTRUAL_CYCLE_ENABLE || item == SportHealthSetting.SEDENTARY_REMIND_ENABLE || item == SportHealthSetting.DISABLE_IN_LUNCH_BREAK || item == SportHealthSetting.RESUME_ACTIVITY_REMINDER_ENABLE || item == SportHealthSetting.ACTIVITY_COMPLETE_NOTIFY_ENABLE || item == SportHealthSetting.HEALTH_DAILY_REPORT_ENABLE || item == SportHealthSetting.HEALTH_WEEK_REPORT_ENABLE || item == SportHealthSetting.FALL_DOWN_ENABLE || item == SportHealthSetting.AUTO_MEASURE_HEART_RATE_ENABLE || item == SportHealthSetting.HEART_RATE_TYPE || item == SportHealthSetting.AFIB_ENABLE || item == SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE || item == SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE || item == SportHealthSetting.MEDITATION_BREATH_VALUE || item == SportHealthSetting.SPO2_ALL_DAY_MONITOR_ENABLE || item == SportHealthSetting.LOW_SPO2_WARNING_ENABLE || item == SportHealthSetting.SPO2_WARNING_VALUE || item == SportHealthSetting.OSA_ENABLE || item == SportHealthSetting.SLEEP_APNEA_MONITORING || item == SportHealthSetting.SLEEP_BREATHING_RATE_ENABLE || item == SportHealthSetting.SLEEP_REM_ENABLE || item == SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE || item == SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE || item == SportHealthSetting.NAP_SUNSHINEDURATION || item == SportHealthSetting.NAP_REGULAREARLYBEDTIME || item == SportHealthSetting.NAP_NEWGOALSETTINGSELECTED;
        }

        @JvmStatic
        public final boolean d(@NotNull SportHealthSetting item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item == SportHealthSetting.AUTO_STOP_AUDIO_FILE_ENABLE || item == SportHealthSetting.AUTO_CLEAN_UP_AUDIO_FILE_ENABLE || item == SportHealthSetting.AUDIO_FILE_KEEP_TO_CLOUD_ENABLE || item == SportHealthSetting.AUTOMATIC_SNORING_MONITOR_ENABLE;
        }

        @JvmStatic
        public final boolean e(@NotNull SportHealthSetting item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item == SportHealthSetting.STRESS_AUTO_MEASURE_ENABLE || item == SportHealthSetting.STRESS_HIGH_NOTIFY_ENABLE || item == SportHealthSetting.MEDITATION_BREATH_VALUE || item == SportHealthSetting.ACHIEVEMENT_REMINDER_ENABLE;
        }

        @JvmStatic
        public final boolean f(@NotNull SportHealthSetting item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item == SportHealthSetting.AUTO_PAUSE_SPORT_ENABLE || item == SportHealthSetting.SPORTS_VOICE_BROADCAST_ENABLE || item == SportHealthSetting.DOUBLE_CLICK_SCREEN_VOICE_BROADCAST_ENABLE || item == SportHealthSetting.BUTTON_TO_PAUSE_OR_RESUME_ENABLE;
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull SportHealthSetting sportHealthSetting) {
        return INSTANCE.b(sportHealthSetting);
    }

    @JvmStatic
    public static final boolean b(@NotNull SportHealthSetting sportHealthSetting) {
        return INSTANCE.c(sportHealthSetting);
    }

    @JvmStatic
    public static final boolean c(@NotNull SportHealthSetting sportHealthSetting) {
        return INSTANCE.e(sportHealthSetting);
    }

    @JvmStatic
    public static final boolean d(@NotNull SportHealthSetting sportHealthSetting) {
        return INSTANCE.f(sportHealthSetting);
    }
}