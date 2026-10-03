package com.heytap.accessory.platform;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.api.ICMDeathCallback;
import com.heytap.accessory.api.IGenFrameworkManager;
import com.heytap.accessory.authcode.AuthenticationManager;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.base.logging.a;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.connectivity.core.b;
import com.heytap.accessory.connectivity.core.c;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.misc.utils.g;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.sdp.endpoint.d;
import com.heytap.accessory.security.deviceId.DeviceIdFactory;
import com.heytap.accessory.security.deviceId.IDeviceIdFetcher;
import com.heytap.accessory.utils.HexUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class GenericServiceNative extends IGenFrameworkManager.Stub {
    private static final String EXTRA_ACCESSORY = "accessory";
    private static final String EXTRA_APPID = "appId";
    private static final String EXTRA_APPSECRET = "appSecret";
    private static final String EXTRA_AUTOCONNECT_MODE = "autoConnectMode";
    private static final String EXTRA_CC = "cc";
    private static final String EXTRA_CLIENT_ID = "clientId";
    private static final String EXTRA_CONNECTED_ACCESSORIES = "connectedAccessories";
    private static final String EXTRA_DATA_NETWORK = "dataNetwork";
    private static final String EXTRA_EMAIL = "email";
    private static final String EXTRA_ERROR_CODE = "errorcode";
    private static final String EXTRA_GET_LOCAL_REGISTERED_SERVICE_PROFILE = "get_local_registered_service_profile";
    private static final String EXTRA_GUID = "guid";
    private static final String EXTRA_MCC = "mcc";
    private static final String EXTRA_MNC = "mnc";
    private static final String EXTRA_PACKAGE_NAME = "packageName";
    private static final String EXTRA_REGISTER_SERVICE_PROFILE = "register_service_profile";
    private static final String EXTRA_REMOTE_SERVICES = "remoteServices";
    private static final String EXTRA_RESULT_RECEIVER = "resultReceiver";
    private static final String EXTRA_SDK_VERSION_CODE = "sdkVersionCode";
    private static final String EXTRA_STATUS_CODE = "statusCode";
    private static final String EXTRA_TARGET_APPID = "targetAppId";
    private static final String EXTRA_TOKEN = "token";
    private static final String EXTRA_TOKEN_SECRET = "tokenSecret";
    private static final String EXTRA_TRANSPORT_ADDRESS = "address";
    private static final String EXTRA_TRANSPORT_TYPE = "transportType";
    private static final String EXTRA_TRANSPORT_UUID = "uuid";
    private static final String EXTRA_XML_ARRAY = "xmlArray";
    private static final String ITEM_CACHE_CONCAT = "&";
    private static final String ITEM_CACHE_DELIMETER = ";";
    private static final long LONG_7FFFFFFF = 2147483647L;
    private final Context mContext;
    public static final ConcurrentHashMap<Long, GenericFwConnection> CONNECTION_MAP = new ConcurrentHashMap<>();
    private static final String TAG = GenericServiceNative.class.getSimpleName();
    private static final Object CLIENTELE_LOCK = new Object();
    private static RemoteCallbackList<ICMDeathCallback> sCMDeathCallBackList = new RemoteCallbackList<ICMDeathCallback>() { // from class: com.heytap.accessory.platform.GenericServiceNative.1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(ICMDeathCallback iCMDeathCallback, Object obj) {
            long jLongValue = ((Long) obj).longValue();
            synchronized (GenericServiceNative.CLIENTELE_LOCK) {
                GenericFwConnection genericFwConnection = GenericServiceNative.CONNECTION_MAP.get(Long.valueOf(jLongValue));
                if (genericFwConnection == null) {
                    a.b(GenericServiceNative.TAG, "Matching GenericFwConnection not found for proxyId : " + jLongValue);
                    return;
                }
                a.c(GenericServiceNative.TAG, "Package [" + genericFwConnection.getPackageName() + "] for CM has died!");
                b.e().a(genericFwConnection.mRemoteKeys);
                GenericServiceNative.sCMDeathCallBackList.unregister(iCMDeathCallback);
            }
        }
    };

    public GenericServiceNative(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PeerAccessory createPeerAccessory(com.heytap.accessory.base.bean.b bVar) {
        return com.heytap.accessory.sdk.a.a(bVar);
    }

    private Bundle getLocalRegisteredProfile(Bundle bundle) {
        String string = bundle.getString("packageName", "");
        a.c(TAG, "getLocalRegisteredProfile, packageName=" + string);
        ArrayList<ServiceProfile> localRegisteredProfile = FrameworkService.getLocalRegisteredProfile(string);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList(EXTRA_GET_LOCAL_REGISTERED_SERVICE_PROFILE, localRegisteredProfile);
        bundle2.putInt("statusCode", 0);
        return bundle2;
    }

    private long getUniqueId() {
        long jCurrentTimeMillis;
        do {
            jCurrentTimeMillis = System.currentTimeMillis() & LONG_7FFFFFFF;
        } while (CONNECTION_MAP.containsKey(Long.valueOf(jCurrentTimeMillis)));
        return jCurrentTimeMillis;
    }

    private Bundle registerServiceProfileDynamic(Bundle bundle) {
        String string = bundle.getString("packageName", "");
        a.c(TAG, "registerServiceProfileDynamic, packageName=" + string);
        boolean zRegisterServiceProfileDynamic = FrameworkService.registerServiceProfileDynamic(string, bundle.getByteArray(EXTRA_REGISTER_SERVICE_PROFILE));
        Bundle bundle2 = new Bundle();
        bundle2.putInt("statusCode", !zRegisterServiceProfileDynamic ? 1 : 0);
        return bundle2;
    }

    private Bundle unRegisterServiceProfileDynamic(Bundle bundle) {
        String string = bundle.getString("packageName", "");
        a.c(TAG, "unRegisterServiceProfileDynamic, packageName=" + string);
        boolean zUnRegisterServiceProfileDynamic = FrameworkService.unRegisterServiceProfileDynamic(string);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("statusCode", !zUnRegisterServiceProfileDynamic ? 1 : 0);
        return bundle2;
    }

    public Bundle generateErrorBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("statusCode", 1);
        return bundle;
    }

    @Override // com.heytap.accessory.api.IGenFrameworkManager
    public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
        return AuthenticationManager.checkPermission(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), str, false);
    }

    public Bundle makeFrameworkConnection(Bundle bundle) {
        List<String> remoteKeys;
        Bundle bundle2;
        synchronized (this) {
            String string = bundle.getString("packageName");
            int i = bundle.getInt("sdkVersionCode", 1);
            byte[] byteArray = bundle.getByteArray(EXTRA_XML_ARRAY);
            if (byteArray != null) {
                com.heytap.accessory.sdk.accessorymanager.b.a(this.mContext, byteArray, string);
            } else {
                a.c(TAG, "No Xml file for policy recieved. Proceeding without parsing xml.");
            }
            Iterator<Map.Entry<Long, GenericFwConnection>> it = CONNECTION_MAP.entrySet().iterator();
            while (true) {
                remoteKeys = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Long, GenericFwConnection> next = it.next();
                GenericFwConnection value = next.getValue();
                if (value != null && value.mPackageName.equals(string)) {
                    a.c(TAG, "Clearing an exisitng GenericFwConnection for package : " + string);
                    try {
                        remoteKeys = value.getRemoteKeys();
                        if (next.getKey() != null) {
                            CONNECTION_MAP.remove(next.getKey());
                        }
                        value.unregisterAccessoryCallback();
                        break;
                    } catch (Exception e2) {
                        a.b(TAG, "makeFrameworkConnection" + e2);
                        break;
                    }
                }
            }
            long uniqueId = getUniqueId();
            if (remoteKeys == null) {
                CONNECTION_MAP.put(Long.valueOf(uniqueId), new GenericFwConnection(string, this.mContext, i));
            } else {
                ConcurrentHashMap<Long, GenericFwConnection> concurrentHashMap = CONNECTION_MAP;
                Long lValueOf = Long.valueOf(uniqueId);
                ArrayList arrayList = new ArrayList(remoteKeys);
                a.a(TAG, "GenericFwConnection2 arrayList=" + arrayList);
                concurrentHashMap.put(lValueOf, new GenericFwConnection(string, this.mContext, i, arrayList));
            }
            List<String> listA = com.heytap.accessory.connectivity.core.util.a.a(string);
            String str = TAG;
            a.d(str, "Address retrieved from cache. (size : " + listA.size() + ")");
            if (!listA.isEmpty()) {
                CONNECTION_MAP.get(Long.valueOf(uniqueId)).setKeysFromCache(listA);
            }
            bundle2 = new Bundle();
            bundle2.putLong("clientId", uniqueId);
            a.d(str, "New GenericFwConnection Id:" + uniqueId + " " + string + " , " + i);
        }
        return bundle2;
    }

    @Override // com.heytap.accessory.api.IGenFrameworkManager
    public void registerDeathCallback(long j2, ICMDeathCallback iCMDeathCallback) throws RemoteException {
        if (iCMDeathCallback != null) {
            String appName = iCMDeathCallback.getAppName();
            if (j2 != -1) {
                synchronized (CLIENTELE_LOCK) {
                    if (CONNECTION_MAP.get(Long.valueOf(j2)) == null) {
                        a.b(TAG, "Matching GenericFwConnection not found while registering the death callback for " + appName);
                    } else {
                        a.c(TAG, "Registering Death CallBack for CM," + appName);
                        sCMDeathCallBackList.register(iCMDeathCallback, Long.valueOf(j2));
                    }
                }
            }
        }
    }

    public Bundle removeConnection(long j2) {
        Bundle bundle = new Bundle();
        GenericFwConnection genericFwConnectionRemove = CONNECTION_MAP.remove(Long.valueOf(j2));
        if (genericFwConnectionRemove != null) {
            genericFwConnectionRemove.unregisterAccessoryCallback();
            genericFwConnectionRemove.mRemoteKeys.clear();
            synchronized (GenericFwConnection.RUNNABLE_LOCK) {
                genericFwConnectionRemove.mReconnectRunnables.clear();
            }
        }
        a.c(TAG, "Removed GenericFwConnection for clientId : " + j2);
        bundle.putInt("statusCode", 0);
        return bundle;
    }

    @Override // com.heytap.accessory.api.IGenFrameworkManager
    public Bundle sendCommand(long j2, int i, Bundle bundle) throws RemoteException {
        AuthenticationManager.checkPermission(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), "com.heytap.accessory.permission.PREROGATIVE", true);
        if (bundle == null) {
            a.b(TAG, "bundle received is null !!! ");
            return generateErrorBundle();
        }
        String str = TAG;
        a.a(str, "sendCommand, clientId: " + j2 + " commandId: " + i);
        GenericFwConnection genericFwConnection = CONNECTION_MAP.get(Long.valueOf(j2));
        if (i == 1) {
            return makeFrameworkConnection(bundle);
        }
        if (genericFwConnection == null) {
            a.b(str, "Invalid client ID : " + j2);
        } else {
            if (i == 30) {
                return genericFwConnection.setTrafficControlConfig(bundle);
            }
            switch (i) {
                case 2:
                case 8:
                    return genericFwConnection.connect(bundle);
                case 3:
                    return genericFwConnection.disconnect(bundle);
                case 4:
                    return genericFwConnection.getConnectedAccessories();
                case 5:
                    return removeConnection(j2);
                case 6:
                    return genericFwConnection.registerAccessoryCallback(bundle);
                case 7:
                    return genericFwConnection.setAccount(bundle);
                case 9:
                    return genericFwConnection.setKsc(bundle);
                case 10:
                    return genericFwConnection.getAccountInfoArray(bundle);
                case 11:
                    return genericFwConnection.setAccessoryStatus(bundle);
                case 12:
                    return genericFwConnection.getAvailableServices(bundle);
                case 13:
                    return genericFwConnection.startTransportServer(bundle);
                case 14:
                    return genericFwConnection.stopTransportServer(bundle);
                default:
                    switch (i) {
                        case 20:
                            return genericFwConnection.checkKscExist(bundle);
                        case 21:
                            return genericFwConnection.removeKsc(bundle);
                        case 22:
                            return genericFwConnection.getLocalDeviceId();
                        case 23:
                            return genericFwConnection.getLocalDeviceType();
                        default:
                            switch (i) {
                                case 33:
                                    return registerServiceProfileDynamic(bundle);
                                case 34:
                                    return unRegisterServiceProfileDynamic(bundle);
                                case 35:
                                    return getLocalRegisteredProfile(bundle);
                                default:
                                    a.e(str, "Invalid Command ID : " + i + " from client:" + j2);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        return generateErrorBundle();
    }

    public static class GenericFwConnection {
        private static final int MAX_RETRY_LIMIT = 3;
        private static final int RECONNECT_TIME = 2000;
        private ResultReceiver mConnectionReceiver;
        private final Context mContext;
        private final String mPackageName;
        private final SparseArray<ConnectTask> mReconnectRunnables = new SparseArray<>();
        private final List<String> mRemoteKeys;
        private final int mSdkVersionCode;
        private static final Object RUNNABLE_LOCK = new Object();
        private static final Object RECEIVER_LOCK = new Object();

        public static class ConnectTask implements Runnable {
            public static final int ATTEMPTS_3 = 3;
            public static final int DELAY_2000_MILLIS = 2000;
            public static final int FLAGS_255 = 255;
            public String mAddress;
            public int mAttempts;
            public int mConnectivity;
            private WeakReference<GenericFwConnection> mGnFwConnRef;
            public String mPackageName;
            public int mRetryMode;

            public ConnectTask(GenericFwConnection genericFwConnection, String str, int i, int i2, int i3, String str2) {
                this.mGnFwConnRef = new WeakReference<>(genericFwConnection);
                this.mAddress = str;
                this.mPackageName = str2;
                this.mConnectivity = i;
                this.mRetryMode = i2;
                this.mAttempts = i3;
            }

            @Override // java.lang.Runnable
            public void run() {
                GenericFwConnection genericFwConnection = this.mGnFwConnRef.get();
                if (genericFwConnection == null) {
                    a.e(GenericServiceNative.TAG, "GenericFwConnection instance already garbage collected!");
                    return;
                }
                if (!genericFwConnection.getSACapabilityManagerInstance().a(255, "/system/bcmservice").isEmpty()) {
                    synchronized (GenericFwConnection.RUNNABLE_LOCK) {
                        genericFwConnection.mReconnectRunnables.remove(this.mConnectivity);
                    }
                    genericFwConnection.getDiscoveryNative().a(this.mConnectivity, this.mAddress, this.mRetryMode);
                    return;
                }
                int i = this.mAttempts + 1;
                this.mAttempts = i;
                if (i > 3) {
                    a.e(GenericServiceNative.TAG, "Timed out waiting for bcmservice to register! giving up...");
                    synchronized (GenericFwConnection.RUNNABLE_LOCK) {
                        genericFwConnection.mReconnectRunnables.remove(this.mConnectivity);
                    }
                    genericFwConnection.notifyConnectionEvent(-1610612731, new com.heytap.accessory.base.bean.b(this.mAddress, this.mConnectivity), -1113);
                    return;
                }
                ConnectTask connectTask = new ConnectTask(genericFwConnection, this.mAddress, this.mConnectivity, this.mRetryMode, i, this.mPackageName);
                synchronized (GenericFwConnection.RUNNABLE_LOCK) {
                    genericFwConnection.mReconnectRunnables.put(this.mConnectivity, connectTask);
                }
                b.d().postDelayed(connectTask, ((long) this.mAttempts) * 2000);
                a.e(GenericServiceNative.TAG, "bcmservice is NOT registered yet! re-scheduled connect after " + (this.mAttempts * 2000) + "ms.");
            }
        }

        public GenericFwConnection(String str, Context context, int i) {
            this.mPackageName = str;
            this.mContext = context;
            this.mSdkVersionCode = i;
            String[] addressAndConnTypeFromPref = getAddressAndConnTypeFromPref();
            if (addressAndConnTypeFromPref != null) {
                this.mRemoteKeys = new CopyOnWriteArrayList(Arrays.asList(addressAndConnTypeFromPref));
            } else {
                this.mRemoteKeys = new CopyOnWriteArrayList();
            }
        }

        private void appendAddressAndConnTypeToPref(String str) {
            SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.PREFERENCES_FILES, 0);
            String string = sharedPreferences.getString(this.mPackageName, null);
            if (string != null) {
                for (String str2 : string.split(";")) {
                    if (str2.equals(str)) {
                        return;
                    }
                }
            } else {
                string = "";
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(this.mPackageName, string + str + ";");
            editorEdit.apply();
        }

        private String[] getAddressAndConnTypeFromPref() {
            String string = PlatformUtils.getSharedPreferences(PlatformUtils.PREFERENCES_FILES, 0).getString(this.mPackageName, null);
            if (string != null) {
                return string.split(";");
            }
            return null;
        }

        public Bundle checkKscExist(Bundle bundle) {
            byte[] byteArray = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_DEVICE_ID);
            byte[] byteArray2 = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_KSC_ALIAS);
            boolean zA = com.heytap.accessory.security.ksc.b.a().a(HexUtils.byteArrayToHexStr(byteArray), HexUtils.byteArrayToHexStr(byteArray2));
            int i = zA ? 0 : 5;
            a.a(GenericServiceNative.TAG + " - kscTrack", "native checkKscExist deviceId = " + SensitiveLogUtils.toHiddenIfNeed(byteArray) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(byteArray2) + "; result = " + zA);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("statusCode", i);
            return bundle2;
        }

        public Bundle connect(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            if (!FrameworkInitializer.isSupportOaf()) {
                bundle2.putInt("statusCode", 3);
                return bundle2;
            }
            ConnectConfig connectConfigCreateFromBundle = ConnectConfig.createFromBundle(bundle);
            if (connectConfigCreateFromBundle == null) {
                a.b(GenericServiceNative.TAG, "connect config is empty!");
                bundle2.putInt("statusCode", 1);
                return bundle2;
            }
            int transportType = connectConfigCreateFromBundle.getTransportType();
            String address = connectConfigCreateFromBundle.getAddress();
            int retryMode = connectConfigCreateFromBundle.getRetryMode();
            int uidType = connectConfigCreateFromBundle.getUidType();
            if (TextUtils.isEmpty(address)) {
                a.b(GenericServiceNative.TAG, "connect address is empty!");
                bundle2.putInt("statusCode", 1);
                return bundle2;
            }
            g.b(address, "CLIENT");
            a.a(GenericServiceNative.TAG, this.mPackageName + " # " + transportType + " # " + retryMode + " # " + uidType);
            String strB = com.heytap.accessory.connectivity.core.util.a.b(address, transportType, uidType);
            if (!this.mRemoteKeys.contains(strB)) {
                this.mRemoteKeys.add(strB);
            }
            getDiscoveryNative().a(connectConfigCreateFromBundle);
            bundle2.putInt("statusCode", 0);
            return bundle2;
        }

        public boolean containsKey(String str) {
            return this.mRemoteKeys.contains(str);
        }

        public Bundle disconnect(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            if (FrameworkInitializer.isSupportOaf()) {
                int i = bundle.getInt(GenericServiceNative.EXTRA_TRANSPORT_TYPE);
                getDiscoveryNative().b(new ConnectConfig(bundle.getString("address"), i, 0, bundle.getInt("uuid")));
                bundle2.putInt("statusCode", 0);
            } else {
                bundle2.putInt("statusCode", 3);
            }
            return bundle2;
        }

        public AccessoryManager getAccessoryManager() {
            return AccessoryManager.h();
        }

        public Bundle getAccountInfoArray(Bundle bundle) {
            return new Bundle();
        }

        public Bundle getAvailableServices(Bundle bundle) {
            long j2 = bundle.getLong(FrameworkServiceConstants.EXTRA_ACCESSORY_ID, 0L);
            a.a(GenericServiceNative.TAG, "getAvailableServices accessoryId:" + j2);
            Bundle bundle2 = new Bundle();
            List<com.heytap.accessory.base.bean.b> listB = getAccessoryManager().b(255);
            List<FrameworkServiceDescription> arrayList = new ArrayList<>();
            for (com.heytap.accessory.base.bean.b bVar : listB) {
                if (j2 == bVar.l()) {
                    a.a(GenericServiceNative.TAG, "current accessory uuid:" + bVar.F());
                    bVar.a();
                    arrayList = bVar.x();
                    break;
                }
            }
            bundle2.putParcelableArrayList(GenericServiceNative.EXTRA_REMOTE_SERVICES, com.heytap.accessory.sdk.a.a(arrayList));
            bundle2.putInt("statusCode", 0);
            return bundle2;
        }

        public Bundle getConnectedAccessories() {
            List<com.heytap.accessory.base.bean.b> listB = getAccessoryManager().b(255);
            Bundle bundle = new Bundle();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<com.heytap.accessory.base.bean.b> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(GenericServiceNative.createPeerAccessory(it.next()));
            }
            bundle.putParcelableArrayList(GenericServiceNative.EXTRA_CONNECTED_ACCESSORIES, arrayList);
            bundle.putInt("statusCode", 0);
            return bundle;
        }

        public c getDiscoveryNative() {
            return c.b();
        }

        @WorkerThread
        public Bundle getLocalDeviceId() {
            IDeviceIdFetcher iDeviceIdFetcher = DeviceIdFactory.getIDeviceIdFetcher();
            Bundle bundle = new Bundle();
            if (iDeviceIdFetcher == null) {
                a.b(GenericServiceNative.TAG, "getLocalDeviceId failed, fetcher is null.");
                return bundle;
            }
            byte[] bArrLoadDeviceId = iDeviceIdFetcher.loadDeviceId(PlatformUtils.getContext());
            a.a(GenericServiceNative.TAG, "getLocalDeviceId: " + HexUtils.hide(bArrLoadDeviceId));
            bundle.putByteArray("extra_local_device_id", bArrLoadDeviceId);
            return bundle;
        }

        @WorkerThread
        public Bundle getLocalDeviceType() {
            d dVarD = com.heytap.accessory.sdp.endpoint.b.d();
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.EXTRA_LOCAL_DEVICE_TYPE, dVarD.d());
            return bundle;
        }

        public String getPackageName() {
            return this.mPackageName;
        }

        public List<String> getRemoteKeys() {
            return this.mRemoteKeys;
        }

        public com.heytap.accessory.sdp.service.b getSACapabilityManagerInstance() {
            return com.heytap.accessory.sdp.service.b.g();
        }

        public void notifyConnectionEvent(int i, com.heytap.accessory.base.bean.b bVar, int i2) {
            a.c(GenericServiceNative.TAG, "notifyConnectionEvent: action: " + i + " errorCode: " + i2 + " to: " + getPackageName());
            Bundle bundle = new Bundle();
            if (bVar != null) {
                PeerAccessory peerAccessoryCreatePeerAccessory = GenericServiceNative.createPeerAccessory(bVar);
                a.a(GenericServiceNative.TAG, "mSdkVersionCode:" + this.mSdkVersionCode + ", peerAcc: " + peerAccessoryCreatePeerAccessory.toShortString());
                if (this.mSdkVersionCode == 20201) {
                    bundle.putParcelable("accessory", peerAccessoryCreatePeerAccessory);
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    peerAccessoryCreatePeerAccessory.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    bundle.putByteArray("accessory", parcelObtain.marshall());
                    parcelObtain.recycle();
                }
            } else {
                a.b(GenericServiceNative.TAG, new Throwable("notifyConnectionEvent but accessory param is null"));
            }
            bundle.putInt("errorcode", i2);
            synchronized (RECEIVER_LOCK) {
                ResultReceiver resultReceiver = this.mConnectionReceiver;
                if (resultReceiver == null) {
                    a.e(GenericServiceNative.TAG, "notifyConnectionEvent mConnectionReceiver is null, return... ");
                } else {
                    resultReceiver.send(i, bundle);
                }
            }
        }

        public Bundle registerAccessoryCallback(Bundle bundle) {
            synchronized (RECEIVER_LOCK) {
                this.mConnectionReceiver = (ResultReceiver) bundle.get(GenericServiceNative.EXTRA_RESULT_RECEIVER);
            }
            a.c(GenericServiceNative.TAG, "Accessory callback regitered " + this.mPackageName);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("statusCode", 0);
            a.a(GenericServiceNative.TAG, "register complete, notify the connected accessories right now");
            Iterator<com.heytap.accessory.base.bean.b> it = getAccessoryManager().b(255).iterator();
            while (it.hasNext()) {
                notifyConnectionEvent(114, it.next(), 0);
            }
            return bundle2;
        }

        public synchronized Bundle removeKsc(Bundle bundle) {
            Bundle bundle2;
            byte[] byteArray = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_DEVICE_ID);
            byte[] byteArray2 = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_KSC_ALIAS);
            com.heytap.accessory.security.ksc.b.a().c(HexUtils.byteArrayToHexStr(byteArray), HexUtils.byteArrayToHexStr(byteArray2));
            a.a(GenericServiceNative.TAG + " - kscTrack", "native removeKsc deviceId = " + SensitiveLogUtils.toHiddenIfNeed(byteArray) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(byteArray2) + "; result = 0");
            bundle2 = new Bundle();
            bundle2.putInt("statusCode", 0);
            return bundle2;
        }

        public Bundle setAccessoryStatus(Bundle bundle) {
            a.c(GenericServiceNative.TAG, "setAccessoryStatus " + this.mPackageName);
            Bundle bundle2 = new Bundle();
            b.e().a(bundle.getBoolean(Constants.EXTRA_DORMANT_STATE, false));
            bundle2.putInt("statusCode", 0);
            return bundle2;
        }

        public Bundle setAccount(Bundle bundle) {
            return new Bundle();
        }

        public void setKeysFromCache(List<String> list) {
            for (String str : list) {
                a.c(GenericServiceNative.TAG, "Add address and transport to cache : " + str);
                this.mRemoteKeys.add(str);
            }
        }

        public synchronized Bundle setKsc(Bundle bundle) {
            int i;
            Bundle bundle2;
            a.a(GenericServiceNative.TAG, "setKsc params = " + bundle);
            byte[] byteArray = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_KSC);
            byte[] byteArray2 = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_DEVICE_ID);
            byte[] byteArray3 = bundle.getByteArray(Constants.EXTRA_CONNECT_PARAM_KSC_ALIAS);
            a.a(GenericServiceNative.TAG + " - kscTrack", "native setKsc deviceId = " + SensitiveLogUtils.toHiddenIfNeed(byteArray2) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(byteArray3) + "; ksc = " + SensitiveLogUtils.toHiddenIfNeed(byteArray));
            try {
                i = com.heytap.accessory.security.ksc.b.a().a(HexUtils.byteArrayToHexStr(byteArray2), HexUtils.byteArrayToHexStr(byteArray3), byteArray) ? 0 : 4;
            } catch (com.heytap.accessory.security.ksc.a e2) {
                a.e(GenericServiceNative.TAG, "saveKsc failed," + e2);
                i = 3;
            }
            bundle2 = new Bundle();
            bundle2.putInt("statusCode", i);
            return bundle2;
        }

        public synchronized Bundle setTrafficControlConfig(Bundle bundle) {
            TrafficControlConfig trafficControlConfigCreateFromBundle = TrafficControlConfig.createFromBundle(bundle);
            a.a(GenericServiceNative.TAG + " - TCTrack", "setTrafficControlConfig = " + trafficControlConfigCreateFromBundle);
            Bundle bundle2 = new Bundle();
            if (trafficControlConfigCreateFromBundle == null) {
                bundle2.putInt("statusCode", 1);
                return bundle2;
            }
            com.heytap.accessory.transport.control.c.a(trafficControlConfigCreateFromBundle);
            new Bundle().putInt("statusCode", 0);
            return bundle2;
        }

        public synchronized Bundle startTransportServer(@NonNull Bundle bundle) {
            Bundle bundle2;
            boolean zA = b.e().a(bundle.getInt(Constants.EXTRA_SERVER_CONNECT_FLAG));
            bundle2 = new Bundle();
            bundle2.putInt("statusCode", zA ? 0 : -1);
            return bundle2;
        }

        public synchronized Bundle stopTransportServer(@NonNull Bundle bundle) {
            Bundle bundle2;
            b.e().b(bundle.getInt(Constants.EXTRA_SERVER_CONNECT_FLAG));
            bundle2 = new Bundle();
            bundle2.putInt("statusCode", 0);
            return bundle2;
        }

        public void unregisterAccessoryCallback() {
            synchronized (RECEIVER_LOCK) {
                this.mConnectionReceiver = null;
            }
            a.c(GenericServiceNative.TAG, "Accessory callback Un-regitered " + this.mPackageName);
        }

        public GenericFwConnection(String str, Context context, int i, ArrayList<String> arrayList) {
            this.mPackageName = str;
            this.mContext = context;
            this.mSdkVersionCode = i;
            this.mRemoteKeys = arrayList;
        }
    }
}
