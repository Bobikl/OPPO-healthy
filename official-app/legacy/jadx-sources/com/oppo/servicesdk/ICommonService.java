package com.oppo.servicesdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public interface ICommonService extends IInterface {
    public static final String DESCRIPTOR = "com.oppo.servicesdk.ICommonService";

    public static class Default implements ICommonService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oppo.servicesdk.ICommonService
        public String execute(WeatherRequest weatherRequest) {
            return null;
        }

        @Override // com.oppo.servicesdk.ICommonService
        public void register(String str, ICommonCallBack iCommonCallBack) {
        }

        @Override // com.oppo.servicesdk.ICommonService
        public void unregister(ICommonCallBack iCommonCallBack) {
        }
    }

    public static abstract class Stub extends Binder implements ICommonService {
        static final int TRANSACTION_execute = 1;
        static final int TRANSACTION_register = 2;
        static final int TRANSACTION_unregister = 3;

        public static class Proxy implements ICommonService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oppo.servicesdk.ICommonService
            public String execute(WeatherRequest weatherRequest) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonService.DESCRIPTOR);
                    a.d(parcelObtain, weatherRequest, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICommonService.DESCRIPTOR;
            }

            @Override // com.oppo.servicesdk.ICommonService
            public void register(String str, ICommonCallBack iCommonCallBack) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCommonCallBack);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oppo.servicesdk.ICommonService
            public void unregister(ICommonCallBack iCommonCallBack) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonCallBack);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICommonService.DESCRIPTOR);
        }

        public static ICommonService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICommonService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICommonService)) ? new Proxy(iBinder) : (ICommonService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICommonService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICommonService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                if (i == 2) {
                    register(parcel.readString(), ICommonCallBack.Stub.asInterface(parcel.readStrongBinder()));
                } else {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    unregister(ICommonCallBack.Stub.asInterface(parcel.readStrongBinder()));
                }
                parcel2.writeNoException();
            } else {
                String strExecute = execute((WeatherRequest) a.c(parcel, WeatherRequest.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strExecute);
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

    String execute(WeatherRequest weatherRequest);

    void register(String str, ICommonCallBack iCommonCallBack);

    void unregister(ICommonCallBack iCommonCallBack);
}
