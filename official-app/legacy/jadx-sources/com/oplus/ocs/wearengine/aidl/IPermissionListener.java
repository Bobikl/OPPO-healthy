package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.PermissionResultParcelable;

/* JADX INFO: loaded from: classes8.dex */
public interface IPermissionListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IPermissionListener";

    public static class Default implements IPermissionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IPermissionListener
        public void onRequestPermission(int i, PermissionResultParcelable permissionResultParcelable) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPermissionListener {
        static final int TRANSACTION_onRequestPermission = 1;

        public static class Proxy implements IPermissionListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPermissionListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IPermissionListener
            public void onRequestPermission(int i, PermissionResultParcelable permissionResultParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPermissionListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, permissionResultParcelable, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPermissionListener.DESCRIPTOR);
        }

        public static IPermissionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPermissionListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPermissionListener)) ? new Proxy(iBinder) : (IPermissionListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IPermissionListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IPermissionListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onRequestPermission(parcel.readInt(), (PermissionResultParcelable) a.c(parcel, PermissionResultParcelable.INSTANCE));
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

    void onRequestPermission(int i, PermissionResultParcelable permissionResultParcelable) throws RemoteException;
}
