package com.heytap.health.watch.contactsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IContactSyncListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.contactsync.aidl.IContactSyncListener";

    public static class Default implements IContactSyncListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
        public void onContactChange() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
        public void onContactSyncDone(boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
        public void onSwitchSyncModelChange(boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
        public void onSyncing() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
        public void onWatchSyncModel() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IContactSyncListener {
        static final int TRANSACTION_onContactChange = 4;
        static final int TRANSACTION_onContactSyncDone = 2;
        static final int TRANSACTION_onSwitchSyncModelChange = 3;
        static final int TRANSACTION_onSyncing = 6;
        static final int TRANSACTION_onWatchSyncModel = 5;

        public static class Proxy implements IContactSyncListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IContactSyncListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
            public void onContactChange() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncListener.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
            public void onContactSyncDone(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncListener.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
            public void onSwitchSyncModelChange(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncListener.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
            public void onSyncing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncListener.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncListener
            public void onWatchSyncModel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncListener.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IContactSyncListener.DESCRIPTOR);
        }

        public static IContactSyncListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IContactSyncListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IContactSyncListener)) ? new Proxy(iBinder) : (IContactSyncListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IContactSyncListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IContactSyncListener.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                onContactSyncDone(parcel.readInt() != 0);
                parcel2.writeNoException();
            } else if (i == 3) {
                onSwitchSyncModelChange(parcel.readInt() != 0);
                parcel2.writeNoException();
            } else if (i == 4) {
                onContactChange();
                parcel2.writeNoException();
            } else if (i == 5) {
                onWatchSyncModel();
                parcel2.writeNoException();
            } else {
                if (i != 6) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSyncing();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onContactChange() throws RemoteException;

    void onContactSyncDone(boolean z) throws RemoteException;

    void onSwitchSyncModelChange(boolean z) throws RemoteException;

    void onSyncing() throws RemoteException;

    void onWatchSyncModel() throws RemoteException;
}
