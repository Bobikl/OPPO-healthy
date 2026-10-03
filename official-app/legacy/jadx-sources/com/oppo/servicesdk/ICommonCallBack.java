package com.oppo.servicesdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes9.dex */
public interface ICommonCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.oppo.servicesdk.ICommonCallBack";

    public static class Default implements ICommonCallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oppo.servicesdk.ICommonCallBack
        public void notifyTableDataChange(String str) {
        }
    }

    public static abstract class Stub extends Binder implements ICommonCallBack {
        static final int TRANSACTION_notifyTableDataChange = 1;

        public static class Proxy implements ICommonCallBack {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICommonCallBack.DESCRIPTOR;
            }

            @Override // com.oppo.servicesdk.ICommonCallBack
            public void notifyTableDataChange(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonCallBack.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICommonCallBack.DESCRIPTOR);
        }

        public static ICommonCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICommonCallBack.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICommonCallBack)) ? new Proxy(iBinder) : (ICommonCallBack) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICommonCallBack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICommonCallBack.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            notifyTableDataChange(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void notifyTableDataChange(String str);
}
