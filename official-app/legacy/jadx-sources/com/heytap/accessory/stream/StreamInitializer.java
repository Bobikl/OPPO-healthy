package com.heytap.accessory.stream;

import android.content.Context;
import android.content.pm.PackageManager;
import com.heytap.accessory.Config;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: classes14.dex */
public class StreamInitializer {
    public static final String STREAM_TRANSFER_SERVICE_INTENT = "com.heytap.accessory.IStreamAction";
    public static final String TAG = "StreamInitializer";
    private static boolean sInitialized;

    private StreamInitializer() {
    }

    public static String getStreamMsgPackageName(Context context) {
        return Initializer.useOAFApp(context) ? "com.heytap.accessory" : context.getPackageName();
    }

    public static void initialize(Context context) throws SdkUnsupportedException {
        if (context == null) {
            throw new IllegalArgumentException("Illegal argument input: context");
        }
        if (sInitialized) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!Initializer.useOAFApp(context)) {
                SdkLog.w(TAG, "is not AppMode,ignore");
            } else if (packageManager.getPackageInfo("com.heytap.accessory", 0) == null) {
                throw new SdkUnsupportedException("Device not supported", 1);
            }
            String streamMsgPackageName = getStreamMsgPackageName(context);
            if (streamMsgPackageName == null) {
                throw new SdkUnsupportedException("Accessory Framework not installed", 2);
            }
            if (packageManager.getPackageInfo(streamMsgPackageName, 0) == null) {
                throw new SdkUnsupportedException("Accessory Framework not installed", 2);
            }
            SdkLog.d(TAG, "Accessory Stream Transfer SDK version: " + Config.getSdkVersionName());
            sInitialized = true;
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.e(TAG, "Accessory Framework not installed");
            throw new SdkUnsupportedException("Accessory Framework not installed", 2);
        }
    }
}
