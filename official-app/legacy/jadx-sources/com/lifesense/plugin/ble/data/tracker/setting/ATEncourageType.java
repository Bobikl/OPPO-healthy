package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATEncourageType {
    None(0),
    Step(1),
    Calories(2),
    Distance(3),
    ExerciseAmount(4);

    private int value;

    ATEncourageType(int i) {
        this.value = i;
    }

    public static ATEncourageType getTargetState(int i) {
        for (ATEncourageType aTEncourageType : values()) {
            if (i == aTEncourageType.getValue()) {
                return aTEncourageType;
            }
        }
        return Step;
    }

    public int getValue() {
        return this.value;
    }
}
