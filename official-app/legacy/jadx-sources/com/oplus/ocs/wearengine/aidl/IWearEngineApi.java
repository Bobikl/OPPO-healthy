package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.PermissionResultParcelable;

/* JADX INFO: loaded from: classes8.dex */
public interface IWearEngineApi extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IWearEngineApi";

    public static class Default implements IWearEngineApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IWearEngineApi
        public boolean isForeground() throws RemoteException {
            return false;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IWearEngineApi
        public void onRequestPermission(String str, int i, PermissionResultParcelable permissionResultParcelable) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWearEngineApi {
        static final int TRANSACTION_isForeground = 1;
        static final int TRANSACTION_onRequestPermission = 2;

        public static class Proxy implements IWearEngineApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWearEngineApi.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IWearEngineApi
            public boolean isForeground() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearEngineApi.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IWearEngineApi
            public void onRequestPermission(String str, int i, PermissionResultParcelable permissionResultParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearEngineApi.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, permissionResultParcelable, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWearEngineApi.DESCRIPTOR);
        }

        public static IWearEngineApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearEngineApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWearEngineApi)) ? new Proxy(iBinder) : (IWearEngineApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearEngineApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearEngineApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                boolean zIsForeground = isForeground();
                parcel2.writeNoException();
                parcel2.writeInt(zIsForeground ? 1 : 0);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onRequestPermission(parcel.readString(), parcel.readInt(), (PermissionResultParcelable) a.c(parcel, PermissionResultParcelable.INSTANCE));
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

    boolean isForeground() throws RemoteException;

    void onRequestPermission(String str, int i, PermissionResultParcelable permissionResultParcelable) throws RemoteException;
}
