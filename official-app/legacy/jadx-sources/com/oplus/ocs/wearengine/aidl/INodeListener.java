package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.NodeParcelable;

/* JADX INFO: loaded from: classes8.dex */
public interface INodeListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.INodeListener";

    public static class Default implements INodeListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.INodeListener
        public void onPeerConnected(NodeParcelable nodeParcelable) throws RemoteException {
        }

        @Override // com.oplus.ocs.wearengine.aidl.INodeListener
        public void onPeerDisconnected(NodeParcelable nodeParcelable) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INodeListener {
        static final int TRANSACTION_onPeerConnected = 1;
        static final int TRANSACTION_onPeerDisconnected = 2;

        public static class Proxy implements INodeListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INodeListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.INodeListener
            public void onPeerConnected(NodeParcelable nodeParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeListener.DESCRIPTOR);
                    a.d(parcelObtain, nodeParcelable, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.INodeListener
            public void onPeerDisconnected(NodeParcelable nodeParcelable) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeListener.DESCRIPTOR);
                    a.d(parcelObtain, nodeParcelable, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INodeListener.DESCRIPTOR);
        }

        public static INodeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INodeListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INodeListener)) ? new Proxy(iBinder) : (INodeListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INodeListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INodeListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onPeerConnected((NodeParcelable) a.c(parcel, NodeParcelable.CREATOR));
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onPeerDisconnected((NodeParcelable) a.c(parcel, NodeParcelable.CREATOR));
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

    void onPeerConnected(NodeParcelable nodeParcelable) throws RemoteException;

    void onPeerDisconnected(NodeParcelable nodeParcelable) throws RemoteException;
}
