package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.BinderParcelable;

/* JADX INFO: loaded from: classes8.dex */
public interface IWearEngineService extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IWearEngineService";

    public static class Default implements IWearEngineService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IWearEngineService
        public BinderParcelable getBinder(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IWearEngineService
        public int getSelfServiceVersion(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IWearEngineService
        public void setSDKVersion(String str, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWearEngineService {
        static final int TRANSACTION_getBinder = 1;
        static final int TRANSACTION_getSelfServiceVersion = 2;
        static final int TRANSACTION_setSDKVersion = 3;

        public static class Proxy implements IWearEngineService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IWearEngineService
            public BinderParcelable getBinder(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearEngineService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (BinderParcelable) a.c(parcelObtain2, BinderParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IWearEngineService.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IWearEngineService
            public int getSelfServiceVersion(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearEngineService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.IWearEngineService
            public void setSDKVersion(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWearEngineService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWearEngineService.DESCRIPTOR);
        }

        public static IWearEngineService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWearEngineService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWearEngineService)) ? new Proxy(iBinder) : (IWearEngineService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWearEngineService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWearEngineService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                BinderParcelable binder = getBinder(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                a.d(parcel2, binder, 1);
            } else if (i == 2) {
                int selfServiceVersion = getSelfServiceVersion(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(selfServiceVersion);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                setSDKVersion(parcel.readString(), parcel.readInt());
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

    BinderParcelable getBinder(String str, int i) throws RemoteException;

    int getSelfServiceVersion(String str) throws RemoteException;

    void setSDKVersion(String str, int i) throws RemoteException;
}
