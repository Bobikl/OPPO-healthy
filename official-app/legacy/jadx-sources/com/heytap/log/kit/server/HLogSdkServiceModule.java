package com.heytap.log.kit.server;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.heytap.log.kit.Constant;
import com.heytap.log.kit.KitHelper;
import com.heytap.log.kit.file.LogFileGrantListener;
import com.heytap.log.kit.file.LogFileTransmitter;
import com.heytap.log.util.AppUtil;
import com.heytap.msp.hlog.kit.ICallback;
import com.heytap.mspsdk.log.MspLog;
import com.opos.process.bridge.annotation.BridgeCallback;
import com.opos.process.bridge.annotation.BridgeMethod;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.client.BaseProviderClient;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import com.opos.process.bridge.provider.IBridgeHandler;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class HLogSdkServiceModule implements IBridgeHandler {
    private static final String ALLOWED_PACKAGE_NAME = "com.heytap.htms";
    private static final String ALLOWED_PERMISSION = "com.oplus.permission.safe.SAFE_MANAGER";
    private static final String TAG = "HLogSdkServiceModule";
    private static Context mContext;
    private static HLogSdkServiceModule singleInstance = new HLogSdkServiceModule();
    public static IBridgeHandler.Factory FACTORY = new IBridgeHandler.Factory() { // from class: com.heytap.log.kit.server.HLogSdkServiceModule.1
        @Override // com.opos.process.bridge.provider.IBridgeHandler.Factory
        public IBridgeHandler getInstance(Context context, IBridgeTargetIdentify iBridgeTargetIdentify) {
            Context unused = HLogSdkServiceModule.mContext = context;
            AppUtil.setAppContext(context);
            AppUtil.setAppSpContext(context);
            return HLogSdkServiceModule.singleInstance;
        }
    };

    public final class Client extends BaseProviderClient implements Interface {
        public static final String TARGET_CLASS = "com.heytap.log.kit.server.HLogSdkServiceModule";

        public Client(Context context) {
            this(context, null);
        }

        @Override // com.opos.process.bridge.client.BaseProviderClient
        public String getTargetClass() {
            return "com.heytap.log.kit.server.HLogSdkProvider";
        }

        @Override // com.heytap.log.kit.server.HLogSdkServiceModule.Interface
        public final void requestLogFile(Bundle bundle, ICallback iCallback) throws BridgeExecuteException, BridgeDispatchException {
            checkMainThread();
            call(this.mContext, "com.heytap.log.kit.server.HLogSdkServiceModule", this.mTargetIdentify, 1, bundle, iCallback);
        }

        @Override // com.heytap.log.kit.server.HLogSdkServiceModule.Interface
        public final boolean startSalvageLog(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException {
            checkMainThread();
            Object objCallForResult = callForResult(this.mContext, "com.heytap.log.kit.server.HLogSdkServiceModule", this.mTargetIdentify, 2, bundle);
            checkNullResultType(objCallForResult, Boolean.TYPE);
            if (objCallForResult == null || (objCallForResult instanceof Boolean)) {
                return ((Boolean) objCallForResult).booleanValue();
            }
            throw new BridgeExecuteException("return value is not match:" + objCallForResult, BridgeResultCode.CODE_RESPONSE_ERROR);
        }

        public Client(Context context, Bundle bundle) {
            super(context, null, bundle);
            this.defaultAuthorities = new String[]{"${applicationId}.Log.HLOG_SDK_PROVIDER"};
        }
    }

    public interface Interface {
        void requestLogFile(Bundle bundle, ICallback iCallback) throws BridgeExecuteException, BridgeDispatchException;

        boolean startSalvageLog(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRequestLogFileError(Bundle bundle, @BridgeCallback ICallback iCallback, int i, String str) {
        if (bundle == null || iCallback == null) {
            return;
        }
        bundle.putInt(Constant.DATA_KEY.KEY_CODE, i);
        bundle.putString(Constant.DATA_KEY.KEY_MSG, str);
        try {
            iCallback.callback(-1, bundle);
        } catch (Throwable th) {
            MspLog.e(TAG, th);
        }
    }

    private boolean verifyCaller() {
        Context context = mContext;
        if (context == null) {
            Log.e(TAG, "verifyCaller: context is null");
            return false;
        }
        if (!AppUtil.verifyPermission(context, ALLOWED_PERMISSION) || !AppUtil.verifySystemApp(mContext)) {
            return false;
        }
        Log.d(TAG, "verifyCaller: verification passed");
        return true;
    }

    public Context getContext() {
        return mContext;
    }

    @BridgeMethod(methodId = 1)
    public void requestLogFile(Bundle bundle, @BridgeCallback final ICallback iCallback) {
        Log.d(TAG, "requestLogFile:");
        if (!verifyCaller()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(Constant.DATA_KEY.KEY_CODE, -1);
            bundle2.putString(Constant.DATA_KEY.KEY_MSG, "Unauthorized access denied");
            if (iCallback != null) {
                try {
                    iCallback.callback(-1, bundle2);
                    return;
                } catch (RemoteException e2) {
                    MspLog.e(TAG, e2);
                    return;
                }
            }
            return;
        }
        final Bundle bundle3 = new Bundle();
        Bundle bundle4 = new Bundle();
        try {
            bundle4.putLong(Constant.DATA_KEY.KEY_HLOG_SDK_VER, AppUtil.getSDKVersionCode());
            bundle4.putInt(Constant.DATA_KEY.KEY_TRACK_PKG_VER, AppUtil.getAppVersionCode(getContext()));
            if (bundle == null) {
                bundle3.putInt(Constant.DATA_KEY.KEY_CODE, -1);
                bundle3.putString(Constant.DATA_KEY.KEY_MSG, "request bundle is null");
                if (iCallback != null) {
                    iCallback.callback(-1, bundle3);
                    return;
                }
                return;
            }
            int i = bundle.getInt(Constant.DATA_KEY.KEY_TASK_TYPE);
            String string = bundle.getString(Constant.DATA_KEY.KEY_BUSINESS);
            String string2 = bundle.getString(Constant.DATA_KEY.KEY_GRANT_TARGET_PKG);
            String string3 = bundle.getString(Constant.DATA_KEY.KEY_DATA_JSON);
            if (i == 0) {
                LogFileTransmitter.getSalvageLogFileToTransmit(mContext, string, string3, string2, new LogFileGrantListener() { // from class: com.heytap.log.kit.server.HLogSdkServiceModule.2
                    @Override // com.heytap.log.kit.file.LogFileGrantListener
                    public void onGrantFail(int i2, String str) {
                        MspLog.d(HLogSdkServiceModule.TAG, "onGrantFail:" + i2 + ";" + str);
                        HLogSdkServiceModule.this.handleRequestLogFileError(bundle3, iCallback, i2, str);
                    }

                    @Override // com.heytap.log.kit.file.LogFileGrantListener
                    public void onGrantSuc(int i2, String str, File file) {
                        MspLog.d(HLogSdkServiceModule.TAG, "onGrantSuc:" + str);
                        bundle3.putInt(Constant.DATA_KEY.KEY_CODE, i2);
                        bundle3.putString(Constant.DATA_KEY.KEY_FILE_URI, str);
                        bundle3.putLong(Constant.DATA_KEY.KEY_FILE_LENGTH, file.length());
                        try {
                            ICallback iCallback2 = iCallback;
                            if (iCallback2 != null) {
                                iCallback2.callback(0, bundle3);
                            }
                        } catch (RemoteException e3) {
                            MspLog.e(HLogSdkServiceModule.TAG, e3);
                        }
                    }
                });
            } else if (i == 1) {
                LogFileTransmitter.getReportLogFileToTransmit(mContext, string, string3, string2, new LogFileGrantListener() { // from class: com.heytap.log.kit.server.HLogSdkServiceModule.3
                    @Override // com.heytap.log.kit.file.LogFileGrantListener
                    public void onGrantFail(int i2, String str) {
                        MspLog.d(HLogSdkServiceModule.TAG, "onGrantFail:" + i2 + ";" + str);
                        HLogSdkServiceModule.this.handleRequestLogFileError(bundle3, iCallback, i2, str);
                    }

                    @Override // com.heytap.log.kit.file.LogFileGrantListener
                    public void onGrantSuc(int i2, String str, File file) {
                        MspLog.d(HLogSdkServiceModule.TAG, "onGrantSuc:" + str);
                        bundle3.putInt(Constant.DATA_KEY.KEY_CODE, i2);
                        bundle3.putString(Constant.DATA_KEY.KEY_FILE_URI, str);
                        bundle3.putLong(Constant.DATA_KEY.KEY_FILE_LENGTH, file.length());
                        try {
                            ICallback iCallback2 = iCallback;
                            if (iCallback2 != null) {
                                iCallback2.callback(0, bundle3);
                            }
                        } catch (RemoteException e3) {
                            MspLog.e(HLogSdkServiceModule.TAG, e3);
                        }
                    }
                });
            }
        } catch (RemoteException e3) {
            Log.e(TAG, e3.getMessage());
            handleRequestLogFileError(bundle3, iCallback, 900, e3.getMessage());
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage());
            handleRequestLogFileError(bundle3, iCallback, 900, th.getMessage());
        }
    }

    @BridgeMethod(methodId = 2)
    public boolean startSalvageLog(Bundle bundle) {
        Log.d(TAG, "startSalvageLog:");
        if (!verifyCaller()) {
            Log.e(TAG, "startSalvageLog: unauthorized access denied");
            return false;
        }
        try {
            bundle.getString(Constant.DATA_KEY.KEY_BUSINESS);
            KitHelper.synKitTaskConfigs(mContext, bundle.getString(Constant.DATA_KEY.KEY_DATA_JSON));
            return true;
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage());
            return false;
        }
    }
}
