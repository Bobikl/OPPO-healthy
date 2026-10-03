package com.heytap.deviceinfo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes15.dex */
public interface MyDevicesInterface extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.deviceinfo.MyDevicesInterface";

    public static class Default implements MyDevicesInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.deviceinfo.MyDevicesInterface
        public Bundle call(int i, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.heytap.deviceinfo.MyDevicesInterface
        public void setDeviceAppCallback(IBinder iBinder, String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements MyDevicesInterface {
        static final int TRANSACTION_call = 2;
        static final int TRANSACTION_setDeviceAppCallback = 1;

        public static class Proxy implements MyDevicesInterface {
            public static MyDevicesInterface sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.deviceinfo.MyDevicesInterface
            public Bundle call(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(MyDevicesInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
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
                return MyDevicesInterface.DESCRIPTOR;
            }

            @Override // com.heytap.deviceinfo.MyDevicesInterface
            public void setDeviceAppCallback(IBinder iBinder, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(MyDevicesInterface.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDeviceAppCallback(iBinder, str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, MyDevicesInterface.DESCRIPTOR);
        }

        public static MyDevicesInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(MyDevicesInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof MyDevicesInterface)) ? new Proxy(iBinder) : (MyDevicesInterface) iInterfaceQueryLocalInterface;
        }

        public static MyDevicesInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(MyDevicesInterface myDevicesInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (myDevicesInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = myDevicesInterface;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(MyDevicesInterface.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(MyDevicesInterface.DESCRIPTOR);
                setDeviceAppCallback(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(MyDevicesInterface.DESCRIPTOR);
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

    void setDeviceAppCallback(IBinder iBinder, String str, String str2) throws RemoteException;
}
