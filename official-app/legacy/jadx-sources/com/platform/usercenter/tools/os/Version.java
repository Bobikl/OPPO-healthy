package com.platform.usercenter.tools.os;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;

/* JADX INFO: loaded from: classes9.dex */
public class Version {
    private Version() {
    }

    @TargetApi(11)
    public static void enableStrictMode() {
        if (hasGingerbread()) {
            StrictMode.ThreadPolicy.Builder builderPenaltyLog = new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog();
            StrictMode.VmPolicy.Builder builderPenaltyLog2 = new StrictMode.VmPolicy.Builder().detectAll().penaltyLog();
            if (hasHoneycomb()) {
                builderPenaltyLog.penaltyFlashScreen();
            }
            StrictMode.setThreadPolicy(builderPenaltyLog.build());
            StrictMode.setVmPolicy(builderPenaltyLog2.build());
        }
    }

    public static boolean hasFroyo() {
        return true;
    }

    public static boolean hasGingerbread() {
        return true;
    }

    public static boolean hasHoneycomb() {
        return true;
    }

    public static boolean hasHoneycombMR1() {
        return true;
    }

    public static boolean hasJellyBean() {
        return true;
    }

    public static boolean hasJellyBeanMR1() {
        return true;
    }

    public static boolean hasKitKat() {
        return true;
    }

    public static boolean hasL() {
        return true;
    }

    public static boolean hasL_MR1() {
        return true;
    }

    public static boolean hasM() {
        return true;
    }

    public static boolean hasN() {
        return true;
    }

    public static boolean hasNMR1() {
        return true;
    }

    public static boolean hasO() {
        return true;
    }

    public static boolean hasOMR1() {
        return true;
    }

    public static boolean hasP() {
        return true;
    }

    public static boolean hasQ() {
        return true;
    }

    public static boolean hasR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean hasS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean hasT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean hasU() {
        return Build.VERSION.SDK_INT >= 34;
    }
}
