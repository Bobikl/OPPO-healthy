package com.heytap.health.wallet.key;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface IOperateCardService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.wallet.key.IOperateCardService";

    public static class Default implements IOperateCardService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public String beginTransaction(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public String completeTransaction(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public String executeTransaction(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public String invokeFunction(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public String isLogin(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public String queryData(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.key.IOperateCardService
        public void requestLogin(Map map, IOneParamCallBack iOneParamCallBack) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOperateCardService {
        static final int TRANSACTION_beginTransaction = 2;
        static final int TRANSACTION_completeTransaction = 4;
        static final int TRANSACTION_executeTransaction = 3;
        static final int TRANSACTION_invokeFunction = 5;
        static final int TRANSACTION_isLogin = 6;
        static final int TRANSACTION_queryData = 1;
        static final int TRANSACTION_requestLogin = 7;

        public static class Proxy implements IOperateCardService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public String beginTransaction(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public String completeTransaction(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public String executeTransaction(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOperateCardService.DESCRIPTOR;
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public String invokeFunction(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public String isLogin(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public String queryData(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.key.IOperateCardService
            public void requestLogin(Map map, IOneParamCallBack iOneParamCallBack) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOperateCardService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    parcelObtain.writeStrongInterface(iOneParamCallBack);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOperateCardService.DESCRIPTOR);
        }

        public static IOperateCardService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOperateCardService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOperateCardService)) ? new Proxy(iBinder) : (IOperateCardService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOperateCardService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOperateCardService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    String strQueryData = queryData(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strQueryData);
                    return true;
                case 2:
                    String strBeginTransaction = beginTransaction(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strBeginTransaction);
                    return true;
                case 3:
                    String strExecuteTransaction = executeTransaction(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strExecuteTransaction);
                    return true;
                case 4:
                    String strCompleteTransaction = completeTransaction(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strCompleteTransaction);
                    return true;
                case 5:
                    String strInvokeFunction = invokeFunction(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strInvokeFunction);
                    return true;
                case 6:
                    String strIsLogin = isLogin(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strIsLogin);
                    return true;
                case 7:
                    requestLogin(parcel.readHashMap(getClass().getClassLoader()), IOneParamCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String beginTransaction(Map map) throws RemoteException;

    String completeTransaction(Map map) throws RemoteException;

    String executeTransaction(Map map) throws RemoteException;

    String invokeFunction(Map map) throws RemoteException;

    String isLogin(Map map) throws RemoteException;

    String queryData(Map map) throws RemoteException;

    void requestLogin(Map map, IOneParamCallBack iOneParamCallBack) throws RemoteException;
}
