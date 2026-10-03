package com.oplus.onet.obcommon;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IWifiSupport extends IInterface {

    public static class Default implements IWifiSupport {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.obcommon.IWifiSupport
        public void finalizeClient(byte[] bArr, IServerCallback iServerCallback) throws RemoteException {
        }

        @Override // com.oplus.onet.obcommon.IWifiSupport
        public List<WifiConfig> getRecordWifiConfigs(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.obcommon.IWifiSupport
        public int getServiceVersion() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.obcommon.IWifiSupport
        public WifiConfig getSoftAPWifiConfig(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.obcommon.IWifiSupport
        public WifiConfig getWifiConfig(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.obcommon.IWifiSupport
        public void initializeServer(String str, int i, byte[] bArr, IServerCallback iServerCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWifiSupport {
        private static final String DESCRIPTOR = "com.oplus.onet.obcommon.IWifiSupport";
        public static final int TRANSACTION_finalizeClient = 2;
        public static final int TRANSACTION_getRecordWifiConfigs = 5;
        public static final int TRANSACTION_getServiceVersion = 3;
        public static final int TRANSACTION_getSoftAPWifiConfig = 6;
        public static final int TRANSACTION_getWifiConfig = 4;
        public static final int TRANSACTION_initializeServer = 1;

        public static class Proxy implements IWifiSupport {
            public static IWifiSupport sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.onet.obcommon.IWifiSupport
            public void finalizeClient(byte[] bArr, IServerCallback iServerCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iServerCallback != null ? iServerCallback.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().finalizeClient(bArr, iServerCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.onet.obcommon.IWifiSupport
            public List<WifiConfig> getRecordWifiConfigs(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRecordWifiConfigs(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(WifiConfig.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.obcommon.IWifiSupport
            public int getServiceVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getServiceVersion();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.obcommon.IWifiSupport
            public WifiConfig getSoftAPWifiConfig(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSoftAPWifiConfig(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? WifiConfig.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.obcommon.IWifiSupport
            public WifiConfig getWifiConfig(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getWifiConfig(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? WifiConfig.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.obcommon.IWifiSupport
            public void initializeServer(String str, int i, byte[] bArr, IServerCallback iServerCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongBinder(iServerCallback != null ? iServerCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().initializeServer(str, i, bArr, iServerCallback);
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

        public static IWifiSupport asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWifiSupport)) ? new Proxy(iBinder) : (IWifiSupport) iInterfaceQueryLocalInterface;
        }

        public static IWifiSupport getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IWifiSupport iWifiSupport) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWifiSupport == null) {
                return false;
            }
            Proxy.sDefaultImpl = iWifiSupport;
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
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    initializeServer(parcel.readString(), parcel.readInt(), parcel.createByteArray(), IServerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    finalizeClient(parcel.createByteArray(), IServerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int serviceVersion = getServiceVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceVersion);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    WifiConfig wifiConfig = getWifiConfig(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (wifiConfig != null) {
                        parcel2.writeInt(1);
                        wifiConfig.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<WifiConfig> recordWifiConfigs = getRecordWifiConfigs(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(recordWifiConfigs);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    WifiConfig softAPWifiConfig = getSoftAPWifiConfig(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (softAPWifiConfig != null) {
                        parcel2.writeInt(1);
                        softAPWifiConfig.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void finalizeClient(byte[] bArr, IServerCallback iServerCallback) throws RemoteException;

    List<WifiConfig> getRecordWifiConfigs(Bundle bundle) throws RemoteException;

    int getServiceVersion() throws RemoteException;

    WifiConfig getSoftAPWifiConfig(Bundle bundle) throws RemoteException;

    WifiConfig getWifiConfig(Bundle bundle) throws RemoteException;

    void initializeServer(String str, int i, byte[] bArr, IServerCallback iServerCallback) throws RemoteException;
}
