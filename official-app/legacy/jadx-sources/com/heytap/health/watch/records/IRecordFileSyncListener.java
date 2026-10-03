package com.heytap.health.watch.records;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.watch.records.bean.RecordFileTaskInfo;

/* JADX INFO: loaded from: classes19.dex */
public interface IRecordFileSyncListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.records.IRecordFileSyncListener";

    public static class Default implements IRecordFileSyncListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.records.IRecordFileSyncListener
        public void onRecordDeleted(String str, String str2, long j2) throws RemoteException {
        }

        @Override // com.heytap.health.watch.records.IRecordFileSyncListener
        public void onStartAutoSync(String str) throws RemoteException {
        }

        @Override // com.heytap.health.watch.records.IRecordFileSyncListener
        public void onStatusChanged(RecordFileTaskInfo recordFileTaskInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRecordFileSyncListener {
        static final int TRANSACTION_onRecordDeleted = 2;
        static final int TRANSACTION_onStartAutoSync = 3;
        static final int TRANSACTION_onStatusChanged = 1;

        public static class Proxy implements IRecordFileSyncListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRecordFileSyncListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.records.IRecordFileSyncListener
            public void onRecordDeleted(String str, String str2, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSyncListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.records.IRecordFileSyncListener
            public void onStartAutoSync(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSyncListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.records.IRecordFileSyncListener
            public void onStatusChanged(RecordFileTaskInfo recordFileTaskInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSyncListener.DESCRIPTOR);
                    a.d(parcelObtain, recordFileTaskInfo, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRecordFileSyncListener.DESCRIPTOR);
        }

        public static IRecordFileSyncListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRecordFileSyncListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRecordFileSyncListener)) ? new Proxy(iBinder) : (IRecordFileSyncListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRecordFileSyncListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRecordFileSyncListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStatusChanged((RecordFileTaskInfo) a.c(parcel, RecordFileTaskInfo.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 2) {
                onRecordDeleted(parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onStartAutoSync(parcel.readString());
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

    void onRecordDeleted(String str, String str2, long j2) throws RemoteException;

    void onStartAutoSync(String str) throws RemoteException;

    void onStatusChanged(RecordFileTaskInfo recordFileTaskInfo) throws RemoteException;
}
