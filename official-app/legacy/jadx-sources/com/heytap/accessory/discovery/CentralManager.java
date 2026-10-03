package com.heytap.accessory.discovery;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.heytap.accessory.api.ICentralService;
import com.heytap.accessory.api.IDirectPairCallback;
import com.heytap.accessory.api.IDisPairCallback;
import com.heytap.accessory.api.IDisScanCallback;
import com.heytap.accessory.api.IDiscoveryNativeService;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.DirectPairInfo;
import com.heytap.accessory.bean.DiscoveryException;
import com.heytap.accessory.bean.Message;
import com.heytap.accessory.bean.PairSetting;
import com.heytap.accessory.bean.ScanSetting;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class CentralManager extends BaseManager {
    public static final int AUTHENTICATION_MODE_CUSTOMIZE = 2;
    public static final int AUTHENTICATION_MODE_PIN = 1;
    public static final int ERROR_AUTHENTICATION_FAILED = -1;
    public static final int ERROR_DEVICE = -2;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_PAIR_CONNECT_FAILED = -3;
    private static final String PREFIX = "ctl_";
    private static final String TAG = "CentralManager";
    private static CentralManager sInstance;
    private Context mContext;
    private volatile boolean mInited;
    private IManagerCallback mManagerCallback;
    private String mPackageName;
    private ICentralService mService;

    public static class DirectPairCallbackNative extends IDirectPairCallback.Stub {
        private final IDirectCallback mCallback;

        public DirectPairCallbackNative(@NonNull IDirectCallback iDirectCallback) {
            this.mCallback = iDirectCallback;
        }

        @Override // com.heytap.accessory.api.IDirectPairCallback
        public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
            this.mCallback.onPairFailure(deviceInfo, message);
        }

        @Override // com.heytap.accessory.api.IDirectPairCallback
        public void onPairSuccess(DeviceInfo deviceInfo, Message message) throws RemoteException {
            this.mCallback.onPairSuccess(deviceInfo, message);
        }
    }

    public class PairCallbackNative extends IDisPairCallback.Stub {
        private final IPairCallback mPairCallback;

        public PairCallbackNative(IPairCallback iPairCallback) {
            this.mPairCallback = iPairCallback;
        }

        @Override // com.heytap.accessory.api.IDisPairCallback
        public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
            Log.i(CentralManager.TAG, "onPairFailure, deviceInfo: " + deviceInfo);
            try {
                this.mPairCallback.onPairFailure(deviceInfo, message.getBundle());
            } catch (Exception unused) {
                SdkLog.w(CentralManager.TAG, "onPairFailure Exception");
            }
        }

        @Override // com.heytap.accessory.api.IDisPairCallback
        public void onPairMessage(DeviceInfo deviceInfo, Message message) throws RemoteException {
            Log.i(CentralManager.TAG, "onPairMessage, deviceInfo: " + deviceInfo);
            Bundle bundle = message.getBundle();
            if (bundle == null) {
                Log.e(CentralManager.TAG, "onPairMessage failed, bundle is null");
                return;
            }
            try {
                bundle.putByteArray(Message.KEY_MSG_AUTH_DATA, this.mPairCallback.onPairData(deviceInfo, bundle));
            } catch (Exception unused) {
                SdkLog.w(CentralManager.TAG, "onPairMessage Exception");
            }
        }

        @Override // com.heytap.accessory.api.IDisPairCallback
        public void onPairSuccess(DeviceInfo deviceInfo, Message message) throws RemoteException {
            Log.i(CentralManager.TAG, "onPairSuccess, deviceInfo: " + deviceInfo);
            try {
                this.mPairCallback.onPairSuccess(deviceInfo, message.getBundle());
            } catch (Exception unused) {
                SdkLog.w(CentralManager.TAG, "onPairSuccess Exception");
            }
        }
    }

    public class ScanCallbackNative extends IDisScanCallback.Stub {
        private final IScanCallback mScanCallback;

        public ScanCallbackNative(IScanCallback iScanCallback) {
            this.mScanCallback = iScanCallback;
        }

        @Override // com.heytap.accessory.api.IDisScanCallback
        public void onCancel() throws RemoteException {
            try {
                this.mScanCallback.onCancel();
            } catch (Exception unused) {
                SdkLog.w(CentralManager.TAG, "onCancel Exception");
            }
        }

        @Override // com.heytap.accessory.api.IDisScanCallback
        public void onDeviceFound(DeviceInfo deviceInfo) throws RemoteException {
            try {
                this.mScanCallback.onDeviceFound(deviceInfo);
            } catch (Exception unused) {
                SdkLog.w(CentralManager.TAG, "onDeviceFound Exception");
            }
        }
    }

    private CentralManager() {
    }

    private boolean bindService(@NonNull Context context) {
        if (this.mService != null) {
            Log.i(TAG, "already bind service");
            return true;
        }
        Intent intent = new Intent(Constants.SCAN_SERVICE_INTENT);
        intent.setPackage("com.heytap.accessory");
        intent.putExtra(Constants.KEY_SUB_SERVICE, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void cancalPairInternal(@NonNull DeviceInfo deviceInfo) {
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return;
        }
        try {
            iCentralService.cancelPair(deviceInfo);
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "cancalPairInternal Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelScanInternal() {
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return;
        }
        try {
            iCentralService.cancelScan();
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "cancelScanInternal Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int directPairInternal(DirectPairInfo directPairInfo, IDirectCallback iDirectCallback) {
        int iDirectPair;
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return 1;
        }
        try {
            iDirectPair = iCentralService.directPair(directPairInfo, new DirectPairCallbackNative(iDirectCallback));
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "directPairInternal Exception");
            iDirectPair = 7;
        }
        if (iDirectPair != 0) {
            Log.e(TAG, "directPair failed, err: " + iDirectPair);
            Message message = new Message();
            message.getBundle().putInt(Message.KEY_MSG_ERROR_CODE, iDirectPair);
            iDirectCallback.onPairFailure(new DeviceInfo(), message);
        }
        return iDirectPair;
    }

    private int earlyPairInternal(@NonNull DeviceInfo deviceInfo) {
        int iEarlyPair;
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return 1;
        }
        try {
            iEarlyPair = iCentralService.earlyPair(deviceInfo);
        } catch (RemoteException unused) {
            iEarlyPair = 7;
        }
        if (iEarlyPair != 0) {
            Log.e(TAG, "earlyPair failed, err: " + iEarlyPair);
        }
        return iEarlyPair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableDiscoverabilityInternal(int i, boolean z) {
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return;
        }
        try {
            iCentralService.enableDiscoverability(i, z);
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "enableDiscoverabilityInternal Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void expEnableDiscoverabilityInternal(int i, boolean z, long j2) {
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return;
        }
        try {
            iCentralService.expEnableDiscoverability(i, z, j2);
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "expEnableDiscoverabilityInternal Exception");
        }
    }

    public static CentralManager getInstance() {
        if (sInstance == null) {
            synchronized (CentralManager.class) {
                if (sInstance == null) {
                    sInstance = new CentralManager();
                }
            }
        }
        return sInstance;
    }

    private Bundle packFilterBundle(List<IScanFilter> list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            for (IScanFilter iScanFilter : list) {
                bundle.putParcelable(iScanFilter.getKey(), iScanFilter);
            }
        }
        return bundle;
    }

    private int startPairInternal(@NonNull PairSetting pairSetting, @NonNull DeviceInfo deviceInfo, @NonNull IPairCallback iPairCallback) {
        int iStartPair;
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return 1;
        }
        try {
            iStartPair = iCentralService.startPair(pairSetting, deviceInfo, new PairCallbackNative(iPairCallback));
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "startPairInternal Exception");
            iStartPair = 7;
        }
        if (iStartPair != 0) {
            Log.e(TAG, "startPair failed, err: " + iStartPair);
            Bundle bundle = new Bundle();
            bundle.putInt(Message.KEY_MSG_ERROR_CODE, iStartPair);
            iPairCallback.onPairFailure(deviceInfo, bundle);
        }
        return iStartPair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int startScanInternal(@NonNull ScanSetting scanSetting, List<IScanFilter> list, @NonNull IScanCallback iScanCallback) {
        int iStartScan;
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            Log.e(TAG, "service is null");
            return 1;
        }
        try {
            iStartScan = iCentralService.startScan(scanSetting, packFilterBundle(list), new ScanCallbackNative(iScanCallback));
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "startScanInternal Exception");
            iStartScan = 2;
        }
        if (iStartScan != 0) {
            Log.e(TAG, "startScan failed, err: " + iStartScan);
            iScanCallback.onCancel();
        }
        return iStartScan;
    }

    public void cancelPair(@NonNull final DeviceInfo deviceInfo) throws DiscoveryException {
        Log.i(TAG, "cancelPair, deviceInfo: " + deviceInfo);
        if (deviceInfo == null) {
            throw DiscoveryException.create(3, "deviceInfo shouldn't be null");
        }
        if (this.mInited) {
            cancalPairInternal(deviceInfo);
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "cancelPair failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.CentralManager.3
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                CentralManager.this.cancalPairInternal(deviceInfo);
            }
        });
    }

    public void cancelScan() throws DiscoveryException {
        if (this.mInited) {
            cancelScanInternal();
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "cancelScan failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.CentralManager.2
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                CentralManager.this.cancelScanInternal();
            }
        });
    }

    public boolean checkDiscoverability(int i) throws DiscoveryException {
        ICentralService iCentralService = this.mService;
        if (iCentralService == null) {
            throw DiscoveryException.create(2, "checkDiscoverability failed, service is null");
        }
        try {
            return iCentralService.checkDiscoverability(i);
        } catch (RemoteException e2) {
            SdkLog.w(TAG, "checkDiscoverability Exception");
            throw DiscoveryException.create(1, e2.getMessage());
        }
    }

    public int directPair(@NonNull final DirectPairInfo directPairInfo, @NonNull final IDirectCallback iDirectCallback) throws DiscoveryException {
        if (directPairInfo == null) {
            throw DiscoveryException.create(3, "directPairInfo shouldn't be null");
        }
        if (iDirectCallback == null) {
            throw DiscoveryException.create(3, "callback shouldn't be null");
        }
        if (this.mInited) {
            return directPairInternal(directPairInfo, iDirectCallback);
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "directPair failed, service is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.CentralManager.6
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                CentralManager.this.directPairInternal(directPairInfo, iDirectCallback);
            }
        });
        return 0;
    }

    public int earlyPair(@NonNull DeviceInfo deviceInfo) throws DiscoveryException {
        if (deviceInfo == null) {
            throw DiscoveryException.create(3, "deviceInfo shouldn't be null");
        }
        if (this.mInited) {
            return earlyPairInternal(deviceInfo);
        }
        throw DiscoveryException.create(2, "earlyPair failed, service and context is null");
    }

    public void enableDiscoverability(final int i, final boolean z) throws DiscoveryException {
        Log.i(TAG, "enableDiscoverability, major: " + i + ", enable: " + z);
        if (this.mInited) {
            enableDiscoverabilityInternal(i, z);
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "enableDiscoverability failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.CentralManager.4
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                CentralManager.this.enableDiscoverabilityInternal(i, z);
            }
        });
    }

    public void expEnableDiscoverability(final int i, final boolean z, final long j2) throws DiscoveryException {
        Log.i(TAG, "expEnableDiscoverability, major: " + i + ", enable: " + z + ", delayMillis: " + j2);
        if (this.mInited) {
            expEnableDiscoverabilityInternal(i, z, j2);
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "expEnableDiscoverability failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.CentralManager.5
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                CentralManager.this.expEnableDiscoverabilityInternal(i, z, j2);
            }
        });
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
                this.mService = iDiscoveryNativeService.getScanService();
                this.mInited = true;
                notifyAll();
                IManagerCallback iManagerCallback = this.mManagerCallback;
                if (iManagerCallback != null) {
                    iManagerCallback.onInited();
                }
            } catch (RemoteException unused) {
                SdkLog.w(TAG, "onSubServiceConnected error");
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

    public void saveModelId(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        try {
            SdkLog.i(TAG, "save modelId and remoteDeviceId");
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.KEY_BUSINESS_TYPE, 2);
            bundle.putByteArray("model_id", bArr3);
            bundle.putByteArray(Constants.KEY_REMOTE_DEVICE_ID, bArr2);
            bundle.putByteArray(Constants.KEY_LOCAL_DEVICE_ID, bArr);
            this.mService.saveParameters(bundle);
        } catch (RemoteException e2) {
            SdkLog.e(TAG, e2.toString());
        }
    }

    public int startPair(@NonNull DeviceInfo deviceInfo, @NonNull IPairCallback iPairCallback) throws DiscoveryException {
        return startPair(new PairSetting.Builder().build(), deviceInfo, iPairCallback);
    }

    public int startScan(@NonNull final ScanSetting scanSetting, final List<IScanFilter> list, @NonNull final IScanCallback iScanCallback) throws DiscoveryException {
        if (scanSetting == null) {
            throw DiscoveryException.create(3, "setting shouldn't be null");
        }
        if (iScanCallback == null) {
            throw DiscoveryException.create(2, "startScan failed, callback is null");
        }
        if (this.mInited) {
            return startScanInternal(scanSetting, list, iScanCallback);
        }
        Context context = this.mContext;
        if (context == null) {
            throw DiscoveryException.create(2, "startScan failed, service and context is null");
        }
        runOnBackGround(context, new IJob() { // from class: com.heytap.accessory.discovery.CentralManager.1
            @Override // com.heytap.accessory.discovery.IJob
            public void run() {
                CentralManager.this.startScanInternal(scanSetting, list, iScanCallback);
            }
        });
        return 0;
    }

    public int startPair(@NonNull PairSetting pairSetting, @NonNull DeviceInfo deviceInfo, @NonNull IPairCallback iPairCallback) throws DiscoveryException {
        Log.i(TAG, "startPair, deviceInfo: " + deviceInfo);
        if (pairSetting == null) {
            throw DiscoveryException.create(3, "setting shouldn't be null");
        }
        if (deviceInfo == null) {
            throw DiscoveryException.create(3, "deviceInfo shouldn't be null");
        }
        if (iPairCallback == null) {
            throw DiscoveryException.create(3, "callback shouldn't be null");
        }
        if (this.mInited) {
            return startPairInternal(pairSetting, deviceInfo, iPairCallback);
        }
        throw DiscoveryException.create(2, "startPair failed, service and context is null");
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
