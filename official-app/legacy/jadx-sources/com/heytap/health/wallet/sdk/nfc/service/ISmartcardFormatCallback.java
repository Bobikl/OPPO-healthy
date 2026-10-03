package com.heytap.health.wallet.sdk.nfc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface ISmartcardFormatCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback";

    public static class Default implements ISmartcardFormatCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback
        public void onFinished(String str) throws RemoteException {
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback
        public void onProgress(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISmartcardFormatCallback {
        static final int TRANSACTION_onFinished = 2;
        static final int TRANSACTION_onProgress = 1;

        public static class Proxy implements ISmartcardFormatCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISmartcardFormatCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback
            public void onFinished(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardFormatCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback
            public void onProgress(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardFormatCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISmartcardFormatCallback.DESCRIPTOR);
        }

        public static ISmartcardFormatCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartcardFormatCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISmartcardFormatCallback)) ? new Proxy(iBinder) : (ISmartcardFormatCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartcardFormatCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartcardFormatCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onProgress(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFinished(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onFinished(String str) throws RemoteException;

    void onProgress(String str) throws RemoteException;
}
