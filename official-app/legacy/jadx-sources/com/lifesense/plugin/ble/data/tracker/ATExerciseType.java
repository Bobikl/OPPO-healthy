package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public enum ATExerciseType {
    Unknown(0),
    Running(1),
    Walking(2),
    Cycling(3),
    Swimming(4),
    BodyBuilding(5),
    NewRunning(6),
    IndoorRunning(7),
    Elliptical(8),
    AerobicSport(9),
    Basketball(10),
    Football(11),
    Badminton(12),
    Volleyball(13),
    Pingpong(14),
    Yoga(15),
    Gaming(16),
    AerobicSport12(17),
    AerobicSport6(18),
    FitnessDance(19),
    TaiChi(20),
    Cricket(21),
    Boating(22),
    SpinningBike(23),
    IndoorCycling(24),
    FreeMovement(25);

    private int category;

    ATExerciseType(int i) {
        this.category = i;
    }

    public static ATExerciseType getDataType(int i) {
        for (ATExerciseType aTExerciseType : values()) {
            if (aTExerciseType.getValue() == i) {
                return aTExerciseType;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.category;
    }
}
