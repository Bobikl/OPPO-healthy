package com.lifesense.android.bluetooth.core.business.log;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SimpleDateFormat"})
public class c {
    public static final int DEBUG_LEVEL_ADVANCED = 2;
    public static final int DEBUG_LEVEL_GENERAL = 1;
    public static final int DEBUG_LEVEL_SUPREME = 3;
    public static final String KEY_BLUETOOTH_LOG_FILES = "com.lifesense.android.bluetooth.core.business.log.c";
    public static List<Integer> a;
    public static boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f8581c;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(1);
        a.add(2);
        b = true;
        f8581c = "test";
    }

    public static String a(Object obj) {
        return "LS-BLE";
    }

    public static String b() {
        return f8581c;
    }

    public static void a() {
        b = false;
    }

    public static void a(Object obj, String str, int i) {
        if (!TextUtils.isEmpty(str) && b) {
            if (!b().equals("LifesenseBluetooth")) {
                if (a.contains(Integer.valueOf(i))) {
                    Log.d(a(obj), str);
                    return;
                }
                return;
            }
            if (i == 1) {
                Log.i(a(obj), str);
            }
            if (i == 2) {
                Log.i(a(obj), str);
            }
            if (i == 3) {
                Log.e(a(obj), str);
            }
        }
    }

    public static void a(String str) {
        f8581c = str;
    }
}
