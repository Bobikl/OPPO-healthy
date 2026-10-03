package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class hl {
    public static void a(Context context) {
        String strC = c(AcBaseConstants.b.SETTINGS_INFO_HASH_MOCK_FILE);
        bb.a(context, strC);
        AcLogUtil.i("AcVirtualSettingsHelper", "clearInfoHashMockCache: " + strC);
    }

    public static void b(Context context) {
        String strC = c(AcBaseConstants.b.SETTINGS_TOKEN_HASH_MOCK_FILE);
        bb.a(context, strC);
        AcLogUtil.i("AcVirtualSettingsHelper", "clearTokenLoginMockCache: " + strC);
    }

    public static String c(String str) {
        return AcBaseConstants.a.OPEN_SDK_TYPE_VALUE.toLowerCase() + "_" + str;
    }

    public static String d(Context context) {
        String strC = c(AcBaseConstants.b.SETTINGS_INFO_HASH_MOCK_FILE);
        String strE = bb.e(context, strC, AcBaseConstants.b.SETTINGS_INFO_HASH_VALUE);
        AcLogUtil.i("AcVirtualSettingsHelper", "loadInfoHashMockCache file " + strC + " valueStr: " + strE);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return strE;
    }

    public static int e(Context context) {
        return ((Integer) jf.B().j(context, c(AcBaseConstants.b.SETTINGS_TOKEN_HASH_MOCK_FILE), AcBaseConstants.b.SETTINGS_LOGIN_STATE_VALUE, Integer.class)).intValue();
    }

    public static String f(Context context) {
        return jf.B().i(context, c(AcBaseConstants.b.SETTINGS_TOKEN_HASH_MOCK_FILE), AcBaseConstants.b.SETTINGS_TOKEN_HASH_VALUE);
    }
}
