package com.oplus.pay.opensdk.taskwall.floatwindow;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IFloatBallService extends IInterface {

    public static class Default implements IFloatBallService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
        public void setActivityInfo(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
        public void setStateListener(IFloatBallStateListen iFloatBallStateListen) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFloatBallService {
        private static final String DESCRIPTOR = "com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService";
        static final int TRANSACTION_setActivityInfo = 2;
        static final int TRANSACTION_setStateListener = 1;

        public static class Proxy implements IFloatBallService {
            public static IFloatBallService sDefaultImpl;
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

            @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
            public void setActivityInfo(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setActivityInfo(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallService
            public void setStateListener(IFloatBallStateListen iFloatBallStateListen) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iFloatBallStateListen != null ? iFloatBallStateListen.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setStateListener(iFloatBallStateListen);
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

        public static IFloatBallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFloatBallService)) ? new Proxy(iBinder) : (IFloatBallService) iInterfaceQueryLocalInterface;
        }

        public static IFloatBallService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IFloatBallService iFloatBallService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iFloatBallService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iFloatBallService;
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
                setStateListener(IFloatBallStateListen.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            setActivityInfo(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void setActivityInfo(String str, String str2) throws RemoteException;

    void setStateListener(IFloatBallStateListen iFloatBallStateListen) throws RemoteException;
}
