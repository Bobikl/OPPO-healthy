package com.oplus.onet.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public interface IDeviceManager extends IInterface {

    public static class Default implements IDeviceManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.callback.IDeviceManager
        public void onDeviceFound(ONetDevice oNetDevice) throws RemoteException {
        }

        @Override // com.oplus.onet.callback.IDeviceManager
        public void onDeviceLeave(ONetDevice oNetDevice) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceManager {
        private static final String DESCRIPTOR = "com.oplus.onet.callback.IDeviceManager";
        public static final int TRANSACTION_onDeviceFound = 1;
        public static final int TRANSACTION_onDeviceLeave = 2;

        public static class Proxy implements IDeviceManager {
            public static IDeviceManager sDefaultImpl;
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

            @Override // com.oplus.onet.callback.IDeviceManager
            public void onDeviceFound(ONetDevice oNetDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDeviceFound(oNetDevice);
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

            @Override // com.oplus.onet.callback.IDeviceManager
            public void onDeviceLeave(ONetDevice oNetDevice) throws RemoteException {
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
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDeviceLeave(oNetDevice);
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDeviceManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceManager)) ? new Proxy(iBinder) : (IDeviceManager) iInterfaceQueryLocalInterface;
        }

        public static IDeviceManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceManager iDeviceManager) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDeviceManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            ONetDevice oNetDeviceCreateFromParcel;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                oNetDeviceCreateFromParcel = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
                onDeviceFound(oNetDeviceCreateFromParcel);
                parcel2.writeNoException();
                if (oNetDeviceCreateFromParcel != null) {
                    parcel2.writeInt(1);
                    oNetDeviceCreateFromParcel.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            oNetDeviceCreateFromParcel = parcel.readInt() != 0 ? ONetDevice.CREATOR.createFromParcel(parcel) : null;
            onDeviceLeave(oNetDeviceCreateFromParcel);
            parcel2.writeNoException();
            if (oNetDeviceCreateFromParcel != null) {
                parcel2.writeInt(1);
                oNetDeviceCreateFromParcel.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void onDeviceFound(ONetDevice oNetDevice) throws RemoteException;

    void onDeviceLeave(ONetDevice oNetDevice) throws RemoteException;
}
