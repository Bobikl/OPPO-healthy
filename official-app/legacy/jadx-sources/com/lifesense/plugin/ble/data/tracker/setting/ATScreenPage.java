package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATScreenPage {
    Time(0),
    Step(1),
    Calorie(2),
    Distance(3),
    HeartRate(4),
    Running(5),
    Walking(6),
    Cycling(7),
    Swimming(8),
    StrengthTraining(9),
    Climbing(10),
    DailyData(11),
    Stopwatch(12),
    Weather(13),
    Battery(14),
    IndoorRunning(15),
    Elliptical(16),
    AerobicExercise(17),
    Basketball(18),
    Football(19),
    Badminton(20),
    Volleyball(21),
    PingPong(22),
    Yoga(23),
    Gaming(24),
    AerobicExercise12(25),
    AerobicExercise6(26),
    Alipy(27),
    FitnessDance(28),
    Taichi(29),
    HealthScore(64),
    MusicPlayer(65),
    PhoneLocation(66),
    DeviceSetting(67),
    KchiingAgenda(68),
    KchiingReminderQuery(69);

    private int command;

    ATScreenPage(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
