package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATDataQueryCmd {
    All(255),
    BuriedPoint(240),
    BuriedPointSummary(241),
    HeartRate(1),
    Sleep(2),
    ExerciseSpeed(3),
    ExerciseHeartRate(4),
    ExerciseCalories(5),
    RestingHeartRate(6),
    StepRecordOfHistory(7),
    StepRecord(8),
    HeartRateRecord(9),
    CharageRecord(10),
    BacklightBrightness(11),
    DialStyle(12),
    ExerciseStep(13),
    ExerciseSpeedWithImperial(14),
    HeartRateZone(15),
    StepOfHour(129),
    StepOfDay(130),
    Exercise(131),
    BloodOxygen(132),
    Meditation(133),
    SleepReport(134),
    BloodOxygenRecord(135),
    CustomHeartRate(136),
    ContinuousBloodOxygen(137);

    private int value;

    ATDataQueryCmd(int i) {
        this.value = i;
    }

    public static ATDataQueryCmd getDataType(int i) {
        for (ATDataQueryCmd aTDataQueryCmd : values()) {
            if (aTDataQueryCmd.getValue() == i) {
                return aTDataQueryCmd;
            }
        }
        return All;
    }

    public int getValue() {
        return this.value;
    }
}
