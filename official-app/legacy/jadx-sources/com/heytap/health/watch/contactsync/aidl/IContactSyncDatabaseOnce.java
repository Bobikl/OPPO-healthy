package com.heytap.health.watch.contactsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.watch.contactsync.db.table.DBSelectContactLite;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface IContactSyncDatabaseOnce extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce";

    public static class Default implements IContactSyncDatabaseOnce {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
        public List<DBSelectContactLite> deleteAndInsertInTransaction(String str, List<DBSelectContactLite> list) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
        public List<DBSelectContactLite> deleteAndUpdateInTransaction(String str, long[] jArr, List<DBSelectContactLite> list) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
        public List<DBSelectContactLite> querySelectContact(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
        public int updateSelectContact(List<DBSelectContactLite> list) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IContactSyncDatabaseOnce {
        static final int TRANSACTION_deleteAndInsertInTransaction = 3;
        static final int TRANSACTION_deleteAndUpdateInTransaction = 4;
        static final int TRANSACTION_querySelectContact = 2;
        static final int TRANSACTION_updateSelectContact = 5;

        public static class Proxy implements IContactSyncDatabaseOnce {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            public List<DBSelectContactLite> deleteAndInsertInTransaction(String str, List<DBSelectContactLite> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncDatabaseOnce.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.b(parcelObtain, list, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    Parcelable.Creator<DBSelectContactLite> creator = DBSelectContactLite.CREATOR;
                    ArrayList arrayListCreateTypedArrayList = parcelObtain2.createTypedArrayList(creator);
                    parcelObtain2.readTypedList(list, creator);
                    return arrayListCreateTypedArrayList;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            public List<DBSelectContactLite> deleteAndUpdateInTransaction(String str, long[] jArr, List<DBSelectContactLite> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncDatabaseOnce.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLongArray(jArr);
                    a.b(parcelObtain, list, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DBSelectContactLite.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IContactSyncDatabaseOnce.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            public List<DBSelectContactLite> querySelectContact(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncDatabaseOnce.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DBSelectContactLite.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            public int updateSelectContact(List<DBSelectContactLite> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IContactSyncDatabaseOnce.DESCRIPTOR);
                    a.b(parcelObtain, list, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IContactSyncDatabaseOnce.DESCRIPTOR);
        }

        public static IContactSyncDatabaseOnce asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IContactSyncDatabaseOnce.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IContactSyncDatabaseOnce)) ? new Proxy(iBinder) : (IContactSyncDatabaseOnce) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IContactSyncDatabaseOnce.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IContactSyncDatabaseOnce.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                List<DBSelectContactLite> listQuerySelectContact = querySelectContact(parcel.readString());
                parcel2.writeNoException();
                a.b(parcel2, listQuerySelectContact, 1);
            } else if (i == 3) {
                String string = parcel.readString();
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(DBSelectContactLite.CREATOR);
                List<DBSelectContactLite> listDeleteAndInsertInTransaction = deleteAndInsertInTransaction(string, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                a.b(parcel2, listDeleteAndInsertInTransaction, 1);
                a.b(parcel2, arrayListCreateTypedArrayList, 1);
            } else if (i == 4) {
                List<DBSelectContactLite> listDeleteAndUpdateInTransaction = deleteAndUpdateInTransaction(parcel.readString(), parcel.createLongArray(), parcel.createTypedArrayList(DBSelectContactLite.CREATOR));
                parcel2.writeNoException();
                a.b(parcel2, listDeleteAndUpdateInTransaction, 1);
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int iUpdateSelectContact = updateSelectContact(parcel.createTypedArrayList(DBSelectContactLite.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iUpdateSelectContact);
            }
            return true;
        }
    }

    public static class a {
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    List<DBSelectContactLite> deleteAndInsertInTransaction(String str, List<DBSelectContactLite> list) throws RemoteException;

    List<DBSelectContactLite> deleteAndUpdateInTransaction(String str, long[] jArr, List<DBSelectContactLite> list) throws RemoteException;

    List<DBSelectContactLite> querySelectContact(String str) throws RemoteException;

    int updateSelectContact(List<DBSelectContactLite> list) throws RemoteException;
}
