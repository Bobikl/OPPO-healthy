package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class m7 {
    public static String a = "AcAppUtil";

    public static Bundle a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            AcLogUtil.e(a, "getMetaInfo error: pkgName is null");
            return null;
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (Throwable th) {
            AcLogUtil.e(a, "getMetaInfo error: " + th.getMessage());
            return null;
        }
    }

    public static String b() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
