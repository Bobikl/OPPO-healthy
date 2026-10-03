package com.nearme.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.mek;

/* JADX INFO: loaded from: classes5.dex */
public interface IAskSigninByAppCode extends IInterface {

    public static class Default implements IAskSigninByAppCode {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nearme.aidl.IAskSigninByAppCode
        public UserEntity reqSignin(String str, String str2, String str3, String str4, String str5, String str6) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IAskSigninByAppCode {
        private static final String DESCRIPTOR = mek.c();
        static final int TRANSACTION_reqSignin = 1;

        public static class Proxy implements IAskSigninByAppCode {
            public static IAskSigninByAppCode sDefaultImpl;
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

            @Override // com.nearme.aidl.IAskSigninByAppCode
            public UserEntity reqSignin(String str, String str2, String str3, String str4, String str5, String str6) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    parcelObtain.writeString(str6);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().reqSignin(str, str2, str3, str4, str5, str6);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserEntity.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAskSigninByAppCode asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAskSigninByAppCode)) ? new Proxy(iBinder) : (IAskSigninByAppCode) iInterfaceQueryLocalInterface;
        }

        public static IAskSigninByAppCode getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAskSigninByAppCode iAskSigninByAppCode) {
            if (Proxy.sDefaultImpl != null || iAskSigninByAppCode == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAskSigninByAppCode;
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
            UserEntity userEntityReqSignin = reqSignin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            if (userEntityReqSignin != null) {
                parcel2.writeInt(1);
                userEntityReqSignin.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    UserEntity reqSignin(String str, String str2, String str3, String str4, String str5, String str6) throws RemoteException;
}
