package com.heytap.health.wallet.sdk.nfc.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface ISmartcardFormatService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatService";

    public static class Default implements ISmartcardFormatService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatService
        public void formatCards(Map map, ISmartcardFormatCallback iSmartcardFormatCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISmartcardFormatService {
        static final int TRANSACTION_formatCards = 1;

        public static class Proxy implements ISmartcardFormatService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatService
            public void formatCards(Map map, ISmartcardFormatCallback iSmartcardFormatCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISmartcardFormatService.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    parcelObtain.writeStrongInterface(iSmartcardFormatCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ISmartcardFormatService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, ISmartcardFormatService.DESCRIPTOR);
        }

        public static ISmartcardFormatService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISmartcardFormatService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISmartcardFormatService)) ? new Proxy(iBinder) : (ISmartcardFormatService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISmartcardFormatService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISmartcardFormatService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            formatCards(parcel.readHashMap(getClass().getClassLoader()), ISmartcardFormatCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void formatCards(Map map, ISmartcardFormatCallback iSmartcardFormatCallback) throws RemoteException;
}
