package com.heytap.health.watch.contactsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IContactSync extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.contactsync.aidl.IContactSync";

    public static class Default implements IContactSync {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public String getConnectedMacAddress() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public String getPreSyncDoneMacAddress() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public void postSwitchTimeoutCallback(int i) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public void registerContentObserver() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public void removeSwitchTimeoutCallback() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public void setConnectedMacAddress(String str) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public void setPreSyncDoneMacAddress(String str) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
        public void unRegisterContentObserver(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IContactSync {
        static final int TRANSACTION_getConnectedMacAddress = 4;
        static final int TRANSACTION_getPreSyncDoneMacAddress = 8;
        static final int TRANSACTION_postSwitchTimeoutCallback = 7;
        static final int TRANSACTION_registerContentObserver = 2;
        static final int TRANSACTION_removeSwitchTimeoutCallback = 6;
        static final int TRANSACTION_setConnectedMacAddress = 5;
        static final int TRANSACTION_setPreSyncDoneMacAddress = 9;
        static final int TRANSACTION_unRegisterContentObserver = 3;

        public static class Proxy implements IContactSync {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public String getConnectedMacAddress() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IContactSync.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public String getPreSyncDoneMacAddress() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public void postSwitchTimeoutCallback(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public void registerContentObserver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public void removeSwitchTimeoutCallback() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public void setConnectedMacAddress(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public void setPreSyncDoneMacAddress(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
            public void unRegisterContentObserver(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSync.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IContactSync.DESCRIPTOR);
        }

        public static IContactSync asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IContactSync.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IContactSync)) ? new Proxy(iBinder) : (IContactSync) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IContactSync.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IContactSync.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 2:
                    registerContentObserver();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    unRegisterContentObserver(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    String connectedMacAddress = getConnectedMacAddress();
                    parcel2.writeNoException();
                    parcel2.writeString(connectedMacAddress);
                    return true;
                case 5:
                    setConnectedMacAddress(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    removeSwitchTimeoutCallback();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    postSwitchTimeoutCallback(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String preSyncDoneMacAddress = getPreSyncDoneMacAddress();
                    parcel2.writeNoException();
                    parcel2.writeString(preSyncDoneMacAddress);
                    return true;
                case 9:
                    setPreSyncDoneMacAddress(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String getConnectedMacAddress() throws RemoteException;

    String getPreSyncDoneMacAddress() throws RemoteException;

    void postSwitchTimeoutCallback(int i) throws RemoteException;

    void registerContentObserver() throws RemoteException;

    void removeSwitchTimeoutCallback() throws RemoteException;

    void setConnectedMacAddress(String str) throws RemoteException;

    void setPreSyncDoneMacAddress(String str) throws RemoteException;

    void unRegisterContentObserver(int i) throws RemoteException;
}
