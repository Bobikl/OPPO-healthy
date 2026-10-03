package com.oplus.onet.dbr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IConnectionResultCallback extends IInterface {

    public static class Default implements IConnectionResultCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.dbr.IConnectionResultCallback
        public void onConnected(List<String> list) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IConnectionResultCallback
        public void onDisconnected(List<String> list) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IConnectionResultCallback
        public void onError(String str, int i, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IConnectionResultCallback {
        private static final String DESCRIPTOR = "com.oplus.onet.dbr.IConnectionResultCallback";
        public static final int TRANSACTION_onConnected = 1;
        public static final int TRANSACTION_onDisconnected = 2;
        public static final int TRANSACTION_onError = 3;

        public static class Proxy implements IConnectionResultCallback {
            public static IConnectionResultCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.onet.dbr.IConnectionResultCallback
            public void onConnected(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onConnected(list);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readStringList(list);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IConnectionResultCallback
            public void onDisconnected(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDisconnected(list);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readStringList(list);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IConnectionResultCallback
            public void onError(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onError(str, i, str2);
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

        public static IConnectionResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IConnectionResultCallback)) ? new Proxy(iBinder) : (IConnectionResultCallback) iInterfaceQueryLocalInterface;
        }

        public static IConnectionResultCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IConnectionResultCallback iConnectionResultCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iConnectionResultCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iConnectionResultCallback;
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
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                onConnected(arrayListCreateStringArrayList);
                parcel2.writeNoException();
                parcel2.writeStringList(arrayListCreateStringArrayList);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                onDisconnected(arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                parcel2.writeStringList(arrayListCreateStringArrayList2);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onError(parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onConnected(List<String> list) throws RemoteException;

    void onDisconnected(List<String> list) throws RemoteException;

    void onError(String str, int i, String str2) throws RemoteException;
}
