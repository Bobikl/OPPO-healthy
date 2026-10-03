package com.nearme.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.mek;

/* JADX INFO: loaded from: classes5.dex */
public interface IAskToken extends IInterface {

    public static class Default implements IAskToken {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nearme.aidl.IAskToken
        public void registerCallback(ICallBack iCallBack) throws RemoteException {
        }

        @Override // com.nearme.aidl.IAskToken
        public UserEntity reqCheckPwd(String str) throws RemoteException {
            return null;
        }

        @Override // com.nearme.aidl.IAskToken
        public UserEntity reqReSignin(String str) throws RemoteException {
            return null;
        }

        @Override // com.nearme.aidl.IAskToken
        public UserEntity reqToken(String str) throws RemoteException {
            return null;
        }

        @Override // com.nearme.aidl.IAskToken
        public void unregisterCallback(ICallBack iCallBack) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAskToken {
        private static final String DESCRIPTOR = mek.f();
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_reqCheckPwd = 5;
        static final int TRANSACTION_reqReSignin = 4;
        static final int TRANSACTION_reqToken = 3;
        static final int TRANSACTION_unregisterCallback = 2;

        public static class Proxy implements IAskToken {
            public static IAskToken sDefaultImpl;
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

            @Override // com.nearme.aidl.IAskToken
            public void registerCallback(ICallBack iCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iCallBack != null ? iCallBack.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerCallback(iCallBack);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.aidl.IAskToken
            public UserEntity reqCheckPwd(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().reqCheckPwd(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserEntity.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.aidl.IAskToken
            public UserEntity reqReSignin(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().reqReSignin(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserEntity.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.aidl.IAskToken
            public UserEntity reqToken(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().reqToken(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? UserEntity.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nearme.aidl.IAskToken
            public void unregisterCallback(ICallBack iCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iCallBack != null ? iCallBack.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unregisterCallback(iCallBack);
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

        public static IAskToken asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAskToken)) ? new Proxy(iBinder) : (IAskToken) iInterfaceQueryLocalInterface;
        }

        public static IAskToken getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAskToken iAskToken) {
            if (Proxy.sDefaultImpl != null || iAskToken == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAskToken;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = DESCRIPTOR;
            if (i == 1) {
                parcel.enforceInterface(str);
                registerCallback(ICallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(str);
                unregisterCallback(ICallBack.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(str);
                UserEntity userEntityReqToken = reqToken(parcel.readString());
                parcel2.writeNoException();
                if (userEntityReqToken != null) {
                    parcel2.writeInt(1);
                    userEntityReqToken.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(str);
                UserEntity userEntityReqReSignin = reqReSignin(parcel.readString());
                parcel2.writeNoException();
                if (userEntityReqReSignin != null) {
                    parcel2.writeInt(1);
                    userEntityReqReSignin.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            UserEntity userEntityReqCheckPwd = reqCheckPwd(parcel.readString());
            parcel2.writeNoException();
            if (userEntityReqCheckPwd != null) {
                parcel2.writeInt(1);
                userEntityReqCheckPwd.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void registerCallback(ICallBack iCallBack) throws RemoteException;

    UserEntity reqCheckPwd(String str) throws RemoteException;

    UserEntity reqReSignin(String str) throws RemoteException;

    UserEntity reqToken(String str) throws RemoteException;

    void unregisterCallback(ICallBack iCallBack) throws RemoteException;
}
