package com.heytap.health.wallet.sdk.nfc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface ISmartcardDelService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService";

    public static class Default implements ISmartcardDelService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService
        public String deleteCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService
        public String queryCplc() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService
        public String queryTrafficCardInfo(String str, int i) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ISmartcardDelService {
        static final int TRANSACTION_deleteCard = 3;
        static final int TRANSACTION_queryCplc = 1;
        static final int TRANSACTION_queryTrafficCardInfo = 2;

        public static class Proxy implements ISmartcardDelService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService
            public String deleteCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardDelService.DESCRIPTOR);
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
                return ISmartcardDelService.DESCRIPTOR;
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService
            public String queryCplc() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardDelService.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardDelService
            public String queryTrafficCardInfo(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardDelService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISmartcardDelService.DESCRIPTOR);
        }

        public static ISmartcardDelService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartcardDelService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISmartcardDelService)) ? new Proxy(iBinder) : (ISmartcardDelService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartcardDelService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartcardDelService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String strQueryCplc = queryCplc();
                parcel2.writeNoException();
                parcel2.writeString(strQueryCplc);
            } else if (i == 2) {
                String strQueryTrafficCardInfo = queryTrafficCardInfo(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(strQueryTrafficCardInfo);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                String strDeleteCard = deleteCard(parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeString(strDeleteCard);
            }
            return true;
        }
    }

    String deleteCard(Map map) throws RemoteException;

    String queryCplc() throws RemoteException;

    String queryTrafficCardInfo(String str, int i) throws RemoteException;
}
