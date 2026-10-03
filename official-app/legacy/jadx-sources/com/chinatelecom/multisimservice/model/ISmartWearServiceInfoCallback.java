package com.chinatelecom.multisimservice.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface ISmartWearServiceInfoCallback extends IInterface {
    public static final String DESCRIPTOR = "com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback";

    public static class Default implements ISmartWearServiceInfoCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback
        public void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISmartWearServiceInfoCallback {
        static final int TRANSACTION_getSmartWearServiceInfo = 1;

        public static class Proxy implements ISmartWearServiceInfoCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISmartWearServiceInfoCallback.DESCRIPTOR;
            }

            @Override // com.chinatelecom.multisimservice.model.ISmartWearServiceInfoCallback
            public void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartWearServiceInfoCallback.DESCRIPTOR);
                    a.d(parcelObtain, smartWearServiceInfo, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISmartWearServiceInfoCallback.DESCRIPTOR);
        }

        public static ISmartWearServiceInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartWearServiceInfoCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISmartWearServiceInfoCallback)) ? new Proxy(iBinder) : (ISmartWearServiceInfoCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartWearServiceInfoCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartWearServiceInfoCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            getSmartWearServiceInfo((SmartWearServiceInfo) a.c(parcel, SmartWearServiceInfo.CREATOR));
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

    void getSmartWearServiceInfo(SmartWearServiceInfo smartWearServiceInfo) throws RemoteException;
}
