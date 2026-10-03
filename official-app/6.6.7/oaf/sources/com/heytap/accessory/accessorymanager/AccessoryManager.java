package com.heytap.accessory.accessorymanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.accessory.Config;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.api.GenericAdapter;
import com.heytap.accessory.bean.AccountInfo;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.HexUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AccessoryManager {
    public static final int ACCESSORY_DISCONNECTED_NETWORK_FAILURE = 258;
    public static final int ACCESSORY_DISCONNECTED_NORMAL = 257;
    public static final int ACCESSORY_DISCONNECTED_PACKET_CORRUPTION = 256;
    private static final String ACTION_ACCESSORY_ATTACHED = "android.accessory.device.action.ATTACHED";
    public static final String ACTION_ACCESSORY_ATTACHED_EVENT = "com.heytap.accessory.device.action.ACCESSORY_ATTACHED";
    private static final String ACTION_ACCESSORY_DETACHED = "android.accessory.device.action.DETACHED";
    public static final String ACTION_ACCESSORY_DETACHED_EVENT = "com.heytap.accessory.device.action.ACCESSORY_DETACHED";
    public static final int DEVICE_ATTACHED = 114;
    public static final int DEVICE_DETACHED = 115;
    public static final int DEVICE_STATE_CHANGED = 109;
    public static final int ERROR = 100;
    private static final int ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS = -1121;
    public static final int ERROR_FATAL = 20001;
    private static final int ERROR_NOT_SUPPORT = 3;
    private static final int ERROR_PERMISSION = 2;
    public static final String EXTRA_ACCESSORY = "accessory";
    private static final String EXTRA_ERROR_CODE = "errorcode";
    private static final int KCS_LENGTH_16 = 16;
    public static final int RETRY_MODE_DEFAULT = 0;
    public static final int RETRY_MODE_LIMITED = 1;
    public static final int RETRY_MODE_STICKY = 2;
    private static final int SOCKET_CONNECTION_REQUESTED = 0;
    private static final int SOCKET_DISCONNECTION_REQUESTED = 0;
    public static final int TRANSPORT_ALL = 255;
    public static final int TRANSPORT_BLE = 4;
    public static final int TRANSPORT_BT = 2;
    public static final int TRANSPORT_WIFI = 1;
    private static volatile AccessoryManager sOnlyInstance;
    private ConnectionEventReceiver mConnectionEventReceiver;
    private final Context mContext;
    private GenericAdapter mGenericAdapter;
    private boolean mIsConnected;
    private static final String VERSION = Config.getSdkVersionName();
    private static final String TAG = AccessoryManager.class.getSimpleName();

    public interface AccessoryEventListener {
        void onAccessoryConnected(PeerAccessory peerAccessory);

        void onAccessoryDisconnected(PeerAccessory peerAccessory, int i);

        void onAccessoryDormant(PeerAccessory peerAccessory, boolean z);

        void onError(@Nullable PeerAccessory peerAccessory, int i);
    }

    public static final class ConnectionEventReceiver extends ResultReceiver {
        private CopyOnWriteArrayList<ConnectConfig> mConnectConfigs;
        private AccessoryEventListener mEventCallback;

        public ConnectionEventReceiver(Handler handler, AccessoryEventListener accessoryEventListener) {
            super(handler);
            this.mConnectConfigs = new CopyOnWriteArrayList<>();
            this.mEventCallback = accessoryEventListener;
        }

        private boolean compareConfigAndAccessory(ConnectConfig connectConfig, PeerAccessory peerAccessory) {
            return connectConfig.getAddress().equals(peerAccessory.getAddress()) && connectConfig.getTransportType() == peerAccessory.getTransportType() && connectConfig.getUidType() == peerAccessory.getUUIDType();
        }

        public void addConnectConfig(ConnectConfig connectConfig) {
            for (ConnectConfig connectConfig2 : this.mConnectConfigs) {
                if (connectConfig2.getAddress().equals(connectConfig.getAddress()) && connectConfig2.getTransportType() == connectConfig.getTransportType() && connectConfig2.getUidType() == connectConfig.getUidType()) {
                    SdkLog.d(AccessoryManager.TAG, "connect config duplicate.....");
                    return;
                }
            }
            this.mConnectConfigs.add(connectConfig);
            SdkLog.d(AccessoryManager.TAG, "add config :" + connectConfig);
        }

        public void clearConnectConfig() {
            SdkLog.d(AccessoryManager.TAG, "clear connect config...");
            this.mConnectConfigs.clear();
        }

        public boolean isAccessoryConfigAvailable(PeerAccessory peerAccessory) {
            Iterator<ConnectConfig> it = this.mConnectConfigs.iterator();
            while (it.hasNext()) {
                if (compareConfigAndAccessory(it.next(), peerAccessory)) {
                    SdkLog.w(AccessoryManager.TAG, "accessory is available, notify...");
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (bundle == null) {
                SdkLog.w(AccessoryManager.TAG, "onReceiveResult: resultData is null");
                return;
            }
            SdkLog.d(AccessoryManager.TAG, " onReceiveResult: resultCode= " + i);
            PeerAccessory peerAccessoryCreateFromParcel = null;
            if (i == 20001) {
                SdkLog.w(AccessoryManager.TAG, "Accessory Framework has died or disconnected");
                if (AccessoryManager.sOnlyInstance != null) {
                    AccessoryManager.sOnlyInstance.mIsConnected = false;
                }
                clearConnectConfig();
                this.mEventCallback.onError(null, 20001);
                return;
            }
            bundle.setClassLoader(PeerAccessory.class.getClassLoader());
            byte[] byteArray = bundle.getByteArray(AccessoryManager.EXTRA_ACCESSORY);
            if (byteArray == null) {
                return;
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                if (parcelObtain != null) {
                    parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                    parcelObtain.setDataPosition(0);
                    peerAccessoryCreateFromParcel = PeerAccessory.CREATOR.createFromParcel(parcelObtain);
                    SdkLog.d(AccessoryManager.TAG, "onReceiveResult, peerAcc: " + peerAccessoryCreateFromParcel.toShortString());
                }
                if (parcelObtain != null) {
                    parcelObtain.recycle();
                }
                if (peerAccessoryCreateFromParcel == null) {
                    SdkLog.w(AccessoryManager.TAG, "onReceiveResult No accessory bundle, return...");
                    return;
                }
                if (this.mEventCallback == null) {
                    SdkLog.w(AccessoryManager.TAG, "onReceiveResult callback is null.");
                    return;
                }
                if (i == 109) {
                    String str = AccessoryManager.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append(" onReceiveResult: DEVICE_STATE_CHANGED: isDormant:");
                    sb.append(peerAccessoryCreateFromParcel.getStatus() == 1);
                    SdkLog.d(str, sb.toString());
                    this.mEventCallback.onAccessoryDormant(peerAccessoryCreateFromParcel, peerAccessoryCreateFromParcel.getStatus() == 1);
                    return;
                }
                if (i == 114) {
                    SdkLog.d(AccessoryManager.TAG, " onReceiveResult: DEVICE_ATTACHED uidType:" + peerAccessoryCreateFromParcel.getUUIDType());
                    this.mEventCallback.onAccessoryConnected(peerAccessoryCreateFromParcel);
                    return;
                }
                if (i == 115) {
                    int i2 = bundle.getInt("errorcode");
                    SdkLog.d(AccessoryManager.TAG, " onReceiveResult: DEVICE_DETACHED and error code 0x" + Integer.toHexString(i2) + " uidType:" + peerAccessoryCreateFromParcel.getUUIDType());
                    this.mEventCallback.onAccessoryDisconnected(peerAccessoryCreateFromParcel, i2);
                    removeConnectConfig(peerAccessoryCreateFromParcel);
                    return;
                }
                int i3 = bundle.getInt("errorcode");
                SdkLog.d(AccessoryManager.TAG, " onReceiveResult: onError and result code:" + i3);
                if (isAccessoryConfigAvailable(peerAccessoryCreateFromParcel)) {
                    this.mEventCallback.onError(peerAccessoryCreateFromParcel, i3);
                }
                if (i3 != -1121) {
                    removeConnectConfig(peerAccessoryCreateFromParcel);
                }
            } catch (Throwable th) {
                SdkLog.e(AccessoryManager.TAG, "unmarshalling peerAccessory failed", th);
            }
        }

        public void removeConnectConfig(PeerAccessory peerAccessory) {
            ArrayList arrayList = new ArrayList();
            for (ConnectConfig connectConfig : this.mConnectConfigs) {
                if (compareConfigAndAccessory(connectConfig, peerAccessory)) {
                    SdkLog.d(AccessoryManager.TAG, "remove connect config success.....");
                    arrayList.add(connectConfig);
                }
            }
            this.mConnectConfigs.removeAll(arrayList);
        }

        public void updateCallback(AccessoryEventListener accessoryEventListener) {
            if (accessoryEventListener == null) {
                this.mEventCallback = null;
            } else {
                if (accessoryEventListener.equals(this.mEventCallback)) {
                    return;
                }
                this.mEventCallback = accessoryEventListener;
            }
        }
    }

    private AccessoryManager(Context context, AccessoryEventListener accessoryEventListener) throws SdkUnsupportedException {
        this.mIsConnected = false;
        this.mContext = context;
        Initializer.initAFMAccessory(context);
        if (accessoryEventListener != null) {
            this.mConnectionEventReceiver = new ConnectionEventReceiver(null, accessoryEventListener);
        } else {
            SdkLog.d(TAG, "getInstance: eventCallback is null..");
        }
        if (this.mIsConnected) {
            if (accessoryEventListener != null) {
                this.mConnectionEventReceiver.updateCallback(accessoryEventListener);
                return;
            }
            return;
        }
        String str = TAG;
        SdkLog.d(str, "mOnlyInstance.mIsConnected is false");
        GenericAdapter genericAdapter = GenericAdapter.getInstance(context);
        this.mGenericAdapter = genericAdapter;
        if (genericAdapter == null) {
            this.mIsConnected = false;
            return;
        }
        this.mIsConnected = true;
        if (accessoryEventListener != null) {
            if (this.mConnectionEventReceiver == null) {
                this.mConnectionEventReceiver = new ConnectionEventReceiver(null, accessoryEventListener);
            }
            this.mGenericAdapter.registerAccessoryCallback(this.mConnectionEventReceiver);
            SdkLog.d(str, "registerAccessoryCallback.. if case");
        }
    }

    private void checkKscValid(byte[] bArr) throws IllegalArgumentException {
        if (bArr != null && bArr.length != 16) {
            throw new IllegalArgumentException("ksc length must be 16");
        }
    }

    private GenericAdapter getGenericAdapter() {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        return this.mGenericAdapter;
    }

    public static AccessoryManager getInstance(Context context, AccessoryEventListener accessoryEventListener) throws SdkUnsupportedException {
        if (context == null) {
            throw new IllegalArgumentException("Invalid argument input context.");
        }
        SdkLog.i(TAG, "AccessoryManager sdk version: " + VERSION);
        if (sOnlyInstance == null) {
            synchronized (AccessoryManager.class) {
                if (sOnlyInstance == null) {
                    sOnlyInstance = new AccessoryManager(context, accessoryEventListener);
                }
            }
        }
        return sOnlyInstance;
    }

    private void validateTransportDetails(String str, int i) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid transport address");
        }
        if (i != 1) {
            if (i != 2 && i != 4) {
                throw new IllegalArgumentException("Invalid transport type:" + i);
            }
            if (Pattern.compile("^([0-9A-F]{2}[:-]){5}([0-9A-F]{2})$").matcher(str).matches()) {
                return;
            }
            throw new IllegalArgumentException("Invalid BT Address:" + HexUtils.hide(str));
        }
    }

    public boolean checkKscExist(byte[] bArr, byte[] bArr2) throws IOException, IllegalArgumentException {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        int iCheckKscExist = this.mGenericAdapter.checkKscExist(bArr, bArr2);
        SdkLog.d(TAG, "checkKscExist, deviceId: " + HexUtils.hide(bArr) + ", alias: " + HexUtils.hide(bArr2) + ", result: " + iCheckKscExist);
        return iCheckKscExist == 0;
    }

    public void connect(@NonNull ConnectConfig connectConfig) throws IOException {
        validateTransportDetails(connectConfig.getAddress(), connectConfig.getTransportType());
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        ConnectionEventReceiver connectionEventReceiver = this.mConnectionEventReceiver;
        if (connectionEventReceiver != null) {
            this.mGenericAdapter.registerAccessoryCallback(connectionEventReceiver);
            this.mConnectionEventReceiver.addConnectConfig(connectConfig);
        }
        int iConnect = this.mGenericAdapter.connect(connectConfig);
        if (iConnect != 0) {
            if (iConnect != 3) {
                throw new IOException("Connect request failed");
            }
            SdkLog.e(TAG, "connect not support");
            return;
        }
        SdkLog.d(TAG, "Connect requested successfully for address:" + HexUtils.hide(connectConfig.getAddress()) + " Transport Type:" + connectConfig.getTransportType());
    }

    public void disconnect(String str, int i) throws IOException {
        disconnect(str, i, 0);
    }

    public List<AccountInfo> getAccountInfoArray() throws IOException {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        return this.mGenericAdapter.getAccountInfoList();
    }

    public List<ServiceProfile> getAvailableServices(long j) {
        SdkLog.d(TAG, "getAvailableServices,accessoryId:" + j);
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        return this.mGenericAdapter.getAvailableServices(j);
    }

    public List<PeerAccessory> getConnectedAccessories() {
        SdkLog.d(TAG, "getConnectedAccessories");
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        return this.mGenericAdapter.getConnectedAccessories();
    }

    public byte[] getLocalDeviceId() throws IOException {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        byte[] localDeviceId = this.mGenericAdapter.getLocalDeviceId();
        if (localDeviceId == null) {
            SdkLog.w(TAG, "loadLocalDeviceId is null");
        } else {
            SdkLog.i(TAG, "loadLocalDeviceId success");
        }
        return localDeviceId;
    }

    public int getLocalDeviceType() throws IOException {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        try {
            return this.mGenericAdapter.getLocalDeviceType();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    public List<ServiceProfile> getLocalRegisteredProfile() {
        SdkLog.d(TAG, "getLocalRegisteredProfile");
        return getGenericAdapter().getLocalRegisteredProfile();
    }

    public boolean hasBoundFramework() {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        return this.mGenericAdapter.hasBoundFramework();
    }

    public boolean isAccessoryEnabled() {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        return this.mGenericAdapter.isAccessoryEnabled();
    }

    public boolean isSupportDynamicRegisterAgent() {
        SdkLog.d(TAG, "isSupportDynamicRegisterAgent");
        return getGenericAdapter().isSupportDynamicRegisterAgent();
    }

    @Deprecated
    public byte[] loadLocalDeviceId() throws IOException {
        return getLocalDeviceId();
    }

    public boolean registerServiceProfile(byte[] bArr) {
        SdkLog.d(TAG, "registerServiceProfile");
        return getGenericAdapter().registerServiceProfile(bArr);
    }

    public void release() {
        SdkLog.d(TAG, "release");
        if (this.mIsConnected) {
            GenericAdapter genericAdapter = this.mGenericAdapter;
            if (genericAdapter != null) {
                genericAdapter.release();
            }
            this.mIsConnected = false;
            sOnlyInstance = null;
        }
    }

    public boolean removeKsc(byte[] bArr, byte[] bArr2) throws IOException, IllegalArgumentException {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        int iRemoveKsc = this.mGenericAdapter.removeKsc(bArr, bArr2);
        SdkLog.d(TAG, "checkKscExist, deviceId: " + HexUtils.hide(bArr) + ", alias: " + HexUtils.hide(bArr2) + ", result: " + iRemoveKsc);
        return iRemoveKsc == 0;
    }

    public synchronized boolean setAccessoryDormant(boolean z) {
        int accessoryDormant;
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        accessoryDormant = this.mGenericAdapter.setAccessoryDormant(z);
        if (accessoryDormant == 0) {
            SdkLog.i(TAG, "acc status successfully set");
        } else {
            SdkLog.w(TAG, "acc status set failed");
        }
        return accessoryDormant == 0;
    }

    public boolean setKsc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException, IllegalArgumentException {
        String str = TAG;
        SdkLog.d(str, "setKsc, " + HexUtils.hide(bArr3));
        checkKscValid(bArr3);
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        int ksc = this.mGenericAdapter.setKsc(bArr, bArr2, bArr3);
        if (ksc == 0) {
            SdkLog.i(str, "ksc successfully set");
        } else if (ksc == 4) {
            SdkLog.w(str, "ksc set duplicate: " + ksc);
        } else {
            SdkLog.w(str, "ksc set error: " + ksc);
        }
        return ksc == 0;
    }

    public int setTrafficControlConfig(TrafficControlConfig trafficControlConfig) throws IOException, IllegalArgumentException {
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        int trafficControlConfig2 = this.mGenericAdapter.setTrafficControlConfig(trafficControlConfig);
        if (trafficControlConfig2 == 0) {
            SdkLog.i(TAG, "setTrafficControlConfig success:" + trafficControlConfig);
        } else {
            SdkLog.w(TAG, "setTrafficControlConfig failed: " + trafficControlConfig2);
        }
        return trafficControlConfig2;
    }

    public boolean unRegisterServiceProfile() {
        SdkLog.d(TAG, "unRegisterServiceProfile");
        return getGenericAdapter().unRegisterServiceProfile();
    }

    public void disconnect(String str, int i, int i2) throws IOException {
        ConnectionEventReceiver connectionEventReceiver;
        String str2 = TAG;
        SdkLog.d(str2, "disconnect:" + HexUtils.hide(str) + " Transport:" + i + " UUID:" + i2);
        validateTransportDetails(str, i);
        if (this.mGenericAdapter == null) {
            this.mGenericAdapter = GenericAdapter.getInstance(this.mContext);
        }
        if (!this.mGenericAdapter.isAccessoryCallbackSet() && (connectionEventReceiver = this.mConnectionEventReceiver) != null) {
            this.mGenericAdapter.registerAccessoryCallback(connectionEventReceiver);
        }
        if (this.mGenericAdapter.disconnect(str, i, i2) != 0) {
            throw new IOException("Disconnect request failed");
        }
        SdkLog.d(str2, "Disconnect requested successfully for address:" + HexUtils.hide(str) + " Transport Type:" + i);
    }

    public boolean checkKscExist(byte[] bArr) throws IOException, IllegalArgumentException {
        return checkKscExist(null, bArr);
    }

    public boolean removeKsc(byte[] bArr) throws IOException, IllegalArgumentException {
        return removeKsc(null, bArr);
    }
}
