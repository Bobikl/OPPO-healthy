package com.heytap.sports.step.daemon;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ISportSessionCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.sports.step.daemon.ISportSessionCallback";

    public static class Default implements ISportSessionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.sports.step.daemon.ISportSessionCallback
        public void onStepClean() throws RemoteException {
        }

        @Override // com.heytap.sports.step.daemon.ISportSessionCallback
        public void onStepUpdate(int i, long j2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISportSessionCallback {
        static final int TRANSACTION_onStepClean = 2;
        static final int TRANSACTION_onStepUpdate = 1;

        public static class Proxy implements ISportSessionCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISportSessionCallback.DESCRIPTOR;
            }

            @Override // com.heytap.sports.step.daemon.ISportSessionCallback
            public void onStepClean() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportSessionCallback.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.sports.step.daemon.ISportSessionCallback
            public void onStepUpdate(int i, long j2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportSessionCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISportSessionCallback.DESCRIPTOR);
        }

        public static ISportSessionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISportSessionCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISportSessionCallback)) ? new Proxy(iBinder) : (ISportSessionCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISportSessionCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISportSessionCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStepUpdate(parcel.readInt(), parcel.readLong());
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onStepClean();
            }
            return true;
        }
    }

    void onStepClean() throws RemoteException;

    void onStepUpdate(int i, long j2) throws RemoteException;
}
