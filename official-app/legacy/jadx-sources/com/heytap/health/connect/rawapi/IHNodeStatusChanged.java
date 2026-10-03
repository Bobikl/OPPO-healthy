package com.heytap.health.connect.rawapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;

/* JADX INFO: loaded from: classes15.dex */
public interface IHNodeStatusChanged extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.connect.rawapi.IHNodeStatusChanged";

    public static class Default implements IHNodeStatusChanged {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.connect.rawapi.IHNodeStatusChanged
        public void notifyActiveDeviceChanged(String str) throws RemoteException {
        }

        @Override // com.heytap.health.connect.rawapi.IHNodeStatusChanged
        public void onStatusChange(Node node, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHNodeStatusChanged {
        static final int TRANSACTION_notifyActiveDeviceChanged = 2;
        static final int TRANSACTION_onStatusChange = 1;

        public static class Proxy implements IHNodeStatusChanged {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IHNodeStatusChanged.DESCRIPTOR;
            }

            @Override // com.heytap.health.connect.rawapi.IHNodeStatusChanged
            public void notifyActiveDeviceChanged(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHNodeStatusChanged.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.connect.rawapi.IHNodeStatusChanged
            public void onStatusChange(Node node, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHNodeStatusChanged.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHNodeStatusChanged.DESCRIPTOR);
        }

        public static IHNodeStatusChanged asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHNodeStatusChanged.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHNodeStatusChanged)) ? new Proxy(iBinder) : (IHNodeStatusChanged) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHNodeStatusChanged.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHNodeStatusChanged.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStatusChange((Node) a.c(parcel, Node.CREATOR), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                notifyActiveDeviceChanged(parcel.readString());
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

    void notifyActiveDeviceChanged(String str) throws RemoteException;

    void onStatusChange(Node node, int i) throws RemoteException;
}
