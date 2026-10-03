package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.PermissionResultParcelable;
import com.oplus.ocs.wearengine.common.Status;

/* JADX INFO: loaded from: classes8.dex */
public interface IPermissionManager extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IPermissionManager";

    public static class Default implements IPermissionManager {
        @Override // com.oplus.ocs.wearengine.aidl.IPermissionManager
        public Status addListener(String str, IPermissionListener iPermissionListener) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IPermissionManager
        public PermissionResultParcelable checkPermission(String str, String[] strArr) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IPermissionManager
        public Status requestPermission(String str, int i, String[] strArr, String str2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IPermissionManager {
        static final int TRANSACTION_addListener = 1;
        static final int TRANSACTION_checkPermission = 2;
        static final int TRANSACTION_requestPermission = 3;

        public static class Proxy implements IPermissionManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IPermissionManager
            public Status addListener(String str, IPermissionListener iPermissionListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPermissionManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iPermissionListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IPermissionManager
            public PermissionResultParcelable checkPermission(String str, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPermissionManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PermissionResultParcelable) a.c(parcelObtain2, PermissionResultParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IPermissionManager.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IPermissionManager
            public Status requestPermission(String str, int i, String[] strArr, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPermissionManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPermissionManager.DESCRIPTOR);
        }

        public static IPermissionManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPermissionManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPermissionManager)) ? new Proxy(iBinder) : (IPermissionManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IPermissionManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IPermissionManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                Status statusAddListener = addListener(parcel.readString(), IPermissionListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                a.d(parcel2, statusAddListener, 1);
            } else if (i == 2) {
                PermissionResultParcelable permissionResultParcelableCheckPermission = checkPermission(parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                a.d(parcel2, permissionResultParcelableCheckPermission, 1);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Status statusRequestPermission = requestPermission(parcel.readString(), parcel.readInt(), parcel.createStringArray(), parcel.readString());
                parcel2.writeNoException();
                a.d(parcel2, statusRequestPermission, 1);
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

    Status addListener(String str, IPermissionListener iPermissionListener) throws RemoteException;

    PermissionResultParcelable checkPermission(String str, String[] strArr) throws RemoteException;

    Status requestPermission(String str, int i, String[] strArr, String str2) throws RemoteException;
}
