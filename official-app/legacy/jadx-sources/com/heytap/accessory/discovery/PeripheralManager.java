package com.heytap.accessory.discovery;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.heytap.accessory.api.IDiscoveryNativeService;
import com.heytap.accessory.api.IPeripheralCallback;
import com.heytap.accessory.api.IPeripheralService;
import com.heytap.accessory.bean.AdvertiseSetting;
import com.heytap.accessory.bean.AuthenticateMessage;
import com.heytap.accessory.bean.ConnectMessage;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.DiscoveryException;
import com.heytap.accessory.bean.Message;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: classes14.dex */
public class PeripheralManager extends BaseManager {
    public static final int CONNECT_RESULT_AGREE = 1;
    public static final int CONNECT_RESULT_AUTH_CUSTOMIZE = 4;
    public static final int CONNECT_RESULT_AUTH_PIN = 3;
    public static final int CONNECT_RESULT_REJECT = 2;
    public static final int ERROR_AUTHENTICATION_FAILED = 1;
    public static final int ERROR_DEVICE = 2;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_PAIR_CONNECT_FAILED = 3;
    private static final String PREFIX = "ppl_";
    private static final String TAG = "PeripheralManager";
    private static PeripheralManager sInstance;
    private Context mContext;
    private volatile boolean mInited;
    private IManagerCallback mManagerCallback;
    private String mPackageName;
    private IPeripheralService mService;

    public class PeripheralCallbackNative extends IPeripheralCallback.Stub {
        private final IPeplCallback mCallback;

        public PeripheralCallbackNative(IPeplCallback iPeplCallback) {
            this.mCallback = iPeplCallback;
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onAdvertiseFailure(int i) throws RemoteException {
            Log.i(PeripheralManager.TAG, "onAdvertiseFailure, err: " + i);
            try {
                this.mCallback.onAdvertiseFailure();
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "onAdvertiseFailure Exception");
            }
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onAdvertiseStopped() throws RemoteException {
            try {
                this.mCallback.onAdvertiseStopped();
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "onAdvertiseStopped Exception");
            }
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onAdvertiseSuccess() throws RemoteException {
            Log.i(PeripheralManager.TAG, "onAdvertiseSuccess");
            try {
                this.mCallback.onAdvertiseSuccess();
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "stopAdvertisingInternal failed");
            }
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
            Bundle bundle = message.getBundle();
            if (bundle == null) {
                Log.e(PeripheralManager.TAG, "onPairFailure failed, bundle is null");
                return;
            }
            try {
                this.mCallback.onPairFailure(deviceInfo, bundle.getInt(Message.KEY_MSG_ERROR_CODE));
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "onPairFailure Exception");
            }
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onPairSuccess(DeviceInfo deviceInfo) throws RemoteException {
            try {
                this.mCallback.onPairSuccess(deviceInfo);
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "onPairSuccess Exception");
            }
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onRequestAuthenticate(DeviceInfo deviceInfo, Message message) throws RemoteException {
            Bundle bundle = message.getBundle();
            if (bundle == null) {
                Log.e(PeripheralManager.TAG, "onRequestAuthenticate failed, bundle is null");
                return;
            }
            try {
                this.mCallback.onRequestAuthenticate(deviceInfo, new AuthenticateMessage(bundle.getByteArray(Message.KEY_MSG_AUTH_DATA)));
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "onRequestAuthenticate Exception");
            }
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onRequestConnect(DeviceInfo deviceInfo, Message message) throws RemoteException {
            Bundle bundle = message.getBundle();
            if (bundle == null) {
                Log.e(PeripheralManager.TAG, "onRequestConnect failed, bundle is null");
                return;
            }
            try {
                this.mCallback.onRequestConnect(deviceInfo, new ConnectMessage(bundle.getByteArray(Message.KEY_MSG_CONNECT_DATA)));
            } catch (Exception unused) {
                SdkLog.e(PeripheralManager.TAG, "onRequestConnect failed");
            }
        }
    }

    private PeripheralManager() {
    }

