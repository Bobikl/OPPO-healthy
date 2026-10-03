package com.heytap.wearable.emergency.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IEmergencyMainAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.emergency.api.IEmergencyMainAidl";

    public static class Default implements IEmergencyMainAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.emergency.api.IEmergencyMainAidl
        public void sync(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEmergencyMainAidl {
        static final int TRANSACTION_sync = 2;

        public static class Proxy implements IEmergencyMainAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IEmergencyMainAidl.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.emergency.api.IEmergencyMainAidl
            public void sync(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEmergencyMainAidl.DESCRIPTOR);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IEmergencyMainAidl.DESCRIPTOR);
        }

        public static IEmergencyMainAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEmergencyMainAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEmergencyMainAidl)) ? new Proxy(iBinder) : (IEmergencyMainAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IEmergencyMainAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IEmergencyMainAidl.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            sync((Bundle) a.c(parcel, Bundle.CREATOR));
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

    void sync(Bundle bundle) throws RemoteException;
}
