package com.heytap.sports.step.daemon;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ISportDaemonStepService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.sports.step.daemon.ISportDaemonStepService";

    public static class Default implements ISportDaemonStepService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.sports.step.daemon.ISportDaemonStepService
        public void registerSessionCallback(int i, ISportSessionCallback iSportSessionCallback) throws RemoteException {
        }

        @Override // com.heytap.sports.step.daemon.ISportDaemonStepService
        public void unregisterSessionCallback() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISportDaemonStepService {
        static final int TRANSACTION_registerSessionCallback = 1;
        static final int TRANSACTION_unregisterSessionCallback = 2;

        public static class Proxy implements ISportDaemonStepService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISportDaemonStepService.DESCRIPTOR;
            }

            @Override // com.heytap.sports.step.daemon.ISportDaemonStepService
            public void registerSessionCallback(int i, ISportSessionCallback iSportSessionCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportDaemonStepService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iSportSessionCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.sports.step.daemon.ISportDaemonStepService
            public void unregisterSessionCallback() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportDaemonStepService.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISportDaemonStepService.DESCRIPTOR);
        }

        public static ISportDaemonStepService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISportDaemonStepService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISportDaemonStepService)) ? new Proxy(iBinder) : (ISportDaemonStepService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISportDaemonStepService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISportDaemonStepService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                registerSessionCallback(parcel.readInt(), ISportSessionCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                unregisterSessionCallback();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void registerSessionCallback(int i, ISportSessionCallback iSportSessionCallback) throws RemoteException;

    void unregisterSessionCallback() throws RemoteException;
}
