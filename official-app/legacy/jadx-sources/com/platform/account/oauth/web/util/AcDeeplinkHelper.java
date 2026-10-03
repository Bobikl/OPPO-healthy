package com.platform.account.oauth.web.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcDeeplinkHelper {
    private static final String ACCOUNT_SCHEME = "account://platform.usercenter.com/";
    private static final String AC_BROWSER = "acBrowser";
    private static final String BROWSER = "browser";
    public static final String KEY_WEB_URL = "url";
    private static final String UC_SCHEME = "uc://platform.usercenter.com/";

    public static boolean checkIsAccountDeeplink(String str) {
        return str.startsWith(ACCOUNT_SCHEME) || str.startsWith(UC_SCHEME);
    }

    public static void jump(Context context, String str) {
        Uri uri = Uri.parse(str);
        String path = uri.getPath();
        if (path == null) {
            return;
        }
        if (path.contains("browser") || path.contains(AC_BROWSER)) {
            jumpToBrowser(context, uri);
        }
    }

    private static void jumpToBrowser(Context context, Uri uri) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri.getQueryParameter("url"))));
    }
}
