package com.heytap.accessory.file;

import android.content.Context;
import android.content.pm.PackageManager;
import com.heytap.accessory.Config;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: classes14.dex */
public class FTInitializer {
    public static final String FILE_TRANSFER_SERVICE_INTENT = "com.heytap.accessory.IAfFtManager";
    private static final String TAG = "FTInitializer";
    private static boolean sInitialized;

    private FTInitializer() {
    }

    public static String getFileTransferPackageName(Context context) {
        return Initializer.useOAFApp(context) ? "com.heytap.accessory" : context.getPackageName();
    }

    public static void init(Context context) throws SdkUnsupportedException {
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
            String fileTransferPackageName = getFileTransferPackageName(context);
            if (fileTransferPackageName == null) {
                throw new SdkUnsupportedException("Oppo Accessory Framework not installed", 2);
            }
            if (packageManager.getPackageInfo(fileTransferPackageName, 0) == null) {
                throw new SdkUnsupportedException("Oppo Accessory Framework not installed", 2);
            }
            SdkLog.d(TAG, "Oppo Accessory File Transfer SDK version: " + Config.getSdkVersionName());
            sInitialized = true;
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.e(TAG, "Oppo Accessory Framework not installed");
            throw new SdkUnsupportedException("Oppo Accessory Framework not installed", 2);
        }
    }
}
