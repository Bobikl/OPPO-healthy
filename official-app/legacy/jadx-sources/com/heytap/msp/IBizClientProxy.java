package com.heytap.msp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IBizClientProxy extends IInterface {

    public static class Default implements IBizClientProxy {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.msp.IBizClientProxy
        public void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException {
        }

        @Override // com.heytap.msp.IBizClientProxy
        public IpcResponse syncExecute(IpcRequest ipcRequest) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IBizClientProxy {
        private static final String DESCRIPTOR = "com.heytap.msp.IBizClientProxy";
        static final int TRANSACTION_execute = 1;
        static final int TRANSACTION_syncExecute = 2;

        public static class Proxy implements IBizClientProxy {
            public static IBizClientProxy sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.msp.IBizClientProxy
            public void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (ipcRequest != null) {
                        parcelObtain.writeInt(1);
                        ipcRequest.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iBizBinderCallback != null ? iBizBinderCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().execute(ipcRequest, iBizBinderCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.heytap.msp.IBizClientProxy
            public IpcResponse syncExecute(IpcRequest ipcRequest) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (ipcRequest != null) {
                        parcelObtain.writeInt(1);
                        ipcRequest.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().syncExecute(ipcRequest);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? IpcResponse.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBizClientProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBizClientProxy)) ? new Proxy(iBinder) : (IBizClientProxy) iInterfaceQueryLocalInterface;
        }

        public static IBizClientProxy getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBizClientProxy iBizClientProxy) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBizClientProxy == null) {
                return false;
            }
            Proxy.sDefaultImpl = iBizClientProxy;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                execute(parcel.readInt() != 0 ? IpcRequest.CREATOR.createFromParcel(parcel) : null, IBizBinderCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            IpcResponse ipcResponseSyncExecute = syncExecute(parcel.readInt() != 0 ? IpcRequest.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (ipcResponseSyncExecute != null) {
                parcel2.writeInt(1);
                ipcResponseSyncExecute.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException;

    IpcResponse syncExecute(IpcRequest ipcRequest) throws RemoteException;
}
