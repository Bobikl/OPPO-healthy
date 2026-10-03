package com.oplus.mydevices.sdk.compat;

import android.content.ContentValues;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class IntentExtra {
    public static final String DB_KEY_ACTION_MENU_ID = "menu_id";
    public static final String DB_KEY_DEVICE_ID = "device_id";
    public static final String DB_KEY_INTENT_EXTRA_KEY = "intent_extra_key";
    public static final String DB_KEY_INTENT_EXTRA_VALUE = "intent_extra_value";
    private static final String TAG = "IntentExtra";
    private String mDeviceId;
    private String mIntentExtraKey = "";
    private String mIntentExtraValue = "";
    private String mMenuId;

    public IntentExtra(String str, String str2) {
        if (str == null || str.isEmpty()) {
            OLog.e(TAG, "deviceId is empty");
            throw new IllegalArgumentException();
        }
        str2 = str2 == null ? "" : str2;
        this.mDeviceId = str;
        this.mMenuId = str2;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getIntentExtraKey() {
        return this.mIntentExtraKey;
    }

    public String getIntentExtraValue() {
        return this.mIntentExtraValue;
    }

    public String getMenuId() {
        return this.mMenuId;
    }

    public void saveToContentValues(ContentValues contentValues) {
        if (contentValues == null) {
            return;
        }
        contentValues.put("device_id", this.mDeviceId);
        contentValues.put("menu_id", this.mMenuId);
        contentValues.put(DB_KEY_INTENT_EXTRA_KEY, this.mIntentExtraKey);
        contentValues.put(DB_KEY_INTENT_EXTRA_VALUE, this.mIntentExtraValue);
    }

    public void setIntentExtraKey(String str) {
        this.mIntentExtraKey = str;
    }

    public void setIntentExtraValue(String str) {
        this.mIntentExtraValue = str;
    }

    @NonNull
    public String toString() {
        return "IntentExtra: " + this.mDeviceId + ", " + this.mMenuId + ", " + this.mIntentExtraKey + ", " + this.mIntentExtraValue;
    }
}
