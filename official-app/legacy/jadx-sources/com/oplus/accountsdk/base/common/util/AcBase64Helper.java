package com.oplus.accountsdk.base.common.util;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Keep;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcBase64Helper {
    private static final String TAG = "Base64Helper";

    public static String base64Decode(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "" + e2);
            return "";
        }
    }

    public static String base64Encode(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : new String(Base64.encode(str.getBytes(), 0), "UTF-8");
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "" + e2);
            return "";
        }
    }
}
