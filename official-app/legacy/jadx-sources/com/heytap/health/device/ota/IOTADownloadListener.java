package com.heytap.health.device.ota;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IOTADownloadListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.device.ota.IOTADownloadListener";

    public static class Default implements IOTADownloadListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.device.ota.IOTADownloadListener
        public void onComplete() throws RemoteException {
        }

        @Override // com.heytap.health.device.ota.IOTADownloadListener
        public void onError(String str) throws RemoteException {
        }

        @Override // com.heytap.health.device.ota.IOTADownloadListener
        public void onProgress(float f) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOTADownloadListener {
        static final int TRANSACTION_onComplete = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onProgress = 1;

        public static class Proxy implements IOTADownloadListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOTADownloadListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.device.ota.IOTADownloadListener
            public void onComplete() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTADownloadListener.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.device.ota.IOTADownloadListener
            public void onError(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTADownloadListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.device.ota.IOTADownloadListener
            public void onProgress(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOTADownloadListener.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOTADownloadListener.DESCRIPTOR);
        }

        public static IOTADownloadListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOTADownloadListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOTADownloadListener)) ? new Proxy(iBinder) : (IOTADownloadListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOTADownloadListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOTADownloadListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onProgress(parcel.readFloat());
                parcel2.writeNoException();
            } else if (i == 2) {
                onComplete();
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onComplete() throws RemoteException;

    void onError(String str) throws RemoteException;

    void onProgress(float f) throws RemoteException;
}
