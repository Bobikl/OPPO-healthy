package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.tracker.ATExerciseType;

/* JADX INFO: loaded from: classes5.dex */
public class ATAutoRecognitionItem {
    private boolean enable;
    private ATExerciseType type;

    public ATAutoRecognitionItem(boolean z, ATExerciseType aTExerciseType) {
        this.enable = z;
        this.type = aTExerciseType;
    }

    public ATExerciseType getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
