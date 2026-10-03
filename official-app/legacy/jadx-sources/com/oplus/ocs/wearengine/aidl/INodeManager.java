package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.NodeParcelable;
import com.oplus.ocs.wearengine.common.Status;

/* JADX INFO: loaded from: classes8.dex */
public interface INodeManager extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.INodeManager";

    public static class Default implements INodeManager {
        @Override // com.oplus.ocs.wearengine.aidl.INodeManager
        public Status addListener(String str, INodeListener iNodeListener) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.INodeManager
        public NodeParcelable getNode(String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.INodeManager
        public Status removeListener(String str, INodeListener iNodeListener) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements INodeManager {
        static final int TRANSACTION_addListener = 1;
        static final int TRANSACTION_getNode = 3;
        static final int TRANSACTION_removeListener = 2;

        public static class Proxy implements INodeManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.ocs.wearengine.aidl.INodeManager
            public Status addListener(String str, INodeListener iNodeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iNodeListener);
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

            public String getInterfaceDescriptor() {
                return INodeManager.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.INodeManager
            public NodeParcelable getNode(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (NodeParcelable) a.c(parcelObtain2, NodeParcelable.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.INodeManager
            public Status removeListener(String str, INodeListener iNodeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INodeManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iNodeListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INodeManager.DESCRIPTOR);
        }

        public static INodeManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INodeManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INodeManager)) ? new Proxy(iBinder) : (INodeManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INodeManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INodeManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                Status statusAddListener = addListener(parcel.readString(), INodeListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                a.d(parcel2, statusAddListener, 1);
            } else if (i == 2) {
                Status statusRemoveListener = removeListener(parcel.readString(), INodeListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                a.d(parcel2, statusRemoveListener, 1);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                NodeParcelable node = getNode(parcel.readString());
                parcel2.writeNoException();
                a.d(parcel2, node, 1);
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

    Status addListener(String str, INodeListener iNodeListener) throws RemoteException;

    NodeParcelable getNode(String str) throws RemoteException;

    Status removeListener(String str, INodeListener iNodeListener) throws RemoteException;
}
