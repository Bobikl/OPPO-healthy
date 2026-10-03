package com.lifesense.plugin.ble.data;

import android.text.TextUtils;
import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;

/* JADX INFO: loaded from: classes5.dex */
public enum LSDeviceType {
    Unknown("00"),
    WeightScale("01"),
    ActivityTracker("04"),
    KitchenScale(DeviceTypeConstants.KITCHEN_SCALE),
    HeightMeter(DeviceTypeConstants.HEIGHT_RULER),
    BloodPressureMeter("08"),
    FatScale("02"),
    BloodGlucoseMeter("06");

    private String value;

    LSDeviceType(String str) {
        this.value = str;
    }

    public static LSDeviceType getDeviceType(String str) {
        LSDeviceType lSDeviceType = Unknown;
        for (LSDeviceType lSDeviceType2 : values()) {
            if (!TextUtils.isEmpty(str) && lSDeviceType2.getValue().equalsIgnoreCase(str)) {
                return lSDeviceType2;
            }
        }
        return lSDeviceType;
    }

    public String getValue() {
        return this.value;
    }
}
