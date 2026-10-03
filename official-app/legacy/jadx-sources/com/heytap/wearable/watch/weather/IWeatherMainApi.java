package com.heytap.wearable.watch.weather;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IWeatherMainApi extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.watch.weather.IWeatherMainApi";

    public static class Default implements IWeatherMainApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.watch.weather.IWeatherMainApi
        public void oobeSyncFinish(boolean z) throws RemoteException {
        }

        @Override // com.heytap.wearable.watch.weather.IWeatherMainApi
        public void startPage(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWeatherMainApi {
        static final int TRANSACTION_oobeSyncFinish = 1;
        static final int TRANSACTION_startPage = 2;

        public static class Proxy implements IWeatherMainApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWeatherMainApi.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherMainApi
            public void oobeSyncFinish(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWeatherMainApi.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherMainApi
            public void startPage(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWeatherMainApi.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWeatherMainApi.DESCRIPTOR);
        }

        public static IWeatherMainApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWeatherMainApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWeatherMainApi)) ? new Proxy(iBinder) : (IWeatherMainApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWeatherMainApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWeatherMainApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                oobeSyncFinish(parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                startPage(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void oobeSyncFinish(boolean z) throws RemoteException;

    void startPage(int i) throws RemoteException;
}
