package com.oplus.aiunit.vision;

import android.os.Build;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;

/* JADX INFO: loaded from: classes18.dex */
public class h4j {
    public static boolean a(int i) {
        boolean z;
        if (i != 6) {
            a7b.f("TelHealth.PhoneTelecomSupport", "isCallTransfer: status is not IN_CALL_SHOW");
            z = false;
        } else {
            z = true;
        }
        if (v9g.w().r("key_callforwar", false)) {
            return z;
        }
        a7b.f("TelHealth.PhoneTelecomSupport", "isCallTransfer: call transfer is off");
        return false;
    }

    public static boolean b() {
        return ilj.A() || (Build.VERSION.SDK_INT > 29 && ilj.z()) || ilj.x();
    }

    public static boolean c() {
        boolean z;
        if (b()) {
            z = true;
        } else {
            a7b.f("TelHealth.PhoneTelecomSupport", "supportHFPExtend: is not LinkageColorOsRom");
            z = false;
        }
        if (!PermissionRequestDialog.D(9, "android.permission.READ_PHONE_STATE")) {
            a7b.f("TelHealth.PhoneTelecomSupport", "supportHFPExtend: do not has READ_PHONE_STATE permission!");
            z = false;
        }
        if (!PermissionRequestDialog.D(9, "android.permission.CALL_PHONE")) {
            a7b.f("TelHealth.PhoneTelecomSupport", "supportHFPExtend: do not has CALL_PHONE permission!");
            z = false;
        }
        if (PermissionRequestDialog.D(9, "android.permission.READ_CALL_LOG")) {
            return z;
        }
        a7b.f("TelHealth.PhoneTelecomSupport", "supportHFPExtend: do not has READ_CALL_LOG permission!");
        return false;
    }

    public static boolean d() {
        boolean z;
        if (PermissionRequestDialog.D(9, "android.permission.READ_PHONE_STATE")) {
            z = true;
        } else {
            a7b.f("TelHealth.PhoneTelecomSupport", "supportPhoneStateObtain: do not has READ_PHONE_STATE permission!");
            z = false;
        }
        if (PermissionRequestDialog.D(9, "android.permission.READ_CALL_LOG")) {
            return z;
        }
        a7b.f("TelHealth.PhoneTelecomSupport", "supportPhoneStateObtain: do not has READ_CALL_LOG permission!");
        return false;
    }

    public static boolean e() {
        boolean z;
        if (c()) {
            z = true;
        } else {
            a7b.f("TelHealth.PhoneTelecomSupport", "supportSmsExtend: is not supportHFPExtend");
            z = false;
        }
        if (PermissionRequestDialog.D(9, "android.permission.SEND_SMS")) {
            return z;
        }
        a7b.f("TelHealth.PhoneTelecomSupport", "supportHFPExtend: do not has SEND_SMS permission!");
        return false;
    }
}
