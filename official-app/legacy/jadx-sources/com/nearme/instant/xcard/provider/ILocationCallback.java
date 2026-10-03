package com.nearme.instant.xcard.provider;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface ILocationCallback extends IInterface {
    public static final String DESCRIPTOR = "com.nearme.instant.xcard.provider.ILocationCallback";

    public static class Default implements ILocationCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nearme.instant.xcard.provider.ILocationCallback
        public void onGetLocation(int i, Location location) throws RemoteException {
        }

        @Override // com.nearme.instant.xcard.provider.ILocationCallback
        public void reverseGeocodeQuery(int i, String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ILocationCallback {
        static final int TRANSACTION_onGetLocation = 1;
        static final int TRANSACTION_reverseGeocodeQuery = 2;

        public static class Proxy implements ILocationCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ILocationCallback.DESCRIPTOR;
            }

            @Override // com.nearme.instant.xcard.provider.ILocationCallback
            public void onGetLocation(int i, Location location) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILocationCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, location, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.instant.xcard.provider.ILocationCallback
            public void reverseGeocodeQuery(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILocationCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ILocationCallback.DESCRIPTOR);
        }

        public static ILocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ILocationCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILocationCallback)) ? new Proxy(iBinder) : (ILocationCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ILocationCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ILocationCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onGetLocation(parcel.readInt(), (Location) _Parcel.readTypedObject(parcel, Location.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                reverseGeocodeQuery(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onGetLocation(int i, Location location) throws RemoteException;

    void reverseGeocodeQuery(int i, String str) throws RemoteException;
}
