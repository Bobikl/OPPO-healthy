package com.heytap.log.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.msp.sdk.base.common.BrandConstant;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class BrandUtil {
    private static final String TAG = "HLog_BrandUtil";

    public static boolean isOwnBrand() {
        try {
            String strMd5Digest = MD5Util.md5Digest(Build.BRAND.toUpperCase());
            return TextUtils.equals(BrandConstant.OWN_BRAND, strMd5Digest) || TextUtils.equals(BrandConstant.RM_BRAND, strMd5Digest) || TextUtils.equals(BrandConstant.OP_BRAND, strMd5Digest);
        } catch (IOException e2) {
            Log.e(TAG, "isOwnBrand", e2);
            return false;
        }
    }
}
