package com.heytap.wearable.watch.clock;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IShowAlarmListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.watch.clock.IShowAlarmListener";

    public static class Default implements IShowAlarmListener {
        @Override // com.heytap.wearable.watch.clock.IShowAlarmListener
        public void alarmDismiss(int i, int i2) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.watch.clock.IShowAlarmListener
        public void startAlarm(AlarmSchedule alarmSchedule) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IShowAlarmListener {
        static final int TRANSACTION_alarmDismiss = 2;
        static final int TRANSACTION_startAlarm = 1;

        public static class Proxy implements IShowAlarmListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.wearable.watch.clock.IShowAlarmListener
            public void alarmDismiss(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IShowAlarmListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IShowAlarmListener.DESCRIPTOR;
            }

            @Override // com.heytap.wearable.watch.clock.IShowAlarmListener
            public void startAlarm(AlarmSchedule alarmSchedule) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IShowAlarmListener.DESCRIPTOR);
                    a.d(parcelObtain, alarmSchedule, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IShowAlarmListener.DESCRIPTOR);
        }

        public static IShowAlarmListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IShowAlarmListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IShowAlarmListener)) ? new Proxy(iBinder) : (IShowAlarmListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IShowAlarmListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IShowAlarmListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                startAlarm((AlarmSchedule) a.c(parcel, AlarmSchedule.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                alarmDismiss(parcel.readInt(), parcel.readInt());
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

    void alarmDismiss(int i, int i2) throws RemoteException;

    void startAlarm(AlarmSchedule alarmSchedule) throws RemoteException;
}
