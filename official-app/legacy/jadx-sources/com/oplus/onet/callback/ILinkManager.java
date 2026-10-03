package com.oplus.onet.callback;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public interface ILinkManager extends IInterface {

    public static class Default implements ILinkManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public void onDeviceConnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public void onDeviceDisconnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public void onDormant(ONetDevice oNetDevice, boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public void onError(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public void onLinkManagerReady() throws RemoteException {
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public byte[] onPairData(int i, int i2, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.onet.callback.ILinkManager
        public int onPairTypeReceived(ONetDevice oNetDevice, int i) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements ILinkManager {
        private static final String DESCRIPTOR = "com.oplus.onet.callback.ILinkManager";
        public static final int TRANSACTION_onDeviceConnected = 4;
        public static final int TRANSACTION_onDeviceDisconnected = 5;
        public static final int TRANSACTION_onDormant = 6;
        public static final int TRANSACTION_onError = 7;
        public static final int TRANSACTION_onLinkManagerReady = 1;
        public static final int TRANSACTION_onPairData = 2;
        public static final int TRANSACTION_onPairTypeReceived = 3;

        public static class Proxy implements ILinkManager {
            public static ILinkManager sDefaultImpl;
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

            @Override // com.oplus.onet.callback.ILinkManager
            public void onDeviceConnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDeviceConnected(oNetDevice, bundle);
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

            @Override // com.oplus.onet.callback.ILinkManager
            public void onDeviceDisconnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDeviceDisconnected(oNetDevice, bundle);
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

            @Override // com.oplus.onet.callback.ILinkManager
            public void onDormant(ONetDevice oNetDevice, boolean z, Bundle bundle) throws RemoteException {
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
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDormant(oNetDevice, z, bundle);
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

            @Override // com.oplus.onet.callback.ILinkManager
            public void onError(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onError(oNetDevice, i, bundle);
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

            @Override // com.oplus.onet.callback.ILinkManager
            public void onLinkManagerReady() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onLinkManagerReady();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.ILinkManager
            public byte[] onPairData(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onPairData(i, i2, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.callback.ILinkManager
            public int onPairTypeReceived(ONetDevice oNetDevice, int i) throws RemoteException {
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
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onPairTypeReceived(oNetDevice, i);
                    }
                    parcelObtain2.readException();
                    int i2 = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        oNetDevice.readFromParcel(parcelObtain2);
                    }
                    return i2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ILinkManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILinkManager)) ? new Proxy(iBinder) : (ILinkManager) iInterfaceQueryLocalInterface;
        }

        public static ILinkManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ILinkManager iLinkManager) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iLinkManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iLinkManager;
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
                    onLinkManagerReady();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] bArrOnPairData = onPairData(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrOnPairData);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    int iOnPairTypeReceived = onPairTypeReceived(oNetDeviceCreateFromParcel, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnPairTypeReceived);
                    if (oNetDeviceCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel2 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    onDeviceConnected(oNetDeviceCreateFromParcel2, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel3 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    onDeviceDisconnected(oNetDeviceCreateFromParcel3, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel3 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel4 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    onDormant(oNetDeviceCreateFromParcel4, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel4 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    ONetDevice oNetDeviceCreateFromParcel5 = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                    onError(oNetDeviceCreateFromParcel5, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (oNetDeviceCreateFromParcel5 != null) {
                        parcel2.writeInt(1);
                        oNetDeviceCreateFromParcel5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onDeviceConnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException;

    void onDeviceDisconnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException;

    void onDormant(ONetDevice oNetDevice, boolean z, Bundle bundle) throws RemoteException;

    void onError(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException;

    void onLinkManagerReady() throws RemoteException;

    byte[] onPairData(int i, int i2, Bundle bundle) throws RemoteException;

    int onPairTypeReceived(ONetDevice oNetDevice, int i) throws RemoteException;
}
