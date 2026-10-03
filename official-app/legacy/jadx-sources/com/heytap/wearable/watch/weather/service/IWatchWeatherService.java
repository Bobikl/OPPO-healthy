package com.heytap.wearable.watch.weather.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.wearable.watch.weather.callback.IWeatherCallBack;

/* JADX INFO: loaded from: classes3.dex */
public interface IWatchWeatherService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.watch.weather.service.IWatchWeatherService";

    public static class Default implements IWatchWeatherService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.watch.weather.service.IWatchWeatherService
        public void getWatchCityList(IWeatherCallBack iWeatherCallBack) throws RemoteException {
        }

        @Override // com.heytap.wearable.watch.weather.service.IWatchWeatherService
        public void getWatchWeatherDetail(String str, IWeatherCallBack iWeatherCallBack) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWatchWeatherService {
        static final int TRANSACTION_getWatchCityList = 1;
        static final int TRANSACTION_getWatchWeatherDetail = 2;

        public static class Proxy implements IWatchWeatherService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWatchWeatherService.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.watch.weather.service.IWatchWeatherService
            public void getWatchCityList(IWeatherCallBack iWeatherCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWatchWeatherService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iWeatherCallBack);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.watch.weather.service.IWatchWeatherService
            public void getWatchWeatherDetail(String str, IWeatherCallBack iWeatherCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWatchWeatherService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iWeatherCallBack);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWatchWeatherService.DESCRIPTOR);
        }

        public static IWatchWeatherService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWatchWeatherService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWatchWeatherService)) ? new Proxy(iBinder) : (IWatchWeatherService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWatchWeatherService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWatchWeatherService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                getWatchCityList(IWeatherCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                getWatchWeatherDetail(parcel.readString(), IWeatherCallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void getWatchCityList(IWeatherCallBack iWeatherCallBack) throws RemoteException;

    void getWatchWeatherDetail(String str, IWeatherCallBack iWeatherCallBack) throws RemoteException;
}
