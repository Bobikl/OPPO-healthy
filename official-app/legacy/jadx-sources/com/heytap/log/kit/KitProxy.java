package com.heytap.log.kit;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.ThreadUtil;
import com.heytap.msp.IMspCallback;
import com.heytap.msp.MspResponse;
import com.heytap.mspsdk.MspSdk;
import com.heytap.mspsdk.constants.Constants;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.log.MspLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class KitProxy {
    private static final String TAG = "HLog_KitProxy";

    private void assembleBundle(Bundle bundle) {
        bundle.putInt(Constants.BUNDLE_KEY_APP_MIN_VERSIONCODE, 10000);
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME, Constant.KIT_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyClient(IHLogServiceModule iHLogServiceModule) {
        MspLog.d(TAG, "destroyClient exec");
        if (iHLogServiceModule != null) {
            try {
                MspLog.d(TAG, "exec unbind");
                MspSdk.unbind(iHLogServiceModule);
            } catch (Throwable th) {
                MspLog.d(TAG, "exec unbind error: " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IHLogServiceModule getHLogKitProxy(Context context) {
        initMsp(context);
        Bundle bundle = new Bundle();
        assembleBundle(bundle);
        return (IHLogServiceModule) MspSdk.apiProxy(IHLogServiceModule.class, bundle);
    }

    private void initMsp(Context context) {
        if (context != null) {
            MspSdk.init(context);
        }
    }

    public void activeNotifyLogFileReady(Bundle bundle, IMspCallback iMspCallback) {
    }

    public void activeReportTask(Bundle bundle, IMspCallback iMspCallback) {
    }

    public void activeSalvageTask(final Context context, final String str, IMspCallback iMspCallback) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.kit.KitProxy.4
            @Override // java.lang.Runnable
            public void run() {
                final IHLogServiceModule hLogKitProxy = null;
                try {
                    try {
                        try {
                            hLogKitProxy = KitProxy.this.getHLogKitProxy(context);
                            if (hLogKitProxy == null) {
                                MspLog.e(KitProxy.TAG, "activeSalvageTask getHLogKitProxy return null");
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString(Constant.DATA_KEY.KEY_DATA_JSON, str);
                            hLogKitProxy.activeSalvageTask(bundle, new IMspCallback.Stub() { // from class: com.heytap.log.kit.KitProxy.4.1
                                @Override // com.heytap.msp.IMspCallback.Stub, android.os.IInterface
                                public IBinder asBinder() {
                                    return null;
                                }

                                @Override // com.heytap.msp.IMspCallback
                                public void callback(MspResponse mspResponse) throws RemoteException {
                                    MspLog.d(KitProxy.TAG, "activeSalvageTask callback: " + mspResponse.toString());
                                    KitProxy.this.destroyClient(hLogKitProxy);
                                    mspResponse.getData().getInt(Constant.DATA_KEY.KEY_CODE);
                                    mspResponse.getData().getString(Constant.DATA_KEY.KEY_MSG);
                                }
                            });
                        } catch (MspSdkException e2) {
                            MspLog.e(KitProxy.TAG, "activeSalvageTask MspSdkException", e2);
                        }
                    } catch (Throwable th) {
                        MspLog.e(KitProxy.TAG, "activeSalvageTask Throwable", th);
                    }
                } finally {
                    KitProxy.this.destroyClient(null);
                }
            }
        });
    }

    public void queryConfig(final Context context, final String str) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.kit.KitProxy.1
            @Override // java.lang.Runnable
            public void run() {
                final IHLogServiceModule hLogKitProxy = null;
                try {
                    try {
                        hLogKitProxy = KitProxy.this.getHLogKitProxy(context);
                        if (hLogKitProxy == null) {
                            MspLog.e(KitProxy.TAG, "queryConfig getHLogKitProxy return null");
                            KitProxy.this.destroyClient(hLogKitProxy);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(Constant.DATA_KEY.KEY_BUSINESS, str);
                        bundle.putLong(Constant.DATA_KEY.KEY_HLOG_SDK_VER, AppUtil.getSDKVersionCode());
                        bundle.putString(Constant.DATA_KEY.KEY_GRANT_TARGET_PKG, context.getPackageName());
                        hLogKitProxy.queryConfig(bundle, new IMspCallback.Stub() { // from class: com.heytap.log.kit.KitProxy.1.1
                            @Override // com.heytap.msp.IMspCallback.Stub, android.os.IInterface
                            public IBinder asBinder() {
                                return null;
                            }

                            @Override // com.heytap.msp.IMspCallback
                            public void callback(MspResponse mspResponse) throws RemoteException {
                                MspLog.d(KitProxy.TAG, "queryConfig callback: " + mspResponse.toString());
                                KitProxy.this.destroyClient(hLogKitProxy);
                                int i = mspResponse.getData().getInt(Constant.DATA_KEY.KEY_CODE);
                                if (i == 0) {
                                    String string = mspResponse.getData().getString(Constant.DATA_KEY.KEY_DATA_JSON);
                                    Log.e(KitProxy.TAG, "queryConfig callback data : " + string.toString());
                                    KitHelper.synKitStrategyConfig(string);
                                    return;
                                }
                                MspLog.e(KitProxy.TAG, "queryConfig fail, code:" + i + ", msg:" + mspResponse.getData().getString(Constant.DATA_KEY.KEY_MSG));
                            }
                        });
                        KitProxy.this.destroyClient(hLogKitProxy);
                    } catch (Throwable th) {
                        KitProxy.this.destroyClient(null);
                        throw th;
                    }
                } catch (MspSdkException e2) {
                    MspLog.e(KitProxy.TAG, "queryConfig MspSdkException", e2);
                } catch (Throwable th2) {
                    MspLog.e(KitProxy.TAG, "queryConfig Throwable", th2);
                }
            }
        });
    }

    public void queryLogDirection(Context context, String str, IMspCallback iMspCallback) {
    }

    public void raiseUploadTask(final Context context, final String str, final String str2) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.kit.KitProxy.3
            @Override // java.lang.Runnable
            public void run() {
                final IHLogServiceModule hLogKitProxy = null;
                try {
                    try {
                        try {
                            hLogKitProxy = KitProxy.this.getHLogKitProxy(context);
                            if (hLogKitProxy == null) {
                                MspLog.e(KitProxy.TAG, "raiseUploadTask getHLogKitProxy return null");
                                return;
                            }
                            Bundle bundle = new Bundle();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(Constant.DATA_KEY.KEY_TRACEID, str2);
                            jSONObject.put(Constant.DATA_KEY.KEY_BUSINESS, str);
                            MspLog.d(KitProxy.TAG, "raiseUploadTask jsonObject : " + jSONObject.toString());
                            bundle.putString(Constant.DATA_KEY.KEY_DATA_JSON, jSONObject.toString());
                            hLogKitProxy.raiseUploadTask(new Bundle(), new IMspCallback.Stub() { // from class: com.heytap.log.kit.KitProxy.3.1
                                @Override // com.heytap.msp.IMspCallback.Stub, android.os.IInterface
                                public IBinder asBinder() {
                                    return null;
                                }

                                @Override // com.heytap.msp.IMspCallback
                                public void callback(MspResponse mspResponse) throws RemoteException {
                                    MspLog.d(KitProxy.TAG, "raiseUploadTask callback: " + mspResponse.toString());
                                    KitProxy.this.destroyClient(hLogKitProxy);
                                    int i = mspResponse.getData().getInt(Constant.DATA_KEY.KEY_CODE);
                                    if (i != 0) {
                                        MspLog.e(KitProxy.TAG, "raiseUploadTask fail, code:" + i + ", msg:" + mspResponse.getData().getString(Constant.DATA_KEY.KEY_MSG));
                                    }
                                }
                            });
                        } catch (MspSdkException e2) {
                            MspLog.e(KitProxy.TAG, "raiseUploadTask MspSdkException", e2);
                        }
                    } catch (Throwable th) {
                        MspLog.e(KitProxy.TAG, "raiseUploadTask Throwable", th);
                    }
                } finally {
                    KitProxy.this.destroyClient(null);
                }
            }
        });
    }

    public void syncSalvageTask(final Context context, final String str) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.kit.KitProxy.2
            @Override // java.lang.Runnable
            public void run() {
                final IHLogServiceModule hLogKitProxy = null;
                try {
                    try {
                        hLogKitProxy = KitProxy.this.getHLogKitProxy(context);
                        if (hLogKitProxy == null) {
                            MspLog.e(KitProxy.TAG, "syncSalvageTask getHLogKitProxy return null");
                            KitProxy.this.destroyClient(hLogKitProxy);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(Constant.DATA_KEY.KEY_GRANT_TARGET_PKG, context.getPackageName());
                        bundle.putString(Constant.DATA_KEY.KEY_BUSINESS, str);
                        bundle.putLong(Constant.DATA_KEY.KEY_HLOG_SDK_VER, AppUtil.getSDKVersionCode());
                        hLogKitProxy.syncSalvageTask(bundle, new IMspCallback.Stub() { // from class: com.heytap.log.kit.KitProxy.2.1
                            @Override // com.heytap.msp.IMspCallback.Stub, android.os.IInterface
                            public IBinder asBinder() {
                                return null;
                            }

                            @Override // com.heytap.msp.IMspCallback
                            public void callback(MspResponse mspResponse) throws RemoteException {
                                MspLog.d(KitProxy.TAG, "syncSalvageTask callback: " + mspResponse.toString());
                                KitProxy.this.destroyClient(hLogKitProxy);
                                int i = mspResponse.getData().getInt(Constant.DATA_KEY.KEY_CODE);
                                if (i == 0) {
                                    KitHelper.synKitTaskConfigs(mspResponse.getData().getString(Constant.DATA_KEY.KEY_DATA_JSON));
                                    return;
                                }
                                MspLog.e(KitProxy.TAG, "syncSalvageTask fail, code:" + i + ", msg:" + mspResponse.getData().getString(Constant.DATA_KEY.KEY_MSG));
                            }
                        });
                        KitProxy.this.destroyClient(hLogKitProxy);
                    } catch (Throwable th) {
                        KitProxy.this.destroyClient(null);
                        throw th;
                    }
                } catch (MspSdkException e2) {
                    MspLog.e(KitProxy.TAG, "syncSalvageTask MspSdkException", e2);
                } catch (Throwable th2) {
                    MspLog.e(KitProxy.TAG, "syncSalvageTask Throwable", th2);
                }
            }
        });
    }
}
