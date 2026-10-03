package com.oppo.ovoicemanager.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public interface IOVoiceManagerCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oppo.ovoicemanager.service.IOVoiceManagerCallback";

    public static class Default implements IOVoiceManagerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oppo.ovoicemanager.service.IOVoiceManagerCallback
        public int notify(int i) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IOVoiceManagerCallback {
        static final int TRANSACTION_notify = 1;

        public static class Proxy implements IOVoiceManagerCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOVoiceManagerCallback.DESCRIPTOR;
            }

            @Override // com.oppo.ovoicemanager.service.IOVoiceManagerCallback
            public int notify(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOVoiceManagerCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOVoiceManagerCallback.DESCRIPTOR);
        }

        public static IOVoiceManagerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOVoiceManagerCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOVoiceManagerCallback)) ? new Proxy(iBinder) : (IOVoiceManagerCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOVoiceManagerCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOVoiceManagerCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int iNotify = notify(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(iNotify);
            return true;
        }
    }

    int notify(int i) throws RemoteException;
}
