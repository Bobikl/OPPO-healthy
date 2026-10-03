package com.heytap.health.device.ota;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IOTASyncMain extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.device.ota.IOTASyncMain";

    public static class Default implements IOTASyncMain {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.device.ota.IOTASyncMain
        public void onProgressClick() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOTASyncMain {
        static final int TRANSACTION_onProgressClick = 1;

        public static class Proxy implements IOTASyncMain {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOTASyncMain.DESCRIPTOR;
            }

            @Override // com.heytap.health.device.ota.IOTASyncMain
            public void onProgressClick() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTASyncMain.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOTASyncMain.DESCRIPTOR);
        }

        public static IOTASyncMain asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOTASyncMain.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOTASyncMain)) ? new Proxy(iBinder) : (IOTASyncMain) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOTASyncMain.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOTASyncMain.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onProgressClick();
            parcel2.writeNoException();
            return true;
        }
    }

    void onProgressClick() throws RemoteException;
}
