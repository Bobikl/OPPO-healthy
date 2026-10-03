package com.heytap.log.kit;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.log.core.DataCallback;
import com.heytap.log.kit.client.QueryProviderModule$Client;
import com.heytap.log.kit.client.QueryProviderModule$Interface;
import com.heytap.log.kit.client.WriteProviderModule$Client;
import com.heytap.log.kit.client.WriteProviderModule$Interface;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.ProviderChecker;
import com.heytap.mspsdk.MspSdk;
import com.heytap.mspsdk.constants.Constants;
import com.heytap.mspsdk.core.crash.e;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.log.MspLog;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class KitSdk {
    private static final String TAG = "KitSdk";

    public static boolean activeNotifyLogFileReady(Context context, String str) {
        MspLog.d(TAG, "activeNotifyLogFileReady:");
        String string = "";
        WriteProviderModule$Interface writeServiceModuleProxy = getWriteServiceModuleProxy(context);
        int i = -1;
        try {
            new Bundle().putString(Constant.DATA_KEY.KEY_DATA_JSON, str);
            Bundle bundleActiveNotifyLogFileReady = writeServiceModuleProxy.activeNotifyLogFileReady(new Bundle());
            i = bundleActiveNotifyLogFileReady.getInt(Constant.DATA_KEY.KEY_CODE);
            string = bundleActiveNotifyLogFileReady.getString(Constant.DATA_KEY.KEY_MSG);
        } catch (MspSdkException e2) {
            MspLog.e(TAG, "activeNotifyLogFileReady MspSdkException", e2);
        } catch (BridgeDispatchException e3) {
            MspLog.e(TAG, "activeNotifyLogFileReady BridgeDispatchException", e3);
        } catch (BridgeExecuteException e4) {
            MspLog.e(TAG, "activeNotifyLogFileReady BridgeExecuteException", e4);
        } catch (Throwable th) {
            MspLog.e(TAG, "activeNotifyLogFileReady Throwable", th);
        }
        if (i != 0) {
            MspLog.e(TAG, "activeNotifyLogFileReady fail, code:" + i + ", msg:" + string);
        }
        return i == 0;
    }

    public static boolean activeReportTask(Context context, String str) {
        MspLog.d(TAG, "activeReportTask:");
        String string = "";
        WriteProviderModule$Interface writeServiceModuleProxy = getWriteServiceModuleProxy(context);
        int i = -1;
        try {
            Bundle bundle = new Bundle();
            bundle.putString(Constant.DATA_KEY.KEY_DATA_JSON, str);
            Bundle bundleActiveReportTask = writeServiceModuleProxy.activeReportTask(bundle);
            i = bundleActiveReportTask.getInt(Constant.DATA_KEY.KEY_CODE);
            string = bundleActiveReportTask.getString(Constant.DATA_KEY.KEY_MSG);
        } catch (MspSdkException e2) {
            MspLog.e(TAG, "activeReportTask MspSdkException", e2);
        } catch (BridgeDispatchException e3) {
            MspLog.e(TAG, "activeReportTask BridgeDispatchException", e3);
        } catch (BridgeExecuteException e4) {
            MspLog.e(TAG, "activeReportTask BridgeExecuteException", e4);
        } catch (Throwable th) {
            MspLog.e(TAG, "activeReportTask Throwable", th);
        }
        if (i != 0) {
            MspLog.e(TAG, "activeReportTask fail, code:" + i + ", msg:" + string);
        }
        return i == 0;
    }

    public static boolean activeSalvageTask(Context context, String str) {
        MspLog.d(TAG, "activeSalvageTask:");
        String string = "";
        WriteProviderModule$Interface writeServiceModuleProxy = getWriteServiceModuleProxy(context);
        int i = -1;
        try {
            Bundle bundle = new Bundle();
            bundle.putString(Constant.DATA_KEY.KEY_DATA_JSON, str);
            Bundle bundleActiveSalvageTask = writeServiceModuleProxy.activeSalvageTask(bundle);
            i = bundleActiveSalvageTask.getInt(Constant.DATA_KEY.KEY_CODE);
            string = bundleActiveSalvageTask.getString(Constant.DATA_KEY.KEY_MSG);
        } catch (MspSdkException e2) {
            MspLog.e(TAG, "activeSalvageTask MspSdkException", e2);
        } catch (BridgeDispatchException e3) {
            MspLog.e(TAG, "activeSalvageTask BridgeDispatchException", e3);
        } catch (BridgeExecuteException e4) {
            MspLog.e(TAG, "activeSalvageTask BridgeExecuteException", e4);
        } catch (Throwable th) {
            MspLog.e(TAG, "activeSalvageTask Throwable", th);
        }
        if (i != 0) {
            MspLog.e(TAG, "activeSalvageTask fail, code:" + i + ", msg:" + string);
        }
        return i == 0;
    }

    public static void changeSdkModeWithMspCrash(Context context, final DataCallback<Boolean> dataCallback) {
        e eVar = new e() { // from class: com.heytap.log.kit.KitSdk.1
            @Override // com.heytap.mspsdk.core.crash.e
            public void onMspProcessCrash(int i, int i2, String str, int i3, String str2) {
                dataCallback.onData(Boolean.FALSE);
            }

            @Override // com.heytap.mspsdk.core.crash.e
            public void onMspProcessRecover(String str, int i, String str2) {
                dataCallback.onData(Boolean.TRUE);
            }
        };
        MspSdk.addMspProcessCrashListener(context, "com.heytap.htms:kit_hlog", eVar);
        MspSdk.addMspProcessCrashListener(context, "com.heytap.htms", eVar);
    }

    private static Bundle commonBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.BUNDLE_KEY_APP_MIN_VERSIONCODE, 10000);
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME, Constant.KIT_NAME);
        return bundle;
    }

    public static int getKitVersionCode(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo("com.heytap.htms", 128).metaData;
            if (bundle != null) {
                return bundle.getInt("kit_hlog_vercode");
            }
            return -1;
        } catch (Throwable th) {
            MspLog.e(TAG, th);
            return -1;
        }
    }

    private static QueryProviderModule$Interface getQueryServiceModuleProxy(Context context) throws MspSdkException {
        return (QueryProviderModule$Interface) MspSdk.apiProxy(new QueryProviderModule$Client(context, commonBundle()));
    }

    private static WriteProviderModule$Interface getWriteServiceModuleProxy(Context context) throws MspSdkException {
        return (WriteProviderModule$Interface) MspSdk.apiProxy(new WriteProviderModule$Client(context, commonBundle()));
    }

    public static void init(Context context) {
        MspSdk.init(context);
        KitHelper.init(context);
    }

    public static boolean isSupportHLogKit(Context context) {
        try {
            return !TextUtils.isEmpty(new QueryProviderModule$Client(context, null).getAuthority()) && ProviderChecker.checkProvider(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean mspCanSupportService(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo("com.heytap.htms", 128).metaData;
            if (bundle != null) {
                return bundle.getBoolean("hlogkit_service_channel_support");
            }
            return false;
        } catch (Throwable th) {
            MspLog.e(TAG, th);
            return false;
        }
    }

    public static void queryConfig(Context context, String str) {
        String str2 = TAG;
        MspLog.d(str2, "queryConfig:");
        if (context == null) {
            MspLog.e(str2, "queryConfig context is empty");
            return;
        }
        if (mspCanSupportService(context)) {
            new KitProxy().queryConfig(context, str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MspLog.e(str2, "queryConfig business is empty");
            return;
        }
        QueryProviderModule$Interface queryServiceModuleProxy = getQueryServiceModuleProxy(context);
        try {
            Bundle bundle = new Bundle();
            bundle.putString(Constant.DATA_KEY.KEY_BUSINESS, str);
            bundle.putLong(Constant.DATA_KEY.KEY_HLOG_SDK_VER, AppUtil.getSDKVersionCode());
            bundle.putString(Constant.DATA_KEY.KEY_GRANT_TARGET_PKG, context.getPackageName());
            Bundle bundleQueryConfig = queryServiceModuleProxy.queryConfig(bundle);
            int i = bundleQueryConfig.getInt(Constant.DATA_KEY.KEY_CODE);
            if (i == 0) {
                KitHelper.synKitStrategyConfig(bundleQueryConfig.getString(Constant.DATA_KEY.KEY_DATA_JSON));
                return;
            }
            MspLog.e(str2, "queryConfig fail, code:" + i + ", msg:" + bundleQueryConfig.getString(Constant.DATA_KEY.KEY_MSG));
        } catch (MspSdkException e2) {
            MspLog.e(TAG, "queryConfig MspSdkException", e2);
        } catch (BridgeDispatchException e3) {
            MspLog.e(TAG, "queryConfig BridgeDispatchException", e3);
        } catch (BridgeExecuteException e4) {
            MspLog.e(TAG, "queryConfig BridgeExecuteException", e4);
        }
    }

    public static void raiseUploadTask(Context context, String str, String str2) {
        String str3 = TAG;
        MspLog.d(str3, "raiseUploadTask:");
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            MspLog.e(str3, "raiseUploadTask traceId is empty");
            return;
        }
        if (mspCanSupportService(context)) {
            new KitProxy().raiseUploadTask(context, str, str2);
            return;
        }
        QueryProviderModule$Interface queryServiceModuleProxy = getQueryServiceModuleProxy(context);
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constant.DATA_KEY.KEY_TRACEID, str2);
            jSONObject.put(Constant.DATA_KEY.KEY_BUSINESS, str);
            MspLog.d(str3, "raiseUploadTask jsonObject : " + jSONObject.toString());
            bundle.putString(Constant.DATA_KEY.KEY_DATA_JSON, jSONObject.toString());
            Bundle bundleRaiseUploadTask = queryServiceModuleProxy.raiseUploadTask(new Bundle());
            int i = bundleRaiseUploadTask.getInt(Constant.DATA_KEY.KEY_CODE);
            if (i != 0) {
                MspLog.e(str3, "queryConfig fail, code:" + i + ", msg:" + bundleRaiseUploadTask.getString(Constant.DATA_KEY.KEY_MSG));
            }
        } catch (MspSdkException e2) {
            MspLog.e(TAG, "queryConfig MspSdkException", e2);
        } catch (BridgeDispatchException e3) {
            MspLog.e(TAG, "queryConfig BridgeDispatchException", e3);
        } catch (BridgeExecuteException e4) {
            MspLog.e(TAG, "queryConfig BridgeExecuteException", e4);
        } catch (Throwable unused) {
        }
    }

    public static void syncSalvageTask(Context context, String str) {
        String str2 = TAG;
        MspLog.d(str2, "syncSalvageTask:");
        if (context == null) {
            MspLog.e(str2, "queryConfig context is empty");
            return;
        }
        if (mspCanSupportService(context)) {
            new KitProxy().syncSalvageTask(context, str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MspLog.e(str2, "queryConfig business is empty");
            return;
        }
        QueryProviderModule$Interface queryServiceModuleProxy = getQueryServiceModuleProxy(context);
        try {
            Bundle bundle = new Bundle();
            bundle.putString(Constant.DATA_KEY.KEY_GRANT_TARGET_PKG, context.getPackageName());
            bundle.putString(Constant.DATA_KEY.KEY_BUSINESS, str);
            bundle.putLong(Constant.DATA_KEY.KEY_HLOG_SDK_VER, AppUtil.getSDKVersionCode());
            Bundle bundleSyncSalvageTask = queryServiceModuleProxy.syncSalvageTask(bundle);
            int i = bundleSyncSalvageTask.getInt(Constant.DATA_KEY.KEY_CODE);
            if (i == 0) {
                KitHelper.synKitTaskConfigs(bundleSyncSalvageTask.getString(Constant.DATA_KEY.KEY_DATA_JSON));
                return;
            }
            MspLog.e(str2, "syncSalvageTask fail, code:" + i + ", msg:" + bundleSyncSalvageTask.getString(Constant.DATA_KEY.KEY_MSG));
        } catch (MspSdkException e2) {
            MspLog.e(TAG, "syncSalvageTask MspSdkException", e2);
        } catch (BridgeDispatchException e3) {
            MspLog.e(TAG, "syncSalvageTask BridgeDispatchException", e3);
        } catch (BridgeExecuteException e4) {
            MspLog.e(TAG, "syncSalvageTask BridgeExecuteException", e4);
        } catch (Throwable th) {
            MspLog.e(TAG, "syncSalvageTask Throwable", th);
        }
    }
}
