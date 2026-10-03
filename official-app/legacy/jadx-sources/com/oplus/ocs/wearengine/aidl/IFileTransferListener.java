package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IFileTransferListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IFileTransferListener";

    public static class Default implements IFileTransferListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IFileTransferListener
        public void onProgressChanged(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.ocs.wearengine.aidl.IFileTransferListener
        public void onTransferCompleted(String str, String str2, int i) throws RemoteException {
        }

        @Override // com.oplus.ocs.wearengine.aidl.IFileTransferListener
        public void onTransferRequested(String str, long j2, String str2, String str3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFileTransferListener {
        static final int TRANSACTION_onProgressChanged = 2;
        static final int TRANSACTION_onTransferCompleted = 3;
        static final int TRANSACTION_onTransferRequested = 1;

        public static class Proxy implements IFileTransferListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IFileTransferListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IFileTransferListener
            public void onProgressChanged(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileTransferListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IFileTransferListener
            public void onTransferCompleted(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileTransferListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IFileTransferListener
            public void onTransferRequested(String str, long j2, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileTransferListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFileTransferListener.DESCRIPTOR);
        }

        public static IFileTransferListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IFileTransferListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFileTransferListener)) ? new Proxy(iBinder) : (IFileTransferListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IFileTransferListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IFileTransferListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onTransferRequested(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            } else if (i == 2) {
                onProgressChanged(parcel.readString(), parcel.readInt());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onTransferCompleted(parcel.readString(), parcel.readString(), parcel.readInt());
            }
            return true;
        }
    }

    void onProgressChanged(String str, int i) throws RemoteException;

    void onTransferCompleted(String str, String str2, int i) throws RemoteException;

    void onTransferRequested(String str, long j2, String str2, String str3) throws RemoteException;
}
