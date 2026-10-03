package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.accessory.pair.utils.MD5Utils;
import com.heytap.accessory.security.deviceId.IDeviceIdFetcher;
import com.heytap.accessory.utils.HexUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class i45 implements IDeviceIdFetcher {
    public static final String TAG = "DefaultDeviceIdFetcher";
    public static byte[] a;

    public static byte[] a() {
        byte[] bArrCopyOf = null;
        try {
            String ssoid = um.c().getSsoid();
            if (ssoid != null) {
                bArrCopyOf = Arrays.copyOf(MD5Utils.md5(ssoid.getBytes(), ssoid.length()), 6);
            } else {
                wil.b(TAG, "loadDeviceId: ssoid is null");
            }
        } catch (Exception unused) {
        }
        if (bArrCopyOf == null) {
            wil.b(TAG, "loadDeviceId: error");
            return "202105".getBytes();
        }
        wil.a(TAG, "loadDeviceId: success");
        return bArrCopyOf;
    }

    @Override // com.heytap.accessory.security.deviceId.IDeviceIdFetcher
    public byte[] loadDeviceId(Context context) {
        if (a != null) {
            wil.a(TAG, "get deviceid from memory " + HexUtils.byteArrayToHexStr(a));
            return a;
        }
        String strE = v9g.w().E("sp_key_duid", "");
        if (!TextUtils.isEmpty(strE)) {
            a = HexUtils.hexStrToByteArray(strE);
            wil.a(TAG, "get deviceid from sp " + HexUtils.byteArrayToHexStr(a));
            return a;
        }
        String strE2 = ilj.e();
        if (TextUtils.isEmpty(strE2)) {
            a = a();
        } else {
            a = Arrays.copyOfRange(strE2.getBytes(StandardCharsets.UTF_8), 0, 6);
        }
        v9g.w().U("sp_key_duid", HexUtils.byteArrayToHexStr(a));
        wil.a(TAG, "get deviceid random " + HexUtils.byteArrayToHexStr(a));
        return a;
    }
}
