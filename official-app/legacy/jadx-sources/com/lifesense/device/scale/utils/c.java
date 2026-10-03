package com.lifesense.device.scale.utils;

import android.content.SharedPreferences;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;
import com.lifesense.device.scale.context.LDAppHolder;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static String a() {
        return "[id=" + LDAppHolder.getUserId() + "]";
    }

    public static SharedPreferences b() {
        return b(LDAppHolder.getUserId() + "_device_manager.cfg");
    }

    public static void c() {
        a("crash_file_name", a());
    }

    public static void a(String str) {
        a(str + "a6_device_user_info", "");
    }

    public static SharedPreferences b(String str) {
        return LDAppHolder.getContext().getSharedPreferences(str, 0);
    }

    public static void a(String str, DeviceUpgradeStatus deviceUpgradeStatus) {
        SharedPreferences.Editor editorEdit = b("ota.cfg").edit();
        editorEdit.putString(str, deviceUpgradeStatus.toString());
        editorEdit.apply();
    }

    public static synchronized void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = b().edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
