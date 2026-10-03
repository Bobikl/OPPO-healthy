package com.google.android.clockwork.companion.partnerapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface PartnerHostedApi extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.clockwork.companion.partnerapi.PartnerHostedApi";

    public static class Default implements PartnerHostedApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.PartnerHostedApi
        public SmartWatchInfo getPendingPairingSmartWatchInfo() throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements PartnerHostedApi {
        static final int TRANSACTION_getPendingPairingSmartWatchInfo = 1;

        public static class Proxy implements PartnerHostedApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return PartnerHostedApi.DESCRIPTOR;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerHostedApi
            public SmartWatchInfo getPendingPairingSmartWatchInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerHostedApi.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SmartWatchInfo) _Parcel.readTypedObject(parcelObtain2, SmartWatchInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, PartnerHostedApi.DESCRIPTOR);
        }

        public static PartnerHostedApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PartnerHostedApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof PartnerHostedApi)) ? new Proxy(iBinder) : (PartnerHostedApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PartnerHostedApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PartnerHostedApi.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            SmartWatchInfo pendingPairingSmartWatchInfo = getPendingPairingSmartWatchInfo();
            parcel2.writeNoException();
            _Parcel.writeTypedObject(parcel2, pendingPairingSmartWatchInfo, 1);
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    SmartWatchInfo getPendingPairingSmartWatchInfo() throws RemoteException;
}
