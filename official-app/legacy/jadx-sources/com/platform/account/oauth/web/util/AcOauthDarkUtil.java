package com.platform.account.oauth.web.util;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthDarkUtil {
    public static boolean isNightMode(Context context) {
        return 32 == (context.getResources().getConfiguration().uiMode & 48);
    }
}
