package com.heytap.health.watch.watchface.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IWatchFaceAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.watchface.api.IWatchFaceAidl";

    public static class Default implements IWatchFaceAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.watchface.api.IWatchFaceAidl
        public byte[] getCurrentDeviceInfo() throws RemoteException {
            return null;
        }

        @Override // com.heytap.health.watch.watchface.api.IWatchFaceAidl
        public String getWatchFaceTempPath(int i) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWatchFaceAidl {
        static final int TRANSACTION_getCurrentDeviceInfo = 1;
        static final int TRANSACTION_getWatchFaceTempPath = 2;

        public static class Proxy implements IWatchFaceAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.watch.watchface.api.IWatchFaceAidl
            public byte[] getCurrentDeviceInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWatchFaceAidl.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IWatchFaceAidl.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.watchface.api.IWatchFaceAidl
            public String getWatchFaceTempPath(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWatchFaceAidl.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWatchFaceAidl.DESCRIPTOR);
        }

        public static IWatchFaceAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWatchFaceAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWatchFaceAidl)) ? new Proxy(iBinder) : (IWatchFaceAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IWatchFaceAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IWatchFaceAidl.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                byte[] currentDeviceInfo = getCurrentDeviceInfo();
                parcel2.writeNoException();
                parcel2.writeByteArray(currentDeviceInfo);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                String watchFaceTempPath = getWatchFaceTempPath(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(watchFaceTempPath);
            }
            return true;
        }
    }

    byte[] getCurrentDeviceInfo() throws RemoteException;

    String getWatchFaceTempPath(int i) throws RemoteException;
}
