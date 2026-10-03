package com.heytap.health.settings;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.co5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DeviceSettings$SettingAbility extends GeneratedMessageLite<DeviceSettings$SettingAbility, Builder> implements DeviceSettings$SettingAbilityOrBuilder {
    public static final int ACHIEVEMENT_REMINDER_FIELD_NUMBER = 16;
    public static final int ACTIVITY_CONSUMPTION_GOAL_FIELD_NUMBER = 2;
    public static final int ACTIVITY_COUNT_GOAL_FIELD_NUMBER = 4;
    public static final int AUTO_EXERCISE_RECOGNITION_FIELD_NUMBER = 27;
    public static final int AUTO_PAUSE_DURING_EXERCISE_FIELD_NUMBER = 26;
    public static final int AUTO_VOICE_BROADCAST_FIELD_NUMBER = 31;
    public static final int BLOOD_OXYGEN_SETTING_FIELD_NUMBER = 18;
    public static final int BREATHING_RELAXATION_REMINDER_FIELD_NUMBER = 13;
    public static final int BUTTON_PAUSE_CONTINUE_FIELD_NUMBER = 33;
    public static final int CUSTOM_EXERCISE_FIELD_NUMBER = 36;
    public static final int DAILY_ACTIVITY_NOTIFICATION_FIELD_NUMBER = 6;
    private static final DeviceSettings$SettingAbility DEFAULT_INSTANCE;
    public static final int DOUBLE_TAP_VOICE_BROADCAST_FIELD_NUMBER = 32;
    public static final int EXERCISE_CONTINUE_REMINDER_FIELD_NUMBER = 29;
    public static final int EXERCISE_DATA_DISPLAY_FIELD_NUMBER = 34;
    public static final int EXERCISE_DURATION_GOAL_FIELD_NUMBER = 3;
    public static final int EXERCISE_END_REMINDER_FIELD_NUMBER = 30;
    public static final int EXERCISE_HEART_RATE_WARNING_FIELD_NUMBER = 10;
    public static final int EXERCISE_START_REMINDER_FIELD_NUMBER = 28;
    public static final int FALL_DETECTION_FIELD_NUMBER = 7;
    public static final int GOAL_SETTING_FIELD_NUMBER = 17;
    public static final int HEART_RATE_AUTO_MONITORING_FIELD_NUMBER = 8;
    public static final int IRREGULAR_HEART_RATE_WARNING_FIELD_NUMBER = 11;
    public static final int MENSTRUAL_CYCLE_REMINDER_FIELD_NUMBER = 19;
    public static final int MENTAL_PHYSICAL_STATE_FIELD_NUMBER = 14;
    public static final int MENTAL_PHYSICAL_STATE_REMINDER_FIELD_NUMBER = 15;
    private static volatile Parser<DeviceSettings$SettingAbility> PARSER = null;
    public static final int REMINDER_DURING_EXERCISE_FIELD_NUMBER = 35;
    public static final int REM_SLEEP_MONITORING_FIELD_NUMBER = 23;
    public static final int RESTING_HEART_RATE_WARNING_FIELD_NUMBER = 9;
    public static final int SEDENTARY_REMINDER_FIELD_NUMBER = 5;
    public static final int SLEEP_DATA_CALIBRATION_FIELD_NUMBER = 25;
    public static final int SLEEP_INTERVAL_BLOOD_OXYGEN_FIELD_NUMBER = 22;
    public static final int SLEEP_RESPIRATORY_RATE_MONITORING_FIELD_NUMBER = 21;
    public static final int SLEEP_SCHEDULE_REMINDER_FIELD_NUMBER = 24;
    public static final int SNORING_RISK_ASSESSMENT_FIELD_NUMBER = 20;
    public static final int STEP_GOAL_FIELD_NUMBER = 1;
    public static final int STRESS_AUTO_MONITORING_FIELD_NUMBER = 12;
    private int achievementReminder_;
    private int activityConsumptionGoal_;
    private int activityCountGoal_;
    private int autoExerciseRecognition_;
    private int autoPauseDuringExercise_;
    private int autoVoiceBroadcast_;
    private int bloodOxygenSetting_;
    private int breathingRelaxationReminder_;
    private int buttonPauseContinue_;
    private int customExercise_;
    private int dailyActivityNotification_;
    private int doubleTapVoiceBroadcast_;
    private int exerciseContinueReminder_;
    private int exerciseDataDisplay_;
    private int exerciseDurationGoal_;
    private int exerciseEndReminder_;
    private int exerciseHeartRateWarning_;
    private int exerciseStartReminder_;
    private int fallDetection_;
    private int goalSetting_;
    private int heartRateAutoMonitoring_;
    private int irregularHeartRateWarning_;
    private int menstrualCycleReminder_;
    private int mentalPhysicalStateReminder_;
    private int mentalPhysicalState_;
    private int remSleepMonitoring_;
    private int reminderDuringExercise_;
    private int restingHeartRateWarning_;
    private int sedentaryReminder_;
    private int sleepDataCalibration_;
    private int sleepIntervalBloodOxygen_;
    private int sleepRespiratoryRateMonitoring_;
    private int sleepScheduleReminder_;
    private int snoringRiskAssessment_;
    private int stepGoal_;
    private int stressAutoMonitoring_;

    public static final class Builder extends GeneratedMessageLite.Builder<DeviceSettings$SettingAbility, Builder> implements DeviceSettings$SettingAbilityOrBuilder {
        public Builder clearAchievementReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearAchievementReminder();
            return this;
        }

        public Builder clearActivityConsumptionGoal() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearActivityConsumptionGoal();
            return this;
        }

        public Builder clearActivityCountGoal() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearActivityCountGoal();
            return this;
        }

        public Builder clearAutoExerciseRecognition() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearAutoExerciseRecognition();
            return this;
        }

        public Builder clearAutoPauseDuringExercise() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearAutoPauseDuringExercise();
            return this;
        }

        public Builder clearAutoVoiceBroadcast() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearAutoVoiceBroadcast();
            return this;
        }

        public Builder clearBloodOxygenSetting() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearBloodOxygenSetting();
            return this;
        }

        public Builder clearBreathingRelaxationReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearBreathingRelaxationReminder();
            return this;
        }

        public Builder clearButtonPauseContinue() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearButtonPauseContinue();
            return this;
        }

        public Builder clearCustomExercise() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearCustomExercise();
            return this;
        }

        public Builder clearDailyActivityNotification() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearDailyActivityNotification();
            return this;
        }

        public Builder clearDoubleTapVoiceBroadcast() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearDoubleTapVoiceBroadcast();
            return this;
        }

        public Builder clearExerciseContinueReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearExerciseContinueReminder();
            return this;
        }

        public Builder clearExerciseDataDisplay() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearExerciseDataDisplay();
            return this;
        }

        public Builder clearExerciseDurationGoal() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearExerciseDurationGoal();
            return this;
        }

        public Builder clearExerciseEndReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearExerciseEndReminder();
            return this;
        }

        public Builder clearExerciseHeartRateWarning() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearExerciseHeartRateWarning();
            return this;
        }

        public Builder clearExerciseStartReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearExerciseStartReminder();
            return this;
        }

        public Builder clearFallDetection() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearFallDetection();
            return this;
        }

        public Builder clearGoalSetting() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearGoalSetting();
            return this;
        }

        public Builder clearHeartRateAutoMonitoring() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearHeartRateAutoMonitoring();
            return this;
        }

        public Builder clearIrregularHeartRateWarning() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearIrregularHeartRateWarning();
            return this;
        }

        public Builder clearMenstrualCycleReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearMenstrualCycleReminder();
            return this;
        }

        public Builder clearMentalPhysicalState() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearMentalPhysicalState();
            return this;
        }

        public Builder clearMentalPhysicalStateReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearMentalPhysicalStateReminder();
            return this;
        }

        public Builder clearRemSleepMonitoring() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearRemSleepMonitoring();
            return this;
        }

        public Builder clearReminderDuringExercise() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearReminderDuringExercise();
            return this;
        }

        public Builder clearRestingHeartRateWarning() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearRestingHeartRateWarning();
            return this;
        }

        public Builder clearSedentaryReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearSedentaryReminder();
            return this;
        }

        public Builder clearSleepDataCalibration() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearSleepDataCalibration();
            return this;
        }

        public Builder clearSleepIntervalBloodOxygen() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearSleepIntervalBloodOxygen();
            return this;
        }

        public Builder clearSleepRespiratoryRateMonitoring() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearSleepRespiratoryRateMonitoring();
            return this;
        }

        public Builder clearSleepScheduleReminder() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearSleepScheduleReminder();
            return this;
        }

        public Builder clearSnoringRiskAssessment() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearSnoringRiskAssessment();
            return this;
        }

        public Builder clearStepGoal() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearStepGoal();
            return this;
        }

        public Builder clearStressAutoMonitoring() {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).clearStressAutoMonitoring();
            return this;
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getAchievementReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getAchievementReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getActivityConsumptionGoal() {
            return ((DeviceSettings$SettingAbility) this.instance).getActivityConsumptionGoal();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getActivityCountGoal() {
            return ((DeviceSettings$SettingAbility) this.instance).getActivityCountGoal();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getAutoExerciseRecognition() {
            return ((DeviceSettings$SettingAbility) this.instance).getAutoExerciseRecognition();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getAutoPauseDuringExercise() {
            return ((DeviceSettings$SettingAbility) this.instance).getAutoPauseDuringExercise();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getAutoVoiceBroadcast() {
            return ((DeviceSettings$SettingAbility) this.instance).getAutoVoiceBroadcast();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getBloodOxygenSetting() {
            return ((DeviceSettings$SettingAbility) this.instance).getBloodOxygenSetting();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getBreathingRelaxationReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getBreathingRelaxationReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getButtonPauseContinue() {
            return ((DeviceSettings$SettingAbility) this.instance).getButtonPauseContinue();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getCustomExercise() {
            return ((DeviceSettings$SettingAbility) this.instance).getCustomExercise();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getDailyActivityNotification() {
            return ((DeviceSettings$SettingAbility) this.instance).getDailyActivityNotification();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getDoubleTapVoiceBroadcast() {
            return ((DeviceSettings$SettingAbility) this.instance).getDoubleTapVoiceBroadcast();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getExerciseContinueReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getExerciseContinueReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getExerciseDataDisplay() {
            return ((DeviceSettings$SettingAbility) this.instance).getExerciseDataDisplay();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getExerciseDurationGoal() {
            return ((DeviceSettings$SettingAbility) this.instance).getExerciseDurationGoal();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getExerciseEndReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getExerciseEndReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getExerciseHeartRateWarning() {
            return ((DeviceSettings$SettingAbility) this.instance).getExerciseHeartRateWarning();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getExerciseStartReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getExerciseStartReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getFallDetection() {
            return ((DeviceSettings$SettingAbility) this.instance).getFallDetection();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getGoalSetting() {
            return ((DeviceSettings$SettingAbility) this.instance).getGoalSetting();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getHeartRateAutoMonitoring() {
            return ((DeviceSettings$SettingAbility) this.instance).getHeartRateAutoMonitoring();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getIrregularHeartRateWarning() {
            return ((DeviceSettings$SettingAbility) this.instance).getIrregularHeartRateWarning();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getMenstrualCycleReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getMenstrualCycleReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getMentalPhysicalState() {
            return ((DeviceSettings$SettingAbility) this.instance).getMentalPhysicalState();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getMentalPhysicalStateReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getMentalPhysicalStateReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getRemSleepMonitoring() {
            return ((DeviceSettings$SettingAbility) this.instance).getRemSleepMonitoring();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getReminderDuringExercise() {
            return ((DeviceSettings$SettingAbility) this.instance).getReminderDuringExercise();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getRestingHeartRateWarning() {
            return ((DeviceSettings$SettingAbility) this.instance).getRestingHeartRateWarning();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getSedentaryReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getSedentaryReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getSleepDataCalibration() {
            return ((DeviceSettings$SettingAbility) this.instance).getSleepDataCalibration();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getSleepIntervalBloodOxygen() {
            return ((DeviceSettings$SettingAbility) this.instance).getSleepIntervalBloodOxygen();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getSleepRespiratoryRateMonitoring() {
            return ((DeviceSettings$SettingAbility) this.instance).getSleepRespiratoryRateMonitoring();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getSleepScheduleReminder() {
            return ((DeviceSettings$SettingAbility) this.instance).getSleepScheduleReminder();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getSnoringRiskAssessment() {
            return ((DeviceSettings$SettingAbility) this.instance).getSnoringRiskAssessment();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getStepGoal() {
            return ((DeviceSettings$SettingAbility) this.instance).getStepGoal();
        }

        @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
        public int getStressAutoMonitoring() {
            return ((DeviceSettings$SettingAbility) this.instance).getStressAutoMonitoring();
        }

        public Builder setAchievementReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setAchievementReminder(i);
            return this;
        }

        public Builder setActivityConsumptionGoal(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setActivityConsumptionGoal(i);
            return this;
        }

        public Builder setActivityCountGoal(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setActivityCountGoal(i);
            return this;
        }

        public Builder setAutoExerciseRecognition(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setAutoExerciseRecognition(i);
            return this;
        }

        public Builder setAutoPauseDuringExercise(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setAutoPauseDuringExercise(i);
            return this;
        }

        public Builder setAutoVoiceBroadcast(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setAutoVoiceBroadcast(i);
            return this;
        }

        public Builder setBloodOxygenSetting(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setBloodOxygenSetting(i);
            return this;
        }

        public Builder setBreathingRelaxationReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setBreathingRelaxationReminder(i);
            return this;
        }

        public Builder setButtonPauseContinue(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setButtonPauseContinue(i);
            return this;
        }

        public Builder setCustomExercise(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setCustomExercise(i);
            return this;
        }

        public Builder setDailyActivityNotification(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setDailyActivityNotification(i);
            return this;
        }

        public Builder setDoubleTapVoiceBroadcast(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setDoubleTapVoiceBroadcast(i);
            return this;
        }

        public Builder setExerciseContinueReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setExerciseContinueReminder(i);
            return this;
        }

        public Builder setExerciseDataDisplay(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setExerciseDataDisplay(i);
            return this;
        }

        public Builder setExerciseDurationGoal(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setExerciseDurationGoal(i);
            return this;
        }

        public Builder setExerciseEndReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setExerciseEndReminder(i);
            return this;
        }

        public Builder setExerciseHeartRateWarning(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setExerciseHeartRateWarning(i);
            return this;
        }

        public Builder setExerciseStartReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setExerciseStartReminder(i);
            return this;
        }

        public Builder setFallDetection(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setFallDetection(i);
            return this;
        }

        public Builder setGoalSetting(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setGoalSetting(i);
            return this;
        }

        public Builder setHeartRateAutoMonitoring(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setHeartRateAutoMonitoring(i);
            return this;
        }

        public Builder setIrregularHeartRateWarning(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setIrregularHeartRateWarning(i);
            return this;
        }

        public Builder setMenstrualCycleReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setMenstrualCycleReminder(i);
            return this;
        }

        public Builder setMentalPhysicalState(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setMentalPhysicalState(i);
            return this;
        }

        public Builder setMentalPhysicalStateReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setMentalPhysicalStateReminder(i);
            return this;
        }

        public Builder setRemSleepMonitoring(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setRemSleepMonitoring(i);
            return this;
        }

        public Builder setReminderDuringExercise(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setReminderDuringExercise(i);
            return this;
        }

        public Builder setRestingHeartRateWarning(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setRestingHeartRateWarning(i);
            return this;
        }

        public Builder setSedentaryReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setSedentaryReminder(i);
            return this;
        }

        public Builder setSleepDataCalibration(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setSleepDataCalibration(i);
            return this;
        }

        public Builder setSleepIntervalBloodOxygen(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setSleepIntervalBloodOxygen(i);
            return this;
        }

        public Builder setSleepRespiratoryRateMonitoring(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setSleepRespiratoryRateMonitoring(i);
            return this;
        }

        public Builder setSleepScheduleReminder(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setSleepScheduleReminder(i);
            return this;
        }

        public Builder setSnoringRiskAssessment(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setSnoringRiskAssessment(i);
            return this;
        }

        public Builder setStepGoal(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setStepGoal(i);
            return this;
        }

        public Builder setStressAutoMonitoring(int i) {
            copyOnWrite();
            ((DeviceSettings$SettingAbility) this.instance).setStressAutoMonitoring(i);
            return this;
        }

        private Builder() {
            super(DeviceSettings$SettingAbility.DEFAULT_INSTANCE);
        }
    }

    static {
        DeviceSettings$SettingAbility deviceSettings$SettingAbility = new DeviceSettings$SettingAbility();
        DEFAULT_INSTANCE = deviceSettings$SettingAbility;
        GeneratedMessageLite.registerDefaultInstance(DeviceSettings$SettingAbility.class, deviceSettings$SettingAbility);
    }

    private DeviceSettings$SettingAbility() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAchievementReminder() {
        this.achievementReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityConsumptionGoal() {
        this.activityConsumptionGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCountGoal() {
        this.activityCountGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoExerciseRecognition() {
        this.autoExerciseRecognition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoPauseDuringExercise() {
        this.autoPauseDuringExercise_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoVoiceBroadcast() {
        this.autoVoiceBroadcast_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBloodOxygenSetting() {
        this.bloodOxygenSetting_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBreathingRelaxationReminder() {
        this.breathingRelaxationReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonPauseContinue() {
        this.buttonPauseContinue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomExercise() {
        this.customExercise_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDailyActivityNotification() {
        this.dailyActivityNotification_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleTapVoiceBroadcast() {
        this.doubleTapVoiceBroadcast_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseContinueReminder() {
        this.exerciseContinueReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseDataDisplay() {
        this.exerciseDataDisplay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseDurationGoal() {
        this.exerciseDurationGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseEndReminder() {
        this.exerciseEndReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseHeartRateWarning() {
        this.exerciseHeartRateWarning_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseStartReminder() {
        this.exerciseStartReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallDetection() {
        this.fallDetection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoalSetting() {
        this.goalSetting_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateAutoMonitoring() {
        this.heartRateAutoMonitoring_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIrregularHeartRateWarning() {
        this.irregularHeartRateWarning_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMenstrualCycleReminder() {
        this.menstrualCycleReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMentalPhysicalState() {
        this.mentalPhysicalState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMentalPhysicalStateReminder() {
        this.mentalPhysicalStateReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemSleepMonitoring() {
        this.remSleepMonitoring_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReminderDuringExercise() {
        this.reminderDuringExercise_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestingHeartRateWarning() {
        this.restingHeartRateWarning_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentaryReminder() {
        this.sedentaryReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepDataCalibration() {
        this.sleepDataCalibration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepIntervalBloodOxygen() {
        this.sleepIntervalBloodOxygen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepRespiratoryRateMonitoring() {
        this.sleepRespiratoryRateMonitoring_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepScheduleReminder() {
        this.sleepScheduleReminder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnoringRiskAssessment() {
        this.snoringRiskAssessment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStepGoal() {
        this.stepGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressAutoMonitoring() {
        this.stressAutoMonitoring_ = 0;
    }

    public static DeviceSettings$SettingAbility getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DeviceSettings$SettingAbility parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeviceSettings$SettingAbility parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DeviceSettings$SettingAbility> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAchievementReminder(int i) {
        this.achievementReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityConsumptionGoal(int i) {
        this.activityConsumptionGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCountGoal(int i) {
        this.activityCountGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoExerciseRecognition(int i) {
        this.autoExerciseRecognition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoPauseDuringExercise(int i) {
        this.autoPauseDuringExercise_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoVoiceBroadcast(int i) {
        this.autoVoiceBroadcast_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBloodOxygenSetting(int i) {
        this.bloodOxygenSetting_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBreathingRelaxationReminder(int i) {
        this.breathingRelaxationReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonPauseContinue(int i) {
        this.buttonPauseContinue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomExercise(int i) {
        this.customExercise_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDailyActivityNotification(int i) {
        this.dailyActivityNotification_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleTapVoiceBroadcast(int i) {
        this.doubleTapVoiceBroadcast_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseContinueReminder(int i) {
        this.exerciseContinueReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseDataDisplay(int i) {
        this.exerciseDataDisplay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseDurationGoal(int i) {
        this.exerciseDurationGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseEndReminder(int i) {
        this.exerciseEndReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseHeartRateWarning(int i) {
        this.exerciseHeartRateWarning_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseStartReminder(int i) {
        this.exerciseStartReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallDetection(int i) {
        this.fallDetection_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoalSetting(int i) {
        this.goalSetting_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateAutoMonitoring(int i) {
        this.heartRateAutoMonitoring_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIrregularHeartRateWarning(int i) {
        this.irregularHeartRateWarning_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMenstrualCycleReminder(int i) {
        this.menstrualCycleReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMentalPhysicalState(int i) {
        this.mentalPhysicalState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMentalPhysicalStateReminder(int i) {
        this.mentalPhysicalStateReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemSleepMonitoring(int i) {
        this.remSleepMonitoring_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReminderDuringExercise(int i) {
        this.reminderDuringExercise_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestingHeartRateWarning(int i) {
        this.restingHeartRateWarning_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentaryReminder(int i) {
        this.sedentaryReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepDataCalibration(int i) {
        this.sleepDataCalibration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepIntervalBloodOxygen(int i) {
        this.sleepIntervalBloodOxygen_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepRespiratoryRateMonitoring(int i) {
        this.sleepRespiratoryRateMonitoring_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepScheduleReminder(int i) {
        this.sleepScheduleReminder_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnoringRiskAssessment(int i) {
        this.snoringRiskAssessment_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStepGoal(int i) {
        this.stepGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressAutoMonitoring(int i) {
        this.stressAutoMonitoring_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (co5.a[methodToInvoke.ordinal()]) {
            case 1:
                return new DeviceSettings$SettingAbility();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000$\u0000\u0000\u0001$$\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004\f\u0004\r\u0004\u000e\u0004\u000f\u0004\u0010\u0004\u0011\u0004\u0012\u0004\u0013\u0004\u0014\u0004\u0015\u0004\u0016\u0004\u0017\u0004\u0018\u0004\u0019\u0004\u001a\u0004\u001b\u0004\u001c\u0004\u001d\u0004\u001e\u0004\u001f\u0004 \u0004!\u0004\"\u0004#\u0004$\u0004", new Object[]{"stepGoal_", "activityConsumptionGoal_", "exerciseDurationGoal_", "activityCountGoal_", "sedentaryReminder_", "dailyActivityNotification_", "fallDetection_", "heartRateAutoMonitoring_", "restingHeartRateWarning_", "exerciseHeartRateWarning_", "irregularHeartRateWarning_", "stressAutoMonitoring_", "breathingRelaxationReminder_", "mentalPhysicalState_", "mentalPhysicalStateReminder_", "achievementReminder_", "goalSetting_", "bloodOxygenSetting_", "menstrualCycleReminder_", "snoringRiskAssessment_", "sleepRespiratoryRateMonitoring_", "sleepIntervalBloodOxygen_", "remSleepMonitoring_", "sleepScheduleReminder_", "sleepDataCalibration_", "autoPauseDuringExercise_", "autoExerciseRecognition_", "exerciseStartReminder_", "exerciseContinueReminder_", "exerciseEndReminder_", "autoVoiceBroadcast_", "doubleTapVoiceBroadcast_", "buttonPauseContinue_", "exerciseDataDisplay_", "reminderDuringExercise_", "customExercise_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DeviceSettings$SettingAbility> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DeviceSettings$SettingAbility.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getAchievementReminder() {
        return this.achievementReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getActivityConsumptionGoal() {
        return this.activityConsumptionGoal_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getActivityCountGoal() {
        return this.activityCountGoal_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getAutoExerciseRecognition() {
        return this.autoExerciseRecognition_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getAutoPauseDuringExercise() {
        return this.autoPauseDuringExercise_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getAutoVoiceBroadcast() {
        return this.autoVoiceBroadcast_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getBloodOxygenSetting() {
        return this.bloodOxygenSetting_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getBreathingRelaxationReminder() {
        return this.breathingRelaxationReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getButtonPauseContinue() {
        return this.buttonPauseContinue_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getCustomExercise() {
        return this.customExercise_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getDailyActivityNotification() {
        return this.dailyActivityNotification_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getDoubleTapVoiceBroadcast() {
        return this.doubleTapVoiceBroadcast_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getExerciseContinueReminder() {
        return this.exerciseContinueReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getExerciseDataDisplay() {
        return this.exerciseDataDisplay_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getExerciseDurationGoal() {
        return this.exerciseDurationGoal_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getExerciseEndReminder() {
        return this.exerciseEndReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getExerciseHeartRateWarning() {
        return this.exerciseHeartRateWarning_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getExerciseStartReminder() {
        return this.exerciseStartReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getFallDetection() {
        return this.fallDetection_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getGoalSetting() {
        return this.goalSetting_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getHeartRateAutoMonitoring() {
        return this.heartRateAutoMonitoring_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getIrregularHeartRateWarning() {
        return this.irregularHeartRateWarning_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getMenstrualCycleReminder() {
        return this.menstrualCycleReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getMentalPhysicalState() {
        return this.mentalPhysicalState_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getMentalPhysicalStateReminder() {
        return this.mentalPhysicalStateReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getRemSleepMonitoring() {
        return this.remSleepMonitoring_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getReminderDuringExercise() {
        return this.reminderDuringExercise_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getRestingHeartRateWarning() {
        return this.restingHeartRateWarning_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getSedentaryReminder() {
        return this.sedentaryReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getSleepDataCalibration() {
        return this.sleepDataCalibration_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getSleepIntervalBloodOxygen() {
        return this.sleepIntervalBloodOxygen_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getSleepRespiratoryRateMonitoring() {
        return this.sleepRespiratoryRateMonitoring_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getSleepScheduleReminder() {
        return this.sleepScheduleReminder_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getSnoringRiskAssessment() {
        return this.snoringRiskAssessment_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getStepGoal() {
        return this.stepGoal_;
    }

    @Override // com.heytap.health.settings.DeviceSettings$SettingAbilityOrBuilder
    public int getStressAutoMonitoring() {
        return this.stressAutoMonitoring_;
    }

    public static Builder newBuilder(DeviceSettings$SettingAbility deviceSettings$SettingAbility) {
        return DEFAULT_INSTANCE.createBuilder(deviceSettings$SettingAbility);
    }

    public static DeviceSettings$SettingAbility parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeviceSettings$SettingAbility parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DeviceSettings$SettingAbility parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DeviceSettings$SettingAbility parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DeviceSettings$SettingAbility parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeviceSettings$SettingAbility parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DeviceSettings$SettingAbility parseFrom(InputStream inputStream) throws IOException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeviceSettings$SettingAbility parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeviceSettings$SettingAbility parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DeviceSettings$SettingAbility parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceSettings$SettingAbility) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
