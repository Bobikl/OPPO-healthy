package com.heytap.deviceinfo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes15.dex */
public interface DeviceAppCallbackInterface extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.deviceinfo.DeviceAppCallbackInterface";

    public static class Default implements DeviceAppCallbackInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.deviceinfo.DeviceAppCallbackInterface
        public Bundle call(int i, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements DeviceAppCallbackInterface {
        static final int TRANSACTION_call = 1;

        public static class Proxy implements DeviceAppCallbackInterface {
            public static DeviceAppCallbackInterface sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.deviceinfo.DeviceAppCallbackInterface
            public Bundle call(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DeviceAppCallbackInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().call(i, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return DeviceAppCallbackInterface.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DeviceAppCallbackInterface.DESCRIPTOR);
        }

        public static DeviceAppCallbackInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DeviceAppCallbackInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof DeviceAppCallbackInterface)) ? new Proxy(iBinder) : (DeviceAppCallbackInterface) iInterfaceQueryLocalInterface;
        }

        public static DeviceAppCallbackInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(DeviceAppCallbackInterface deviceAppCallbackInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (deviceAppCallbackInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = deviceAppCallbackInterface;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DeviceAppCallbackInterface.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DeviceAppCallbackInterface.DESCRIPTOR);
            Bundle bundleCall = call(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (bundleCall != null) {
                parcel2.writeInt(1);
                bundleCall.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    Bundle call(int i, Bundle bundle) throws RemoteException;
}
