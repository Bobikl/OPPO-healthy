package com.heytap.accessory.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface DeathCallback extends IInterface {

    public static abstract class Stub extends Binder implements DeathCallback {

        public static class Proxy implements DeathCallback {
            public IBinder a;

            @Override // com.heytap.accessory.base.DeathCallback
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.accessory.base.DeathCallback");
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public Stub() {
            attachInterface(this, "com.heytap.accessory.base.DeathCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.heytap.accessory.base.DeathCallback");
                return true;
            }
            parcel.enforceInterface("com.heytap.accessory.base.DeathCallback");
            String strA = a();
            parcel2.writeNoException();
            parcel2.writeString(strA);
            return true;
        }
    }

    String a() throws RemoteException;
}
