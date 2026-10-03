package com.heytap.msp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IBizBinder extends IInterface {

    public static class Default implements IBizBinder {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.msp.IBizBinder
        public void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException {
        }

        @Override // com.heytap.msp.IBizBinder
        public String getVersionInfo() throws RemoteException {
            return null;
        }

        @Override // com.heytap.msp.IBizBinder
        public void registerClientProxy(String str, IBizClientProxy iBizClientProxy) throws RemoteException {
        }

        @Override // com.heytap.msp.IBizBinder
        public void unregisterClientProxy(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IBizBinder {
        private static final String DESCRIPTOR = "com.heytap.msp.IBizBinder";
        static final int TRANSACTION_execute = 1;
        static final int TRANSACTION_getVersionInfo = 4;
        static final int TRANSACTION_registerClientProxy = 2;
        static final int TRANSACTION_unregisterClientProxy = 3;

        public static class Proxy implements IBizBinder {
            public static IBizBinder sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.msp.IBizBinder
            public void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException {
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
                    parcelObtain.writeStrongBinder(iBizBinderCallback != null ? iBizBinderCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().execute(ipcRequest, iBizBinderCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.heytap.msp.IBizBinder
            public String getVersionInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVersionInfo();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.msp.IBizBinder
            public void registerClientProxy(String str, IBizClientProxy iBizClientProxy) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBizClientProxy != null ? iBizClientProxy.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerClientProxy(str, iBizClientProxy);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.msp.IBizBinder
            public void unregisterClientProxy(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterClientProxy(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBizBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBizBinder)) ? new Proxy(iBinder) : (IBizBinder) iInterfaceQueryLocalInterface;
        }

        public static IBizBinder getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBizBinder iBizBinder) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBizBinder == null) {
                return false;
            }
            Proxy.sDefaultImpl = iBizBinder;
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
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                registerClientProxy(parcel.readString(), IBizClientProxy.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterClientProxy(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String versionInfo = getVersionInfo();
            parcel2.writeNoException();
            parcel2.writeString(versionInfo);
            return true;
        }
    }

    void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException;

    String getVersionInfo() throws RemoteException;

    void registerClientProxy(String str, IBizClientProxy iBizClientProxy) throws RemoteException;

    void unregisterClientProxy(String str) throws RemoteException;
}
