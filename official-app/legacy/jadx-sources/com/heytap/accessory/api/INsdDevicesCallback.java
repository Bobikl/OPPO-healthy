package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface INsdDevicesCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.INsdDevicesCallback";

    public static class Default implements INsdDevicesCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.INsdDevicesCallback
        public void onNsdDevicesFinished(List<DeviceInfo> list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INsdDevicesCallback {
        static final int TRANSACTION_onNsdDevicesFinished = 1;

        public static class Proxy implements INsdDevicesCallback {
            public static INsdDevicesCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INsdDevicesCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.INsdDevicesCallback
            public void onNsdDevicesFinished(List<DeviceInfo> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INsdDevicesCallback.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onNsdDevicesFinished(list);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INsdDevicesCallback.DESCRIPTOR);
        }

        public static INsdDevicesCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INsdDevicesCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INsdDevicesCallback)) ? new Proxy(iBinder) : (INsdDevicesCallback) iInterfaceQueryLocalInterface;
        }

        public static INsdDevicesCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(INsdDevicesCallback iNsdDevicesCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iNsdDevicesCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iNsdDevicesCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(INsdDevicesCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(INsdDevicesCallback.DESCRIPTOR);
            onNsdDevicesFinished(parcel.createTypedArrayList(DeviceInfo.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void onNsdDevicesFinished(List<DeviceInfo> list) throws RemoteException;
}
