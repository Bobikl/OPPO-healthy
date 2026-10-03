package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATWeatherType {
    SunnyDay(0),
    SunnyNight(1),
    Cloudy(2),
    FineCloudyDay(3),
    FineCloudyNight(4),
    MostCloudyDay(5),
    MostCloudyNight(6),
    Overcast(7),
    Shower(8),
    ThunderShower(9),
    Hail(10),
    RainLight(11),
    RainModerate(12),
    RainHeavy(13),
    RainStorm(14),
    RainBigHeavy(15),
    RainSuperStorm(16),
    RainIce(17),
    RainSnow(18),
    SnowShower(19),
    SnowLittle(20),
    SnowModerate(21),
    SnowHeavy(22),
    SnowStorm(23),
    Dust(24),
    SandBlowing(25),
    SandStorm(26),
    SandStrongStorm(27),
    Fog(28),
    Haze(29),
    Wing(30),
    WingHigh(31),
    Hurricane(32),
    TropicalStorm(33),
    Tornado(34);

    private int command;

    ATWeatherType(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
