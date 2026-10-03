package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.Message;

/* JADX INFO: loaded from: classes14.dex */
public interface ILanCacheIpServiceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.ILanCacheIpServiceCallback";

    public static class Default implements ILanCacheIpServiceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.ILanCacheIpServiceCallback
        public void onLanCacheIpFinished(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ILanCacheIpServiceCallback {
        static final int TRANSACTION_onLanCacheIpFinished = 1;

        public static class Proxy implements ILanCacheIpServiceCallback {
            public static ILanCacheIpServiceCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ILanCacheIpServiceCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.ILanCacheIpServiceCallback
            public void onLanCacheIpFinished(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILanCacheIpServiceCallback.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (message != null) {
                        parcelObtain.writeInt(1);
                        message.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onLanCacheIpFinished(deviceInfo, message);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ILanCacheIpServiceCallback.DESCRIPTOR);
        }

        public static ILanCacheIpServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ILanCacheIpServiceCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILanCacheIpServiceCallback)) ? new Proxy(iBinder) : (ILanCacheIpServiceCallback) iInterfaceQueryLocalInterface;
        }

        public static ILanCacheIpServiceCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ILanCacheIpServiceCallback iLanCacheIpServiceCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iLanCacheIpServiceCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iLanCacheIpServiceCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(ILanCacheIpServiceCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(ILanCacheIpServiceCallback.DESCRIPTOR);
            onLanCacheIpFinished(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onLanCacheIpFinished(DeviceInfo deviceInfo, Message message) throws RemoteException;
}
