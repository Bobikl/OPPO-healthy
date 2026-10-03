package com.heytap.health.device.ota;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.device.ota.bean.OTAStatus;

/* JADX INFO: loaded from: classes16.dex */
public interface IOTAUpdateCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.device.ota.IOTAUpdateCallback";

    public static class Default implements IOTAUpdateCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.device.ota.IOTAUpdateCallback
        public void onUpdateProgress(OTAStatus oTAStatus) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOTAUpdateCallback {
        static final int TRANSACTION_onUpdateProgress = 1;

        public static class Proxy implements IOTAUpdateCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOTAUpdateCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.device.ota.IOTAUpdateCallback
            public void onUpdateProgress(OTAStatus oTAStatus) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTAUpdateCallback.DESCRIPTOR);
                    a.d(parcelObtain, oTAStatus, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOTAUpdateCallback.DESCRIPTOR);
        }

        public static IOTAUpdateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOTAUpdateCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOTAUpdateCallback)) ? new Proxy(iBinder) : (IOTAUpdateCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOTAUpdateCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOTAUpdateCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onUpdateProgress((OTAStatus) a.c(parcel, OTAStatus.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onUpdateProgress(OTAStatus oTAStatus) throws RemoteException;
}
