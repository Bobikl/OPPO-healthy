package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;

/* JADX INFO: loaded from: classes19.dex */
public class lx3 {
    public static boolean a(int i, Proto$DeviceInfo proto$DeviceInfo) {
        return TextUtils.equals(String.valueOf(i), proto$DeviceInfo.getDeviceCategory());
    }

    public static i11 b(String str) {
        for (i11 i11Var : ntl.m().k().values()) {
            if (TextUtils.equals(i11Var.h().getDeviceMac(), str)) {
                return i11Var;
            }
        }
        return null;
    }

    public static Proto$DeviceInfo c(String str) {
        Proto$DeviceInfo proto$DeviceInfoH = null;
        for (i11 i11Var : ntl.m().k().values()) {
            if (TextUtils.equals(i11Var.h().getDeviceMac(), str)) {
                proto$DeviceInfoH = i11Var.h();
            }
        }
        return proto$DeviceInfoH;
    }
}
