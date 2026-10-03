package com.platform.usercenter.tools.device;

import android.content.Context;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class ClientIdUtils {
    private static final String DEFAULT_CLIENT_ID = "000000000000000";
    private static final String TAG = "ClientIdUtils";

    private ClientIdUtils() {
    }

    @Deprecated
    public static String getClientId(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null.");
        }
        try {
            return UCDeviceInfoUtil.getDeviceId(context);
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return DEFAULT_CLIENT_ID;
        }
    }
}
