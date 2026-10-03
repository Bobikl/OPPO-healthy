package com.client.platform.opensdk.pay.download.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.client.platform.opensdk.pay.Constants;
import com.client.platform.opensdk.pay.Utils;
import com.oplus.aiunit.vision.en;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MarketDownloadHelper {
    public static final String EXTRA_KEY_PRODUCTDETAIL_START_WITH_DOWNLOAD = "extra.key.productdetail_start_with_download";
    public static final String LAUNCH_EXTAR_GO_BACK_TO_LAUNCHER_APP = "go_back_to_launcher_app";
    public static final int PRODUCT_INTENT_FROM_OUT_DETAIL_SEARCH = 1606;
    public static final String URL_MARKET = "b3Bwb21hcmtldDovL2RldGFpbHM/cGFja2FnZW5hbWU9";

    public static void jumpMarketItemDetail(Context context, String str, boolean z) {
        try {
            Uri uri = Uri.parse(Utils.getDecodeString(URL_MARKET) + str);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            intent.putExtra("out_intent_from", PRODUCT_INTENT_FROM_OUT_DETAIL_SEARCH);
            intent.addFlags(276824064);
            intent.putExtra(EXTRA_KEY_PRODUCTDETAIL_START_WITH_DOWNLOAD, z);
            intent.putExtra(LAUNCH_EXTAR_GO_BACK_TO_LAUNCHER_APP, true);
            List<ResolveInfo> listD = en.d(context.getPackageManager(), intent, 32);
            if (listD == null || listD.size() <= 0) {
                return;
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean jumpMarketItemDetail(Context context, String str) {
        char c2;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str + "&caller=" + context.getPackageName()));
        PackageManager packageManager = context.getPackageManager();
        try {
            try {
                packageManager.getApplicationInfo(Constants.MARKET_PKG_NAME_OLD, 0);
                c2 = 1;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager.getApplicationInfo(Constants.MARKET_PKG_NAME_NEW, 0);
            c2 = 2;
        }
        if (2 == c2) {
            intent.setPackage(Constants.MARKET_PKG_NAME_NEW);
        } else if (1 == c2) {
            intent.setPackage(Constants.MARKET_PKG_NAME_OLD);
        }
        try {
            context.startActivity(intent);
            return c2 == 1 || c2 == 2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
