package com.heytap.health.settings.band.settings.sporthealthsetting.appsedit;

import androidx.annotation.StringRes;
import com.heytap.health.device_settings.impl.R$string;

/* JADX INFO: loaded from: classes17.dex */
public enum ScreenContentType {
    SCREEN_00((byte) 0, R$string.band_screen_00, true),
    SCREEN_01((byte) 1, R$string.band_screen_01, true),
    SCREEN_02((byte) 2, R$string.band_screen_02, true),
    SCREEN_03((byte) 3, R$string.band_screen_03, true),
    SCREEN_04((byte) 4, R$string.band_screen_04, true),
    SCREEN_05((byte) 5, R$string.band_screen_05, true),
    SCREEN_08((byte) 8, R$string.band_screen_08, true),
    SCREEN_09((byte) 9, R$string.band_screen_09, true),
    SCREEN_0A((byte) 10, R$string.band_screen_0a, false),
    SCREEN_07((byte) 7, R$string.band_screen_07, true),
    SCREEN_10((byte) 16, R$string.band_screen_10, true),
    SCREEN_0B((byte) 11, R$string.band_screen_0b, true);

    private boolean cancelable;
    private byte id;

    @StringRes
    private int nameResId;

    ScreenContentType(byte b, int i, boolean z) {
        this.id = b;
        this.nameResId = i;
        this.cancelable = z;
    }

    public static ScreenContentType fromTypeId(byte b) {
        for (ScreenContentType screenContentType : values()) {
            if (screenContentType.getId() == b) {
                return screenContentType;
            }
        }
        return null;
    }

    public byte getId() {
        return this.id;
    }

    public int getNameResId() {
        return this.nameResId;
    }

    public boolean isCancelable() {
        return this.cancelable;
    }
}
