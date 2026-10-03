package com.oplus.epona;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IRemoteTransfer extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.epona.IRemoteTransfer";

    public static class Default implements IRemoteTransfer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.epona.IRemoteTransfer
        public void asyncCall(Request request, ITransferCallback iTransferCallback) throws RemoteException {
        }

        @Override // com.oplus.epona.IRemoteTransfer
        public Response call(Request request) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IRemoteTransfer {
        static final int TRANSACTION_asyncCall = 2;
        static final int TRANSACTION_call = 1;

        public static class Proxy implements IRemoteTransfer {
            public static IRemoteTransfer sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.epona.IRemoteTransfer
            public void asyncCall(Request request, ITransferCallback iTransferCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteTransfer.DESCRIPTOR);
                    if (request != null) {
                        parcelObtain.writeInt(1);
                        request.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iTransferCallback != null ? iTransferCallback.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().asyncCall(request, iTransferCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.epona.IRemoteTransfer
            public Response call(Request request) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteTransfer.DESCRIPTOR);
                    if (request != null) {
                        parcelObtain.writeInt(1);
                        request.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().call(request);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Response.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRemoteTransfer.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IRemoteTransfer.DESCRIPTOR);
        }

        public static IRemoteTransfer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemoteTransfer.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteTransfer)) ? new Proxy(iBinder) : (IRemoteTransfer) iInterfaceQueryLocalInterface;
        }

        public static IRemoteTransfer getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRemoteTransfer iRemoteTransfer) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteTransfer == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteTransfer;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IRemoteTransfer.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel.enforceInterface(IRemoteTransfer.DESCRIPTOR);
                asyncCall(parcel.readInt() != 0 ? Request.CREATOR.createFromParcel(parcel) : null, ITransferCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(IRemoteTransfer.DESCRIPTOR);
            Response responseCall = call(parcel.readInt() != 0 ? Request.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (responseCall != null) {
                parcel2.writeInt(1);
                responseCall.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void asyncCall(Request request, ITransferCallback iTransferCallback) throws RemoteException;

    Response call(Request request) throws RemoteException;
}
