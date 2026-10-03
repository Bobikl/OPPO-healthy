package com.heytap.sporthealth.fit.dtrain.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IDownloadCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.sporthealth.fit.dtrain.callback.IDownloadCallback";

    public static class Default implements IDownloadCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.sporthealth.fit.dtrain.callback.IDownloadCallback
        public void downloadResponse(float f) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadCallback {
        static final int TRANSACTION_downloadResponse = 1;

        public static class Proxy implements IDownloadCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.sporthealth.fit.dtrain.callback.IDownloadCallback
            public void downloadResponse(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDownloadCallback.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDownloadCallback.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IDownloadCallback.DESCRIPTOR);
        }

        public static IDownloadCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDownloadCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDownloadCallback)) ? new Proxy(iBinder) : (IDownloadCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDownloadCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDownloadCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            downloadResponse(parcel.readFloat());
            return true;
        }
    }

    void downloadResponse(float f) throws RemoteException;
}
