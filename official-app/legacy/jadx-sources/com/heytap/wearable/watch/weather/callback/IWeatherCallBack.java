package com.heytap.wearable.watch.weather.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IWeatherCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.watch.weather.callback.IWeatherCallBack";

    public static class Default implements IWeatherCallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.watch.weather.callback.IWeatherCallBack
        public void onCallBack(int i, String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWeatherCallBack {
        static final int TRANSACTION_onCallBack = 1;

        public static class Proxy implements IWeatherCallBack {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWeatherCallBack.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.watch.weather.callback.IWeatherCallBack
            public void onCallBack(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWeatherCallBack.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWeatherCallBack.DESCRIPTOR);
        }

        public static IWeatherCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWeatherCallBack.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWeatherCallBack)) ? new Proxy(iBinder) : (IWeatherCallBack) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWeatherCallBack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWeatherCallBack.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onCallBack(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onCallBack(int i, String str) throws RemoteException;
}
