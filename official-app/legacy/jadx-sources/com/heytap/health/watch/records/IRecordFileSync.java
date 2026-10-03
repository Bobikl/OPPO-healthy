package com.heytap.health.watch.records;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IRecordFileSync extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.records.IRecordFileSync";

    public static class Default implements IRecordFileSync {
        @Override // com.heytap.health.watch.records.IRecordFileSync
        public void addSyncListener(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.records.IRecordFileSync
        public void cancelAllTask() throws RemoteException {
        }

        @Override // com.heytap.health.watch.records.IRecordFileSync
        public void cancelTaskAndContinueNext(String str, String str2, long j2, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.records.IRecordFileSync
        public boolean[] isPendingInTask(long[] jArr) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.records.IRecordFileSync
        public boolean isTaskIdle() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.watch.records.IRecordFileSync
        public void removeSyncListener(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
        }

        @Override // com.heytap.health.watch.records.IRecordFileSync
        public void requestRecordFileInfo(String str, long j2, long j3, int i, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRecordFileSync {
        static final int TRANSACTION_addSyncListener = 1;
        static final int TRANSACTION_cancelAllTask = 7;
        static final int TRANSACTION_cancelTaskAndContinueNext = 6;
        static final int TRANSACTION_isPendingInTask = 4;
        static final int TRANSACTION_isTaskIdle = 5;
        static final int TRANSACTION_removeSyncListener = 2;
        static final int TRANSACTION_requestRecordFileInfo = 3;

        public static class Proxy implements IRecordFileSync {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public void addSyncListener(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRecordFileSyncListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public void cancelAllTask() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public void cancelTaskAndContinueNext(String str, String str2, long j2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRecordFileSync.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public boolean[] isPendingInTask(long[] jArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    parcelObtain.writeLongArray(jArr);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createBooleanArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public boolean isTaskIdle() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public void removeSyncListener(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRecordFileSyncListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.records.IRecordFileSync
            public void requestRecordFileInfo(String str, long j2, long j3, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecordFileSync.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRecordFileSync.DESCRIPTOR);
        }

        public static IRecordFileSync asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRecordFileSync.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRecordFileSync)) ? new Proxy(iBinder) : (IRecordFileSync) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRecordFileSync.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRecordFileSync.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    addSyncListener(IRecordFileSyncListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    removeSyncListener(IRecordFileSyncListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    requestRecordFileInfo(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean[] zArrIsPendingInTask = isPendingInTask(parcel.createLongArray());
                    parcel2.writeNoException();
                    parcel2.writeBooleanArray(zArrIsPendingInTask);
                    return true;
                case 5:
                    boolean zIsTaskIdle = isTaskIdle();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsTaskIdle ? 1 : 0);
                    return true;
                case 6:
                    cancelTaskAndContinueNext(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    cancelAllTask();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void addSyncListener(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException;

    void cancelAllTask() throws RemoteException;

    void cancelTaskAndContinueNext(String str, String str2, long j2, boolean z) throws RemoteException;

    boolean[] isPendingInTask(long[] jArr) throws RemoteException;

    boolean isTaskIdle() throws RemoteException;

    void removeSyncListener(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException;

    void requestRecordFileInfo(String str, long j2, long j3, int i, String str2) throws RemoteException;
}
