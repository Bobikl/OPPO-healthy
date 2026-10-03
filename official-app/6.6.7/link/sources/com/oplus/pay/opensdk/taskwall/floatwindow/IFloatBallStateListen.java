package com.oplus.pay.opensdk.taskwall.floatwindow;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IFloatBallStateListen extends IInterface {

    public static class Default implements IFloatBallStateListen {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
        public void onCountDownFinish(String str) throws RemoteException {
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
        public void onFloatBallHide(String str) throws RemoteException {
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
        public void onFloatBallShow(String str) throws RemoteException {
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
        public void onTaskFailed(String str, String str2, String str3) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFloatBallStateListen {
        private static final String DESCRIPTOR = "com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen";
        static final int TRANSACTION_onCountDownFinish = 1;
        static final int TRANSACTION_onFloatBallHide = 3;
        static final int TRANSACTION_onFloatBallShow = 2;
        static final int TRANSACTION_onTaskFailed = 4;

        public static class Proxy implements IFloatBallStateListen {
            public static IFloatBallStateListen sDefaultImpl;
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

            @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
            public void onCountDownFinish(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onCountDownFinish(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
            public void onFloatBallHide(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFloatBallHide(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
            public void onFloatBallShow(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFloatBallShow(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
            public void onTaskFailed(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onTaskFailed(str, str2, str3);
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

        public static IFloatBallStateListen asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFloatBallStateListen)) ? new Proxy(iBinder) : (IFloatBallStateListen) iInterfaceQueryLocalInterface;
        }

        public static IFloatBallStateListen getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IFloatBallStateListen iFloatBallStateListen) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iFloatBallStateListen == null) {
                return false;
            }
            Proxy.sDefaultImpl = iFloatBallStateListen;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onCountDownFinish(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFloatBallShow(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onFloatBallHide(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onTaskFailed(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onCountDownFinish(String str) throws RemoteException;

    void onFloatBallHide(String str) throws RemoteException;

    void onFloatBallShow(String str) throws RemoteException;

    void onTaskFailed(String str, String str2, String str3) throws RemoteException;
}
