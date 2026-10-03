package com.heytap.accessory.discovery;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.heytap.accessory.api.IDiscoveryNativeService;
import com.heytap.accessory.api.IWifiP2pChangeReceiver;
import com.heytap.accessory.api.IWifiP2pService;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class P2pManager extends BaseManager {
    private static final String PREFIX = "p2p_";
    private static final String TAG = "P2pManager";
    private static P2pManager sInstance;
    private Context mContext;
    private IP2pCallback mIP2pCallback;
    private IManagerCallback mManagerCallback;
    private String mPackageName;
    private WifiP2pChangeReceiver mReceiver = new WifiP2pChangeReceiver();
    private volatile IWifiP2pService mService;

    public class WifiP2pChangeReceiver extends IWifiP2pChangeReceiver.Stub {
        private WifiP2pChangeReceiver() {
        }

        @Override // com.heytap.accessory.api.IWifiP2pChangeReceiver
        public void onStateChange(DeviceInfo deviceInfo, int i, int i2) throws RemoteException {
            if (P2pManager.this.mIP2pCallback != null) {
                P2pManager.this.mIP2pCallback.onStateChange(deviceInfo, i, i2);
            } else {
                Log.w(P2pManager.TAG, "onStateChange failed, IP2pCallback is null");
            }
        }
    }

    private P2pManager() {
    }

    private boolean bindService(@NonNull Context context) {
        if (this.mService != null) {
            Log.i(TAG, "already bind service");
            return true;
        }
        Intent intent = new Intent(Constants.SCAN_SERVICE_INTENT);
        intent.setPackage("com.heytap.accessory");
        intent.putExtra(Constants.KEY_SUB_SERVICE, 3);
        return context.bindService(intent, this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private synchronized boolean bindServiceSync(@NonNull Context context) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!bindService(context)) {
            Log.e(TAG, "bindServiceSync failed");
            return false;
        }
        try {
            try {
                wait(9000L);
                str = TAG;
                jCurrentTimeMillis = "bind service cost: " + (System.currentTimeMillis() - jCurrentTimeMillis);
            } catch (InterruptedException e2) {
                Log.e(TAG, "bindServiceSync failed, InterruptedException: " + e2.getMessage());
                str = TAG;
                jCurrentTimeMillis = "bind service cost: " + (System.currentTimeMillis() - jCurrentTimeMillis);
            }
            Log.i(str, jCurrentTimeMillis);
            return true;
        } catch (Throwable th) {
            Log.i(TAG, "bind service cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            throw th;
        }
    }

    public static P2pManager getInstance() {
        if (sInstance == null) {
            synchronized (P2pManager.class) {
                if (sInstance == null) {
                    sInstance = new P2pManager();
                }
            }
        }
        return sInstance;
    }

    public List<DeviceInfo> getConnectedDevices() throws RemoteException {
        Log.i(TAG, "getConnectedDevices");
        if (this.mService != null) {
            return this.mService.getCurrentWifiP2pDevices();
        }
        if (this.mContext != null) {
            Log.i(TAG, "getConnectedDevices, just bind service");
            runOnBackGround(this.mContext, null);
        }
        throw new RemoteException("Service not connected.");
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public String getPackageName() {
        return PREFIX + this.mPackageName;
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public /* bridge */ /* synthetic */ int getServiceVersion() {
        return super.getServiceVersion();
    }

    public synchronized boolean init(@NonNull Context context, @NonNull IP2pCallback iP2pCallback) throws SdkUnsupportedException, RemoteException {
        Log.i(TAG, "init");
        if (this.mIP2pCallback != iP2pCallback) {
            this.mIP2pCallback = iP2pCallback;
        }
        if (this.mService != null) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        BaseManager.initAFMAccessory(applicationContext);
        this.mPackageName = this.mContext.getPackageName();
        if (bindServiceSync(this.mContext)) {
            return this.mService != null;
        }
        return false;
    }

    public void initAsync(@NonNull Context context, @NonNull IP2pCallback iP2pCallback, @NonNull IManagerCallback iManagerCallback) throws SdkUnsupportedException {
        Log.i(TAG, "initAsync");
        if (this.mIP2pCallback != iP2pCallback) {
            this.mIP2pCallback = iP2pCallback;
        }
        if (this.mManagerCallback != iManagerCallback) {
            this.mManagerCallback = iManagerCallback;
        }
        if (this.mService != null) {
            this.mManagerCallback.onInited();
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        BaseManager.initAFMAccessory(applicationContext);
        this.mPackageName = this.mContext.getPackageName();
        if (bindService(this.mContext)) {
            return;
        }
        Log.e(TAG, "initAsync, bind ScanService failed");
        IManagerCallback iManagerCallback2 = this.mManagerCallback;
        if (iManagerCallback2 != null) {
            iManagerCallback2.onReleased();
            this.mManagerCallback = null;
        }
    }

    public String joinP2p(DeviceInfo deviceInfo) throws RemoteException {
        Log.i(TAG, "joinP2p");
        if (this.mService == null) {
            throw new RemoteException("Service not connected.");
        }
        if (deviceInfo != null) {
            return this.mService.joinWifiP2p(deviceInfo);
        }
        throw new NullPointerException("device null exception");
    }

    public void leaveP2p(DeviceInfo deviceInfo) throws RemoteException {
        Log.i(TAG, "leaveP2p");
        if (this.mService == null) {
            throw new RemoteException("Service not connected.");
        }
        if (deviceInfo == null) {
            throw new NullPointerException("device null exception");
        }
        this.mService.leaveWifiP2p(deviceInfo);
    }

    @Override // com.heytap.accessory.discovery.BaseManager, android.content.ServiceConnection
    public /* bridge */ /* synthetic */ void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        super.onServiceConnected(componentName, iBinder);
    }

    @Override // com.heytap.accessory.discovery.BaseManager, android.content.ServiceConnection
    public /* bridge */ /* synthetic */ void onServiceDisconnected(ComponentName componentName) {
        super.onServiceDisconnected(componentName);
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public void onSubBindService(Context context) {
        bindServiceSync(context);
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public void onSubServiceConnected(IDiscoveryNativeService iDiscoveryNativeService) {
        Log.i(TAG, "onSubServiceConnected");
        synchronized (this) {
            try {
                this.mService = iDiscoveryNativeService.getWfiP2pService();
                if (this.mService != null) {
                    this.mService.registerReceiver(this.mReceiver);
                }
                notifyAll();
                IManagerCallback iManagerCallback = this.mManagerCallback;
                if (iManagerCallback != null) {
                    iManagerCallback.onInited();
                }
            } catch (RemoteException unused) {
                SdkLog.e(TAG, "onSubServiceConnected Exception");
            }
        }
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public void onSubServiceDisconnected() {
        this.mService = null;
        IManagerCallback iManagerCallback = this.mManagerCallback;
        if (iManagerCallback != null) {
            iManagerCallback.onReleased();
            this.mManagerCallback = null;
        }
    }

    public synchronized void release(@NonNull Context context) throws RemoteException {
        release();
    }

    public synchronized void release() throws RemoteException {
        Log.i(TAG, "release");
        if (this.mService == null) {
            return;
        }
        this.mService.unregisterReceiver(this.mReceiver);
        this.mContext.unbindService(this);
        this.mService = null;
        this.mContext = null;
    }
}
