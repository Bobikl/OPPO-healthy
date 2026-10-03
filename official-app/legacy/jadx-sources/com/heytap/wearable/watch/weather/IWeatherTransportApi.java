package com.heytap.wearable.watch.weather;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.wearable.watch.weather.callback.IWeatherCallBack;

/* JADX INFO: loaded from: classes3.dex */
public interface IWeatherTransportApi extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.watch.weather.IWeatherTransportApi";

    public static class Default implements IWeatherTransportApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
        public void getUltraVioleData(boolean z, IWeatherCallBack iWeatherCallBack) throws RemoteException {
        }

        @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
        public void sendOobeSync() throws RemoteException {
        }

        @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
        public void syncAfterPermissionGrant() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWeatherTransportApi {
        static final int TRANSACTION_getUltraVioleData = 3;
        static final int TRANSACTION_sendOobeSync = 1;
        static final int TRANSACTION_syncAfterPermissionGrant = 2;

        public static class Proxy implements IWeatherTransportApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWeatherTransportApi.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
            public void getUltraVioleData(boolean z, IWeatherCallBack iWeatherCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWeatherTransportApi.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iWeatherCallBack);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
            public void sendOobeSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWeatherTransportApi.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
            public void syncAfterPermissionGrant() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWeatherTransportApi.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWeatherTransportApi.DESCRIPTOR);
        }

        public static IWeatherTransportApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWeatherTransportApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWeatherTransportApi)) ? new Proxy(iBinder) : (IWeatherTransportApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWeatherTransportApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWeatherTransportApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                sendOobeSync();
                parcel2.writeNoException();
            } else if (i == 2) {
                syncAfterPermissionGrant();
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                getUltraVioleData(parcel.readInt() != 0, IWeatherCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void getUltraVioleData(boolean z, IWeatherCallBack iWeatherCallBack) throws RemoteException;

    void sendOobeSync() throws RemoteException;

    void syncAfterPermissionGrant() throws RemoteException;
}
