package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class id {
    public static void a(Context context) {
        try {
            db.b(context, c() + "_" + AcBaseConstants.b.SETTINGS_TOKEN_HASH_MOCK_FILE);
            db.b(context, c() + "_" + AcBaseConstants.b.SETTINGS_INFO_HASH_MOCK_FILE);
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenCoreShareUtil", "delectCache error: " + e2.getMessage());
        }
    }

    public static String b(String str) {
        String str2 = c() + "_";
        if (AcBaseConstants.b.SETTINGS_INFO_HASH_VALUE.equals(str)) {
            return str2 + AcBaseConstants.b.SETTINGS_INFO_HASH_MOCK_FILE;
        }
        return str2 + AcBaseConstants.b.SETTINGS_TOKEN_HASH_MOCK_FILE;
    }

    public static String c() {
        return AcBaseConstants.a.OPEN_SDK_TYPE_VALUE.toLowerCase();
    }

    public static void d(Context context, String str, String str2) {
        String strB = b(str2);
        try {
            db.j(context, strB, str2, str);
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenCoreShareUtil", "write " + strB + " error: " + e2.getMessage());
        }
    }
}
