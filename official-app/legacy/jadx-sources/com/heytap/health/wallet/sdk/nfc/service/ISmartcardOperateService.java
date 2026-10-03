package com.heytap.health.wallet.sdk.nfc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface ISmartcardOperateService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService";

    public static class Default implements ISmartcardOperateService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String checkIssueConditions(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String checkServiceStatus(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String deleteCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String issueCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String preIssueCard(Map map) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String queryCplc() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String queryTrafficCardInfo(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
        public String recharge(Map map) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ISmartcardOperateService {
        static final int TRANSACTION_checkIssueConditions = 8;
        static final int TRANSACTION_checkServiceStatus = 7;
        static final int TRANSACTION_deleteCard = 6;
        static final int TRANSACTION_issueCard = 3;
        static final int TRANSACTION_preIssueCard = 2;
        static final int TRANSACTION_queryCplc = 1;
        static final int TRANSACTION_queryTrafficCardInfo = 5;
        static final int TRANSACTION_recharge = 4;

        public static class Proxy implements ISmartcardOperateService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String checkIssueConditions(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String checkServiceStatus(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String deleteCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ISmartcardOperateService.DESCRIPTOR;
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String issueCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String preIssueCard(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String queryCplc() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String queryTrafficCardInfo(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
            public String recharge(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardOperateService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISmartcardOperateService.DESCRIPTOR);
        }

        public static ISmartcardOperateService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartcardOperateService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISmartcardOperateService)) ? new Proxy(iBinder) : (ISmartcardOperateService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartcardOperateService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartcardOperateService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    String strQueryCplc = queryCplc();
                    parcel2.writeNoException();
                    parcel2.writeString(strQueryCplc);
                    return true;
                case 2:
                    String strPreIssueCard = preIssueCard(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strPreIssueCard);
                    return true;
                case 3:
                    String strIssueCard = issueCard(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strIssueCard);
                    return true;
                case 4:
                    String strRecharge = recharge(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strRecharge);
                    return true;
                case 5:
                    String strQueryTrafficCardInfo = queryTrafficCardInfo(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(strQueryTrafficCardInfo);
                    return true;
                case 6:
                    String strDeleteCard = deleteCard(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strDeleteCard);
                    return true;
                case 7:
                    String strCheckServiceStatus = checkServiceStatus(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strCheckServiceStatus);
                    return true;
                case 8:
                    String strCheckIssueConditions = checkIssueConditions(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strCheckIssueConditions);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String checkIssueConditions(Map map) throws RemoteException;

    String checkServiceStatus(Map map) throws RemoteException;

    String deleteCard(Map map) throws RemoteException;

    String issueCard(Map map) throws RemoteException;

    String preIssueCard(Map map) throws RemoteException;

    String queryCplc() throws RemoteException;

    String queryTrafficCardInfo(String str, int i) throws RemoteException;

    String recharge(Map map) throws RemoteException;
}
