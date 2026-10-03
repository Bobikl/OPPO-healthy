package com.heytap.health.rpc.host;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.rpc.RpcMsg;

/* JADX INFO: loaded from: classes17.dex */
public interface IRpcMsgApi extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.rpc.host.IRpcMsgApi";

    public static class Default implements IRpcMsgApi {
        @Override // com.heytap.health.rpc.host.IRpcMsgApi
        public void addMsgListener(RpcMsgListener rpcMsgListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.rpc.host.IRpcMsgApi
        public void removeMsgListener(RpcMsgListener rpcMsgListener) throws RemoteException {
        }

        @Override // com.heytap.health.rpc.host.IRpcMsgApi
        public void sendMsg(int i, RpcMsg rpcMsg) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRpcMsgApi {
        static final int TRANSACTION_addMsgListener = 2;
        static final int TRANSACTION_removeMsgListener = 3;
        static final int TRANSACTION_sendMsg = 1;

        public static class Proxy implements IRpcMsgApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.rpc.host.IRpcMsgApi
            public void addMsgListener(RpcMsgListener rpcMsgListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRpcMsgApi.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(rpcMsgListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
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
                return IRpcMsgApi.DESCRIPTOR;
            }

            @Override // com.heytap.health.rpc.host.IRpcMsgApi
            public void removeMsgListener(RpcMsgListener rpcMsgListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRpcMsgApi.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(rpcMsgListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.rpc.host.IRpcMsgApi
            public void sendMsg(int i, RpcMsg rpcMsg) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRpcMsgApi.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    a.d(parcelObtain, rpcMsg, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRpcMsgApi.DESCRIPTOR);
        }

        public static IRpcMsgApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRpcMsgApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRpcMsgApi)) ? new Proxy(iBinder) : (IRpcMsgApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRpcMsgApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRpcMsgApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                sendMsg(parcel.readInt(), (RpcMsg) a.c(parcel, RpcMsg.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 2) {
                addMsgListener(RpcMsgListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                removeMsgListener(RpcMsgListener.Stub.asInterface(parcel.readStrongBinder()));
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

    void addMsgListener(RpcMsgListener rpcMsgListener) throws RemoteException;

    void removeMsgListener(RpcMsgListener rpcMsgListener) throws RemoteException;

    void sendMsg(int i, RpcMsg rpcMsg) throws RemoteException;
}
