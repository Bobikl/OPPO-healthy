package com.platform.usercenter.account.mba.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class MbaIntentUtil {
    private static final String TAG = "MbaIntentUtil";

    public static void openInstalledApp(Context context, Intent intent, @Nullable String str) throws ActivityNotFoundException {
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static boolean openIntent(Context context, Intent intent, @Nullable String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            if (intent.resolveActivity(BaseApp.mContext.getPackageManager()) == null) {
                return true;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            UCLogUtil.e("openIntent", e2.getLocalizedMessage());
            return false;
        }
    }
}
