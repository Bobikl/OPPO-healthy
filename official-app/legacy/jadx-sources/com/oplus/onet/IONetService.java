package com.oplus.onet;

import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.oplus.onet.callback.IAbilityCallback;
import com.oplus.onet.callback.IAccountStateCallback;
import com.oplus.onet.callback.ILinkManager;
import com.oplus.onet.callback.INearbyDevicesCallback;
import com.oplus.onet.callback.IONetAdvertiseCallback;
import com.oplus.onet.callback.IONetScanCallback;
import com.oplus.onet.callback.IP2pStateCallback;
import com.oplus.onet.callback.IPermissionCallback;
import com.oplus.onet.callback.IQosObserver;
import com.oplus.onet.callback.IQrCodeMessageCallback;
import com.oplus.onet.callback.ISenselessConnectionCallback;
import com.oplus.onet.dbr.IDbrEventCallback;
import com.oplus.onet.dbr.IFileTransferResultCallback;
import com.oplus.onet.dbr.IResultCallback;
import com.oplus.onet.dbs.DbsMessage;
import com.oplus.onet.dbs.IDbsEventCallback;
import com.oplus.onet.dbs.ONetTopic;
import com.oplus.onet.device.ONetDevice;
import com.oplus.onet.lan.SocketQos;
import com.oplus.onet.link.ONetConnectOption;
import com.oplus.onet.wrapper.ONetAdvertiseSetting;
import com.oplus.onet.wrapper.ONetScanOption;
import com.oplus.onet.wrapper.QrCodeRequestOption;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IONetService extends IInterface {

    public static class Default implements IONetService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final void cancelConnect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void cancelFile(String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final boolean checkDiscoverability(int i) throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final boolean checkLocalAbility(String str, int i) throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final boolean checkRemoteAbility(byte[] bArr, String str, int i) throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final void checkShowPermissionStatement(IPermissionCallback iPermissionCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void confirmConnectRequest(ONetDevice oNetDevice, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void connect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final ONetDevice createDefaultDevice() throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final ONetDevice createDefaultDeviceWithType(int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final void createPublisher(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void createSubscriber(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void deInit() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void disconnect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void enableConnectionHolding(String str, int i, boolean z) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void enableDiscoverability(int i, boolean z) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final Intent getAccountLoginIntent() throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final List<ONetDevice> getCachedDevices(ONetScanOption oNetScanOption) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final List<ONetDevice> getCachedDevicesByAbility(int i, List<String> list, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final List<ONetDevice> getCachedDevicesByAbilityEx(int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final List<ONetDevice> getCachedDevicesWithBundle(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final int getConnectionStatus(ONetDevice oNetDevice, int i) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.IONetService
        public final ONetDevice getDeviceById(byte[] bArr) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final List<ONetDevice> getDevices(int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final int getLocalAppId(String str, int i) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.IONetService
        public final ONetDevice getLocalDevice() throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final String getLocalFullAbility(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final int getLocalP2pStatus() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.IONetService
        public final Bundle getLocalServiceProfile(String str, String str2, String str3, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final void getQrCodeMessage(QrCodeRequestOption qrCodeRequestOption, IQrCodeMessageCallback iQrCodeMessageCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final SocketQos getSocketQos(int i, String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final int getSocketScore(int i, String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.IONetService
        public final void init(ILinkManager iLinkManager) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final boolean isAccountLogin() throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final boolean isDeviceDiscoverable(int i) throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final void publish(DbsMessage dbsMessage, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void queryAccountLoginStatusOnline(IAccountStateCallback iAccountStateCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void receiveFile(String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void registerContinuousSearch(ONetScanOption oNetScanOption, IONetScanCallback iONetScanCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void registerNearbyDevicesChanged(INearbyDevicesCallback iNearbyDevicesCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void registerP2pStateChanged(IP2pStateCallback iP2pStateCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void registerQosObserver(IQosObserver iQosObserver) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void removePublisher(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void removeSenselessConnectionCallback() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void removeSubscriber(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final Bundle request(String str, String str2, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final void resetConnection(ONetDevice oNetDevice, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void savePeripheralModelId(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void sendCmd(int i, String str, ResultReceiver resultReceiver) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void setAbilityCallback(IAbilityCallback iAbilityCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void setDevicesDiscoverable(int[] iArr, boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void setPassiveCallbackState(boolean z) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void setSenselessConnectionCallback(ISenselessConnectionCallback iSenselessConnectionCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final boolean startAdvertise(ONetAdvertiseSetting oNetAdvertiseSetting, IONetAdvertiseCallback iONetAdvertiseCallback) throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final void startScan(ONetScanOption oNetScanOption, IONetScanCallback iONetScanCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final boolean stopAdvertise() throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final boolean stopCertainAdvertise(IONetAdvertiseCallback iONetAdvertiseCallback) throws RemoteException {
            return false;
        }

        @Override // com.oplus.onet.IONetService
        public final void stopCertainScan(IONetScanCallback iONetScanCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void stopScan() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void syncData(String str) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_broadCastMsg(byte[] bArr, IResultCallback iResultCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_cancelFile(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final List<String> test_getAttachedDevices() throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final List<String> test_getNeighborDevices() throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.IONetService
        public final void test_receiveFile(String str, Uri uri) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_registerDbrEventCallback(IDbrEventCallback iDbrEventCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_rejectFile(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_release() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_sendFile(String str, String str2, Uri uri, IFileTransferResultCallback iFileTransferResultCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void test_sendMsg(List<String> list, int i, byte[] bArr, IResultCallback iResultCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void unRegisterP2pStateChanged() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void unregisterContinuousSearch() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void unregisterNearbyDevicesChanged() throws RemoteException {
        }

        @Override // com.oplus.onet.IONetService
        public final void unregisterQosObserver(IQosObserver iQosObserver) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IONetService {
        private static final String DESCRIPTOR = "com.oplus.onet.IONetService";
        public static final int TRANSACTION_cancelConnect = 1014;
        public static final int TRANSACTION_cancelFile = 2006;
        public static final int TRANSACTION_checkDiscoverability = 1031;
        public static final int TRANSACTION_checkLocalAbility = 1005;
        public static final int TRANSACTION_checkRemoteAbility = 1006;
        public static final int TRANSACTION_checkShowPermissionStatement = 1016;
        public static final int TRANSACTION_confirmConnectRequest = 1015;
        public static final int TRANSACTION_connect = 1012;
        public static final int TRANSACTION_createDefaultDevice = 1032;
        public static final int TRANSACTION_createDefaultDeviceWithType = 1033;
        public static final int TRANSACTION_createPublisher = 2001;
        public static final int TRANSACTION_createSubscriber = 2004;
        public static final int TRANSACTION_deInit = 1051;
        public static final int TRANSACTION_disconnect = 1013;
        public static final int TRANSACTION_enableConnectionHolding = 2013;
        public static final int TRANSACTION_enableDiscoverability = 1030;
        public static final int TRANSACTION_getAccountLoginIntent = 1053;
        public static final int TRANSACTION_getCachedDevices = 1009;
        public static final int TRANSACTION_getCachedDevicesByAbility = 1007;
        public static final int TRANSACTION_getCachedDevicesByAbilityEx = 1008;
        public static final int TRANSACTION_getCachedDevicesWithBundle = 1042;
        public static final int TRANSACTION_getConnectionStatus = 1037;
        public static final int TRANSACTION_getDeviceById = 1002;
        public static final int TRANSACTION_getDevices = 1003;
        public static final int TRANSACTION_getLocalAppId = 1004;
        public static final int TRANSACTION_getLocalDevice = 1001;
        public static final int TRANSACTION_getLocalFullAbility = 1038;
        public static final int TRANSACTION_getLocalP2pStatus = 2014;
        public static final int TRANSACTION_getLocalServiceProfile = 1041;
        public static final int TRANSACTION_getQrCodeMessage = 1045;
        public static final int TRANSACTION_getSocketQos = 2009;
        public static final int TRANSACTION_getSocketScore = 2011;
        public static final int TRANSACTION_init = 1010;
        public static final int TRANSACTION_isAccountLogin = 1048;
        public static final int TRANSACTION_isDeviceDiscoverable = 1044;
        public static final int TRANSACTION_publish = 2002;
        public static final int TRANSACTION_queryAccountLoginStatusOnline = 1054;
        public static final int TRANSACTION_receiveFile = 2007;
        public static final int TRANSACTION_registerContinuousSearch = 1035;
        public static final int TRANSACTION_registerNearbyDevicesChanged = 1022;
        public static final int TRANSACTION_registerP2pStateChanged = 2015;
        public static final int TRANSACTION_registerQosObserver = 2010;
        public static final int TRANSACTION_removePublisher = 2003;
        public static final int TRANSACTION_removeSenselessConnectionCallback = 1050;
        public static final int TRANSACTION_removeSubscriber = 2005;
        public static final int TRANSACTION_request = 2008;
        public static final int TRANSACTION_resetConnection = 1047;
        public static final int TRANSACTION_savePeripheralModelId = 1046;
        public static final int TRANSACTION_sendCmd = 1011;
        public static final int TRANSACTION_setAbilityCallback = 1034;
        public static final int TRANSACTION_setDevicesDiscoverable = 1043;
        public static final int TRANSACTION_setPassiveCallbackState = 1052;
        public static final int TRANSACTION_setSenselessConnectionCallback = 1049;
        public static final int TRANSACTION_startAdvertise = 1019;
        public static final int TRANSACTION_startScan = 1017;
        public static final int TRANSACTION_stopAdvertise = 1020;
        public static final int TRANSACTION_stopCertainAdvertise = 1040;
        public static final int TRANSACTION_stopCertainScan = 1039;
        public static final int TRANSACTION_stopScan = 1018;
        public static final int TRANSACTION_syncData = 1021;
        public static final int TRANSACTION_test_broadCastMsg = 3003;
        public static final int TRANSACTION_test_cancelFile = 3008;
        public static final int TRANSACTION_test_getAttachedDevices = 3004;
        public static final int TRANSACTION_test_getNeighborDevices = 3005;
        public static final int TRANSACTION_test_receiveFile = 3009;
        public static final int TRANSACTION_test_registerDbrEventCallback = 3001;
        public static final int TRANSACTION_test_rejectFile = 3010;
        public static final int TRANSACTION_test_release = 3006;
        public static final int TRANSACTION_test_sendFile = 3007;
        public static final int TRANSACTION_test_sendMsg = 3002;
        public static final int TRANSACTION_unRegisterP2pStateChanged = 2016;
        public static final int TRANSACTION_unregisterContinuousSearch = 1036;
        public static final int TRANSACTION_unregisterNearbyDevicesChanged = 1023;
        public static final int TRANSACTION_unregisterQosObserver = 2012;

        public static class Proxy implements IONetService {

            /* JADX INFO: renamed from: if, reason: not valid java name */
            public static IONetService f143if;

            /* JADX INFO: renamed from: do, reason: not valid java name */
            public IBinder f144do;

            public Proxy(IBinder iBinder) {
                this.f144do = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f144do;
            }

            @Override // com.oplus.onet.IONetService
            public final void cancelConnect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetDevice != null) {
                        parcelObtain.writeInt(1);
                        oNetDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (oNetConnectOption != null) {
                        parcelObtain.writeInt(1);
                        oNetConnectOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(1014, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelConnect(oNetDevice, oNetConnectOption);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        oNetDevice.readFromParcel(parcelObtain2);
                    }
                    if (parcelObtain2.readInt() != 0) {
                        oNetConnectOption.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void cancelFile(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f144do.transact(2006, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cancelFile(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean checkDiscoverability(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(Stub.TRANSACTION_checkDiscoverability, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkDiscoverability(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean checkLocalAbility(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(1005, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkLocalAbility(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean checkRemoteAbility(byte[] bArr, String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(1006, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkRemoteAbility(bArr, str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void checkShowPermissionStatement(IPermissionCallback iPermissionCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iPermissionCallback != null ? iPermissionCallback.asBinder() : null);
                    if (this.f144do.transact(1016, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().checkShowPermissionStatement(iPermissionCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void confirmConnectRequest(ONetDevice oNetDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetDevice != null) {
                        parcelObtain.writeInt(1);
                        oNetDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(1015, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().confirmConnectRequest(oNetDevice, i);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        oNetDevice.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void connect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetDevice != null) {
                        parcelObtain.writeInt(1);
                        oNetDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (oNetConnectOption != null) {
                        parcelObtain.writeInt(1);
                        oNetConnectOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(1012, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().connect(oNetDevice, oNetConnectOption);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        oNetDevice.readFromParcel(parcelObtain2);
                    }
                    if (parcelObtain2.readInt() != 0) {
                        oNetConnectOption.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final ONetDevice createDefaultDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(1032, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createDefaultDevice();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final ONetDevice createDefaultDeviceWithType(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(Stub.TRANSACTION_createDefaultDeviceWithType, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createDefaultDeviceWithType(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void createPublisher(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDbsEventCallback != null ? iDbsEventCallback.asBinder() : null);
                    if (this.f144do.transact(2001, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().createPublisher(list, bundle, iDbsEventCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void createSubscriber(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDbsEventCallback != null ? iDbsEventCallback.asBinder() : null);
                    if (this.f144do.transact(2004, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().createSubscriber(list, bundle, iDbsEventCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void deInit() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(Stub.TRANSACTION_deInit, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().deInit();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void disconnect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetDevice != null) {
                        parcelObtain.writeInt(1);
                        oNetDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (oNetConnectOption != null) {
                        parcelObtain.writeInt(1);
                        oNetConnectOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(1013, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().disconnect(oNetDevice, oNetConnectOption);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        oNetDevice.readFromParcel(parcelObtain2);
                    }
                    if (parcelObtain2.readInt() != 0) {
                        oNetConnectOption.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void enableConnectionHolding(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f144do.transact(2013, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().enableConnectionHolding(str, i, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void enableDiscoverability(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f144do.transact(1030, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().enableDiscoverability(i, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final Intent getAccountLoginIntent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(Stub.TRANSACTION_getAccountLoginIntent, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAccountLoginIntent();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<ONetDevice> getCachedDevices(ONetScanOption oNetScanOption) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetScanOption != null) {
                        parcelObtain.writeInt(1);
                        oNetScanOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(1009, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCachedDevices(oNetScanOption);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(ONetDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<ONetDevice> getCachedDevicesByAbility(int i, List<String> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(1007, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCachedDevicesByAbility(i, list, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(ONetDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<ONetDevice> getCachedDevicesByAbilityEx(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(1008, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCachedDevicesByAbilityEx(i, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(ONetDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<ONetDevice> getCachedDevicesWithBundle(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(Stub.TRANSACTION_getCachedDevicesWithBundle, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCachedDevicesWithBundle(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(ONetDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final int getConnectionStatus(ONetDevice oNetDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetDevice != null) {
                        parcelObtain.writeInt(1);
                        oNetDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(Stub.TRANSACTION_getConnectionStatus, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getConnectionStatus(oNetDevice, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final ONetDevice getDeviceById(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.f144do.transact(1002, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceById(bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<ONetDevice> getDevices(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(1003, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDevices(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(ONetDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final int getLocalAppId(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(1004, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalAppId(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final ONetDevice getLocalDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(1001, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalDevice();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final String getLocalFullAbility(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(Stub.TRANSACTION_getLocalFullAbility, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalFullAbility(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final int getLocalP2pStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(2014, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalP2pStatus();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final Bundle getLocalServiceProfile(String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(Stub.TRANSACTION_getLocalServiceProfile, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocalServiceProfile(str, str2, str3, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void getQrCodeMessage(QrCodeRequestOption qrCodeRequestOption, IQrCodeMessageCallback iQrCodeMessageCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (qrCodeRequestOption != null) {
                        parcelObtain.writeInt(1);
                        qrCodeRequestOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iQrCodeMessageCallback != null ? iQrCodeMessageCallback.asBinder() : null);
                    if (this.f144do.transact(Stub.TRANSACTION_getQrCodeMessage, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getQrCodeMessage(qrCodeRequestOption, iQrCodeMessageCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final SocketQos getSocketQos(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.f144do.transact(2009, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSocketQos(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? SocketQos.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final int getSocketScore(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.f144do.transact(2011, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSocketScore(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void init(ILinkManager iLinkManager) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iLinkManager != null ? iLinkManager.asBinder() : null);
                    if (this.f144do.transact(1010, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().init(iLinkManager);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean isAccountLogin() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(Stub.TRANSACTION_isAccountLogin, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAccountLogin();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean isDeviceDiscoverable(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.f144do.transact(Stub.TRANSACTION_isDeviceDiscoverable, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDeviceDiscoverable(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void publish(DbsMessage dbsMessage, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (dbsMessage != null) {
                        parcelObtain.writeInt(1);
                        dbsMessage.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDbsEventCallback != null ? iDbsEventCallback.asBinder() : null);
                    if (this.f144do.transact(2002, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().publish(dbsMessage, bundle, iDbsEventCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void queryAccountLoginStatusOnline(IAccountStateCallback iAccountStateCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAccountStateCallback != null ? iAccountStateCallback.asBinder() : null);
                    if (this.f144do.transact(Stub.TRANSACTION_queryAccountLoginStatusOnline, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().queryAccountLoginStatusOnline(iAccountStateCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void receiveFile(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f144do.transact(2007, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().receiveFile(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void registerContinuousSearch(ONetScanOption oNetScanOption, IONetScanCallback iONetScanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetScanOption != null) {
                        parcelObtain.writeInt(1);
                        oNetScanOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iONetScanCallback != null ? iONetScanCallback.asBinder() : null);
                    if (this.f144do.transact(Stub.TRANSACTION_registerContinuousSearch, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerContinuousSearch(oNetScanOption, iONetScanCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void registerNearbyDevicesChanged(INearbyDevicesCallback iNearbyDevicesCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iNearbyDevicesCallback != null ? iNearbyDevicesCallback.asBinder() : null);
                    if (this.f144do.transact(1022, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerNearbyDevicesChanged(iNearbyDevicesCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void registerP2pStateChanged(IP2pStateCallback iP2pStateCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iP2pStateCallback != null ? iP2pStateCallback.asBinder() : null);
                    if (this.f144do.transact(2015, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerP2pStateChanged(iP2pStateCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void registerQosObserver(IQosObserver iQosObserver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iQosObserver != null ? iQosObserver.asBinder() : null);
                    if (this.f144do.transact(2010, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerQosObserver(iQosObserver);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void removePublisher(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDbsEventCallback != null ? iDbsEventCallback.asBinder() : null);
                    if (this.f144do.transact(2003, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().removePublisher(list, bundle, iDbsEventCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void removeSenselessConnectionCallback() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(Stub.TRANSACTION_removeSenselessConnectionCallback, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().removeSenselessConnectionCallback();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void removeSubscriber(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDbsEventCallback != null ? iDbsEventCallback.asBinder() : null);
                    if (this.f144do.transact(2005, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().removeSubscriber(list, bundle, iDbsEventCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final Bundle request(String str, String str2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f144do.transact(2008, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().request(str, str2, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void resetConnection(ONetDevice oNetDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetDevice != null) {
                        parcelObtain.writeInt(1);
                        oNetDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (this.f144do.transact(Stub.TRANSACTION_resetConnection, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().resetConnection(oNetDevice, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void savePeripheralModelId(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.f144do.transact(Stub.TRANSACTION_savePeripheralModelId, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().savePeripheralModelId(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void sendCmd(int i, String str, ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f144do.transact(1011, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendCmd(i, str, resultReceiver);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void setAbilityCallback(IAbilityCallback iAbilityCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iAbilityCallback != null ? iAbilityCallback.asBinder() : null);
                    if (this.f144do.transact(Stub.TRANSACTION_setAbilityCallback, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setAbilityCallback(iAbilityCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void setDevicesDiscoverable(int[] iArr, boolean z, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f144do.transact(Stub.TRANSACTION_setDevicesDiscoverable, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDevicesDiscoverable(iArr, z, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void setPassiveCallbackState(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f144do.transact(Stub.TRANSACTION_setPassiveCallbackState, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPassiveCallbackState(z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void setSenselessConnectionCallback(ISenselessConnectionCallback iSenselessConnectionCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iSenselessConnectionCallback != null ? iSenselessConnectionCallback.asBinder() : null);
                    if (this.f144do.transact(Stub.TRANSACTION_setSenselessConnectionCallback, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setSenselessConnectionCallback(iSenselessConnectionCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean startAdvertise(ONetAdvertiseSetting oNetAdvertiseSetting, IONetAdvertiseCallback iONetAdvertiseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetAdvertiseSetting != null) {
                        parcelObtain.writeInt(1);
                        oNetAdvertiseSetting.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iONetAdvertiseCallback != null ? iONetAdvertiseCallback.asBinder() : null);
                    if (!this.f144do.transact(1019, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startAdvertise(oNetAdvertiseSetting, iONetAdvertiseCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void startScan(ONetScanOption oNetScanOption, IONetScanCallback iONetScanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (oNetScanOption != null) {
                        parcelObtain.writeInt(1);
                        oNetScanOption.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iONetScanCallback != null ? iONetScanCallback.asBinder() : null);
                    if (this.f144do.transact(1017, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startScan(oNetScanOption, iONetScanCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean stopAdvertise() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(1020, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopAdvertise();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final boolean stopCertainAdvertise(IONetAdvertiseCallback iONetAdvertiseCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iONetAdvertiseCallback != null ? iONetAdvertiseCallback.asBinder() : null);
                    if (!this.f144do.transact(Stub.TRANSACTION_stopCertainAdvertise, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopCertainAdvertise(iONetAdvertiseCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void stopCertainScan(IONetScanCallback iONetScanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iONetScanCallback != null ? iONetScanCallback.asBinder() : null);
                    if (this.f144do.transact(Stub.TRANSACTION_stopCertainScan, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopCertainScan(iONetScanCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void stopScan() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(1018, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopScan();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void syncData(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.f144do.transact(1021, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().syncData(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_broadCastMsg(byte[] bArr, IResultCallback iResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iResultCallback != null ? iResultCallback.asBinder() : null);
                    if (this.f144do.transact(3003, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_broadCastMsg(bArr, iResultCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_cancelFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.f144do.transact(3008, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_cancelFile(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<String> test_getAttachedDevices() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(3004, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().test_getAttachedDevices();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final List<String> test_getNeighborDevices() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.f144do.transact(3005, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().test_getNeighborDevices();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_receiveFile(String str, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f144do.transact(3009, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_receiveFile(str, uri);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_registerDbrEventCallback(IDbrEventCallback iDbrEventCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iDbrEventCallback != null ? iDbrEventCallback.asBinder() : null);
                    if (this.f144do.transact(3001, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_registerDbrEventCallback(iDbrEventCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_rejectFile(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.f144do.transact(3010, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_rejectFile(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_release() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(3006, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_release();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_sendFile(String str, String str2, Uri uri, IFileTransferResultCallback iFileTransferResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iFileTransferResultCallback != null ? iFileTransferResultCallback.asBinder() : null);
                    if (this.f144do.transact(3007, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_sendFile(str, str2, uri, iFileTransferResultCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void test_sendMsg(List<String> list, int i, byte[] bArr, IResultCallback iResultCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iResultCallback != null ? iResultCallback.asBinder() : null);
                    if (this.f144do.transact(3002, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().test_sendMsg(list, i, bArr, iResultCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void unRegisterP2pStateChanged() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(2016, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unRegisterP2pStateChanged();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void unregisterContinuousSearch() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(Stub.TRANSACTION_unregisterContinuousSearch, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterContinuousSearch();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void unregisterNearbyDevicesChanged() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.f144do.transact(1023, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterNearbyDevicesChanged();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.IONetService
            public final void unregisterQosObserver(IQosObserver iQosObserver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iQosObserver != null ? iQosObserver.asBinder() : null);
                    if (this.f144do.transact(2012, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterQosObserver(iQosObserver);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IONetService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IONetService)) ? new Proxy(iBinder) : (IONetService) iInterfaceQueryLocalInterface;
        }

        public static IONetService getDefaultImpl() {
            return Proxy.f143if;
        }

        public static boolean setDefaultImpl(IONetService iONetService) {
            if (Proxy.f143if != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iONetService == null) {
                return false;
            }
            Proxy.f143if = iONetService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1001:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice localDevice = getLocalDevice();
                    parcel2.writeNoException();
                    if (localDevice != null) {
                        parcel2.writeInt(1);
                        localDevice.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1002:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice deviceById = getDeviceById(parcel.createByteArray());
                    parcel2.writeNoException();
                    if (deviceById != null) {
                        parcel2.writeInt(1);
                        deviceById.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1003:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<ONetDevice> devices = getDevices(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(devices);
                    return true;
                case 1004:
                    parcel.enforceInterface(DESCRIPTOR);
                    int localAppId = getLocalAppId(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(localAppId);
                    return true;
                case 1005:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zCheckLocalAbility = checkLocalAbility(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckLocalAbility ? 1 : 0);
                    return true;
                case 1006:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zCheckRemoteAbility = checkRemoteAbility(parcel.createByteArray(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckRemoteAbility ? 1 : 0);
                    return true;
                case 1007:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<ONetDevice> cachedDevicesByAbility = getCachedDevicesByAbility(parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(cachedDevicesByAbility);
                    return true;
                case 1008:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<ONetDevice> cachedDevicesByAbilityEx = getCachedDevicesByAbilityEx(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(cachedDevicesByAbilityEx);
                    return true;
                case 1009:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<ONetDevice> cachedDevices = getCachedDevices(parcel.readInt() != 0 ? ONetScanOption.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(cachedDevices);
                    return true;
                case 1010:
                    parcel.enforceInterface(DESCRIPTOR);
                    init(ILinkManager.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1011:
                    parcel.enforceInterface(DESCRIPTOR);
                    sendCmd(parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1012:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    ONetConnectOption oNetConnectOptionCreateFromParcel = parcel.readInt() != 0 ? ONetConnectOption.CREATOR.createFromParcel(parcel) : null;
                    connect(oNetDeviceCreateFromParcel, oNetConnectOptionCreateFromParcel);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    if (oNetConnectOptionCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        oNetConnectOptionCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1013:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel2 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    ONetConnectOption oNetConnectOptionCreateFromParcel2 = parcel.readInt() != 0 ? ONetConnectOption.CREATOR.createFromParcel(parcel) : null;
                    disconnect(oNetDeviceCreateFromParcel2, oNetConnectOptionCreateFromParcel2);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    if (oNetConnectOptionCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        oNetConnectOptionCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1014:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel3 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    ONetConnectOption oNetConnectOptionCreateFromParcel3 = parcel.readInt() != 0 ? ONetConnectOption.CREATOR.createFromParcel(parcel) : null;
                    cancelConnect(oNetDeviceCreateFromParcel3, oNetConnectOptionCreateFromParcel3);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel3 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    if (oNetConnectOptionCreateFromParcel3 != null) {
                        parcel2.writeInt(1);
                        oNetConnectOptionCreateFromParcel3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1015:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel4 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    confirmConnectRequest(oNetDeviceCreateFromParcel4, parcel.readInt());
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel4 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1016:
                    parcel.enforceInterface(DESCRIPTOR);
                    checkShowPermissionStatement(IPermissionCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1017:
                    parcel.enforceInterface(DESCRIPTOR);
                    startScan(parcel.readInt() != 0 ? ONetScanOption.CREATOR.createFromParcel(parcel) : null, IONetScanCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1018:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopScan();
                    parcel2.writeNoException();
                    return true;
                case 1019:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStartAdvertise = startAdvertise(parcel.readInt() != 0 ? ONetAdvertiseSetting.CREATOR.createFromParcel(parcel) : null, IONetAdvertiseCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartAdvertise ? 1 : 0);
                    return true;
                case 1020:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopAdvertise = stopAdvertise();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopAdvertise ? 1 : 0);
                    return true;
                case 1021:
                    parcel.enforceInterface(DESCRIPTOR);
                    syncData(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1022:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerNearbyDevicesChanged(INearbyDevicesCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1023:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterNearbyDevicesChanged();
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 1030:
                            parcel.enforceInterface(DESCRIPTOR);
                            enableDiscoverability(parcel.readInt(), parcel.readInt() != 0);
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_checkDiscoverability /* 1031 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            boolean zCheckDiscoverability = checkDiscoverability(parcel.readInt());
                            parcel2.writeNoException();
                            parcel2.writeInt(zCheckDiscoverability ? 1 : 0);
                            return true;
                        case 1032:
                            parcel.enforceInterface(DESCRIPTOR);
                            ONetDevice oNetDeviceCreateDefaultDevice = createDefaultDevice();
                            parcel2.writeNoException();
                            if (oNetDeviceCreateDefaultDevice != null) {
                                parcel2.writeInt(1);
                                oNetDeviceCreateDefaultDevice.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case TRANSACTION_createDefaultDeviceWithType /* 1033 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            ONetDevice oNetDeviceCreateDefaultDeviceWithType = createDefaultDeviceWithType(parcel.readInt());
                            parcel2.writeNoException();
                            if (oNetDeviceCreateDefaultDeviceWithType != null) {
                                parcel2.writeInt(1);
                                oNetDeviceCreateDefaultDeviceWithType.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case TRANSACTION_setAbilityCallback /* 1034 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            setAbilityCallback(IAbilityCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_registerContinuousSearch /* 1035 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            registerContinuousSearch(parcel.readInt() != 0 ? ONetScanOption.CREATOR.createFromParcel(parcel) : null, IONetScanCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_unregisterContinuousSearch /* 1036 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            unregisterContinuousSearch();
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_getConnectionStatus /* 1037 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            int connectionStatus = getConnectionStatus(parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                            parcel2.writeNoException();
                            parcel2.writeInt(connectionStatus);
                            return true;
                        case TRANSACTION_getLocalFullAbility /* 1038 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            String localFullAbility = getLocalFullAbility(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                            parcel2.writeNoException();
                            parcel2.writeString(localFullAbility);
                            return true;
                        case TRANSACTION_stopCertainScan /* 1039 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            stopCertainScan(IONetScanCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_stopCertainAdvertise /* 1040 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            boolean zStopCertainAdvertise = stopCertainAdvertise(IONetAdvertiseCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            parcel2.writeInt(zStopCertainAdvertise ? 1 : 0);
                            return true;
                        case TRANSACTION_getLocalServiceProfile /* 1041 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            Bundle localServiceProfile = getLocalServiceProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                            parcel2.writeNoException();
                            if (localServiceProfile != null) {
                                parcel2.writeInt(1);
                                localServiceProfile.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case TRANSACTION_getCachedDevicesWithBundle /* 1042 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<ONetDevice> cachedDevicesWithBundle = getCachedDevicesWithBundle(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                            parcel2.writeNoException();
                            parcel2.writeTypedList(cachedDevicesWithBundle);
                            return true;
                        case TRANSACTION_setDevicesDiscoverable /* 1043 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            setDevicesDiscoverable(parcel.createIntArray(), parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_isDeviceDiscoverable /* 1044 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            boolean zIsDeviceDiscoverable = isDeviceDiscoverable(parcel.readInt());
                            parcel2.writeNoException();
                            parcel2.writeInt(zIsDeviceDiscoverable ? 1 : 0);
                            return true;
                        case TRANSACTION_getQrCodeMessage /* 1045 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            getQrCodeMessage(parcel.readInt() != 0 ? QrCodeRequestOption.CREATOR.createFromParcel(parcel) : null, IQrCodeMessageCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_savePeripheralModelId /* 1046 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            savePeripheralModelId(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_resetConnection /* 1047 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            resetConnection(parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_isAccountLogin /* 1048 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            boolean zIsAccountLogin = isAccountLogin();
                            parcel2.writeNoException();
                            parcel2.writeInt(zIsAccountLogin ? 1 : 0);
                            return true;
                        case TRANSACTION_setSenselessConnectionCallback /* 1049 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            setSenselessConnectionCallback(ISenselessConnectionCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_removeSenselessConnectionCallback /* 1050 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            removeSenselessConnectionCallback();
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_deInit /* 1051 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            deInit();
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_setPassiveCallbackState /* 1052 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            setPassiveCallbackState(parcel.readInt() != 0);
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_getAccountLoginIntent /* 1053 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            Intent accountLoginIntent = getAccountLoginIntent();
                            parcel2.writeNoException();
                            if (accountLoginIntent != null) {
                                parcel2.writeInt(1);
                                accountLoginIntent.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case TRANSACTION_queryAccountLoginStatusOnline /* 1054 */:
                            parcel.enforceInterface(DESCRIPTOR);
                            queryAccountLoginStatusOnline(IAccountStateCallback.Stub.asInterface(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 2001:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    createPublisher(parcel.createTypedArrayList(ONetTopic.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDbsEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2002:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    publish(parcel.readInt() != 0 ? DbsMessage.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDbsEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2003:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    removePublisher(parcel.createTypedArrayList(ONetTopic.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDbsEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2004:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    createSubscriber(parcel.createTypedArrayList(ONetTopic.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDbsEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2005:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    removeSubscriber(parcel.createTypedArrayList(ONetTopic.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDbsEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2006:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    cancelFile(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                    parcel2.writeNoException();
                                    return true;
                                case 2007:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    receiveFile(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                    parcel2.writeNoException();
                                    return true;
                                case 2008:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    Bundle bundleRequest = request(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                    parcel2.writeNoException();
                                    if (bundleRequest != null) {
                                        parcel2.writeInt(1);
                                        bundleRequest.writeToParcel(parcel2, 1);
                                    } else {
                                        parcel2.writeInt(0);
                                    }
                                    return true;
                                case 2009:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    SocketQos socketQos = getSocketQos(parcel.readInt(), parcel.readString());
                                    parcel2.writeNoException();
                                    if (socketQos != null) {
                                        parcel2.writeInt(1);
                                        socketQos.writeToParcel(parcel2, 1);
                                    } else {
                                        parcel2.writeInt(0);
                                    }
                                    return true;
                                case 2010:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    registerQosObserver(IQosObserver.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2011:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    int socketScore = getSocketScore(parcel.readInt(), parcel.readString());
                                    parcel2.writeNoException();
                                    parcel2.writeInt(socketScore);
                                    return true;
                                case 2012:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    unregisterQosObserver(IQosObserver.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2013:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    enableConnectionHolding(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                                    parcel2.writeNoException();
                                    return true;
                                case 2014:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    int localP2pStatus = getLocalP2pStatus();
                                    parcel2.writeNoException();
                                    parcel2.writeInt(localP2pStatus);
                                    return true;
                                case 2015:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    registerP2pStateChanged(IP2pStateCallback.Stub.asInterface(parcel.readStrongBinder()));
                                    parcel2.writeNoException();
                                    return true;
                                case 2016:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    unRegisterP2pStateChanged();
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    switch (i) {
                                        case 3001:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_registerDbrEventCallback(IDbrEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3002:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_sendMsg(parcel.createStringArrayList(), parcel.readInt(), parcel.createByteArray(), IResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3003:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_broadCastMsg(parcel.createByteArray(), IResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3004:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            List<String> listTest_getAttachedDevices = test_getAttachedDevices();
                                            parcel2.writeNoException();
                                            parcel2.writeStringList(listTest_getAttachedDevices);
                                            return true;
                                        case 3005:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            List<String> listTest_getNeighborDevices = test_getNeighborDevices();
                                            parcel2.writeNoException();
                                            parcel2.writeStringList(listTest_getNeighborDevices);
                                            return true;
                                        case 3006:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_release();
                                            parcel2.writeNoException();
                                            return true;
                                        case 3007:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_sendFile(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, IFileTransferResultCallback.Stub.asInterface(parcel.readStrongBinder()));
                                            parcel2.writeNoException();
                                            return true;
                                        case 3008:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_cancelFile(parcel.readString(), parcel.readString());
                                            parcel2.writeNoException();
                                            return true;
                                        case 3009:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_receiveFile(parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                                            parcel2.writeNoException();
                                            return true;
                                        case 3010:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            test_rejectFile(parcel.readString(), parcel.readString());
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            return super.onTransact(i, parcel, parcel2, i2);
                                    }
                            }
                    }
            }
        }
    }

    void cancelConnect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException;

    void cancelFile(String str, Bundle bundle) throws RemoteException;

    boolean checkDiscoverability(int i) throws RemoteException;

    boolean checkLocalAbility(String str, int i) throws RemoteException;

    boolean checkRemoteAbility(byte[] bArr, String str, int i) throws RemoteException;

    void checkShowPermissionStatement(IPermissionCallback iPermissionCallback) throws RemoteException;

    void confirmConnectRequest(ONetDevice oNetDevice, int i) throws RemoteException;

    void connect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException;

    ONetDevice createDefaultDevice() throws RemoteException;

    ONetDevice createDefaultDeviceWithType(int i) throws RemoteException;

    void createPublisher(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException;

    void createSubscriber(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException;

    void deInit() throws RemoteException;

    void disconnect(ONetDevice oNetDevice, ONetConnectOption oNetConnectOption) throws RemoteException;

    void enableConnectionHolding(String str, int i, boolean z) throws RemoteException;

    void enableDiscoverability(int i, boolean z) throws RemoteException;

    Intent getAccountLoginIntent() throws RemoteException;

    List<ONetDevice> getCachedDevices(ONetScanOption oNetScanOption) throws RemoteException;

    List<ONetDevice> getCachedDevicesByAbility(int i, List<String> list, Bundle bundle) throws RemoteException;

    List<ONetDevice> getCachedDevicesByAbilityEx(int i, Bundle bundle) throws RemoteException;

    List<ONetDevice> getCachedDevicesWithBundle(Bundle bundle) throws RemoteException;

    int getConnectionStatus(ONetDevice oNetDevice, int i) throws RemoteException;

    ONetDevice getDeviceById(byte[] bArr) throws RemoteException;

    List<ONetDevice> getDevices(int i) throws RemoteException;

    int getLocalAppId(String str, int i) throws RemoteException;

    ONetDevice getLocalDevice() throws RemoteException;

    String getLocalFullAbility(Bundle bundle) throws RemoteException;

    int getLocalP2pStatus() throws RemoteException;

    Bundle getLocalServiceProfile(String str, String str2, String str3, Bundle bundle) throws RemoteException;

    void getQrCodeMessage(QrCodeRequestOption qrCodeRequestOption, IQrCodeMessageCallback iQrCodeMessageCallback) throws RemoteException;

    SocketQos getSocketQos(int i, String str) throws RemoteException;

    int getSocketScore(int i, String str) throws RemoteException;

    void init(ILinkManager iLinkManager) throws RemoteException;

    boolean isAccountLogin() throws RemoteException;

    boolean isDeviceDiscoverable(int i) throws RemoteException;

    void publish(DbsMessage dbsMessage, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException;

    void queryAccountLoginStatusOnline(IAccountStateCallback iAccountStateCallback) throws RemoteException;

    void receiveFile(String str, Bundle bundle) throws RemoteException;

    void registerContinuousSearch(ONetScanOption oNetScanOption, IONetScanCallback iONetScanCallback) throws RemoteException;

    void registerNearbyDevicesChanged(INearbyDevicesCallback iNearbyDevicesCallback) throws RemoteException;

    void registerP2pStateChanged(IP2pStateCallback iP2pStateCallback) throws RemoteException;

    void registerQosObserver(IQosObserver iQosObserver) throws RemoteException;

    void removePublisher(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException;

    void removeSenselessConnectionCallback() throws RemoteException;

    void removeSubscriber(List<ONetTopic> list, Bundle bundle, IDbsEventCallback iDbsEventCallback) throws RemoteException;

    Bundle request(String str, String str2, Bundle bundle) throws RemoteException;

    void resetConnection(ONetDevice oNetDevice, int i) throws RemoteException;

    void savePeripheralModelId(String str, String str2) throws RemoteException;

    void sendCmd(int i, String str, ResultReceiver resultReceiver) throws RemoteException;

    void setAbilityCallback(IAbilityCallback iAbilityCallback) throws RemoteException;

    void setDevicesDiscoverable(int[] iArr, boolean z, Bundle bundle) throws RemoteException;

    void setPassiveCallbackState(boolean z) throws RemoteException;

    void setSenselessConnectionCallback(ISenselessConnectionCallback iSenselessConnectionCallback) throws RemoteException;

    boolean startAdvertise(ONetAdvertiseSetting oNetAdvertiseSetting, IONetAdvertiseCallback iONetAdvertiseCallback) throws RemoteException;

    void startScan(ONetScanOption oNetScanOption, IONetScanCallback iONetScanCallback) throws RemoteException;

    boolean stopAdvertise() throws RemoteException;

    boolean stopCertainAdvertise(IONetAdvertiseCallback iONetAdvertiseCallback) throws RemoteException;

    void stopCertainScan(IONetScanCallback iONetScanCallback) throws RemoteException;

    void stopScan() throws RemoteException;

    void syncData(String str) throws RemoteException;

    void test_broadCastMsg(byte[] bArr, IResultCallback iResultCallback) throws RemoteException;

    void test_cancelFile(String str, String str2) throws RemoteException;

    List<String> test_getAttachedDevices() throws RemoteException;

    List<String> test_getNeighborDevices() throws RemoteException;

    void test_receiveFile(String str, Uri uri) throws RemoteException;

    void test_registerDbrEventCallback(IDbrEventCallback iDbrEventCallback) throws RemoteException;

    void test_rejectFile(String str, String str2) throws RemoteException;

    void test_release() throws RemoteException;

    void test_sendFile(String str, String str2, Uri uri, IFileTransferResultCallback iFileTransferResultCallback) throws RemoteException;

    void test_sendMsg(List<String> list, int i, byte[] bArr, IResultCallback iResultCallback) throws RemoteException;

    void unRegisterP2pStateChanged() throws RemoteException;

    void unregisterContinuousSearch() throws RemoteException;

    void unregisterNearbyDevicesChanged() throws RemoteException;

    void unregisterQosObserver(IQosObserver iQosObserver) throws RemoteException;
}
