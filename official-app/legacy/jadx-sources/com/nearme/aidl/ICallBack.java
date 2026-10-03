package com.nearme.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.mek;

/* JADX INFO: loaded from: classes5.dex */
public interface ICallBack extends IInterface {

    public static class Default implements ICallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nearme.aidl.ICallBack
        public void myStartActivity(String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICallBack {
        private static final String DESCRIPTOR = mek.g();
        static final int TRANSACTION_myStartActivity = 1;

        public static class Proxy implements ICallBack {
            public static ICallBack sDefaultImpl;
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

            @Override // com.nearme.aidl.ICallBack
            public void myStartActivity(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().myStartActivity(str, str2);
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

        public static ICallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICallBack)) ? new Proxy(iBinder) : (ICallBack) iInterfaceQueryLocalInterface;
        }

        public static ICallBack getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICallBack iCallBack) {
            if (Proxy.sDefaultImpl != null || iCallBack == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCallBack;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = DESCRIPTOR;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            myStartActivity(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void myStartActivity(String str, String str2) throws RemoteException;
}
