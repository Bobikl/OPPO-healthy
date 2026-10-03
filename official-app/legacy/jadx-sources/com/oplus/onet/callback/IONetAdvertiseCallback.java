package com.oplus.onet.callback;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public interface IONetAdvertiseCallback extends IInterface {

    public static class Default implements IONetAdvertiseCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public void onAdvertiseFailure(Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public void onAdvertiseStart(Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public void onAdvertiseStopped(Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public void onAdvertiseSuccess(Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public int onPairFailure(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public int onPairSuccess(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public int onRequestAuthenticate(ONetDevice oNetDevice, ONetAuthenticateMessage oNetAuthenticateMessage) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.onet.callback.IONetAdvertiseCallback
        public int onRequestConnect(ONetDevice oNetDevice, ONetConnectMessage oNetConnectMessage) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IONetAdvertiseCallback {
        private static final String DESCRIPTOR = "com.oplus.onet.callback.IONetAdvertiseCallback";
        public static final int TRANSACTION_onAdvertiseFailure = 3;
        public static final int TRANSACTION_onAdvertiseStart = 1;
        public static final int TRANSACTION_onAdvertiseStopped = 4;
        public static final int TRANSACTION_onAdvertiseSuccess = 2;
        public static final int TRANSACTION_onPairFailure = 8;
        public static final int TRANSACTION_onPairSuccess = 7;
        public static final int TRANSACTION_onRequestAuthenticate = 6;
        public static final int TRANSACTION_onRequestConnect = 5;

        public static class Proxy implements IONetAdvertiseCallback {
            public static IONetAdvertiseCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public void onAdvertiseFailure(Bundle bundle) throws RemoteException {
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
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseFailure(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public void onAdvertiseStart(Bundle bundle) throws RemoteException {
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
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseStart(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public void onAdvertiseStopped(Bundle bundle) throws RemoteException {
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
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseStopped(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public void onAdvertiseSuccess(Bundle bundle) throws RemoteException {
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
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseSuccess(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public int onPairFailure(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
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
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onPairFailure(oNetDevice, i, bundle);
                    }
                    parcelObtain2.readException();
                    int i2 = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return i2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public int onPairSuccess(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
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
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onPairSuccess(oNetDevice, bundle);
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public int onRequestAuthenticate(ONetDevice oNetDevice, ONetAuthenticateMessage oNetAuthenticateMessage) throws RemoteException {
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
                    if (oNetAuthenticateMessage != null) {
                        parcelObtain.writeInt(1);
                        oNetAuthenticateMessage.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onRequestAuthenticate(oNetDevice, oNetAuthenticateMessage);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.IONetAdvertiseCallback
            public int onRequestConnect(ONetDevice oNetDevice, ONetConnectMessage oNetConnectMessage) throws RemoteException {
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
                    if (oNetConnectMessage != null) {
                        parcelObtain.writeInt(1);
                        oNetConnectMessage.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onRequestConnect(oNetDevice, oNetConnectMessage);
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
            attachInterface(this, DESCRIPTOR);
        }

        public static IONetAdvertiseCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IONetAdvertiseCallback)) ? new Proxy(iBinder) : (IONetAdvertiseCallback) iInterfaceQueryLocalInterface;
        }

        public static IONetAdvertiseCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IONetAdvertiseCallback iONetAdvertiseCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iONetAdvertiseCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iONetAdvertiseCallback;
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
                    onAdvertiseStart(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAdvertiseSuccess(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAdvertiseFailure(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onAdvertiseStopped(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iOnRequestConnect = onRequestConnect(parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ONetConnectMessage.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnRequestConnect);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iOnRequestAuthenticate = onRequestAuthenticate(parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ONetAuthenticateMessage.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnRequestAuthenticate);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    int iOnPairSuccess = onPairSuccess(oNetDeviceCreateFromParcel, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnPairSuccess);
                    if (bundle != null) {
                        parcel2.writeInt(1);
                        bundle.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel2 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    int i3 = parcel.readInt();
                    Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    int iOnPairFailure = onPairFailure(oNetDeviceCreateFromParcel2, i3, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnPairFailure);
                    if (bundle2 != null) {
                        parcel2.writeInt(1);
                        bundle2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onAdvertiseFailure(Bundle bundle) throws RemoteException;

    void onAdvertiseStart(Bundle bundle) throws RemoteException;

    void onAdvertiseStopped(Bundle bundle) throws RemoteException;

    void onAdvertiseSuccess(Bundle bundle) throws RemoteException;

    int onPairFailure(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException;

    int onPairSuccess(ONetDevice oNetDevice, Bundle bundle) throws RemoteException;

    int onRequestAuthenticate(ONetDevice oNetDevice, ONetAuthenticateMessage oNetAuthenticateMessage) throws RemoteException;

    int onRequestConnect(ONetDevice oNetDevice, ONetConnectMessage oNetConnectMessage) throws RemoteException;
}
