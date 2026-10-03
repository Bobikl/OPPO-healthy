package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.wearable.watch.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final class fvj {
    public static void a(Context context) {
        b(context, null);
    }

    public static void b(Context context, String str) {
        if (context == null || "AUTHENCATION_ERROR_CANCLE".equalsIgnoreCase(str)) {
            return;
        }
        if (TextUtils.equals(str, "-1004")) {
            y0k.h(context.getString(R$string.srttings_find_watch_token_invalid));
            return;
        }
        if (!rpc.c()) {
            y0k.h(context.getString(com.heytap.health.base.R$string.lib_base_network_error_common));
            return;
        }
        int iY = qo5.a(gl4.managerApi.getCurrentConnectId()).Y(true);
        if (iY != -1) {
            y0k.h(context.getString(iY));
        } else {
            y0k.h(context.getString(com.heytap.health.base.R$string.lib_base_network_error_common));
        }
    }
}
