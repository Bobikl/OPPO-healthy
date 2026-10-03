package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a3l {
    @NotNull
    public static String a(@NotNull String str, int i) {
        if (!d(str)) {
            return str;
        }
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            return str;
        }
        return str + "_" + strC + "_" + i;
    }

    @Nullable
    public static File b(@NotNull File file, @NotNull String str, int i) {
        if (i <= 0) {
            return null;
        }
        File file2 = new File(file, a(str, i));
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    @Nullable
    public static String c() {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ == null) {
            return null;
        }
        return userDeviceInfoJ.getModel();
    }

    public static boolean d(@NotNull String str) {
        return "voice_default".equals(str);
    }
}
