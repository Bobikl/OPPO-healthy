package com.heytap.accessory.security.deviceId;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.misc.utils.f;
import com.heytap.accessory.utils.HexUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class b extends a implements IDeviceIdFetcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2669c = "b";

    @Override // com.heytap.accessory.security.deviceId.IDeviceIdFetcher
    public byte[] loadDeviceId(Context context) {
        if (a.b != null) {
            com.heytap.accessory.base.logging.a.a(f2669c, "get deviceid from memory " + HexUtils.byteArrayToHexStr(a.b));
            return a.b;
        }
        SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(com.heytap.accessory.pair.utils.PlatformUtils.SECURITY_PREFS, 0);
        String string = sharedPreferences.getString("sp_key_duid", "");
        if (!TextUtils.isEmpty(string)) {
            a.b = HexUtils.hexStrToByteArray(string);
            com.heytap.accessory.base.logging.a.a(f2669c, "get deviceid from sp " + HexUtils.byteArrayToHexStr(a.b));
            return a.b;
        }
        String strB = f.b();
        if (TextUtils.isEmpty(strB)) {
            strB = UUID.randomUUID().toString();
        }
        a.b = Arrays.copyOfRange(strB.getBytes(StandardCharsets.UTF_8), 0, 6);
        sharedPreferences.edit().putString("sp_key_duid", HexUtils.byteArrayToHexStr(a.b)).apply();
        com.heytap.accessory.base.logging.a.a(f2669c, "get deviceid random " + HexUtils.byteArrayToHexStr(a.b));
        return a.b;
    }
}
