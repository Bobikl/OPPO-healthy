package com.heytap.health.devicemanager.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.devicemanager.client.params.ConnectParams;
import com.heytap.health.devicemanager.client.params.DMPairParams;
import com.heytap.health.devicemanager.connect.IDeviceRefreshListener;
import com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener;
import com.heytap.health.devicemanager.deviceinfo.IOobeStateEventListener;
import com.heytap.health.devicemanager.deviceinfo.IOobeStatusListener;
import com.heytap.health.devicemanager.listener.IDeviceAppListChangeListener;
import com.heytap.health.devicemanager.processor.bean.AppListBean;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IDeviceManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.devicemanager.manager.IDeviceManager";

    public static class Default implements IDeviceManager {
        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void addDeviceAppListChangeListener(IDeviceAppListChangeListener iDeviceAppListChangeListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void addDeviceStateListener(IDeviceStateListener iDeviceStateListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void addOobeStateEventListener(IOobeStateEventListener iOobeStateEventListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void addOobeStatusListener(IOobeStatusListener iOobeStatusListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void addPairMonitor(IBinder iBinder, String str, String str2) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void addRefreshDeviceListener(IDeviceRefreshListener iDeviceRefreshListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void clearAndDisconnectAll(String str, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void connectDeviceByMac(ConnectParams connectParams) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void connectDeviceByPair(DMPairParams dMPairParams) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public boolean deleteDeviceByMac(String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public boolean disableTryConnect(boolean z, String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void disconnectDeviceByMac(DMPairParams dMPairParams) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public AppListBean findDeviceAppListByMac(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public int findDeviceAppStatusByMacAndAppIds(String str, int[] iArr) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public UserDeviceInfo getBoundDeviceInfoByMac(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public List<UserDeviceInfo> getBoundDeviceInfos() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public String getCurrActiveMac() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public String getCurrConnectIngMac() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public String getDeviceBindPhoneMac(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public boolean interceptCacheExist(String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public boolean isPairing() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void notifyPushResult(boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void notifyUnbindStart(String str, String str2) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void removeDeviceAppListChangeListener(IDeviceAppListChangeListener iDeviceAppListChangeListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void removeDeviceStateListener(IDeviceStateListener iDeviceStateListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void removePairMonitor(IBinder iBinder, String str, String str2) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void removeRefreshDeviceListener(IDeviceRefreshListener iDeviceRefreshListener) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void requestDeviceBattery(String str) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void retryConnect(String str) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void setCurrActiveMac(String str, String str2) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void setInterceptDevice(String str, boolean z, String str2) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void setOobeStatue(String str, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public void updateDeviceConnectState(String str, int i, String str2) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public boolean updateDeviceInfo(UserDeviceInfo userDeviceInfo, int i) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.devicemanager.manager.IDeviceManager
        public boolean updateDeviceInfos(List<UserDeviceInfo> list, String str, int i) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IDeviceManager {
        static final int TRANSACTION_addDeviceAppListChangeListener = 1011;
        static final int TRANSACTION_addDeviceStateListener = 7;
        static final int TRANSACTION_addOobeStateEventListener = 1010;
        static final int TRANSACTION_addOobeStatusListener = 1002;
        static final int TRANSACTION_addPairMonitor = 1008;
        static final int TRANSACTION_addRefreshDeviceListener = 1005;
        static final int TRANSACTION_clearAndDisconnectAll = 110;
        static final int TRANSACTION_connectDeviceByMac = 107;
        static final int TRANSACTION_connectDeviceByPair = 101;
        static final int TRANSACTION_deleteDeviceByMac = 6;
        static final int TRANSACTION_disableTryConnect = 106;
        static final int TRANSACTION_disconnectDeviceByMac = 102;
        static final int TRANSACTION_findDeviceAppListByMac = 1014;
        static final int TRANSACTION_findDeviceAppStatusByMacAndAppIds = 1013;
        static final int TRANSACTION_getBoundDeviceInfoByMac = 5;
        static final int TRANSACTION_getBoundDeviceInfos = 4;
        static final int TRANSACTION_getCurrActiveMac = 109;
        static final int TRANSACTION_getCurrConnectIngMac = 113;
        static final int TRANSACTION_getDeviceBindPhoneMac = 1015;
        static final int TRANSACTION_interceptCacheExist = 112;
        static final int TRANSACTION_isPairing = 1016;
        static final int TRANSACTION_notifyPushResult = 1007;
        static final int TRANSACTION_notifyUnbindStart = 1004;
        static final int TRANSACTION_removeDeviceAppListChangeListener = 1012;
        static final int TRANSACTION_removeDeviceStateListener = 8;
        static final int TRANSACTION_removePairMonitor = 1009;
        static final int TRANSACTION_removeRefreshDeviceListener = 1006;
        static final int TRANSACTION_requestDeviceBattery = 1001;
        static final int TRANSACTION_retryConnect = 105;
        static final int TRANSACTION_setCurrActiveMac = 108;
        static final int TRANSACTION_setInterceptDevice = 104;
        static final int TRANSACTION_setOobeStatue = 1003;
        static final int TRANSACTION_updateDeviceConnectState = 111;
        static final int TRANSACTION_updateDeviceInfo = 3;
        static final int TRANSACTION_updateDeviceInfos = 2;

        public static class Proxy implements IDeviceManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void addDeviceAppListChangeListener(IDeviceAppListChangeListener iDeviceAppListChangeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceAppListChangeListener);
                    this.mRemote.transact(1011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void addDeviceStateListener(IDeviceStateListener iDeviceStateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceStateListener);
                    this.mRemote.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void addOobeStateEventListener(IOobeStateEventListener iOobeStateEventListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOobeStateEventListener);
                    this.mRemote.transact(1010, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void addOobeStatusListener(IOobeStatusListener iOobeStatusListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOobeStatusListener);
                    this.mRemote.transact(1002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void addPairMonitor(IBinder iBinder, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(1008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void addRefreshDeviceListener(IDeviceRefreshListener iDeviceRefreshListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceRefreshListener);
                    this.mRemote.transact(1005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void clearAndDisconnectAll(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(110, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void connectDeviceByMac(ConnectParams connectParams) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    a.f(parcelObtain, connectParams, 0);
                    this.mRemote.transact(107, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void connectDeviceByPair(DMPairParams dMPairParams) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    a.f(parcelObtain, dMPairParams, 0);
                    this.mRemote.transact(101, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public boolean deleteDeviceByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public boolean disableTryConnect(boolean z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(106, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void disconnectDeviceByMac(DMPairParams dMPairParams) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    a.f(parcelObtain, dMPairParams, 0);
                    this.mRemote.transact(102, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public AppListBean findDeviceAppListByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1014, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (AppListBean) a.d(parcelObtain2, AppListBean.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public int findDeviceAppStatusByMacAndAppIds(String str, int[] iArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeIntArray(iArr);
                    this.mRemote.transact(1013, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public UserDeviceInfo getBoundDeviceInfoByMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (UserDeviceInfo) a.d(parcelObtain2, UserDeviceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public List<UserDeviceInfo> getBoundDeviceInfos() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(UserDeviceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public String getCurrActiveMac() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    this.mRemote.transact(109, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public String getCurrConnectIngMac() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    this.mRemote.transact(113, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public String getDeviceBindPhoneMac(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1015, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDeviceManager.DESCRIPTOR;
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public boolean interceptCacheExist(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(112, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public boolean isPairing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    this.mRemote.transact(1016, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void notifyPushResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void notifyUnbindStart(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(1004, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void removeDeviceAppListChangeListener(IDeviceAppListChangeListener iDeviceAppListChangeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceAppListChangeListener);
                    this.mRemote.transact(1012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void removeDeviceStateListener(IDeviceStateListener iDeviceStateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceStateListener);
                    this.mRemote.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void removePairMonitor(IBinder iBinder, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(1009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void removeRefreshDeviceListener(IDeviceRefreshListener iDeviceRefreshListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDeviceRefreshListener);
                    this.mRemote.transact(1006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void requestDeviceBattery(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void retryConnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(105, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void setCurrActiveMac(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(108, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void setInterceptDevice(String str, boolean z, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(104, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void setOobeStatue(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1003, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public void updateDeviceConnectState(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(111, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public boolean updateDeviceInfo(UserDeviceInfo userDeviceInfo, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    a.f(parcelObtain, userDeviceInfo, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.manager.IDeviceManager
            public boolean updateDeviceInfos(List<UserDeviceInfo> list, String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceManager.DESCRIPTOR);
                    a.e(parcelObtain, list, 0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDeviceManager.DESCRIPTOR);
        }

        public static IDeviceManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeviceManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceManager)) ? new Proxy(iBinder) : (IDeviceManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDeviceManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDeviceManager.DESCRIPTOR);
                return true;
            }
            if (i == 101) {
                connectDeviceByPair((DMPairParams) a.d(parcel, DMPairParams.CREATOR));
                parcel2.writeNoException();
            } else if (i != 102) {
                switch (i) {
                    case 2:
                        boolean zUpdateDeviceInfos = updateDeviceInfos(parcel.createTypedArrayList(UserDeviceInfo.CREATOR), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(zUpdateDeviceInfos ? 1 : 0);
                        break;
                    case 3:
                        boolean zUpdateDeviceInfo = updateDeviceInfo((UserDeviceInfo) a.d(parcel, UserDeviceInfo.CREATOR), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(zUpdateDeviceInfo ? 1 : 0);
                        break;
                    case 4:
                        List<UserDeviceInfo> boundDeviceInfos = getBoundDeviceInfos();
                        parcel2.writeNoException();
                        a.e(parcel2, boundDeviceInfos, 1);
                        break;
                    case 5:
                        UserDeviceInfo boundDeviceInfoByMac = getBoundDeviceInfoByMac(parcel.readString());
                        parcel2.writeNoException();
                        a.f(parcel2, boundDeviceInfoByMac, 1);
                        break;
                    case 6:
                        boolean zDeleteDeviceByMac = deleteDeviceByMac(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(zDeleteDeviceByMac ? 1 : 0);
                        break;
                    case 7:
                        addDeviceStateListener(IDeviceStateListener.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 8:
                        removeDeviceStateListener(IDeviceStateListener.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    default:
                        switch (i) {
                            case 104:
                                setInterceptDevice(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                                parcel2.writeNoException();
                                break;
                            case 105:
                                retryConnect(parcel.readString());
                                break;
                            case 106:
                                boolean zDisableTryConnect = disableTryConnect(parcel.readInt() != 0, parcel.readString());
                                parcel2.writeNoException();
                                parcel2.writeInt(zDisableTryConnect ? 1 : 0);
                                break;
                            case 107:
                                connectDeviceByMac((ConnectParams) a.d(parcel, ConnectParams.CREATOR));
                                parcel2.writeNoException();
                                break;
                            case 108:
                                setCurrActiveMac(parcel.readString(), parcel.readString());
                                parcel2.writeNoException();
                                break;
                            case 109:
                                String currActiveMac = getCurrActiveMac();
                                parcel2.writeNoException();
                                parcel2.writeString(currActiveMac);
                                break;
                            case 110:
                                clearAndDisconnectAll(parcel.readString(), parcel.readInt() != 0);
                                parcel2.writeNoException();
                                break;
                            case 111:
                                updateDeviceConnectState(parcel.readString(), parcel.readInt(), parcel.readString());
                                parcel2.writeNoException();
                                break;
                            case 112:
                                boolean zInterceptCacheExist = interceptCacheExist(parcel.readString());
                                parcel2.writeNoException();
                                parcel2.writeInt(zInterceptCacheExist ? 1 : 0);
                                break;
                            case 113:
                                String currConnectIngMac = getCurrConnectIngMac();
                                parcel2.writeNoException();
                                parcel2.writeString(currConnectIngMac);
                                break;
                            default:
                                switch (i) {
                                    case 1001:
                                        requestDeviceBattery(parcel.readString());
                                        break;
                                    case 1002:
                                        addOobeStatusListener(IOobeStatusListener.Stub.asInterface(parcel.readStrongBinder()));
                                        break;
                                    case 1003:
                                        setOobeStatue(parcel.readString(), parcel.readInt() != 0);
                                        parcel2.writeNoException();
                                        break;
                                    case 1004:
                                        notifyUnbindStart(parcel.readString(), parcel.readString());
                                        parcel2.writeNoException();
                                        break;
                                    case 1005:
                                        addRefreshDeviceListener(IDeviceRefreshListener.Stub.asInterface(parcel.readStrongBinder()));
                                        break;
                                    case 1006:
                                        removeRefreshDeviceListener(IDeviceRefreshListener.Stub.asInterface(parcel.readStrongBinder()));
                                        break;
                                    case 1007:
                                        notifyPushResult(parcel.readInt() != 0);
                                        break;
                                    case 1008:
                                        addPairMonitor(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                                        break;
                                    case 1009:
                                        removePairMonitor(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                                        break;
                                    case 1010:
                                        addOobeStateEventListener(IOobeStateEventListener.Stub.asInterface(parcel.readStrongBinder()));
                                        break;
                                    case 1011:
                                        addDeviceAppListChangeListener(IDeviceAppListChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                                        break;
                                    case 1012:
                                        removeDeviceAppListChangeListener(IDeviceAppListChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                                        break;
                                    case 1013:
                                        int iFindDeviceAppStatusByMacAndAppIds = findDeviceAppStatusByMacAndAppIds(parcel.readString(), parcel.createIntArray());
                                        parcel2.writeNoException();
                                        parcel2.writeInt(iFindDeviceAppStatusByMacAndAppIds);
                                        break;
                                    case 1014:
                                        AppListBean appListBeanFindDeviceAppListByMac = findDeviceAppListByMac(parcel.readString());
                                        parcel2.writeNoException();
                                        a.f(parcel2, appListBeanFindDeviceAppListByMac, 1);
                                        break;
                                    case 1015:
                                        String deviceBindPhoneMac = getDeviceBindPhoneMac(parcel.readString());
                                        parcel2.writeNoException();
                                        parcel2.writeString(deviceBindPhoneMac);
                                        break;
                                    case 1016:
                                        boolean zIsPairing = isPairing();
                                        parcel2.writeNoException();
                                        parcel2.writeInt(zIsPairing ? 1 : 0);
                                        break;
                                    default:
                                        return super.onTransact(i, parcel, parcel2, i2);
                                }
                                break;
                        }
                        break;
                }
            } else {
                disconnectDeviceByMac((DMPairParams) a.d(parcel, DMPairParams.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class a {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addDeviceAppListChangeListener(IDeviceAppListChangeListener iDeviceAppListChangeListener) throws RemoteException;

    void addDeviceStateListener(IDeviceStateListener iDeviceStateListener) throws RemoteException;

    void addOobeStateEventListener(IOobeStateEventListener iOobeStateEventListener) throws RemoteException;

    void addOobeStatusListener(IOobeStatusListener iOobeStatusListener) throws RemoteException;

    void addPairMonitor(IBinder iBinder, String str, String str2) throws RemoteException;

    void addRefreshDeviceListener(IDeviceRefreshListener iDeviceRefreshListener) throws RemoteException;

    void clearAndDisconnectAll(String str, boolean z) throws RemoteException;

    void connectDeviceByMac(ConnectParams connectParams) throws RemoteException;

    void connectDeviceByPair(DMPairParams dMPairParams) throws RemoteException;

    boolean deleteDeviceByMac(String str) throws RemoteException;

    boolean disableTryConnect(boolean z, String str) throws RemoteException;

    void disconnectDeviceByMac(DMPairParams dMPairParams) throws RemoteException;

    AppListBean findDeviceAppListByMac(String str) throws RemoteException;

    int findDeviceAppStatusByMacAndAppIds(String str, int[] iArr) throws RemoteException;

    UserDeviceInfo getBoundDeviceInfoByMac(String str) throws RemoteException;

    List<UserDeviceInfo> getBoundDeviceInfos() throws RemoteException;

    String getCurrActiveMac() throws RemoteException;

    String getCurrConnectIngMac() throws RemoteException;

    String getDeviceBindPhoneMac(String str) throws RemoteException;

    boolean interceptCacheExist(String str) throws RemoteException;

    boolean isPairing() throws RemoteException;

    void notifyPushResult(boolean z) throws RemoteException;

    void notifyUnbindStart(String str, String str2) throws RemoteException;

    void removeDeviceAppListChangeListener(IDeviceAppListChangeListener iDeviceAppListChangeListener) throws RemoteException;

    void removeDeviceStateListener(IDeviceStateListener iDeviceStateListener) throws RemoteException;

    void removePairMonitor(IBinder iBinder, String str, String str2) throws RemoteException;

    void removeRefreshDeviceListener(IDeviceRefreshListener iDeviceRefreshListener) throws RemoteException;

    void requestDeviceBattery(String str) throws RemoteException;

    void retryConnect(String str) throws RemoteException;

    void setCurrActiveMac(String str, String str2) throws RemoteException;

    void setInterceptDevice(String str, boolean z, String str2) throws RemoteException;

    void setOobeStatue(String str, boolean z) throws RemoteException;

    void updateDeviceConnectState(String str, int i, String str2) throws RemoteException;

    boolean updateDeviceInfo(UserDeviceInfo userDeviceInfo, int i) throws RemoteException;

    boolean updateDeviceInfos(List<UserDeviceInfo> list, String str, int i) throws RemoteException;
}
