package com.oplus.mydevices.sdk.compat;

import android.content.ContentValues;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class ActionMenu {
    public static final String DB_KEY_ACTION_MENU_ACTION_TYPE = "menu_action_type";
    public static final String DB_KEY_ACTION_MENU_ICON_RES_ID = "menu_icon_res_id";
    public static final String DB_KEY_ACTION_MENU_ICON_RES_ID_DARK = "menu_icon_res_id_dark";
    public static final String DB_KEY_ACTION_MENU_ID = "menu_id";
    public static final String DB_KEY_ACTION_MENU_INTENT_ACTION = "menu_intent_action";
    public static final String DB_KEY_ACTION_MENU_INTENT_CLASS = "menu_intent_class";
    public static final String DB_KEY_ACTION_MENU_INTENT_HAVE_EXTRA = "menu_intent_have_extra";
    public static final String DB_KEY_ACTION_MENU_INTENT_PACKAGE = "menu_intent_package";
    public static final String DB_KEY_ACTION_MENU_NAME = "menu_name";
    public static final String DB_KEY_DEVICE_ID = "device_id";
    private static final String TAG = "ActionMenu";
    private String mAuthority;
    private String mDeviceId;
    private String mMenuId;
    private String mMenuName = "";

    @IdRes
    private int mMenuIconResId = -1;

    @IdRes
    private int mMenuIconResIdDark = -1;
    private String mMenuActionType = "";
    private String mMenuIntentAction = "";
    private String mMenuIntentPackage = "";
    private String mMenuIntentClass = "";
    private int mMenuIntentHaveExtra = 0;
    private ArrayList<IntentExtra> intentExtraList = new ArrayList<>();

    public static class ActionType {
        public static final String ACTIVITY = "activity";
        public static final String BROADCAST = "broadcast";
        public static final String SERVICE = "service";

        public static boolean isValidActionType(String str) {
            return "activity".equals(str) || "broadcast".equals(str) || "service".equals(str);
        }
    }

    public ActionMenu(String str, String str2) {
        if (str == null || str.isEmpty()) {
            OLog.e(TAG, "deviceId is empty");
            throw new IllegalArgumentException();
        }
        str2 = str2 == null ? "" : str2;
        this.mDeviceId = str;
        this.mMenuId = str2;
    }

    public String getAuthority() {
        return this.mAuthority;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public ArrayList<IntentExtra> getIntentExtraList() {
        return this.intentExtraList;
    }

    public String getMenuActionType() {
        return this.mMenuActionType;
    }

    @IdRes
    public int getMenuIconResId() {
        return this.mMenuIconResId;
    }

    @IdRes
    public int getMenuIconResIdDark() {
        return this.mMenuIconResIdDark;
    }

    public String getMenuId() {
        return this.mMenuId;
    }

    public String getMenuIntentAction() {
        return this.mMenuIntentAction;
    }

    public String getMenuIntentClass() {
        return this.mMenuIntentClass;
    }

    public int getMenuIntentHaveExtra() {
        return this.mMenuIntentHaveExtra;
    }

    public String getMenuIntentPackage() {
        return this.mMenuIntentPackage;
    }

    public String getMenuName() {
        return this.mMenuName;
    }

    public void saveToContentValues(ContentValues contentValues) {
        if (contentValues == null) {
            return;
        }
        contentValues.put("device_id", this.mDeviceId);
        contentValues.put("menu_id", this.mMenuId);
        contentValues.put(DB_KEY_ACTION_MENU_NAME, this.mMenuName);
        contentValues.put(DB_KEY_ACTION_MENU_ICON_RES_ID, Integer.valueOf(this.mMenuIconResId));
        contentValues.put(DB_KEY_ACTION_MENU_ICON_RES_ID_DARK, Integer.valueOf(this.mMenuIconResIdDark));
        contentValues.put(DB_KEY_ACTION_MENU_ACTION_TYPE, this.mMenuActionType);
        contentValues.put(DB_KEY_ACTION_MENU_INTENT_ACTION, this.mMenuIntentAction);
        contentValues.put(DB_KEY_ACTION_MENU_INTENT_PACKAGE, this.mMenuIntentPackage);
        contentValues.put(DB_KEY_ACTION_MENU_INTENT_CLASS, this.mMenuIntentClass);
        contentValues.put(DB_KEY_ACTION_MENU_INTENT_HAVE_EXTRA, Integer.valueOf(this.mMenuIntentHaveExtra));
    }

    public void setAuthority(String str) {
        this.mAuthority = str;
    }

    public void setMenuActionType(String str) {
        if (ActionType.isValidActionType(str)) {
            this.mMenuActionType = str;
            return;
        }
        OLog.w(TAG, "setMenuActionType, illegal actionType:" + str);
    }

    public void setMenuIconResId(@IdRes int i) {
        this.mMenuIconResId = i;
    }

    public void setMenuIconResIdDark(@IdRes int i) {
        this.mMenuIconResIdDark = i;
    }

    public void setMenuIntentAction(String str) {
        this.mMenuIntentAction = str;
    }

    public void setMenuIntentClass(String str) {
        this.mMenuIntentClass = str;
    }

    public void setMenuIntentHaveExtra(int i) {
        if (i > 1) {
            i = 1;
        } else if (i < 0) {
            i = 0;
        }
        this.mMenuIntentHaveExtra = i;
    }

    public void setMenuIntentPackage(String str) {
        this.mMenuIntentPackage = str;
    }

    public void setMenuName(String str) {
        this.mMenuName = str;
    }

    @NonNull
    public String toString() {
        return "ActionMenu: " + this.mDeviceId + ", " + this.mMenuId + ", " + this.mMenuName + ", " + this.mMenuIconResId + ", " + this.mMenuIconResIdDark + ", " + this.mMenuActionType + ", " + this.mMenuIntentAction + ", " + this.mMenuIntentPackage + ", " + this.mMenuIntentClass + ", " + this.mMenuIntentHaveExtra;
    }
}
