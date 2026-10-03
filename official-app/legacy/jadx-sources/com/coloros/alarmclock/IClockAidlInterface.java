package com.coloros.alarmclock;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.platformalarmclock.PlatformClockInfo;

/* JADX INFO: loaded from: classes13.dex */
public interface IClockAidlInterface extends IInterface {
    public static final String DESCRIPTOR = "com.coloros.alarmclock.IClockAidlInterface";

    public static class Default implements IClockAidlInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public void bindAlarmClock() {
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public boolean dismissClock(long j2) {
            return false;
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public PlatformClockInfo getCurrentAlarm() {
            return null;
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public void notifyDataChange(int i, long j2) {
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public void reWakeUpCurrentAlarmRing() {
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public boolean registerListener(IClockUpdateAidlInterface iClockUpdateAidlInterface) {
            return false;
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public boolean snoozeClock(long j2) {
            return false;
        }

        @Override // com.coloros.alarmclock.IClockAidlInterface
        public void unbindAlarmClock() {
        }
    }

    public static abstract class Stub extends Binder implements IClockAidlInterface {
        static final int TRANSACTION_bindAlarmClock = 1;
        static final int TRANSACTION_dismissClock = 2;
        static final int TRANSACTION_getCurrentAlarm = 7;
        static final int TRANSACTION_notifyDataChange = 8;
        static final int TRANSACTION_reWakeUpCurrentAlarmRing = 6;
        static final int TRANSACTION_registerListener = 4;
        static final int TRANSACTION_snoozeClock = 3;
        static final int TRANSACTION_unbindAlarmClock = 5;

        public static class Proxy implements IClockAidlInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public void bindAlarmClock() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public boolean dismissClock(long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public PlatformClockInfo getCurrentAlarm() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PlatformClockInfo) a.c(parcelObtain2, PlatformClockInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IClockAidlInterface.DESCRIPTOR;
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public void notifyDataChange(int i, long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public void reWakeUpCurrentAlarmRing() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public boolean registerListener(IClockUpdateAidlInterface iClockUpdateAidlInterface) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iClockUpdateAidlInterface);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public boolean snoozeClock(long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockAidlInterface
            public void unbindAlarmClock() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IClockAidlInterface.DESCRIPTOR);
        }

        public static IClockAidlInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IClockAidlInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IClockAidlInterface)) ? new Proxy(iBinder) : (IClockAidlInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int iDismissClock;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IClockAidlInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IClockAidlInterface.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    bindAlarmClock();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    iDismissClock = dismissClock(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iDismissClock);
                    return true;
                case 3:
                    iDismissClock = snoozeClock(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iDismissClock);
                    return true;
                case 4:
                    iDismissClock = registerListener(IClockUpdateAidlInterface.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iDismissClock);
                    return true;
                case 5:
                    unbindAlarmClock();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    reWakeUpCurrentAlarmRing();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    PlatformClockInfo currentAlarm = getCurrentAlarm();
                    parcel2.writeNoException();
                    a.d(parcel2, currentAlarm, 1);
                    return true;
                case 8:
                    notifyDataChange(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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

    void bindAlarmClock();

    boolean dismissClock(long j2);

    PlatformClockInfo getCurrentAlarm();

    void notifyDataChange(int i, long j2);

    void reWakeUpCurrentAlarmRing();

    boolean registerListener(IClockUpdateAidlInterface iClockUpdateAidlInterface);

    boolean snoozeClock(long j2);

    void unbindAlarmClock();
}
