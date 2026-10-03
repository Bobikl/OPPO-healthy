package com.heytap.accessory.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.accessory.Config;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.bean.AccountInfo;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class GenericAdapter {
    private static final int COMMAND_MAKE_FW_CONNECTION = 1;
    private static final int ERROR_FATAL = 20001;
    private static final int ERROR_INVALID_PARAM = 1;
    private static final int ERROR_NO_ADMIN_PERMISSION = 2;
    private static final String EXTRA_CLIENT_ID = "clientId";
    private static final String EXTRA_CONNECTED_ACCESSORIES = "connectedAccessories";
    private static final String EXTRA_ERROR_CODE = "errorCode";
    private static final String EXTRA_GET_LOCAL_REGISTERED_SERVICE_PROFILE = "get_local_registered_service_profile";
    private static final String EXTRA_PACKAGE_NAME = "packageName";
    private static final String EXTRA_REGISTER_SERVICE_PROFILE = "register_service_profile";
    private static final String EXTRA_REMOTE_SERVICES = "remoteServices";
    private static final String EXTRA_RESULT_RECEIVER = "resultReceiver";
    private static final String EXTRA_SDK_VERSION_CODE = "sdkVersionCode";
    private static final String EXTRA_STATUS_CODE = "statusCode";
    private static final String EXTRA_TRANSPORT_ADDRESS = "address";
    private static final String EXTRA_TRANSPORT_TYPE = "transportType";
    private static final String EXTRA_TRANSPORT_UUID = "uuid";
    private static final int STATUS_SUCCESS = 0;
    private static final String TAG = "GenericAdapter";
    private static final int TIMEOUT_3000 = 3000;
    private static ICMDeathCallback sCMDeathCallback;
    static ServiceConnection sGenericConnection = new ServiceConnection() { // from class: com.heytap.accessory.api.GenericAdapter.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGenFrameworkManager iGenFrameworkManager;
            GenericAdapter.sOnlyInstance.mProxy = IGenFrameworkManager.Stub.asInterface(iBinder);
            Bundle bundle = new Bundle();
            synchronized (GenericAdapter.sOnlyInstance) {
                String packageName = GenericAdapter.sOnlyInstance.mContext.getPackageName();
                SdkLog.d(GenericAdapter.TAG, "onServiceConnected: packageName: " + packageName);
                bundle.putString("packageName", packageName);
                bundle.putInt(GenericAdapter.EXTRA_SDK_VERSION_CODE, Config.getSdkVersionCode());
                iGenFrameworkManager = GenericAdapter.sOnlyInstance.mProxy != null ? GenericAdapter.sOnlyInstance.mProxy : null;
            }
            if (iGenFrameworkManager != null) {
                try {
                    Bundle bundleSendCommand = iGenFrameworkManager.sendCommand(-1L, 1, bundle);
                    if (bundleSendCommand.containsKey("clientId")) {
                        GenericAdapter.sOnlyInstance.mClientId = bundleSendCommand.getLong("clientId");
                        iGenFrameworkManager.registerDeathCallback(GenericAdapter.sOnlyInstance.mClientId, GenericAdapter.sCMDeathCallback);
                    }
                } catch (Exception e) {
                    SdkLog.e(GenericAdapter.TAG, "exception: " + e.getMessage());
                }
                if (GenericAdapter.sOnlyInstance.mAccessoryEventReceiver != null) {
                    GenericAdapter.sOnlyInstance.registerAccessoryCallback(GenericAdapter.sOnlyInstance.mAccessoryEventReceiver);
                }
            }
            SdkLog.d(GenericAdapter.TAG, "Client ID:" + GenericAdapter.sOnlyInstance.mClientId);
            synchronized (GenericAdapter.sOnlyInstance) {
                GenericAdapter.sOnlyInstance.notifyAll();
                SdkLog.i(GenericAdapter.TAG, "onServiceConnected: Just notified");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            SdkLog.i(GenericAdapter.TAG, "Disconnected from Generic service");
            GenericAdapter.sOnlyInstance.mProxy = null;
            GenericAdapter.sOnlyInstance.mClientId = -1L;
            if (GenericAdapter.sOnlyInstance.mAccessoryEventReceiver != null) {
                GenericAdapter.sOnlyInstance.mAccessoryEventReceiver.send(20001, new Bundle());
            }
        }
    };
    private static volatile GenericAdapter sOnlyInstance;
    private ResultReceiver mAccessoryEventReceiver;
    private long mClientId = -1;
    private Context mContext;
    private IGenFrameworkManager mProxy;

    public static final class ICMDeathCallbackStub extends ICMDeathCallback.Stub {
        private String mPackageName;

        public ICMDeathCallbackStub(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Invalid packageName:null");
            }
            this.mPackageName = str;
        }

        @Override // com.heytap.accessory.api.ICMDeathCallback
        public String getAppName() throws RemoteException {
            return this.mPackageName;
        }
    }

    private GenericAdapter(Context context) {
        this.mContext = context;
        sCMDeathCallback = new ICMDeathCallbackStub(context.getPackageName());
    }

    public static boolean bindOAF(Context context) {
        if (sOnlyInstance.mProxy == null) {
            if (context == null) {
                SdkLog.e(TAG, "context must not be null");
                return false;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                SdkLog.e(TAG, "could not bind oaf in main thread!");
                return false;
            }
            Intent intent = new Intent("com.heytap.accessory.action.BASE_FRAMEWORK_MANAGER");
            if (Initializer.useOAFApp(context)) {
                intent.setPackage("com.heytap.accessory");
            } else {
                intent.setPackage(context.getPackageName());
            }
            String str = TAG;
            SdkLog.i(str, "bind oaf service");
            if (!context.bindService(intent, sGenericConnection, 1)) {
                SdkLog.w(str, "bind INTENT_BASE_FRAMEWORK_SERVICE failed!");
                if (sOnlyInstance.mAccessoryEventReceiver != null) {
                    sOnlyInstance.mAccessoryEventReceiver.send(20001, new Bundle());
                }
                return false;
            }
            synchronized (sOnlyInstance) {
                try {
                    try {
                        sOnlyInstance.wait(3000L);
                    } catch (Exception unused) {
                        SdkLog.e(TAG, "bind GAdapter error.");
                        return false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return true;
    }

    public static GenericAdapter getInstance(Context context) {
        if (sOnlyInstance == null) {
            synchronized (GenericAdapter.class) {
                if (sOnlyInstance == null) {
                    sOnlyInstance = new GenericAdapter(context);
                }
            }
        }
        if (sOnlyInstance.mProxy == null) {
            if (!bindOAF(context)) {
                SdkLog.w(TAG, "bind INTENT_BASE_FRAMEWORK_SERVICE failed!");
                if (sOnlyInstance.mAccessoryEventReceiver != null) {
                    sOnlyInstance.mAccessoryEventReceiver.send(20001, new Bundle());
                }
                return sOnlyInstance;
            }
            synchronized (sOnlyInstance) {
                try {
                    sOnlyInstance.wait(3000L);
                } catch (Exception unused) {
                    SdkLog.e(TAG, "bind GAdapter error.");
                }
            }
        }
        return sOnlyInstance;
    }

    private ResultReceiver prepareResultReceiver(ResultReceiver resultReceiver) {
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }

    @NonNull
    private synchronized Bundle sendCommand(IGenFrameworkManager iGenFrameworkManager, long j, int i, Bundle bundle) throws RemoteException {
        Bundle bundle2 = new Bundle();
        if (iGenFrameworkManager == null) {
            String str = TAG;
            SdkLog.i(str, "current proxy is null,try rebind");
            if (!bindOAF(this.mContext) || this.mProxy == null) {
                SdkLog.e(str, "rebind OAF failed!");
                bundle2.putInt(EXTRA_STATUS_CODE, -1);
                return bundle2;
            }
        }
        Bundle bundleSendCommand = this.mProxy.sendCommand(j, i, bundle);
        if (bundleSendCommand != null) {
            return bundleSendCommand;
        }
        throw new RemoteException("command not support:" + i + ", please update oaf.");
    }

    public synchronized boolean checkAuthentication(String str) {
        try {
            IGenFrameworkManager iGenFrameworkManager = this.mProxy;
            if (iGenFrameworkManager != null) {
                return iGenFrameworkManager.handleAuthenticationWithPermission(Config.getSdkVersionCode(), str);
            }
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
        }
        return false;
    }

    public synchronized int checkKscExist(byte[] bArr, byte[] bArr2) {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_DEVICE_ID, bArr);
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_KSC_ALIAS, bArr2);
        try {
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            return -1;
        }
        return sendCommand(this.mProxy, this.mClientId, 20, bundle).getInt(EXTRA_STATUS_CODE);
    }

    public synchronized int connect(ConnectConfig connectConfig) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putAll(connectConfig.getBundle());
        try {
            i = sendCommand(this.mProxy, this.mClientId, 8, bundle).getInt(EXTRA_STATUS_CODE);
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: connect " + e.getMessage());
            i = -1;
        }
        return i;
    }

    public synchronized int disconnect(String str, int i) {
        return disconnect(str, i, 0);
    }

    public synchronized List<AccountInfo> getAccountInfoList() {
        Bundle bundle = new Bundle();
        SdkLog.d(TAG, "adapter getAccountInfoArray = " + bundle);
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundleSendCommand = sendCommand(this.mProxy, this.mClientId, 10, bundle);
            bundleSendCommand.setClassLoader(AccountInfo.class.getClassLoader());
            if (bundleSendCommand.getInt(Constants.EXTRA_CONNECT_PARAM_ACCOUNT_SIZE) == 0) {
                return arrayList;
            }
            arrayList = bundleSendCommand.getParcelableArrayList(Constants.EXTRA_CONNECT_PARAM_ACCOUNT_LIST);
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
        }
        return arrayList;
    }

    public synchronized List<ServiceProfile> getAvailableServices(long j) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        bundle.putLong(FrameworkServiceConstants.EXTRA_ACCESSORY_ID, j);
        try {
            Bundle bundleSendCommand = sendCommand(this.mProxy, this.mClientId, 12, bundle);
            bundleSendCommand.setClassLoader(ServiceProfile.class.getClassLoader());
            if (bundleSendCommand.getInt(EXTRA_STATUS_CODE, -1) == 0) {
                arrayList = bundleSendCommand.getParcelableArrayList(EXTRA_REMOTE_SERVICES);
            }
            SdkLog.d(TAG, "return accessoryId:" + j + " services size:" + arrayList.size());
        } catch (RemoteException e) {
            SdkLog.e(TAG, "getAvailableServices exception: " + e.getMessage());
        }
        return arrayList;
    }

    public synchronized List<PeerAccessory> getConnectedAccessories() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            Bundle bundleSendCommand = sendCommand(this.mProxy, this.mClientId, 4, new Bundle());
            bundleSendCommand.setClassLoader(PeerAccessory.class.getClassLoader());
            if (bundleSendCommand.getInt(EXTRA_STATUS_CODE, -1) == 0) {
                arrayList = bundleSendCommand.getParcelableArrayList(EXTRA_CONNECTED_ACCESSORIES);
            }
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
        }
        return arrayList;
    }

    @Nullable
    public synchronized byte[] getLocalDeviceId() {
        byte[] byteArray;
        try {
            byteArray = sendCommand(this.mProxy, this.mClientId, 22, new Bundle()).getByteArray("extra_local_device_id");
            if (byteArray == null) {
                SdkLog.w(TAG, "getLocalDeviceId null");
            } else {
                SdkLog.d(TAG, "getLocalDeviceId success");
            }
        } catch (RemoteException e) {
            SdkLog.e(TAG, "getLocalDeviceId exception: " + e.getMessage());
            return null;
        }
        return byteArray;
    }

    public synchronized int getLocalDeviceType() throws RemoteException {
        return sendCommand(this.mProxy, this.mClientId, 23, new Bundle()).getInt(Constants.EXTRA_LOCAL_DEVICE_TYPE);
    }

    public synchronized List<ServiceProfile> getLocalRegisteredProfile() {
        Bundle bundleSendCommand;
        Bundle bundle = new Bundle();
        bundle.putString("packageName", sOnlyInstance.mContext.getPackageName());
        try {
            bundleSendCommand = sendCommand(this.mProxy, this.mClientId, 35, bundle);
            bundleSendCommand.setClassLoader(ServiceProfile.class.getClassLoader());
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: getLocalRegisteredProfile " + e.getMessage());
            return new ArrayList();
        }
        return bundleSendCommand.getParcelableArrayList(EXTRA_GET_LOCAL_REGISTERED_SERVICE_PROFILE);
    }

    public synchronized boolean hasBoundFramework() {
        return this.mProxy != null;
    }

    public synchronized boolean isAccessoryCallbackSet() {
        return sOnlyInstance.mAccessoryEventReceiver != null;
    }

    public synchronized boolean isAccessoryEnabled() {
        boolean z;
        z = false;
        try {
            int i = sendCommand(this.mProxy, this.mClientId, 31, new Bundle()).getInt(Constants.EXTRA_OAF_SWITCH_STATE, -1);
            SdkLog.d(TAG, "isQuickConnectSwitchOpened state:" + i);
            if (i != 0) {
                z = true;
            }
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: isQuickConnectSwitchOpened " + e.getMessage());
        }
        return z;
    }

    public synchronized boolean isSupportDynamicRegisterAgent() {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", sOnlyInstance.mContext.getPackageName());
        try {
            if (sendCommand(this.mProxy, this.mClientId, 35, bundle).getInt(EXTRA_STATUS_CODE, -1) == 0) {
                return true;
            }
        } catch (RemoteException e) {
            SdkLog.d(TAG, "exception: registerServiceProfile " + e.getMessage());
        }
        return false;
    }

    public synchronized boolean registerAccessoryCallback(ResultReceiver resultReceiver) {
        SdkLog.d(TAG, "Register callback");
        Bundle bundle = new Bundle();
        sOnlyInstance.mAccessoryEventReceiver = resultReceiver;
        bundle.putParcelable(EXTRA_RESULT_RECEIVER, prepareResultReceiver(resultReceiver));
        try {
            if (sendCommand(this.mProxy, this.mClientId, 6, bundle).getInt(EXTRA_STATUS_CODE, -1) == 0) {
                return true;
            }
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
        }
        return false;
    }

    public synchronized boolean registerServiceProfile(byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", sOnlyInstance.mContext.getPackageName());
        bundle.putByteArray(EXTRA_REGISTER_SERVICE_PROFILE, bArr);
        try {
            if (sendCommand(this.mProxy, this.mClientId, 33, bundle).getInt(EXTRA_STATUS_CODE, -1) == 0) {
                return true;
            }
        } catch (RemoteException e) {
            SdkLog.d(TAG, "exception: registerServiceProfile " + e.getMessage());
        }
        return false;
    }

    public synchronized void release() {
        Bundle bundle = new Bundle();
        if (sOnlyInstance.mProxy != null) {
            try {
                if (sendCommand(sOnlyInstance.mProxy, sOnlyInstance.mClientId, 5, bundle).getInt(EXTRA_STATUS_CODE, -1) == 0) {
                    SdkLog.d(TAG, "Framework connection terminated successfully.");
                }
            } catch (RemoteException e) {
                SdkLog.e(TAG, "exception: " + e.getMessage());
            }
            if (sOnlyInstance.mContext != null) {
                try {
                    sOnlyInstance.mContext.unbindService(sGenericConnection);
                } catch (Exception unused) {
                    SdkLog.e(TAG, "exception: unbind");
                }
            }
            sOnlyInstance.mProxy = null;
            sOnlyInstance.mClientId = -1L;
            sOnlyInstance.mAccessoryEventReceiver = null;
        }
    }

    public synchronized int removeKsc(byte[] bArr, byte[] bArr2) {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_DEVICE_ID, bArr);
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_KSC_ALIAS, bArr2);
        try {
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            return -1;
        }
        return sendCommand(this.mProxy, this.mClientId, 21, bundle).getInt(EXTRA_STATUS_CODE);
    }

    public synchronized int setAccessoryDormant(boolean z) {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBoolean(Constants.EXTRA_DORMANT_STATE, z);
        try {
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: connect " + e.getMessage());
            return -1;
        }
        return sendCommand(this.mProxy, this.mClientId, 11, bundle).getInt(EXTRA_STATUS_CODE);
    }

    public synchronized int setKsc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_DEVICE_ID, bArr);
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_KSC_ALIAS, bArr2);
        bundle.putByteArray(Constants.EXTRA_CONNECT_PARAM_KSC, bArr3);
        SdkLog.d(TAG, "adapter setKsc = " + bundle);
        try {
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            return -1;
        }
        return sendCommand(this.mProxy, this.mClientId, 9, bundle).getInt(EXTRA_STATUS_CODE);
    }

    public synchronized int setTrafficControlConfig(TrafficControlConfig trafficControlConfig) {
        Bundle bundle;
        bundle = trafficControlConfig.getBundle();
        SdkLog.d(TAG, "setTrafficControlConfig = " + trafficControlConfig);
        try {
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            return -1;
        }
        return sendCommand(this.mProxy, this.mClientId, 30, bundle).getInt(EXTRA_STATUS_CODE);
    }

    public synchronized boolean unRegisterServiceProfile() {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", sOnlyInstance.mContext.getPackageName());
        try {
            if (sendCommand(this.mProxy, this.mClientId, 34, bundle).getInt(EXTRA_STATUS_CODE, -1) == 0) {
                return true;
            }
        } catch (RemoteException e) {
            SdkLog.d(TAG, "exception: unRegisterServiceProfile " + e.getMessage());
        }
        return false;
    }

    public synchronized int disconnect(String str, int i, int i2) {
        int i3;
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TRANSPORT_ADDRESS, str);
        bundle.putInt(EXTRA_TRANSPORT_TYPE, i);
        bundle.putInt("uuid", i2);
        try {
            i3 = sendCommand(this.mProxy, this.mClientId, 3, bundle).getInt(EXTRA_STATUS_CODE);
        } catch (RemoteException e) {
            SdkLog.e(TAG, "exception: disconnect " + e.getMessage());
            i3 = -1;
        }
        return i3;
    }
}
