package com.heytap.health.devicemanager.listener;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.devicemanager.processor.bean.AppListBean;

/* JADX INFO: loaded from: classes16.dex */
public interface IDeviceAppListChangeListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.devicemanager.listener.IDeviceAppListChangeListener";

    public static class Default implements IDeviceAppListChangeListener {
        @Override // com.heytap.health.devicemanager.listener.IDeviceAppListChangeListener
        public void appListChange(AppListBean appListBean) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDeviceAppListChangeListener {
        static final int TRANSACTION_appListChange = 1;

        public static class Proxy implements IDeviceAppListChangeListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.devicemanager.listener.IDeviceAppListChangeListener
            public void appListChange(AppListBean appListBean) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceAppListChangeListener.DESCRIPTOR);
                    a.d(parcelObtain, appListBean, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
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
                return IDeviceAppListChangeListener.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IDeviceAppListChangeListener.DESCRIPTOR);
        }

        public static IDeviceAppListChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeviceAppListChangeListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceAppListChangeListener)) ? new Proxy(iBinder) : (IDeviceAppListChangeListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDeviceAppListChangeListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDeviceAppListChangeListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            appListChange((AppListBean) a.c(parcel, AppListBean.CREATOR));
            parcel2.writeNoException();
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

    void appListChange(AppListBean appListBean) throws RemoteException;
}
