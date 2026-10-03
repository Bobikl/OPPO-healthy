package com.oplus.omes.srp.sysintegrity;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class SafetyCheck {
    public static SrpClient getClient(Context context) {
        return SrpClient.getInstance(context);
    }

    public static void init(Context context) {
        try {
            getClient(context).init();
        } catch (Exception e2) {
            LogUtil.e(SrpException.ERROR_INIT_ERR, e2.getMessage());
        }
    }
}
