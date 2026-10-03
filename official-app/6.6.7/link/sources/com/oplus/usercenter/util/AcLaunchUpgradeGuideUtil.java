package com.oplus.usercenter.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import com.oplus.usercenter.ui.AcUpgradeGuideActivity;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class AcLaunchUpgradeGuideUtil {
    private static final String TAG = "AcCheckUpgradeUtil";

    public static boolean intentToUpgradeGuideActivity(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            Intent intent = new Intent();
            intent.setClass(context, AcUpgradeGuideActivity.class);
            intent.putExtra(AcUpgradeGuideActivity.DATA_MAIN_TITLE, str);
            intent.putExtra(AcUpgradeGuideActivity.DATA_SUB_TITLE, str2);
            intent.putExtra(AcUpgradeGuideActivity.DATA_UPGRADE_CONTENT, str3);
            intent.putExtra(AcUpgradeGuideActivity.DATA_BUTTON_CONTENT, str4);
            intent.putExtra(AcUpgradeGuideActivity.DATA_BUTTON_JUMP_LINK, str5);
            intent.putExtra(AcUpgradeGuideActivity.DATA_BUTTON_OVERSEA_JUMP_LINK, str6);
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            Log.d(TAG, "intentToUpgradeGuideActivity error  = " + e);
            return false;
        }
    }
}
