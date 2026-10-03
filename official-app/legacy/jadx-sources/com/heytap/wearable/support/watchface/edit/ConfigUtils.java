package com.heytap.wearable.support.watchface.edit;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.runtime.config.WatchFaceConfig;
import com.oplus.aiunit.vision.hc3;
import com.oplus.aiunit.vision.i25;
import com.oplus.aiunit.vision.ii0;
import com.oplus.aiunit.vision.lt9;
import com.oplus.aiunit.vision.od7;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigUtils {
    private static final String FILE_TRANSFER_WATCH_FACE = "/HeyTap/WatchFace";
    private static final String LAUNCHER_PACKAGE_NAME = "com.heytap.wearable.launcher";
    private static final String STORE_DIR_WATCH_FACE = "/WatchFace";
    private static final String TAG = "ConfigUtils";

    public static JSONObject getExtraJsonObj(WatchFaceConfig watchFaceConfig) {
        if (watchFaceConfig == null) {
            return null;
        }
        try {
            return new JSONObject(watchFaceConfig.getCurrentStyleConfig().getExtraJson());
        } catch (Exception e2) {
            i25.c(TAG, "[getExtraJsonObj] " + e2.getMessage());
            return null;
        }
    }

    public static String getFileTransferPath(String str) {
        return getFileTransferPath(str, null);
    }

    public static String getSdcardConfigPath(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                String str2 = context.createPackageContext(LAUNCHER_PACKAGE_NAME, 2).createDeviceProtectedStorageContext().getFilesDir().getAbsolutePath() + STORE_DIR_WATCH_FACE + "/" + str;
                SdkDebugLog.d(TAG, "[getSdcardConfigPath] path " + str2);
                return str2;
            } catch (Exception e2) {
                SdkDebugLog.e(TAG, "[getSdcardConfigPath] NameNotFoundException " + e2.getMessage());
            }
        }
        return null;
    }

    public static String getSdcardStyleName(String str) {
        return str + hc3.CLASSIC_CONFIG_SUFFIX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable, java.io.InputStreamReader, java.io.Reader] */
    public static WatchFaceConfig loadAssetsStyles(Context context, String str) throws Throwable {
        Closeable closeable;
        Throwable th;
        BufferedReader bufferedReader;
        IOException e2;
        if (context == 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                context = ii0.c().a(context, str);
                try {
                    str = new InputStreamReader(context);
                    try {
                        bufferedReader = new BufferedReader(str);
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            } catch (IOException e3) {
                                e2 = e3;
                                SdkDebugLog.e(TAG, "[loadAssetsStyles] --> " + e2.getMessage());
                                lt9.a(bufferedReader, TAG);
                                lt9.a(str, TAG);
                                lt9.a(context, TAG);
                                return WatchFaceConfig.getDefaultWatchFaceConfig();
                            }
                        }
                        WatchFaceConfig defaultWatchFaceConfig = (WatchFaceConfig) new Gson().fromJson(sb.toString(), WatchFaceConfig.class);
                        if (defaultWatchFaceConfig == null) {
                            defaultWatchFaceConfig = WatchFaceConfig.getDefaultWatchFaceConfig();
                        }
                        lt9.a(bufferedReader, TAG);
                        lt9.a(str, TAG);
                        lt9.a(context, TAG);
                        return defaultWatchFaceConfig;
                    } catch (IOException e4) {
                        bufferedReader = null;
                        e2 = e4;
                    } catch (Throwable th2) {
                        closeable = null;
                        th = th2;
                        lt9.a(closeable, TAG);
                        lt9.a(str, TAG);
                        lt9.a(context, TAG);
                        throw th;
                    }
                } catch (IOException e5) {
                    bufferedReader = null;
                    e2 = e5;
                    str = 0;
                } catch (Throwable th3) {
                    closeable = null;
                    th = th3;
                    str = 0;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e6) {
            str = 0;
            bufferedReader = null;
            e2 = e6;
            context = 0;
        } catch (Throwable th5) {
            str = 0;
            closeable = null;
            th = th5;
            context = 0;
        }
    }

    public static WatchFaceConfig loadSdcardStyles(Context context, String str) throws Throwable {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String strA = od7.a(getSdcardConfigPath(context, str), getSdcardStyleName(str));
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        WatchFaceConfig watchFaceConfig = (WatchFaceConfig) new Gson().fromJson(strA, WatchFaceConfig.class);
        SdkDebugLog.d(TAG, "[loadSdcardStyles] --> watchFaceConfig " + watchFaceConfig);
        return watchFaceConfig;
    }

    public static String getFileTransferPath(String str, String str2) {
        String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + FILE_TRANSFER_WATCH_FACE + "/" + str;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "/" + str2;
        }
        SdkDebugLog.d(TAG, "[getFileTransferPath] path " + str3);
        return str3;
    }
}
