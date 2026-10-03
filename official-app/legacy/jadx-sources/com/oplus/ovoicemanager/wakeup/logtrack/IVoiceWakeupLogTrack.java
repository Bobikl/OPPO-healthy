package com.oplus.ovoicemanager.wakeup.logtrack;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IVoiceWakeupLogTrack extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack";

    public static class Default implements IVoiceWakeupLogTrack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
        public int getAnalyticsDataCount() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
        public String getSingleAnalyticsData() throws RemoteException {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
        public int setAnalyticsDataLimit(int i) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IVoiceWakeupLogTrack {
        static final int TRANSACTION_getAnalyticsDataCount = 3;
        static final int TRANSACTION_getSingleAnalyticsData = 2;
        static final int TRANSACTION_setAnalyticsDataLimit = 1;

        public static class Proxy implements IVoiceWakeupLogTrack {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
            public int getAnalyticsDataCount() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupLogTrack.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IVoiceWakeupLogTrack.DESCRIPTOR;
            }

            @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
            public String getSingleAnalyticsData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupLogTrack.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
            public int setAnalyticsDataLimit(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceWakeupLogTrack.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IVoiceWakeupLogTrack.DESCRIPTOR);
        }

        public static IVoiceWakeupLogTrack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IVoiceWakeupLogTrack.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IVoiceWakeupLogTrack)) ? new Proxy(iBinder) : (IVoiceWakeupLogTrack) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IVoiceWakeupLogTrack.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IVoiceWakeupLogTrack.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int analyticsDataLimit = setAnalyticsDataLimit(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(analyticsDataLimit);
            } else if (i == 2) {
                String singleAnalyticsData = getSingleAnalyticsData();
                parcel2.writeNoException();
                parcel2.writeString(singleAnalyticsData);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int analyticsDataCount = getAnalyticsDataCount();
                parcel2.writeNoException();
                parcel2.writeInt(analyticsDataCount);
            }
            return true;
        }
    }

    int getAnalyticsDataCount() throws RemoteException;

    String getSingleAnalyticsData() throws RemoteException;

    int setAnalyticsDataLimit(int i) throws RemoteException;
}
