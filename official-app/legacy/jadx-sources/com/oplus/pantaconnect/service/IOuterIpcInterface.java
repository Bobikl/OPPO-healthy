package com.oplus.pantaconnect.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IOuterIpcInterface extends IInterface {

    public static class Default implements IOuterIpcInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.pantaconnect.service.IOuterIpcInterface
        public byte[] request(String str, String str2, byte[] bArr, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IOuterIpcInterface {
        private static final String DESCRIPTOR = "com.oplus.pantaconnect.service.IOuterIpcInterface";
        static final int TRANSACTION_request = 1;

        public static class Proxy implements IOuterIpcInterface {
            public static IOuterIpcInterface sDefaultImpl;
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

            @Override // com.oplus.pantaconnect.service.IOuterIpcInterface
            public byte[] request(String str, String str2, byte[] bArr, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeByteArray(bArr);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().request(str, str2, bArr, bundle);
                    }
                    parcelObtain2.readException();
                    byte[] bArrCreateByteArray = parcelObtain2.createByteArray();
                    parcelObtain2.readByteArray(bArr);
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return bArrCreateByteArray;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOuterIpcInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOuterIpcInterface)) ? new Proxy(iBinder) : (IOuterIpcInterface) iInterfaceQueryLocalInterface;
        }

        public static IOuterIpcInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOuterIpcInterface iOuterIpcInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iOuterIpcInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = iOuterIpcInterface;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            byte[] bArrRequest = request(string, string2, bArrCreateByteArray, bundle);
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrRequest);
            parcel2.writeByteArray(bArrCreateByteArray);
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    byte[] request(String str, String str2, byte[] bArr, Bundle bundle) throws RemoteException;
}
