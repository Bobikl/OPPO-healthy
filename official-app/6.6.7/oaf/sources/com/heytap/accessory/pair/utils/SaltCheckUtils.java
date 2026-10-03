package com.heytap.accessory.pair.utils;

import com.oplus.aiunit.vision.fdg;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SaltCheckUtils {
    public static final String SALT_TYPE_BLUETOOTH_BOND = "bluetooth_bond";
    public static final String SALT_TYPE_KEY_BASED_PAIRING = "key_based_pairing";
    public static final String SALT_TYPE_KSC_GENERATING = "ksc_generating";
    public static final String SALT_TYPE_WIFI_DIRECT_CONNECTING = "wifi_direct_connecting";

    public static boolean checkSalt(String str, String str2, byte[] bArr) {
        byte[] bArrLoadLastSalt = loadLastSalt(str, str2);
        saveSalt(str, str2, bArr);
        return Arrays.equals(bArrLoadLastSalt, bArr);
    }

    private static byte[] loadLastSalt(String str, String str2) {
        return PlatformUtils.getPrivateSharedPreferences().E(str2 + str, "").getBytes();
    }

    private static void saveSalt(String str, String str2, byte[] bArr) {
        fdg privateSharedPreferences = PlatformUtils.getPrivateSharedPreferences();
        privateSharedPreferences.U(str2 + str, Arrays.toString(bArr));
        privateSharedPreferences.j();
    }
}
