package com.coui.appcompat.uiutil;

/* JADX INFO: loaded from: classes13.dex */
public enum AnimLevel {
    HIGN_END(1),
    MID_END(2),
    LOW_END(3),
    ULTRA_LOW_END(4);

    private final int mIntValue;

    AnimLevel(int i) {
        this.mIntValue = i;
    }

    public int getIntValue() {
        return this.mIntValue;
    }

    public static AnimLevel valueOf(int i) {
        for (AnimLevel animLevel : values()) {
            if (animLevel.getIntValue() == i) {
                return animLevel;
            }
        }
        throw new IllegalArgumentException("AnimLevel Invalid int value");
    }
}
