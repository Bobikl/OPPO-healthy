package com.heytap.health.rpc.host;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.rpc.RpcMsg;

/* JADX INFO: loaded from: classes17.dex */
public interface RpcMsgListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.rpc.host.RpcMsgListener";

    public static class Default implements RpcMsgListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.rpc.host.RpcMsgListener
        public void onMsgReceived(int i, RpcMsg rpcMsg) throws RemoteException {
        }

        @Override // com.heytap.health.rpc.host.RpcMsgListener
        public void onMsgSendResult(int i, boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements RpcMsgListener {
        static final int TRANSACTION_onMsgReceived = 2;
        static final int TRANSACTION_onMsgSendResult = 1;

        public static class Proxy implements RpcMsgListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return RpcMsgListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.rpc.host.RpcMsgListener
            public void onMsgReceived(int i, RpcMsg rpcMsg) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(RpcMsgListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, rpcMsg, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.rpc.host.RpcMsgListener
            public void onMsgSendResult(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(RpcMsgListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, RpcMsgListener.DESCRIPTOR);
        }

        public static RpcMsgListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(RpcMsgListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof RpcMsgListener)) ? new Proxy(iBinder) : (RpcMsgListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(RpcMsgListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(RpcMsgListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onMsgSendResult(parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onMsgReceived(parcel.readInt(), (RpcMsg) a.c(parcel, RpcMsg.INSTANCE));
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

    void onMsgReceived(int i, RpcMsg rpcMsg) throws RemoteException;

    void onMsgSendResult(int i, boolean z) throws RemoteException;
}
