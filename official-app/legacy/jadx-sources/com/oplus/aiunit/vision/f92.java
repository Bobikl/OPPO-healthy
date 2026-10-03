package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes19.dex */
@RequiresApi(api = 21)
public class f92 {
    public static final int INSTALL_CODE_ERROR_IO_EXCEPTION = -6;
    public static final int INSTALL_CODE_ERROR_MD5 = -1;
    public static final int INSTALL_CODE_ERROR_SESSION_NULL = -4;
    public static final int INSTALL_CODE_ERROR_SESSION_OUT_OF_ID = -5;
    public static final int INSTALL_CODE_ERROR_UPGRADE_INFO_MISSING = -7;
    public static final int INSTALL_CODE_PENDING_USER_ACTION = -2;
    public static final int INSTALL_CODE_SUCCESS = 0;
    public static final int INSTALL_CODE_UNKNOWN = -3;

    public static String a(Context context) {
        return context.getPackageName() + ".upgrade.permission.INSTALL_COMMIT";
    }
}
