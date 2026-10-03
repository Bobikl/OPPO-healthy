package com.heytap.sporthealth.fit.dtrain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.sporthealth.fit.dtrain.callback.IDownloadCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface ITrainCable extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.sporthealth.fit.dtrain.ITrainCable";

    public static class Default implements ITrainCable {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.sporthealth.fit.dtrain.ITrainCable
        public float getDownloadProgress(String[] strArr) throws RemoteException {
            return 0.0f;
        }

        @Override // com.heytap.sporthealth.fit.dtrain.ITrainCable
        public void pauseDownload(String[] strArr, String str, String str2) throws RemoteException {
        }

        @Override // com.heytap.sporthealth.fit.dtrain.ITrainCable
        public void toDownloading(String[] strArr, String str, String str2, IDownloadCallback iDownloadCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITrainCable {
        static final int TRANSACTION_getDownloadProgress = 1;
        static final int TRANSACTION_pauseDownload = 3;
        static final int TRANSACTION_toDownloading = 2;

        public static class Proxy implements ITrainCable {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.sporthealth.fit.dtrain.ITrainCable
            public float getDownloadProgress(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrainCable.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readFloat();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ITrainCable.DESCRIPTOR;
            }

            @Override // com.heytap.sporthealth.fit.dtrain.ITrainCable
            public void pauseDownload(String[] strArr, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrainCable.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.sporthealth.fit.dtrain.ITrainCable
            public void toDownloading(String[] strArr, String str, String str2, IDownloadCallback iDownloadCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrainCable.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iDownloadCallback);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITrainCable.DESCRIPTOR);
        }

        public static ITrainCable asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrainCable.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrainCable)) ? new Proxy(iBinder) : (ITrainCable) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITrainCable.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITrainCable.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                float downloadProgress = getDownloadProgress(parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeFloat(downloadProgress);
            } else if (i == 2) {
                toDownloading(parcel.createStringArray(), parcel.readString(), parcel.readString(), IDownloadCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                pauseDownload(parcel.createStringArray(), parcel.readString(), parcel.readString());
            }
            return true;
        }
    }

    float getDownloadProgress(String[] strArr) throws RemoteException;

    void pauseDownload(String[] strArr, String str, String str2) throws RemoteException;

    void toDownloading(String[] strArr, String str, String str2, IDownloadCallback iDownloadCallback) throws RemoteException;
}
