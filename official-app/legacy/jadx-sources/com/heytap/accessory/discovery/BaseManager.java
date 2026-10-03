package com.heytap.accessory.discovery;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.heytap.accessory.Config;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.api.IDiscoveryNativeService;
import com.heytap.accessory.api.IServiceConnectionIndicationCallback;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.constant.DiscoveryServiceConstants;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: classes14.dex */
abstract class BaseManager implements ServiceConnection {
    private static final String BACKGROUND_THREAD_NAME = "BGT";
    private static final int MSG_BIND_SERVICE = 1;
    private static final int MSG_QUIT_SAFELY = 3;
    private static final int MSG_RUN_RUNNABLE = 2;
    private static final String TAG = "BaseManager";
    private long mClientId;
    private IDeathCallback mDeathCallback;
    private ServiceConnectionIndicationCallback mScIndicationCallback;
    private int mServiceVersion;
    private Handler mWorkerHandler;

    public static final class DeathCallbackStub extends IDeathCallback.Stub {
        private String mPackageName;

        public DeathCallbackStub(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Invalid packageName:null");
            }
            this.mPackageName = str;
        }

        @Override // com.heytap.accessory.api.IDeathCallback
        public String getAppName() throws RemoteException {
            return this.mPackageName;
        }
    }

    public final class ServiceConnectionIndicationCallback extends IServiceConnectionIndicationCallback.Stub {
        @Override // com.heytap.accessory.api.IServiceConnectionIndicationCallback
        @TargetApi(26)
        public void onServiceConnectionRequested(Bundle bundle) throws RemoteException {
            SdkLog.i(BaseManager.TAG, "onServiceConnectionRequested: " + bundle);
        }

        private ServiceConnectionIndicationCallback() {
            SdkLog.i(BaseManager.TAG, "ServiceConnectionIndicationCallback");
        }
    }

    public static void initAFMAccessory(Context context) throws SdkUnsupportedException {
        if (context == null) {
            throw new IllegalArgumentException("Illegal argument: context");
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.accessory", 0);
            int i = packageInfo == null ? -1 : packageInfo.versionCode;
            SdkLog.i(TAG, "AF version: " + i);
        } catch (PackageManager.NameNotFoundException unused) {
            SdkLog.e(TAG, "AF not installed");
            throw new SdkUnsupportedException("AF not installed", 2);
        }
    }

    private void makeDiscoveryConnection(IDiscoveryNativeService iDiscoveryNativeService) {
        try {
            Bundle bundleMakeDiscoveryConnection = iDiscoveryNativeService.makeDiscoveryConnection(Process.myPid(), getPackageName(), this.mDeathCallback, Config.getSdkVersionCode(), this.mScIndicationCallback);
            if (bundleMakeDiscoveryConnection == null) {
                SdkLog.e(TAG, "onServiceConnected failed, invalid response");
                return;
            }
            long j2 = bundleMakeDiscoveryConnection.getLong("client_id", -1L);
            this.mClientId = j2;
            if (j2 == -1) {
                SdkLog.e(TAG, "onServiceConnected failed, invalid clientId, error: " + bundleMakeDiscoveryConnection.getInt("error_code", 0));
                return;
            }
            this.mServiceVersion = bundleMakeDiscoveryConnection.getInt(DiscoveryServiceConstants.EXTRA_SERVICE_VERSION, 1);
            SdkLog.i(TAG, "Received clientId: " + this.mClientId + ", serviceVersion: " + this.mServiceVersion);
        } catch (RemoteException e2) {
            SdkLog.w(TAG, "makeDiscoveryConnection RemoteException" + e2);
        }
    }

    public abstract String getPackageName();

    public int getServiceVersion() {
        return this.mServiceVersion;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = TAG;
        SdkLog.i(str, "trace-onServiceConnected, ComponentName: " + componentName + ", service: " + iBinder);
        IDiscoveryNativeService iDiscoveryNativeServiceAsInterface = IDiscoveryNativeService.Stub.asInterface(iBinder);
        if (iDiscoveryNativeServiceAsInterface == null) {
            SdkLog.e(str, "onServiceConnected failed, service is null");
            return;
        }
        this.mDeathCallback = new DeathCallbackStub(getPackageName());
        this.mScIndicationCallback = new ServiceConnectionIndicationCallback();
        makeDiscoveryConnection(iDiscoveryNativeServiceAsInterface);
        onSubServiceConnected(iDiscoveryNativeServiceAsInterface);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        SdkLog.i(TAG, "trace-onServiceDisconnected, ComponentName: " + componentName);
        onSubServiceDisconnected();
    }

    public abstract void onSubBindService(Context context);

    public abstract void onSubServiceConnected(IDiscoveryNativeService iDiscoveryNativeService);

    public abstract void onSubServiceDisconnected();

    public void runOnBackGround(final Context context, final IJob iJob) {
        SdkLog.i(TAG, "runOnBackGround");
        if (this.mWorkerHandler == null) {
            HandlerThread handlerThread = new HandlerThread(BACKGROUND_THREAD_NAME);
            handlerThread.start();
            this.mWorkerHandler = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.heytap.accessory.discovery.BaseManager.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(@NonNull Message message) {
                    int i = message.what;
                    if (i == 1) {
                        SdkLog.i(BaseManager.TAG, "runOnBackGround MSG_BIND_SERVICE");
                        BaseManager.this.onSubBindService(context);
                        if (!BaseManager.this.mWorkerHandler.getLooper().getQueue().isIdle()) {
                            return false;
                        }
                        BaseManager.this.mWorkerHandler.sendEmptyMessage(3);
                        return false;
                    }
                    if (i == 2) {
                        SdkLog.i(BaseManager.TAG, "runOnBackGround MSG_RUN_RUNNABLE");
                        IJob iJob2 = iJob;
                        if (iJob2 != null) {
                            iJob2.run();
                        }
                        if (!BaseManager.this.mWorkerHandler.getLooper().getQueue().isIdle()) {
                            return false;
                        }
                        BaseManager.this.mWorkerHandler.sendEmptyMessage(3);
                        return false;
                    }
                    if (i != 3) {
                        return false;
                    }
                    if (!BaseManager.this.mWorkerHandler.getLooper().getQueue().isIdle()) {
                        SdkLog.i(BaseManager.TAG, "runOnBackGround MSG_QUIT_SAFELY, but still have msg");
                        return false;
                    }
                    SdkLog.i(BaseManager.TAG, "runOnBackGround MSG_QUIT_SAFELY");
                    BaseManager.this.mWorkerHandler.getLooper().quitSafely();
                    BaseManager.this.mWorkerHandler = null;
                    return false;
                }
            });
        }
        this.mWorkerHandler.obtainMessage(1).sendToTarget();
        this.mWorkerHandler.obtainMessage(2, iJob).sendToTarget();
    }
}
