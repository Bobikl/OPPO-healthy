package com.lifesense.device.scale.utils;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.platform.barcode.util.LogUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean OPEN_DEBUG = true;
    public static InterfaceC0843a customLogger = null;
    public static String customTagPrefix = "";

    /* JADX INFO: renamed from: com.lifesense.device.scale.utils.a$a, reason: collision with other inner class name */
    public interface InterfaceC0843a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public static StackTraceElement a() {
        return Thread.currentThread().getStackTrace()[4];
    }

    public static void b(String str) {
        if (OPEN_DEBUG) {
            String strA = a(a());
            InterfaceC0843a interfaceC0843a = customLogger;
            if (interfaceC0843a != null) {
                interfaceC0843a.a(strA, str);
            } else {
                Log.e(strA, str);
            }
        }
    }

    public static String a(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        String str = String.format(LogUtils.TAG_FORMAT, className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (TextUtils.isEmpty(customTagPrefix)) {
            return str;
        }
        return customTagPrefix + ":" + str;
    }

    public static void a(String str) {
        if (OPEN_DEBUG) {
            String strA = a(a());
            InterfaceC0843a interfaceC0843a = customLogger;
            if (interfaceC0843a != null) {
                interfaceC0843a.b(strA, str);
            } else {
                Log.d(strA, str);
            }
        }
    }
}
