package com.heytap.health.adaptersdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;

/* JADX INFO: loaded from: classes15.dex */
public interface INodeCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.adaptersdk.INodeCallback";

    public static class Default implements INodeCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.adaptersdk.INodeCallback
        public void onPeerConnected(Node node) throws RemoteException {
        }

        @Override // com.heytap.health.adaptersdk.INodeCallback
        public void onPeerDisConnected(Node node) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INodeCallback {
        static final int TRANSACTION_onPeerConnected = 1;
        static final int TRANSACTION_onPeerDisConnected = 2;

        public static class Proxy implements INodeCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INodeCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.adaptersdk.INodeCallback
            public void onPeerConnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeCallback.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.adaptersdk.INodeCallback
            public void onPeerDisConnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeCallback.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INodeCallback.DESCRIPTOR);
        }

        public static INodeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INodeCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INodeCallback)) ? new Proxy(iBinder) : (INodeCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INodeCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INodeCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onPeerConnected((Node) a.c(parcel, Node.CREATOR));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onPeerDisConnected((Node) a.c(parcel, Node.CREATOR));
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

    void onPeerConnected(Node node) throws RemoteException;

    void onPeerDisConnected(Node node) throws RemoteException;
}
