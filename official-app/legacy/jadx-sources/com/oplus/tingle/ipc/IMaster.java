package com.oplus.tingle.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IMaster extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.tingle.ipc.IMaster";

    public static class Default implements IMaster {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.tingle.ipc.IMaster
        public int getUid() throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IMaster {
        static final int TRANSACTION_getUid = 4;

        public static class Proxy implements IMaster {
            public static IMaster sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMaster.DESCRIPTOR;
            }

            @Override // com.oplus.tingle.ipc.IMaster
            public int getUid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMaster.DESCRIPTOR);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUid();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMaster.DESCRIPTOR);
        }

        public static IMaster asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMaster.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMaster)) ? new Proxy(iBinder) : (IMaster) iInterfaceQueryLocalInterface;
        }

        public static IMaster getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMaster iMaster) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMaster == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMaster;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IMaster.DESCRIPTOR);
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IMaster.DESCRIPTOR);
            int uid = getUid();
            parcel2.writeNoException();
            parcel2.writeInt(uid);
            return true;
        }
    }

    int getUid() throws RemoteException;
}
