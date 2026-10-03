package com.heytap.wearable.emergency.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IEmergencyAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.emergency.api.IEmergencyAidl";

    public static class Default implements IEmergencyAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.emergency.api.IEmergencyAidl
        public void pushSafeEvent(Bundle bundle) throws RemoteException {
        }

        @Override // com.heytap.wearable.emergency.api.IEmergencyAidl
        public void updateFluidDate(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEmergencyAidl {
        static final int TRANSACTION_pushSafeEvent = 2;
        static final int TRANSACTION_updateFluidDate = 3;

        public static class Proxy implements IEmergencyAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IEmergencyAidl.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.emergency.api.IEmergencyAidl
            public void pushSafeEvent(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEmergencyAidl.DESCRIPTOR);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.emergency.api.IEmergencyAidl
            public void updateFluidDate(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEmergencyAidl.DESCRIPTOR);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IEmergencyAidl.DESCRIPTOR);
        }

        public static IEmergencyAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEmergencyAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEmergencyAidl)) ? new Proxy(iBinder) : (IEmergencyAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IEmergencyAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IEmergencyAidl.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                pushSafeEvent((Bundle) a.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                updateFluidDate((Bundle) a.c(parcel, Bundle.CREATOR));
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

    void pushSafeEvent(Bundle bundle) throws RemoteException;

    void updateFluidDate(Bundle bundle) throws RemoteException;
}
