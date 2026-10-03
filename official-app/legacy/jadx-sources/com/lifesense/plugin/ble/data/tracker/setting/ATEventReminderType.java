package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATEventReminderType {
    AlarmClock(0),
    DrinkWater(1),
    AddMeal(2),
    Sleep(3),
    Sedentary(4);

    private int value;

    ATEventReminderType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
