package com.heytap.health.health.impl;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IPhoneMeasure extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.health.impl.IPhoneMeasure";

    public static class Default implements IPhoneMeasure {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.health.impl.IPhoneMeasure
        public void cancelPlayMusicNotice() throws RemoteException {
        }

        @Override // com.heytap.health.health.impl.IPhoneMeasure
        public void outSleep() throws RemoteException {
        }

        @Override // com.heytap.health.health.impl.IPhoneMeasure
        public void showPlayMusicNotice(boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.health.impl.IPhoneMeasure
        public void startMeasure(Notification notification) throws RemoteException {
        }

        @Override // com.heytap.health.health.impl.IPhoneMeasure
        public void stopMeasure() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPhoneMeasure {
        static final int TRANSACTION_cancelPlayMusicNotice = 4;
        static final int TRANSACTION_outSleep = 5;
        static final int TRANSACTION_showPlayMusicNotice = 3;
        static final int TRANSACTION_startMeasure = 1;
        static final int TRANSACTION_stopMeasure = 2;

        public static class Proxy implements IPhoneMeasure {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.health.impl.IPhoneMeasure
            public void cancelPlayMusicNotice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneMeasure.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IPhoneMeasure.DESCRIPTOR;
            }

            @Override // com.heytap.health.health.impl.IPhoneMeasure
            public void outSleep() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneMeasure.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.health.impl.IPhoneMeasure
            public void showPlayMusicNotice(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneMeasure.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.health.impl.IPhoneMeasure
            public void startMeasure(Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneMeasure.DESCRIPTOR);
                    a.d(parcelObtain, notification, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.health.impl.IPhoneMeasure
            public void stopMeasure() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPhoneMeasure.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPhoneMeasure.DESCRIPTOR);
        }

        public static IPhoneMeasure asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPhoneMeasure.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPhoneMeasure)) ? new Proxy(iBinder) : (IPhoneMeasure) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IPhoneMeasure.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IPhoneMeasure.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                startMeasure((Notification) a.c(parcel, Notification.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                stopMeasure();
                parcel2.writeNoException();
            } else if (i == 3) {
                showPlayMusicNotice(parcel.readInt() != 0);
                parcel2.writeNoException();
            } else if (i == 4) {
                cancelPlayMusicNotice();
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                outSleep();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void cancelPlayMusicNotice() throws RemoteException;

    void outSleep() throws RemoteException;

    void showPlayMusicNotice(boolean z) throws RemoteException;

    void startMeasure(Notification notification) throws RemoteException;

    void stopMeasure() throws RemoteException;
}
