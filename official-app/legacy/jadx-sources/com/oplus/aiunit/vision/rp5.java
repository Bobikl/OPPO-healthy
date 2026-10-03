package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.devicetype.constants.Constants;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import java.util.Objects;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class rp5 {
    public static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @Nullable
    public static UserDeviceInfo b(String str) {
        return gl4.managerApi.getBoundDeviceInfoByMac(str);
    }

    public static String c(String str) {
        UserDeviceInfo boundDeviceInfoByMac = gl4.managerApi.getBoundDeviceInfoByMac(str);
        String model = boundDeviceInfoByMac != null ? boundDeviceInfoByMac.getModel() : null;
        a7b.f("DeviceTypeUtil", "Query device model by mac=" + gdb.a(str) + " model=" + model);
        return model;
    }

    @Nullable
    public static VirtualAccountData d(String str) {
        VirtualAccountData virtualAccountDataI = gl4.businessApi.i(str);
        if (virtualAccountDataI == null) {
            return null;
        }
        return virtualAccountDataI;
    }

    @Nullable
    public static String e(String str) {
        VirtualAccountData virtualAccountDataD = d(str);
        if (virtualAccountDataD == null) {
            return null;
        }
        return virtualAccountDataD.getVirtualSsoid();
    }

    public static boolean f(int i) {
        return 5 == i;
    }

    public static boolean g(String str) {
        return ((Boolean) lc5.c(str).a(new Function1() { // from class: com.oplus.aiunit.vision.qp5
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((DeviceInfo) obj).Ra());
            }
        })).booleanValue();
    }

    public static boolean h(String str) {
        try {
            return Integer.parseInt(String.valueOf(str.charAt(1))) == 3;
        } catch (Exception unused) {
            a7b.f("DeviceTypeUtil", "parse os version fail");
            return false;
        }
    }

    public static boolean i(String str, String str2) {
        a7b.f("DeviceTypeUtil", "isTreadmill(), model = " + str + ", limitModel = " + str2);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return Constants.TREADMILL_TYPES.contains(str);
        }
        return false;
    }

    public static boolean j(int i) {
        return DeviceConstants.INSTANCE.y().containsKey(Integer.valueOf(i));
    }

    public static boolean k(byte[] bArr, String str) {
        int iKeyAt;
        SparseArray<byte[]> sparseArrayB = leg.c(bArr).b();
        boolean z = false;
        for (int i = 0; i < sparseArrayB.size() && 1946 == (iKeyAt = sparseArrayB.keyAt(i)); i++) {
            String strSubstring = ge8.a(sparseArrayB.get(iKeyAt)).substring(10);
            StringBuilder sb = new StringBuilder();
            sb.append("treadmillLimit: id = ");
            sb.append(iKeyAt);
            sb.append("    bleDeviceType = ");
            sb.append(strSubstring);
            sb.append("    limitDeviceType:");
            sb.append(str);
            if (Objects.equals(ge8.c(str), strSubstring)) {
                z = true;
                break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("treadmillLimit: result = ");
        sb2.append(z);
        return z;
    }
}
