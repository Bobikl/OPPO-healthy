package com.oplus.backup.sdk.host;

import android.content.Context;
import com.oplus.backup.sdk.common.plugin.BRPluginConfig;
import com.oplus.backup.sdk.common.plugin.BRPluginConfigParser;
import com.oplus.backup.sdk.common.utils.BRLog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class BRPluginSource {
    private static final String ASSETS_PLUGINS_PATH = "br_plugins";
    public static final String BR_BASE_DIR = "br_cache";
    public static final String LOCAL_PLUGINS_DIR = "local_plugins";
    private static final String TAG = "BRPluginSource";
    private static BRPluginConfig[] sBRPluginConfigs;

    public static BRPluginConfig[] getLocalBRPlugins(Context context, String str) throws Throwable {
        String[] list;
        String[] list2;
        Throwable th;
        InputStream inputStreamOpen;
        IOException iOException;
        StringBuilder sb;
        BRPluginConfig[] bRPluginConfigArr = sBRPluginConfigs;
        if (bRPluginConfigArr != null) {
            return bRPluginConfigArr;
        }
        initBaseFolder(context);
        BRPluginConfig[] bRPluginConfigArr2 = new BRPluginConfig[0];
        ArrayList arrayList = new ArrayList();
        InputStream inputStream = null;
        try {
            list = context.getAssets().list(ASSETS_PLUGINS_PATH);
        } catch (IOException e2) {
            BRLog.e(TAG, "getLocalBRPlugins, e =" + e2.getMessage());
            list = null;
        }
        if (list == null) {
            return bRPluginConfigArr2;
        }
        int length = list.length;
        for (int i = 0; i < length; i++) {
            BRLog.d(TAG, list[i]);
            try {
                list2 = context.getAssets().list("br_plugins/" + list[i]);
            } catch (IOException e3) {
                BRLog.e(TAG, "getLocalBRPlugins, e =" + e3.getMessage());
                list2 = null;
            }
            if (list2 == null) {
                return bRPluginConfigArr2;
            }
            int length2 = list2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (list2[i2].endsWith(".config")) {
                    BRLog.d(TAG, list2[i2]);
                    try {
                        inputStreamOpen = context.getAssets().open("br_plugins/" + list[i] + "/" + list2[i2]);
                        try {
                            try {
                                BRPluginConfig bRPluginConfig = BRPluginConfigParser.parse(inputStreamOpen);
                                if (bRPluginConfig != null) {
                                    arrayList.add(bRPluginConfig);
                                    BRLog.d(TAG, "add success");
                                } else {
                                    BRLog.w(TAG, "BRPluginConfigParser.parse(inputStream) failed:");
                                }
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (IOException e4) {
                                        iOException = e4;
                                        sb = new StringBuilder();
                                        sb.append("getLocalBRPlugins, e =");
                                        sb.append(iOException.getMessage());
                                        BRLog.e(TAG, sb.toString());
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStreamOpen;
                                if (inputStream == null) {
                                    throw th;
                                }
                                try {
                                    inputStream.close();
                                    throw th;
                                } catch (IOException e5) {
                                    BRLog.e(TAG, "getLocalBRPlugins, e =" + e5.getMessage());
                                    throw th;
                                }
                            }
                        } catch (IOException e6) {
                            e = e6;
                            BRLog.e(TAG, "getLocalBRPlugins, e =" + e.getMessage());
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e7) {
                                    iOException = e7;
                                    sb = new StringBuilder();
                                    sb.append("getLocalBRPlugins, e =");
                                    sb.append(iOException.getMessage());
                                    BRLog.e(TAG, sb.toString());
                                }
                            }
                        }
                    } catch (IOException e8) {
                        e = e8;
                        inputStreamOpen = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        BRPluginConfig[] bRPluginConfigArr3 = (BRPluginConfig[]) arrayList.toArray(new BRPluginConfig[arrayList.size()]);
        sBRPluginConfigs = bRPluginConfigArr3;
        return bRPluginConfigArr3;
    }

    public static File initBaseFolder(Context context) {
        return context.getDir(BR_BASE_DIR, 0);
    }

    public static BRPluginConfig[] getLocalBRPlugins(Context context) {
        return getLocalBRPlugins(context, LOCAL_PLUGINS_DIR);
    }
}
