package com.heytap.health.adaptersdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes15.dex */
public interface IFileCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.adaptersdk.IFileCallback";

    public static class Default implements IFileCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onProgressChanged(String str, FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onTransferCompleted(String str, FileTransferTask fileTransferTask) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onTransferRequested(String str, FileTransferTask fileTransferTask) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFileCallback {
        static final int TRANSACTION_onProgressChanged = 2;
        static final int TRANSACTION_onTransferCompleted = 3;
        static final int TRANSACTION_onTransferRequested = 1;

        public static class Proxy implements IFileCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IFileCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.adaptersdk.IFileCallback
            public void onProgressChanged(String str, FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IFileCallback
            public void onTransferCompleted(String str, FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.IFileCallback
            public void onTransferRequested(String str, FileTransferTask fileTransferTask) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, fileTransferTask, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFileCallback.DESCRIPTOR);
        }

        public static IFileCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IFileCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFileCallback)) ? new Proxy(iBinder) : (IFileCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IFileCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IFileCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onTransferRequested(parcel.readString(), (FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
            } else if (i == 2) {
                onProgressChanged(parcel.readString(), (FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onTransferCompleted(parcel.readString(), (FileTransferTask) a.c(parcel, FileTransferTask.CREATOR));
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

    void onProgressChanged(String str, FileTransferTask fileTransferTask) throws RemoteException;

    void onTransferCompleted(String str, FileTransferTask fileTransferTask) throws RemoteException;

    void onTransferRequested(String str, FileTransferTask fileTransferTask) throws RemoteException;
}
