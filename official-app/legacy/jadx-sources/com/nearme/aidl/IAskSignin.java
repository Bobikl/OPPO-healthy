package com.nearme.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.mek;

/* JADX INFO: loaded from: classes5.dex */
public interface IAskSignin extends IInterface {

    public static class Default implements IAskSignin {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nearme.aidl.IAskSignin
        public UserEntity reqSignin(String str, String str2, String str3, String str4, String str5) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IAskSignin {
        private static final String DESCRIPTOR = mek.d();
        static final int TRANSACTION_reqSignin = 1;

        public static class Proxy implements IAskSignin {
            public static IAskSignin sDefaultImpl;
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

            @Override // com.nearme.aidl.IAskSignin
            public UserEntity reqSignin(String str, String str2, String str3, String str4, String str5) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().reqSignin(str, str2, str3, str4, str5);
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

        public static IAskSignin asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAskSignin)) ? new Proxy(iBinder) : (IAskSignin) iInterfaceQueryLocalInterface;
        }

        public static IAskSignin getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAskSignin iAskSignin) {
            if (Proxy.sDefaultImpl != null || iAskSignin == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAskSignin;
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
            UserEntity userEntityReqSignin = reqSignin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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

    UserEntity reqSignin(String str, String str2, String str3, String str4, String str5) throws RemoteException;
}
