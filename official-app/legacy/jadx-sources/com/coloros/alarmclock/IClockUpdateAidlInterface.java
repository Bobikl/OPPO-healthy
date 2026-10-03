package com.coloros.alarmclock;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.platformalarmclock.PlatformClockInfo;

/* JADX INFO: loaded from: classes13.dex */
public interface IClockUpdateAidlInterface extends IInterface {
    public static final String DESCRIPTOR = "com.coloros.alarmclock.IClockUpdateAidlInterface";

    public static class Default implements IClockUpdateAidlInterface {
        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public void alarmClockRing(PlatformClockInfo platformClockInfo) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public void dismissClock(long j2) {
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public String getChannelName() {
            return null;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public boolean getListenerIsNull() {
            return false;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public boolean isBindAlarmClock() {
            return false;
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public void onDataChanged(int i, int i2, long j2) {
        }

        @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
        public void snoozeClock(long j2) {
        }
    }

    public static abstract class Stub extends Binder implements IClockUpdateAidlInterface {
        static final int TRANSACTION_alarmClockRing = 3;
        static final int TRANSACTION_dismissClock = 1;
        static final int TRANSACTION_getChannelName = 5;
        static final int TRANSACTION_getListenerIsNull = 6;
        static final int TRANSACTION_isBindAlarmClock = 4;
        static final int TRANSACTION_onDataChanged = 7;
        static final int TRANSACTION_snoozeClock = 2;

        public static class Proxy implements IClockUpdateAidlInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public void alarmClockRing(PlatformClockInfo platformClockInfo) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    a.d(parcelObtain, platformClockInfo, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
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

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public void dismissClock(long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public String getChannelName() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IClockUpdateAidlInterface.DESCRIPTOR;
            }

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public boolean getListenerIsNull() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public boolean isBindAlarmClock() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public void onDataChanged(int i, int i2, long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.alarmclock.IClockUpdateAidlInterface
            public void snoozeClock(long j2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockUpdateAidlInterface.DESCRIPTOR);
                    parcelObtain.writeLong(j2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IClockUpdateAidlInterface.DESCRIPTOR);
        }

        public static IClockUpdateAidlInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IClockUpdateAidlInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IClockUpdateAidlInterface)) ? new Proxy(iBinder) : (IClockUpdateAidlInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int iIsBindAlarmClock;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IClockUpdateAidlInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IClockUpdateAidlInterface.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    dismissClock(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    snoozeClock(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    alarmClockRing((PlatformClockInfo) a.c(parcel, PlatformClockInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    iIsBindAlarmClock = isBindAlarmClock();
                    parcel2.writeNoException();
                    parcel2.writeInt(iIsBindAlarmClock);
                    return true;
                case 5:
                    String channelName = getChannelName();
                    parcel2.writeNoException();
                    parcel2.writeString(channelName);
                    return true;
                case 6:
                    iIsBindAlarmClock = getListenerIsNull();
                    parcel2.writeNoException();
                    parcel2.writeInt(iIsBindAlarmClock);
                    return true;
                case 7:
                    onDataChanged(parcel.readInt(), parcel.readInt(), parcel.readLong());
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

    void alarmClockRing(PlatformClockInfo platformClockInfo);

    void dismissClock(long j2);

    String getChannelName();

    boolean getListenerIsNull();

    boolean isBindAlarmClock();

    void onDataChanged(int i, int i2, long j2);

    void snoozeClock(long j2);
}
