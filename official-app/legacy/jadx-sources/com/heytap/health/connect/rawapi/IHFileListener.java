package com.heytap.health.connect.rawapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes15.dex */
public interface IHFileListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.connect.rawapi.IHFileListener";

    public static class Default implements IHFileListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHFileListener
        public void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHFileListener
        public void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHFileListener
        public void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHFileListener {
        static final int TRANSACTION_onTransferComplete = 3;
        static final int TRANSACTION_onTransferProgress = 2;
        static final int TRANSACTION_onTransferRequested = 1;

        public static class Proxy implements IHFileListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IHFileListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.connect.rawapi.IHFileListener
            public void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHFileListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHFileListener
            public void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHFileListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHFileListener
            public void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHFileListener.DESCRIPTOR);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHFileListener.DESCRIPTOR);
        }

        public static IHFileListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHFileListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHFileListener)) ? new Proxy(iBinder) : (IHFileListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHFileListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHFileListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onTransferRequested((FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                onTransferProgress((FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onTransferComplete((FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
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

    void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException;

    void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException;

    void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException;
}
