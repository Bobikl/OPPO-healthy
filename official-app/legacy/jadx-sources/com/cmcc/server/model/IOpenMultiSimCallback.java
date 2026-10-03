package com.cmcc.server.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface IOpenMultiSimCallback extends IInterface {
    public static final String DESCRIPTOR = "com.cmcc.server.model.IOpenMultiSimCallback";

    public static class Default implements IOpenMultiSimCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.cmcc.server.model.IOpenMultiSimCallback
        public void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
        }

        @Override // com.cmcc.server.model.IOpenMultiSimCallback
        public void getProfileDownloadStatus(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenMultiSimCallback {
        static final int TRANSACTION_getDeviceMultiSimInfo = 1;
        static final int TRANSACTION_getProfileDownloadStatus = 2;

        public static class Proxy implements IOpenMultiSimCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.cmcc.server.model.IOpenMultiSimCallback
            public void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSimCallback.DESCRIPTOR);
                    a.d(parcelObtain, multiSimDeviceInfo, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOpenMultiSimCallback.DESCRIPTOR;
            }

            @Override // com.cmcc.server.model.IOpenMultiSimCallback
            public void getProfileDownloadStatus(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSimCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOpenMultiSimCallback.DESCRIPTOR);
        }

        public static IOpenMultiSimCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenMultiSimCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenMultiSimCallback)) ? new Proxy(iBinder) : (IOpenMultiSimCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenMultiSimCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenMultiSimCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getDeviceMultiSimInfo((MultiSimDeviceInfo) a.c(parcel, MultiSimDeviceInfo.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                getProfileDownloadStatus(parcel.readInt());
                parcel2.writeNoException();
            }
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

    void getDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException;

    void getProfileDownloadStatus(int i) throws RemoteException;
}
