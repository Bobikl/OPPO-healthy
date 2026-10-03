package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.data.IPacketEncoder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ATConfigItem implements IPacketEncoder {
    public static final int TYPE_BLOOD_OXYGEN_TEST_SWITCH = 32;
    public static final int TYPE_BRIGHTNESS = 3;
    public static final int TYPE_DIAL_ELEMENTS = 10;
    public static final int TYPE_DISTURB = 20;
    public static final int TYPE_GOAL_CALORIES = 18;
    public static final int TYPE_GOAL_DISTANCE = 17;
    public static final int TYPE_GOAL_MAIN = 15;
    public static final int TYPE_GOAL_STEP = 16;
    public static final int TYPE_HEART_RATE_ALERT = 21;
    public static final int TYPE_HEIGHT_UNIT = 8;
    public static final int TYPE_HOT_KEY = 4;
    public static final int TYPE_LANGUAGE = 23;
    public static final int TYPE_LENGTH_UNIT = 6;
    public static final int TYPE_MESSAGE_REMIND = 33;
    public static final int TYPE_MUSIC_CONTROL = 34;
    public static final int TYPE_NIGHT_MODE = 19;
    public static final int TYPE_RUNNING_STRIDE = 14;
    public static final int TYPE_SEDENTARY = 22;
    public static final int TYPE_SLEEP_WAKEUP = 12;
    public static final int TYPE_TEMPERATURE = 1;
    public static final int TYPE_TIME = 11;
    public static final int TYPE_UNIVERSAL_UNIT = 5;
    public static final int TYPE_VIBRATION_INTENSITY = 2;
    public static final int TYPE_WALKING_STRIDE = 13;
    public static final int TYPE_WEEK_START = 9;
    public static final int TYPE_WEIGHT_UNIT = 7;
    protected int type;

    public abstract int countOfItem();
}
