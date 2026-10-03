package com.heytap.health.watch.contactsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IContactSyncMain extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.contactsync.aidl.IContactSyncMain";

    public static class Default implements IContactSyncMain {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncMain
        public void onPairSyncResult(String str, boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IContactSyncMain {
        static final int TRANSACTION_onPairSyncResult = 1;

        public static class Proxy implements IContactSyncMain {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IContactSyncMain.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncMain
            public void onPairSyncResult(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncMain.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IContactSyncMain.DESCRIPTOR);
        }

        public static IContactSyncMain asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IContactSyncMain.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IContactSyncMain)) ? new Proxy(iBinder) : (IContactSyncMain) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IContactSyncMain.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IContactSyncMain.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onPairSyncResult(parcel.readString(), parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void onPairSyncResult(String str, boolean z) throws RemoteException;
}
