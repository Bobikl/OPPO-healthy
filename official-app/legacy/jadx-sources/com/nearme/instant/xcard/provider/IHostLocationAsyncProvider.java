package com.nearme.instant.xcard.provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface IHostLocationAsyncProvider extends IInterface {
    public static final String DESCRIPTOR = "com.nearme.instant.xcard.provider.IHostLocationAsyncProvider";

    public static class Default implements IHostLocationAsyncProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
        public void getLocation(int i, ILocationCallback iLocationCallback) throws RemoteException {
        }

        @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
        public void getLocationCardInfo(int i, ILocationCallback iLocationCallback, Map map) throws RemoteException {
        }

        @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
        public void releaseGeocode() throws RemoteException {
        }

        @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
        public void reverseGeocodeQuery(int i, ILocationCallback iLocationCallback, Map map) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHostLocationAsyncProvider {
        static final int TRANSACTION_getLocation = 1;
        static final int TRANSACTION_getLocationCardInfo = 2;
        static final int TRANSACTION_releaseGeocode = 4;
        static final int TRANSACTION_reverseGeocodeQuery = 3;

        public static class Proxy implements IHostLocationAsyncProvider {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IHostLocationAsyncProvider.DESCRIPTOR;
            }

            @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
            public void getLocation(int i, ILocationCallback iLocationCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHostLocationAsyncProvider.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iLocationCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
            public void getLocationCardInfo(int i, ILocationCallback iLocationCallback, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHostLocationAsyncProvider.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iLocationCallback);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
            public void releaseGeocode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHostLocationAsyncProvider.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.instant.xcard.provider.IHostLocationAsyncProvider
            public void reverseGeocodeQuery(int i, ILocationCallback iLocationCallback, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHostLocationAsyncProvider.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iLocationCallback);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHostLocationAsyncProvider.DESCRIPTOR);
        }

        public static IHostLocationAsyncProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IHostLocationAsyncProvider.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHostLocationAsyncProvider)) ? new Proxy(iBinder) : (IHostLocationAsyncProvider) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHostLocationAsyncProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHostLocationAsyncProvider.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getLocation(parcel.readInt(), ILocationCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                getLocationCardInfo(parcel.readInt(), ILocationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
            } else if (i == 3) {
                reverseGeocodeQuery(parcel.readInt(), ILocationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                releaseGeocode();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void getLocation(int i, ILocationCallback iLocationCallback) throws RemoteException;

    void getLocationCardInfo(int i, ILocationCallback iLocationCallback, Map map) throws RemoteException;

    void releaseGeocode() throws RemoteException;

    void reverseGeocodeQuery(int i, ILocationCallback iLocationCallback, Map map) throws RemoteException;
}
