package com.heytap.health.watch.contactsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
public interface IContactSyncOnce extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.contactsync.aidl.IContactSyncOnce";

    public static class Default implements IContactSyncOnce {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onBlockedNumChange() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onBondConnected(Node node, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onContactSyncAction(String str, int i, int i2) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onContactsChange() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onContactsSyncDone(boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onDeviceMigrate(Node node) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onMessageReceived(MessageEvent messageEvent) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onNodeConnected(Node node) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onPeerDisconnected(Node node) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void onSwitchTimeout(int i) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void registerContactSyncListener(IContactSyncListener iContactSyncListener) throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void registerContactsSyncDone() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void sendContactsSortMessage() throws RemoteException {
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
        public void unregisterContactSyncListener(IContactSyncListener iContactSyncListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IContactSyncOnce {
        static final int TRANSACTION_onBlockedNumChange = 9;
        static final int TRANSACTION_onBondConnected = 3;
        static final int TRANSACTION_onContactSyncAction = 2;
        static final int TRANSACTION_onContactsChange = 8;
        static final int TRANSACTION_onContactsSyncDone = 11;
        static final int TRANSACTION_onDeviceMigrate = 5;
        static final int TRANSACTION_onMessageReceived = 1;
        static final int TRANSACTION_onNodeConnected = 6;
        static final int TRANSACTION_onPeerDisconnected = 4;
        static final int TRANSACTION_onSwitchTimeout = 7;
        static final int TRANSACTION_registerContactSyncListener = 12;
        static final int TRANSACTION_registerContactsSyncDone = 14;
        static final int TRANSACTION_sendContactsSortMessage = 10;
        static final int TRANSACTION_unregisterContactSyncListener = 13;

        public static class Proxy implements IContactSyncOnce {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IContactSyncOnce.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onBlockedNumChange() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onBondConnected(Node node, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onContactSyncAction(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onContactsChange() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onContactsSyncDone(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onDeviceMigrate(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onMessageReceived(MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onNodeConnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onPeerDisconnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onSwitchTimeout(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void registerContactSyncListener(IContactSyncListener iContactSyncListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iContactSyncListener);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void registerContactsSyncDone() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void sendContactsSortMessage() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void unregisterContactSyncListener(IContactSyncListener iContactSyncListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncOnce.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iContactSyncListener);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IContactSyncOnce.DESCRIPTOR);
        }

        public static IContactSyncOnce asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IContactSyncOnce.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IContactSyncOnce)) ? new Proxy(iBinder) : (IContactSyncOnce) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IContactSyncOnce.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IContactSyncOnce.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onMessageReceived((MessageEvent) a.c(parcel, MessageEvent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onContactSyncAction(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onBondConnected((Node) a.c(parcel, Node.CREATOR), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onPeerDisconnected((Node) a.c(parcel, Node.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onDeviceMigrate((Node) a.c(parcel, Node.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onNodeConnected((Node) a.c(parcel, Node.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onSwitchTimeout(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    onContactsChange();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    onBlockedNumChange();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    sendContactsSortMessage();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onContactsSyncDone(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    registerContactSyncListener(IContactSyncListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    unregisterContactSyncListener(IContactSyncListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    registerContactsSyncDone();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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

    void onBlockedNumChange() throws RemoteException;

    void onBondConnected(Node node, boolean z) throws RemoteException;

    void onContactSyncAction(String str, int i, int i2) throws RemoteException;

    void onContactsChange() throws RemoteException;

    void onContactsSyncDone(boolean z) throws RemoteException;

    void onDeviceMigrate(Node node) throws RemoteException;

    void onMessageReceived(MessageEvent messageEvent) throws RemoteException;

    void onNodeConnected(Node node) throws RemoteException;

    void onPeerDisconnected(Node node) throws RemoteException;

    void onSwitchTimeout(int i) throws RemoteException;

    void registerContactSyncListener(IContactSyncListener iContactSyncListener) throws RemoteException;

    void registerContactsSyncDone() throws RemoteException;

    void sendContactsSortMessage() throws RemoteException;

    void unregisterContactSyncListener(IContactSyncListener iContactSyncListener) throws RemoteException;
}