    private boolean bindService(@NonNull Context context) {
        if (this.mService != null) {
            Log.i(TAG, "already bind service");
            return true;
        }
        Intent intent = new Intent(Constants.SCAN_SERVICE_INTENT);
        intent.setPackage("com.heytap.accessory");
        intent.putExtra(Constants.KEY_SUB_SERVICE, 2);
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

    public static PeripheralManager getInstance() {
        if (sInstance == null) {
            synchronized (PeripheralManager.class) {
                if (sInstance == null) {
                    sInstance = new PeripheralManager();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAdvertisingInternal(@NonNull AdvertiseSetting advertiseSetting, @NonNull IPeplCallback iPeplCallback) {
        Log.i(TAG, "startAdvertisingInternal");
        IPeripheralService iPeripheralService = this.mService;
        if (iPeripheralService == null) {
            Log.e(TAG, "service is null");
            return;
        }
        try {
            iPeripheralService.startAdvertising(advertiseSetting, new PeripheralCallbackNative(iPeplCallback));
        } catch (RemoteException unused) {
            iPeplCallback.onAdvertiseFailure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAdvertisingInternal() {
        IPeripheralService iPeripheralService = this.mService;
        if (iPeripheralService == null) {
            Log.e(TAG, "service is null");
            return;
        }
        try {
            iPeripheralService.stopAdvertising();
        } catch (RemoteException e2) {
            Log.e(TAG, "stopAdvertisingInternal failed", e2);
        }
    }

    public void createGroup(@NonNull IPeplCallback iPeplCallback) throws DiscoveryException {
        Log.i(TAG, "disable createGroup without debug");
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public String getPackageName() {
        return PREFIX + this.mPackageName;
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public /* bridge */ /* synthetic */ int getServiceVersion() {
        return super.getServiceVersion();
    }

    public synchronized boolean init(@NonNull Context context) throws SdkUnsupportedException {
        Log.i(TAG, "init");
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

    public void initAsync(@NonNull Context context, @NonNull IManagerCallback iManagerCallback) throws SdkUnsupportedException {
        Log.i(TAG, "initAsync");
        this.mManagerCallback = iManagerCallback;
        if (this.mService != null) {
            iManagerCallback.onInited();
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
                this.mService = iDiscoveryNativeService.getAdvertiseService();
                this.mInited = true;
                notifyAll();
                IManagerCallback iManagerCallback = this.mManagerCallback;
                if (iManagerCallback != null) {
                    iManagerCallback.onInited();
                }
            } catch (RemoteException e2) {
                Log.e(TAG, "onSubServiceConnected RemoteException: " + e2.getMessage());
            }
        }
    }

    @Override // com.heytap.accessory.discovery.BaseManager
    public void onSubServiceDisconnected() {
        Log.i(TAG, "onSubServiceDisconnected");
        this.mService = null;
        this.mInited = false;
        IManagerCallback iManagerCallback = this.mManagerCallback;
        if (iManagerCallback != null) {
            iManagerCallback.onReleased();
            this.mManagerCallback = null;
        }
    }

    public synchronized void release(@NonNull Context context) {
        release();
    }

    public boolean responseAuthenticate(@NonNull DeviceInfo deviceInfo, boolean z) throws DiscoveryException {
        Log.i(TAG, "responseAuthenticate, deviceInfo: " + deviceInfo + ", agree: " + z);
        if (deviceInfo == null) {
            throw DiscoveryException.create(3, "deviceInfo shouldn't be null");
        }
        IPeripheralService iPeripheralService = this.mService;
        if (iPeripheralService == null) {
            throw DiscoveryException.create(2, "responseAuthenticate failed, service is null");
        }
        try {
            iPeripheralService.responseAuthenticate(deviceInfo, z);
            return true;
        } catch (RemoteException e2) {
            throw DiscoveryException.create(1, e2.getMessage());
        }
    }

    public boolean responseConnect(@NonNull DeviceInfo deviceInfo, int i) throws DiscoveryException {
        Log.i(TAG, "responseConnect, deviceInfo: " + deviceInfo + ", result: " + i);
        if (deviceInfo == null) {
            throw DiscoveryException.create(3, "deviceInfo shouldn't be null");
        }
        if (i < 1 || i > 4) {
            throw DiscoveryException.create(3, "unknown connect result: " + i);
        }
        IPeripheralService iPeripheralService = this.mService;
        if (iPeripheralService == null) {
            throw DiscoveryException.create(2, "responseConnect failed, service is null");
        }
        try {
            iPeripheralService.responseConnect(deviceInfo, i);
            return true;
        } catch (RemoteException e2) {
            throw DiscoveryException.create(1, e2.getMessage());
        }
    }

    public int startAdvertise(@NonNull final AdvertiseSetting advertiseSetting, @NonNull final IPeplCallback iPeplCallback) throws DiscoveryException {
        if (advertiseSetting == null) {
            throw DiscoveryException.create(3, "setting shouldn't be null");
        }
        if (iPeplCallback == null) {
            throw DiscoveryException.create(3, "callback shouldn't be null");
        }
        if (this.mInited) {
            startAdvertisingInternal(advertiseSetting, iPeplCallback);
            return 0;
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "startAdvertise failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.PeripheralManager.1
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                PeripheralManager.this.startAdvertisingInternal(advertiseSetting, iPeplCallback);
            }
        });
        return 0;
    }

    public void stopAdvertise() throws DiscoveryException {
        if (this.mInited) {
            stopAdvertisingInternal();
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "stopAdvertise failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.PeripheralManager.2
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                PeripheralManager.this.stopAdvertisingInternal();
            }
        });
    }

    public synchronized void release() {
        Log.i(TAG, "release");
        if (this.mService == null) {
            return;
        }
        this.mContext.unbindService(this);
        this.mService = null;
        this.mContext = null;
    }
}
