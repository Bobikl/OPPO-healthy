package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.PackageInfoParcelable;
import com.oplus.ocs.wearengine.bean.ServiceVersionParcelable;
import com.oplus.ocs.wearengine.common.Status;

/* JADX INFO: loaded from: classes8.dex */
public interface ICapabilityListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.ICapabilityListener";

    public static class Default implements ICapabilityListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityListener
        public void onAck(int i, Status status) throws RemoteException {
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityListener
        public void onGetPackageInfo(int i, PackageInfoParcelable packageInfoParcelable) throws RemoteException {
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityListener
        public void onGetServiceVersion(int i, ServiceVersionParcelable serviceVersionParcelable) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICapabilityListener {
        static final int TRANSACTION_onAck = 1;
        static final int TRANSACTION_onGetPackageInfo = 3;
        static final int TRANSACTION_onGetServiceVersion = 2;

        public static class Proxy implements ICapabilityListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICapabilityListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityListener
            public void onAck(int i, Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, status, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityListener
            public void onGetPackageInfo(int i, PackageInfoParcelable packageInfoParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, packageInfoParcelable, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityListener
            public void onGetServiceVersion(int i, ServiceVersionParcelable serviceVersionParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, serviceVersionParcelable, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICapabilityListener.DESCRIPTOR);
        }

        public static ICapabilityListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICapabilityListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICapabilityListener)) ? new Proxy(iBinder) : (ICapabilityListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICapabilityListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICapabilityListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onAck(parcel.readInt(), (Status) a.c(parcel, Status.CREATOR));
            } else if (i == 2) {
                onGetServiceVersion(parcel.readInt(), (ServiceVersionParcelable) a.c(parcel, ServiceVersionParcelable.CREATOR));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onGetPackageInfo(parcel.readInt(), (PackageInfoParcelable) a.c(parcel, PackageInfoParcelable.CREATOR));
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

    void onAck(int i, Status status) throws RemoteException;

    void onGetPackageInfo(int i, PackageInfoParcelable packageInfoParcelable) throws RemoteException;

    void onGetServiceVersion(int i, ServiceVersionParcelable serviceVersionParcelable) throws RemoteException;
}
