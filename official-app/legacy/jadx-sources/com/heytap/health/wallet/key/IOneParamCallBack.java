package com.heytap.health.wallet.key;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface IOneParamCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.wallet.key.IOneParamCallBack";

    public static class Default implements IOneParamCallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOneParamCallBack
        public void callBack(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOneParamCallBack {
        static final int TRANSACTION_callBack = 1;

        public static class Proxy implements IOneParamCallBack {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.wallet.key.IOneParamCallBack
            public void callBack(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOneParamCallBack.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOneParamCallBack.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IOneParamCallBack.DESCRIPTOR);
        }

        public static IOneParamCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOneParamCallBack.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOneParamCallBack)) ? new Proxy(iBinder) : (IOneParamCallBack) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOneParamCallBack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOneParamCallBack.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            callBack(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void callBack(String str) throws RemoteException;
}
