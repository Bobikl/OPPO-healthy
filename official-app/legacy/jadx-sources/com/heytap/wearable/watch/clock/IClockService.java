package com.heytap.wearable.watch.clock;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IClockService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.wearable.watch.clock.IClockService";

    public static class Default implements IClockService {
        @Override // com.heytap.wearable.watch.clock.IClockService
        public void addActionListener(IShowAlarmListener iShowAlarmListener) throws RemoteException {
        }

        @Override // com.heytap.wearable.watch.clock.IClockService
        public void alarmDismiss(int i, int i2) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.wearable.watch.clock.IClockService
        public String getGlobalCityList(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IClockService {
        static final int TRANSACTION_addActionListener = 2;
        static final int TRANSACTION_alarmDismiss = 3;
        static final int TRANSACTION_getGlobalCityList = 1;

        public static class Proxy implements IClockService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.wearable.watch.clock.IClockService
            public void addActionListener(IShowAlarmListener iShowAlarmListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iShowAlarmListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.wearable.watch.clock.IClockService
            public void alarmDismiss(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
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

            @Override // com.heytap.wearable.watch.clock.IClockService
            public String getGlobalCityList(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IClockService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IClockService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IClockService.DESCRIPTOR);
        }

        public static IClockService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IClockService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IClockService)) ? new Proxy(iBinder) : (IClockService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IClockService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IClockService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String globalCityList = getGlobalCityList(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(globalCityList);
            } else if (i == 2) {
                addActionListener(IShowAlarmListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                alarmDismiss(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void addActionListener(IShowAlarmListener iShowAlarmListener) throws RemoteException;

    void alarmDismiss(int i, int i2) throws RemoteException;

    String getGlobalCityList(String str) throws RemoteException;
}
