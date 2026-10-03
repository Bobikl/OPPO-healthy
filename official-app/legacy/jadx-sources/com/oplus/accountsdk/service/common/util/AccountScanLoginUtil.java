package com.oplus.accountsdk.service.common.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.l7;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountScanLoginUtil {
    private static final int ILLEGAL_PARAMETER = 1001;
    private static final int JUMP_WEB_LOGIN_PAGE_FAIL = 1002;
    private static final int JUMP_WEB_LOGIN_PAGE_SUCCESS = 1000;
    private static final String NATIVE_TYPE_KEY = "nativeType";
    private static final String NATIVE_TYPE_VALUE = "account://platform.usercenter.com/accountScanLogin";
    private static final String TAG = "AccountScanLoginUtil";
    private static final String WEB_LOADING_DEEPLINK = "account://platform.usercenter.com/acWebview?url=";

    private static boolean checkMatchParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.getQueryParameterNames().contains(NATIVE_TYPE_KEY)) {
            return NATIVE_TYPE_VALUE.equals(uri.getQueryParameter(NATIVE_TYPE_KEY));
        }
        return false;
    }

    public static boolean isAccountScan(String str) {
        return isValidUrl(str) && checkMatchParam(str);
    }

    private static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static int openScanLoginPage(Context context, String str) {
        if (context == null || !isAccountScan(str)) {
            return 1001;
        }
        try {
            String strA = l7.a(context);
            if (TextUtils.isEmpty(strA)) {
                return 1001;
            }
            Intent intent = new Intent();
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            intent.setPackage(strA);
            intent.setData(Uri.parse(WEB_LOADING_DEEPLINK + str));
            context.startActivity(intent);
            return 1000;
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "jumpWebLoginPage Exception " + e2.getMessage());
            return 1002;
        }
    }
}
