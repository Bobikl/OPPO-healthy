package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$SHSettingsData extends GeneratedMessageLite<FitnessProtoV2$SHSettingsData, Builder> implements FitnessProtoV2$SHSettingsDataOrBuilder {
    public static final int ACTIVITYGOALCOMPLETE_FIELD_NUMBER = 6;
    public static final int ACTIVITYGOAL_FIELD_NUMBER = 4;
    public static final int AFIB_FIELD_NUMBER = 13;
    public static final int BREATHERATE_FIELD_NUMBER = 18;
    public static final int BUTTONTOPAUSEORRESUME_FIELD_NUMBER = 24;
    public static final int CALORIE_FIELD_NUMBER = 2;
    public static final int CONTINUESPORTREMINDER_FIELD_NUMBER = 26;
    private static final FitnessProtoV2$SHSettingsData DEFAULT_INSTANCE;
    public static final int ENDSPORTREMINDER_FIELD_NUMBER = 27;
    public static final int EXERCISETIMEGOAL_FIELD_NUMBER = 3;
    public static final int HEALTHDAILYREPORT_FIELD_NUMBER = 7;
    public static final int HEALTHWEEKREPORT_FIELD_NUMBER = 8;
    public static final int HEARTRATE_FIELD_NUMBER = 10;
    public static final int OSA_FIELD_NUMBER = 17;
    private static volatile Parser<FitnessProtoV2$SHSettingsData> PARSER = null;
    public static final int QUIETHEARTRATE_FIELD_NUMBER = 11;
    public static final int SEDENTARYREMINDERTHEME_FIELD_NUMBER = 28;
    public static final int SEDENTARY_FIELD_NUMBER = 5;
    public static final int SLEEPREM_FIELD_NUMBER = 19;
    public static final int SPO2ALLDAYMONITOR_FIELD_NUMBER = 15;
    public static final int SPO2LOWWARNING_FIELD_NUMBER = 16;
    public static final int SPORTGOAL_FIELD_NUMBER = 25;
    public static final int SPORTSAUTOPAUSE_FIELD_NUMBER = 20;
    public static final int SPORTSAUTORECOGNIZE_FIELD_NUMBER = 21;
    public static final int SPORTSDOUBLEVOICEBROADCAST_FIELD_NUMBER = 23;
    public static final int SPORTSHEARTRATE_FIELD_NUMBER = 12;
    public static final int SPORTSVOICEBROADCAST_FIELD_NUMBER = 22;
    public static final int SPORTSVOICEPACKSTHEME_FIELD_NUMBER = 29;
    public static final int STEP_FIELD_NUMBER = 1;
    public static final int STRESS_FIELD_NUMBER = 14;
    public static final int TUMBLE_FIELD_NUMBER = 9;
    private FitnessProtoV2$SettingsEnableData aFib_;
    private FitnessProtoV2$SettingsEnableData activityGoalComplete_;
    private FitnessProtoV2$SettingsGoalData activityGoal_;
    private int bitField0_;
    private FitnessProtoV2$SettingsEnableData breatheRate_;
    private FitnessProtoV2$SettingsEnableData buttonToPauseOrResume_;
    private FitnessProtoV2$SettingsGoalData calorie_;
    private FitnessProtoV2$SettingsEnableData continueSportReminder_;
    private FitnessProtoV2$SettingsEnableData endSportReminder_;
    private FitnessProtoV2$SettingsGoalData exerciseTimeGoal_;
    private FitnessProtoV2$SettingsEnableData healthDailyReport_;
    private FitnessProtoV2$SettingsEnableData healthWeekReport_;
    private FitnessProtoV2$AutoMeasureHeartRateSettingsData heartRate_;
    private FitnessProtoV2$SettingsEnableData osa_;
    private FitnessProtoV2$QuietHeartRateSettingsData quietHeartRate_;
    private FitnessProtoV2$SettingsEnableData sedentaryReminderTheme_;
    private FitnessProtoV2$SedentaryReminderSettingsData sedentary_;
    private FitnessProtoV2$SettingsEnableData sleepRem_;
    private FitnessProtoV2$SettingsEnableData spo2AllDayMonitor_;
    private FitnessProtoV2$Spo2LowWarningSettingsData spo2LowWarning_;
    private FitnessProtoV2$SettingsGoalData sportGoal_;
    private FitnessProtoV2$SettingsEnableData sportsAutoPause_;
    private FitnessProtoV2$SportsAutoRecognizeSettingsData sportsAutoRecognize_;
    private FitnessProtoV2$SettingsEnableData sportsDoubleVoiceBroadcast_;
    private FitnessProtoV2$SportsHeartRateSettingsData sportsHeartRate_;
    private FitnessProtoV2$SettingsEnableData sportsVoiceBroadcast_;
    private FitnessProtoV2$SettingsEnableData sportsVoicePacksTheme_;
    private FitnessProtoV2$SettingsGoalData step_;
    private FitnessProtoV2$StressSettingsData stress_;
    private FitnessProtoV2$SettingsEnableData tumble_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SHSettingsData, Builder> implements FitnessProtoV2$SHSettingsDataOrBuilder {
        public Builder clearAFib() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearAFib();
            return this;
        }

        public Builder clearActivityGoal() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearActivityGoal();
            return this;
        }

        public Builder clearActivityGoalComplete() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearActivityGoalComplete();
            return this;
        }

        public Builder clearBreatheRate() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearBreatheRate();
            return this;
        }

        public Builder clearButtonToPauseOrResume() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearButtonToPauseOrResume();
            return this;
        }

        public Builder clearCalorie() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearCalorie();
            return this;
        }

        public Builder clearContinueSportReminder() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearContinueSportReminder();
            return this;
        }

        public Builder clearEndSportReminder() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearEndSportReminder();
            return this;
        }

        public Builder clearExerciseTimeGoal() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearExerciseTimeGoal();
            return this;
        }

        public Builder clearHealthDailyReport() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearHealthDailyReport();
            return this;
        }

        public Builder clearHealthWeekReport() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearHealthWeekReport();
            return this;
        }

        public Builder clearHeartRate() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearHeartRate();
            return this;
        }

        public Builder clearOsa() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearOsa();
            return this;
        }

        public Builder clearQuietHeartRate() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearQuietHeartRate();
            return this;
        }

        public Builder clearSedentary() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSedentary();
            return this;
        }

        public Builder clearSedentaryReminderTheme() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSedentaryReminderTheme();
            return this;
        }

        public Builder clearSleepRem() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSleepRem();
            return this;
        }

        public Builder clearSpo2AllDayMonitor() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSpo2AllDayMonitor();
            return this;
        }

        public Builder clearSpo2LowWarning() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSpo2LowWarning();
            return this;
        }

        public Builder clearSportGoal() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportGoal();
            return this;
        }

        public Builder clearSportsAutoPause() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportsAutoPause();
            return this;
        }

        public Builder clearSportsAutoRecognize() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportsAutoRecognize();
            return this;
        }

        public Builder clearSportsDoubleVoiceBroadcast() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportsDoubleVoiceBroadcast();
            return this;
        }

        public Builder clearSportsHeartRate() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportsHeartRate();
            return this;
        }

        public Builder clearSportsVoiceBroadcast() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportsVoiceBroadcast();
            return this;
        }

        public Builder clearSportsVoicePacksTheme() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSportsVoicePacksTheme();
            return this;
        }

        public Builder clearStep() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearStep();
            return this;
        }

        public Builder clearStress() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearStress();
            return this;
        }

        public Builder clearTumble() {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearTumble();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getAFib() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getAFib();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsGoalData getActivityGoal() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getActivityGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getActivityGoalComplete() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getActivityGoalComplete();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getBreatheRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getBreatheRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getButtonToPauseOrResume() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getButtonToPauseOrResume();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsGoalData getCalorie() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getContinueSportReminder() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getContinueSportReminder();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getEndSportReminder() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getEndSportReminder();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsGoalData getExerciseTimeGoal() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getExerciseTimeGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getHealthDailyReport() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getHealthDailyReport();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getHealthWeekReport() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getHealthWeekReport();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$AutoMeasureHeartRateSettingsData getHeartRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getOsa() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getOsa();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$QuietHeartRateSettingsData getQuietHeartRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getQuietHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SedentaryReminderSettingsData getSedentary() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSedentary();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSedentaryReminderTheme() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSedentaryReminderTheme();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSleepRem() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSleepRem();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSpo2AllDayMonitor() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSpo2AllDayMonitor();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$Spo2LowWarningSettingsData getSpo2LowWarning() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSpo2LowWarning();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsGoalData getSportGoal() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSportsAutoPause() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportsAutoPause();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SportsAutoRecognizeSettingsData getSportsAutoRecognize() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportsAutoRecognize();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSportsDoubleVoiceBroadcast() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportsDoubleVoiceBroadcast();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SportsHeartRateSettingsData getSportsHeartRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportsHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSportsVoiceBroadcast() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportsVoiceBroadcast();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSportsVoicePacksTheme() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSportsVoicePacksTheme();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsGoalData getStep() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getStep();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$StressSettingsData getStress() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getStress();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getTumble() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).getTumble();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasAFib() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasAFib();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasActivityGoal() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasActivityGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasActivityGoalComplete() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasActivityGoalComplete();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasBreatheRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasBreatheRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasButtonToPauseOrResume() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasButtonToPauseOrResume();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasCalorie() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasContinueSportReminder() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasContinueSportReminder();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasEndSportReminder() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasEndSportReminder();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasExerciseTimeGoal() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasExerciseTimeGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasHealthDailyReport() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasHealthDailyReport();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasHealthWeekReport() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasHealthWeekReport();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasHeartRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasOsa() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasOsa();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasQuietHeartRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasQuietHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSedentary() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSedentary();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSedentaryReminderTheme() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSedentaryReminderTheme();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSleepRem() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSleepRem();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSpo2AllDayMonitor() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSpo2AllDayMonitor();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSpo2LowWarning() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSpo2LowWarning();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportGoal() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportsAutoPause() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportsAutoPause();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportsAutoRecognize() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportsAutoRecognize();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportsDoubleVoiceBroadcast() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportsDoubleVoiceBroadcast();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportsHeartRate() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportsHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportsVoiceBroadcast() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportsVoiceBroadcast();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasSportsVoicePacksTheme() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSportsVoicePacksTheme();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasStep() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasStep();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasStress() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasStress();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
        public boolean hasTumble() {
            return ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasTumble();
        }

        public Builder mergeAFib(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeAFib(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeActivityGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeActivityGoal(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder mergeActivityGoalComplete(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeActivityGoalComplete(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeBreatheRate(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeBreatheRate(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeButtonToPauseOrResume(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeButtonToPauseOrResume(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeCalorie(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeCalorie(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder mergeContinueSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeContinueSportReminder(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeEndSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeEndSportReminder(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeExerciseTimeGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeExerciseTimeGoal(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder mergeHealthDailyReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeHealthDailyReport(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeHealthWeekReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeHealthWeekReport(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeHeartRate(FitnessProtoV2$AutoMeasureHeartRateSettingsData fitnessProtoV2$AutoMeasureHeartRateSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeHeartRate(fitnessProtoV2$AutoMeasureHeartRateSettingsData);
            return this;
        }

        public Builder mergeOsa(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeOsa(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeQuietHeartRate(FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeQuietHeartRate(fitnessProtoV2$QuietHeartRateSettingsData);
            return this;
        }

        public Builder mergeSedentary(FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSedentary(fitnessProtoV2$SedentaryReminderSettingsData);
            return this;
        }

        public Builder mergeSedentaryReminderTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSedentaryReminderTheme(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSleepRem(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSleepRem(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSpo2AllDayMonitor(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSpo2AllDayMonitor(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSpo2LowWarning(FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSpo2LowWarning(fitnessProtoV2$Spo2LowWarningSettingsData);
            return this;
        }

        public Builder mergeSportGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportGoal(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder mergeSportsAutoPause(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportsAutoPause(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSportsAutoRecognize(FitnessProtoV2$SportsAutoRecognizeSettingsData fitnessProtoV2$SportsAutoRecognizeSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportsAutoRecognize(fitnessProtoV2$SportsAutoRecognizeSettingsData);
            return this;
        }

        public Builder mergeSportsDoubleVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportsDoubleVoiceBroadcast(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSportsHeartRate(FitnessProtoV2$SportsHeartRateSettingsData fitnessProtoV2$SportsHeartRateSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportsHeartRate(fitnessProtoV2$SportsHeartRateSettingsData);
            return this;
        }

        public Builder mergeSportsVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportsVoiceBroadcast(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSportsVoicePacksTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSportsVoicePacksTheme(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeStep(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeStep(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder mergeStress(FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeStress(fitnessProtoV2$StressSettingsData);
            return this;
        }

        public Builder mergeTumble(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeTumble(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setAFib(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setAFib(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setActivityGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setActivityGoal(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder setActivityGoalComplete(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setActivityGoalComplete(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setBreatheRate(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setBreatheRate(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setButtonToPauseOrResume(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setButtonToPauseOrResume(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setCalorie(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setCalorie(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder setContinueSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setContinueSportReminder(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setEndSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setEndSportReminder(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setExerciseTimeGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setExerciseTimeGoal(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder setHealthDailyReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setHealthDailyReport(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setHealthWeekReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setHealthWeekReport(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setHeartRate(FitnessProtoV2$AutoMeasureHeartRateSettingsData fitnessProtoV2$AutoMeasureHeartRateSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setHeartRate(fitnessProtoV2$AutoMeasureHeartRateSettingsData);
            return this;
        }

        public Builder setOsa(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setOsa(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setQuietHeartRate(FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setQuietHeartRate(fitnessProtoV2$QuietHeartRateSettingsData);
            return this;
        }

        public Builder setSedentary(FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSedentary(fitnessProtoV2$SedentaryReminderSettingsData);
            return this;
        }

        public Builder setSedentaryReminderTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSedentaryReminderTheme(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSleepRem(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSleepRem(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSpo2AllDayMonitor(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSpo2AllDayMonitor(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSpo2LowWarning(FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSpo2LowWarning(fitnessProtoV2$Spo2LowWarningSettingsData);
            return this;
        }

        public Builder setSportGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportGoal(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder setSportsAutoPause(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsAutoPause(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSportsAutoRecognize(FitnessProtoV2$SportsAutoRecognizeSettingsData fitnessProtoV2$SportsAutoRecognizeSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsAutoRecognize(fitnessProtoV2$SportsAutoRecognizeSettingsData);
            return this;
        }

        public Builder setSportsDoubleVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsDoubleVoiceBroadcast(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSportsHeartRate(FitnessProtoV2$SportsHeartRateSettingsData fitnessProtoV2$SportsHeartRateSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsHeartRate(fitnessProtoV2$SportsHeartRateSettingsData);
            return this;
        }

        public Builder setSportsVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsVoiceBroadcast(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSportsVoicePacksTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsVoicePacksTheme(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setStep(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStep(fitnessProtoV2$SettingsGoalData);
            return this;
        }

        public Builder setStress(FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStress(fitnessProtoV2$StressSettingsData);
            return this;
        }

        public Builder setTumble(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setTumble(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SHSettingsData.DEFAULT_INSTANCE);
        }

        public Builder setAFib(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setAFib((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setActivityGoal(FitnessProtoV2$SettingsGoalData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setActivityGoal((FitnessProtoV2$SettingsGoalData) builder.build());
            return this;
        }

        public Builder setActivityGoalComplete(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setActivityGoalComplete((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setBreatheRate(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setBreatheRate((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setButtonToPauseOrResume(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setButtonToPauseOrResume((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setCalorie(FitnessProtoV2$SettingsGoalData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setCalorie((FitnessProtoV2$SettingsGoalData) builder.build());
            return this;
        }

        public Builder setContinueSportReminder(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setContinueSportReminder((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setEndSportReminder(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setEndSportReminder((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setExerciseTimeGoal(FitnessProtoV2$SettingsGoalData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setExerciseTimeGoal((FitnessProtoV2$SettingsGoalData) builder.build());
            return this;
        }

        public Builder setHealthDailyReport(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setHealthDailyReport((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setHealthWeekReport(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setHealthWeekReport((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setHeartRate(FitnessProtoV2$AutoMeasureHeartRateSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setHeartRate((FitnessProtoV2$AutoMeasureHeartRateSettingsData) builder.build());
            return this;
        }

        public Builder setOsa(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setOsa((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setQuietHeartRate(FitnessProtoV2$QuietHeartRateSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setQuietHeartRate((FitnessProtoV2$QuietHeartRateSettingsData) builder.build());
            return this;
        }

        public Builder setSedentary(FitnessProtoV2$SedentaryReminderSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSedentary((FitnessProtoV2$SedentaryReminderSettingsData) builder.build());
            return this;
        }

        public Builder setSedentaryReminderTheme(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSedentaryReminderTheme((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSleepRem(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSleepRem((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSpo2AllDayMonitor(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSpo2AllDayMonitor((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSpo2LowWarning(FitnessProtoV2$Spo2LowWarningSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSpo2LowWarning((FitnessProtoV2$Spo2LowWarningSettingsData) builder.build());
            return this;
        }

        public Builder setSportGoal(FitnessProtoV2$SettingsGoalData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportGoal((FitnessProtoV2$SettingsGoalData) builder.build());
            return this;
        }

        public Builder setSportsAutoPause(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsAutoPause((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSportsAutoRecognize(FitnessProtoV2$SportsAutoRecognizeSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsAutoRecognize((FitnessProtoV2$SportsAutoRecognizeSettingsData) builder.build());
            return this;
        }

        public Builder setSportsDoubleVoiceBroadcast(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsDoubleVoiceBroadcast((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSportsHeartRate(FitnessProtoV2$SportsHeartRateSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsHeartRate((FitnessProtoV2$SportsHeartRateSettingsData) builder.build());
            return this;
        }

        public Builder setSportsVoiceBroadcast(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsVoiceBroadcast((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSportsVoicePacksTheme(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSportsVoicePacksTheme((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setStep(FitnessProtoV2$SettingsGoalData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStep((FitnessProtoV2$SettingsGoalData) builder.build());
            return this;
        }

        public Builder setStress(FitnessProtoV2$StressSettingsData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStress((FitnessProtoV2$StressSettingsData) builder.build());
            return this;
        }

        public Builder setTumble(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SHSettingsData) ((GeneratedMessageLite.Builder) this).instance).setTumble((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$SHSettingsData fitnessProtoV2$SHSettingsData = new FitnessProtoV2$SHSettingsData();
        DEFAULT_INSTANCE = fitnessProtoV2$SHSettingsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SHSettingsData.class, fitnessProtoV2$SHSettingsData);
    }

    private FitnessProtoV2$SHSettingsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAFib() {
        this.aFib_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityGoal() {
        this.activityGoal_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityGoalComplete() {
        this.activityGoalComplete_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBreatheRate() {
        this.breatheRate_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonToPauseOrResume() {
        this.buttonToPauseOrResume_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalorie() {
        this.calorie_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinueSportReminder() {
        this.continueSportReminder_ = null;
        this.bitField0_ &= -33554433;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndSportReminder() {
        this.endSportReminder_ = null;
        this.bitField0_ &= -67108865;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseTimeGoal() {
        this.exerciseTimeGoal_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthDailyReport() {
        this.healthDailyReport_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthWeekReport() {
        this.healthWeekReport_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsa() {
        this.osa_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuietHeartRate() {
        this.quietHeartRate_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentary() {
        this.sedentary_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentaryReminderTheme() {
        this.sedentaryReminderTheme_ = null;
        this.bitField0_ &= -134217729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepRem() {
        this.sleepRem_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2AllDayMonitor() {
        this.spo2AllDayMonitor_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2LowWarning() {
        this.spo2LowWarning_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportGoal() {
        this.sportGoal_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsAutoPause() {
        this.sportsAutoPause_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsAutoRecognize() {
        this.sportsAutoRecognize_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsDoubleVoiceBroadcast() {
        this.sportsDoubleVoiceBroadcast_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsHeartRate() {
        this.sportsHeartRate_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsVoiceBroadcast() {
        this.sportsVoiceBroadcast_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportsVoicePacksTheme() {
        this.sportsVoicePacksTheme_ = null;
        this.bitField0_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStep() {
        this.step_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStress() {
        this.stress_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTumble() {
        this.tumble_ = null;
        this.bitField0_ &= -257;
    }

    public static FitnessProtoV2$SHSettingsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAFib(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.aFib_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.aFib_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.aFib_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.aFib_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData2 = this.activityGoal_;
        if (fitnessProtoV2$SettingsGoalData2 == null || fitnessProtoV2$SettingsGoalData2 == FitnessProtoV2$SettingsGoalData.getDefaultInstance()) {
            this.activityGoal_ = fitnessProtoV2$SettingsGoalData;
        } else {
            this.activityGoal_ = (FitnessProtoV2$SettingsGoalData) ((FitnessProtoV2$SettingsGoalData.Builder) FitnessProtoV2$SettingsGoalData.newBuilder(this.activityGoal_).mergeFrom(fitnessProtoV2$SettingsGoalData)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityGoalComplete(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.activityGoalComplete_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.activityGoalComplete_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.activityGoalComplete_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.activityGoalComplete_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBreatheRate(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.breatheRate_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.breatheRate_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.breatheRate_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.breatheRate_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButtonToPauseOrResume(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.buttonToPauseOrResume_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.buttonToPauseOrResume_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.buttonToPauseOrResume_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.buttonToPauseOrResume_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCalorie(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData2 = this.calorie_;
        if (fitnessProtoV2$SettingsGoalData2 == null || fitnessProtoV2$SettingsGoalData2 == FitnessProtoV2$SettingsGoalData.getDefaultInstance()) {
            this.calorie_ = fitnessProtoV2$SettingsGoalData;
        } else {
            this.calorie_ = (FitnessProtoV2$SettingsGoalData) ((FitnessProtoV2$SettingsGoalData.Builder) FitnessProtoV2$SettingsGoalData.newBuilder(this.calorie_).mergeFrom(fitnessProtoV2$SettingsGoalData)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContinueSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.continueSportReminder_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.continueSportReminder_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.continueSportReminder_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.continueSportReminder_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.endSportReminder_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.endSportReminder_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.endSportReminder_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.endSportReminder_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExerciseTimeGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData2 = this.exerciseTimeGoal_;
        if (fitnessProtoV2$SettingsGoalData2 == null || fitnessProtoV2$SettingsGoalData2 == FitnessProtoV2$SettingsGoalData.getDefaultInstance()) {
            this.exerciseTimeGoal_ = fitnessProtoV2$SettingsGoalData;
        } else {
            this.exerciseTimeGoal_ = (FitnessProtoV2$SettingsGoalData) ((FitnessProtoV2$SettingsGoalData.Builder) FitnessProtoV2$SettingsGoalData.newBuilder(this.exerciseTimeGoal_).mergeFrom(fitnessProtoV2$SettingsGoalData)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHealthDailyReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.healthDailyReport_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.healthDailyReport_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.healthDailyReport_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.healthDailyReport_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHealthWeekReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.healthWeekReport_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.healthWeekReport_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.healthWeekReport_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.healthWeekReport_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeartRate(FitnessProtoV2$AutoMeasureHeartRateSettingsData fitnessProtoV2$AutoMeasureHeartRateSettingsData) {
        fitnessProtoV2$AutoMeasureHeartRateSettingsData.getClass();
        FitnessProtoV2$AutoMeasureHeartRateSettingsData fitnessProtoV2$AutoMeasureHeartRateSettingsData2 = this.heartRate_;
        if (fitnessProtoV2$AutoMeasureHeartRateSettingsData2 == null || fitnessProtoV2$AutoMeasureHeartRateSettingsData2 == FitnessProtoV2$AutoMeasureHeartRateSettingsData.getDefaultInstance()) {
            this.heartRate_ = fitnessProtoV2$AutoMeasureHeartRateSettingsData;
        } else {
            this.heartRate_ = (FitnessProtoV2$AutoMeasureHeartRateSettingsData) ((FitnessProtoV2$AutoMeasureHeartRateSettingsData.Builder) FitnessProtoV2$AutoMeasureHeartRateSettingsData.newBuilder(this.heartRate_).mergeFrom(fitnessProtoV2$AutoMeasureHeartRateSettingsData)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsa(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.osa_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.osa_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.osa_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.osa_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuietHeartRate(FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData) {
        fitnessProtoV2$QuietHeartRateSettingsData.getClass();
        FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData2 = this.quietHeartRate_;
        if (fitnessProtoV2$QuietHeartRateSettingsData2 == null || fitnessProtoV2$QuietHeartRateSettingsData2 == FitnessProtoV2$QuietHeartRateSettingsData.getDefaultInstance()) {
            this.quietHeartRate_ = fitnessProtoV2$QuietHeartRateSettingsData;
        } else {
            this.quietHeartRate_ = (FitnessProtoV2$QuietHeartRateSettingsData) ((FitnessProtoV2$QuietHeartRateSettingsData.Builder) FitnessProtoV2$QuietHeartRateSettingsData.newBuilder(this.quietHeartRate_).mergeFrom(fitnessProtoV2$QuietHeartRateSettingsData)).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSedentary(FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData) {
        fitnessProtoV2$SedentaryReminderSettingsData.getClass();
        FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData2 = this.sedentary_;
        if (fitnessProtoV2$SedentaryReminderSettingsData2 == null || fitnessProtoV2$SedentaryReminderSettingsData2 == FitnessProtoV2$SedentaryReminderSettingsData.getDefaultInstance()) {
            this.sedentary_ = fitnessProtoV2$SedentaryReminderSettingsData;
        } else {
            this.sedentary_ = (FitnessProtoV2$SedentaryReminderSettingsData) ((FitnessProtoV2$SedentaryReminderSettingsData.Builder) FitnessProtoV2$SedentaryReminderSettingsData.newBuilder(this.sedentary_).mergeFrom(fitnessProtoV2$SedentaryReminderSettingsData)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSedentaryReminderTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sedentaryReminderTheme_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sedentaryReminderTheme_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sedentaryReminderTheme_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sedentaryReminderTheme_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSleepRem(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sleepRem_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sleepRem_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sleepRem_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sleepRem_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpo2AllDayMonitor(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.spo2AllDayMonitor_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.spo2AllDayMonitor_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.spo2AllDayMonitor_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.spo2AllDayMonitor_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpo2LowWarning(FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData) {
        fitnessProtoV2$Spo2LowWarningSettingsData.getClass();
        FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData2 = this.spo2LowWarning_;
        if (fitnessProtoV2$Spo2LowWarningSettingsData2 == null || fitnessProtoV2$Spo2LowWarningSettingsData2 == FitnessProtoV2$Spo2LowWarningSettingsData.getDefaultInstance()) {
            this.spo2LowWarning_ = fitnessProtoV2$Spo2LowWarningSettingsData;
        } else {
            this.spo2LowWarning_ = (FitnessProtoV2$Spo2LowWarningSettingsData) ((FitnessProtoV2$Spo2LowWarningSettingsData.Builder) FitnessProtoV2$Spo2LowWarningSettingsData.newBuilder(this.spo2LowWarning_).mergeFrom(fitnessProtoV2$Spo2LowWarningSettingsData)).buildPartial();
        }
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData2 = this.sportGoal_;
        if (fitnessProtoV2$SettingsGoalData2 == null || fitnessProtoV2$SettingsGoalData2 == FitnessProtoV2$SettingsGoalData.getDefaultInstance()) {
            this.sportGoal_ = fitnessProtoV2$SettingsGoalData;
        } else {
            this.sportGoal_ = (FitnessProtoV2$SettingsGoalData) ((FitnessProtoV2$SettingsGoalData.Builder) FitnessProtoV2$SettingsGoalData.newBuilder(this.sportGoal_).mergeFrom(fitnessProtoV2$SettingsGoalData)).buildPartial();
        }
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportsAutoPause(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sportsAutoPause_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sportsAutoPause_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sportsAutoPause_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sportsAutoPause_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportsAutoRecognize(FitnessProtoV2$SportsAutoRecognizeSettingsData fitnessProtoV2$SportsAutoRecognizeSettingsData) {
        fitnessProtoV2$SportsAutoRecognizeSettingsData.getClass();
        FitnessProtoV2$SportsAutoRecognizeSettingsData fitnessProtoV2$SportsAutoRecognizeSettingsData2 = this.sportsAutoRecognize_;
        if (fitnessProtoV2$SportsAutoRecognizeSettingsData2 == null || fitnessProtoV2$SportsAutoRecognizeSettingsData2 == FitnessProtoV2$SportsAutoRecognizeSettingsData.getDefaultInstance()) {
            this.sportsAutoRecognize_ = fitnessProtoV2$SportsAutoRecognizeSettingsData;
        } else {
            this.sportsAutoRecognize_ = (FitnessProtoV2$SportsAutoRecognizeSettingsData) ((FitnessProtoV2$SportsAutoRecognizeSettingsData.Builder) FitnessProtoV2$SportsAutoRecognizeSettingsData.newBuilder(this.sportsAutoRecognize_).mergeFrom(fitnessProtoV2$SportsAutoRecognizeSettingsData)).buildPartial();
        }
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportsDoubleVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sportsDoubleVoiceBroadcast_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sportsDoubleVoiceBroadcast_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sportsDoubleVoiceBroadcast_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sportsDoubleVoiceBroadcast_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportsHeartRate(FitnessProtoV2$SportsHeartRateSettingsData fitnessProtoV2$SportsHeartRateSettingsData) {
        fitnessProtoV2$SportsHeartRateSettingsData.getClass();
        FitnessProtoV2$SportsHeartRateSettingsData fitnessProtoV2$SportsHeartRateSettingsData2 = this.sportsHeartRate_;
        if (fitnessProtoV2$SportsHeartRateSettingsData2 == null || fitnessProtoV2$SportsHeartRateSettingsData2 == FitnessProtoV2$SportsHeartRateSettingsData.getDefaultInstance()) {
            this.sportsHeartRate_ = fitnessProtoV2$SportsHeartRateSettingsData;
        } else {
            this.sportsHeartRate_ = (FitnessProtoV2$SportsHeartRateSettingsData) ((FitnessProtoV2$SportsHeartRateSettingsData.Builder) FitnessProtoV2$SportsHeartRateSettingsData.newBuilder(this.sportsHeartRate_).mergeFrom(fitnessProtoV2$SportsHeartRateSettingsData)).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportsVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sportsVoiceBroadcast_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sportsVoiceBroadcast_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sportsVoiceBroadcast_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sportsVoiceBroadcast_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSportsVoicePacksTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sportsVoicePacksTheme_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sportsVoicePacksTheme_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sportsVoicePacksTheme_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sportsVoicePacksTheme_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStep(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData2 = this.step_;
        if (fitnessProtoV2$SettingsGoalData2 == null || fitnessProtoV2$SettingsGoalData2 == FitnessProtoV2$SettingsGoalData.getDefaultInstance()) {
            this.step_ = fitnessProtoV2$SettingsGoalData;
        } else {
            this.step_ = (FitnessProtoV2$SettingsGoalData) ((FitnessProtoV2$SettingsGoalData.Builder) FitnessProtoV2$SettingsGoalData.newBuilder(this.step_).mergeFrom(fitnessProtoV2$SettingsGoalData)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStress(FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData) {
        fitnessProtoV2$StressSettingsData.getClass();
        FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData2 = this.stress_;
        if (fitnessProtoV2$StressSettingsData2 == null || fitnessProtoV2$StressSettingsData2 == FitnessProtoV2$StressSettingsData.getDefaultInstance()) {
            this.stress_ = fitnessProtoV2$StressSettingsData;
        } else {
            this.stress_ = (FitnessProtoV2$StressSettingsData) ((FitnessProtoV2$StressSettingsData.Builder) FitnessProtoV2$StressSettingsData.newBuilder(this.stress_).mergeFrom(fitnessProtoV2$StressSettingsData)).buildPartial();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTumble(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.tumble_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.tumble_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.tumble_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.tumble_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SHSettingsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SHSettingsData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAFib(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.aFib_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        this.activityGoal_ = fitnessProtoV2$SettingsGoalData;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityGoalComplete(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.activityGoalComplete_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBreatheRate(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.breatheRate_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonToPauseOrResume(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.buttonToPauseOrResume_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalorie(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        this.calorie_ = fitnessProtoV2$SettingsGoalData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinueSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.continueSportReminder_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndSportReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.endSportReminder_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTimeGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        this.exerciseTimeGoal_ = fitnessProtoV2$SettingsGoalData;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthDailyReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.healthDailyReport_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthWeekReport(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.healthWeekReport_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(FitnessProtoV2$AutoMeasureHeartRateSettingsData fitnessProtoV2$AutoMeasureHeartRateSettingsData) {
        fitnessProtoV2$AutoMeasureHeartRateSettingsData.getClass();
        this.heartRate_ = fitnessProtoV2$AutoMeasureHeartRateSettingsData;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsa(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.osa_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuietHeartRate(FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData) {
        fitnessProtoV2$QuietHeartRateSettingsData.getClass();
        this.quietHeartRate_ = fitnessProtoV2$QuietHeartRateSettingsData;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentary(FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData) {
        fitnessProtoV2$SedentaryReminderSettingsData.getClass();
        this.sedentary_ = fitnessProtoV2$SedentaryReminderSettingsData;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentaryReminderTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sedentaryReminderTheme_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepRem(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sleepRem_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2AllDayMonitor(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.spo2AllDayMonitor_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2LowWarning(FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData) {
        fitnessProtoV2$Spo2LowWarningSettingsData.getClass();
        this.spo2LowWarning_ = fitnessProtoV2$Spo2LowWarningSettingsData;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportGoal(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        this.sportGoal_ = fitnessProtoV2$SettingsGoalData;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsAutoPause(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sportsAutoPause_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsAutoRecognize(FitnessProtoV2$SportsAutoRecognizeSettingsData fitnessProtoV2$SportsAutoRecognizeSettingsData) {
        fitnessProtoV2$SportsAutoRecognizeSettingsData.getClass();
        this.sportsAutoRecognize_ = fitnessProtoV2$SportsAutoRecognizeSettingsData;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsDoubleVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sportsDoubleVoiceBroadcast_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsHeartRate(FitnessProtoV2$SportsHeartRateSettingsData fitnessProtoV2$SportsHeartRateSettingsData) {
        fitnessProtoV2$SportsHeartRateSettingsData.getClass();
        this.sportsHeartRate_ = fitnessProtoV2$SportsHeartRateSettingsData;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsVoiceBroadcast(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sportsVoiceBroadcast_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportsVoicePacksTheme(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sportsVoicePacksTheme_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStep(FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData) {
        fitnessProtoV2$SettingsGoalData.getClass();
        this.step_ = fitnessProtoV2$SettingsGoalData;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStress(FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData) {
        fitnessProtoV2$StressSettingsData.getClass();
        this.stress_ = fitnessProtoV2$StressSettingsData;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTumble(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.tumble_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 256;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (ko7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FitnessProtoV2$SHSettingsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\u0017\u0019ဉ\u0018\u001aဉ\u0019\u001bဉ\u001a\u001cဉ\u001b\u001dဉ\u001c", new Object[]{"bitField0_", "step_", "calorie_", "exerciseTimeGoal_", "activityGoal_", "sedentary_", "activityGoalComplete_", "healthDailyReport_", "healthWeekReport_", "tumble_", "heartRate_", "quietHeartRate_", "sportsHeartRate_", "aFib_", "stress_", "spo2AllDayMonitor_", "spo2LowWarning_", "osa_", "breatheRate_", "sleepRem_", "sportsAutoPause_", "sportsAutoRecognize_", "sportsVoiceBroadcast_", "sportsDoubleVoiceBroadcast_", "buttonToPauseOrResume_", "sportGoal_", "continueSportReminder_", "endSportReminder_", "sedentaryReminderTheme_", "sportsVoicePacksTheme_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SHSettingsData.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getAFib() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.aFib_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsGoalData getActivityGoal() {
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData = this.activityGoal_;
        return fitnessProtoV2$SettingsGoalData == null ? FitnessProtoV2$SettingsGoalData.getDefaultInstance() : fitnessProtoV2$SettingsGoalData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getActivityGoalComplete() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.activityGoalComplete_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getBreatheRate() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.breatheRate_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getButtonToPauseOrResume() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.buttonToPauseOrResume_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsGoalData getCalorie() {
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData = this.calorie_;
        return fitnessProtoV2$SettingsGoalData == null ? FitnessProtoV2$SettingsGoalData.getDefaultInstance() : fitnessProtoV2$SettingsGoalData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getContinueSportReminder() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.continueSportReminder_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getEndSportReminder() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.endSportReminder_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsGoalData getExerciseTimeGoal() {
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData = this.exerciseTimeGoal_;
        return fitnessProtoV2$SettingsGoalData == null ? FitnessProtoV2$SettingsGoalData.getDefaultInstance() : fitnessProtoV2$SettingsGoalData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getHealthDailyReport() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.healthDailyReport_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getHealthWeekReport() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.healthWeekReport_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$AutoMeasureHeartRateSettingsData getHeartRate() {
        FitnessProtoV2$AutoMeasureHeartRateSettingsData fitnessProtoV2$AutoMeasureHeartRateSettingsData = this.heartRate_;
        return fitnessProtoV2$AutoMeasureHeartRateSettingsData == null ? FitnessProtoV2$AutoMeasureHeartRateSettingsData.getDefaultInstance() : fitnessProtoV2$AutoMeasureHeartRateSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getOsa() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.osa_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$QuietHeartRateSettingsData getQuietHeartRate() {
        FitnessProtoV2$QuietHeartRateSettingsData fitnessProtoV2$QuietHeartRateSettingsData = this.quietHeartRate_;
        return fitnessProtoV2$QuietHeartRateSettingsData == null ? FitnessProtoV2$QuietHeartRateSettingsData.getDefaultInstance() : fitnessProtoV2$QuietHeartRateSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SedentaryReminderSettingsData getSedentary() {
        FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData = this.sedentary_;
        return fitnessProtoV2$SedentaryReminderSettingsData == null ? FitnessProtoV2$SedentaryReminderSettingsData.getDefaultInstance() : fitnessProtoV2$SedentaryReminderSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSedentaryReminderTheme() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sedentaryReminderTheme_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSleepRem() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sleepRem_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSpo2AllDayMonitor() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.spo2AllDayMonitor_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$Spo2LowWarningSettingsData getSpo2LowWarning() {
        FitnessProtoV2$Spo2LowWarningSettingsData fitnessProtoV2$Spo2LowWarningSettingsData = this.spo2LowWarning_;
        return fitnessProtoV2$Spo2LowWarningSettingsData == null ? FitnessProtoV2$Spo2LowWarningSettingsData.getDefaultInstance() : fitnessProtoV2$Spo2LowWarningSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsGoalData getSportGoal() {
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData = this.sportGoal_;
        return fitnessProtoV2$SettingsGoalData == null ? FitnessProtoV2$SettingsGoalData.getDefaultInstance() : fitnessProtoV2$SettingsGoalData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSportsAutoPause() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sportsAutoPause_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SportsAutoRecognizeSettingsData getSportsAutoRecognize() {
        FitnessProtoV2$SportsAutoRecognizeSettingsData fitnessProtoV2$SportsAutoRecognizeSettingsData = this.sportsAutoRecognize_;
        return fitnessProtoV2$SportsAutoRecognizeSettingsData == null ? FitnessProtoV2$SportsAutoRecognizeSettingsData.getDefaultInstance() : fitnessProtoV2$SportsAutoRecognizeSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSportsDoubleVoiceBroadcast() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sportsDoubleVoiceBroadcast_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SportsHeartRateSettingsData getSportsHeartRate() {
        FitnessProtoV2$SportsHeartRateSettingsData fitnessProtoV2$SportsHeartRateSettingsData = this.sportsHeartRate_;
        return fitnessProtoV2$SportsHeartRateSettingsData == null ? FitnessProtoV2$SportsHeartRateSettingsData.getDefaultInstance() : fitnessProtoV2$SportsHeartRateSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSportsVoiceBroadcast() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sportsVoiceBroadcast_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSportsVoicePacksTheme() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sportsVoicePacksTheme_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsGoalData getStep() {
        FitnessProtoV2$SettingsGoalData fitnessProtoV2$SettingsGoalData = this.step_;
        return fitnessProtoV2$SettingsGoalData == null ? FitnessProtoV2$SettingsGoalData.getDefaultInstance() : fitnessProtoV2$SettingsGoalData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$StressSettingsData getStress() {
        FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData = this.stress_;
        return fitnessProtoV2$StressSettingsData == null ? FitnessProtoV2$StressSettingsData.getDefaultInstance() : fitnessProtoV2$StressSettingsData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getTumble() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.tumble_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasAFib() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasActivityGoal() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasActivityGoalComplete() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasBreatheRate() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasButtonToPauseOrResume() {
        return (this.bitField0_ & 8388608) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasCalorie() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasContinueSportReminder() {
        return (this.bitField0_ & 33554432) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasEndSportReminder() {
        return (this.bitField0_ & 67108864) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasExerciseTimeGoal() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasHealthDailyReport() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasHealthWeekReport() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasHeartRate() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasOsa() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasQuietHeartRate() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSedentary() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSedentaryReminderTheme() {
        return (this.bitField0_ & 134217728) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSleepRem() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSpo2AllDayMonitor() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSpo2LowWarning() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportGoal() {
        return (this.bitField0_ & 16777216) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportsAutoPause() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportsAutoRecognize() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportsDoubleVoiceBroadcast() {
        return (this.bitField0_ & 4194304) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportsHeartRate() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportsVoiceBroadcast() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasSportsVoicePacksTheme() {
        return (this.bitField0_ & 268435456) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasStep() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasStress() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SHSettingsDataOrBuilder
    public boolean hasTumble() {
        return (this.bitField0_ & 256) != 0;
    }

    public static Builder newBuilder(FitnessProtoV2$SHSettingsData fitnessProtoV2$SHSettingsData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SHSettingsData);
    }

    public static FitnessProtoV2$SHSettingsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SHSettingsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SHSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}