package com.heytap.health.health.bitmap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IBitmapProviderService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.health.bitmap.IBitmapProviderService";

    public static class Default implements IBitmapProviderService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.health.bitmap.IBitmapProviderService
        public DataResult getBitmapByData(String str) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.health.bitmap.IBitmapProviderService
        public ThemeDataResult getThemeBitmapByData(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IBitmapProviderService {
        static final int TRANSACTION_getBitmapByData = 1;
        static final int TRANSACTION_getThemeBitmapByData = 2;

        public static class Proxy implements IBitmapProviderService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.health.bitmap.IBitmapProviderService
            public DataResult getBitmapByData(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IBitmapProviderService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DataResult) a.c(parcelObtain2, DataResult.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBitmapProviderService.DESCRIPTOR;
            }

            @Override // com.heytap.health.health.bitmap.IBitmapProviderService
            public ThemeDataResult getThemeBitmapByData(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IBitmapProviderService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ThemeDataResult) a.c(parcelObtain2, ThemeDataResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBitmapProviderService.DESCRIPTOR);
        }

        public static IBitmapProviderService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IBitmapProviderService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBitmapProviderService)) ? new Proxy(iBinder) : (IBitmapProviderService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBitmapProviderService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBitmapProviderService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                DataResult bitmapByData = getBitmapByData(parcel.readString());
                parcel2.writeNoException();
                a.d(parcel2, bitmapByData, 1);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                ThemeDataResult themeBitmapByData = getThemeBitmapByData(parcel.readString());
                parcel2.writeNoException();
                a.d(parcel2, themeBitmapByData, 1);
            }
            return true;
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    DataResult getBitmapByData(String str) throws RemoteException;

    ThemeDataResult getThemeBitmapByData(String str) throws RemoteException;
}
