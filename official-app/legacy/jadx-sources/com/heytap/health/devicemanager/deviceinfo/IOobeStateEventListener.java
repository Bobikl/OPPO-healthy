package com.heytap.health.devicemanager.deviceinfo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;

/* JADX INFO: loaded from: classes16.dex */
public interface IOobeStateEventListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.devicemanager.deviceinfo.IOobeStateEventListener";

    public static class Default implements IOobeStateEventListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.devicemanager.deviceinfo.IOobeStateEventListener
        public void oobeStateEventChange(OobeStatusBean oobeStatusBean) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOobeStateEventListener {
        static final int TRANSACTION_oobeStateEventChange = 1;

        public static class Proxy implements IOobeStateEventListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IOobeStateEventListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.devicemanager.deviceinfo.IOobeStateEventListener
            public void oobeStateEventChange(OobeStatusBean oobeStatusBean) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOobeStateEventListener.DESCRIPTOR);
                    a.d(parcelObtain, oobeStatusBean, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOobeStateEventListener.DESCRIPTOR);
        }

        public static IOobeStateEventListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOobeStateEventListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOobeStateEventListener)) ? new Proxy(iBinder) : (IOobeStateEventListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOobeStateEventListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOobeStateEventListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            oobeStateEventChange((OobeStatusBean) a.c(parcel, OobeStatusBean.CREATOR));
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

    void oobeStateEventChange(OobeStatusBean oobeStatusBean) throws RemoteException;
}
