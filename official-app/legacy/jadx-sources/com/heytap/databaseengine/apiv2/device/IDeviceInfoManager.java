package com.heytap.databaseengine.apiv2.device;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.databaseengine.callback.ICommonListener;

/* JADX INFO: loaded from: classes15.dex */
public interface IDeviceInfoManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.device.IDeviceInfoManager";

    public static class Default implements IDeviceInfoManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.device.IDeviceInfoManager
        public void getUserBoundDevices(ICommonListener iCommonListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceInfoManager {
        static final int TRANSACTION_getUserBoundDevices = 1;

        public static class Proxy implements IDeviceInfoManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDeviceInfoManager.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.device.IDeviceInfoManager
            public void getUserBoundDevices(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceInfoManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDeviceInfoManager.DESCRIPTOR);
        }

        public static IDeviceInfoManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeviceInfoManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceInfoManager)) ? new Proxy(iBinder) : (IDeviceInfoManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDeviceInfoManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDeviceInfoManager.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            getUserBoundDevices(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void getUserBoundDevices(ICommonListener iCommonListener) throws RemoteException;
}
