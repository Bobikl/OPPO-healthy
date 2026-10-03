package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum Tone {
    OFF(0),
    TONE(1),
    VIBRATE(2),
    TONE_AND_VIBRATE(3),
    INVALID(255);

    protected short value;

    Tone(short s) {
        this.value = s;
    }

    public static Tone getByValue(Short sh) {
        for (Tone tone : values()) {
            if (sh.shortValue() == tone.value) {
                return tone;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(Tone tone) {
        return tone.name();
    }

    public short getValue() {
        return this.value;
    }
}
