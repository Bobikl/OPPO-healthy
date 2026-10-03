package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IWifiP2pChangeReceiver extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IWifiP2pChangeReceiver";

    public static class Default implements IWifiP2pChangeReceiver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IWifiP2pChangeReceiver
        public void onStateChange(DeviceInfo deviceInfo, int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWifiP2pChangeReceiver {
        static final int TRANSACTION_onStateChange = 1;

        public static class Proxy implements IWifiP2pChangeReceiver {
            public static IWifiP2pChangeReceiver sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWifiP2pChangeReceiver.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IWifiP2pChangeReceiver
            public void onStateChange(DeviceInfo deviceInfo, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiP2pChangeReceiver.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStateChange(deviceInfo, i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWifiP2pChangeReceiver.DESCRIPTOR);
        }

        public static IWifiP2pChangeReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWifiP2pChangeReceiver.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWifiP2pChangeReceiver)) ? new Proxy(iBinder) : (IWifiP2pChangeReceiver) iInterfaceQueryLocalInterface;
        }

        public static IWifiP2pChangeReceiver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWifiP2pChangeReceiver == null) {
                return false;
            }
            Proxy.sDefaultImpl = iWifiP2pChangeReceiver;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IWifiP2pChangeReceiver.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IWifiP2pChangeReceiver.DESCRIPTOR);
            onStateChange(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onStateChange(DeviceInfo deviceInfo, int i, int i2) throws RemoteException;
}
