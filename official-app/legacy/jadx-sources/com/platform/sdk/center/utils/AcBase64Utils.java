package com.platform.sdk.center.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcBase64Utils {
    private static final String TAG = "Base64Helper";

    public static String base64Encode(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(Base64.encode(str.getBytes(), 0), "UTF-8");
        } catch (Exception e2) {
            UCLogUtil.e(TAG, "" + e2);
            return "";
        }
    }
}
