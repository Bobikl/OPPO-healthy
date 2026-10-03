package com.heytap.health.adaptersdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes15.dex */
public interface IResult extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.adaptersdk.IResult";

    public static class Default implements IResult {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.IResult
        public void onResult(boolean z, int i, String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IResult {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IResult {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IResult.DESCRIPTOR;
            }

            @Override // com.heytap.health.adaptersdk.IResult
            public void onResult(boolean z, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IResult.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IResult.DESCRIPTOR);
        }

        public static IResult asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IResult.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResult)) ? new Proxy(iBinder) : (IResult) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IResult.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IResult.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt() != 0, parcel.readInt(), parcel.readString());
            return true;
        }
    }

    void onResult(boolean z, int i, String str) throws RemoteException;
}
