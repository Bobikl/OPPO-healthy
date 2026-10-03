package org.iccoa.android.digitalkey;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IDigitalKeyFrameworkClient extends IInterface {

    public static class Default implements IDigitalKeyFrameworkClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // org.iccoa.android.digitalkey.IDigitalKeyFrameworkClient
        public void request(String str, Bundle bundle, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDigitalKeyFrameworkClient {
        private static final String DESCRIPTOR = "org.iccoa.android.digitalkey.IDigitalKeyFrameworkClient";
        static final int TRANSACTION_request = 1;

        public static class Proxy implements IDigitalKeyFrameworkClient {
            public static IDigitalKeyFrameworkClient sDefaultImpl;
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

            @Override // org.iccoa.android.digitalkey.IDigitalKeyFrameworkClient
            public void request(String str, Bundle bundle, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iDigitalKeyCallback != null ? iDigitalKeyCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().request(str, bundle, iDigitalKeyCallback);
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

        public static IDigitalKeyFrameworkClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDigitalKeyFrameworkClient)) ? new Proxy(iBinder) : (IDigitalKeyFrameworkClient) iInterfaceQueryLocalInterface;
        }

        public static IDigitalKeyFrameworkClient getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDigitalKeyFrameworkClient iDigitalKeyFrameworkClient) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDigitalKeyFrameworkClient == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDigitalKeyFrameworkClient;
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
            request(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IDigitalKeyCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void request(String str, Bundle bundle, IDigitalKeyCallback iDigitalKeyCallback) throws RemoteException;
}
