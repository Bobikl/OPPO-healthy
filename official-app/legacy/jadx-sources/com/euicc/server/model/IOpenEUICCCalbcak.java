package com.euicc.server.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface IOpenEUICCCalbcak extends IInterface {
    public static final String DESCRIPTOR = "com.euicc.server.model.IOpenEUICCCalbcak";

    public static class Default implements IOpenEUICCCalbcak {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.euicc.server.model.IOpenEUICCCalbcak
        public void getDeviceEUICCInfo(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenEUICCCalbcak {
        static final int TRANSACTION_getDeviceEUICCInfo = 1;

        public static class Proxy implements IOpenEUICCCalbcak {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.euicc.server.model.IOpenEUICCCalbcak
            public void getDeviceEUICCInfo(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenEUICCCalbcak.DESCRIPTOR);
                    a.d(parcelObtain, eUICCDeviceInfo, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOpenEUICCCalbcak.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IOpenEUICCCalbcak.DESCRIPTOR);
        }

        public static IOpenEUICCCalbcak asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenEUICCCalbcak.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenEUICCCalbcak)) ? new Proxy(iBinder) : (IOpenEUICCCalbcak) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenEUICCCalbcak.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenEUICCCalbcak.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            getDeviceEUICCInfo((EUICCDeviceInfo) a.c(parcel, EUICCDeviceInfo.CREATOR));
            parcel2.writeNoException();
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

    void getDeviceEUICCInfo(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException;
}
