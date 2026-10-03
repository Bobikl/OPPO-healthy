package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.DirectPairInfo;
import com.heytap.accessory.bean.PairSetting;
import com.heytap.accessory.bean.ScanSetting;

/* JADX INFO: loaded from: classes14.dex */
public interface ICentralService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.ICentralService";

    public static class Default implements ICentralService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void cancelPair(DeviceInfo deviceInfo) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void cancelScan() throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public boolean checkDiscoverability(int i) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void checkLocationIsAvailable(IPermissionCallback iPermissionCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public int directPair(DirectPairInfo directPairInfo, IDirectPairCallback iDirectPairCallback) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.ICentralService
        public int earlyPair(DeviceInfo deviceInfo) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void enableDiscoverability(int i, boolean z) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void expEnableDiscoverability(int i, boolean z, long j2) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void findPairedLanDevices(INsdDevicesCallback iNsdDevicesCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void getLanCacheIp(String str, ILanCacheIpServiceCallback iLanCacheIpServiceCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public void saveParameters(Bundle bundle) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.ICentralService
        public int startPair(PairSetting pairSetting, DeviceInfo deviceInfo, IDisPairCallback iDisPairCallback) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.accessory.api.ICentralService
        public int startScan(ScanSetting scanSetting, Bundle bundle, IDisScanCallback iDisScanCallback) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements ICentralService {
        static final int TRANSACTION_cancelPair = 4;
        static final int TRANSACTION_cancelScan = 2;
        static final int TRANSACTION_checkDiscoverability = 7;
        static final int TRANSACTION_checkLocationIsAvailable = 9;
        static final int TRANSACTION_directPair = 8;
        static final int TRANSACTION_earlyPair = 6;
        static final int TRANSACTION_enableDiscoverability = 5;
        static final int TRANSACTION_expEnableDiscoverability = 19;
        static final int TRANSACTION_findPairedLanDevices = 11;
        static final int TRANSACTION_getLanCacheIp = 10;
        static final int TRANSACTION_saveParameters = 12;
        static final int TRANSACTION_startPair = 3;
        static final int TRANSACTION_startScan = 1;

        public static class Proxy implements ICentralService {
            public static ICentralService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void cancelPair(DeviceInfo deviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelPair(deviceInfo);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        deviceInfo.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void cancelScan() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cancelScan();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public boolean checkDiscoverability(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkDiscoverability(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void checkLocationIsAvailable(IPermissionCallback iPermissionCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iPermissionCallback != null ? iPermissionCallback.asBinder() : null);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().checkLocationIsAvailable(iPermissionCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public int directPair(DirectPairInfo directPairInfo, IDirectPairCallback iDirectPairCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (directPairInfo != null) {
                        parcelObtain.writeInt(1);
                        directPairInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDirectPairCallback != null ? iDirectPairCallback.asBinder() : null);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().directPair(directPairInfo, iDirectPairCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public int earlyPair(DeviceInfo deviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().earlyPair(deviceInfo);
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        deviceInfo.readFromParcel(parcelObtain2);
                    }
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void enableDiscoverability(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().enableDiscoverability(i, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void expEnableDiscoverability(int i, boolean z, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeLong(j2);
                    if (this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().expEnableDiscoverability(i, z, j2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void findPairedLanDevices(INsdDevicesCallback iNsdDevicesCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iNsdDevicesCallback != null ? iNsdDevicesCallback.asBinder() : null);
                    if (this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().findPairedLanDevices(iNsdDevicesCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICentralService.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void getLanCacheIp(String str, ILanCacheIpServiceCallback iLanCacheIpServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iLanCacheIpServiceCallback != null ? iLanCacheIpServiceCallback.asBinder() : null);
                    if (this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getLanCacheIp(str, iLanCacheIpServiceCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public void saveParameters(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().saveParameters(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public int startPair(PairSetting pairSetting, DeviceInfo deviceInfo, IDisPairCallback iDisPairCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (pairSetting != null) {
                        parcelObtain.writeInt(1);
                        pairSetting.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDisPairCallback != null ? iDisPairCallback.asBinder() : null);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startPair(pairSetting, deviceInfo, iDisPairCallback);
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        deviceInfo.readFromParcel(parcelObtain2);
                    }
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.ICentralService
            public int startScan(ScanSetting scanSetting, Bundle bundle, IDisScanCallback iDisScanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICentralService.DESCRIPTOR);
                    if (scanSetting != null) {
                        parcelObtain.writeInt(1);
                        scanSetting.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDisScanCallback != null ? iDisScanCallback.asBinder() : null);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startScan(scanSetting, bundle, iDisScanCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICentralService.DESCRIPTOR);
        }

        public static ICentralService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICentralService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICentralService)) ? new Proxy(iBinder) : (ICentralService) iInterfaceQueryLocalInterface;
        }

        public static ICentralService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICentralService iCentralService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iCentralService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCentralService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(ICentralService.DESCRIPTOR);
                return true;
            }
            if (i == 19) {
                parcel.enforceInterface(ICentralService.DESCRIPTOR);
                expEnableDiscoverability(parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    int iStartScan = startScan(parcel.readInt() != 0 ? ScanSetting.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDisScanCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartScan);
                    return true;
                case 2:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    cancelScan();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    PairSetting pairSettingCreateFromParcel = parcel.readInt() != 0 ? PairSetting.CREATOR.createFromParcel(parcel) : null;
                    DeviceInfo deviceInfoCreateFromParcel = parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null;
                    int iStartPair = startPair(pairSettingCreateFromParcel, deviceInfoCreateFromParcel, IDisPairCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartPair);
                    if (deviceInfoCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        deviceInfoCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    DeviceInfo deviceInfoCreateFromParcel2 = parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null;
                    cancelPair(deviceInfoCreateFromParcel2);
                    parcel2.writeNoException();
                    if (deviceInfoCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        deviceInfoCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    enableDiscoverability(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    DeviceInfo deviceInfoCreateFromParcel3 = parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null;
                    int iEarlyPair = earlyPair(deviceInfoCreateFromParcel3);
                    parcel2.writeNoException();
                    parcel2.writeInt(iEarlyPair);
                    if (deviceInfoCreateFromParcel3 != null) {
                        parcel2.writeInt(1);
                        deviceInfoCreateFromParcel3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    boolean zCheckDiscoverability = checkDiscoverability(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckDiscoverability ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    int iDirectPair = directPair(parcel.readInt() != 0 ? DirectPairInfo.CREATOR.createFromParcel(parcel) : null, IDirectPairCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iDirectPair);
                    return true;
                case 9:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    checkLocationIsAvailable(IPermissionCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    getLanCacheIp(parcel.readString(), ILanCacheIpServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    findPairedLanDevices(INsdDevicesCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(ICentralService.DESCRIPTOR);
                    saveParameters(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void cancelPair(DeviceInfo deviceInfo) throws RemoteException;

    void cancelScan() throws RemoteException;

    boolean checkDiscoverability(int i) throws RemoteException;

    void checkLocationIsAvailable(IPermissionCallback iPermissionCallback) throws RemoteException;

    int directPair(DirectPairInfo directPairInfo, IDirectPairCallback iDirectPairCallback) throws RemoteException;

    int earlyPair(DeviceInfo deviceInfo) throws RemoteException;

    void enableDiscoverability(int i, boolean z) throws RemoteException;

    void expEnableDiscoverability(int i, boolean z, long j2) throws RemoteException;

    void findPairedLanDevices(INsdDevicesCallback iNsdDevicesCallback) throws RemoteException;

    void getLanCacheIp(String str, ILanCacheIpServiceCallback iLanCacheIpServiceCallback) throws RemoteException;

    void saveParameters(Bundle bundle) throws RemoteException;

    int startPair(PairSetting pairSetting, DeviceInfo deviceInfo, IDisPairCallback iDisPairCallback) throws RemoteException;

    int startScan(ScanSetting scanSetting, Bundle bundle, IDisScanCallback iDisScanCallback) throws RemoteException;
}
