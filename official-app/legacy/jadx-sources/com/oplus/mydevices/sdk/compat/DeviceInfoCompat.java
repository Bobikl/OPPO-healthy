package com.oplus.mydevices.sdk.compat;

import android.content.ContentValues;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceInfoCompat {
    public static final String DB_KEY_DEVICE_ICON_RES_ID = "device_icon_res_id";
    public static final String DB_KEY_DEVICE_ICON_RES_ID_DARK = "device_icon_res_id_dark";
    public static final String DB_KEY_DEVICE_ID = "device_id";
    public static final String DB_KEY_DEVICE_NAME = "device_name";
    public static final String DB_KEY_DEVICE_STATE = "device_state";
    public static final String DB_KEY_DEVICE_TYPE = "device_type";
    public static final String TAG = "DeviceInfo";
    private String mAuthority;
    private String mDeviceId;
    private String mDeviceName = "";

    @IdRes
    private int mDeviceIconResId = -1;

    @IdRes
    private int mDeviceIconResIdDark = -1;
    private String mDeviceType = "";
    private String mDeviceState = DeviceState.DISCONNECTED;
    private ArrayList<ActionMenu> actionMenuList = new ArrayList<>();

    public static class DeviceState {
        public static final String CONNECTED = "connected";
        public static final String CONNECTING = "connecting";
        public static final String DISCONNECTED = "disconnected";

        public static boolean isValidDeviceState(String str) {
            return CONNECTING.equals(str) || CONNECTED.equals(str) || DISCONNECTED.equals(str);
        }
    }

    public static class DeviceType {
        public static final String CAR = "car";
        public static final String COMPUTER = "computer";
        public static final String HEADSET = "headset";
        public static final String PAD = "pad";
        public static final String TV = "tv";
        public static final String WATCH = "watch";
        public static final String WRISTBAND = "wristband";

        public static boolean isValidDeviceType(String str) {
            return TV.equals(str) || WATCH.equals(str) || WRISTBAND.equals(str) || HEADSET.equals(str) || COMPUTER.equals(str) || PAD.equals(str) || "car".equals(str);
        }
    }

    public DeviceInfoCompat(String str) {
        if (str == null || str.isEmpty()) {
            OLog.e(TAG, "deviceId is empty");
            throw new IllegalArgumentException();
        }
        this.mDeviceId = str;
    }

    public ArrayList<ActionMenu> getActionMenuList() {
        return this.actionMenuList;
    }

    public String getAuthority() {
        return this.mAuthority;
    }

    @IdRes
    public int getDeviceIconResId() {
        return this.mDeviceIconResId;
    }

    @IdRes
    public int getDeviceIconResIdDark() {
        return this.mDeviceIconResIdDark;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public String getDeviceState() {
        return this.mDeviceState;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public void saveToContentValues(ContentValues contentValues) {
        if (contentValues == null) {
            return;
        }
        contentValues.put("device_id", this.mDeviceId);
        contentValues.put(DB_KEY_DEVICE_NAME, this.mDeviceName);
        contentValues.put(DB_KEY_DEVICE_ICON_RES_ID, Integer.valueOf(this.mDeviceIconResId));
        contentValues.put(DB_KEY_DEVICE_ICON_RES_ID_DARK, Integer.valueOf(this.mDeviceIconResIdDark));
        contentValues.put("device_type", this.mDeviceType);
        contentValues.put(DB_KEY_DEVICE_STATE, this.mDeviceState);
    }

    public void setAuthority(String str) {
        this.mAuthority = str;
    }

    public void setDeviceIconResId(@IdRes int i) {
        this.mDeviceIconResId = i;
    }

    public void setDeviceIconResIdDark(@IdRes int i) {
        this.mDeviceIconResIdDark = i;
    }

    public void setDeviceName(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.mDeviceName = str;
    }

    public void setDeviceState(String str) {
        if (DeviceState.isValidDeviceState(str)) {
            this.mDeviceState = str;
            return;
        }
        OLog.e(TAG, "setDeviceState, illegal deviceState:" + str);
    }

    public void setDeviceType(String str) {
        if (DeviceType.isValidDeviceType(str)) {
            this.mDeviceType = str;
            return;
        }
        OLog.e(TAG, "setDeviceType, illegal deviceType:" + str);
    }

    @NonNull
    public String toString() {
        return "DeviceInfo: " + this.mDeviceId + ", " + this.mDeviceName + ", " + this.mDeviceIconResId + ", " + this.mDeviceIconResIdDark + ", " + this.mDeviceType + ", " + this.mDeviceState;
    }
}
