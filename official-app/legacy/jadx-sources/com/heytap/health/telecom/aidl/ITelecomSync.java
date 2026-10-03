package com.heytap.health.telecom.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public interface ITelecomSync extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.telecom.aidl.ITelecomSync";

    public static class Default implements ITelecomSync {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSync
        public void listenPhoneState() throws RemoteException {
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSync
        public void onAction(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITelecomSync {
        static final int TRANSACTION_listenPhoneState = 2;
        static final int TRANSACTION_onAction = 1;

        public static class Proxy implements ITelecomSync {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ITelecomSync.DESCRIPTOR;
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSync
            public void listenPhoneState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSync.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSync
            public void onAction(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSync.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITelecomSync.DESCRIPTOR);
        }

        public static ITelecomSync asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITelecomSync.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITelecomSync)) ? new Proxy(iBinder) : (ITelecomSync) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITelecomSync.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITelecomSync.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onAction(parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                listenPhoneState();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void listenPhoneState() throws RemoteException;

    void onAction(int i) throws RemoteException;
}
