package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATWatchPage {
    Exercise(0),
    BloodOxygen(1),
    HeartRate(2),
    ExerciseRecord(3),
    PhonePositioning(4),
    AlarmClock(5),
    TakePhotos(6),
    Meditation(7),
    SleepRecord(8),
    Weather(9),
    Stopwatch(10),
    Music(11),
    Countdown(12),
    Setting(13),
    TodayOverview(255);

    private int command;

    ATWatchPage(int i) {
        this.command = i;
    }

    public static ATWatchPage getPage(int i) {
        for (ATWatchPage aTWatchPage : values()) {
            if (aTWatchPage.getCommand() == i) {
                return aTWatchPage;
            }
        }
        return Exercise;
    }

    public int getCommand() {
        return this.command;
    }
}
