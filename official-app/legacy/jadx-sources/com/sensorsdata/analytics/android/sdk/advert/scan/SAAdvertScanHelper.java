package com.sensorsdata.analytics.android.sdk.advert.scan;

import android.app.Activity;
import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public class SAAdvertScanHelper {
    public static boolean scanHandler(Activity activity, Uri uri) {
        IAdvertScanListener whiteListScanHelper;
        String host = uri.getHost();
        if ("channeldebug".equals(host)) {
            whiteListScanHelper = new ChannelDebugScanHelper();
        } else {
            whiteListScanHelper = "adsScanDeviceInfo".equals(host) ? new WhiteListScanHelper() : null;
        }
        if (whiteListScanHelper == null) {
            return false;
        }
        whiteListScanHelper.handlerScanUri(activity, uri);
        return true;
    }
}
